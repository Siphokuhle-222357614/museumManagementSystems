/*Aunthor: Bonke Bulana - 220539995
 * Due Date: 28-03-25*/
package za.ac.cput.domain;
import java.time.LocalDate;

public class Curator {

    private String curatorID;
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private String specialization;
    private LocalDate hireDate;


    private Curator(Builder builder) {
        this.curatorID = builder.curatorID;
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.email = builder.email;
        this.phoneNumber = builder.phoneNumber;
        this.specialization = builder.specialization;
        this.hireDate = builder.hireDate;
    }

    public String getCuratorID() {
        return curatorID;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getSpecialization() {
        return specialization;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

    @Override
    public String toString() {
        return "Curator{" +
                "curatorID=" + curatorID +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", specialization='" + specialization + '\'' +
                ", hireDate=" + hireDate +
                '}';
    }


    public static class Builder {

        private String curatorID;
        private String firstName;
        private String lastName;
        private String email;
        private String phoneNumber;
        private String specialization;
        private LocalDate hireDate;

        // Setter methods for Builder
        public Builder setCuratorID(String curatorID) {
            this.curatorID = curatorID;
            return this;
        }

        public Builder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public Builder setSpecialization(String specialization) {
            this.specialization = specialization;
            return this;
        }

        public Builder setHireDate(LocalDate hireDate) {
            this.hireDate = hireDate;
            return this;
        }


        public Builder copy(Curator curator) {
            this.curatorID = curator.curatorID;
            this.firstName = curator.firstName;
            this.lastName = curator.lastName;
            this.email = curator.email;
            this.phoneNumber = curator.phoneNumber;
            this.specialization = curator.specialization;
            this.hireDate = curator.hireDate;
            return this;
        }


        public Curator build() {
            return new Curator(this);
        }
    }
}
