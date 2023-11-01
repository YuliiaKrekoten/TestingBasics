package netology;

public class USNIncome extends TaxSystem{
    @Override
    public int calcTaxFor(int debit, int credit) {
        int income = debit - credit;
        int tax = (int) (income * 0.06);
        return Math.max(tax, 0);
    }
}
