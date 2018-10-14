package org.kbbgl.dp.observer_pattern;

import java.util.ArrayList;
import java.util.List;

// Does get state
// Does observer things
public class WeatherStation implements IObservable {

    private List<IObserver> observers;
    private int temp;

    WeatherStation() {
        observers = new ArrayList<>();
    }

    void setTemp(int temp) {
        this.temp = temp;
        this.emit();
    }

    @Override
    public void add(IObserver observer) {
        this.observers.add(observer);
    }

    @Override
    public void remove(IObserver observer) {
        this.observers.remove(observer);
    }

    @Override
    public void emit() {
        for (IObserver observer : this.observers) {
            observer.update();
        }
    }

    // Rest of observable logic
    int getTemperature(){

        return this.temp;

    }

    public List<IObserver> getObservers() {
        return this.observers;
    }
}
