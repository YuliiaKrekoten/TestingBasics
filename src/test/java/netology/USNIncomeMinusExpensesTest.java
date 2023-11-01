package netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class USNIncomeMinusExpensesTest {

    @Test
    void calcTaxFor() {
        USNIncomeMinusExpenses usnIncomeMinusExpenses = new USNIncomeMinusExpenses();
        int debit = 8000;
        int credit = 1000;
        int expected = 1050;
        int result = usnIncomeMinusExpenses.calcTaxFor(debit, credit);
        Assertions.assertEquals(expected, result);
    }
}