import java.util.Observer;

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
        Observer statisticsDisplay = new StatisticsDisplay();
        Observer heatIndexDisplay = new HeatIndexDisplay();

        weatherData.addObserver(statisticsDisplay);
        weatherData.addObserver(heatIndexDisplay);

        weatherData.setMeasurements(1,1,1);
        System.out.println("##################################");
        weatherData.setMeasurements(2,2,2);

    }
}
