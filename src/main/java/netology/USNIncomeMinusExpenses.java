package netology;

public class USNIncomeMinusExpenses extends TaxSystem {
    @Override
    public int calcTaxFor(int debit, int credit) {
        int incomeMinusExpenses = debit - credit;
        int tax = (int) (incomeMinusExpenses * 0.15);
        return Math.max(tax, 0);

    }
}
