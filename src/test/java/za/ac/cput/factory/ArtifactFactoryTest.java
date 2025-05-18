package za.ac.cput.factory;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Artifact;
import za.ac.cput.domain.enums.MaterialLocation;
import za.ac.cput.domain.enums.Materials;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class ArtifactFactoryTest {

    private static Artifact art1 = ArtifactFactory.createArtifact("G001", "Artifact name", "Description...",
            LocalDate.parse("2002-02-08"), "Godd", Materials.METAL, MaterialLocation.USA);

    @Test
    @Order(1)
    public void createArtifactTest(){

        assertNotNull(art1);
        System.out.println(art1.toString());
    }
    private static Artifact art2 = ArtifactFactory.createArtifact("196BCE", "The Rosetta Stone", "",
            LocalDate.parse("1799-02-08"), "Partial", Materials.ROCK, MaterialLocation.EGYTPT);

    @Test
    @Order(2)
    public void createTestThatWillFail(){
        assertNotNull(art2);
        System.out.println(art2.toString());
    }

}
