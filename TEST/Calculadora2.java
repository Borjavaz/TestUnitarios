import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

public class Calculadora2 {

    // Suma dos números
    public int sumar(int a, int b) {
        return a + b;
    }

    // Resta dos números
    public int restar(int a, int b) {
        return a - b;
    }

    // Multiplica dos números
    public int multiplicar(int a, int b) {
        return a * b;
    }

    // Divide dos números con manejo de error
    public int dividir(int a, int b) {
        return a / b;
    }


    private final Calculadora calc = new Calculadora();

    @ParameterizedTest
    @CsvSource({"1, 2, 3", "5, 5, 10", "-3, -7, -10"})
    @DisplayName("Test de suma")
    void testSumar(int a, int b, int resultadoEsperado) {
        assertEquals(resultadoEsperado, calc.sumar(a, b));
    }

    @ParameterizedTest
    @CsvSource({"5, 3, 2", "10, 5, 5", "-5, -3, -2"})
    @DisplayName("Test de resta")
    void testRestar(int a, int b, int resultadoEsperado) {
        assertEquals(resultadoEsperado, calc.restar(a, b));
    }

    @ParameterizedTest
    @CsvSource({"2, 3, 6", "-2, -3, 6", "5, 0, 0"})
    @DisplayName("Test de multiplicación")
    void testMultiplicar(int a, int b, int resultadoEsperado) {
        assertEquals(resultadoEsperado, calc.multiplicar(a, b));
    }

    @ParameterizedTest
    @CsvSource({"6, 3, 2", "-6, -3, 2", "10, -2, -5"})
    @DisplayName("Test de división")
    void testDividir(int a, int b, int resultadoEsperado) {
        assertEquals(resultadoEsperado, calc.dividir(a, b));
    }
}
