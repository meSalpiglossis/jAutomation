package maxima.homework20221102;

import maxima.homework20221102.geometrypackage.*;

public class Main {

    private static Shape[] generateShapes(){
        Shape[] shapes = new Shape[25]; // 25

        for(int i = 0; i < (shapes.length / 5); ++i){
            shapes[i] = new Circle(5.5 + i);
        }
        for(int i = (shapes.length / 5); i < 2 * (shapes.length / 5); ++i){
            shapes[i] = new Sqare(6.2 + i);
        }
        for(int i = 2 * (shapes.length / 5); i < 3 * (shapes.length / 5); ++i){
            shapes[i] = new Rectangle(3.3 + i, 4.4 + i);
        }
        for(int i = 3 * (shapes.length / 5); i < 4 * (shapes.length / 5); ++i){
            shapes[i] = new Ellipse(3.2 + i, 1.8 + i);
        }
        for(int i = 4 * (shapes.length / 5); i < shapes.length; ++i){
            shapes[i] = new Speaker.Builder().setDepth(1 + i).setWidth(1 + i).build();
        }

        return shapes;
    }

    public static void main(String[] args) {

        double comulativeArea = 0;

        for(Shape shape: generateShapes()){
            comulativeArea += shape.getArea();
        }
        System.out.println(comulativeArea);
    }
}
