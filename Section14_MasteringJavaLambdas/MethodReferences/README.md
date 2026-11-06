# Method References

A Java project from the **Java Masterclass 2025: 130+ Hours of Expert Lessons** course on Udemy (Section 14 - Mastering Java Lambdas), focused on **method references**, a shorter way to write a lambda expression when the lambda only calls an existing method.

## About

A lambda such as `s -> System.out.println(s)` does nothing except call another method. A method reference replaces it with the shorter `System.out::println`. The `::` operator points to a method or constructor, and Java works out how to match its parameters to the functional interface.

This project shows the four kinds of method references, using lists, generic methods and the standard functional interfaces.

## The Four Kinds of Method References

| Kind | Form | Example in the project |
|---|---|---|
| **Static method** | `ClassName::staticMethod` | `Integer::sum`, `Double::sum` |
| **Instance method of a particular object** | `object::method` | `System.out::println` |
| **Instance method of an arbitrary object of a type** | `ClassName::instanceMethod` | `String::concat`, `String::toUpperCase`, `String::isEmpty` |
| **Constructor** | `ClassName::new` | `PlainOld::new` |

## What the Project Covers

### Replacing lambdas with method references

```java
List<String> list = new ArrayList<>(List.of("Anna", "Bob", "Chuck", "Dave"));

list.forEach(System.out::println);

calculator(Integer::sum, 10, 25);
calculator(Double::sum, 2.5, 7.5);
```

The same operation written as a lambda and as a method reference:

```java
calculator((s1, s2) -> s1.concat(s2), "Hello ", "World");
calculator(String::concat, "Hello ", "World");
```

### Constructor references
- `PlainOld::new` is used as a `Supplier<PlainOld>`, so each call to `get()` creates a new object.
- A `seedArray` method takes that `Supplier` and fills an array with new objects through `Arrays.setAll`.

```java
Supplier<PlainOld> reference1 = PlainOld::new;
PlainOld newPojo = reference1.get();

PlainOld[] pojo1 = seedArray(PlainOld::new, 10);
```

### One method reference, several functional interfaces
The same method reference can fit different functional interfaces. `String::concat` works as a `BinaryOperator<String>` and as a `BiFunction<String, String, String>`, and `String::toUpperCase` works as a `UnaryOperator<String>`.

```java
BinaryOperator<String> b1 = String::concat;
BiFunction<String, String, String> b2 = String::concat;
UnaryOperator<String> u1 = String::toUpperCase;
```

### Chaining with `transform`
The `String.transform` method applies a function to a string and returns the result, which works well with method references.

```java
String result = "Hello".transform(u1);
result = result.transform(String::toLowerCase);

Function<String, Boolean> f0 = String::isEmpty;
boolean resultBoolean = result.transform(f0);
```

## Example Output

```
Anna
Bob
Chuck
Dave
Result of operation: 35
Result of operation: 10.0
Creating a PlainOld object = 1
Getting array
Creating a PlainOld object = 2
...
Result of operation: Hello World
Result of operation: Hello World
Hello World
Hello World
HELLO 
Result + HELLO
Result + hello
Result + false
```

## Concepts Practiced

- **Method references:** the `::` operator, as a shorter form of a lambda
- **The four kinds:** static, particular object, arbitrary object and constructor references
- **Functional interfaces:** `Supplier`, `Function`, `BiFunction`, `BinaryOperator` and `UnaryOperator`
- **Generic methods:** a `calculator` method that works with any type, driven by a method reference
- **Constructor references and factories:** creating objects through a `Supplier`
- **`Arrays.setAll`:** filling an array from a lambda or a method reference
- **`String.transform`:** applying a function to a string, available since Java 12

## Project Structure

```
MethodReferences/
└── src/
    └── dev/lpa/
        └── Main.java    # Examples of every kind of method reference
```

## Credits

Based on the Method References lessons from the **Java Masterclass 2025: 130+ Hours of Expert Lessons** course on Udemy.

This README was created with the help of [Claude](https://claude.ai), an AI assistant by Anthropic.