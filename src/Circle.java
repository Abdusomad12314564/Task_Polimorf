public class Circle extends Shapes{
    private final double PI=3.14;
    private double a;

    public Circle(double a) {
        this.a = a;
    }

    public double getPI() {
        return PI;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    @Override
    public void findArea() {
        System.out.println("Тегеректин аянты: "+Math.PI*(a*a));
    }
}
