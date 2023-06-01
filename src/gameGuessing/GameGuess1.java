package gameGuessing;


import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author jokasta
 * This is the Guess Number Game.*/
 
public class GameGuess1 {

    /**
     * This game was created using Random and Scanner classes from java.util
     * @param args
     */
        public static void main(String[] args) {
            
        /** This canner will read the input from the user. */
        Scanner scanner = new Scanner(System.in);
        
        /** This random object will generate the random number between 1 and 30. */ 
        Random random = new Random();
        int randomNumber = random.nextInt(30) + 1;
        int guess;
        boolean gameOver = false;
        
        /** This is the first message the user will see on the screen. */
        System.out.println("I have a card number in my pocket between 1 and 30. Guess what number is it.");
        
        /**This loop will continue until the user guess the secret number. */
        while (!gameOver){
            System.out.println("Enter your guess");
            guess = scanner.nextInt();
            
            if (guess == randomNumber) {
                System.out.println("You are good at reading minds. Well done! The secret number is " + randomNumber + ".");
                gameOver = true;
            } else if (guess < randomNumber){
                System.out.println("Your guess is too low. I bet you can do better. What about try again?");
            } else {
                System.out.println("Your guess is too high. I bet you can do better. What about try again?");
            }
        }
        
        /** This command is to close the scanner once the program is done with it.*/
        scanner.close();
    }
}
