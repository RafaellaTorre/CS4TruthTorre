/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex03;

/**
 *
 * @author Rafaella
 */
public class Singer {
    String name;
    int noOfPerformances;
    double earnings;
    int audience;
    Song favoriteSong;
    
    public Singer(String n, int perf, double money, Song a){
    name = n;
    noOfPerformances = perf;
    earnings = money;
    favoriteSong = a;
    }
    
    public void performForAudience(int people, Song a){
        audience = people;
        earnings = audience*100;
        noOfPerformances =+1 ;
        System.out.println(name + " performed " + a + " for " + audience + " people! " + name + " has earned " + earnings);
    }
    
    public void changeFavSong(Song newSong){
        favoriteSong = newSong;
        System.out.println(name + "'s favorite song is now " + favoriteSong);   
    }
}
