package rarejackalope.chapter2.examples;

public class WeatherStation {

	public static void main(String[] args) 
	{
		WeatherData weatherData = new WeatherData();
		
		CurrentConditionsDisplay display = new CurrentConditionsDisplay(weatherData);
		
		weatherData.setMeasurements(80,65,30.4f);
		weatherData.setMeasurements(70,60,10.3f);
		weatherData.setMeasurements(10,12,13.6f);

	}

}
