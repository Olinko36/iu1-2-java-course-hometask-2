package task3;

public class FahrenheitCelsius implements Converter{
    private double degrees;

    public FahrenheitCelsius(double degrees) {
        this.degrees = degrees;
    }

    @Override
    public double converter() {
        return (degrees - 32) * 5 / 9;
    }
}
