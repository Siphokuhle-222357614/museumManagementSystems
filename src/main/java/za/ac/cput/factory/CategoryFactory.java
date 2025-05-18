package za.ac.cput.factory;

import jdk.jfr.Category;
import za.ac.cput.domain.Artifact;
import za.ac.cput.domain.enums.MaterialLocation;
import za.ac.cput.domain.enums.Materials;
import za.ac.cput.util.Helper;

import java.time.LocalDate;

public class CategoryFactory {
    import za.ac.cput.domain.Category;
import za.ac.cput.domain.enums.MaterialLocation;
import za.ac.cput.domain.enums.Materials;
import za.ac.cput.util.Helper;



    public class CategoryFactory {

        public static Category createCategory(String Historical, String Mathematical, String
                                                      Science,String Arts,
                                              Materials materials, MaterialLocation location){

            if (Helper.isNullOrEmpty(Historical) || Helper.isNullOrEmpty(Mathematical)|| Helper.isNullOrEmpty(Science)
                    || Helper.isNullOrEmpty(String.valueOf(dateOfOrigin)) || Helper.isNullOrEmpty(condition) ||
                    Helper.isNullOrEmpty(String.valueOf(materials)))  Helper.isNullOrEmpty(String.valueOf(location));
            return null;

        }

        public static Category createCategory(String "001", String CategoryName, String s, String date) {
            return null;
        }
    }
}
