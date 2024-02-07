package org.yvasylchuk.t5_adapter;

public class FigureDrawer {
    public String draw(Figure figure) {
        StringBuilder sb = new StringBuilder();
        for (int[] coordinate : figure.getCoordinates()) {
            sb.append("x: ").append(coordinate[0]).append(" y: ").append(coordinate[1]).append("\n");
        }
        short[] color = figure.getColor();
        sb.append("color: (Red: ").append(color[0])
                .append(", Green: ").append(color[1])
                .append(", Blue: ").append(color[2])
                .append(")");
        return sb.toString();
    }
}
