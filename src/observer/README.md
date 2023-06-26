## Observer Pattern - Weather Data Monitoring System
The Observer pattern establishes a one-to-many relationship between objects, allowing automatic notification and updates when the state of one object (the subject) changes. In the Weather Data Monitoring System, this pattern is used to notify displays (observers) about changes in weather data.

### Example

```
public static void main(String[] args) {
    WeatherData weatherData = new WeatherData();

    // Create displays
    CurrentConditionDisplay currentDisplay = new CurrentConditionDisplay(weatherData);
    StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
    ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
    HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weatherData);

    // Simulate weather data updates
    weatherData.setMeasurements(80, 65, 20.4f);
    weatherData.setMeasurements(82, 70, 29.2f);
    weatherData.setMeasurements(78, 90, 29.2f);
}

```

In this example, instances of the WeatherData class (the subject) and various display objects (observers) are created. Each display registers itself with the WeatherData object. Simulated weather data updates trigger notifications, and the displays automatically update with the latest weather information.

### Benefits
**Flexibility**: Easy addition or removal of observers without modifying the subject.

**Decoupling**: Reduced dependencies and modular design.

**Reusability**: Observers can be reused across different subjects.

**Extensibility**: New observers can be added without modifying existing components.
Usage

To incorporate the Weather Data Monitoring System:

Include the necessary classes (WeatherData, CurrentConditionDisplay, etc.).
Create display instances, passing the WeatherData object to their constructors.
Call appropriate methods on the WeatherData object to update the weather data.
Observers will automatically receive notifications and update their displays.