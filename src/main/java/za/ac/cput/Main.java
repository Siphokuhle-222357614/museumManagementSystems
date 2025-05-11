package za.ac.cput;

import za.ac.cput.domain.Museum;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Museum museum = new Museum.Builder()
                .setMuseumId(1L)
                .setMuseumName("The Louvre")
                .setAddress("Rue de Frivolity")
                .setCity("Paris")
                .setProvince("Île-de-France")
                .setPostalCode((short) 75001)
                .setCountry("France")
                .setPhoneNumber((short) 394280)
                .setEmail("info@louvre.fr")
                .setWebsite("www.louvre.fr")
                .setMuseumType("Art Museum")
                .setOperatingHours("9:00 AM - 6:00 PM, closed on Tuesdays")
                .setDescription("World's largest art museum and historic monument")
                .build();;
    }
}