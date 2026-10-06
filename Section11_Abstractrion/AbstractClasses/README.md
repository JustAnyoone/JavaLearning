# Abstract Classes

A Java study project from the **Complete Java Masterclass** course (Abstraction in Java - Abstract Classes), focused on understanding **abstraction** and how **abstract classes** and **abstract methods** work.

## About

Abstraction is about deciding the right level of detail. When talking about one specific item, general terms like "a new pet" are not enough, but when talking about a group, a general term like "animals" is. Abstract classes bring this idea into Java: they describe a general category and define the behavior its subclasses are required to have.

The project explores the Animal example used throughout the course:

- `Animal` is an abstract class with abstract methods such as `move()` and `makeNoise()`.
- `Dog` extends `Animal` and is a concrete class, so it must implement every abstract method.
- `Mammal` is an abstract class that extends `Animal` and adds its own abstract method, `shedHair()`.
- `BestOfBreed` is an abstract class that extends the concrete class `Dog`.

### Example

```java
public abstract class Animal {
    public abstract void move();
    public abstract void makeNoise();
}

public abstract class Mammal extends Animal {
    public abstract void shedHair();
}
```

## Concepts Practiced

- **Abstract classes:** declared with the `abstract` modifier, incomplete by design and impossible to instantiate
- **Abstract methods:** methods with no body that every concrete subclass must implement
- **Constructors in abstract classes:** called by subclasses during their construction
- **Inheritance with abstract classes:** concrete classes extending abstract ones, abstract classes extending abstract ones, and abstract classes extending concrete ones
- **Abstract vs. concrete methods:** inheriting, overriding, and calling the parent's code with `super`, versus being forced to implement a method
- **Partial implementation:** an abstract subclass can implement all, some or none of its parent's abstract methods, and can add new abstract methods
- **Design reasoning:** when to use an abstract class to force targeted implementations and prevent instances of overly general types

## Credits

Based on the Abstract Classes lessons from the **Complete Java Masterclass** course.

This README was created with the help of [Claude](https://claude.ai), an AI assistant by Anthropic.