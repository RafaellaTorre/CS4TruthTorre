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
    //if user chooses to start game
    for ( int i = 0; i < guesses; i++)
    while(guessNum != random){
        System.out.println("You have " + guesses + " guess(es) left. What is your guess?");
        int guessNum = sc.nextInt();
        if(guessNum < random){
            System.out.println("Guess higher! You have " + guesses + " guess(es) left. What is your guess?");
            guessNum = sc.nextInt();
        }
    
        else{
            System.out.println("Guess lower! You have " + guesses + " guess(es) left. What is your guess?");
            guessNum = sc.nextInt();
        }
        System.out.println("You got it!");
    }
    }
}
