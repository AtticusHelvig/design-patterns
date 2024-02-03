package observerPattern;

public class ObserverPatternMain {

    public static void main(String[] args) {

        WeatherStation weatherStation = new WeatherStation(50);

        NewsFeed newsFeed = new NewsFeed(weatherStation);
        // Could potentially be done inside the constructor of NewsFeed
        weatherStation.registerObserver(newsFeed);

        ElectronicThermometer electronicThermometer = new ElectronicThermometer(weatherStation);
        weatherStation.registerObserver(electronicThermometer);

        weatherStation.setTemperature(10);
        weatherStation.setTemperature(40);
        weatherStation.setTemperature(110);
        weatherStation.setTemperature(-1000);
    }
}
