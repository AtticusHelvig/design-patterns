package observerPattern;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Observable {

    private int temperature;
    private List<Observer> observers;

    public WeatherStation(int intialTemperature) {
        temperature = intialTemperature;
        observers = new ArrayList<Observer>();
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
        notifyObservers();
    }

    public int getTemperature() {
        return temperature;
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }

}
