package netology;

public class Main {
    public static void main(String[] args) {
        Company company = new Company("MyCompany", new USNIncome());

        company.shiftMoney(10000);
        company.shiftMoney(-5000);
        company.payTaxes(); // Выведет: Компания MyCompany уплатила налог в размере: 300 руб.

        company.setTaxSystem(new USNIncomeMinusExpenses());
        company.shiftMoney(20000);
        company.shiftMoney(-10000);
        company.payTaxes(); // Выведет: Компания MyCompany уплатила налог в размере: 1500 руб.
    }
}