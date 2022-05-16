import java.util.Observable;
import java.util.Observer;

/**
 * HeatIndexDisplay
 */
public class HeatIndexDisplay implements DisplayElement, Observer{
    private double heatIndex;

    public HeatIndexDisplay() {
    }
    public void update(Observable observable, Object object) {
            WeatherData wd = (WeatherData) observable;
            System.out.println("HeatIndex Temp: " + wd.getTemperature());
        
        display();
    }
    @Override
    public void display() {
        System.out.println("Aktualisiere HeatIndexDisplay");
    }

}
