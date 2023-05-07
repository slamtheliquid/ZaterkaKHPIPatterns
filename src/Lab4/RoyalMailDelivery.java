package Lab4;

public class RoyalMailDelivery implements Delivery {
    private final double orderPrice;

    public RoyalMailDelivery(double orderPrice) {
        this.orderPrice = orderPrice;
    }

    @Override
    public void calc() {
        System.out.println("Shipment cost: " + ((orderPrice * 0.05 + 1.5)) + "£");
    }
}
