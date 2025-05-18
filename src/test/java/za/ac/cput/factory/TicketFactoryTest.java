package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Ticket;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

public class TicketFactoryTest {

    @Test
    public void testCreateStandardTicket() {
        Ticket ticket = TicketFactory.createStandardTicket(
                1,
                "V123",
                "E456",
                LocalDate.of(2023, 10, 1)
        );

        assertNotNull(ticket);
        assertEquals(1, ticket.getTicketID());
        assertEquals("V123", ticket.getVisitorID());
        assertEquals("E456", ticket.getExhibitionID());
        assertEquals("Standard", ticket.getTicketType());
        assertEquals(20.00, ticket.getPrice());
        assertEquals(LocalDate.of(2023, 10, 31), ticket.getExpiryDate());
    }

    @Test
    public void testCreateVipTicket() {
        Ticket ticket = TicketFactory.createVipTicket(
                2,
                "V789",
                "E123",
                LocalDate.of(2023, 10, 5)
        );

        assertNotNull(ticket);
        assertEquals(2, ticket.getTicketID());
        assertEquals("V789", ticket.getVisitorID());
        assertEquals("E123", ticket.getExhibitionID());
        assertEquals("VIP", ticket.getTicketType());
        assertEquals(50.00, ticket.getPrice());
        assertEquals(LocalDate.of(2023, 11, 4), ticket.getExpiryDate());
    }
}