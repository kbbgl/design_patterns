package org.kbbgl.dp.observer_pattern;

import java.util.UUID;

public class PhoneDisplay implements IObserver{

    private WeatherStation weatherStation;
    private String id;

    PhoneDisplay(WeatherStation weatherStation) {
        this.weatherStation = weatherStation;
        this.id = UUID.randomUUID().toString();
    }

    private String getId() {
        return this.id;
    }

    @Override
    public void update() {
        System.out.println("PhoneDisplay with ID " + getId() + " updated");
        System.out.println("temperature: " + this.weatherStation.getTemperature());
    }

}
