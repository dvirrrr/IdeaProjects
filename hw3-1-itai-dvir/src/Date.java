public class Date {
    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public boolean isMonth(Date d) {
        if (d.month == this.month) {
            return true;
        }
        return false;
    }

    public int seniority(Date d) {
        if (d.year == this.year + 5) {
            if (d.month >= this.month || d.month == this.month && d.day > this.day) {
                return 1;
            }
        }
        if (d.year >= this.year + 6 && d.year <= this.year +9) {
            return 1;
        }
        if (d.year == this.year + 10) {
            if (d.month >= this.month || d.month == this.month && d.day > this.day) {
                return 2;
            }
        }
        if (d.year >= this.year + 11) {
            return 2;
        }
        return 0;
    }
    public String printDate() {
        return "Date:"+day+'/'+month+'/'+year;
    }
}
