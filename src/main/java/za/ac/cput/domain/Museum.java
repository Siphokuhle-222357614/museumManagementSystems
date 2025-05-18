package za.ac.cput.domain;

public class Museum {
    private Long museumId;
    private String museumName;
    private String address;
    private String city;
    private String province;
    private short postalCode;
    private String country;
    private short phoneNumber;
    private String email;
    private String website;
    private String museumType;
    private String operatingHours;
    private String description;
    private int capacity;

    public Museum(Builder builder) {
        museumId = builder.museumId;
        museumName = builder.museumName;
        address = builder.address;
        city = builder.city;
        province = builder.province;
        postalCode = builder.postalCode;
        country = builder.country;
        phoneNumber = builder.phoneNumber;
        email = builder.email;
        website = builder.website;
        museumType = builder.museumType;
        operatingHours = builder.operatingHours;
        description = builder.description;
        capacity = builder.capacity;
    }

    public static class Builder {
        private Long museumId;
        private String museumName;
        private String address;
        private String city;
        private String province;
        private short postalCode;
        private String country;
        private short phoneNumber;
        private String email;
        private String website;
        private String museumType;
        private String operatingHours;
        private String description;
        private int capacity;

        public Builder setMuseumId(Long museumId) {
            this.museumId = museumId;
            return this;
        }

        public Builder setMuseumName(String museumName) {
            this.museumName = museumName;
            return this;
        }

        public Builder setAddress(String address) {
            this.address = address;
            return this;
        }

        public Builder setCity(String city) {
            this.city = city;
            return this;
        }

        public Builder setProvince(String province) {
            this.province = province;
            return this;
        }

        public Builder setPostalCode(short postalCode) {
            this.postalCode = postalCode;
            return this;
        }

        public Builder setCountry(String country) {
            this.country = country;
            return this;
        }

        public Builder setPhoneNumber(short phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder setWebsite(String website) {
            this.website = website;
            return this;
        }

        public Builder setMuseumType(String museumType) {
            this.museumType = museumType;
            return this;
        }

        public Builder setOperatingHours(String operatingHours) {
            this.operatingHours = operatingHours;
            return this;
        }

        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        public Builder setCapacity(int capacity) {
            this.capacity = capacity;
            return this;
        }

        public Museum build() {
            return new Museum(this);

        }
    }
    @Override
    public String toString() {
        return "Museum{" +
                "museumId=" + museumId +
                ", museumName='" + museumName + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", province='" + province + '\'' +
                ", postalCode=" + postalCode +
                ", country='" + country + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", email='" + email + '\'' +
                ", website='" + website + '\'' +
                ", museumType='" + museumType + '\'' +
                ", operatingHours='" + operatingHours + '\'' +
                ", description='" + description + '\'' +
                ", capacity=" + capacity +
                '}';
    }
}