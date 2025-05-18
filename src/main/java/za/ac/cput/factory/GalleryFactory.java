package za.ac.cput.factory;


import za.ac.cput.domain.Gallery;
import za.ac.cput.util.Helper;

import java.time.LocalDate;

public class GalleryFactory {

    public static Gallery createGallery(String galleryId, String name, String description, String location,
                                        LocalDate openingDate){

        if (Helper.isNullOrEmpty(String.valueOf(galleryId)) || Helper.isNullOrEmpty(name)|| Helper.isNullOrEmpty(description)
                ||Helper.isNullOrEmpty(location) ||
                Helper.isNullOrEmpty(String.valueOf(openingDate)))

        return null;

        return new Gallery.Builder()
                .setGalleryId(galleryId)
                .setName(name)
                .setDescription(description)
                .setLocation(location)
                .setOpeningDate(openingDate)
                .build();


    }
}
