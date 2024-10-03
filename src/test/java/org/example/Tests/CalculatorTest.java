package org.example.Tests;

import org.example.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class CalculatorTest {
    @ParameterizedTest(name = "#{index} - сложение {0} и {1}, ожидаем {2}")
    @CsvSource({"5, 10, 15", "-7, -3, -10", "-3, 3, 0"})
    @DisplayName("Проверка сложения")
    @Tag("Сложение")
    void summ(int a, int b, int expectedResult) {
        Calculator calc = new Calculator();
        int result = calc.summ(a, b);
        Assertions.assertEquals(expectedResult, result, "Не тот ответ");
    }

    @ParameterizedTest(name = "#{index} - вычитание {0} и {1}, ожидаем {2}")
    @CsvSource({"25, 10, 15", "-7, -3, -4", "-3, 3, -6"})
    @DisplayName("Проверка вычитания")
    @Tag("Вычитание")
    void sub(int a, int b, int expectedResult) {
        Calculator calc = new Calculator();
        int result = calc.sub(a, b);
        Assertions.assertEquals(expectedResult, result, "Не тот ответ");
    }

}
