# Comparable vs. Comparator

A Java study project from the **Complete Java Masterclass** course (Generics - Revisiting Comparable and Comparable vs. Comparator), focused on the two interfaces Java uses for **sorting** and how they differ.

## About

Now that interfaces and generic classes have been covered, this lesson revisits two interfaces used in earlier lectures. Both are generic interfaces that define how objects are compared, and they are often confused with each other.

Calling `Arrays.sort` on an array works out of the box for types like `String`, `Integer` and `Character`, because they implement `Comparable`. For your own classes, you either implement `Comparable` or provide a `Comparator`.

```java
public interface Comparable<T> {
    int compareTo(T o);
}

public interface Comparator<T> {
    int compare(T o1, T o2);
}
```

### How compareTo works

`compareTo` compares one object (`o`) to the current instance (`this`), and the result tells you how they relate:

| Result | Meaning |
|---|---|
| Zero | `o == this` |
| Negative value | `this < o` |
| Positive value | `this > o` |

### Comparable vs. Comparator

| | Comparable | Comparator |
|---|---|---|
| **Method** | `compareTo(T o)` | `compare(T o1, T o2)` |
| **What it compares** | The argument with the current instance | Two arguments of the same type with each other |
| **Called from** | An instance of the class that implements `Comparable` | An instance of `Comparator` |
| **Class requirement** | The class itself must implement it | The class does not need to implement it, though it can |
| **Sorting arrays** | `Arrays.sort(T[] elements)` requires `T` to implement `Comparable` | `Arrays.sort(T[] elements, Comparator<T>)` does not require `T` to implement `Comparable` |
| **Best practice** | `this.compareTo(o) == 0` should make `this.equals(o)` true | A `Comparator` is commonly included as a nested class |

## Concepts Practiced

- **Generic interfaces:** `Comparable<T>` and `Comparator<T>` are parameterized types
- **Natural ordering:** implementing `compareTo` so a class defines its own default sort order
- **Custom ordering:** using a `Comparator` to sort the same type in different ways without changing the class
- **Interpreting compare results:** understanding what zero, negative and positive values mean
- **Sorting arrays:** using `Arrays.sort` with and without a `Comparator`
- **Consistency with `equals`:** keeping `compareTo` and `equals` in agreement
- **Nested classes:** placing a `Comparator` inside the class it compares

## Credits

Based on the Revisiting Comparable and Comparable vs. Comparator lessons from the **Complete Java Masterclass** course.

This README was created with the help of [Claude](https://claude.ai), an AI assistant by Anthropic.