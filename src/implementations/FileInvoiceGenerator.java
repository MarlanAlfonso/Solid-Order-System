package implementations;

import interfaces.InvoiceGenerator;

public class FileInvoiceGenerator implements InvoiceGenerator {

    @Override
    public void generateInvoice(String fileName) {
        System.out.println("Invoice generated: " + fileName);
    }
}