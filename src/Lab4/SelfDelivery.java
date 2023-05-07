package Lab4;

public class SelfDelivery implements Delivery {
    private final double orderPrice;

    public SelfDelivery(double orderPrice) {
        this.orderPrice = orderPrice;
    }

    @Override
    public void calc() {
        System.out.println("Shipment cost: " + (orderPrice * 0) + "£");
    }
}
