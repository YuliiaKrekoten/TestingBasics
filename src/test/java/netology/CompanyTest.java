package netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CompanyTest {

    @Test
    public void testShiftMoney_positiveAmount_updatesDebit() {
        // Arrange
        Company company = new Company("Test Company", new TaxSystem());
        int initialDebit = company.getDebit();
        int amount = 100;

        // Act
        company.shiftMoney(amount);

        // Assert
        assertEquals(initialDebit + amount, company.getDebit());
    }

    @Test
    public void testShiftMoney_negativeAmount_updatesCredit() {
        // Arrange
        Company company = new Company("Test Company", new TaxSystem());
        int initialCredit = company.getCredit();
        int amount = -100;

        // Act
        company.shiftMoney(amount);

        // Assert
        assertEquals(initialCredit + Math.abs(amount), company.getCredit());
    }
   
}
