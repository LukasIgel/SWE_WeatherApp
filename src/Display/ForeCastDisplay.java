package Display;
import java.util.Observable;
import java.util.Observer;

import Model.WeatherData;

/**
 * ForeCastDisplay
 */
public class ForeCastDisplay implements DisplayElement, Observer{
    public double currentPressure;
    public double lastPressure;
    
    public ForeCastDisplay() {
    
    }
    public void update(Observable observable, Object obj){
        WeatherData wd = (WeatherData) observable;
        lastPressure = currentPressure;
        currentPressure = wd.getPressure();
    display();
    }
     @Override
    public void display() {
        System.out.println("Aktualisiere ForeCastDisplay: Druckänderung von "+lastPressure+ " zu "+currentPressure);
        if (lastPressure<currentPressure) {
            System.out.println("Druck steigt, sieht gut aus.");
        } else {
            if (lastPressure>(currentPressure+5)) {
                System.out.println("Druck fällt rapide, Unwetterwarnung.");
            } else {
                System.out.println("Druck fällt leicht, schade.");
            }
        }

        
    }
    public double getCurrentPressure() {
        return currentPressure;
    }

    public void setCurrentPressure(double currentPressure) {
        this.currentPressure = currentPressure;
    }

    public double getLastPressure() {
        return lastPressure;
    }

    public void setLastPressure(double lastPressure) {
        this.lastPressure = lastPressure;
    }
   

    
    
}
