package br.edu.unifei.ecot12.padroes.templateMethod;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        CallOfDuty c = new CallOfDuty();
        Player p1 = new Player();
        Player p2 = new Player();

        List<Player> players = new ArrayList<Player>();
        players.add(p1);
        players.add(p2);

        
        p1.setDeaths(3);  
        p2.setPlayersKilled(2);   
        p1.setPlayersKilled(1);   
        p2.setDeaths(1); 

        
        c.setPlayers(players);

        System.out.println("KD of Call of Duty: " + c.KD());
        System.out.println("KD of Player 1: " + p1.KD());
        System.out.println("KD of Player 2: " + p2.KD());
    }
}
