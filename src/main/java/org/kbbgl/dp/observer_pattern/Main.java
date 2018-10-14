package org.kbbgl.dp.observer_pattern;

public class Main {

    public static void main(String[] args) {

        WeatherStation weatherStation = new WeatherStation();
        PhoneDisplay phoneDisplay = new PhoneDisplay(weatherStation);
        WindowDisplay windowDisplay = new WindowDisplay(weatherStation);

        weatherStation.add(phoneDisplay);
        weatherStation.add(windowDisplay);

        weatherStation.setTemp(40);
        weatherStation.setTemp(50);


    }

}
