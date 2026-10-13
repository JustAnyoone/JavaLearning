# Section 12 - Java Generics

Part of my **Java Masterclass 2025: 130+ Hours of Expert Lessons** course on Udemy. This section covers generics in Java: how to write classes that work with many types while the compiler keeps them type safe, and how sorting interfaces such as `Comparable` and `Comparator` fit in.

## Overview

Generics let a class or method work with any type, chosen when the class is used instead of when it is written. The section starts with the basics of generic classes and type parameters, then adds bounded types, a generic class challenge, sorting with `Comparable` and `Comparator`, and a final challenge that combines everything.

## Folder Structure

```
Section12_JavaGenerics/
├── Generics/
├── GenericsExtra/
├── GenericClassChallenger/
├── Comparing/
└── StudentChallenger/
```

| Folder | Type | Topic |
|---|---|---|
| `Generics` | Lesson | Generic classes, type parameters and bounded types |
| `GenericsExtra` | Lesson | Additional generics practice |
| `GenericClassChallenger` | Challenge | Building a generic `Layer` class for map elements |
| `Comparing` | Lesson | Sorting with `Comparable` and `Comparator` |
| `StudentChallenger` | Challenge | Final section challenge with students and a `QueryList` |

## Concepts Practiced

### Generic Classes
- Declaring a class with a type parameter in angle brackets, such as `<T>`.
- Using the type parameter as the type of fields and methods.
- Using generic types such as `ArrayList<String>`, and avoiding raw types.
- Following the naming conventions: `T` for Type, `E` for Element, `K` for Key, `V` for Value and `N` for Number.

```java
public class Team<T extends Player> {
    private List<T> members;
}
```

### Bounded Types
- Setting an upper bound with `extends`, which limits the allowed types to a class, an interface or their subtypes.
- Gaining access to the methods of the bounded type inside the generic class.

### Comparable and Comparator
- Giving a class a natural ordering by implementing `Comparable<T>` and its `compareTo` method.
- Creating custom orderings with `Comparator<T>` and its `compare` method.
- Sorting arrays and lists with and without a `Comparator`.

```java
public interface Comparable<T> {
    int compareTo(T o);
}

public interface Comparator<T> {
    int compare(T o1, T o2);
}
```

## Challenges

- **GenericClassChallenger** - a mapping example where a generic `Layer` class only accepts `Mappable` elements, such as parks (points) and rivers (lines), and renders them with latitude and longitude data.
- **StudentChallenger** - the final challenge of the section, which extends `QueryList` from `ArrayList`, orders students by student id, adds other comparison options, and prints 25 random students sorted in more than one way.

## Skills Gained

`Generics` `Type Parameters` `Bounded Types` `Comparable` `Comparator` `Sorting` `Collections` `Interfaces` `Inheritance`

## Credits

Based on the Generics section of the **Java Masterclass 2025: 130+ Hours of Expert Lessons** course on Udemy.

This README was created with the help of [Claude](https://claude.ai), an AI assistant by Anthropic.