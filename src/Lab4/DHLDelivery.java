package Lab4;

public class DHLDelivery<orderPrice> implements Delivery {

    private final double orderPrice;

    public DHLDelivery(double orderPrice) {
        this.orderPrice = orderPrice;
    }

    @Override
    public void calc() {
        System.out.println("Shipment cost: " + (orderPrice * 0.1) + "£");
    }
}
