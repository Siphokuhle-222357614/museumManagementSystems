package za.ac.cput.factory;
import za.ac.cput.domain.Payment;


public class PaymentFactory {
    public static Payment createPayment(String paymentID, String paymentMethod, double amount, String status) {
        if (paymentID == null || paymentID.isEmpty() ||
                paymentMethod == null || paymentMethod.isEmpty() ||
                amount <= 0 ||
                status == null || status.isEmpty())  {
            throw new IllegalArgumentException("Invalid input for creating a Payment.");
        }
        return new Payment.Builder()
                .setPaymentID(paymentID)
                .setPaymentMethod(paymentMethod)
                .setAmount(amount)
                .setDate(status)
                .build();

    }
}