package task1;

public class Prism {
    private Figure2D base;
    private double h;

    public Prism(Figure2D base, double h) {
        this.base = base;
        this.h = h;
    }

    // метод вычисления объема
    public double volume() {
        return base.area() * h;
    }

    // площадь поверхности
    public double surfaceArea() {
        return base.area()*2 + base.perimeter()*h;
    }


}
