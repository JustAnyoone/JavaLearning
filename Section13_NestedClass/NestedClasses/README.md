# NestedClass Project

A Java project from the **Java Masterclass 2025: 130+ Hours of Expert Lessons** course on Udemy (Section 13 - Nested Classes and Types), focused on the four kinds of nested classes in Java and on using inner classes in a small restaurant example.

## About

A class can contain other types inside its body, such as classes, interfaces, enums and records. This project practices each kind of nested class and then applies inner classes in the Bill's Burgers challenge.

| Type | Description |
|---|---|
| **Static nested class** | Declared in the class body and accessed through the outer class name, like a static field |
| **Inner class** | Declared in the class body and only accessible through an instance of the outer class |
| **Local class** | Declared inside a method body |
| **Anonymous class** | An unnamed class, declared and instantiated in the same statement |

## What the Project Covers

- **Static nested classes:** declared with `static`, accessed through the outer class name, with access to the outer class's private attributes (and the other way around).
- **Inner classes:** non-static member classes with any access modifier, and access to the enclosing class's instance members, including private ones.
- **Local classes:** classes declared inside a method, with access to the enclosing class and to `final` or effectively final variables and arguments.
- **Anonymous classes:** unnamed classes created in an expression, based on an interface or a superclass.

```java
// Creating an inner class instance from outside the enclosing class
EnclosingClass outerClass = new EnclosingClass();
EnclosingClass.InnerClass innerClass = outerClass.new InnerClass();

// An anonymous class based on an interface
var c4 = new Comparator<StoreEmployee>() { };
```

## The Challenge: Bill's Burgers with Inner Classes

Extending the Bill's Burgers example, the challenge is to create another inner class called `Burger`:

- `Burger` is a specialized `Item`, and includes a list of toppings, which are also `Item` objects. Items have a name, type, price and methods to convert prices.
- A user adds toppings through the `Meal` class, which delegates them to its burger.
- Toppings are added with a method that takes a variable number of `String` values, one for each topping selected.
- Toppings can be priced differently: some are free and some have an additional cost.
- The toppings are printed along with the burger information.

## Concepts Practiced

- **Nested classes:** static nested, inner, local and anonymous classes
- **Access to private members:** how nested and enclosing classes can reach each other's private attributes
- **Creating inner class instances:** using `outerInstance.new InnerClass()`
- **Captured variables:** why local classes need `final` or effectively final variables
- **Local records, interfaces and enums:** available since Java 16
- **Static members in nested classes:** allowed in all four kinds since Java 16
- **Delegation:** the `Meal` class passes work to its `Burger`
- **Varargs:** adding any number of toppings in a single method call
- **Inheritance:** `Burger` as a specialized `Item`

## Credits

Based on the Nested Classes and Types lessons (Introduction, Static Nested Classes, Inner Classes, Inner Classes Challenge, Local Classes and Anonymous Classes) from the **Java Masterclass 2025: 130+ Hours of Expert Lessons** course on Udemy.

This README was created with the help of [Claude](https://claude.ai), an AI assistant by Anthropic.