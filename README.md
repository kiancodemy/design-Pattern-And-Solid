Overview

This project demonstrates the implementation of Gang of Four (GoF) design patterns in Java. The patterns are organized into separate folders based on their categories: Creational and Structural. Each pattern is implemented with clear, practical examples to help understand when and how to use them.


Creational Patterns

Creational patterns deal with object creation mechanisms, trying to create objects in a manner suitable to the situation. They help make a system independent of how its objects are created, composed, and represented.

Factory Pattern

   📂 creational/factory/

The Factory Pattern provides an interface for creating objects in a superclass, but allows subclasses to alter the type of objects that will be created.

When to use:

When the exact type of object to be created is not known at compile time

When you want to centralize object creation logic

When a class wants its subclasses to specify the objects it creates

Key components:

Product interface

Concrete Product implementations

Factory class with a creation method

Abstract Factory Pattern

   📂 creational/abstractfactory/

The Abstract Factory Pattern provides an interface for creating families of related or dependent objects without specifying their concrete classes.

When to use:

When your system needs to work with multiple families of products

When related products must be used together

When you want to provide a library of products without exposing implementation details

Key components:

AbstractFactory interface

Concrete factories (one per product family)

Abstract product interfaces

Concrete product implementations

Difference from Factory Pattern:

Factory creates one product

Abstract Factory creates families of related products

Singleton Pattern

   📂 creational/singleton/

The Singleton Pattern ensures that a class has only one instance and provides a global point of access to it.

When to use:

When you need exactly one instance of a class (e.g., configuration manager, logger, database connection pool)

When you need strict control over global state

Key components:

Private constructor

Static instance variable

Public static method to get the instance

Common implementations:

Eager initialization

Lazy initialization

Thread-safe (synchronized / double-checked locking)

Bill Pugh (holder class) — recommended

Prototype Pattern

   📂 creational/prototype/

The Prototype Pattern is used to create new objects by cloning existing ones rather than creating them from scratch. This is useful when object creation is expensive or complex.

When to use:

When object creation is costly (e.g., involves DB queries, network calls, or heavy computation)

When you want to avoid subclasses of an object creator

When you need many variations of an object

Key components:

Prototype interface (typically extends Cloneable)

clone() method implementation

Concrete prototypes
 
Structural Patterns

Structural patterns deal with object composition — how classes and objects are composed to form larger structures while keeping them flexible and efficient.

1. Adapter Pattern
   📂 structural/adapter/

The Adapter Pattern allows incompatible interfaces to work together. It acts as a bridge between two incompatible interfaces by wrapping one interface with another.

When to use:

When you want to use an existing class but its interface doesn't match what you need

When integrating third-party libraries or legacy code

When you need to reuse existing classes in a new system

Key components:

Target interface (what the client expects)

Adaptee (the existing incompatible class)

Adapter class (implements Target, wraps Adaptee)

Types:

Class Adapter (uses inheritance)

Object Adapter (uses composition — preferred)

Bridge Pattern
   📂 structural/bridge/

The Bridge Pattern decouples an abstraction from its implementation so that both can vary independently. It splits a large class or a set of closely related classes into two separate hierarchies.

When to use:

When you want to avoid a permanent binding between abstraction and implementation

When both abstraction and implementation should be extensible via subclassing

When you want to avoid a "class explosion" from combining multiple dimensions of variation

Key components:

Abstraction (high-level control)

RefinedAbstraction (extends Abstraction)

Implementor interface (low-level operations)

ConcreteImplementor classes

Example idea: Shape (Abstraction) + Color (Implementor) — each can vary independently.

Decorator Pattern
   📂 structural/decorator/

The Decorator Pattern attaches additional responsibilities to an object dynamically. It provides a flexible alternative to subclassing for extending functionality.

When to use:

When you need to add responsibilities to individual objects without affecting others

When extending functionality by subclassing is impractical (too many combinations)

When you want to add/remove features at runtime

Key components:

Component interface

ConcreteComponent (base object)

Decorator (abstract, wraps a Component)

ConcreteDecorator classes (add behavior)

Example idea: A Coffee base, decorated with Milk, Sugar, Whip — each adds cost and description.

🎯 Pattern Cheat Sheet
Category	Pattern	Purpose
Creational	Factory	Create objects without exposing logic
Creational	Abstract Factory	Create families of related objects
Creational	Singleton	Ensure a single instance exists
Creational	Prototype	Clone existing objects
Structural	Adapter	Make incompatible interfaces work together
Structural	Bridge	Separate abstraction from implementation
Structural	Decorator	Add behavior dynamically

🚀 How to Run
Clone the repository

Open the project in your IDE (IntelliJ IDEA, Eclipse, VS Code)

Navigate to any pattern folder

Run the Main (or demo) class of that pattern

Observe the console output to see the pattern in action

bash
# Example using Maven
mvn compile
mvn exec:java -Dexec.mainClass="creational.singleton.Main"
🛠️ Tech Stack
Language: Java

Build Tool: Maven / Gradle (or plain javac)

JDK Version: 8+

📖 Learning Objectives
By exploring this project, you will be able to:

✅ Understand when and why to apply each design pattern

✅ Recognize real-world scenarios where patterns solve design problems

✅ Write more maintainable, flexible, and reusable code

✅ Communicate design decisions using a shared vocabulary

🤝 Contributing
Contributions are welcome! If you'd like to add more patterns or improve existing implementations:

Fork the repository

Create a feature branch (git checkout -b feature/new-pattern)

Commit your changes (git commit -m 'Add new pattern')

Push to the branch (git push origin feature/new-pattern)

Open a Pull Request

📚 References
Design Patterns: Elements of Reusable Object-Oriented Software — Gang of Four

Head First Design Patterns — Eric Freeman & Elisabeth Robson

Refactoring.Guru — Design Patterns





