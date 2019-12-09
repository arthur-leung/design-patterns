package observer.weatherByJava;

import org.junit.Test;

public class WeatherStation {
    @Test
    public void testStation() {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay conditionsDisplay = new CurrentConditionsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

        weatherData.setMeasurements(22, 50, 1.3f);
        weatherData.setMeasurements(26, 53, 1.8f);
    }
}
