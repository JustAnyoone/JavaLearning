# Collections Overview

A Java project from the **Java Masterclass 2025: 130+ Hours of Expert Lessons** course on Udemy (Section 15 - Collections Framework: Lists, Sets and Maps), which introduces the **Java Collections Framework** and the `Collection` interface that sits at the top of most of it.

## About

The Java Collections Framework is a set of interfaces and classes for storing and working with groups of objects. Most of it is built around the `Collection` interface, which defines the methods that every collection shares, such as adding, removing and searching for elements. More specific interfaces build on it:

| Interface | Idea | Example class |
|---|---|---|
| `List` | An ordered collection that allows duplicates | `ArrayList`, `LinkedList` |
| `Set` | A collection with no duplicate elements | `HashSet`, `TreeSet` |
| `Queue` | A collection used for processing elements in order | `LinkedList`, `ArrayDeque` |

`Map` stores key and value pairs. It is part of the framework, but it doesn't extend `Collection`.

This project uses the `Collection` interface directly, with a `TreeSet` behind it, to show which operations are shared by all collections.

## What the Project Covers

- **Coding to the interface:** the variable is declared as `Collection<String>`, and the object is a `TreeSet<String>`. Only the methods of `Collection` can be used through that variable.
- **Adding elements:** `add` for one element and `addAll` for several, here with `Arrays.asList`.
- **Searching:** `contains` checks whether an element is in the collection.
- **Removing elements with a condition:** `removeIf` takes a lambda and removes every element that matches.
- **Natural ordering:** a `TreeSet` keeps its elements sorted, so the output is in alphabetical order even though the names were added in groups.

```java
Collection<String> list = new TreeSet<>();

String[] names = {"Anna", "Bob", "Carol", "David", "Edna"};
list.addAll(Arrays.asList(names));

list.add("Fred");
list.addAll(Arrays.asList("George", "Gary", "Grace"));
System.out.println("Gary is in the list? " + list.contains("Gary"));

list.removeIf(s -> s.charAt(0) == 'G');
```

### A limit of the interface
The last line of the code, `list.sort()`, is commented out. A `Collection` has no `sort` method, because sorting only makes sense for a `List`. The `TreeSet` is already sorted, but the `Collection` type doesn't expose a way to sort it.

## Example Output

```
[Anna, Bob, Carol, David, Edna]
[Anna, Bob, Carol, David, Edna, Fred, Gary, George, Grace]
Gary is in the list? true
[Anna, Bob, Carol, David, Edna, Fred]
Gary is in the list? false
```

## Concepts Practiced

- **The Collections Framework:** the main interfaces and how they relate
- **The `Collection` interface:** the methods shared by lists, sets and queues
- **Coding to an interface:** using an interface type for the variable and a class for the object
- **`TreeSet`:** a set that keeps its elements in sorted order and ignores duplicates
- **`addAll` and `Arrays.asList`:** adding several elements at once
- **`removeIf` with a lambda:** removing elements that match a condition
- **`contains`:** checking if an element is present

## Project Structure

```
CollectionsOverview/
└── src/
    └── dev/lpa/
        └── Main.java    # Using the Collection interface with a TreeSet
```

## Credits

Based on the Collections Overview lesson from the **Java Masterclass 2025: 130+ Hours of Expert Lessons** course on Udemy.

This README was created with the help of [Claude](https://claude.ai), an AI assistant by Anthropic.