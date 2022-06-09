package task3;

public class CelsiusFahrenheit implements Converter{
    private double degrees;

    public CelsiusFahrenheit(double degrees) {
        this.degrees = degrees;
    }

    @Override
    public double converter() {
        return (degrees * 9 / 5) + 32;
    }
}
