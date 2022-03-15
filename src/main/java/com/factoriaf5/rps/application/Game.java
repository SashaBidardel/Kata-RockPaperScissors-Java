package com.factoriaf5.rps.application;




public class Game {
   
    
     String juego(String player1,String player2 ){
       
       if (player1 == player2){
           return "Empate";
       }
       if ((player1 == "Paper") & (player2 == "Rock")){
        return "Gana jugador1";
       }    
       if ((player1 == "Rock") & (player2 == "Scissors")){
        return "Gana jugador1";
       } 
       if ((player1 == "Scissors") & (player2 == "Paper")){
        return "Gana jugador1";
       } 
       return "Gana jugador2";
    }
}
