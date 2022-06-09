package task2;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args){
        /*Scanner input = new Scanner(System.in);
        System.out.print("Введите ставку в час в случае почасовой оплаты >> ");
        double money1 = input.nextFloat();
        System.out.print("Введите ежемесячную выплату в случае фиксированной оплаты >> ");
        double money2 = input.nextFloat();*/
        Person1 Vitya = new Person1(200);
        Person2 Bob = new Person2(35500.70);
        System.out.println("Среднемесячная зарплата с почасовой оплатой = " + Vitya.salary());
        System.out.println("Среднемесячная зарплата с фиксированной оплатой за месяц = " + Bob.salary());
    }
}
