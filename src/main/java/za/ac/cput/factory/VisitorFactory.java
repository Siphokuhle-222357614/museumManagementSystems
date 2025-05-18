package za.ac.cput.factory;

import za.ac.cput.domain.Visitor;
import java.time.LocalDate;
import java.util.Objects;

public class VisitorFactory {

    public static Visitor createVisitor(int visitorId, String visitorFirstName,
                                        String visitorLastName, String visitorEmail,
                                        String visitorPhoneNumber, LocalDate hireTime) {

        // Validation
        if (visitorId <= 0)
            throw new IllegalArgumentException("Visitor ID must be positive");
        Objects.requireNonNull(visitorFirstName, "First name is required");
        Objects.requireNonNull(visitorLastName, "Last name is required");
        Objects.requireNonNull(hireTime, "Hire time is required");

        return new Visitor.Builder()
                .visitorId(visitorId)
                .visitorFirstName(visitorFirstName)
                .visitorLastName(visitorLastName)
                .visitorEmail(visitorEmail)
                .visitorPhoneNumber(visitorPhoneNumber)
                .hireTime(hireTime)
                .build();
    }

    public static Visitor createBasicVisitor(String visitorFirstName, String visitorLastName) {
        return createVisitor(
                generateVisitorId(),
                visitorFirstName,
                visitorLastName,
                null, // email
                null, // phone
                LocalDate.now() // current date
        );
    }

    public static int generateVisitorId() {
        return (int) (Math.random() * 1000000);
    }
}