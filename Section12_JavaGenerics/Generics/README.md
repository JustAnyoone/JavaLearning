# Generics in Java

A Java study project from the **Complete Java Masterclass** course (Generics), focused on understanding how **generic classes** work and why they are a better design than duplicated code or loosely typed collections.

## About

Java supports generic types (classes, records and interfaces) as well as generic methods. A generic class declares a type parameter in angle brackets, such as `<T>`, which is a placeholder for a type that is specified later when the class is used.

The project follows a sports team example from the course, comparing three ways to design a team that can hold different kinds of players:

1. **Duplicated code:** copy `BaseballTeam` into a `FootballTeam`, with a separate player class for each. Every change has to be repeated in both places.
2. **Interface or abstract class:** a single `Team` with a list of `Player` objects, where `BaseballPlayer` and `FootballPlayer` implement the `Player` interface. Better, but it still has problems.
3. **Generics:** a single `Team<T>` class that works with any player type, with an upper bound to keep it restricted to valid players.

### Example

```java
// Generic class with an upper bound
public class Team<T extends Player> {
    private List<T> members;
}

// Using a generic type as a reference type
List<String> listOfString = new ArrayList<>();
```

## Concepts Practiced

- **Generic classes:** declaring a type parameter in angle brackets and using it as the type of fields and methods
- **Using generic types:** parameterized reference types such as `ArrayList<String>`
- **Type parameter conventions:** `T` for Type, `E` for Element, `K` for Key, `V` for Value, `N` for Number, and `S`, `U`, `V` for second, third and fourth types
- **Multiple type parameters:** declaring classes with more than one type, such as `<T, S, U>`
- **Raw types:** using a generic class without a type parameter, which is supported for backwards compatibility but discouraged
- **Compile-time type safety:** letting the compiler check types, removing the need for manual checks and casting from `Object`
- **Bounded types:** using `extends` to set an upper bound, limiting the allowed types to a given class, interface or their subtypes
- **Access to bounded functionality:** an upper bound gives the generic code access to the methods of the bounded type
- **Design trade-offs:** comparing duplicated code, interface-based design and generics

## Credits

Based on the Generics lessons from the **Complete Java Masterclass** course.

This README was created with the help of [Claude](https://claude.ai), an AI assistant by Anthropic.