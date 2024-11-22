package br.edu.unifei.ecot12.padroes.templateMethod;

public class Player extends Game{
    private String nickname;
    private int playersKilled;
    private int deaths;

    public String getNickname() {
        return nickname;
    }
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
    public void setPlayersKilled(int playersKilled) {
        this.playersKilled = playersKilled;
    }
    
    public void setDeaths(int deaths) {
        this.deaths = deaths;
    }

    @Override
    public int kill(){
        return playersKilled;
    }

    @Override
    public int death(){
        return deaths;
    }
    
}
