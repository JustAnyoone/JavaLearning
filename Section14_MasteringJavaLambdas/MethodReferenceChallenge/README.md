# Method Reference Challenge

A Java project from the **Java Masterclass 2025: 130+ Hours of Expert Lessons** course on Udemy (Section 14 - Mastering Java Lambdas), focused on combining **lambda expressions** and **method references** in one program that transforms an array of names.

## The Challenge

The challenge builds on the earlier Lambda Expression Challenge. Instead of writing each change as a separate step, the transformations are collected in a list of functions, and a single method applies them all to the names.

### Requirements

1. **Create the data:** build an array of names in mixed case, as in the Lambda Expression Challenge.
2. **Create a list of functions:** use a `List` of `Function` or `UnaryOperator` interfaces. It holds all the operations to run on each name.
3. **Apply the same changes as before:**
   - make each name uppercase
   - add a random middle initial
   - add a last name that is the reverse of the first name
4. **Add custom transformations of your own.**
5. **Mix lambdas and method references:** use both kinds of expressions in the list.
6. **Write a method that applies the functions:** it takes the names array and the function list, and applies each function to each name using the `transform` method of `String`. All changes must be made to the original array.
7. **Explore:** try as many transformations and as many different kinds of method references as possible.

## Key Code

The list of operations mixes method references and lambdas:

```java
Person tim = new Person("Tim");
List<UnaryOperator<String>> list = new ArrayList<>(List.of(
    String::toUpperCase,                                    // unbound instance method reference
    s -> s += " " + getRandomChar('D', 'M') + ".",          // lambda
    s -> s += " " + reverse(s, 0, s.indexOf(" ")),          // lambda
    Main::reverse,                                          // static method reference
    String::new,                                            // constructor reference
    String::valueOf,                                        // static method reference
    tim::last,                                              // bound method reference
    (new Person("MARY"))::last                              // bound method reference
));
```

One method applies every function to every name, working on the original array through a list backed by it:

```java
private static void applyChanges(String[] names, List<UnaryOperator<String>> stringFunctions) {
    List<String> backedByArray = Arrays.asList(names);
    for (var function : stringFunctions) {
        backedByArray.replaceAll(s -> s.transform(function));
        System.out.println(Arrays.toString(names));
    }
}
```

## Kinds of Method References Used

| Kind | Example in the project |
|---|---|
| **Static method** | `Main::reverse`, `String::valueOf` |
| **Instance method of an arbitrary object of a type** | `String::toUpperCase` |
| **Instance method of a particular object** | `tim::last`, `(new Person("MARY"))::last` |
| **Constructor** | `String::new` |

## Example Output

The middle initials are random, so they change on each run. Each line is the array after one more function has been applied.

```
[ANNA, BOB, CAMERON, DONALD, EVA, FRANCIS]
[ANNA F., BOB F., CAMERON J., DONALD F., EVA H., FRANCIS D.]
[ANNA F. ANNA, BOB F. BOB, CAMERON J. NOREMAC, DONALD F. DLANOD, EVA H. AVE, FRANCIS D. SICNARF]
[ANNA .F ANNA, BOB .F BOB, CAMERON .J NOREMAC, DONALD .F DLANOD, EVA .H AVE, FRANCIS .D SICNARF]
[ANNA .F ANNA, BOB .F BOB, CAMERON .J NOREMAC, DONALD .F DLANOD, EVA .H AVE, FRANCIS .D SICNARF]
[ANNA .F ANNA, BOB .F BOB, CAMERON .J NOREMAC, DONALD .F DLANOD, EVA .H AVE, FRANCIS .D SICNARF]
[Tim ANNA, Tim BOB, Tim CAMERON, Tim DONALD, Tim EVA, Tim FRANCIS]
[MARY Tim, MARY Tim, MARY Tim, MARY Tim, MARY Tim, MARY Tim]
```

The fourth line shows what `Main::reverse` does: it reverses the whole string, which is why the initial appears as `.F`. `String::new` and `String::valueOf` copy each string without changing it, so those lines repeat. The last two lines use the `Person` record, whose `last` method builds a new value from its first name and the first word of each name.

## Concepts Practiced

- **Method references of every kind:** static, instance of an arbitrary object, instance of a particular object, and constructor
- **Lambdas next to method references:** choosing the shorter form when a lambda only calls one method
- **A list of functions:** storing `UnaryOperator<String>` operations in a `List` and running them in order
- **`String.transform`:** applying a function to a string and returning the result
- **Lists backed by arrays:** `Arrays.asList` and `replaceAll` change the original array
- **Method overloading:** two `reverse` methods, so `Main::reverse` fits the `UnaryOperator<String>` type
- **Records:** a private `Person` record with its own method, used through bound method references
- **Random values:** generating a random letter with `Random.nextInt`

## Project Structure

```
MethodReferenceChallenge/
└── src/
    └── dev/lpa/
        └── Main.java    # The whole challenge
```

## Credits

Based on the Method Reference Challenge from the **Java Masterclass 2025: 130+ Hours of Expert Lessons** course on Udemy.

This README was created with the help of [Claude](https://claude.ai), an AI assistant by Anthropic.