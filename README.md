# 🎮 Java Console Games Collection

[![Java Version](https://img.shields.io/badge/Java-8%2B-blue.svg)](https://www.java.com/)
[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT)
[![Code style](https://img.shields.io/badge/code_style-standard-brightgreen.svg)](https://www.oracle.com/java/technologies/javase.html)

A collection of classic console-based games written in Java. Perfect for beginners looking to understand core Java concepts like random number generation, user input handling, conditional logic, loops, array manipulation, and basic AI.

---

## 📋 Table of Contents

- [Project Overview](#project-overview)
- [Games Included](#games-included)
  - [Number Guessing Game](#-number-guessing-game)
  - [Tic-Tac-Toe (Single Player)](#-tic-tac-toe-single-player)
  - [Random Number Example](#-random-number-example)
- [Project Structure](#project-structure)
- [How to Run](#how-to-run)
- [Skills You'll Learn](#skills-youll-learn)
- [Future Improvements](#future-improvements)
- [Contributing](#contributing)
- [License](#license)
- [Author](#author)

---

## 📌 Project Overview

This repository contains three independent Java programs demonstrating fundamental programming concepts through interactive games. Each program runs entirely in the console/terminal and requires no external libraries.

| Concept | Applied In |
|---------|-------------|
| Random Number Generation | All three programs |
| User Input Handling (`Scanner`) | All three programs |
| Loops (`for`, `while`, `do-while`) | All three programs |
| Conditional Logic (`if-else`) | All three programs |
| 2D Arrays | Tic-Tac-Toe |
| Basic AI (Win/Block Logic) | Tic-Tac-Toe |
| Score Tracking Across Rounds | Tic-Tac-Toe |

---

## 🎲 Games Included

### 🔢 Number Guessing Game

**File:** `NumberGuessingGame.java`

A classic "guess the number" game where the computer picks a random number and you have 5 attempts to find it.

**Features:**
- Random number between 1 and 100
- 5 attempts to guess correctly
- "Too high" or "Too low" hints after each guess
- Reveals the answer if you fail

**Sample Gameplay:**




---

### ⭕ Tic-Tac-Toe (Single Player)

**File:** `TicTacToeSinglePlayer.java`

Play classic Tic-Tac-Toe against an AI opponent. You are `X`, computer is `Y`.

**Features:**
- Visual 3×3 board with numbered positions (1–9)
- Smart AI with 3 decision levels:
  1. **Win if possible** – takes a winning move
  2. **Block player's win** – blocks your winning move
  3. **Random move** – picks any available cell
- Persistent scoreboard across multiple rounds
- Input validation for occupied cells and invalid numbers

**Board Layout:**




**Sample Gameplay:**




---

### 🎲 Random Number Example

**File:** `Random_Number.java`

A minimal demo showing how to generate random numbers in Java. Useful for understanding the foundation used in the guessing game.

**How it works:**
- Generates a random number between 1 and 100
- Takes user guesses in a loop
- Provides "too large" / "too small" feedback
- Runs until the correct number is guessed

---


### Prerequisites
- **Java JDK 8 or higher** – [Download from Oracle](https://www.oracle.com/java/technologies/javase-downloads.html)
