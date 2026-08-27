# 📚🎮 Java Projects Collection

<div align="center">

A collection of Java projects including a **Library Management System** and several **console-based games**. These projects demonstrate important Java concepts such as OOP, Java Swing, JDBC, database operations, random number generation, arrays, loops, conditional logic, and basic AI.

</div>

---

## 📋 Table of Contents

- [📌 Project Overview](#-project-overview)
- [📚 Library Management System](#-library-management-system)
- [🎮 Java Console Games](#-java-console-games)
- [✨ Features](#-features)
- [📂 Project Structure](#-project-structure)
- [🗄️ Database Schema](#️-database-schema)
- [🛠️ Technology Stack](#️-technology-stack)
- [🚀 How to Run](#-how-to-run)
- [🧠 Skills You Will Learn](#-skills-you-will-learn)
- [🔮 Future Improvements](#-future-improvements)
- [🤝 Contributing](#-contributing)
- [📄 License](#-license)
- [📧 Contact](#-contact)

---

## 📌 Project Overview

This repository contains multiple Java projects designed for learning and practicing core Java programming concepts.

| Project | Description |
| :--- | :--- |
| 📚 **Library Management System** | A Java Swing desktop application for managing library books |
| 🔢 **Number Guessing Game** | Guess a randomly generated number within limited attempts |
| ⭕ **Tic-Tac-Toe** | Play Tic-Tac-Toe against a simple AI |
| 🎲 **Random Number Example** | A simple Java program demonstrating random number generation |

These projects demonstrate both **Graphical User Interface (GUI)** development and **Console-based** programming.

---

## 📚 Library Management System

A comprehensive desktop application built with **Java Swing** for managing library book records.

### 🚀 Features

- 🔐 **Secure Login** – ID and password protected access  
- ➕ **Add Books** – Insert new books with all details  
- 👁️ **View All Books** – Display records in a sortable table  
- ✏️ **Update Books** – Modify existing book details  
- 🗑️ **Remove Books** – Delete books permanently  
- 🔎 **Search Books** – Find books by ID or title  
- 🚪 **Logout** – End session safely  
- 📊 **Table-based display** with dropdown genre filters  
- 🗄️ **JDBC connectivity** for persistent storage  

### 🔐 Default Login

| Field | Value |
| :--- | :--- |
| **ID** | `admin` |
| **Password** | `admin123` |

### 📖 Book Information

Each book record contains:

- **Book ID** (Primary Key – duplicates rejected)
- **Title**
- **Genre**
- **Author**
- **Publisher**
- **Year of Publication (YOP)**

---

## 🖼️ Screenshots & Workflow

All screenshots are stored in the `screenshots/` folder.

| Step | Screenshot | Description |
| :--- | :--- | :--- |
| 1 | `1.png` | Login Window |
| 2 | `2.png` | Add Book Form |
| 3 | `3.png` | View All Books Table |
| 4 | `4.png` | Update Book Popup |
| 5 | `5.png` | Updated Book Record |
| 6 | `6.png` | Remove Book Confirmation |
| 7 | `7.png` | Book Removed Successfully |

---

## 🎮 Java Console Games

This repository also contains simple console-based Java programs for practicing fundamental programming concepts.

### 🔢 Number Guessing Game

**File:** `NumberGuessingGame.java`

The computer chooses a random number between **1 and 100**. The player has **5 attempts** to guess correctly.

**Features:**
- Random number generation
- 5 attempts limit
- *Too high* / *Too low* hints
- Displays the correct answer if the player loses

---

### ⭕ Tic-Tac-Toe (Single Player)

**File:** `TicTacToeSinglePlayer.java`

Play Tic-Tac-Toe against a simple computer AI.

- **Player:** `X`
- **Computer:** `Y`

**Features:**
- 3×3 game board
- Player vs Computer
- Win detection
- Computer win logic
- Blocks player's winning move
- Chooses random available move
- Score tracking
- Multiple rounds
- Input validation

**AI Decision Logic:**
1. Win if possible
2. Block the player's winning move
3. Choose a random available position

**Board Layout:**


1 | 2 | 3
---+---+---
4 | 5 | 6
---+---+---
7 | 8 | 9





---

### 🎲 Random Number Example

**File:** `Random_Number.java`

A simple program demonstrating random number generation and user input.

**Features:**
- Generates a random number between 1 and 100
- Takes user input using `Scanner`
- Provides *Too Large* / *Too Small* feedback
- Continues until the correct answer is guessed

---

## ✨ Features (Summary)

### 📚 Library Management System
- Login System
- Add / View / Update / Delete / Search Books
- Logout
- Database CRUD Operations
- Java Swing GUI

### 🎮 Console Games
- Number Guessing Game
- Tic-Tac-Toe with AI
- Random Number Program
- Basic AI Logic
- Score Tracking
- Input Validation

---

## 📂 Project Structure

Java-Project/
│
├── LibraryManagementSystem/
│ ├── src/
│ │ └── libraryManagementSystem/
│ │ ├── Main.java
│ │ ├── Login.java
│ │ ├── Dashboard.java
│ │ ├── Book.java
│ │ ├── BookDAO.java
│ │ ├── DatabaseConnection.java
│ │ └── resources/
│ │ └── images/
│ │
│ ├── screenshots/
│ │ ├── 1.png
│ │ ├── 2.png
│ │ ├── 3.png
│ │ ├── 4.png
│ │ ├── 5.png
│ │ ├── 6.png
│ │ └── 7.png
│ │
│ ├── lib/ # External JAR files (JDBC driver)
│ └── config.properties # Database configuration
│
├── NumberGuessingGame.java
├── TicTacToeSinglePlayer.java
├── Random_Number.java
├── README.md
└── LICENSE




---

## 🗄️ Database Schema

```sql
CREATE TABLE books (
    book_id INT PRIMARY KEY,
    title VARCHAR(255) NOT NULL,
    genre VARCHAR(100),
    author VARCHAR(255),
    publisher VARCHAR(255),
    yop DATE
);

The Library Management System supports:

MySQL

SQLite

Any other JDBC-compliant database

🛠️ Technology Stack
Technology	Usage
Java	Main Programming Language
Java Swing	Graphical User Interface
JDBC	Database Connectivity
MySQL / SQLite	Database
Random	Random Number Generation
Scanner	User Input
Arrays	Game Board Management
OOP	Object-Oriented Programming
🚀 How to Run
Prerequisites
Java JDK 8 or higher

MySQL or SQLite (for LMS)

Any Java IDE (IntelliJ IDEA, Eclipse, NetBeans, VS Code)

📚 Run the Library Management System
Configure the Database
Update connection details in DatabaseConnection.java or config.properties.

Create the Table
Run the provided SQL query to create the books table.

Add JDBC Driver
Download the required driver JAR and place it inside the lib/ folder.

Compile and Run

bash
javac -cp "lib/*" src/libraryManagementSystem/*.java
java -cp ".;lib/*" libraryManagementSystem.Main
On Linux/macOS, use : instead of ; in the classpath.

Alternatively, open the project in your IDE and run Main.java.

🎮 Run the Console Games
Number Guessing Game:

bash
javac NumberGuessingGame.java
java NumberGuessingGame
Tic-Tac-Toe:

bash
javac TicTacToeSinglePlayer.java
java TicTacToeSinglePlayer
Random Number Program:

bash
javac Random_Number.java
java Random_Number
🧠 Skills You Will Learn
Core Java
Variables and Data Types

Conditional Statements

Loops

Methods

User Input (Scanner)

Object-Oriented Programming
Classes and Objects

Encapsulation

Inheritance

Polymorphism

Abstraction

Java GUI (Swing)
JFrame, JPanel, JButton

JTextField, JTable

Event Handling

Database
JDBC

SQL Queries

CRUD Operations

Game Development Basics
Random Number Generation

Arrays and 2D Arrays

Basic AI Logic

Score Tracking

Input Validation

🔮 Future Improvements
□ Add Book Issue and Return System
□ Add User Registration
□ Add Multiple User Roles (Admin, Librarian, Member)
□ Add Password Encryption
□ Add Fine Calculation for overdue books
□ Add Advanced Book Search (by genre, author, year)
□ Add GUI for Console Games
□ Add Two-Player Mode for Tic-Tac-Toe
□ Add Difficulty Levels (Easy, Medium, Hard)
□ Add More Games (Connect Four, Hangman, etc.)
□ Add Unit Tests with JUnit
🤝 Contributing
Contributions are welcome! Please follow these steps:

Fork the repository.

Create a new branch:

bash
git checkout -b feature/AmazingFeature
Make your changes and commit:

bash
git commit -m "Add some feature"
Push to your branch:

bash
git push origin feature/AmazingFeature
Open a Pull Request.

Please ensure your code is clean, well-commented, and follows standard Java coding conventions.

📄 License
This project is distributed under the MIT License.
See the LICENSE file for more information.



