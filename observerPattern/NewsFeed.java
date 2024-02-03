package observerPattern;

public class NewsFeed implements Observer {

    private WeatherStation weatherStation;
    private static final int HIGH_TEMP = 100;
    private static final int LOW_TEMP = 30;

    public NewsFeed(WeatherStation weatherStation) {
        this.weatherStation = weatherStation;
    }

    private void weatherAlert(int temperature) {
        if (temperature >= HIGH_TEMP || temperature <= LOW_TEMP) {
            System.out.printf("Weather Alert: Extreme Temperatures (%d).\n", temperature);
        }
    }

    @Override
    public void update() {
        weatherAlert(weatherStation.getTemperature());
    }

}
