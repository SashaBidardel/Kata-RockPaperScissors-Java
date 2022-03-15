package com.factoriaf5.rps.application;

import java.util.Random;

import com.factoriaf5.rps.models.Paper;
import com.factoriaf5.rps.models.Rock;
import com.factoriaf5.rps.models.Scissors;

public class Player {
    public String player(){
        Rock roca = new Rock();
        Paper papel = new Paper();
        Scissors tijeras = new Scissors();
        String jugada[]= {papel.GetPaper(),roca.GetRock(),tijeras.GetScissors()};
        Random random = new Random();
        Integer indice= random.nextInt(2);
        String respuesta = jugada[indice];
        return respuesta;
    }
}
