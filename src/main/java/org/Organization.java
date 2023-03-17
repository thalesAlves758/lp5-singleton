package org;

public class Organization {
    private String name;
    private String logoPath;
    private String primaryColor;
    private String SecondaryColor;

    private static Organization instance;

    private Organization() {};

    public static Organization getInstance() {
        if(instance == null) {
            instance = new Organization();
        }

        return instance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLogoPath() {
        return logoPath;
    }

    public void setLogoPath(String logoPath) {
        this.logoPath = logoPath;
    }

    public String getPrimaryColor() {
        return primaryColor;
    }

    public void setPrimaryColor(String primaryColor) {
        this.primaryColor = primaryColor;
    }

    public String getSecondaryColor() {
        return SecondaryColor;
    }

    public void setSecondaryColor(String secondaryColor) {
        SecondaryColor = secondaryColor;
    }
}
