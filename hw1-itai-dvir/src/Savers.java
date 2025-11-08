import java.util.Arrays;

public class Savers {
    private String fName;
    private String lName;
    private Bankers pBanker;
    private SavingAccount [] savingPlans;
    private int counter;

    public Savers(String fName, String lName, Bankers pBanker) {
        this.fName = fName;
        this.lName = lName;
        this.pBanker = pBanker;
        this.savingPlans = new SavingAccount[10];
        this.counter = 0;
    }

    public void addSavingPlan(SavingAccount savingPlan){
        if (this.savingPlans.length <= counter) {
            SavingAccount [] temp = new SavingAccount[this.counter + 5];
            for (int i = 0; i < this.savingPlans.length; i++) {
                temp[i] = this.savingPlans[i];
            }
            this.savingPlans = temp;

        }
        this.savingPlans[this.counter] = savingPlan;
        counter++;
    }

    public double savingBalance() {
        double balance=0;
        for (int i=0; i < this.savingPlans. length; i++) {
            if (this.savingPlans[i] == null) {
                i = this.savingPlans.length;
            }
            else {
                balance += this.savingPlans[i].getSavingBalance();
            }
        }
        return balance;
    }

    public void balanceInfo() {
        for (int i = 0; i < this.savingPlans.length; i++) {
            if (this.savingPlans[i] == null) {
                i = this.savingPlans.length;
            }
            else {
                System.out.println("Saving Plan number "+i+":");
                System.out.println(savingPlans[i].getSavingBalance());
            }
        }
    }

    public String toString() {
        return "Savers{" +
                "fName='" + fName + '\'' +
                ", lName='" + lName + '\'' +
                ", pBanker=" + pBanker +
                ", savingPlans=" + this.savingPlans.length +
                "', balance=" + this.savingBalance() +
                '}';
    }
}
