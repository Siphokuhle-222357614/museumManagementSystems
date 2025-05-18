package za.ac.cput.factory;
import za.ac.cput.domain.Ticket;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

public class TicketFactory {

    // Method to create a standard ticket
    public static Ticket createStandardTicket(int ticketID, String visitorID, String exhibitionID, LocalDate purchaseDate) {
        if (ticketID <= 0 || visitorID == null || visitorID.isEmpty() ||
                exhibitionID == null || exhibitionID.isEmpty() || purchaseDate == null) {
            throw new IllegalArgumentException("Invalid input for creating a standard ticket.");
        }

        Date purchaseDateConverted = Date.from(purchaseDate.atStartOfDay(ZoneId.systemDefault()).toInstant());

        return new Ticket.Builder()
                .setTicketID(ticketID)
                .setVisitorID(visitorID)
                .setExhibitionID(exhibitionID)
                .setPurchaseDate(purchaseDateConverted)
                .setTicketType("Standard")
                .setPrice(20.00)
                .setExpiryDate(purchaseDate.plusDays(30)) // Valid for 30 days from purchase
                .build();
    }

    // Method to create a VIP ticket
    public static Ticket createVipTicket(int ticketID, String visitorID, String exhibitionID, LocalDate purchaseDate) {
        if (ticketID <= 0 || visitorID == null || visitorID.isEmpty() ||
                exhibitionID == null || exhibitionID.isEmpty() || purchaseDate == null) {
            throw new IllegalArgumentException("Invalid input for creating a VIP ticket.");
        }

        Date purchaseDateConverted = Date.from(purchaseDate.atStartOfDay(ZoneId.systemDefault()).toInstant());

        return new Ticket.Builder()
                .setTicketID(ticketID)
                .setVisitorID(visitorID)
                .setExhibitionID(exhibitionID)
                .setPurchaseDate(purchaseDateConverted)
                .setTicketType("VIP")
                .setPrice(50.00)
                .setExpiryDate(purchaseDate.plusDays(30)) // Valid for 30 days from purchase
                .build();
    }
}