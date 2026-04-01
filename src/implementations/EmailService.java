package implementations;

import interfaces.EmailNotifier;

public class EmailService implements EmailNotifier {

    @Override
    public void sendEmail(String email) {
        System.out.println("Email sent to: " + email);
    }
}