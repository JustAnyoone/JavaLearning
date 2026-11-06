# Lambda Mini Challenges

A Java project from the **Java Masterclass 2025: 130+ Hours of Expert Lessons** course on Udemy (Section 14 - Mastering Java Lambdas), made of seven small tasks that practice **creating and using lambda expressions**.

## The Challenge

This challenge is different from the others in the course. Instead of one big program, it is a series of mini challenges. Each task is tried alone first, and then solved step by step, before the next one starts.

Two ideas tie the tasks together:

1. Lambdas can be declared as variables, or passed directly to methods that accept them as arguments.
2. Methods can be written so that they accept lambda expressions as parameters.

### The seven mini challenges

| # | Task | Solution in the project |
|---|---|---|
| 1 | Rewrite an anonymous `Consumer<String>` class, which splits a sentence into words and prints each one, as a lambda expression. Do it by hand, without relying on the IDE. | `printWordsLambda`, plus shorter versions that use `forEach` |
| 2 | Rewrite the method `everySecondChar`, which returns every second character of a string, as a lambda expression held in a variable of a suitable type. | `UnaryOperator<String> everySecondChar` |
| 3 | Execute that lambda with `1234567890` as the argument, and print the result. | `everySecondChar.apply("1234567890")` |
| 4 | Write a method, `everySecondCharacter`, that accepts a `Function` (or `UnaryOperator`) and the string to process, runs the function on that string, and returns the result. The string must not be hard coded. | `everySecondCharacter(Function<String, String> func, String source)` |
| 5 | Call that method with the lambda from challenge 2 and `1234567890`, and print the result. | `everySecondCharacter(everySecondChar, "1234567890")` |
| 6 | Declare a lambda with the `Supplier` interface that returns a string, and assign it to a variable called `iLoveJava`. | `Supplier<String> iLoveJava` |
| 7 | Use the `Supplier` to get its string and print it. Lambdas are deferred execution: nothing runs until the lambda is used. | `iLoveJava.get()` |

## Key Code

From anonymous class to lambda:

```java
// Anonymous class
Consumer<String> printWords = new Consumer<String>() {
    @Override
    public void accept(String sentence) {
        String[] parts = sentence.split(" ");
        for (String part : parts) {
            System.out.println(part);
        }
    }
};

// Lambda, and a more concise version of it
Consumer<String> printWordsLambda = sentence -> {
    String[] parts = sentence.split(" ");
    for (String part : parts) {
        System.out.println(part);
    }
};

Consumer<String> printWordsConcise = sentence ->
    Arrays.asList(sentence.split(" ")).forEach(s -> System.out.println(s));
```

A lambda in a variable, and a method that accepts a lambda:

```java
UnaryOperator<String> everySecondChar = source -> {
    StringBuilder returnVal = new StringBuilder();
    for (int i = 0; i < source.length(); i++) {
        if (i % 2 == 1) {
            returnVal.append(source.charAt(i));
        }
    }
    return returnVal.toString();
};

public static String everySecondCharacter(Function<String, String> func, String source) {
    return func.apply(source);
}
```

A `Supplier`:

```java
Supplier<String> iLoveJava = () -> "I love Java !";
System.out.println(iLoveJava.get());
```

## Example Output

```
Let's
split
this
up
into
an
array
24680
24680
I love Java !
```

## Concepts Practiced

- **Converting anonymous classes to lambdas:** writing the shorter form by hand
- **Lambda syntax:** expression bodies and block bodies
- **Functional interfaces:** `Consumer`, `UnaryOperator`, `Function` and `Supplier`
- **Lambdas as variables:** declaring a lambda and running it later with its functional method (`accept`, `apply`, `get`)
- **Lambdas as arguments:** writing a method that accepts a `Function`
- **Deferred execution:** a lambda does nothing until it is called
- **Refactoring:** replacing a loop with `forEach` to make the code shorter

## Project Structure

```
MiniLambdaChallenges/
└── src/
    └── dev/lpa/
        └── Main.java    # All seven mini challenges
```

## Credits

Based on the Lambda Mini Challenges lesson from the **Java Masterclass 2025: 130+ Hours of Expert Lessons** course on Udemy.

This README was created with the help of [Claude](https://claude.ai), an AI assistant by Anthropic.