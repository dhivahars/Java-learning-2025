# 📚 Library Management System (Java)

A simple **Object-Oriented Java project** that demonstrates core OOP concepts like **abstraction, inheritance, interfaces, and encapsulation** through a Library Management System.

---

## 🚀 Features
- Add, remove, and search library items (Books, Magazines, Newspapers).
- Track availability of items using the `Borrowable` interface.
- Calculate late fees for borrowed items.
- Polymorphic behavior with `displayInfo()` across different library items.
- Clean OOP-based design using abstract classes and interfaces.

---

## 🛠️ Project Structure
libraryMangement/
│
├── Book.java # Represents a Book (extends LibraryItem, implements Borrowable)
├── Magazine.java # Represents a Magazine (extends LibraryItem, implements Borrowable)
├── NewsPaper.java # Represents a Newspaper (extends LibraryItem)
├── Borrowable.java # Interface defining borrow() and returnBook()
├── LibraryItem.java # Abstract base class for all library items
├── LibraryManager.java# Manages library operations (add, remove, search, display, late fees)
└── Main.java # Entry point for testing the system

---

## 📄 Class Overview

### 🔹 `LibraryItem` (Abstract Class)
- Common base for all library items.
- Attributes: `id`, `title`, `author`, `isAvailable`.
- Abstract method: `displayInfo()`.

### 🔹 `Borrowable` (Interface)
- Defines **borrowing functionality**:
    - `borrow()`
    - `returnBook()`

### 🔹 `Book`
- Extends `LibraryItem` and implements `Borrowable`.
- Additional attributes: `genre`, `pages`.

### 🔹 `Magazine`
- Extends `LibraryItem` and implements `Borrowable`.
- Additional attribute: `edition`.

### 🔹 `NewsPaper`
- Extends `LibraryItem`.
- Additional attribute: `dateOfIssue`.

### 🔹 `LibraryManager`
- Manages all items in the library.
- Key methods:
    - `addItems(LibraryItem item)`
    - `removeItems(int id)` / `removeItems(String title)`
    - `searchBook(int id)` / `searchBook(String title)`
    - `displayAllItem()`
    - `getLateFee(int daysLate)`

### 🔹 `Main`
- Demonstrates usage of the system:
    - Adds items.
    - Displays all items.
    - Removes an item.
    - Searches by ID/title.
    - Calculates late fees.

---

## 🖥️ Example Run
```text
Harry Potter has been added
Abbb has been added
The Hindu has been added
Harry Potter
Abbb
The Hindu
The Hindu is Removed
Abbb is found
200.0
```
---

## 📄 Class Overview

### 🔹 `LibraryItem` (Abstract Class)
- Common base for all library items.
- Attributes: `id`, `title`, `author`, `isAvailable`.
- Abstract method: `displayInfo()`.

### 🔹 `Borrowable` (Interface)
- Defines **borrowing functionality**:
  - `borrow()`
  - `returnBook()`

### 🔹 `Book`
- Extends `LibraryItem` and implements `Borrowable`.
- Additional attributes: `genre`, `pages`.

### 🔹 `Magazine`
- Extends `LibraryItem` and implements `Borrowable`.
- Additional attribute: `edition`.

### 🔹 `NewsPaper`
- Extends `LibraryItem`.
- Additional attribute: `dateOfIssue`.

### 🔹 `LibraryManager`
- Manages all items in the library.
- Key methods:
  - `addItems(LibraryItem item)`
  - `removeItems(int id)` / `removeItems(String title)`
  - `searchBook(int id)` / `searchBook(String title)`
  - `displayAllItem()`
  - `getLateFee(int daysLate)`

### 🔹 `Main`
- Demonstrates usage of the system:
  - Adds items.
  - Displays all items.
  - Removes an item.
  - Searches by ID/title.
  - Calculates late fees.

---

## 🖥️ Example Run
```text
Harry Potter has been added
Abbb has been added
The Hindu has been added
Harry Potter
Abbb
The Hindu
The Hindu is Removed
Abbb is found
200.0
How to Run
```
1.Clone the repository.
2.Open the project in IntelliJ IDEA or any Java IDE.
3.Run the Main.java file.
Concepts Used

Abstraction → LibraryItem is abstract.

Inheritance → Book, Magazine, and NewsPaper extend LibraryItem.

Interfaces → Borrowable implemented by Book and Magazine.

Encapsulation → Private fields with getters and setters.

Polymorphism → displayInfo() overridden in each subclass.
