package observer.weather;

import observer.weather.impl.CurrentConditionsDisplay;
import observer.weather.impl.HeatIndexDisplay;
import observer.weather.impl.WeatherData;
import org.junit.Test;

public class WeatherStation {
    @Test
    public void testStation() {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay conditionsDisplay = new CurrentConditionsDisplay(weatherData);
        HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weatherData);
        weatherData.setMeasurements(22, 50, 1.3f);
        weatherData.removeObservers(conditionsDisplay);
        weatherData.setMeasurements(26, 53, 1.8f);
    }
}
