# Library-Management-System-Java
A simple console-based Library Management System built in Java to practice object-oriented programming (OOP), exception handling, and basic system design.

## 🎯 Project Overview
This project simulates a library where users can:
* Add books and DVDs
* Borrow items
* Return items
* View library status

It demonstrates core OOP principles such as:
* Abstraction
* Inheritance
* Encapsulation
* Polymorphism
* Custom exceptions
* Interface implementation (Comparable)
  
**System Structure**

**LibraryItem (Abstract Class)**
* Represents a generic library item.
    
**Book**
* Represents a book in the library.
    
**DVD**
* Represents a DVD in the library.

**Library (Library System)**
* Manages library operations.
  * Stores:
    - Available items
    - Loaned items
  * Features:
    - Add items
    - Loaned items
    - Returned items
* Compare libraries (Comparable)
  
**LibraryException**
* Custom checked exception used for invalid operations such as:
  * Borrowing unavailable items
  * Returning non-loaned items

## 🖥️ LibraryApp
* Console-based interface that allows users to interact with the system through a menu.

## ⚙️ Features
✔ Add books and DVDs\
✔ Loaned items from the library\
✔ Returned items to the library\
✔ Track available vs borrowed items\
✔ Compare libraries based on available items\
✔ Exception handling for invalid operations\
✔ Interactive menu system (console-based)

## How to run
1. Compile all files\
   `javac *.java`
   
2. Run the application\
   `java LibraryApp`

## 🧠 Concepts Practiced
1. Object-Oriented Programming (OOP)
2. Abstract classes and inheritance
3. Method overriding (equals, getCost)
4. Interfaces (Comparable)
5. Java Collections (List)
6. Exception handling (custom exceptions)
7. Console-based user interaction

## 📌 Notes
* This project is intended for learning purposes.
* It focuses on design and OOP structure rather than advanced optimizations.
* Data is not persisted (in-memory only).
