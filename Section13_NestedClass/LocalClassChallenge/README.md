# Local and Anonymous Class Challenge

A Java project from the **Java Masterclass 2025: 130+ Hours of Expert Lessons** course on Udemy (Section 13 - Nested Classes and Types), focused on practicing **local classes** and **anonymous classes** with a list of employees.

## The Challenge

Build a small program that wraps employee data in a local class and sorts it with an anonymous class.

### Requirements

1. **Create a record:** define an `Employee` record with a first name, a last name and a hire date.
2. **Set up the data:** in the `main` method, create a list of employees with various names and hire dates.
3. **Add a method:** write a new method that takes the list of employees as a parameter.
4. **Use a local class:** inside that method, create a local class that wraps an `Employee`. It receives the employee in its constructor, keeps it in a field, and adds calculated fields such as the full name and the years worked.
5. **Build a new list:** create a list of employees using the local class.
6. **Sort with an anonymous class:** use an anonymous class to sort the local class employees by full name or by years worked.
7. **Print the result:** print the sorted list.

Hint from the course: use `LocalDate` to calculate the years worked.

```java
int currentYear = LocalDate.now().getYear();
```

## Concepts Practiced

- **Records:** declaring `Employee` as a short, immutable data class
- **Local classes:** declaring a class inside a method to wrap and extend another type with calculated fields
- **Anonymous classes:** creating an unnamed class in an expression, here to sort a list
- **Comparator:** sorting by different fields, such as full name and years worked
- **Calculated fields:** deriving values such as the full name and years worked from existing data
- **Dates:** working with `LocalDate` to find the current year
- **Collections:** building, passing and sorting lists

## Credits

Based on the Local and Anonymous Class Challenge from the **Java Masterclass 2025: 130+ Hours of Expert Lessons** course on Udemy.

This README was created with the help of [Claude](https://claude.ai), an AI assistant by Anthropic.