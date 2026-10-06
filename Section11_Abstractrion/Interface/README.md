# Interfaces in Java

A Java study project from the **Complete Java Masterclass** course (Abstraction in Java - Interfaces), focused on understanding how **interfaces** work and how they differ from abstract classes.

## About

An interface is not a class. It is a special type that works as a contract between a class and the client code, enforced by the compiler. When a class declares that it implements an interface, it must implement all of the interface's abstract methods, and in return it can be recognized by the outside world as that type. This lets classes that have little else in common be treated in the same way.

The project explores the course examples built around flying and tracking behavior:

- `FlightEnabled` is an interface with the abstract methods `takeOff()`, `fly()` and `land()`.
- `Trackable` is an interface with the abstract method `track()`.
- `Bird` extends the abstract class `Animal` and implements both interfaces, so it can be described by what it is and what it does.
- `Jet`, `Bird` and `DragonFly` are very different entities, but all can be handled as `FlightEnabled`.
- `OrbitEarth` is an interface that extends `FlightEnabled`.

### Example

```java
public interface FlightEnabled {
    void takeOff();
    void fly();
    void land();
}

public class Bird extends Animal implements FlightEnabled, Trackable {
    // implements move(), takeOff(), fly(), land() and track()
}

FlightEnabled flier = new Bird();
```

## Concepts Practiced

- **Declaring and implementing interfaces:** the `interface` keyword and the `implements` clause
- **Interface vs. abstract class:** a contract enforced by the compiler versus an incomplete class
- **Combining `extends` and `implements`:** a class can extend one class but implement many interfaces
- **Implicit modifiers:** interfaces and their methods are implicitly `abstract` and `public`, and members without an access modifier are public rather than package-private
- **Polymorphism through behavior:** treating one object as several types, and unrelated classes as the same type
- **The `final` modifier:** final methods, fields, classes, variables and parameters
- **Constants:** fields on an interface are always `public`, `static` and `final`, and are named in uppercase
- **Extending interfaces:** an interface can extend multiple interfaces, while `implements` is invalid on an interface
- **Coding to an interface:** using abstracted reference types for variables, parameters and return types, which makes code easier to scale and refactor
- **Trade-offs:** adding an abstract method to an interface breaks every class that implements it

## Credits

Based on the Interfaces lessons from the **Complete Java Masterclass** course.

This README was created with the help of [Claude](https://claude.ai), an AI assistant by Anthropic.