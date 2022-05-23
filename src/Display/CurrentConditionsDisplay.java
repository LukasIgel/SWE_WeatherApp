package Display;

import java.util.Observable;
import java.util.Observer;

import Model.*;
public class CurrentConditionsDisplay implements DisplayElement, Observer {
    Observable observable;
    private double temperature;
    private double humidity;
    public CurrentConditionsDisplay()  {

    }
    public void update(Observable observable, Object object) {
        WeatherData wd = (WeatherData) observable;
        temperature = wd.getTemperature();
        humidity = wd.getHumidity();
        
        display();
    }
    public void display() {
        System.out.println("Aktualisiere CurrentConditionsDisplay: Temperatur="+temperature+", Feuchtigkeit="+humidity);
    }
}