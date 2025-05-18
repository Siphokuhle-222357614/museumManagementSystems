package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Museum;
import static org.junit.jupiter.api.Assertions.*;

public class MuseumFactoryTest {

    @Test
    public void testCreateFullMuseum() {
        Museum museum = MuseumFactory.createMuseum(
                1L,
                "Iziko South African Museum",
                "25 Queen Victoria St",
                "Cape Town",
                "Western Cape",
                (short) 8001,
                "South Africa",
                (short) 214812300,
                "info@iziko.org.za",
                "www.iziko.org.za",
                "Natural History",
                "09:00-17:00",
                "Oldest museum in South Africa",
                500
        );

        assertNotNull(museum);
        assertEquals("Iziko South African Museum", museum.getMuseumName());
        assertEquals("Cape Town", museum.getCity());
        assertEquals(500, museum.getCapacity());
    }

    @Test
    public void testCreateBasicMuseum() {
        Museum museum = MuseumFactory.createBasicMuseum(
                2L,
                "Ditsong National Museum",
                "Pretoria",
                "South Africa",
                300
        );

        assertNotNull(museum);
        assertEquals("Ditsong National Museum", museum.getMuseumName());
        assertEquals("General", museum.getMuseumType());
        assertEquals("09:00-17:00", museum.getOperatingHours());
    }

    @Test
    public void testCreateMuseumWithInvalidId() {
        assertThrows(IllegalArgumentException.class, () -> {
            MuseumFactory.createMuseum(
                    -1L, // Invalid ID
                    "Invalid Museum",
                    "123 Street",
                    "City",
                    "Province",
                    (short) 1234,
                    "Country",
                    (short) 1234567890,
                    "email@example.com",
                    "www.example.com",
                    "Type",
                    "Hours",
                    "Description",
                    100
            );
        });
    }
}