package task3;

public class FahrenheitKelvin implements Converter {
    private double degrees;

    public FahrenheitKelvin(double degrees) {
        this.degrees = degrees;
    }

    @Override
    public double converter() {
        return ((degrees - 32) * 5 / 9) + 273.15;
    }
}
