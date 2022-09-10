/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercises;

/**
 *
 * @author TRUTH
 */
public class Ex01TruthTorre {
    
    public static void main(String[] args) {
       //object 1
       String w1Name = "Cinnabar Spindle"; 
       int w1BaseAtk = 41;
       String w1Substat = "Defense";
       
       //object 2
       String w2Name = "The Alley Flash";
       int w2BaseAtk = 45;
       String w2Substat = "Elemental Mastery";
    
       //object 3
       String w3Name = "Iron Sting";
       int w3BaseAtk = 42;
       String w3Substat = "Elemental Mastery";
       
       System.out.println("Weapon 1\n" + "Name: " + w1Name + "\n" + "Base Attack(lvl 1): " + w1BaseAtk + "\n" + "Substat: " + w1Substat + "\n");
       System.out.println("Weapon 2\n" + "Name: " + w2Name + "\n" + "Base Attack(lvl 1): " + w2BaseAtk + "\n" + "Substat: " + w2Substat + "\n");
       System.out.println("Weapon 3\n" + "Name: " + w3Name + "\n" + "Base Attack(lvl 1): " + w3BaseAtk + "\n" + "Substat: " + w3Substat + "\n");
       
       boolean higherBaseAtk = w1BaseAtk > w2BaseAtk && w1BaseAtk > w3BaseAtk;
       boolean sameSubstat = w2Substat == w3Substat;
       System.out.println("Cinnabar Spindle has the highest Base Attack: " + higherBaseAtk); //comparison
       System.out.println("Total Base Attack: " + (w1BaseAtk + w2BaseAtk + w3BaseAtk)); // sum
       System.out.println("The Alley Flash and Iron Sting have the same substat: " + sameSubstat); //comparison
    }
    
}
