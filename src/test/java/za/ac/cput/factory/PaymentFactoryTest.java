package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Payment;
import static org.junit.jupiter.api.Assertions.*;

class PaymentFactoryTest {

    @Test
    void testCreatePaymentSuccess() {
        Payment payment = PaymentFactory.createPayment("P001", "Credit Card", 150.00, "Completed");
        assertNotNull(payment);
        assertEquals("P001", payment.getPaymentID());
        assertEquals("Credit Card", payment.getPaymentMethod());
        assertEquals(150.00, payment.getAmount());
        assertEquals("Completed", payment.getStatus());
    }

    @Test
    void testCreatePaymentWithInvalidPaymentID() {
        Exception exception = assertThrows(IllegalArgumentException.class, () ->
                PaymentFactory.createPayment("", "Credit Card", 150.00, "Completed")
        );
        assertEquals("Invalid input for creating a Payment.", exception.getMessage());
    }

    @Test
    void testCreatePaymentWithInvalidPaymentMethod() {
        Exception exception = assertThrows(IllegalArgumentException.class, () ->
                PaymentFactory.createPayment("P001", "", 150.00, "Completed")
        );
        assertEquals("Invalid input for creating a Payment.", exception.getMessage());
    }

    @Test
    void testCreatePaymentWithInvalidAmount() {
        Exception exception = assertThrows(IllegalArgumentException.class, () ->
                PaymentFactory.createPayment("P001", "Credit Card", -10.00, "Completed")
        );
        assertEquals("Invalid input for creating a Payment.", exception.getMessage());
    }

    @Test
    void testCreatePaymentWithInvalidStatus() {
        Exception exception = assertThrows(IllegalArgumentException.class, () ->
                PaymentFactory.createPayment("P001", "Credit Card", 150.00, "")
        );
        assertEquals("Invalid input for creating a Payment.", exception.getMessage());
    }
}