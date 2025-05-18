package za.ac.cput.factory;

import za.ac.cput.domain.Artifact;
import za.ac.cput.domain.enums.MaterialLocation;
import za.ac.cput.domain.enums.Materials;
import za.ac.cput.util.Helper;

import java.time.LocalDate;

public class ArtifactFactory {

    public static Artifact createArtifact(String artifactId, String name, String
                                          description, LocalDate dateOfOrigin, String condition,
                                          Materials materials, MaterialLocation location){

        if (Helper.isNullOrEmpty(artifactId) || Helper.isNullOrEmpty(name)|| Helper.isNullOrEmpty(description)
        || Helper.isNullOrEmpty(String.valueOf(dateOfOrigin)) || Helper.isNullOrEmpty(condition) ||
        Helper.isNullOrEmpty(String.valueOf(materials)))  Helper.isNullOrEmpty(String.valueOf(location));
        return null;




    }

    public static Artifact createArtifact(String g001, String artifactName, String s, String date) {
        return null;
    }
}
