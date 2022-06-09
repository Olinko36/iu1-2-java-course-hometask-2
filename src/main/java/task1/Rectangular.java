package task1;

//Прямоугольник
public class Rectangular implements Figure2D{
    private double a;
    private double b;

    public Rectangular(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double area() {
        return a*b;
    }

    @Override
    public double perimeter() {
        return 2*a+2*b;
    }
}
