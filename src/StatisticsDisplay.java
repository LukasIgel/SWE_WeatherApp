import java.util.Observable;
import java.util.Observer;

public class StatisticsDisplay implements DisplayElement, Observer {
    private double maxTemp;
    private double minTemp;
    private double tempSum;
    private int numReadings;
    StatisticsDisplay(Observable observable) {

    }
    
    public void update(Observable observable, Object object) {
        if (object instanceof WeatherData) {
            
        }
        display();
    }
    public void display() {

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
