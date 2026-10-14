# Section 13 - Exploring Nested Classes, Local Types and Anonymous Classes

Part of my **Java Masterclass 2025: 130+ Hours of Expert Lessons** course on Udemy. This section explains how a class can contain other types, and covers the four kinds of nested classes in Java: static nested classes, inner classes, local classes and anonymous classes.

## Overview

A class can hold other types inside its body, such as classes, interfaces, enums and records. These are called nested types, or nested classes. They are useful when classes are tightly coupled, meaning their functionality is interwoven.

The section has two Java projects: one that follows the lessons on each kind of nested class, and one final challenge that combines local and anonymous classes.

## Projects

| Project | Description |
|---|---|
| [`NestedClass`](NestedClass/) | Examples of static nested, inner, local and anonymous classes, plus the Bill's Burgers inner class challenge |
| [`LocalClassChallenge`](LocalClassChallenge/) | Final challenge that uses a local class and an anonymous class with a list of employees |

## Folder Structure

```
Section13_NestedClasses/
├── NestedClass/
└── LocalClassChallenge/
```

## The Four Kinds of Nested Classes

| Type | Description |
|---|---|
| **Static nested class** | Declared in the class body. Much like a static field, it is accessed through the outer class name. |
| **Inner class** | Declared in the class body without `static`. It can only be accessed through an instance of the outer class. |
| **Local class** | Declared inside a method body, so it is only available while that method runs. |
| **Anonymous class** | A class without a name, declared and instantiated in the same statement. |

## Concepts Practiced

### Introduction to Nested Types
- Nesting classes, interfaces, enums and records inside another class.
- Using nested classes when the classes are tightly coupled.
- Java 16 removed an old restriction: before it, only static nested classes could have static methods, and now all four kinds can have static members.

### Static Nested Classes
- Declaring a nested class with `static`, and reaching it through the outer class name.
- A static nested class can access the private attributes of the outer class, and the outer class can access the private attributes of the nested class.

### Inner Classes
- Declaring non-static classes at the member level of an enclosing class, with any of the four access modifiers.
- Accessing the instance members of the enclosing class, including private ones.
- Creating an inner class instance from outside, which needs an instance of the enclosing class first.

```java
EnclosingClass outerClass = new EnclosingClass();
EnclosingClass.InnerClass innerClass = outerClass.new InnerClass();
```

### Local Classes
- Declaring a class directly in a code block, usually a method body.
- Local classes have no access modifiers and exist only while the method runs.
- They can use fields and methods of the enclosing class, and local variables and method arguments that are `final` or effectively final.
- Captured variables: a copy of each variable the class uses is stored with the instance, which is why those variables cannot change.
- Since Java 16, a method can also declare local records, interfaces and enums, which are implicitly static.

```java
class ShowFinal {
    private void doThis(final int methodArgument) {
        final int field30 = 30;
    }
}
```

### Anonymous Classes
- A local class without a name, created as part of an expression instead of a class declaration.
- The type after `new` is the superclass or the interface that the anonymous class implements, not the type of the class itself.
- They are used less since lambda expressions arrived in Java 8, but still fit some cases.
- The statement must end with a semicolon, because it is an expression and not a declaration.

```java
var c4 = new Comparator<StoreEmployee>() { };
var e1 = new Employee() { };
```

## Challenges

- **Bill's Burgers with Inner Classes** - add a `Burger` inner class that is a specialized `Item` with a list of toppings, priced differently, and printed with the burger information.
- **Local and Anonymous Class Challenge** - wrap an `Employee` record in a local class with calculated fields, and sort the result with an anonymous class.

## Skills Gained

`Nested Classes` `Static Nested Classes` `Inner Classes` `Local Classes` `Anonymous Classes` `Captured Variables` `Effectively Final` `Records` `Comparator` `Encapsulation`

## Credits

Based on the Nested Classes and Types section of the **Java Masterclass 2025: 130+ Hours of Expert Lessons** course on Udemy.

This README was created with the help of [Claude](https://claude.ai), an AI assistant by Anthropic.