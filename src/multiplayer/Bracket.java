package multiplayer;

import java.io.*;
import java.util.ArrayList;

public class Bracket {
    private int numberOfPlayers;
    private int numberOfTeams;



    private ArrayList<Team> teams;
    private ArrayList<Player> players;
    private File listOfPlayers = new File("./ListOfPlayers");

    public Bracket(){
        this.numberOfPlayers = 0;
        this.numberOfTeams = 0;
        this.teams = new ArrayList<>();
        this.players = new ArrayList<>();
    }

    private ArrayList<Team> randomizeTeams(){
        Randomizer randomizer = new Randomizer();
        return teams;
    }

    public void setPlayers(File file) throws FileNotFoundException {
        ArrayList<Player> results = new ArrayList<>();
        try{
            BufferedReader reader =  new BufferedReader(new FileReader(file));
            String line = reader.readLine();
            while (line != null) {
                results.add(new Player(line));
                line = reader.readLine();
            }
            reader.close();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
        this.players = results;
    }

    private int getNumberOfPlayers() {
        return numberOfPlayers;
    }

    public int getNumberOfTeams() {
        return numberOfTeams;
    }

    public ArrayList<Team> getTeams() {
        return teams;
    }

    public void setTeams(ArrayList<Team> teams) {
        this.teams = teams;
    }

    public ArrayList<Player> getPlayers() throws FileNotFoundException {
        return this.players;
    }
}
