package Lab4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Client user = new Client();

        Scanner input = new Scanner(System.in);

        System.out.println("The price of shipment depends of the order price. Please enter the order price.");
        double orderPrice = input.nextDouble();

        System.out.println("Choose the delivery type");
        System.out.println("1 - DHL (Next day delivery)");
        System.out.println("2 - Royal Mail (approx. 1-2 business days)");
        System.out.println("3 - Pickup (9AM-6PM)");

        int deliveryType = input.nextInt();

        switch (deliveryType) {
            case 1:
                System.out.println("You've chosen DHL shipment method.");
                user.setDelivery(new DHLDelivery(orderPrice));
                user.calcDelivery();
                break;
            case 2:
                System.out.println("You've chosen Royal Mail shipment method.");
                user.setDelivery(new RoyalMailDelivery(orderPrice));
                user.calcDelivery();
                break;
            case 3:
                System.out.println("You've chosen Pickup.");
                user.setDelivery(new SelfDelivery(orderPrice));
                user.calcDelivery();
                break;
            default:
                System.out.println("Invalid input.");
                break;
        }
        input.close();
    }
}
