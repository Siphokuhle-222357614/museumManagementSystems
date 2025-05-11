package za.ac.cput.domain; // Change this to your actual package name

import java.time.LocalDate;
import java.util.Date;

public class Ticket {
    // Attributes
    private int ticketID;
    private String visitorID;
    private String exhibitionID;
    private Date purchaseDate;
    private String ticketType; // e.g., adult, child
    private double price;
    private LocalDate expiryDate; // e.g., one-time, recurring


    // Constructor using Builder

    public Ticket(Builder builder) {
        this.ticketID = builder.ticketID;
        this.visitorID = builder.visitorID;
        this.exhibitionID = builder.exhibitionID;
        this.purchaseDate = builder.purchaseDate;

        this.ticketType = builder.ticketType;
        this.price = builder.price;
        this.expiryDate = builder.expiryDate;
    }

    // Getters
    public int getTicketID() {
        return ticketID;
    }

    public String getVisitorID() {
        return visitorID;
    }

    public String getExhibitionID() {
        return exhibitionID;
    }

    public Date getPurchaseDate() {
        return purchaseDate;
    }

    public String getTicketType() {
        return ticketType;
    }

    public double getPrice() {
        return price;
    }

    public LocalDate getexpiryDate() {
        return expiryDate;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "ticketID=" + ticketID +
                ", visitorID='" + visitorID + '\'' +
                ", exhibitionID='" + exhibitionID + '\'' +
                ", purchaseDate=" + purchaseDate +
                ", ticketType='" + ticketType + '\'' +
                ", price=" + price +
                ", expiryDate='" + expiryDate + '\'' +
                '}';
    }

    // Builder Pattern
    public static class Builder {
        private int ticketID;
        private String visitorID;
        private String exhibitionID;
        private Date purchaseDate;
        private String ticketType;
        private double price;
        private LocalDate expiryDate;

        public Builder setTicketID(int ticketID) {
            this.ticketID = ticketID;
            return this;
        }

        public Builder setVisitorID(String visitorID) {
            this.visitorID = visitorID;
            return this;
        }

        public Builder setExhibitionID(String exhibitionID) {
            this.exhibitionID = exhibitionID;
            return this;
        }

        public Builder setPurchaseDate(Date purchaseDate) {
            this.purchaseDate = purchaseDate;
            return this;
        }

        public Builder setTicketType(String ticketType) {
            this.ticketType = ticketType;
            return this;
        }

        public Builder setPrice(double price) {
            this.price = price;
            return this;
        }

        public Builder setFrequency(String frequency) {
            this.expiryDate = expiryDate;
            return this;
        }

        public Ticket build() {

            return new Ticket(this);
        }
    }
}