# Chaining Lambdas

A Java project from the **Java Masterclass 2025: 130+ Hours of Expert Lessons** course on Udemy (Section 14 - Mastering Java Lambdas), focused on **chaining** lambda expressions: combining small functions, consumers, predicates and comparators into longer ones.

## About

Many of the functional interfaces in `java.util.function` come with default methods that return a new, combined version of the lambda. This lets a complex operation be built from simple steps, and read from left to right, without writing a new method for each combination.

This project shows chaining with four kinds of lambdas: `Function`, `Consumer`, `Predicate` and `Comparator`.

## What the Project Covers

### Chaining Functions: `andThen` and `compose`
- `andThen` runs the first function, and then the second one.
- `compose` runs the argument function first, and then the one it was called on, so the order is reversed.
- Several `andThen` calls can be chained, and each step can change the type, for example from `String` to `String[]` to `Integer`.

```java
Function<String, String> uCase = String::toUpperCase;
Function<String, String> lastName = s -> s.concat(" Buchalka");

Function<String, String> uCaseLastName = uCase.andThen(lastName);    // TIM Buchalka
uCaseLastName = uCase.compose(lastName);                              // TIM BUCHALKA

Function<String, Integer> f2 = uCase
    .andThen(s -> s.concat(" Buchalka"))
    .andThen(s -> s.split(" "))
    .andThen(s -> String.join(", ", s))
    .andThen(String::length);                                         // 13
```

### Chaining Consumers: `andThen`
A `Consumer` returns nothing, so chaining runs the consumers one after another on the same value.

```java
Consumer<String> s0 = s -> System.out.print(s.charAt(0));
Consumer<String> s1 = System.out::println;

Arrays.asList(names).forEach(s0
    .andThen(s -> System.out.print(" - "))
    .andThen(s1));
```

### Combining Predicates: `and`, `or` and `negate`
Predicates return `true` or `false`, so they can be combined with logical operators.

```java
Predicate<String> p1 = s -> s.equals("TIM");
Predicate<String> p2 = s -> s.equalsIgnoreCase("Tim");
Predicate<String> p3 = s -> s.startsWith("T");
Predicate<String> p4 = s -> s.endsWith("e");

Predicate<String> combined1 = p1.or(p2);
Predicate<String> combined2 = p3.and(p4);
Predicate<String> combined3 = p3.and(p4).negate();
```

### Chaining Comparators: `comparing`, `thenComparing` and `reversed`
A `Person` record is sorted in four ways, from a plain lambda to a chain of method references.

```java
record Person(String firstName, String lastName) {}

list.sort((o1, o2) -> o1.lastName.compareTo(o2.lastName));

list.sort(Comparator.comparing(Person::lastName));

list.sort(Comparator.comparing(Person::lastName)
    .thenComparing(Person::firstName));

list.sort(Comparator.comparing(Person::lastName)
    .thenComparing(Person::firstName).reversed());
```

## Example Output

```
TIM
TIM Buchalka
TIM BUCHALKA
[TIM, Buchalka]
BUCHALKA, TIM
13
A - Ann
B - Bob
C - Carol
combined1 = true
combined2 = false
combined3 = true
```

The sorting results for the four comparators:

| Comparator | Order of the result |
|---|---|
| Last name only | Minnie Mouse, Mickey Mouse, Peter Pan, Peter PumpkinEater |
| `comparing(...)` with a method reference | Same as above (people with the same last name keep their original order) |
| Last name, then first name | Mickey Mouse, Minnie Mouse, Peter Pan, Peter PumpkinEater |
| Last name, then first name, `reversed()` | Peter PumpkinEater, Peter Pan, Minnie Mouse, Mickey Mouse |

## Concepts Practiced

- **Function chaining:** `andThen` and `compose`, and the difference in order between them
- **Changing types along a chain:** `String` to `String[]` to `String` and `Integer`
- **Consumer chaining:** running several actions on the same value
- **Predicate combinations:** `and`, `or` and `negate`
- **Comparator chaining:** `Comparator.comparing`, `thenComparing` and `reversed`
- **Method references:** `String::toUpperCase`, `System.out::println`, `Person::lastName`
- **Local records:** a `Person` record declared inside a method
- **Default methods on interfaces:** how the functional interfaces provide the chaining methods

## Project Structure

```
ChainingLambdas/
└── src/
    └── dev/lpa/
        └── Main.java    # Chaining examples for Function, Consumer, Predicate and Comparator
```

## Credits

Based on the Chaining Lambdas lesson from the **Java Masterclass 2025: 130+ Hours of Expert Lessons** course on Udemy.

This README was created with the help of [Claude](https://claude.ai), an AI assistant by Anthropic.