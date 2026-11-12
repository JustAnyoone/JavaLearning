<div align="center">

# Collections Methods

**A deck of cards, the `Collections` utility class and a five card draw poker game**

![Java](https://img.shields.io/badge/Java-17%2B-b07219?style=for-the-badge&logo=openjdk&logoColor=white)
![Section](https://img.shields.io/badge/Section-15-0969da?style=for-the-badge)
![Topic](https://img.shields.io/badge/Topic-Collections%20Framework-2ea44f?style=for-the-badge)
![Challenge](https://img.shields.io/badge/Challenge-Poker%20Game-a435f0?style=for-the-badge)

[About](#about) | [Part 1: Collections Methods](#part-1---the-collections-methods) | [Part 2: Poker Game](#part-2---the-poker-game-challenge) | [Concepts](#concepts-practiced) | [How to Run](#how-to-run) | [Credits](#credits)

</div>

---

## About

A Java project from the **Java Masterclass 2025: 130+ Hours of Expert Lessons** course on Udemy (Section 15 - Collections Framework: Lists, Sets and Maps).

It uses a standard 52 card deck as the data, because a deck is a perfect list: it can be shuffled, sorted, reversed, searched, rotated and copied. The project has two parts:

| Part | Entry point | What it does |
|---|---|---|
| **Collections Methods** | `dev.lpa.Main` | Tries out the methods of the `Collections` utility class on a deck of cards |
| **Poker Game Challenge** | `dev.lpa.games.GameController` | Deals a five card draw game to 8 players, ranks every hand and suggests which cards to discard |

Card suits are printed with their real symbols:

```
A♠(12)   K♥(11)   Q♦(10)   J♣(9)
```

The number in brackets is the card's rank, from `0` for a 2 up to `12` for an ace.

---

## Part 1 - The Collections Methods

`Main` works through the helper methods of `java.util.Collections`, plus a few related methods on lists and arrays, and prints the deck after each step.

| Method | What it does | In this project |
|---|---|---|
| `Arrays.fill` | Fills an array with one value | Fills an array of 13 cards with the ace of hearts |
| `Collections.fill` | Replaces every **existing** element of a list | Does nothing on an empty list, so the result is `[]` with size `0` |
| `Collections.nCopies` | Creates an immutable list with `n` copies of an element | 13 aces of hearts, 13 kings of clubs |
| `Collections.addAll` | Adds several elements to a collection | Adds the array of aces to a list, twice |
| `Collections.copy` | Copies a list over the start of another list | Copies the kings over the first 13 aces |
| `List.copyOf` | Creates an immutable copy | An unmodifiable copy of the kings |
| `Collections.shuffle` | Puts the elements in random order | Shuffles the deck |
| `Collections.reverse` | Reverses the order | Reverses the deck |
| `Collections.sort` / `List.sort` | Sorts with a `Comparator` | Sorts by rank then suit, and by suit then rank |
| `subList` | A view of part of a list | Picks the kings and the tens out of the deck |
| `Collections.indexOfSubList` | Finds where a sublist starts | Finds the four tens at index `16` |
| `containsAll` | Checks that all elements of another collection are present | Confirms the deck holds all four tens |
| `Collections.disjoint` | Checks that two collections share nothing | The deck and the tens share cards (`false`), the kings and the tens don't (`true`) |
| `Collections.binarySearch` | Finds an element in a **sorted** list, using the same comparator | Finds the ten of hearts at index `34` |
| `Collections.replaceAll` | Replaces one value with another, and returns `true` if it changed something | Swaps the tens of hearts and the tens of clubs |
| `Collections.frequency` | Counts how many times an element appears | Counts the tens of clubs |
| `Collections.max` / `min` | Finds the best and worst element by a comparator | The best card is `A♠`, the worst is `2♣` |
| `Collections.rotate` | Shifts the elements, wrapping around the ends | Rotates 13 cards by `2` and by `-2` |
| `Collections.swap` | Swaps two elements | Reverses a list by hand, and compares it with `reverse` |

### Sorting the deck with comparators

```java
var sortingAlgorithm = Comparator.comparingInt(Card::rank).thenComparing(Card::suit);
Collections.sort(deck, sortingAlgorithm);

var sortBySuit = Comparator.comparing(Card::suit).thenComparing(Card::rank);
deck.sort(sortBySuit);
```

<details>
<summary><b>Example output</b> - the sorted deck, a binary search and a rotation</summary>

<br>

```
Standard Deck sorted by rank, suit
2♣(0) 2♦(0) 2♥(0) 2♠(0)
3♣(1) 3♦(1) 3♥(1) 3♠(1)
4♣(2) 4♦(2) 4♥(2) 4♠(2)
...
A♣(12) A♦(12) A♥(12) A♠(12)

Sublist indx for tens = 16
Contains = true
disjoint = false
disjoint = true
foundIndex = 34
10♥(8)

Best Card = A♠(12)
Worst Card = 2♣(0)

unRotated: [2♣(0), 3♣(1), 4♣(2), 5♣(3), 6♣(4), 7♣(5), 8♣(6), 9♣(7), 10♣(8), 10♣(8), J♣(9), Q♣(10), K♣(11)]
Rotated 2: [Q♣(10), K♣(11), 2♣(0), 3♣(1), 4♣(2), 5♣(3), 6♣(4), 7♣(5), 8♣(6), 9♣(7), 10♣(8), 10♣(8), J♣(9)]
```

The tens of clubs show up twice because the program replaces the tens of hearts with tens of clubs earlier on, so `Collections.frequency` reports `2`.

</details>

---

## Part 2 - The Poker Game Challenge

The challenge puts the `Collections` methods to work in a **five card draw** poker game with 8 players and 5 cards each.

### How a round works

1. **Shuffle** the deck with `Collections.shuffle`.
2. **Cut** the deck by rotating it a random number of positions, between 15 and 34, with `Collections.rotate`.
3. **Deal** one card at a time to each player in turn, until everyone has 5 cards (40 cards in total).
4. **Sort** each hand from the highest rank to the lowest.
5. **Evaluate** each hand and give it a ranking.
6. **Pick the discards**: the cards each player would throw away to draw new ones.
7. **Print** every hand with its ranking, best card, worst card and discards, followed by the 12 cards left in the deck.

### Hand rankings

| Ranking | Meaning |
|---|---|
| `NONE` | No matching cards |
| `ONE PAIR` | Two cards with the same face |
| `TWO PAIR` | Two different pairs |
| `THREE OF A KIND` | Three cards with the same face |
| `FULL HOUSE` | Three of a kind and a pair |
| `FOUR OF A KIND` | Four cards with the same face |

The game ranks matching faces only. Straights and flushes are not evaluated.

### How the program decides

Each hand finds the faces that appear more than once, then ranks them by how many times they appear:

```java
private void setRank(int faceCount) {
    switch (faceCount) {
        case 4 -> score = Ranking.FOUR_OF_A_KIND;
        case 3 -> {
            if (score == Ranking.NONE) score = Ranking.THREE_OF_A_KIND;
            else score = Ranking.FULL_HOUSE;
        }
        case 2 -> {
            if (score == Ranking.NONE) score = Ranking.ONE_PAIR;
            else if (score == Ranking.THREE_OF_A_KIND) score = Ranking.FULL_HOUSE;
            else score = Ranking.TWO_PAIR;
        }
    }
}
```

The cards that are not part of a match are the discard candidates. A player discards up to three of the lowest ones, but keeps a card ranked jack or higher, unless the hand already holds three or more matching cards:

```java
List<Card> temp = new ArrayList<>(hand);
temp.removeAll(keepers);
int rankedCards = keepers.size();
Collections.reverse(temp);
int index = 0;
for (Card c : temp) {
    if (index++ < 3 && (rankedCards > 2 || c.rank() < 9)) discards.add(c);
    else keepers.add(c);
}
```

Functional interfaces tie the evaluation and the printing together:

```java
Consumer<PokerHand> checkHand = PokerHand::evalHand;
pokerHands.forEach(checkHand.andThen(System.out::println));
```

<details open>
<summary><b>Example output</b> - one round (the cards are random, so every run is different)</summary>

<br>

```
1. NONE             Rank:0 [A♦(12), K♣(11), 9♥(7), 6♦(4), 2♥(0)]    Best:A♦(12)  Worst:2♥(0)  Discards:[2♥(0), 6♦(4), 9♥(7)]
2. ONE PAIR         Rank:1 [A♠(12), K♠(11), 7♣(5), 7♥(5), 4♣(2)]    Best:A♠(12)  Worst:4♣(2)  Discards:[4♣(2)]
3. ONE PAIR         Rank:1 [K♦(11), Q♥(10), Q♠(10), 9♦(7), 2♠(0)]   Best:K♦(11)  Worst:2♠(0)  Discards:[2♠(0), 9♦(7)]
4. NONE             Rank:0 [J♠(9), 10♥(8), 8♣(6), 6♥(4), 5♣(3)]     Best:J♠(9)   Worst:5♣(3)  Discards:[5♣(3), 6♥(4), 8♣(6)]
5. ONE PAIR         Rank:1 [Q♦(10), 10♣(8), 4♥(2), 2♣(0), 2♦(0)]    Best:Q♦(10)  Worst:2♣(0)  Discards:[4♥(2), 10♣(8)]
6. THREE OF A KIND  Rank:3 [A♣(12), J♥(9), 3♦(1), 3♥(1), 3♠(1)]     Best:A♣(12)  Worst:3♦(1)  Discards:[J♥(9), A♣(12)]
7. NONE             Rank:0 [K♥(11), Q♣(10), 10♠(8), 7♦(5), 4♦(2)]   Best:K♥(11)  Worst:4♦(2)  Discards:[4♦(2), 7♦(5), 10♠(8)]
8. ONE PAIR         Rank:1 [J♣(9), J♦(9), 9♣(7), 8♠(6), 5♥(3)]      Best:J♣(9)   Worst:5♥(3)  Discards:[5♥(3), 8♠(6), 9♣(7)]
-----------------------------
Remaining Cards
8♥(6) 8♦(6) 5♦(3) A♥(12) 10♦(8) 5♠(3)
4♠(2) 3♣(1) 6♠(4) 6♣(4) 7♠(5) 9♠(7)
```

Player 6 holds three of a kind, so the hand keeps all of the three threes and discards the other two cards.

</details>

---

## The `Card` Record

`Card` is a record with a suit, a face and a rank, and it builds and prints the deck for both parts of the project.

- **Suit symbols from code points:** `Suit.getImage()` returns the characters `9827`, `9830`, `9829` and `9824` (club, diamond, heart and spade) by number, so the source file doesn't depend on its encoding.
- **Ranks:** a 2 has rank `0` and an ace has rank `12`, so ranks can be compared and sorted directly.
- **Reusable comparator:** `Card.sortRankReverserdSuit()` sorts by rank from high to low, then by suit.
- **Deck helpers:** `getStandardDeck()` builds the 52 cards, and `printDeck(...)` prints them in rows with `subList`.

```java
public static Comparator<Card> sortRankReverserdSuit() {
    return Comparator.comparing(Card::rank).reversed().thenComparing(Card::suit);
}
```

---

## Concepts Practiced

- **The `Collections` utility class:** `shuffle`, `reverse`, `sort`, `rotate`, `swap`, `binarySearch`, `max`, `min`, `frequency`, `disjoint`, `indexOfSubList`, `replaceAll`, `fill`, `copy`, `nCopies` and `addAll`
- **Lists:** `ArrayList`, `subList` views, immutable lists and `List.copyOf`
- **Comparators:** `comparing`, `comparingInt`, `thenComparing` and `reversed`
- **Lambdas and method references:** `Consumer`, `andThen`, `PokerHand::evalHand` and `System.out::println`
- **Records and enums:** `Card` as a record, `Suit` and `Ranking` as enums, with their own methods
- **Packages:** classes organized under `dev.lpa` and `dev.lpa.games.poker`
- **Switch expressions:** ranking a hand by the number of matching cards
- **Two-dimensional arrays:** dealing cards into a `Card[][]`
- **Problem solving:** breaking a card game into shuffle, deal, evaluate and discard

---

## Project Structure

```
CollectionsMethods/
└── src/
    └── dev/lpa/
        ├── Card.java                      # Record: card, suits, deck helpers
        ├── Main.java                      # Part 1: Collections methods demo
        └── games/
            ├── GameController.java        # Part 2: starts the poker game
            └── poker/
                ├── PokerGame.java         # Shuffle, cut, deal and report
                ├── PokerHand.java         # Evaluate a hand and pick discards
                └── Ranking.java           # Enum of hand rankings
```

---

## How to Run

You need **JDK 17** or later. From the `CollectionsMethods` folder:

```bash
javac -d out $(find src -name "*.java")

# Part 1: the Collections methods
java -cp out dev.lpa.Main

# Part 2: the poker game
java -cp out dev.lpa.games.GameController
```

### Showing the card symbols in the Windows terminal

The program prints the symbols `♣ ♦ ♥ ♠`. If your Windows terminal shows `?` or strange characters in their place, run this command in PowerShell before running the program:

```powershell
[Console]::OutputEncoding = [System.Text.Encoding]::UTF8
```

**Why it's needed:** the symbols are not part of the older encodings that the Windows console often uses by default. This command tells PowerShell to read the output as UTF-8, so the terminal can draw the symbols.

- The setting only lasts for the current terminal window, so run it again in each new window. To make it permanent, add the same line to your PowerShell profile (`notepad $PROFILE`).
- Java also has to write UTF-8. If the symbols still look wrong, run the program with `java -Dfile.encoding=UTF-8 -Dstdout.encoding=UTF-8 -cp out dev.lpa.Main`.

---

## Credits

Based on the Collections Methods lessons and the Poker Game challenge from the **Java Masterclass 2025: 130+ Hours of Expert Lessons** course on Udemy.

This README was created with the help of [Claude](https://claude.ai), an AI assistant by Anthropic.