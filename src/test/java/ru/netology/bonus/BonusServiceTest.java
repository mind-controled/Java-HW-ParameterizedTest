package ru.netology.bonus;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

class BonusServiceTest {

    @ParameterizedTest
    @CsvFileSource(resources = "/data.csv")
    void shouldCalculate(String testName, long amount, long expected, boolean registered) {
        BonusService service = new BonusService();


        long actual = service.calculate(amount, registered);

        Assertions.assertEquals(expected, actual);
    }
}