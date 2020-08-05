package cz.jpetrla.headfirst.weatherobservable;

public class WeatherStation {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

        weatherData.setMeasurement(90, 65, 30.4f);
        weatherData.setMeasurement(92, 70, 29.2f);
        weatherData.setMeasurement(78, 90, 29.2f);
    }

}
