# Lambda Expression Challenge

A Java project from the **Java Masterclass 2025: 130+ Hours of Expert Lessons** course on Udemy (Section 14 - Mastering Java Lambdas), focused on putting lambda expressions to work with the methods of arrays and `ArrayList`s that accept them.

## The Challenge

The challenge exercises the methods on arrays and lists that are targets for lambda expressions. It starts from an array of first names and transforms it step by step.

### Requirements

1. **Create the data:** build an array of `String` with first names in mixed case. Include at least one name that is spelled the same backwards and forwards, such as Bob or Anna.
2. **Change the array with lambdas:** use either `Arrays.setAll` or `List.replaceAll`. If you use `List` methods, you need a list backed by the array, so that the changes are made to the original array.
3. **Apply three transformations,** each with an appropriate lambda expression:
   - transform the names to all uppercase
   - add a randomly generated middle initial, followed by a period
   - add a last name that is the reverse of the first name
4. **Print after each change:** show the array or its elements after each step, using `forEach` at least once.
5. **Remove the palindromes:** create a new, modifiable `ArrayList` from the names array, and use `removeIf` with a lambda to remove any name where the last name equals the first name.

## Key Code

Changing the array in place with `Arrays.setAll`, and through a list backed by the array:

```java
String[] names = {"Anna", "Bob", "Charlie", "Diana", "Ethan", "Fred", "Gary"};

Arrays.setAll(names, i -> names[i].toUpperCase());

List<String> backedByArray = Arrays.asList(names);

backedByArray.replaceAll(s -> s += " " + getRandomChar('A', 'D') + ".");
backedByArray.replaceAll(s -> s += " " + getReversedName(s.split(" ")[0]));
```

Printing with `forEach`, and removing names with `removeIf`:

```java
Arrays.asList(names).forEach(s -> System.out.println(s));

List<String> newList = new ArrayList<>(List.of(names));
newList.removeIf(s -> {
    String first = s.substring(0, s.indexOf(" "));
    String last = s.substring(s.lastIndexOf(" ") + 1);
    return first.equals(last);
});
```

## Example Output

The middle initials are random, so they change on each run.

```
--> Transform to Uppercase
[ANNA, BOB, CHARLIE, DIANA, ETHAN, FRED, GARY]
--> Add random middle initial
[ANNA A., BOB A., CHARLIE A., DIANA C., ETHAN B., FRED A., GARY A.]
--> Add reversed name as last name
ANNA A. ANNA
BOB A. BOB
CHARLIE A. EILRAHC
DIANA C. ANAID
ETHAN B. NAHTE
FRED A. DERF
GARY A. YRAG
--> Remove names where first = last
CHARLIE A. EILRAHC
DIANA C. ANAID
ETHAN B. NAHTE
FRED A. DERF
GARY A. YRAG
```

Anna and Bob read the same backwards, so their last names match their first names and `removeIf` removes them.

## Concepts Practiced

- **Lambda expressions:** short expression lambdas and block lambdas
- **`Arrays.setAll`:** filling or changing an array from a lambda that receives each index
- **`List.replaceAll`:** transforming every element of a list with a lambda
- **Lists backed by arrays:** `Arrays.asList` keeps the list and the array in sync, so changes made to one appear in the other
- **`forEach`:** printing the elements of an array or list
- **`removeIf`:** removing the elements that match a condition, from a modifiable `ArrayList`
- **String methods:** `toUpperCase`, `split`, `substring`, `indexOf` and `lastIndexOf`
- **`StringBuilder`:** reversing a name with `reverse()`
- **Random values:** generating a random letter with `Random.nextInt`
- **Fixed-size vs. modifiable lists:** `Arrays.asList` can change values but not size, so a new `ArrayList` is needed to remove elements

## Project Structure

```
LambdaExpressionChallenge/
└── src/
    └── dev/lpa/
        └── Main.java    # The whole challenge
```

## Credits

Based on the Lambda Expression Challenge (Put it all together) from the **Java Masterclass 2025: 130+ Hours of Expert Lessons** course on Udemy.

This README was created with the help of [Claude](https://claude.ai), an AI assistant by Anthropic.