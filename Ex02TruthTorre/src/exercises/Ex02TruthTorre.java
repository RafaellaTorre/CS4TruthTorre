/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercises;
import java.util.Scanner;
/**
 *
 * @author TRUTH
 */
public class Ex02TruthTorre {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int range = 10;
    int random = (int) Math.floor(Math.random()*range)+1;
    int guesses = 5;
    int guessNum = 0;
    char response = 'y';
    int lowLim = -5;
    int upLim = 5;
    //displays options to user
    System.out.println("Welcome to Higher or Lower! What will you do?\n" + "-Start game\n" + "-Change settings\n" + "-End application\n");
    String userChoice = sc.nextLine();
    
    switch(userChoice){
        case "Start game": //if user chooses to start game
            do{
            System.out.println("You have " + guesses + " guess(es) left. What is your guess?");
            guessNum = sc.nextInt();
            for (int i = 1; i < guesses; i++){
            int guessesLeft = guesses - i;
        
            if(guessNum < random){
                System.out.println("Guess higher! You have " + guessesLeft + " guess(es) left. What is your guess?");
                guessNum = sc.nextInt();
            }
    
            else if (guessNum > random){
                System.out.println("Guess lower! You have " + guessesLeft + " guess(es) left. What is your guess?");
                guessNum = sc.nextInt();
            }
        
            else if (guessNum == random){
            System.out.println("You got it!");
            break;
            }
        }
            if(guessNum != random){
            System.out.println("You lost...");
            }
            
            System.out.println("Play again?(y/n)");
            response = sc.next().charAt(0);
            }while(response == 'y');
        break;

        case "Change settings": // if user chooses to change settings
                   System.out.println("What is the lower limit of the random number?\n" + "What is the upper limit of the random number?\n" + "How many guesses are allowed?\n");
                    String changeSet = sc.nextLine();
                    System.out.println("Lower limit");
                    lowLim = sc.nextInt();
                              
                    if(lowLim < 1){
                    lowLim = lowLim*(-1);
                       }
                              
                    else{
                    }
                              
                    upLim = sc.nextInt();
                            
                    case "Guesses":
                    int userGuess = sc.nextInt();
                    guesses = userGuess;

                    range = lowLim + upLim;
        break;
    
        case "End application": // if user chooses to end application
        break;
}
}
}
   

