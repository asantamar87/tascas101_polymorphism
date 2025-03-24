# Java Object-Oriented Programming Exercises

## Description
This repository contains Java exercises that focus on object-oriented programming (OOP) principles, including inheritance, polymorphism, interfaces, abstract classes, static methods, and more. 
The exercises are divided into three levels, each with increasing complexity.

## Level 1
### Exercise 1: Musicals instruments


In a music group, there are different types of musical instruments: wind, string, and percussion instruments.

All instruments have attributes: name and price.

An abstract class Instrument with an abstract method play().

The play() method must be implemented in child classes:

Wind instruments: "A wind instrument is playing."

String instruments: "A string instrument is playing."

Percussion instruments: "A percussion instrument is playing."

Demonstrate that a class is loaded only once, either by creating an instance or accessing a static member.

Research initialization blocks and static blocks in Java.
- Abstract class `Instrument` with method `play()`.
- Wind, string, and percussion instruments.
- Demonstration of class loading via instance creation or static member access.

### Exercise 2: Car Class
- Attributes: `brand` (static final), `model` (static), `power` (final).
- Methods: `brake()` (static), `accelerate()` (non-static).
- Demonstration of static vs. non-static attributes and methods.

## Level 2
### Exercise 1: Smartphone
- `Phone` class with `call()` method.
- Interfaces: `Camera` (`takePhoto()`), `Clock` (`alarm()`).
- `Smartphone` class extends `Phone` and implements both interfaces.
- Methods: `takePhoto()`, `alarm()`.
- Demonstration in `main()` method.

## Level 3
### Exercise 1: Sports News Editorial
- `Journalist`: `name`, `ID` (immutable), `salary` (shared).
- `News` article: `headline`, `text`, `score`, `price`.
- Sport-specific attributes (Soccer, Basketball, Tennis, F1, Motorcycling).
- Methods: `calculateNewsPrice()`, `calculateNewsScore()`.
- Menu options:
    1. Add journalist.
    2. Remove journalist.
    3. Add news to a journalist.
    4. Remove news.
    5. Show all news by journalist.
    6. Calculate news score.
    7. Calculate news price.

## Author
- [**Aldo Santa María**]
