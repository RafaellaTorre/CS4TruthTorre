/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex03;

/**
 *
 * @author Rafaella
 */
public class Ex03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Song hatdog = new Song("Only the Brave");
        Singer lt = new Singer("Louis Tomlinson", 0, 0, hatdog);
        lt.performForAudience(12, hatdog);
        Song awit = new Song("Always You");
        lt.changeFavSong(awit);
    }
    
}
