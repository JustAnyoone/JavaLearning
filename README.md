<div align="center">

# JavaLearning

**My complete journey through the Udemy course *Java Masterclass 2025: 130+ Hours of Expert Lessons***

![Java](https://img.shields.io/badge/Java-100%25-b07219?style=for-the-badge&logo=openjdk&logoColor=white)
![Exercises](https://img.shields.io/badge/Exercises-50-2ea44f?style=for-the-badge)
![Course Hours](https://img.shields.io/badge/Course-135%2B%20hours-a435f0?style=for-the-badge&logo=udemy&logoColor=white)
![Sections](https://img.shields.io/badge/Sections-5%20to%2014-0969da?style=for-the-badge)
![Status](https://img.shields.io/badge/Status-In%20progress-f0883e?style=for-the-badge)

[About](#about) | [Course at a Glance](#course-at-a-glance) | [What I Learned](#what-i-learned) | [Repository Structure](#repository-structure) | [Section Highlights](#section-highlights) | [How to Run](#how-to-run) | [Roadmap](#roadmap) | [Credits](#credits)

</div>

---

## About

This repository contains all the Java code I wrote while following the **Java Masterclass 2025** course on Udemy. It documents my progress from the first lines of Java to object-oriented design, collections, abstraction, generics, nested classes and lambda expressions.

The goal is to build a solid foundation in Java, demonstrate my understanding of the language to future employers, and prepare for frameworks such as Spring, Java EE and Android development.

Each section lives in its own folder, and most sections and projects include their own README that explains the topics and challenges in detail.

## Course at a Glance

| | |
|---|---|
| **Course** | Java Masterclass 2025: 130+ Hours of Expert Lessons |
| **Platform** | Udemy |
| **Lessons** | 135+ hours of expert lessons |
| **Exercises completed** | 50 |
| **Sections in this repository** | 10 (Sections 5 to 14) |
| **Language** | Java (100%) |
| **Java versions covered** | Java 17, plus older versions such as Java 11 and Java 8 |
| **Upcoming in the course** | Java 21 features |

### What the course promises

- Learn the core Java skills needed to apply for Java developer positions.
- Demonstrate an understanding of Java to future employers.
- Acquire the essential Java basics for moving on to the Spring Framework, Java EE, Android development and more.
- Prepare for the Oracle Java Certificate exam, if I choose to take it.
- Learn industry best practices from a professional Java developer with close to 25 years of experience in the language.
- Gain proficiency in Java 17, as well as Java 11 and Java 8.

## What I Learned

| Area | Topics practiced |
|---|---|
| **Java fundamentals** | Java expressions, operators, methods and method overloading |
| **Control flow** | Conditional logic, `switch`, loops and reading user input |
| **Object-oriented programming** | Classes, objects, constructors, inheritance, strings, POJOs and records |
| **Advanced OOP** | Encapsulation, polymorphism and packages |
| **Arrays** | Advanced array handling, array references and varargs |
| **Collections** | `ArrayList`, `LinkedList`, autoboxing and enums |
| **Abstraction** | Abstract classes, abstract methods, interfaces, default and static methods |
| **Generics** | Generic classes, type parameters, bounded types, `Comparable` and `Comparator` |
| **Nested classes** | Static nested, inner, local and anonymous classes |
| **Lambda expressions** | Replacing anonymous classes with lambdas, and sorting with comparators |
| **Best practices** | Clean design choices, coding to an interface, and reasoning about trade-offs |

### Skills at a glance

`Java 17` `OOP` `Inheritance` `Polymorphism` `Encapsulation` `Abstract Classes` `Interfaces` `Records` `Enums` `Generics` `Collections` `ArrayList` `LinkedList` `Comparable` `Comparator` `Nested Classes` `Anonymous Classes` `Lambda Expressions` `UML Class Diagrams` `Text Blocks`

## Repository Structure

```
JavaLearning/
├── HelloWorld.java
├── Exercices/                          # Course exercises
├── Section5_JavaExpressions/
│   └── MethodOverloading/
├── Section6_Conditional/
├── Section7_OOP/
│   ├── ClassesPart1/
│   ├── Inheritance/
│   ├── TheObjectClass/
│   ├── POJOsRecordProject/
│   ├── AllAboutStrings/
│   ├── StringOptions/
│   ├── StringFormatting/
│   └── (challenges)
├── Section8_AdvancedOOP/
│   ├── Encapsulation/
│   ├── Polymorphism/
│   ├── Packages/
│   ├── ComputerFactory/
│   └── (challenges)
├── Section9_AdvancedArrays/
│   ├── UssingArrays/
│   ├── ArrayReferences/
│   ├── MultipleArrays/
│   ├── VarArgs/
│   └── (challenges)
├── Section10_MasteringLists/
│   ├── ArrayAndArrayLists/
│   ├── ArrayLists/
│   ├── Autoboxing/
│   ├── LinkedLists/
│   ├── EnumProject/
│   └── (challenges)
├── Section11_Abstractrion/
│   ├── AbstractClasses/
│   ├── AbstractClassChallenge/
│   ├── Interface/
│   └── InterfaceChallenge/
├── Section12_JavaGenerics/
│   ├── Generics/
│   ├── GenericsExtra/
│   ├── GenericClassChallenger/
│   ├── Comparing/
│   └── StudentChallenger/
├── Section13_NestedClass/
│   ├── NestedClasses/
│   └── LocalClassChallenge/
└── Section14_MasteringJavaLambdas/
    └── LambdaIntro/
```

| Folder | Content |
|---|---|
| `HelloWorld.java` | The very first Java program |
| `Exercices` | The exercises completed along the course |
| [`Section5_JavaExpressions`](Section5_JavaExpressions/) | Java expressions, methods and method overloading |
| [`Section6_Conditional`](Section6_Conditional/) | Conditional statements, `switch`, loops and user input |
| [`Section7_OOP`](Section7_OOP/) | Object-oriented programming, strings, POJOs and records |
| [`Section8_AdvancedOOP`](Section8_AdvancedOOP/) | Encapsulation, polymorphism and packages |
| `Section9_AdvancedArrays` | Advanced arrays and varargs |
| [`Section10_MasteringLists`](Section10_MasteringLists/) | Lists, autoboxing and enums |
| `Section11_Abstractrion` | Abstract classes, interfaces and their challenges |
| [`Section12_JavaGenerics`](Section12_JavaGenerics/) | Generic classes, bounded types and sorting with `Comparable` and `Comparator` |
| [`Section13_NestedClass`](Section13_NestedClass/) | Nested classes, local types and anonymous classes |
| `Section14_MasteringJavaLambdas` | Lambda expressions (in progress) |

## Section Highlights

### Section 11 - Abstraction

This section is split into four parts, two lessons and two challenges.

<details>
<summary><b>AbstractClasses</b> - how abstract classes and abstract methods work</summary>

<br>

Abstraction is about choosing the right level of detail. Abstract classes describe a general category and define the behavior that subclasses are required to have.

- Abstract classes cannot be instantiated, but can have constructors that subclasses call.
- Abstract methods have no body and must be implemented by concrete subclasses.
- Abstract classes can extend other abstract classes, and even concrete classes.
- An abstract subclass can implement all, some or none of its parent's abstract methods.

```java
public abstract class Animal {
    public abstract void move();
    public abstract void makeNoise();
}

public abstract class Mammal extends Animal {
    public abstract void shedHair();
}
```

</details>

<details>
<summary><b>AbstractClassChallenge</b> - a store front for any item for sale</summary>

<br>

A store application built around an abstract `ProductForSale` class.

- `Store` holds the `main` method, manages a list of products and an order, and prints a sales receipt.
- `ProductForSale` has a type, price and description, with concrete `getSalesPrice` and `printPricedItem` methods and an abstract `showDetails` method.
- `OrderItem` is a record with a quantity and a product.
- Two or three product classes extend `ProductForSale`.

</details>

<details>
<summary><b>Interface</b> - contracts between classes and client code</summary>

<br>

An interface is a special type that works as a contract enforced by the compiler, letting classes with little in common be treated as the same type.

- A class can extend one class but implement many interfaces.
- Interface members are implicitly `public`, and interface fields are always `public static final`.
- Interfaces can extend multiple interfaces.
- Coding to an interface makes code easier to scale and refactor.

```java
public class Bird extends Animal implements FlightEnabled, Trackable {
    // implements move(), takeOff(), fly(), land() and track()
}

FlightEnabled flier = new Bird();
```

</details>

<details>
<summary><b>InterfaceChallenge</b> - generating mappable output with the Mappable interface</summary>

<br>

An application that produces GeoJSON-like text for map features, using a `Mappable` interface.

- `Mappable` requires `getLabel()`, `getShape()` and `getMarker()`, and includes a `JSON_PROPERTY` constant, a default `toJSON()` method and a static `mapIt()` method.
- `Building` is drawn as a point and `UtilityLine` is drawn as a line.
- Enums model geometry, colors, markers, building usage and utility types.

Example output:

```
"properties": {"type": "POINT", "label": "Sydney Town Hall (GOVERNMENT)", "marker": "RED STAR", "name": "Sydney Town Hall", "usage": "GOVERNMENT"}
"properties": {"type": "LINE", "label": "College St (FIBER_OPTIC)", "marker": "GREEN DOTTED", "name": "College St", "utility": "FIBER_OPTIC"}
```

</details>

### Section 12 - Java Generics

<details>
<summary><b>Generics</b> - writing reusable, type-safe classes</summary>

<br>

Compares three designs for a sports team that holds different kinds of players: duplicated code, an interface-based design, and a generic `Team<T>` class.

- Generic classes declare a type parameter in angle brackets.
- Naming conventions: `T` for Type, `E` for Element, `K` for Key, `V` for Value, `N` for Number.
- Raw types are supported for backwards compatibility but discouraged, since generics provide compile-time type checking.
- Bounded types use `extends` to set an upper bound on the allowed types.

```java
public class Team<T extends Player> {
    private List<T> members;
}
```

</details>

<details>
<summary><b>GenericClassChallenger</b> - a generic Layer class for map elements</summary>

<br>

A mapping example where a generic `Layer` class only accepts `Mappable` elements, such as parks (points) and rivers (lines), and renders them with latitude and longitude data.

</details>

<details>
<summary><b>Comparing</b> - Comparable vs. Comparator</summary>

<br>

Two interfaces for sorting, which are often confused with each other.

- `Comparable<T>` compares an object with the current instance, through `compareTo`, and defines the natural order of a class.
- `Comparator<T>` compares two objects with each other, through `compare`, and allows custom orderings without changing the class.

</details>

<details>
<summary><b>StudentChallenger</b> - the final challenge of the section</summary>

<br>

Extends a `QueryList` from `ArrayList`, orders students by student id, adds other ways to compare them, and prints 25 random students sorted in more than one way.

</details>

### Section 13 - Nested Classes, Local Types and Anonymous Classes

A class can contain other types in its body. This section covers the four kinds of nested classes in Java.

| Type | Description |
|---|---|
| **Static nested class** | Declared in the class body and accessed through the outer class name |
| **Inner class** | Declared in the class body and only accessible through an instance of the outer class |
| **Local class** | Declared inside a method body |
| **Anonymous class** | An unnamed class, declared and instantiated in the same statement |

<details>
<summary><b>NestedClasses</b> - the four kinds of nested classes</summary>

<br>

- Static nested and inner classes can access the private members of the enclosing class.
- An inner class instance needs an instance of the enclosing class: `outerClass.new InnerClass()`.
- Local classes capture variables from the method, which must be `final` or effectively final.
- Anonymous classes are created in an expression, based on an interface or a superclass.
- Includes the Bill's Burgers challenge, which adds a `Burger` inner class with toppings.

</details>

<details>
<summary><b>LocalClassChallenge</b> - local and anonymous classes with employees</summary>

<br>

Wraps an `Employee` record in a local class with calculated fields, such as full name and years worked, and sorts the result with an anonymous class.

</details>

### Section 14 - Mastering Java Lambdas

<details>
<summary><b>LambdaIntro</b> - from anonymous classes to lambda expressions</summary>

<br>

An introduction to lambda expressions, using a `Person` record and sorting a list of people.

- Sorting with an anonymous `Comparator`, and then with a lambda expression instead.
- Declaring a local interface, `EnhancedComparator`, that extends `Comparator`.
- Sorting by last name first, and by first name when the last names match.

```java
people.sort((o1, o2) -> o1.lastName().compareTo(o2.lastName()));
```

</details>

## How to Run

### Requirements

- **Java Development Kit (JDK) 17** or later. Some examples use text blocks and records, which need Java 15 and 16 or later.
- A terminal, or an IDE such as VS Code, IntelliJ IDEA or Eclipse.

Check your installation:

```bash
java -version
javac -version
```

### 1. Clone the repository

```bash
git clone https://github.com/JustAnyoone/JavaLearning.git
cd JavaLearning
```

### 2. Run the first program

```bash
java HelloWorld.java
```

### 3. Run a project from the terminal

Most projects, from Section 7 onward, follow the VS Code Java layout: the code is in a `src` folder and uses the `dev.lpa` package. Compile all the files and run the class that has the `main` method:

```bash
cd Section14_MasteringJavaLambdas/LambdaIntro
javac -d out $(find src -name "*.java")
java -cp out dev.lpa.Main
```

### 4. Run a single file that declares a package

Some single files, such as the ones in `Section6_Conditional` and `Exercices`, declare a package with the same name as their folder. Compile from the repository root and run with the package name:

```bash
javac -d out Section6_Conditional/SwitchStatement.java
java -cp out Section6_Conditional.SwitchStatement
```

### 5. Run with VS Code

1. Install the **Extension Pack for Java**.
2. Open the repository folder in VS Code.
3. Open any `.java` file and click **Run** above the `main` method.

## Roadmap

- [x] Java fundamentals, expressions and conditionals
- [x] Object-oriented programming and advanced OOP
- [x] Arrays and lists
- [x] Abstraction: abstract classes and interfaces
- [x] Generics
- [x] Nested classes, local types and anonymous classes
- [ ] Lambda expressions (in progress)
- [ ] Continue with the remaining sections of the course
- [ ] Explore the Java 21 features when they are added to the course
- [ ] Move on to the Spring Framework

## Credits

Based on the **Java Masterclass 2025: 130+ Hours of Expert Lessons** course on Udemy. All code in this repository was written by me while following the course.

This README was created with the help of [Claude](https://claude.ai), an AI assistant by Anthropic.
