public class Players {

    private String Position;
    private String Name;
    private int number;
    private Teams team;
    private int age;
    private int Score;
    private String rank;

    public Players(String position, String name, int number, Teams team, int age, int score, String rank) {
        Position = position;
        Name = name;
        this.number = number;
        this.team = team;
        this.age = age;
        Score = score;
        this.rank = rank;
    }

    public String getPosition() {
        return Position;
    }

    public String getName() {
        return Name;
    }

    public int getNumber() {
        return number;
    }

    public Teams getTeam() {
        return team;
    }

    public int getAge() {
        return age;
    }

    public int getScore() {
        return Score;
    }

    public String getRank() {
        return rank;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setTeam(Teams team) {
        this.team = team;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setScore(int score) {
        Score = score;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }
}
