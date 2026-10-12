# Generic Class Challenge

A Java project from the **Complete Java Masterclass** course (Generics - Generic Class Challenge), focused on practicing **generic classes** by building a small mapping application that uses real location data.

## The Challenge

This challenge builds on the earlier Interface Challenge, where a `Mappable` interface described map features (points, lines and polygons) with markers and labels, but did not use any locations. Here, the goal is to create a generic class and to use latitude and longitude data in the output.

The design is based on these types:

- `Mappable`: an interface with a single abstract method, `render()`, plus a static helper method that converts a `String` into a `double[]` of latitude and longitude.
- `Point` and `Line`: abstract classes that implement `Mappable`. A `Point` holds one location (`double[]`), and a `Line` holds several locations (`double[][]`). They are abstract because they should not be instantiated directly.
- `Park`: extends `Point`, with a name. Used for US National Parks such as Yellowstone, Grand Canyon and Yosemite.
- `River`: extends `Line`, with a name. Used for rivers such as the Mississippi, Missouri, Colorado and Delaware.
- `Layer`: a **generic class** with a single type parameter that only accepts `Mappable` elements. It keeps a private list of elements, provides methods to add one or more of them, and has a `renderLayer()` method that calls `render()` on every element.

The `main` method creates parks and rivers with location data, adds them to typed `Layer` objects and calls `renderLayer()`.

### Class Diagram

```
                 <<Interface>>                        Layer<T extends Mappable>
                   Mappable                         -----------------------------
        ---------------------------------           private layerElements : List
        render()                                    -----------------------------
        static stringToLatLon(String) : double[]    addElement(Element)
                     ^                              addElements(Elements)
                     | implements                   renderLayer()
          +----------+-----------+
          |                      |
    abstract Point         abstract Line
    location : double[]    locations : double[][]
    render()               render()
          ^                      ^
          |                      |
        Park                   River
      name : String          name : String
```

### Example Output

```
Render Grand Canyon National Park as POINT ([40.1021, -75.4231])
Render Mississippi River as LINE ([[47.216, -95.2348], [29.1566, -89.2495], [35.1556, -90.0659]])
```

## Concepts Practiced

- **Generic classes:** declaring a class with a type parameter, as in `Layer<T>`
- **Bounded types:** restricting the type parameter to `Mappable` with an upper bound, which also gives the class access to the `render()` method
- **Interfaces:** defining a `Mappable` contract with an abstract method and a static helper method
- **Abstract classes and inheritance:** abstract `Point` and `Line` classes extended by concrete `Park` and `River` classes
- **Polymorphism:** rendering different kinds of map elements through a single `Mappable` type
- **Arrays:** representing one location as a `double[]` and several locations as a two-dimensional `double[][]`
- **Collections:** storing elements in a `List` inside the generic class
- **Class design with UML:** translating a class diagram into Java code

## Credits

Based on the Generic Class Challenge from the **Complete Java Masterclass** course.

This README was created with the help of [Claude](https://claude.ai), an AI assistant by Anthropic.