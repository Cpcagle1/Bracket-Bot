package multiplayer;

public class Player {
    private String username;
    private Rank rank;

    public Player(){
        this.username = "john doe";
        this.rank = Rank.UNRANKED;
    }

    public Player(String username){
        this.username = username;
        this.rank = Rank.UNRANKED;
    }

    public void setUsername(String username){
        this.username = username;
    }

    public String getUsername(){
        return this.username;
    }

    public void setRank(Rank rank){
        this.rank = rank;
    }

    public Rank getRank(){
        return this.rank;
    }
}
