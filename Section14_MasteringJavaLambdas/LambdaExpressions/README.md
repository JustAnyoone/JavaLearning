<<<<<<< HEAD
## Getting Started

Welcome to the VS Code Java world. Here is a guideline to help you get started to write Java code in Visual Studio Code.

## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

> If you want to customize the folder structure, open `.vscode/settings.json` and update the related settings there.

## Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).
=======
# Lambda Expressions

A Java project from the **Java Masterclass 2025: 130+ Hours of Expert Lessons** course on Udemy (Section 14 - Mastering Java Lambdas), focused on writing and using **lambda expressions** with functional interfaces and the Java collections.

## About

A lambda expression is a short way to write the code of a method that is passed around as a value. Lambdas work with **functional interfaces**, which are interfaces with a single abstract method. This project shows how lambdas replace longer anonymous classes, and how they are used with lists, arrays and generic methods.

## What the Project Covers

### Lambda syntax
- Lambdas with a single expression, and with a block body in curly braces.
- Using `var` for lambda parameters.
- Using a variable from the surrounding code, which must be effectively final.

```java
List<String> list = new ArrayList<>(List.of("alpha", "bravo", "charlie", "delta"));

list.forEach((var myString) -> System.out.println(myString));

String prefix = "nato";
list.forEach((var myString) -> {
    char first = myString.charAt(0);
    System.out.println(prefix + " " + myString + " means " + first);
});
```

### Functional interfaces
- A custom interface marked with `@FunctionalInterface`, with one abstract method.
- Built-in functional interfaces from `java.util.function`: `BinaryOperator`, `BiConsumer` and `Supplier`.

```java
@FunctionalInterface
public interface Operation<T> {
    T operate(T value1, T value2);
}
```

### Generic methods that take lambdas
- A `calculator` method that applies any operation to two values of the same type, so the same method adds integers, divides doubles and joins strings.
- A `processPoint` method that passes a latitude and longitude to a `BiConsumer`.
- A `randomlySelectedValues` method that gets its index values from a `Supplier`.

```java
int result = calculator((var a, var b) -> a + b, 5, 2);
var result2 = calculator((a, b) -> a / b, 10.0, 2.5);
var result3 = calculator(
    (a, b) -> a.toUpperCase() + " " + b.toUpperCase(),
    "Ralph", "Kramden");
```

### Lambdas with collections and arrays
- `forEach` to run code on every element of a list.
- `removeIf` to remove the elements that match a condition.
- `replaceAll` to transform every element of a list.
- `Arrays.setAll` to fill an array from a lambda that receives each index, including a `switch` expression inside the lambda.

```java
list.removeIf(s -> s.startsWith("ea"));
list.replaceAll(s -> s.charAt(0) + " - " + s.toUpperCase());

Arrays.setAll(emptyStrings, (i) -> "" + (i + 1) + ". "
    + switch (i) {
        case 0 -> "one";
        case 1 -> "two";
        case 2 -> "three";
        default -> "";
    });
```

## Example Output

```
nato alpha means a
nato bravo means b
Result of operation: 7
Result of operation: 4.0
Result of operation: RALPH KRAMDEN
[lat:47.216 lon:-95.235]
a - ALPHA
c - CHARLIE
[1. one, 2. two, 3. three, 4. , 5. , 6. , 7. , 8. , 9. , 10. ]
```

## Concepts Practiced

- **Lambda expressions:** expression and block bodies, and `var` parameters
- **Functional interfaces:** `@FunctionalInterface`, `BinaryOperator`, `BiConsumer` and `Supplier`
- **Effectively final variables:** using outside variables inside a lambda
- **Generic methods:** one method that works with many types, driven by a lambda
- **Collection methods:** `forEach`, `removeIf` and `replaceAll`
- **Array helpers:** `Arrays.setAll` and `Arrays.fill`
- **Switch expressions:** used inside a lambda
- **Replacing anonymous classes:** shorter code for the same behavior

## Project Structure

```
LambdaExpressions/
└── src/
    └── dev/lpa/
        ├── Main.java        # Examples of lambdas, lists and arrays
        └── Operation.java   # A custom functional interface
```

## Credits

Based on the Lambda Expressions lessons from the **Java Masterclass 2025: 130+ Hours of Expert Lessons** course on Udemy.

This README was created with the help of [Claude](https://claude.ai), an AI assistant by Anthropic.
>>>>>>> 971a6ad90e71a14f557fa318ab6d1c7988b2fbc2
