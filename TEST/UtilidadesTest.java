import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class UtilidadesTest {

    private int contador;

    @BeforeAll
    static void setupAll() {
        System.out.println("Inicio de pruebas");
    }

    @AfterAll
    static void tearDownAll() {
        System.out.println("Fin de pruebas");
    }

    @BeforeEach
    void setup() {
        contador = 0;
    }

    @AfterEach
    void tearDown() {
        System.out.println("Prueba finalizada");
    }

    @Test
    void testSuma() {
        contador += 2;
        assertEquals(2, contador);
    }

    @RepeatedTest(3)
    void testIncremento() {
        contador++;
        assertTrue(contador > 0);
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3, 4, 5})
    void testParametro(int numero) {
        assertTrue(numero > 0);
    }

    @Test
    @Disabled("Pendiente de implementación")
    void testPendiente() {
        fail("Este test está deshabilitado");
    }
}
