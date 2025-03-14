import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

public class Calculadora {

    // Suma dos numeros
    public int sumar(int a, int b) {
        return a + b;
    }

    // Resta dos numeros
    public int restar(int a, int b) {
        return a - b;
    }

    //Resta dos numeros negativos
    public int restarNegativos(int a, int b) {
        return a - b;
    }

    //Resta un numero positivo y uno negativo
    public int restarPositivoNegativo(int a, int b) {
        return a - b;
    }

    // Multiplica dos numeros
    public int multiplicar(int a, int b) {
        return a * b;
    }

    //Multiplica dos numeros negativos
    public int multiplicarNegativos(int a, int b) {
        return a * b;
    }

    //Multiplica un numero positivo y uno negativo
    public int multiplicarPositivoNegativo(int a, int b) {
        return a * b;
    }

    // Divide dos numeros positivos
    public int dividir(int a, int b) {
        return a / b;
    }

    // Divide dos numeros negativos
    public int dividirNegativos(int a, int b) {
        return a / b;
    }

    //Divide un numero positivo y uno negativo
    public int dividirPositivoNegativo(int a, int b) {
        return a / b;
    }
}

// Clase de pruebas con JUnit
class CalculadoraTest {

    private final Calculadora calc = new Calculadora();

    @Test
    @DisplayName("Test para la suma dos numeros positivos")
    public void testSumar() {
        assertEquals(8, calc.sumar(3, 5));
    }

    @Test
    @DisplayName("Test para la resta dos numeros positivos")
    public void testRestar() {
        assertEquals(3, calc.restar(8, 5));
    }

    @Test
    @DisplayName("Test para la resta dos numeros negativos")
    public void testRestarNegativos() {
        assertEquals(0, calc.restar(-2, -2));
    }

    @Test
    @DisplayName("Test para la resta un numero positivo y uno negativo")
    public void testRestarPositivoNegativo() {
        assertEquals(4, calc.restar(2, -2));
    }

    @Test
    @DisplayName("Test para la multiplicacion dos numeros positivos")
    public void testMultiplicar() {
        assertEquals(28, calc.multiplicar(4, 7));
    }

    @Test
    @DisplayName("Test para la multiplicacion dos numeros negativos")
    public void testMultiplicarNegativos() {
        assertEquals(28, calc.multiplicar(-4, -7));
    }

    @Test
    @DisplayName("Test para la multiplicacion un numero positivo y uno negativo")
    public void testMultiplicarPositivoNegativo() {
        assertEquals(-28, calc.multiplicar(4, -7));
    }

    @Test
    @DisplayName("Test para la division dos numeros positivos")
    public void testDividir() {
        assertEquals(5, calc.dividir(10, 2));
    }

    @Test
    @DisplayName("Test para la division dos numeros negativos")
    public void testDividirNegativos() {
        assertEquals(5, calc.dividir(-10, -2));
    }

    @Test
    @DisplayName("Test para la division un numero positivo y uno negativo")
    public void testDividirPositivoNegativo() {
        assertEquals(-5, calc.dividir(10, -2));
    }

    @ParameterizedTest
    @CsvSource({"1, 2, 3", "5, 5, 10", "-3, -7, -10"})
    void testSumar(int a, int b, int resultadoEsperado) {
        assertEquals(resultadoEsperado, calc.sumar(a, b));
    }

    @ParameterizedTest
    @CsvSource({"5, 3, 2", "10, 5, 5", "-5, -3, -2"})
    void testRestar(int a, int b, int resultadoEsperado) {
        assertEquals(resultadoEsperado, calc.restar(a, b));
    }

    @ParameterizedTest
    @CsvSource({"-5, -3, -2", "-10, -5, -5"})
    void testRestarNegativos(int a, int b, int resultadoEsperado) {
        assertEquals(resultadoEsperado, calc.restarNegativos(a, b));
    }

    @ParameterizedTest
    @CsvSource({"5, -3, 8", "-10, 5, -15"})
    void testRestarPositivoNegativo(int a, int b, int resultadoEsperado) {
        assertEquals(resultadoEsperado, calc.restarPositivoNegativo(a, b));
    }

    @ParameterizedTest
    @CsvSource({"2, 3, 6", "-2, -3, 6", "5, 0, 0"})
    void testMultiplicar(int a, int b, int resultadoEsperado) {
        assertEquals(resultadoEsperado, calc.multiplicar(a, b));
    }

    @ParameterizedTest
    @CsvSource({"-2, -3, 6", "-5, -5, 25"})
    void testMultiplicarNegativos(int a, int b, int resultadoEsperado) {
        assertEquals(resultadoEsperado, calc.multiplicarNegativos(a, b));
    }

    @ParameterizedTest
    @CsvSource({"2, -3, -6", "-5, 4, -20"})
    void testMultiplicarPositivoNegativo(int a, int b, int resultadoEsperado) {
        assertEquals(resultadoEsperado, calc.multiplicarPositivoNegativo(a, b));
    }

    @ParameterizedTest
    @CsvSource({"6, 3, 2", "10, 2, 5"})
    void testDividir(int a, int b, int resultadoEsperado) {
        assertEquals(resultadoEsperado, calc.dividir(a, b));
    }

    @ParameterizedTest
    @CsvSource({"-6, -3, 2", "-10, -2, 5"})
    void testDividirNegativos(int a, int b, int resultadoEsperado) {
        assertEquals(resultadoEsperado, calc.dividirNegativos(a, b));
    }

    @ParameterizedTest
    @CsvSource({"6, -3, -2", "-10, 2, -5"})
    void testDividirPositivoNegativo(int a, int b, int resultadoEsperado) {
        assertEquals(resultadoEsperado, calc.dividirPositivoNegativo(a, b));
    }
}

