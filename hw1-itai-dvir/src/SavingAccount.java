public class SavingAccount {
    private static double annualInterestRate;
    private double savingBalance;

    public SavingAccount(double savingBalance) {
        this.savingBalance = savingBalance;
    }
    public void CalculateMonthlyInterest() {
        this.savingBalance += (this.annualInterestRate / 12) * this.savingBalance;
    }

    public static void ModifyInterestRate(double mir)
    {
        annualInterestRate = mir;
    }

    public static double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public static void setAnnualInterestRate(double annualInterestRate) {
        SavingAccount.annualInterestRate = annualInterestRate;
    }

    public double getSavingBalance() {
        return savingBalance;
    }

    public void setSavingBalance(double savingBalance) {
        this.savingBalance = savingBalance;
    }

    public String toString() {
        return "SavingAccount{" +
                "savingBalance=" + savingBalance +
                '}';
    }
}