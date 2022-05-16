import java.util.Observable;
import java.util.Observer;

public class StatisticsDisplay implements DisplayElement, Observer {
    private double maxTemp;
    private double minTemp;
    private double tempSum;
    private int numReadings;

    StatisticsDisplay(Observable observable) {

    }
    
    public StatisticsDisplay() {
    }

    public void update(Observable observable, Object object) {
            WeatherData wd = (WeatherData) observable;
            System.out.println("Temp: " + wd.getTemperature() + " Hum: " + wd.getHumidity() + " Luftdruck: " + wd.getPressure());
        
        display();
    }

    public void display() {
        System.out.println("Aktualisiere StatisticsDisplay");
    }

    public double getMaxTemp() {
        return maxTemp;
    }
    public void setMaxTemp(double maxTemp) {
        this.maxTemp = maxTemp;
    }
    public double getMinTemp() {
        return minTemp;
    }
    public void setMinTemp(double minTemp) {
        this.minTemp = minTemp;
    }
    public double getTempSum() {
        return tempSum;
    }
    public void setTempSum(double tempSum) {
        this.tempSum = tempSum;
    }
    public int getNumReadings() {
        return numReadings;
    }
    public void setNumReadings(int numReadings) {
        this.numReadings = numReadings;
    }
}
