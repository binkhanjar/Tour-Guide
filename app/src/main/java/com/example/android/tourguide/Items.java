package com.example.android.tourguide;

public class Items {

    private String Name;
    private int Image;
    private String Description;


    public Items(String name, int image, String description) {
        Name = name;
        Image = image;
        Description = description;
    }

    public Items(String string, int image) {
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getImage() {
        return Image;
    }

    public void setImage(int image) {
        Image = image;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }
}
