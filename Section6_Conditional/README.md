# Section 6 - Conditional Statements and Loops

Part of my **Java Masterclass 2025: 130+ Hours of Expert Lessons** course on Udemy. This section covers how a Java program makes decisions and repeats actions, using `switch` statements, loops and user input, with a set of challenges to practice each topic.

## Overview

Control flow is what turns a list of instructions into a real program. In this section I learned how to choose between different paths with `switch`, how to repeat code with `for` and `while` loops, and how to read input from the user. Most topics end with a challenge that applies the lesson to a small problem.

## Files

Unlike the other sections, this section is made of single Java files instead of folders.

```
Section6_Conditional/
├── SwitchStatement.java
├── SwitchChallenger.java
├── SwitchChallenger2.java
├── TheForLooping.java
├── LoopChallenger.java
├── WhileLoop.java
├── WhileLoopChallenger.java
├── ReadingUserInput.java
├── ReadingUserInputChallenger.java
├── ChallengerMinAndMax.java
├── DigitSumChallenger.java
└── Sum3and5Challenger.java
```

| File | Type | Topic |
|---|---|---|
| `SwitchStatement.java` | Lesson | The `switch` statement |
| `SwitchChallenger.java` | Challenge | Practice with `switch` |
| `SwitchChallenger2.java` | Challenge | A second `switch` challenge |
| `TheForLooping.java` | Lesson | The `for` loop |
| `LoopChallenger.java` | Challenge | Practice with loops |
| `WhileLoop.java` | Lesson | The `while` loop |
| `WhileLoopChallenger.java` | Challenge | Practice with `while` loops |
| `ReadingUserInput.java` | Lesson | Reading input from the user |
| `ReadingUserInputChallenger.java` | Challenge | Practice with user input |
| `ChallengerMinAndMax.java` | Challenge | Finding the minimum and maximum values |
| `DigitSumChallenger.java` | Challenge | Working with the digits of a number |
| `Sum3and5Challenger.java` | Challenge | Challenge involving the numbers 3 and 5 |

## Concepts Practiced

### The switch Statement
- Choosing between several paths based on the value of a variable.
- Using `case`, `break` and `default`.

```java
switch (day) {
    case 1 -> System.out.println("Monday");
    case 2 -> System.out.println("Tuesday");
    default -> System.out.println("Another day");
}
```

### Loops
- Repeating code with the `for` loop when the number of repetitions is known.
- Repeating code with the `while` loop while a condition stays true.
- Controlling loops with conditions, counters, `break` and `continue`.

```java
for (int i = 1; i <= 5; i++) {
    System.out.println("Number: " + i);
}

int count = 0;
while (count < 3) {
    count++;
}
```

### Reading User Input
- Reading values typed by the user, usually with the `Scanner` class.
- Validating input and reacting to it with conditions and loops.

```java
Scanner scanner = new Scanner(System.in);
int number = scanner.nextInt();
```

### Problem Solving
- Combining conditions, loops and input to solve small problems, such as finding minimum and maximum values and working with the digits of a number.

## Challenges

The challenges check that I can use these tools on my own:

- **SwitchChallenger** and **SwitchChallenger2** - applying `switch`.
- **LoopChallenger** and **WhileLoopChallenger** - applying `for` and `while` loops.
- **ReadingUserInputChallenger** - applying user input.
- **ChallengerMinAndMax**, **DigitSumChallenger** and **Sum3and5Challenger** - small problems that combine loops and conditions.

## Skills Gained

`Control Flow` `switch` `for Loop` `while Loop` `User Input` `Scanner` `Conditions` `Problem Solving`

## Credits

Based on the Conditional section of the **Java Masterclass 2025: 130+ Hours of Expert Lessons** course on Udemy.

This README was created with the help of [Claude](https://claude.ai), an AI assistant by Anthropic.