package task3;

public class CelsiusKelvin implements Converter{
    private double degrees;

    public CelsiusKelvin(double degrees) {
        this.degrees = degrees;
    }

    @Override
    public double converter() {
        return degrees + 273.15;
    }
}
