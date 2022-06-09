package task2;

//работник с почасовой оплатой
public class Person1 extends Person{
    private double money;

    public Person1(double money) {
        this.money = money;
    }

    @Override
    double salary() {
        return 20.8*8*money;
    }
}
