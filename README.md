📚🎮 Java Projects Collection

<div align="center">

A collection of Java projects including a Library Management System and several console-based games. These projects demonstrate important Java concepts such as OOP, Java Swing, JDBC, database operations, random number generation, arrays, loops, conditional logic, and basic AI.



</div>

📋 Table of Contents

📌 Project Overview

📚 Library Management System

🎮 Java Console Games

✨ Features

📂 Project Structure

🗄️ Database Schema

🛠️ Technology Stack

🚀 How to Run

🧠 Skills You Will Learn

🔮 Future Improvements

🤝 Contributing

📄 License

📧 Contact

📌 Project Overview

This repository contains multiple Java projects designed for learning and practicing core Java programming concepts.

Project

Description

📚 Library Management System

A Java Swing desktop application for managing library books

🔢 Number Guessing Game

Guess a randomly generated number within limited attempts

⭕ Tic-Tac-Toe

Play Tic-Tac-Toe against a simple AI

🎲 Random Number Example

A simple Java program demonstrating random number generation

These projects demonstrate both Graphical User Interface (GUI) development and Console-based programming.

📚 Library Management System

A comprehensive desktop application built with Java Swing for managing library book records.

🚀 Features

🔐 Secure Login

➕ Add Books

👁️ View All Books

✏️ Update Books

🗑️ Remove Books

🔎 Search Books

🚪 Logout

📊 Table-based book display

🗄️ Database connectivity using JDBC

🔐 Default Login

ID: admin
Password: admin123

📖 Book Information

Each book contains:

Book ID

Title

Genre

Author

Publisher

Year of Publication

Duplicate Book IDs are rejected.

🖼️ Screenshots & Workflow

All screenshots are stored in the screenshots/ folder.

Step

Screenshot

Description

1

1.png

Login Window

2

2.png

Add Book

3

3.png

View Books

4

4.png

Update Book

5

5.png

Updated Book Record

6

6.png

Remove Book

7

7.png

Book Removed Successfully

🎮 Java Console Games

This repository also contains simple console-based Java programs for practicing fundamental programming concepts.

🔢 Number Guessing Game

File: NumberGuessingGame.java

The computer chooses a random number between 1 and 100. The player has 5 attempts to guess the correct number.

Features

Random number generation

5 attempts

Too high / Too low hints

Displays the correct answer if the player loses

⭕ Tic-Tac-Toe (Single Player)

File: TicTacToeSinglePlayer.java

Play Tic-Tac-Toe against a simple computer AI.

Player: X

Computer: Y

Features

3×3 game board

Player vs Computer

Win detection

Computer win logic

Block player's winning move

Random available move

Score tracking

Multiple rounds

Input validation

AI Decision Logic

Win if possible

Block the player's winning move

Choose a random available position

Board Layout

1 | 2 | 3
---+---+---
4 | 5 | 6
---+---+---
7 | 8 | 9

🎲 Random Number Example

File: Random_Number.java

A simple program demonstrating how to generate and guess a random number.

Features

Generates a random number between 1 and 100

Takes user input using Scanner

Provides Too Large / Too Small feedback

Continues until the correct answer is guessed

✨ Features

📚 Library Management System

Login System

Add Books

View Books

Update Books

Delete Books

Search Books

Logout

Database CRUD Operations

Java Swing GUI

🎮 Console Games

Number Guessing Game

Tic-Tac-Toe with AI

Random Number Program

Basic AI Logic

Score Tracking

Input Validation

📂 Project Structure

Java-Project/
│
├── LibraryManagementSystem/
│   ├── src/
│   │   └── libraryManagementSystem/
│   │       ├── Main.java
│   │       ├── Login.java
│   │       ├── Dashboard.java
│   │       ├── Book.java
│   │       ├── BookDAO.java
│   │       ├── DatabaseConnection.java
│   │       └── resources/
│   │           └── images/
│   │
│   ├── screenshots/
│   │   ├── 1.png
│   │   ├── 2.png
│   │   ├── 3.png
│   │   ├── 4.png
│   │   ├── 5.png
│   │   ├── 6.png
│   │   └── 7.png
│   │
│   ├── lib/
│   └── config.properties
│
├── NumberGuessingGame.java
├── TicTacToeSinglePlayer.java
├── Random_Number.java
├── README.md
└── LICENSE

🗄️ Database Schema

CREATE TABLE books (
    book_id INT PRIMARY KEY,
    title VARCHAR(255) NOT NULL,
    genre VARCHAR(100),
    author VARCHAR(255),
    publisher VARCHAR(255),
    yop DATE
);

The Library Management System can use:

MySQL

SQLite

Other JDBC-supported databases

🛠️ Technology Stack

Technology

Usage

Java

Main Programming Language

Java Swing

Graphical User Interface

JDBC

Database Connectivity

MySQL / SQLite

Database

Random

Random Number Generation

Scanner

User Input

Arrays

Game Board Management

OOP

Object-Oriented Programming

🚀 How to Run

Prerequisites

Java JDK 8 or higher

MySQL or SQLite for the Library Management System

Any Java IDE such as IntelliJ IDEA, Eclipse, NetBeans, or VS Code

📚 Run the Library Management System

1. Configure the Database

Update your database information in:

DatabaseConnection.java

or:

config.properties

2. Create the Table

Run the provided SQL query to create the books table.

3. Add JDBC Driver

Download the required JDBC driver and place it inside the lib/ folder.

4. Compile and Run

javac -cp "lib/*" src/libraryManagementSystem/*.java
java -cp ".;lib/*" libraryManagementSystem.Main

You can also open the project in your IDE and run Main.java.

Note: On Linux/macOS, use : instead of ; in the classpath.

🎮 Run the Console Games

Number Guessing Game

javac NumberGuessingGame.java
java NumberGuessingGame

Tic-Tac-Toe

javac TicTacToeSinglePlayer.java
java TicTacToeSinglePlayer

Random Number Program

javac Random_Number.java
java Random_Number

🧠 Skills You Will Learn

Core Java

Variables and Data Types

Conditional Statements

Loops

Methods

User Input

Object-Oriented Programming

Classes and Objects

Encapsulation

Inheritance

Polymorphism

Abstraction

Java GUI

Java Swing

JFrame

JPanel

JButton

JTextField

JTable

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

Add Book Issue and Return System

Add User Registration

Add Multiple User Roles

Add Password Encryption

Add Fine Calculation

Add Advanced Book Search

Add GUI for Console Games

Add Two-Player Mode to Tic-Tac-Toe

Add Difficulty Levels

Add More Games

Implement Connect Four

Add Unit Tests with JUnit

🤝 Contributing

Contributions are welcome!

Fork the repository.

Create a new branch:

git checkout -b feature/AmazingFeature

Make your changes.

Commit your changes:

git commit -m "Add some feature"

Push to GitHub:

git push origin feature/AmazingFeature

Open a Pull Request.

Please ensure that your code is clean, well-commented, and follows standard Java coding conventions.

📄 License

This project is distributed under the MIT License.

See the LICENSE file for more information.

🙏 Acknowledgements

Special thanks to:

Oracle for Java documentation

Open-source JDBC contributors

Java developer community

Open-source contributors

📧 Contact

Developer: Mahinur Rahman Mahin

Project Repository:
https://github.com/Mahin01234/Java-Project
