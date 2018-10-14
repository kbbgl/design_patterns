package org.kbbgl.dp.observer_pattern;

import java.util.UUID;

public class WindowDisplay implements IObserver{

    private WeatherStation weatherStation;
    private String id;

    WindowDisplay(WeatherStation weatherStation) {
        this.weatherStation = weatherStation;
        this.id = UUID.randomUUID().toString();
    }

    private String getId() {
        return this.id;
    }

    @Override
    public void update() {
        System.out.println("WindowDisplay with id " + getId() + " updated");
        System.out.println("temperature: " + this.weatherStation.getTemperature());
    }

}
