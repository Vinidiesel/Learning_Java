package entities;

import entities.enums.Colors;

public class Circle extends AbstractShape {

    private Double radius;

    public Circle(Colors colors, Double radius) {
        super(colors);
        this.radius = radius;
    }

    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius*radius;
    }
}
