# Interface Challenge

A Java project from the **Complete Java Masterclass** course, focused on practicing **interfaces** and **abstraction**.

## The Challenge

Maps are part of many modern applications, and most things drawn on a map fall into one of three categories: a **point**, a **line** or a **polygon**. This project generates text output that describes map features, in a JSON-like format similar to **GeoJSON**, which could be exchanged with a mapping application.

The task was to:

- Create a `Mappable` interface that forces classes to provide a label, a geometry type and a map marker.
- Add a constant, a default method (`toJSON()`) and a static method (`mapIt()`) to the interface.
- Implement the interface in two classes: `Building` (drawn as a **point**) and `UtilityLine` (drawn as a **line**).
- Use enums to model geometry, colors, markers, building usage and utility types.

### Example Output

```
"properties": {"type": "POINT", "label": "Sydney Town Hall (GOVERNMENT)", "marker": "RED STAR", "name": "Sydney Town Hall", "usage": "GOVERNMENT"}

"properties": {"type": "LINE", "label": "College St (FIBER_OPTIC)", "marker": "GREEN DOTTED", "name": "College St", "utility": "FIBER_OPTIC"}
```

## Concepts Practiced

- **Interfaces:** abstract methods and constants as a contract for implementing classes
- **Default and static methods** in interfaces
- **Abstraction and polymorphism:** handling different objects through a single `Mappable` type
- **Enums:** modeling fixed sets of values and using them as fields and return types
- **Text blocks and string formatting** to build structured output
- **Reading UML class diagrams** and translating them into Java code

## Tech

Java 15+

## Credits

Based on the Interface Challenge from the **Complete Java Masterclass** course.

This README was created with the help of [Claude](https://claude.ai), an AI assistant by Anthropic.