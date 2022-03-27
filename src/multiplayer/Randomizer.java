package multiplayer;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Randomizer {
    private ArrayList<Player> players;

    public Randomizer(){
        this.players = new ArrayList<>();
    }

    public Randomizer(ArrayList<Player> listOfPlayers){
        this.players = listOfPlayers;
    }

    private void shufflePlayers(){
        Collections.shuffle(this.players, new Random());
    }

    private Team createTeam(List<Player> players){
        //TODO
        return new Team();
    }

    public ArrayList<Team> createTeams(){
        shufflePlayers();
        ArrayList<Team> results = new ArrayList<>();
        for(int i = 0; i < this.players.size(); i+=5){
            List<Player> team = this.players.subList(i, i + 4);
            results.add(createTeam(team));
        }
        return results;
    }

}
