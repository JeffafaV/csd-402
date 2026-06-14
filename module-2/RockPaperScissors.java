// Jeff Victorino
// 06/14/2026
// Module 2.2 Assignment

import java.util.Random;
import java.util.Scanner;

// class for rock paper and scissor games
public class RockPaperScissors
{
	public static void main(String[] args) {
        // display rules
		System.out.println("Rock Paper Scissors");
        System.out.println("1: Rock");
        System.out.println("2: Paper");
        System.out.println("3: Scissors");

        // array to hold the 3 different choices
        String[] choices = {"Rock", "Paper", "Scissors"};

        // scanner object for input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Your input: ");
        int userInput = scanner.nextInt();
        scanner.close();

        // end program if user inputs bad input
        if (userInput < 1 || userInput > 3) {
            System.out.println("Bad input. Please try again.");
            return;
        }
        // subtract 1 to get correct index in array
        userInput -= 1;

        // get random number from 0 to 2
        Random rand = new Random();
        int ranNum = rand.nextInt(3);

        // tie
        if (userInput == ranNum) {
            System.out.println("Player: " + choices[userInput]);
            System.out.println("Computer: " + choices[ranNum]);
            System.out.println("Winner: No one");
        }

        // user inputs rock
        else if (userInput == 0) {
            if (ranNum == 1) {
                System.out.println("Player: " + choices[userInput]);
                System.out.println("Computer: " + choices[ranNum]);
                System.out.println("Winner: Computer");
            }
            else if (ranNum == 2) {
                System.out.println("Player: " + choices[userInput]);
                System.out.println("Computer: " + choices[ranNum]);
                System.out.println("Winner: Player");
            }
        }

        // user inputs paper
        else if (userInput == 1) {
            if (ranNum == 0) {
                System.out.println("Player: " + choices[userInput]);
                System.out.println("Computer: " + choices[ranNum]);
                System.out.println("Winner: Player");
            }
            else if (ranNum == 2) {
                System.out.println("Player: " + choices[userInput]);
                System.out.println("Computer: " + choices[ranNum]);
                System.out.println("Winner: Computer");
            }
        }

        // user inputs scissors
        else if (userInput == 2) {
            if (ranNum == 0) {
                System.out.println("Player: " + choices[userInput]);
                System.out.println("Computer: " + choices[ranNum]);
                System.out.println("Winner: Computer");
            }
            else if (ranNum == 1) {
                System.out.println("Player: " + choices[userInput]);
                System.out.println("Computer: " + choices[ranNum]);
                System.out.println("Winner: Player");
            }
        }
	}
}
