# 🎮 Java Console Games Collection

<div align="center">

A collection of beginner-friendly Java console applications designed to demonstrate fundamental programming concepts through interactive games and practical examples.

</div>

---

## 📋 Table of Contents

- [📌 Overview](#-overview)
- [🎮 Projects](#-projects)
  - [🔢 Number Guessing Game](#-number-guessing-game)
  - [⭕ Tic-Tac-Toe](#-tic-tac-toe-single-player)
  - [🎲 Random Number Example](#-random-number-example)
- [🖼️ Screenshots](#️-screenshots)
- [📂 Project Structure](#-project-structure)
- [🛠️ Technologies & Concepts](#️-technologies--concepts)
- [🚀 Getting Started](#-getting-started)
- [🧠 What You Will Learn](#-what-you-will-learn)
- [🔮 Future Improvements](#-future-improvements)
- [🤝 Contributing](#-contributing)
- [📧 Contact](#-contact)

---

## 📌 Overview

This repository contains a collection of Java console-based applications created to practice and demonstrate core programming concepts.

The projects cover topics such as:

- Object-oriented programming fundamentals
- User input and validation
- Conditional statements
- Loops
- Arrays and 2D arrays
- Random number generation
- Methods
- Basic AI logic
- Game logic and win detection
- Score tracking

| Project | Description |
| :--- | :--- |
| 🔢 **Number Guessing Game** | Guess a randomly generated number within a limited number of attempts |
| ⭕ **Tic-Tac-Toe** | Play Tic-Tac-Toe against a simple computer opponent |
| 🎲 **Random Number Example** | A basic program demonstrating random number generation and user interaction |

---

# 🎮 Projects

## 🔢 Number Guessing Game

**File:** `NumberGuessingGame.java`

A classic number guessing game where the computer generates a random number between **1 and 100**. The player must guess the correct number within a limited number of attempts.

### Features

- Random number generation
- Number range from 1 to 100
- Limited attempts
- Too High and Too Low hints
- Success message for a correct guess
- Displays the correct answer when all attempts are used

---

## ⭕ Tic-Tac-Toe (Single Player)

**File:** `TicTacToeSinglePlayer.java`

A single-player Tic-Tac-Toe game where the user plays against a simple computer opponent.

| Player | Symbol |
| :--- | :--- |
| User | `X` |
| Computer | `Y` |

### Features

- 3×3 game board
- Player vs Computer gameplay
- Win detection
- Basic computer AI
- Computer takes a winning move when possible
- Computer blocks the player's winning move
- Random available move selection
- Score tracking
- Multiple rounds
- Input validation

### 🤖 AI Decision Logic

The computer follows the following priority:

1. **Win** – Take a winning move if available.
2. **Block** – Prevent the player from winning.
3. **Random Move** – Select an available position.

### Board Layout

```text
1 | 2 | 3
---+---+---
4 | 5 | 6
---+---+---
7 | 8 | 9
```

---

## 🎲 Random Number Example

**File:** `Random_Number.java`

A simple Java program demonstrating how to generate random numbers and compare user input with a target value.

### Features

- Generates a random number between 1 and 100
- Accepts user input using `Scanner`
- Provides Too Large / Too Small feedback
- Continues until the correct number is guessed
- Tracks the number of attempts

---

# 🖼️ Screenshots

The repository includes the following screenshot files:

| Screenshot | File |
| :--- | :--- |
| Screenshot 1 | `1.png` |
| Screenshot 2 | `2.png` |
| Screenshot 3 | `3.png` |
| Screenshot 4 | `4.png` |
| Screenshot 5 | `5.png` |
| Screenshot 6 | `6.png` |
| Screenshot 7 | `7.png` |

---

# 📂 Project Structure

```text
Java-Project/
│
├── 1.png
├── 2.png
├── 3.png
├── 4.png
├── 5.png
├── 6.png
├── 7.png
│
├── NumberGuessingGame.java
├── Random_Number.java
├── TicTacToeSinglePlayer.java
│
└── README.md
```

---

# 🛠️ Technologies & Concepts

| Technology / Concept | Purpose |
| :--- | :--- |
| **Java** | Main programming language |
| `java.util.Random` | Random number generation |
| `java.util.Scanner` | User input |
| Conditional Statements | Decision-making |
| Loops | Repeating program operations |
| Arrays | Data and game board management |
| 2D Arrays | Tic-Tac-Toe board representation |
| Methods | Organizing reusable program logic |
| Basic AI Logic | Computer decision-making |

---

# 🚀 Getting Started

## Prerequisites

Before running the projects, make sure you have:

- Java JDK 8 or higher
- A terminal or command prompt

You may also use any Java IDE, such as:

- IntelliJ IDEA
- Eclipse
- NetBeans
- Visual Studio Code

---

## 🔢 Run Number Guessing Game

Compile:

```bash
javac NumberGuessingGame.java
```

Run:

```bash
java NumberGuessingGame
```

---

## ⭕ Run Tic-Tac-Toe

Compile:

```bash
javac TicTacToeSinglePlayer.java
```

Run:

```bash
java TicTacToeSinglePlayer
```

---

## 🎲 Run Random Number Example

Compile:

```bash
javac Random_Number.java
```

Run:

```bash
java Random_Number
```

---

# 🧠 What You Will Learn

By exploring and modifying these projects, you can practice the following concepts.

## Core Java

- Variables and Data Types
- Operators
- Conditional Statements
- Loops
- Methods

## User Input

- Using `Scanner`
- Reading keyboard input
- Input validation

## Random Number Generation

- Using `java.util.Random`
- Generating random values
- Applying random numbers in games

## Arrays

- One-dimensional arrays
- Two-dimensional arrays
- Game board management

## Game Development Fundamentals

- Game loops
- Win detection
- Score tracking
- Multiple rounds
- Player versus computer gameplay

## Basic AI Logic

- Identifying possible winning moves
- Blocking opponent moves
- Selecting available positions

---

# 🔮 Future Improvements

Future improvements may include:

- [ ] Add difficulty levels to the Number Guessing Game
- [ ] Add a two-player mode to Tic-Tac-Toe
- [ ] Improve the computer AI
- [ ] Add a graphical user interface using Java Swing
- [ ] Create a main menu for selecting games
- [ ] Add additional Java games
- [ ] Implement Connect Four
- [ ] Implement Hangman
- [ ] Add automated tests using JUnit

---

# 🤝 Contributing

Contributions are welcome!

1. **Fork** the repository.

2. Create a new branch:

```bash
git checkout -b feature/AmazingFeature
```

3. Make your changes.

4. Commit your changes:

```bash
git commit -m "Add some feature"
```

5. Push your branch:

```bash
git push origin feature/AmazingFeature
```

6. Open a **Pull Request**.

Please ensure that your code is clean, properly formatted, and follows standard Java coding conventions.

---

# 📧 Contact

**Developer:** Mahinur Rahman Mahin

**GitHub Repository:**  
https://github.com/Mahin01234/Java-Project

---

<div align="center">

⭐ **If you find this project useful, consider giving it a star!**

Made with ❤️ using Java 

</div>
