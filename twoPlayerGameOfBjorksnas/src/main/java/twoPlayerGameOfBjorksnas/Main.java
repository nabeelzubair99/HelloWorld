/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package twoPlayerGameOfBjorksnas;

import java.util.Random;
import java.util.Scanner;
import java.util.*;

/**
 *
 * @author nabee
 */
public class Main {
    
    private static void displayRulesOfTheGame(){
        System.out.println(" There are five Players: Gödishus, Derflürg, Kullen, Koppang, or Songesand. The rules are:");
        System.out.println("Songesand beats Kullen, Gödishus");
        System.out.println("Kullen beats Derflürg, Koppang");
        System.out.println("Derflürg beats Songesand, Gödishus");
        System.out.println("Gödishus beats Koppang, Kullen");
        System.out.println("Koppang beats Songesand, Derflürg");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        displayRulesOfTheGame();
        
        Random randomNumberGenerator = new Random();
        Scanner userInput = new Scanner(System.in);
        String userPlay;
        String userMove;
        ArrayList<String> players = new ArrayList<String>();
        players.add("godishus");
        players.add("Derflurg");
        players.add("Kullen");
        players.add("Koppang");
        players.add("Songesand");
        //displaying the players.
        for (String individualPlayers : players){
            System.out.println("Players Are");
            System.out.println(individualPlayers);
        }
        int godishus = 1, Derflurg = 2, Kullen = 3 , Koppang = 4, Songesand = 5;
        
        do{
        System.out.println("Do you want to play a round?");
        userPlay = userInput.nextLine();
        if("yes".equals(userPlay)){
            //play game
            System.out.println("Enter a move");
            userMove = userInput.nextLine();
            if("godishus".equals(userMove) || "Derflurg".equals(userMove) || "Kullen".equals(userMove) || "Koppang".equals(userMove) || "Songesand".equals(userMove) ){
                //play the game
                int computerMove = randomNumberGenerator.nextInt(6);
                    String x = players.get(computerMove);
                    System.out.println("Computer picked :"+ x);
                    if("Derflurg".equals(x) && ("Songesand".equals(userMove) || "Godishus".equals(userMove))){
                        System.out.println("Derflurg wins");
                    }else if ("godishus".equals(x) && ("Koppang".equals(userMove) || "Kullen".equals(userMove))){
                        System.out.println("godishus wins");
                    }else if ("Koppang".equals(x) && ("Songesand".equals(userMove) || "Derflurg".equals(userMove))){
                        System.out.println("Koppang wins");
                    }else if ("Kullen".equals(x) && ("Derflurg".equals(userMove) || "Koppang".equals(userMove))){
                        System.out.println("Kullen wins");
                    }else if ("Songesand".equals(x) && ("Kullen".equals(userMove) || "Godishus".equals(userMove))){
                        System.out.println("Songesand wins");
                    }else{
                        System.out.println(userMove + "Beats" + " "+ x);
                    }
                
            }else{
                //enter the correct move
                System.out.println("Enter the correct move");
            }
        }else {
            //quit game
            
        System.out.println("game over");
        }
        }while ("yes".equals(userPlay));
        
    }
    
}
