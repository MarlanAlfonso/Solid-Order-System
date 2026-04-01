package implementations;

import interfaces.OrderCalculator;

public class BasicOrderCalculator implements OrderCalculator {

    @Override
    public double calculateTotal(double price, int quantity) {
        return price * quantity;
    }
}