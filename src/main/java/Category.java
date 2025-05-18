import za.ac.cput.domain.Gallery;

import java.time.LocalDate;

public class Category {
    private String Historical;
    private String Mathematical;
    private String Science;
    private String Arts;

    public Category() {
    }

    private Category(Category.Builder builder) {
        this.Historical = builder.Historical;
        this.Mathematical = builder.Mathematical;
        this.Science = builder.Science;
        this.Arts = builder.Arts;
    }

    public String Historical() {
        return Historical;
    }

    public String Mathematical() {
        return Mathematical;
    }

    public String Science() {
        return Science;
    }

    public String Arts() {
        return Arts;
    }

    @Override
    public String toString() {
        return "Category{" +
                "Historical='" + Historical + '\'' +
                ", Mathematical='" + Mathematical + '\'' +
                ", Science='" + Science + '\'' +
                ", Arts='" + Arts + '\'' +
                '}';
    }

    public static class Builder {
        private String Historical;
        private String Mathematical;
        private String Science;
        private String Arts;
    }

    public Historical.Builder setHistorical(String Historical) {
        this.Historical = Historical;
        return this;
    }

    public Mathematical.Builder setMathematical(String Mathematical) {
        this.Mathematical = Mathematical;
        return this;
    }

    public Science.Builder setScience(String Science) {
        this.Science = Science;
        return this;
    }

    public Arts.Builder setArts(String Arts) {
        this.Arts = Arts;
        return this;
    }

    public Category.Builder copy(Category Cat){
        this.Historical= Cat.Historical;
        this.Mathematical=Cat.Mathematical;
        this.Science=Cat.Science;
        this.Arts=Cat.Arts;
        return this;
    }

    public  Category build(){
        return new Category(this);
    }

}