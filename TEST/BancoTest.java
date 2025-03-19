import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Pruebas para la clase Banco")
class BancoTest {

    private Banco banco;

    @BeforeAll
    static void iniciarTests() {
        System.out.println("=== INICIO DE LAS PRUEBAS ===");
    }

    @BeforeEach
    void setUp() {
        banco = new Banco(100.0);
        System.out.println("Configurando cuenta bancaria con saldo inicial de 100.0...");
    }

    @Test
    @DisplayName("Test de saldo inicial")
    void testSaldoInicial() {
        assertEquals(100.0, banco.getSaldo(), "El saldo inicial debe ser 100.0");
    }

    @Test
    @DisplayName("Test de depósito válido")
    void testDepositar() {
        banco.depositar(50.0);
        assertEquals(150.0, banco.getSaldo(), "El saldo debe ser 150.0 después de depositar 50.0");
    }

    @Test
    @DisplayName("Test de retiro válido")
    void testRetirar() {
        banco.retirar(30.0);
        assertEquals(70.0, banco.getSaldo(), "El saldo debe ser 70.0 después de retirar 30.0");
    }

    @Test
    @DisplayName("Test de retiro con fondos insuficientes")
    void testRetirarFondosInsuficientes() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> banco.retirar(200.0));
        assertEquals("Fondos insuficientes", exception.getMessage(), "Mensaje de excepción incorrecto");
    }

    @Test
    @DisplayName("Test de depósito de cantidad negativa")
    void testDepositarCantidadNegativa() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> banco.depositar(-10.0));
        assertEquals("La cantidad a depositar debe ser mayor a 0", exception.getMessage());
    }

    @Test
    @DisplayName("Test de retiro de cantidad negativa")
    void testRetirarCantidadNegativa() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> banco.retirar(-10.0));
        assertEquals("La cantidad a retirar debe ser mayor a 0", exception.getMessage());
    }

    @Test
    @DisplayName("Test deshabilitado")
    @Disabled("Test pendiente de implementación")
    void testPendiente() {
        fail("Este test aún no está implementado");
    }

    @AfterEach
    void tearDown() {
        System.out.println("Finalizando prueba...");
    }

    @AfterAll
    static void finalizarTests() {
        System.out.println("=== FIN DE LAS PRUEBAS ===");
    }
}
