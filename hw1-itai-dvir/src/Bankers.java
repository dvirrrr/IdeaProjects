
public class Bankers {
    private String fName;
    private String lName;
    private Savers [] savers;
    private int counter;

    public Bankers(String fName, String lName) {
        this.fName = fName;
        this.lName = lName;
        this.counter = 0;
        this.savers = new Savers[10];

    }
    public void addSaver(Savers saver) {
        if (this.savers.length <= counter) {
            Savers [] temp = new Savers[this.counter + 5];
            for (int i=0; i < this.savers.length; i++){
                temp[i] = this.savers[i];
            }
            this.savers = temp;
        }

        this.savers[this.counter] = saver;
        counter++;
    }

    public void saversInfo() {
        for (int i = 0; i < this.savers.length; i++) {
            if (this.savers[i] == null) {
                i = this.savers.length;
            }
            else {
            System.out.println("saver number "+i+":");
                System.out.println(savers[i].toString());
                savers[i].balanceInfo();
            }
        }
    }

    public String toString() {
        return "Bankers{" +
                "fName='" + this.fName + '\'' +
                ", lName='" + this.lName + '\'' +
                ", savers=" + this.savers.length +
                '}';
    }


}
