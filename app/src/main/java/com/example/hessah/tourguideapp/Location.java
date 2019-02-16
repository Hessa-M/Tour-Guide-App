package com.example.hessah.tourguideapp;


public class Location {

    private String nameLocation;
    private String infoLocation;
    private int imageResourceId= NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;

    public Location(String nameLocation , String infoLocation) {
        this.nameLocation = nameLocation;
        this.infoLocation = infoLocation;
    }

    public Location(String nameLocation , String infoLocation, int imageResourceId) {
        this.nameLocation = nameLocation;
        this.infoLocation = infoLocation;
        this.imageResourceId = imageResourceId;
    }

    public String getNameLocation() {
        return nameLocation;
    }

    public String getInfoLocation() {
        return infoLocation;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    public boolean hasImage() {
        return imageResourceId != NO_IMAGE_PROVIDED;
    }
}
