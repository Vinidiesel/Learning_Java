package entities;

import entities.enums.Colors;

public abstract class Shape {

    private Colors colors;

    public Shape(){

    }

    public Shape(Colors colors) {
        this.colors = colors;
    }

    public Colors getColors() {
        return colors;
    }

    public void setColors(Colors colors) {
        this.colors = colors;
    }

    public abstract double area();
}
