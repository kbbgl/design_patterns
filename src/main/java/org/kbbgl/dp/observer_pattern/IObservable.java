package org.kbbgl.dp.observer_pattern;

public interface IObservable {

    void add(IObserver observer);
    void remove(IObserver observer);
    void emit();
}
