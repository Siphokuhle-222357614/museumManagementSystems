

import za.ac.cput.factory.CategoryFactory;

import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class CategoryTest {

    import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Artifact;
import za.ac.cput.domain.enums.MaterialLocation;
import za.ac.cput.domain.enums.Materials;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertNotNull;

    public class CategoryTest {

        private static Category Cat = CategoryTest.createArtifact("001", "Historical ", "Mathematical...",
                LocalDate.parse("2002-02-08"), "God", Materials.METAL, MaterialLocation.CPT);

        @Test
        @Order(1)
        public void createCategoryTest(){

            assertNotNull(Cat);
            System.out.println(Cat1.toString());
        }
        private static Category Cat = CategoryFactory.createCategory("Steve JObs", "", "",
                LocalDate.parse(""), "", Materials.ROCK, MaterialLocation.CPT);

        @Test
        @Order(2)
        public void createTestThatWillFail(){
            assertNotNull(Cat1);
            System.out.println(Cat1.toString());
        }

    }

}
