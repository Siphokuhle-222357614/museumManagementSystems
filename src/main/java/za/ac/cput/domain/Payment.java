package za.ac.cput.domain;

public class Payment {
    private String paymentID;
    private String paymentMethod;
    private double amount;
    private String status;

    private Payment(Builder builder) {
        this.paymentID = builder.paymentID;

        this.paymentMethod = builder.paymentMethod;
        this.amount = builder.amount;
        this.status = builder.date;
    }

    public String getPaymentID() {
        return paymentID;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public double getAmount() {
        return amount;
    }

    public String getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "paymentID='" + paymentID + '\'' +
                ", paymentMethod='" + paymentMethod + '\'' +
                ", amount=" + amount +
                ", status='" + status + '\'' +
                '}';
    }

    public static class Builder {
        private String paymentID;
        private String paymentMethod;
        private double amount;
        private String date;

        public Builder setPaymentID(String paymentID) {
            this.paymentID = paymentID;
            return this;
        }

        public Builder setPaymentMethod(String paymentMethod) {
            this.paymentMethod = paymentMethod;
            return this;
        }

        public Builder setAmount(double amount) {
            this.amount = amount;
            return this;
        }

        public Builder setDate(String date) {
            this.date = date;
            return this;
        }

        public Payment build() {
            return new Payment(this);
        }
    }
}
