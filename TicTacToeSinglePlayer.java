import java.util.Scanner;
import java.util.Random;

public class TicTacToeSinglePlayer {
    
    private static char[][] board = {
        {' ', ' ', ' '},
        {' ', ' ', ' '},
        {' ', ' ', ' '}
    };
    
    private static Scanner sc = new Scanner(System.in);
    private static Random rand = new Random();
    
    private static int playerScore = 0;
    private static int computerScore = 0;
    private static int drawCount = 0;
    
    public static void main(String[] args) {
        System.out.println("=== Tic-Tac-To ===");
        System.out.println("You play as X. Computer plays as Y.\n");
        
        boolean playAgain = true;
        
        while (playAgain) {
            resetBoard();
            char currentPlayer = 'X';
            boolean gameEnded = false;
            
            while (!gameEnded) {
                printBoardWithNumbers();
                
                if (currentPlayer == 'X') {
                    System.out.print("Your move (1-9): ");
                    int move = getValidMove();
                    placeMove(move, 'X');
                } else {
                    System.out.println("Computer is thinking...");
                    int move = getComputerMove();
                    placeMove(move, 'Y');
                    System.out.println("Computer placed Y at position " + move);
                }
                
                if (checkWin(currentPlayer)) {
                    printBoard();
                    if (currentPlayer == 'X') {
                        System.out.println("\nYou won!");
                        playerScore++;
                    } else {
                        System.out.println("\nComputer won!");
                        computerScore++;
                    }
                    gameEnded = true;
                } else if (isBoardFull()) {
                    printBoard();
                    System.out.println(" It's a draw!");
                    drawCount++;
                    gameEnded = true;
                } else {
                    currentPlayer = (currentPlayer == 'X') ? 'Y' : 'X';
                }
            }
            
            showScore();
            
            System.out.print("\nPlay again? (Y/N): ");
            String choice = sc.next();
            if (!choice.equalsIgnoreCase("y")) {
                playAgain = false;
                System.out.println("Thanks for playing!");
            }
        }
        
        sc.close();
    }
    
    private static void resetBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = ' ';
            }
        }
    }
    
    private static void showScore() {
        System.out.println("\n========== SCORE BOARD ==========");
        System.out.println("You (X) wins: " + playerScore);
        System.out.println("Computer (Y) wins: " + computerScore);
        System.out.println("Draws: " + drawCount);
        System.out.println("=================================");
    }
    
    private static int getValidMove() {
        while (true) {
            int move = sc.nextInt();
            if (move >= 1 && move <= 9 && isValidMove(move)) {
                return move;
            } else if (move < 1 || move > 9) {
                System.out.print("Invalid input! Enter a number between 1-9: ");
            } else {
                System.out.print("Cell already occupied! Choose another: ");
            }
        }
    }
    
    private static int getComputerMove() {
        // 1. Computer winning move
        for (int i = 1; i <= 9; i++) {
            if (isValidMove(i)) {
                placeMove(i, 'O');
                if (checkWin('O')) {
                    removeMove(i);
                    return i;
                }
                removeMove(i);
            }
        }
        // 2. Block player winning move
        for (int i = 1; i <= 9; i++) {
            if (isValidMove(i)) {
                placeMove(i, 'X');
                if (checkWin('X')) {
                    removeMove(i);
                    return i;
                }
                removeMove(i);
            }
        }
        // 3. Random move
        int move;
        do {
            move = rand.nextInt(9) + 1;
        } while (!isValidMove(move));
        return move;
    }
    
    private static void removeMove(int move) {
        int row = (move - 1) / 3;
        int col = (move - 1) % 3;
        board[row][col] = ' ';
    }
    
    private static void printBoardWithNumbers() {
        System.out.println("\n     |     |     ");
        System.out.println("  " + getCharOrNumber(0,0) + "  |  " + getCharOrNumber(0,1) + "  |  " + getCharOrNumber(0,2));
        System.out.println("_____|_____|_____");
        System.out.println("     |     |     ");
        System.out.println("  " + getCharOrNumber(1,0) + "  |  " + getCharOrNumber(1,1) + "  |  " + getCharOrNumber(1,2));
        System.out.println("_____|_____|_____");
        System.out.println("     |     |     ");
        System.out.println("  " + getCharOrNumber(2,0) + "  |  " + getCharOrNumber(2,1) + "  |  " + getCharOrNumber(2,2));
        System.out.println("     |     |     \n");
    }
    
    private static String getCharOrNumber(int row, int col) {
        if (board[row][col] == ' ') {
            int number = row * 3 + col + 1;
            return String.valueOf(number);
        } else {
            return String.valueOf(board[row][col]);
        }
    }
    
    private static void printBoard() {
        System.out.println("\n     |     |     ");
        System.out.println("  " + board[0][0] + "  |  " + board[0][1] + "  |  " + board[0][2]);
        System.out.println("_____|_____|_____");
        System.out.println("     |     |     ");
        System.out.println("  " + board[1][0] + "  |  " + board[1][1] + "  |  " + board[1][2]);
        System.out.println("_____|_____|_____");
        System.out.println("     |     |     ");
        System.out.println("  " + board[2][0] + "  |  " + board[2][1] + "  |  " + board[2][2]);
        System.out.println("     |     |     \n");
    }
    
    private static boolean isValidMove(int move) {
        if (move < 1 || move > 9) return false;
        int row = (move - 1) / 3;
        int col = (move - 1) % 3;
        return board[row][col] == ' ';
    }
    
    private static void placeMove(int move, char player) {
        int row = (move - 1) / 3;
        int col = (move - 1) % 3;
        board[row][col] = player;
    }
    
    private static boolean checkWin(char player) {
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == player && board[i][1] == player && board[i][2] == player)
                return true;
        }
        for (int i = 0; i < 3; i++) {
            if (board[0][i] == player && board[1][i] == player && board[2][i] == player)
                return true;
        }
        if (board[0][0] == player && board[1][1] == player && board[2][2] == player)
            return true;
        if (board[0][2] == player && board[1][1] == player && board[2][0] == player)
            return true;
        return false;
    }
    
    private static boolean isBoardFull() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == ' ')
                    return false;
            }
        }
        return true;
    }
}


