# Section 15 - Collections Framework: Lists, Sets and Maps

Part of my **Java Masterclass 2025: 130+ Hours of Expert Lessons** course on Udemy. This section introduces the **Java Collections Framework**, the set of interfaces and classes that Java provides for storing and working with groups of objects.

> **Status:** in progress. The two projects below cover the `Collection` interface and the `Collections` utility class. Sets and maps will be added as the course continues.

## Overview

Earlier sections used arrays, `ArrayList` and `LinkedList` on their own. This section steps back and looks at how they fit together. Most of the framework is built around the `Collection` interface, which defines the methods that every collection shares. More specific interfaces build on it:

| Interface | Idea | Example class |
|---|---|---|
| `List` | An ordered collection that allows duplicates | `ArrayList`, `LinkedList` |
| `Set` | A collection with no duplicate elements | `HashSet`, `TreeSet` |
| `Queue` | A collection used for processing elements in order | `LinkedList`, `ArrayDeque` |

`Map` stores key and value pairs. It is part of the framework, but it doesn't extend `Collection`.

The section then moves from theory to practice: a small lesson on the `Collection` interface, followed by a larger project that uses a deck of cards to try out the `Collections` utility methods and build a poker game.

## Projects

| Project | Type | Description |
|---|---|---|
| [`CollectionsOverview`](CollectionsOverview/) | Lesson | Using the `Collection` interface with a `TreeSet`: `addAll`, `contains` and `removeIf` |
| [`CollectionsMethods`](CollectionsMethods/) | Lesson and challenge | The `Collections` utility methods on a card deck, and a five card draw poker game |

## Folder Structure

```
Section15_Framework_List_Sets_Maps/
├── CollectionsOverview/
│   └── src/dev/lpa/Main.java
└── CollectionsMethods/
    └── src/dev/lpa/
        ├── Card.java
        ├── Main.java
        └── games/
            ├── GameController.java
            └── poker/
                ├── PokerGame.java
                ├── PokerHand.java
                └── Ranking.java
```

## Concepts Practiced

### The Collection Interface
- Declaring a variable with the interface type, `Collection<String>`, and creating the object with a class, `new TreeSet<>()`. This is coding to an interface.
- The methods shared by every collection: `add`, `addAll`, `contains` and `removeIf`.
- A limit of the interface: a `Collection` has no `sort()` method, because sorting only makes sense for a `List`.

```java
Collection<String> list = new TreeSet<>();
list.addAll(Arrays.asList("Anna", "Bob", "Carol", "David", "Edna"));
list.removeIf(s -> s.charAt(0) == 'G');
```

### TreeSet
- A set that keeps its elements in sorted order and ignores duplicates.

### The Collections Utility Class
Helper methods that work on lists and other collections:

| Method | What it does |
|---|---|
| `Collections.shuffle` | Puts the elements in random order |
| `Collections.reverse` | Reverses the order |
| `Collections.sort` / `List.sort` | Sorts with a `Comparator` |
| `Collections.nCopies` | Creates an immutable list with `n` copies of an element |
| `Collections.fill` | Replaces every existing element of a list |
| `Collections.addAll` | Adds several elements to a collection |
| `Collections.copy` | Copies a list over the start of another list |
| `Collections.indexOfSubList` | Finds where a sublist starts |
| `Collections.disjoint` | Checks that two collections share nothing |
| `Collections.binarySearch` | Finds an element in a sorted list |
| `Collections.replaceAll` | Replaces one value with another |
| `Collections.frequency` | Counts how many times an element appears |

Related list features used along the way: `subList` views, `containsAll` and `List.copyOf`.

### Putting It Together: a Poker Game
The challenge of the section deals a five card draw game and ranks every hand.

- A `Card` record models a standard 52 card deck.
- `Ranking` is an enum with the possible hands, from no combination up to four of a kind.
- A `Consumer` chained with `andThen` evaluates each hand and prints it, which reuses the lambda concepts from Section 14.

```java
Consumer<PokerHand> checkHand = PokerHand::evalHand;
pokerHands.forEach(checkHand.andThen(System.out::println));
```

## Skills at a Glance

`Collections Framework` `Collection` `List` `Set` `TreeSet` `Collections Utility Methods` `Comparator` `Records` `Enums` `Lambda Expressions` `Method References` `Coding to an Interface`

## Project READMEs

- [CollectionsOverview](CollectionsOverview/README.md)
- [CollectionsMethods](CollectionsMethods/README.md)

## Credits

Based on Section 15 of the **Java Masterclass 2025: 130+ Hours of Expert Lessons** course on Udemy.

This README was created with the help of [Claude](https://claude.ai), an AI assistant by Anthropic.