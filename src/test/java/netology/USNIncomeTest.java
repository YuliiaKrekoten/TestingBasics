package netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class USNIncomeTest {

    @Test
    void calcTaxFor() {
        USNIncome usnIncome = new USNIncome();

        int debit = 80000;
        int credit = 20000;
        int expected = 3600;
        int result = usnIncome.calcTaxFor(debit,credit);
        Assertions.assertEquals(expected,result);
    }
}