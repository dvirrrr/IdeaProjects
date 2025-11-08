public abstract class IRental{
    private int rentalID;
    private String currentRental;
    private int pricePerDay;

    public int getRentalID() {
        return rentalID;
    }

    public void setRentalID(int rentalID) {
        this.rentalID = rentalID;
    }

    public String isCurrentRental() {
        return currentRental;
    }

    public void setCurrentRental(String currentRental) {
        this.currentRental = currentRental;
    }

    public int getPricePerDay() {
        return pricePerDay;
    }

    public void setPricePerDay(int pricePerDay) {
        this.pricePerDay = pricePerDay;
    }
}
