# Section 7 - OOP

Part of my **Java Masterclass 2025: 130+ Hours of Expert Lessons** course on Udemy. This section introduces object-oriented programming in Java, from classes and constructors to inheritance, POJOs and records, and also covers working with strings.

## Overview

This is where Java's object-oriented foundations are built. The section teaches how to model real things as classes and objects, how to reuse code through inheritance, and how every class relates to the `Object` class. It also covers strings in depth, including how to format text for output. Challenges after the main topics check that the concepts stick.

## Folder Structure

```
Section7_OOP/
├── ClassesPart1/
├── ChallengeConstructor/
├── Inheritance/
├── ChallengeInheritance/
├── TheObjectClass/
├── POJOsRecordProject/
├── ChallegeObjectOrientered/
├── AllAboutStrings/
├── StringOptions/
└── StringFormatting/
```

| Folder | Type | Topic |
|---|---|---|
| `ClassesPart1` | Lesson | Classes, objects, fields and methods |
| `ChallengeConstructor` | Challenge | Practice with constructors |
| `Inheritance` | Lesson | Extending classes and reusing code |
| `ChallengeInheritance` | Challenge | Practice with inheritance |
| `TheObjectClass` | Lesson | The `Object` class and the methods every class inherits |
| `POJOsRecordProject` | Project | POJOs and records |
| `ChallegeObjectOrientered` | Challenge | Practice with object-oriented design |
| `AllAboutStrings` | Lesson | Working with `String` |
| `StringOptions` | Lesson | More ways of working with strings |
| `StringFormatting` | Lesson | Formatting text for output |

## Concepts Practiced

### Classes and Objects
- Declaring classes with fields and methods, and creating objects from them.
- Using constructors to initialize objects, including multiple constructors in one class.
- Using `this` to refer to the current object.

```java
public class Car {
    private String make;
    private int year;

    public Car(String make, int year) {
        this.make = make;
        this.year = year;
    }
}
```

### Inheritance
- Extending a class with `extends` to reuse and specialize behavior.
- Calling the parent's constructor and methods with `super`.
- Overriding methods in a subclass.

```java
public class Dog extends Animal {
    @Override
    public void makeNoise() {
        System.out.println("Woof!");
    }
}
```

### The Object Class
- Understanding that every class in Java inherits from `Object`.
- Overriding methods such as `toString()`, `equals()` and `hashCode()`.

### POJOs and Records
- Writing plain old Java objects (POJOs) with private fields, constructors, getters and setters.
- Using records as a concise way to declare simple data classes.

```java
public record Student(String name, int age) { }
```

### Strings
- Working with `String` and its common methods.
- Understanding that strings are immutable.
- Formatting text for output with `String.format()`, `printf()` and `formatted()`.

```java
String message = "Hello, %s! You are %d years old.".formatted("Ana", 30);
```

## Challenges

Challenges after the main topics make sure I can apply the lessons on my own:

- **ChallengeConstructor** - applying constructors.
- **ChallengeInheritance** - applying inheritance.
- **ChallegeObjectOrientered** - applying object-oriented design.

## Skills Gained

`OOP` `Classes` `Objects` `Constructors` `Inheritance` `Method Overriding` `Object Class` `POJOs` `Records` `Strings` `String Formatting`

## Credits

Based on the OOP section of the **Java Masterclass 2025: 130+ Hours of Expert Lessons** course on Udemy.

This README was created with the help of [Claude](https://claude.ai), an AI assistant by Anthropic.