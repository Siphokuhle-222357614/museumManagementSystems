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

    public Museum() {

    }

    public Long getMuseumId() {
        return museumId;
    }


    public String getMuseumName() {
        return museumName;
    }


    public String getAddress() {
        return address;
    }


    public String getCity() {
        return city;
    }


    public String getProvince() {
        return province;
    }


    public short getPostalCode() {
        return postalCode;
    }

    public String getCountry() {
        return country;
    }


    public short getPhoneNumber() {
        return phoneNumber;
    }


    public String getEmail() {
        return email;
    }


    public String getWebsite() {
        return website;
    }



    public String getMuseumType() {
        return museumType;
    }


    public String getOperatingHours() {
        return operatingHours;
    }



    public String getDescription() {
        return description;
    }

    public Museum(Builder builder){
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

        public void setMuseumId(Long museumId) {
            this.museumId = museumId;
        }

        public void setMuseumName(String museumName) {
            this.museumName = museumName;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public void setProvince(String province) {
            this.province = province;
        }

        public void setPostalCode(short postalCode) {
            this.postalCode = postalCode;
        }

        public void setCountry(String country) {
            this.country = country;
        }

        public void setPhoneNumber(short phoneNumber) {
            this.phoneNumber = phoneNumber;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public void setWebsite(String website) {
            this.website = website;
        }

        public void setMuseumType(String museumType) {
            this.museumType = museumType;
        }

        public void setOperatingHours(String operatingHours) {
            this.operatingHours = operatingHours;
        }

        public void setDescription(String description) {
            this.description = description;
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
                '}';
    }
}
