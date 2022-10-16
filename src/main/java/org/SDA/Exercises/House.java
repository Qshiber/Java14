package org.SDA.Exercises;

/*
Zaimplementuj klasę dom,
 która zawiera dużo fieldów (wymiary, ilość drzwi, ilość okien, kolor ścian, grubość izolacji, kolor dachu, etc)
 i można ją konstruować w sposób funkcyjny:
 */

public class House {

    private Integer width;
    private Integer depth;
    private Integer height;
    private Integer numberOfWindows;
    private Integer numberOfDoors;
    private Integer thicknessOfInsulation;
    private String wallsColor;
    private String roofColor;

    public House(Integer width, Integer depth, Integer height, Integer numberOfWindows,
                 Integer numberOfDoors, Integer thicknessOfInsulation, String wallsColor, String roofColor) {
        this.width = width;
        this.depth = depth;
        this.height = height;
        this.numberOfWindows = numberOfWindows;
        this.numberOfDoors = numberOfDoors;
        this.thicknessOfInsulation = thicknessOfInsulation;
        this.wallsColor = wallsColor;
        this.roofColor = roofColor;
    }

    public House() {

    }

    public House addDoors(Integer numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
        return this;
    }

    public House addWindows(Integer numberOfWindows) {
        this.numberOfWindows = numberOfWindows;
        return this;
    }

    public House setWallsColor(String wallsColor) {
        this.wallsColor = wallsColor;
        return this;
    }

    public House thicknessOfInsulation(Integer thicknessOfInsulation) {
        this.thicknessOfInsulation = thicknessOfInsulation;
        return this;
    }

  //Width: %d, Depth: %d, Height: %d
    @Override
    public String toString(){
        return String.format("NumOfWindows: %d\nNumOfDoors: %d\nColor of the walls: %s", numberOfWindows, numberOfDoors, wallsColor);
    }
}
