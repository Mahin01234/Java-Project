<!-- PROJECT SHIELDS -->
<div align="center">

[![Java Version](https://img.shields.io/badge/Java-8%2B-blue.svg)](https://www.java.com/)

</div>

<!-- PROJECT LOGO -->
<br />
<div align="center">
  <h1>🎮 Java Console Games Collection</h1>
  <p>
    A collection of classic console-based games written in Java. Perfect for beginners looking to understand core Java concepts like random number generation, user input handling, conditional logic, loops, array manipulation, and basic AI.
    <br />
    <a href="#-games-included"><strong>Explore the games »</strong></a>
    <br />
    <br />
    <a href="https://github.com/Mahin01234/Java-Project">View Repository</a>
    ·
    <a href="https://github.com/Mahin01234/Java-Project/issues">Report Bug</a>
    ·
    <a href="https://github.com/Mahin01234/Java-Project/issues">Request Feature</a>
  </p>
</div>

---

## 📋 Table of Contents

- [📌 Project Overview](#-project-overview)
- [🎲 Games Included](#-games-included)
  - [🔢 Number Guessing Game](#-number-guessing-game)
  - [⭕ Tic-Tac-Toe (Single Player)](#-tic-tac-toe-single-player)
  - [🎲 Random Number Example](#-random-number-example)
- [📂 Project Structure](#-project-structure)
- [🚀 How to Run](#-how-to-run)
- [🧠 Skills You'll Learn](#-skills-youll-learn)
- [🔮 Future Improvements](#-future-improvements)
- [🤝 Contributing](#-contributing)
- [📄 License](#-license)
- [📧 Contact](#-contact)

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
🎯 Welcome to the Number Guessing Game!
I have chosen a number between 1 and 100.
You have 5 attempts to guess it.

Attempt 1: 50
📉 Too low!

Attempt 2: 75
📈 Too high!

Attempt 3: 62
📉 Too low!

Attempt 4: 68
📈 Too high!

Attempt 5: 65
❌ Out of attempts! The number was 66.

text

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
1 | 2 | 3
---+---+---
4 | 5 | 6
---+---+---
7 | 8 | 9

text

**Sample Gameplay:**
🎮 Welcome to Tic-Tac-Toe!
You are X, Computer is Y.

1 | 2 | 3
---+---+---
4 | 5 | 6
---+---+---
7 | 8 | 9

Your turn! Enter position (1-9): 5

1 | 2 | 3
---+---+---
4 | X | 6
---+---+---
7 | 8 | 9

Computer chose position 1

Y | 2 | 3
---+---+---
4 | X | 6
---+---+---
7 | 8 | 9

...

🏆 Player wins!
Score - Player: 1 | Computer: 0
Play again? (y/n): n
Thanks for playing!

text

---

### 🎲 Random Number Example

**File:** `Random_Number.java`

A minimal demo showing how to generate random numbers in Java. Useful for understanding the foundation used in the guessing game.

**How it works:**
- Generates a random number between 1 and 100
- Takes user guesses in a loop
- Provides "too large" / "too small" feedback
- Runs until the correct number is guessed

**Sample Code:**

java
import java.util.Random;
import java.util.Scanner;

public class Random_Number {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        
        int target = random.nextInt(100) + 1;
        int guess;
        int attempts = 0;
        
        System.out.println("🎯 Guess the number between 1 and 100!");
        
        do {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            attempts++;
            
            if (guess > target) {
                System.out.println("📉 Too large!");
            } else if (guess < target) {
                System.out.println("📈 Too small!");
            }
        } while (guess != target);
        
        System.out.println("🎉 Correct! You guessed it in " + attempts + " attempts.");
        scanner.close();
    }
}

---
### 📂 Project Structure:
text
Java-Project/
├── NumberGuessingGame.java      # Number guessing game with 5 attempts
├── TicTacToeSinglePlayer.java   # Tic-Tac-Toe with AI opponent
├── Random_Number.java           # Simple random number guessing demo
└── README.md                    # Project documentation

---
### 🚀 How to Run
Prerequisites
Java JDK 8 or higher – Download from Oracle

Any text editor or IDE (VS Code, IntelliJ IDEA, Eclipse, or NetBeans)

Steps
Clone the repository

bash
git clone https://github.com/Mahin01234/Java-Project.git
cd Java-Project
Compile the desired game

bash
javac NumberGuessingGame.java
Run the compiled class

bash
java NumberGuessingGame
For other games:

bash
javac TicTacToeSinglePlayer.java
java TicTacToeSinglePlayer
bash
javac Random_Number.java
java Random_Number


---

### 🧠 Skills You'll Learn
By studying and modifying these programs, you will gain practical experience with:

Random Number Generation – using java.util.Random

User Input – using java.util.Scanner

Control Flow – if-else, switch, loops

Arrays – 1D and 2D arrays for game boards

Methods – breaking down logic into reusable functions

Basic AI Logic – decision-making algorithms

Score Tracking – persistent state across game rounds

Input Validation – handling invalid user input gracefully

---

### 🔮 Future Improvements
Ideas for extending this project:

□ Add difficulty levels to Number Guessing Game
□ Implement two-player mode for Tic-Tac-Toe
□ Add a graphical user interface (GUI) using Swing/JavaFX
□ Create a menu system to select different games
□ Add unit tests using JUnit
□ Implement a Connect Four game
□ Add color-coded console output using ANSI escape codes

---
### 🤝 Contributing
Contributions are welcome! If you have improvements, new games, or bug fixes, please follow these steps:

Fork the repository.

Create a new branch (git checkout -b feature/your-feature).

Make your changes and commit them (git commit -m 'Add some feature').

Push to the branch (git push origin feature/your-feature).

Open a pull request.

Please ensure your code is well-commented and follows standard Java conventions.

---
### 📄 License
Distributed under the MIT License. See LICENSE for more information.

---

