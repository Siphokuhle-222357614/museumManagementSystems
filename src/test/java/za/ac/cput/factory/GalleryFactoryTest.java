package za.ac.cput.factory;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Gallery;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class GalleryFactoryTest {

    private static Gallery gal1 =  GalleryFactory.createGallery("J011", "African Heritage Gallery",
            "A collection showcasing traditional art and historical artifacts from various African cultures."
    , "Second floor", LocalDate.parse("2020-02-12"));


    @Test
    @Order(1)
    public void createTestForGallery(){
        assertNotNull(gal1);
        System.out.println(gal1.toString());
    }
    private static Gallery gal2 =  GalleryFactory.createGallery("J012", "Heritage Gallery",
            "", "Fisrt floor", LocalDate.parse("12/06/2020"));


    @Test
    @Order(2)
    public void TestThatWillFail(){
        assertNotNull(gal2);
        System.out.println(gal2.toString());
    }
}
