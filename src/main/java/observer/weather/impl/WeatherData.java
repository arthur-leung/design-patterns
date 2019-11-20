package observer.weather.impl;

import observer.weather.Observer;
import observer.weather.Subject;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {
    private List<Observer> observers = new ArrayList<Observer>();
    private float temperature;
    private float humidity;
    private float pressure;

    public void registerObservers(Observer observer) {
        observers.add(observer);
    }

    public void removeObservers(Observer observer) {
        int index = observers.indexOf(observer);

        if (index >= 0) {
            observers.remove(observer);
        }
    }

    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(temperature, humidity, pressure);
        }
    }

    /**
     * 当物理检测设备发生变化时通知观察者
     */
    public void measurementsChanged() {
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
}
