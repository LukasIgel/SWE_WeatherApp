import java.util.Observer;

import Display.CurrentConditionsDisplay;
import Display.ForeCastDisplay;
import Display.HeatIndexDisplay;
import Display.StatisticsDisplay;
import Model.WeatherData;

/**
 * WeatherStation
 */
public class WeatherStation {
    public WeatherStation() {

    }
    public static void main(String[] args) {
       System.out.println("##################################");

        WeatherData weatherData = new WeatherData();
        Observer statisticsDisplay = new StatisticsDisplay(30, -10);
        Observer heatIndexDisplay = new HeatIndexDisplay();
        Observer foreCastDisplay = new ForeCastDisplay();
        Observer currentConditionsDisplay = new CurrentConditionsDisplay();
        weatherData.addObserver(statisticsDisplay);
        weatherData.addObserver(heatIndexDisplay);
        weatherData.addObserver(foreCastDisplay);
        weatherData.addObserver(currentConditionsDisplay);

        weatherData.setMeasurements(1,1,1);
        System.out.println("##################################");
        weatherData.setMeasurements(2,2,2);

    }
}
