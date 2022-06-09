package task1;

//Треугольник
public class Triangle implements Figure2D{
    private double a;
    private double b;
    private double c;
    public Triangle(double b, double a, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double area() {
        return Math.sqrt(perimeter()*0.5*(perimeter()-a)*(perimeter()-b)*(perimeter()-c));
    }

    @Override
    public double perimeter() {
        return a+b+c;
    }
}
