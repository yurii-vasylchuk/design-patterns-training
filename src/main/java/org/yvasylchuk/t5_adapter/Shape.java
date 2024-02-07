package org.yvasylchuk.t5_adapter;

import java.util.Iterator;
import java.util.List;

public class Shape {
    private List<Integer> coords;
    private String color;

    public Shape(List<Integer> coords, String color) {
        this.coords = coords;
        this.color = color;
    }

    public Iterator<Integer> getCoordsIterator() {
        return coords.iterator();
    }

    public String getColor() {
        return color;
    }
}
