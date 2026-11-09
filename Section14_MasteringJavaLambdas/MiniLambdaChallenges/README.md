# Section 14 - Mastering Java Lambdas

Part of my **Java Masterclass 2025: 130+ Hours of Expert Lessons** course on Udemy. This section covers lambda expressions, functional interfaces and method references, which let Java treat a piece of behavior as a value that can be stored, passed to methods and combined.

## Overview

Before lambdas, passing behavior around meant writing an anonymous class. A lambda expression is a much shorter way to write the same thing. It works with **functional interfaces**, which are interfaces with a single abstract method, and it can be shortened further with **method references** when the lambda only calls an existing method.

The section has seven projects. They start with the basic idea, then practice it in challenges, and end with method references and chaining.

## Projects

| Project | Type | Description |
|---|---|---|
| [`LambdaIntro`](LambdaIntro/) | Lesson | From anonymous classes to lambda expressions, using a `Person` record and a sorted list |
| [`LambdaExpressions`](LambdaExpressions/) | Lesson | Lambda syntax, functional interfaces, `forEach`, `removeIf`, `replaceAll` and `Arrays.setAll` |
| [`MiniLambdaChallenges`](MiniLambdaChallenges/) | Challenge | Seven small tasks that practice creating and using lambdas |
| [`LambdaExpressionChallenge`](LambdaExpressionChallenge/) | Challenge | Transforming an array of names with lambdas, using `Arrays.setAll`, `replaceAll`, `forEach` and `removeIf` |
| [`MethodReferences`](MethodReferences/) | Lesson | The four kinds of method references |
| [`MethodReferenceChallenge`](MethodReferenceChallenge/) | Challenge | A list of functions that mixes lambdas and method references, applied with `String.transform` |
| [`ChainingLambdas`](ChainingLambdas/) | Lesson | Combining `Function`, `Consumer`, `Predicate` and `Comparator` into longer chains |

## Folder Structure

```
Section14_MasteringJavaLambdas/
├── LambdaIntro/
├── LambdaExpressions/
├── MiniLambdaChallenges/
├── LambdaExpressionChallenge/
├── MethodReferences/
├── MethodReferenceChallenge/
└── ChainingLambdas/
```

## Concepts Practiced

### Lambda Expressions
- Replacing an anonymous class with a lambda, and writing both expression and block bodies.
- Using `var` for lambda parameters, and using effectively final variables from the surrounding code.
- Deferred execution: a lambda does nothing until its functional method is called.

```java
// Anonymous class
var comparatorLastName = new Comparator<Person>() {
    @Override
    public int compare(Person o1, Person o2) {
        return o1.lastName().compareTo(o2.lastName());
    }
};

// Lambda
people.sort((o1, o2) -> o1.lastName().compareTo(o2.lastName()));
```

### Functional Interfaces
The standard interfaces from `java.util.function` that appear in the projects:

| Interface | What it does | Functional method |
|---|---|---|
| `Consumer<T>` | Takes a value and returns nothing | `accept` |
| `Supplier<T>` | Takes nothing and returns a value | `get` |
| `Function<T, R>` | Turns one value into another | `apply` |
| `UnaryOperator<T>` | A `Function` whose input and output have the same type | `apply` |
| `BinaryOperator<T>` | Combines two values of the same type into one | `apply` |
| `BiFunction<T, U, R>` | Turns two values into a result | `apply` |
| `Predicate<T>` | Tests a value and returns `true` or `false` | `test` |

Custom functional interfaces can be marked with `@FunctionalInterface`.

### Lambdas with Collections and Arrays
- `forEach`, `removeIf` and `replaceAll` on lists.
- `Arrays.setAll` to fill an array from a lambda.
- Lists backed by arrays, so that a change to the list changes the array.

```java
list.removeIf(s -> s.startsWith("ea"));
list.replaceAll(s -> s.charAt(0) + " - " + s.toUpperCase());
```

### Method References
A method reference is a shorter form of a lambda that only calls one method. Four kinds are covered:

| Kind | Example |
|---|---|
| Static method | `Integer::sum` |
| Instance method of a particular object | `System.out::println` |
| Instance method of an arbitrary object of a type | `String::toUpperCase` |
| Constructor | `PlainOld::new` |

### Chaining
Functional interfaces have default methods that combine lambdas:

```java
Function<String, String> f1 = uCase.andThen(s -> s.concat(" Buchalka"));

Predicate<String> combined = p3.and(p4).negate();

list.sort(Comparator.comparing(Person::lastName)
    .thenComparing(Person::firstName));
```

## Challenges

- **MiniLambdaChallenges** - seven small tasks: convert an anonymous class to a lambda, store a lambda in a variable, run it, pass it to a method, and use a `Supplier`.
- **LambdaExpressionChallenge** - change an array of names step by step: make them uppercase, add a random middle initial, add a reversed last name, and remove the names where the first and last name match.
- **MethodReferenceChallenge** - build a list of `UnaryOperator<String>` transformations, using lambdas and every kind of method reference, and apply them with `String.transform`.

## Skills Gained

`Lambda Expressions` `Functional Interfaces` `Method References` `Function` `Consumer` `Supplier` `Predicate` `UnaryOperator` `BinaryOperator` `Comparator` `Chaining` `Records` `Collections`

## Credits

Based on the Lambda Expressions, Functional Interfaces and Method References section of the **Java Masterclass 2025: 130+ Hours of Expert Lessons** course on Udemy.

This README was created with the help of [Claude](https://claude.ai), an AI assistant by Anthropic.