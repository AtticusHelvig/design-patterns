package observerPattern;

public class ElectronicThermometer implements Observer {

    private WeatherStation weatherStation;

    public ElectronicThermometer(WeatherStation weatherStation) {
        this.weatherStation = weatherStation;
        update();
    }

    private void displayTemp(int temperature) {
        System.out.println(temperature);
    }

    @Override
    public void update() {
        displayTemp(weatherStation.getTemperature());
    }

}
