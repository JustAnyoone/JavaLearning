# Section 8 - Advanced OOP

Part of my **Java Masterclass 2025: 130+ Hours of Expert Lessons** course on Udemy. This section goes deeper into object-oriented programming in Java, covering encapsulation, polymorphism and packages, and applies them in challenges and projects.

## Overview

After learning the basics of classes and objects, this section focuses on the principles that make object-oriented code safe, flexible and well organized. Each core topic is followed by a hands-on challenge, and the section closes with a larger challenge that combines everything.

## Folder Structure

```
Section8_AdvancedOOP/
├── Encapsulation/
├── ChallengerEncapsulation/
├── Polymorphism/
├── ChallengerPolymorphism/
├── Packages/
├── ComputerFactory/
├── ChallengerSmartKitchen/
└── aMasterChallengerOOP/
```

| Folder | Type | Topic |
|---|---|---|
| `Encapsulation` | Lesson | Protecting data inside classes |
| `ChallengerEncapsulation` | Challenge | Practice with encapsulation |
| `Polymorphism` | Lesson | Treating objects through their parent types |
| `ChallengerPolymorphism` | Challenge | Practice with polymorphism |
| `Packages` | Lesson | Organizing classes into packages |
| `ComputerFactory` | Project | Applying OOP concepts in a larger project |
| `ChallengerSmartKitchen` | Challenge | Applying OOP concepts in the Smart Kitchen challenge |
| `aMasterChallengerOOP` | Challenge | Final challenge combining the section's concepts |

## Concepts Practiced

### Encapsulation
- Hiding a class's internal data by declaring fields `private`.
- Exposing controlled access through public getters and setters.
- Validating data inside setters and constructors so objects can't end up in an invalid state.
- Using access modifiers (`private`, `public`, and the default package-private access) to control visibility.

```java
public class Account {
    private double balance;

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }
}
```

### Polymorphism
- Overriding methods in subclasses to give them specialized behavior.
- Referring to a subclass object through a parent type, so the same code works with many different classes.
- Letting Java choose the correct method at runtime, based on the actual object.
- Using `instanceof` and casting to work with a specific subclass when needed.

```java
Animal pet = new Dog();
pet.makeNoise();   // runs Dog's version of makeNoise()
```

### Packages
- Grouping related classes into packages to keep projects organized.
- Using the `package` declaration and `import` statements.
- Understanding how packages affect access to classes and members.
- Following package naming conventions.

### Putting it together
- `ComputerFactory` and `ChallengerSmartKitchen` apply these concepts in larger programs with several cooperating classes.
- `aMasterChallengerOOP` is the final challenge of the section, combining encapsulation, polymorphism, inheritance and packages in one program.

## Challenges

Each core topic ends with a challenge that checks whether I can apply the lessons on my own:

- **ChallengerEncapsulation** - applying encapsulation.
- **ChallengerPolymorphism** - applying polymorphism.
- **ChallengerSmartKitchen** - designing a program with several related classes.
- **aMasterChallengerOOP** - the final, combined challenge.

## Skills Gained

`OOP` `Encapsulation` `Polymorphism` `Inheritance` `Method Overriding` `Access Modifiers` `Packages` `Class Design`

## Credits

Based on the Advanced OOP section of the **Java Masterclass 2025: 130+ Hours of Expert Lessons** course on Udemy.

This README was created with the help of [Claude](https://claude.ai), an AI assistant by Anthropic.