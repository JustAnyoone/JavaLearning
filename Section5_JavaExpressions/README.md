# Section 5 - Java Expressions

Part of my **Java Masterclass 2025: 130+ Hours of Expert Lessons** course on Udemy. This section covers the building blocks of Java programs: expressions, statements and methods, including how to reuse code with methods and method overloading.

## Overview

Expressions and statements are how a Java program calculates values and performs actions. In this section I learned how to write them, and how to organize code into methods so it can be reused instead of repeated. It also covers method overloading, which lets several methods share the same name, and includes challenges to practice each topic.

## Folder Structure

```
Section5_JavaExpressions/
├── MethodOverloading/
├── MainChallenger.java
└── MethodChallenger.java
```

| Item | Type | Topic |
|---|---|---|
| `MethodOverloading` | Lesson | Methods with the same name and different parameters |
| `MainChallenger.java` | Challenge | Practice with the `main` method |
| `MethodChallenger.java` | Challenge | Practice with methods |

## Concepts Practiced

### Expressions and Statements
- Building expressions from values, variables and operators.
- Writing statements that perform actions in a program.
- Grouping statements into code blocks.

### Methods
- Declaring methods with parameters and return values.
- Calling methods to reuse code and keep programs organized.
- Understanding the `main` method as the entry point of a Java program.

```java
public static int add(int a, int b) {
    return a + b;
}
```

### Method Overloading
- Declaring several methods with the same name but different parameter lists.
- Letting Java choose the correct method based on the arguments passed in.

```java
public static int multiply(int a, int b) {
    return a * b;
}

public static double multiply(double a, double b) {
    return a * b;
}
```

## Challenges

The challenges check that I can apply the lessons on my own:

- **MainChallenger** - applying what I learned with the `main` method.
- **MethodChallenger** - applying what I learned about methods.

## Skills Gained

`Expressions` `Statements` `Code Blocks` `Methods` `Method Overloading` `Return Values` `Parameters` `Problem Solving`

## Credits

Based on the Java Expressions section of the **Java Masterclass 2025: 130+ Hours of Expert Lessons** course on Udemy.

This README was created with the help of [Claude](https://claude.ai), an AI assistant by Anthropic.