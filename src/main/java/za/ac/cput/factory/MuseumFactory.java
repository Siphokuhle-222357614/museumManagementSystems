package za.ac.cput.factory;

import za.ac.cput.domain.Museum;
import java.util.Objects;

public class MuseumFactory {

    public static Museum createMuseum(Long museumId, String museumName, String address,
                                      String city, String province, short postalCode,
                                      String country, short phoneNumber, String email,
                                      String website, String museumType,
                                      String operatingHours, String description,
                                      int capacity) {

        // Validation
        Objects.requireNonNull(museumId, "Museum ID is required");
        if (museumId <= 0)
            throw new IllegalArgumentException("Museum ID must be positive");
        Objects.requireNonNull(museumName, "Museum name is required");
        Objects.requireNonNull(city, "City is required");
        Objects.requireNonNull(country, "Country is required");
        if (capacity <= 0)
            throw new IllegalArgumentException("Capacity must be positive");

        return new Museum.Builder()
                .setMuseumId(museumId)
                .setMuseumName(museumName)
                .setAddress(address)
                .setCity(city)
                .setProvince(province)
                .setPostalCode(postalCode)
                .setCountry(country)
                .setPhoneNumber(phoneNumber)
                .setEmail(email)
                .setWebsite(website)
                .setMuseumType(museumType)
                .setOperatingHours(operatingHours)
                .setDescription(description)
                .setCapacity(capacity)
                .build();
    }

    public static Museum createBasicMuseum(Long museumId, String museumName,
                                           String city, String country, int capacity) {
        return createMuseum(
                museumId,
                museumName,
                null, // address
                city,
                null, // province
                (short) 0, // postalCode
                country,
                (short) 0, // phoneNumber
                null, // email
                null, // website
                "General", // museumType
                "09:00-17:00", // operatingHours
                null, // description
                capacity
        );
    }

    public static Long generateMuseumId() {
        return (long) (Math.random() * 1000000);
    }
}