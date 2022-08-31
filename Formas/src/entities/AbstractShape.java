package entities;

import entities.enums.Colors;

public abstract class AbstractShape implements Shape{

    private Colors colors;

    public AbstractShape(Colors colors) {
        this.colors = colors;
    }

    public Colors getColors() {
        return colors;
    }

    public void setColors(Colors colors) {
        this.colors = colors;
    }
}
