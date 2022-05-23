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
        System.out.println("ForeCast Pressure: " + wd.getPressure());
        lastPressure = currentPressure;
        currentPressure = wd.getPressure();
    display();
    }
     @Override
    public void display() {
        System.out.println("Aktualisiere ForeCastDisplay:");
        System.out.println("Pressure changed from "+lastPressure+ " to "+currentPressure);
        
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
