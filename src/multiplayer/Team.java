package multiplayer;

import java.util.ArrayList;
import java.util.HashMap;

public class Team {
    private String name;
    private HashMap<Role, Player> players;
    private int rating;

    public Team(){
        this.name = "I Don't Know Joe";
        this.players = new HashMap<Role, Player>();
        this.rating = 0;
    }

    public Team(String name){
        this.name = name;
        this.players = new HashMap<Role, Player>();
        this.rating = 0;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Player getPlayer(Role role){
        return this.players.get(role);
    }
    public int getRating() {
        return rating;
    }

    public void calculateRating(int rating) {
        this.rating = rating;
    }
}
