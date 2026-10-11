# Section 10 - Mastering Lists

Part of my **Java Masterclass 2025: 130+ Hours of Expert Lessons** course on Udemy. This section covers how Java stores and manipulates groups of data, from basic arrays to `ArrayList` and `LinkedList`, along with autoboxing and enums.

## Overview

The section starts with arrays and moves on to the resizable collections of the Java Collections Framework. It compares `ArrayList` and `LinkedList`, explains how Java converts between primitives and their wrapper classes, and includes hands-on challenges to practice each topic.

## Folder Structure

```
Section10_MasteringLists/
├── ArrayAndArrayLists/
├── ArrayLists/
├── ChallengerArrayList/
├── Autoboxing/
├── ChallengerAutoboxing/
├── LinkedLists/
├── ChallengerLinkedList/
└── EnumProject/
```

| Folder | Type | Topic |
|---|---|---|
| `ArrayAndArrayLists` | Lesson | Arrays compared with `ArrayList` |
| `ArrayLists` | Lesson | Working with `ArrayList` |
| `ChallengerArrayList` | Challenge | Practice with `ArrayList` |
| `Autoboxing` | Lesson | Wrapper classes, autoboxing and unboxing |
| `ChallengerAutoboxing` | Challenge | Practice with autoboxing |
| `LinkedLists` | Lesson | Working with `LinkedList` |
| `ChallengerLinkedList` | Challenge | Practice with `LinkedList` |
| `EnumProject` | Project | Practice with enums |

## Concepts Practiced

### Arrays and ArrayLists
- Arrays have a fixed size and hold elements of a single type, while an `ArrayList` can grow and shrink as needed.
- Common `ArrayList` operations: adding, removing, getting, replacing and searching for elements, and checking the size.
- Declaring a list with a generic type, such as `ArrayList<String>`, and coding to the `List` interface.

```java
List<String> groceries = new ArrayList<>();
groceries.add("Milk");
groceries.add("Bread");
groceries.remove("Milk");
System.out.println(groceries.size());
```

### Autoboxing and Unboxing
- Wrapper classes such as `Integer`, `Double` and `Boolean` represent primitive values as objects.
- Autoboxing converts a primitive to its wrapper automatically, and unboxing converts it back.
- Collections such as `ArrayList` only hold objects, so autoboxing is what lets them work with primitive values.

```java
List<Integer> numbers = new ArrayList<>();
numbers.add(10);          // autoboxing: int -> Integer
int first = numbers.get(0); // unboxing: Integer -> int
```

### LinkedLists
- A `LinkedList` stores its elements as linked nodes instead of an internal array.
- It supports adding and removing elements at the beginning and end of the list, and can also be used as a queue or stack.
- Choosing between `ArrayList` and `LinkedList` depends on how the data is accessed and modified.

```java
LinkedList<String> queue = new LinkedList<>();
queue.addLast("first");
queue.addFirst("zero");
queue.removeFirst();
```

### Enums
- Using enums to model a fixed set of constants.
- Applying enums in a small project to keep the code clear and type safe.

## Challenges

Each topic ends with a challenge, which makes sure I can apply the lessons without following along:

- **ChallengerArrayList** - applying `ArrayList` operations.
- **ChallengerAutoboxing** - applying autoboxing and unboxing.
- **ChallengerLinkedList** - applying `LinkedList` operations.

## Skills Gained

`Arrays` `ArrayList` `LinkedList` `List Interface` `Generics` `Autoboxing` `Wrapper Classes` `Enums` `Java Collections Framework`

## Credits

Based on the Mastering Lists section of the **Java Masterclass 2025: 130+ Hours of Expert Lessons** course on Udemy.

This README was created with the help of [Claude](https://claude.ai), an AI assistant by Anthropic.