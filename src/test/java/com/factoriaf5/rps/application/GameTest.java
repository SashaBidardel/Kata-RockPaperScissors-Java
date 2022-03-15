package com.factoriaf5.rps.application;

import static org.junit.Assert.*;

import com.factoriaf5.rps.models.Paper;
import com.factoriaf5.rps.models.Rock;
import com.factoriaf5.rps.models.Scissors;

import org.junit.Test;

public class GameTest {
    
    @Test
    public void justASimpleTest() {
        assertTrue(true);
    }
    @Test
    public void gameTestPaperWinRock() {
      
        Game game = new Game();
        Paper player1 = new Paper();
        Rock player2= new Rock();

        String result = game.juego(player1.GetPaper(), player2.GetRock());

        assertEquals("Gana jugador1", result);
    }
 
    @Test
    public void gameTestRockWinScissors() {
            
            Game game = new Game();
            Rock player1 = new Rock();
            Scissors player2= new Scissors();

            String result = game.juego(player1.GetRock(), player2.GetScissors());

            assertEquals("Gana jugador1", result);
        }
        @Test
        public void gameTesScissorsWinPaper() {
                
                Game game = new Game();
                Paper player1 = new Paper();
                Scissors player2= new Scissors();
    
                String result = game.juego(player1.GetPaper(), player2.GetScissors());
    
                assertEquals("Gana jugador2", result);
            } 
            @Test
            public void gameTestEmpsatePaper() {
                    
                    Game game = new Game();
                    Paper player1 = new Paper();
                    
                    Paper player2 = new Paper();
                    String result = game.juego(player1.GetPaper(), player2.GetPaper());
        
                    assertEquals("Empate", result);
                } 
                @Test
                public void gameTestEmpsateRock() {
                        
                        Game game = new Game();
                        Rock player1 = new Rock();
                        
                        Rock player2 = new Rock();
                        String result = game.juego(player1.GetRock(), player2.GetRock());
            
                        assertEquals("Empate", result);
                    }
                    @Test
                    public void gameTestEmpsateScissors() {
                            
                            Game game = new Game();
                            Scissors player1 = new Scissors();
                            
                            Scissors player2 = new Scissors();
                            String result = game.juego(player1.GetScissors(), player2.GetScissors());
                
                            assertEquals("Empate", result);
                        }     
    }


