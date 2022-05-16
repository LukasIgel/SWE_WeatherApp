package Model;
import java.util.Observable;

/**
 * WeatherData
 */
public class WeatherData extends Observable {
	
	public WeatherData() {
		
	}
	private double temperature;
	private double humidity;
	private double pressure;
	
	public double getTemperature() {
		return temperature;
	}
	
	public double getHumidity() {
		return humidity;
	}
	
	public double getPressure() {
		return pressure;
	}
	/* scheint falsch zu sein, nicht im UML
	public void update() {
		
	}*/
	public void setMeasurements(double temperature, double humidity, double pressure) {
		this.humidity = humidity;
		this.temperature = temperature;
		this.pressure = pressure;
		measurementsChanged();
	}
	
	public void measurementsChanged() {
		setChanged();
        notifyObservers();

	}
}
