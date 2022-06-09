package task3;

public class KelvinFahrenheit implements Converter{
    private double degrees;

    public KelvinFahrenheit(double degrees) {
        this.degrees = degrees;
    }

    @Override
    public double converter() {
        return ((degrees - 273.15) *  9 / 5 ) + 32;
    }
}
