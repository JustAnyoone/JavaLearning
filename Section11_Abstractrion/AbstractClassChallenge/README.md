# Abstract Class Challenge

A Java project from the **Complete Java Masterclass** course (Abstraction in Java - Abstract Class Challenge), focused on practicing **abstract classes** by building a store front that can sell any imaginable item.

## The Challenge

Build an application that works as a store front. Instead of the usual `Main` class, a `Store` class holds the `main` method and is responsible for:

- Managing a list of products for sale and displaying their details.
- Managing an order, which is a list of `OrderItem` objects.
- Adding items to the order and printing the ordered items so the output looks like a sales receipt.

The design is based on these classes:

- `ProductForSale`: an abstract class with at least a type, a price and a description. It provides:
  - `getSalesPrice(int qty)`: a concrete method that returns the quantity times the price.
  - `printPricedItem(int qty)`: a concrete method that prints an itemized line for an order, with quantity and line-item price.
  - `showDetails()`: an abstract method that represents what a product page might display.
- `OrderItem`: a **record** with a quantity and a `ProductForSale`.
- Two or three product classes that extend `ProductForSale`. The products can be anything.

### Class Diagram

```
Store                         abstract ProductForSale
-----------------------       ------------------------------------
ArrayList<ProductForSale> <>--  type : String
-----------------------         price : double
addItemToOrder()                description : String
printOrder()                  ------------------------------------
                                void printPricedItem(int qty)
OrderItem (Record)              double getSalesPrice(int qty)
-----------------------         abstract void showDetails()
qty : int                                  ^
product : ProductForSale                   | extends
                                 +---------+---------+
                              Product A  Product B  Product C
```

## Concepts Practiced

- **Abstract classes and abstract methods:** defining a common base (`ProductForSale`) with `showDetails()` left for each subclass to implement
- **Concrete methods in abstract classes:** shared behavior such as `getSalesPrice()` and `printPricedItem()` inherited by all products
- **Inheritance and polymorphism:** treating different products through a single `ProductForSale` type
- **Records:** modeling `OrderItem` as a simple, immutable data carrier
- **Collections:** managing products and orders with `ArrayList`
- **Composition:** a `Store` that holds and works with a list of products
- **Class design with UML:** translating a class diagram into Java code

## Credits

Based on the Abstract Class Challenge from the **Complete Java Masterclass** course.

This README was created with the help of [Claude](https://claude.ai), an AI assistant by Anthropic.