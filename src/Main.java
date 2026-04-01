import implementations.*;
import interfaces.*;
import service.OrderService;

public class Main {

    public static void main(String[] args) {

        OrderCalculator calculator = new BasicOrderCalculator();
        OrderPlacer placer = new SimpleOrderPlacer();
        InvoiceGenerator invoice = new FileInvoiceGenerator();
        EmailNotifier email = new EmailService();

        OrderService orderService = new OrderService(
                calculator, placer, invoice, email
        );

        orderService.processOrder(
                10.0, 2,
                "John Doe", "123 Main St",
                "order_123.pdf",
                "johndoe@example.com"
        );
    }
}