# Design Patterns Java examples

#### Observer Pattern
Given two objects, `o1` and `o2`.

`o1` has a state that changes at times.
`o2` needs to know about the state of `o1`.

Do we _push_ data from `o1` to `o2` or do we _poll_ `o1` from `o2`?

In the *Observer Pattern*, `o1` will be in charge of pushing to inform `o2`…`oN` that it’s state has changed

`o2`….`oN` need to register with `o1` so `o1` knows who they are so he can push the data to them.
In this case, `o1` is called the _observable_ (or _subject_) and `o2`…`oN` are called the _observers_


Where there can be `0` to `n` _Observers_.

The Observer Pattern defines a _one-to-many relationship_. So the observer (one) is connected to the observers (many).

![No image found](http://java.dzone.com/sites/all/files/observer_pattern.PNG)

#### Decorator Pattern

The Decorator Pattern attaches additional responsibilities to an object dynamically (at runtime). Decorators give an alternative to subclassing.

Given two objects, `o1` and `o2`, 

`o1` sends data to `o2`. `o2` then sends data back to `o1`. If we wanted the data sent back by `o2` to `o1` to be manipulated before sending it back (**without changing the code inside `o2`**)
we would use the Decorator Pattern.

In essence, we _wrap_ the object sending back the response (`o2`) with another object that actually receives and sends the data back to `o1` with the modifications. The Decorator object _has_ a component and _is_ a component.
   
![No image found](https://cdn.journaldev.com/wp-content/uploads/2013/07/decorator-pattern.png)