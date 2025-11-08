public class Main {
    public static void main(String[] args) {
        SavingAccount saver1 = new SavingAccount(6000);
        SavingAccount saver2 = new SavingAccount(5000);
        SavingAccount saver3 = new SavingAccount(4000);
        SavingAccount saver4 = new SavingAccount(3000);
        SavingAccount saver5 = new SavingAccount(2000);

        SavingAccount.ModifyInterestRate(0.06);
        saver1.CalculateMonthlyInterest();
        saver2.CalculateMonthlyInterest();
        System.out.println(saver1.toString());
        System.out.println(saver2.toString());
        System.out.println("----------------");
        SavingAccount.ModifyInterestRate(0.1);
        saver1.CalculateMonthlyInterest();
        saver2.CalculateMonthlyInterest();
        System.out.println(saver1.toString());
        System.out.println(saver2.toString());
        Bankers banker1 = new Bankers("Itai", "Dvir");
        Savers cstmer1 = new Savers("Itay", "Hacham", banker1);
        banker1.addSaver(cstmer1);
        cstmer1.addSavingPlan(saver1);
        cstmer1.addSavingPlan(saver2);
        Savers cstmer2 = new Savers("Omer", "Perry", banker1);
        banker1.addSaver(cstmer2);
        cstmer2.addSavingPlan(saver3);
        cstmer2.addSavingPlan(saver4);
        cstmer2.addSavingPlan(saver5);
        banker1.saversInfo();

    }
}
