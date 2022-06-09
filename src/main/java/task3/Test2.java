package task3;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Test2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Из каких градусов вы хотите ковертировать?");
        String x1 = input.next();
        System.out.println("В какие?");
        String x2 = input.next();
        DecimalFormat decimalFormat = new DecimalFormat( "#.###" );
        if (x1.trim().equals("Цельсия") & x2.trim().equals("Кельвин")){
            System.out.print("Введите градусы Цельсия >> ");
            double g = input.nextDouble();
            CelsiusKelvin ck = new CelsiusKelvin(g);
            String result = decimalFormat.format(ck.converter());
            System.out.println(g + " градуса(-ов) Цельсия = " + result + " Кельвин");
        }
        else if (x1.trim().equals("Цельсия") & x2.trim().equals("Фаренгейт")){
            System.out.print("Введите градусы Цельсия >> ");
            double g = input.nextDouble();
            CelsiusFahrenheit ck = new CelsiusFahrenheit(g);
            String result = decimalFormat.format(ck.converter());
            System.out.println(g + " градуса(-ов) Цельсия = " + result + " градусов Фаренгейт");
        }
        else if (x1.trim().equals("Кельвин") & x2.trim().equals("Цельсия")){
            System.out.print("Введите Кельвины >> ");
            double g = input.nextDouble();
            KelvinCelsius ck = new KelvinCelsius(g);
            String result = decimalFormat.format(ck.converter());
            System.out.println(g + " Кельвин = " + result + " градуса(-ов) Цельсия");
        }
        else if (x1.trim().equals("Фаренгейт") & x2.trim().equals("Цельсия")){
            System.out.print("Введите градусы Фаренгейта >> ");
            double g = input.nextDouble();
            FahrenheitCelsius ck = new FahrenheitCelsius(g);
            String result = decimalFormat.format(ck.converter());
            System.out.println(g + " градусов Фаренгейт = " + result + " градуса(-ов) Цельсия");
        }
        else if (x1.trim().equals("Кельвин") & x2.trim().equals("Фаренгейт")){
            System.out.print("Введите Кельвины >> ");
            double g = input.nextDouble();
            KelvinFahrenheit ck = new KelvinFahrenheit(g);
            String result = decimalFormat.format(ck.converter());
            System.out.println(g + " Кельвин = " + result + " градусов Фаренгейт");
        }
        else if (x1.trim().equals("Фаренгейт") & x2.trim().equals("Кельвин")){
            System.out.print("Введите градусы Фаренгейта >> ");
            double g = input.nextDouble();
            FahrenheitKelvin ck = new FahrenheitKelvin(g);
            String result = decimalFormat.format(ck.converter());
            System.out.println(g + " градуса(-ов) Фаренгейт = " + result + " Кельвин");
        }
    }
}
