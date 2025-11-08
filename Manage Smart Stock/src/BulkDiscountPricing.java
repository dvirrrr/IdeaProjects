public class BulkDiscountPricing implements PricingStrategy {

    @Override
    public double calculatePrice(double basePrice, int quantity) {
        double finalPrice = basePrice*quantity;
        if (quantity > 100) {
            finalPrice *= 0.9;
        }
        return finalPrice;
    }
}
