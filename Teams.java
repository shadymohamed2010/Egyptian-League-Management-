import java.util.ArrayList;

public class Teams {

    private String name;
    private int id;
    private ArrayList<Players> players;
    private Players captain;
    private ArrayList<Matches> matches;
    private int TotalScore;
    private int Points;


    public Teams(String name, int id, ArrayList<Players> players, Players captain, ArrayList<Matches> matches, int totalScore, int points) {
        this.name = name;
        this.id = id;
        this.players = players;
        this.captain = captain;
        this.matches = matches;
        TotalScore = totalScore;
        Points = points;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public ArrayList<Players> getPlayers() {
        return players;
    }

    public Players getCaptain() {
        return captain;
    }

    public ArrayList<Matches> getMatches() {
        return matches;
    }

    public int getTotalScore() {
        return TotalScore;
    }

    public int getPoints() {
        return Points;
    }

    public void setPlayers(ArrayList<Players> players) {
        this.players = players;
    }

    public void setCaptain(Players captain) {
        this.captain = captain;
    }

    public void setMatches(ArrayList<Matches> matches) {
        this.matches = matches;
    }

    public void setTotalScore(int totalScore) {
        TotalScore = totalScore;
    }

    public void setPoints(int points) {
        Points = points;
    }
}
