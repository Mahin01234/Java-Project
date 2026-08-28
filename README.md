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

## 🎮 Projects

### 🔢 Number Guessing Game

**File:** `NumberGuessingGame.java`

A classic number guessing game where the computer generates a random number between **1 and 100**. The player must guess the correct number within a limited number of attempts.

#### Features

- Random number generation
- Number range from 1 to 100
- Limited attempts
- "Too High" and "Too Low" hints
- Success message for a correct guess
- Displays the correct answer when all attempts are used

---

### ⭕ Tic-Tac-Toe (Single Player)

**File:** `TicTacToeSinglePlayer.java`

A single-player Tic-Tac-Toe game where the user plays against a simple computer opponent.

| Player | Symbol |
| :--- | :--- |
| User | `X` |
| Computer | `Y` |

#### Features

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

#### 🤖 AI Decision Logic

The computer follows the following priority:

1. **Win** – Take a winning move if available.
2. **Block** – Prevent the player from winning.
3. **Random Move** – Select an available position.

#### Board Layout

```text
1 | 2 | 3
---+---+---
4 | 5 | 6
---+---+---
7 | 8 | 9


---


