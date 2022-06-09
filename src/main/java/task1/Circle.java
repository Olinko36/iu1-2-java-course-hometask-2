package task1;

public class Circle implements Figure2D{
    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    @Override
    public double area(){

        return radius*radius*3.14;
    }

    @Override
    public double perimeter() {
        return 2*3.14*radius;
    }
}
