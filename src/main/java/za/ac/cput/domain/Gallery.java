package za.ac.cput.domain;

import java.time.LocalDate;

public class Gallery {

    private String galleryId;
    private String name;
    private String description;
    private String location;
    private LocalDate openingDate;

    public Gallery(){

    }

    private Gallery(Builder builder){
        this.galleryId=builder.galleryId;
        this.name=builder.name;
        this.description=builder.description;
        this.location=builder.location;
        this.openingDate=builder.openingDate;

    }

    public String getName() {
        return name;
    }

    public String getGalleryId() {
        return galleryId;
    }

    public String getDescription() {
        return description;
    }

    public String getLocation() {
        return location;
    }

    public LocalDate getOpeningDate() {
        return openingDate;
    }

    @Override
    public String toString() {
        return "Gallery{" +
                "galleryId=" + galleryId +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", location='" + location + '\'' +
                ", openingDate=" + openingDate +
                '}';
    }

    public static class Builder{
        private String galleryId;
        private String name;
        private String description;
        private String location;
        private LocalDate openingDate;

        public Builder setGalleryId(String  galleryId){
            this.galleryId=galleryId;
            return this;
        }
        public Builder setName(String name){
            this.name=name;
            return this;
        }
        public Builder setDescription(String description){
            this.description=description;
            return this;
        }
        public Builder setLocation(String location){
            this.location=location;
            return this;
        }
        public Builder setOpeningDate(LocalDate openingDate){
            this.openingDate=openingDate;
            return this;
        }

        public Builder copy(Gallery gal){
            this.galleryId=gal.galleryId;
            this.name=gal.name;
            this.description=gal.description;
            this.location=gal.location;
            this.openingDate=gal.openingDate;
            return this;
        }

        public  Gallery build(){
            return new Gallery(this);
        }

    }
}
