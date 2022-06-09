package task3;

public class KelvinCelsius implements Converter{
    private double degrees;

    public KelvinCelsius(double degrees) {
        this.degrees = degrees;
    }

    @Override
    public double converter() {
        return degrees - 273.15;
    }
}
