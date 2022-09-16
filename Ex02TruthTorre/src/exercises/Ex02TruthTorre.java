/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex02;
import java.util.Scanner;
/**
 *
 * @author Rafaella
 */
public class Ex02TruthTorre {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       String userChoice = " ";
       int range = 10;
       int random = (int) Math.floor(Math.random()*range)+1;
       int guesses = 5;
       int guessNum = 0;
       char response = 'y';
       int lowLim = -5;
       int upLim = 5;
       
       do{
        System.out.println("Welcome to Higher or Lower! What will you do?\n" + "-Start game\n" + "-Change settings\n" + "-End application\n");
        userChoice = sc.nextLine();
        
        switch(userChoice){
        case "Start game": //if user chooses to start game
            do{
            for (int i = 0; i < guesses; i++){
            int guessesLeft = guesses - i;
            System.out.printf("You have %d guesses left. What is your guess?\n",guessesLeft);
            guessNum = sc.nextInt();
                if(guessNum < random){
                    System.out.println("Guess higher!");
                }
    
                else if (guessNum > random){
                    System.out.println("Guess lower!");
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
                    System.out.println("Lower limit: ");
                    lowLim = sc.nextInt();
                              
                    if(lowLim < 1){
                    lowLim = lowLim*(-1);
                       }
                     
                    System.out.println("Upper limit: ");
                    upLim = sc.nextInt();
                            
                    System.out.println("Guesses: ");
                    int userGuess = sc.nextInt();
                    guesses = userGuess;

                    range = lowLim + upLim;
               break;
       }
       }while(!userChoice.equalsIgnoreCase("End Application"));
    }
}
