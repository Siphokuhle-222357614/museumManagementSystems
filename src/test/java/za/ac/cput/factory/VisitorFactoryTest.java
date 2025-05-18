package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Visitor;
import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.*;

public class VisitorFactoryTest {

    @Test
    public void testCreateFullVisitor() {
        Visitor visitor = VisitorFactory.createVisitor(
                1001,
                "Nelson",
                "Mandela",
                "nelson@anc.org.za",
                "0821234567",
                LocalDate.of(2023, 5, 15)
        );

        assertNotNull(visitor);
        assertEquals("Nelson", visitor.getVisitorFirstName());
        assertEquals("Mandela", visitor.getVisitorLastName());
        assertEquals(LocalDate.of(2023, 5, 15), visitor.getHireTime());
    }

    @Test
    public void testCreateBasicVisitor() {
        Visitor visitor = VisitorFactory.createBasicVisitor(
                "Desmond",
                "Tutu"
        );

        assertNotNull(visitor);
        assertTrue(visitor.getVisitorId() > 0);
        assertEquals("Desmond", visitor.getVisitorFirstName());
        assertEquals(LocalDate.now(), visitor.getHireTime());
    }

    @Test
    public void testCreateVisitorWithoutLastName() {
        assertThrows(NullPointerException.class, () -> {
            VisitorFactory.createVisitor(
                    1002,
                    "Thabo",
                    null, // Missing last name
                    "email@example.com",
                    "0839876543",
                    LocalDate.now()
            );
        });
    }
}