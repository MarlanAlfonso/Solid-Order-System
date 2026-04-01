package service;

import interfaces.*;

public class OrderService {

    private OrderCalculator calculator;
    private OrderPlacer placer;
    private InvoiceGenerator invoiceGenerator;
    private EmailNotifier emailNotifier;

    public OrderService(OrderCalculator calculator,
                        OrderPlacer placer,
                        InvoiceGenerator invoiceGenerator,
                        EmailNotifier emailNotifier) {
        this.calculator = calculator;
        this.placer = placer;
        this.invoiceGenerator = invoiceGenerator;
        this.emailNotifier = emailNotifier;
    }

    public void processOrder(double price, int quantity,
                             String name, String address,
                             String fileName, String email) {

        double total = calculator.calculateTotal(price, quantity);
        System.out.println("Total: $" + total);

        placer.placeOrder(name, address);

        if (invoiceGenerator != null) {
            invoiceGenerator.generateInvoice(fileName);
        }

        if (emailNotifier != null) {
            emailNotifier.sendEmail(email);
        }
    }
}