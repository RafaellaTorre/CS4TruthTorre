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
    //displays options to user
    System.out.println("Welcome to Higher or Lower! What will you do?\n" + "-Start game\n" + "-Change settings\n" + "-End application\n");
    String userChoice = sc.nextLine();
    
    switch(userChoice){
        case "Start Game": //if user chooses to start game
            System.out.println("You have " + guesses + " guess(es) left. What is your guess?");
            guessNum = sc.nextInt();
            for ( int i = 1; i < guesses; i++){
            int guessesLeft = guesses - i;
        
            if(guessNum < random){
                System.out.println("Guess higher! You have " + guessesLeft + " guess(es) left. What is your guess?");
                guessNum = sc.nextInt();
            }
    
            else if (guessNum > random){
                System.out.println("Guess lower! You have " + guessesLeft + " guess(es) left. What is your guess?");
                guessNum = sc.nextInt();
            }
        
            else{
            System.out.println("You got it!");
            }
        }
        break;
        
        case "Change Settings": // if user chooses to change settings
        break;
    
        case "End Application": // if user chooses to end application
        break;
}
}
}
   

