<div align="center">

# JavaLearning

**My complete journey through the Udemy course *Java Masterclass 2025: 130+ Hours of Expert Lessons***

![Java](https://img.shields.io/badge/Java-100%25-b07219?style=for-the-badge&logo=openjdk&logoColor=white)
![Exercises](https://img.shields.io/badge/Exercises-50-2ea44f?style=for-the-badge)
![Course Hours](https://img.shields.io/badge/Course-135%2B%20hours-a435f0?style=for-the-badge&logo=udemy&logoColor=white)
![Sections](https://img.shields.io/badge/Sections-5%20to%2012-0969da?style=for-the-badge)
![Status](https://img.shields.io/badge/Status-In%20progress-f0883e?style=for-the-badge)

[About](#about) | [Course at a Glance](#course-at-a-glance) | [What I Learned](#what-i-learned) | [Repository Structure](#repository-structure) | [Section Highlights](#section-highlights) | [How to Run](#how-to-run) | [Credits](#credits)

</div>

---

## About

This repository contains all the Java code I wrote while following the **Java Masterclass 2025** course on Udemy. It documents my progress from the first lines of Java to object-oriented design, collections, abstraction and generics.

The goal is to build a solid foundation in Java, demonstrate my understanding of the language to future employers, and prepare for frameworks such as Spring, Java EE and Android development.

Each section lives in its own folder, and the more advanced sections include their own README that explains the topics and challenges in detail.

## Course at a Glance

| | |
|---|---|
| **Course** | Java Masterclass 2025: 130+ Hours of Expert Lessons |
| **Platform** | Udemy |
| **Lessons** | 135+ hours of expert lessons |
| **Exercises completed** | 50 |
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
| **Java fundamentals** | Java expressions, operators, and the basic building blocks of the language |
| **Control flow** | Conditional logic and decision making |
| **Object-oriented programming** | Classes, objects, encapsulation, inheritance and polymorphism |
| **Advanced OOP** | Deeper OOP concepts and class design |
| **Arrays** | Advanced array handling |
| **Collections** | Mastering lists and the Java Collections Framework |
| **Abstraction** | Abstract classes, abstract methods, interfaces, default and static methods |
| **Generics** | Generic classes, type parameters, raw types and bounded types |
| **Best practices** | Clean design choices, coding to an interface, and reasoning about trade-offs |

### Skills at a glance

`Java 17` `OOP` `Inheritance` `Polymorphism` `Abstract Classes` `Interfaces` `Records` `Enums` `Generics` `Collections` `ArrayList` `UML Class Diagrams` `Text Blocks`

## Repository Structure

```
JavaLearning/
├── HelloWorld.java
├── Exercices/                          # Course exercises
├── Section5_JavaExpressions/
├── Section6_Conditional/
├── Section7_OOP/
├── Section8_AdvancedOOP/
├── Section9_AdvancedArrays/
├── Section10_MasteringLists/
├── Section11_Abstractrion/
│   ├── AbstractClasses/
│   ├── AbstractClassChallenge/
│   ├── Interface/
│   └── InterfaceChallenge/
└── Section12_JavaGenerics/
    └── Generics/
```

| Folder | Content |
|---|---|
| `HelloWorld.java` | The very first Java program |
| `Exercices` | The exercises completed along the course |
| `Section5_JavaExpressions` | Java expressions and operators |
| `Section6_Conditional` | Conditional statements |
| `Section7_OOP` | Object-oriented programming |
| `Section8_AdvancedOOP` | Advanced object-oriented programming |
| `Section9_AdvancedArrays` | Advanced arrays |
| `Section10_MasteringLists` | Working with lists |
| `Section11_Abstractrion` | Abstract classes, interfaces and their challenges |
| `Section12_JavaGenerics` | Generic classes and bounded types |

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

### 2. Run a single file

For a file that contains a `main` method and no package declaration:

```bash
java HelloWorld.java
```

### 3. Compile and run a section

If a section has several classes, compile them together and run the class that contains `main`:

```bash
cd Section11_Abstractrion/InterfaceChallenge
javac *.java
java Main
```

Replace `Main` with the name of the class that has the `main` method. If the files declare a `package`, compile from the project root and run with the full package name, for example `java com.example.Main`.

### 4. Run with VS Code

1. Install the **Extension Pack for Java**.
2. Open the repository folder in VS Code.
3. Open any `.java` file and click **Run** above the `main` method.

## Roadmap

- [x] Java fundamentals, expressions and conditionals
- [x] Object-oriented programming and advanced OOP
- [x] Arrays and lists
- [x] Abstraction: abstract classes and interfaces
- [x] Generics
- [ ] Continue with the remaining sections of the course
- [ ] Explore the Java 21 features when they are added to the course
- [ ] Move on to the Spring Framework

## Credits

Based on the **Java Masterclass 2025: 130+ Hours of Expert Lessons** course on Udemy. All code in this repository was written by me while following the course.

This README was created with the help of [Claude](https://claude.ai), an AI assistant by Anthropic.
