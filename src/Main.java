public class Main {
    public static void main(String[] args) {
        //Todo Бул ар кандай форманын аянтын табуучу методтор
        Shapes triangle = new Triangle(10,5);
        Shapes circle = new Circle(10);
        Shapes rectangle = new Rectangle(10,15);
        Shapes square = new Square(10,10);
        triangle.findArea();
        circle.findArea();
        rectangle.findArea();
        square.findArea();
    }
}