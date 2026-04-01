package implementations;

import interfaces.OrderPlacer;

public class SimpleOrderPlacer implements OrderPlacer {

    @Override
    public void placeOrder(String customerName, String address) {
        System.out.println("Order placed for " + customerName + " at " + address);
    }
}