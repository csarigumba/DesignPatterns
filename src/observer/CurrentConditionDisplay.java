package observer;

import observer.interfaces.DisplayElement;
import observer.interfaces.Observer;
import observer.interfaces.Subject;

// Subscriber
public class CurrentConditionDisplay implements Observer, DisplayElement {
	private float temperature;
	private float humidity;
	private Subject weatherData;

	public CurrentConditionDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}

	@Override
	public void update(float temp, float humidity, float pressure) {
		this.temperature = temp;
		this.humidity = humidity;
		display();
	}

	@Override
	public void display() {
		System.out.println("CurrentConditionDisplay [temperature=" + temperature + ", humidity=" + humidity
				+ ", weatherData=" + weatherData + "]");
	}

}
