package br.edu.unifei.ecot12.padroes.templateMethod;

import java.util.ArrayList;
import java.util.List;

public class CallOfDuty extends Game {
    private List<Player> players = new ArrayList<Player>();

    @Override
    public int kill() {
        int totalKills = 0;
        for (Player player : players) {
            totalKills += player.kill();
        }
        return totalKills;
    }

    @Override
    public int death() {
        int totalDeaths = 0;
        for (Player player : players) {
            totalDeaths += player.death();
        }
        return totalDeaths;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }
}
