package org.yvasylchuk.t5_adapter;

import java.util.List;

public class UsageExample {
    public static void main(String[] args) {
        Shape shape = new Shape(List.of(0, 0,
                10, 0,
                10, 10,
                0, 10),
                "#FF0011");
//        ShapeToFigureAdapter figure = new ShapeToFigureAdapter(shape);
//        FigureDrawer drawer = new FigureDrawer();
//        System.out.println(drawer.draw(figure));
    }
}
