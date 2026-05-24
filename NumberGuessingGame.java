import java.util.Scanner;

public class NumberGuessingGame
 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Generate a random number between 1 and 100
        int number = (int)(Math.random() * 100) + 1;
        int maxAttempts = 5;
        boolean guessedCorrectly = false;

        
        

        System.out.println("You have " + maxAttempts + " attempts.\n");

        for (int attempt = 1; attempt <= maxAttempts; attempt++) {
            System.out.print("Attempt " + attempt + " - Enter your guess: ");
            int guess = sc.nextInt();

            if (guess == number) {
                System.out.println("Congratulations! " + attempt + " attempts!");
                guessedCorrectly = true;
                break;
            } else if (guess < number) {
                System.out.println("Too low");
            } else {
                System.out.println("Too high");
            }
        }

        if (!guessedCorrectly) {
            System.out.println("\nSorry, you failed.");
            System.out.println("The correct number is : " + number ) ;
        }

        
        
        sc.close();


    }
}


