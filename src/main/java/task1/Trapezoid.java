package task1;

//Трапеция
public class Trapezoid implements Figure2D{

    private double a;
    private double b;
    private double c;
    private double d;




    public Trapezoid(double a, double b, double c, double d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    @Override
    public double area() {
        return Math.sqrt(perimeter()*0.5*(perimeter()*0.5 - a)*(perimeter()*0.5 - b)*(perimeter()*0.5 - c)*(perimeter()*0.5 - d));
    }

    @Override
    public double perimeter() {
        return a+b+c+d;
    }
}
