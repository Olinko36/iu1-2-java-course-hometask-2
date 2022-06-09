package task1;

import java.util.Scanner;

public class Main {

    static void Menu(){
        System.out.println();
        System.out.println("What base does prism have?  (circle/rectangular/triangle/trapezoid) ");
        System.out.println("Enter 0 if you want to exit" );
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Menu();
        String base = input.next();
        while (!base.trim().equals("0")){
            if (base.trim().equals("circle")){
                System.out.println("Enter the radius of the circle and the height of the prism");
                double radius = input.nextDouble();
                double h = input.nextDouble();
                if (radius <= 0 || h <= 0){
                    System.out.println("Wrong data");
                }
                else {
                    Circle circle = new Circle(radius);
                    Prism prism = new Prism(circle, h);
                    System.out.println("Prism volume: " + prism.volume());
                    System.out.println("Prism surface area: " + prism.surfaceArea());
                }

            }
            else if (base.trim().equals("rectangular")) {
                System.out.println("Enter the height of the rectangular, the width of the rectangular and the height of the prism");
                double a = input.nextDouble();
                double b = input.nextDouble();
                double h = input.nextDouble();
                if (a <= 0 || b <= 0 || h <= 0){
                    System.out.println("Wrong data");
                }
                else{
                    Rectangular rect = new Rectangular(a, b);
                    Prism prism = new Prism(rect, h);
                    System.out.println("Prism volume: " + prism.volume());
                    System.out.println("Prism surface area: " + prism.surfaceArea());
                }

            }
            else if (base.trim().equals("triangle")) {
                System.out.println("Enter the sides of the triangle and the height of the prism");
                double a = input.nextDouble();
                double b = input.nextDouble();
                double c = input.nextDouble();
                double h = input.nextDouble();
                if (a <= 0 || b <= 0 || c <= 0 || h <= 0 || (a+b <= c) || (a+c <= b) || (b+c <= a)){
                    System.out.println("Wrong data");
                }
                else{
                    Triangle triangle = new Triangle(a, b, c);
                    Prism prism = new Prism(triangle, h);
                    System.out.println("Prism volume: " + prism.volume());
                    System.out.println("Prism surface area: " + prism.surfaceArea());
                }

            }
            else if (base.trim().equals("trapezoid")) {
                System.out.println("Enter the sides of the trapezoid and the height of the prism");
                double a = input.nextDouble();
                double b = input.nextDouble();
                double c = input.nextDouble();
                double d = input.nextDouble();
                double h = input.nextDouble();
                if (a <= 0 || b <= 0 || c <= 0 || d <= 0 || h <= 0 || (a >= b+c+d) || (b >= a+c+d) || (c >= a+b+d) || (d >= a+b+c)){
                    System.out.println("Wrong data");
                }
                else {
                    Trapezoid trap = new Trapezoid(a, b, c, d);
                    Prism prism = new Prism(trap, h);
                    System.out.println("Prism volume: " + prism.volume());
                    System.out.println("Prism surface area: " + prism.surfaceArea());
                }

            }
            Menu();
            base = input.next();
        }




    }






}
