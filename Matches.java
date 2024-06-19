public class Matches {

    private int id;
    private String date;
    private Teams team1 ;
    private Teams team2;
    private String footballReferee;
    private int FisrtTeamScore;
    private int SecondTeamScore;
    private int StatiumName;


    public Matches(int id, String date, Teams team1, Teams team2, String footballReferee, int fisrtTeam, int secondTeamScore, int statiumName) {
        this.id = id;
        this.date = date;
        this.team1 = team1;
        this.team2 = team2;
        this.footballReferee = footballReferee;
        FisrtTeamScore = fisrtTeam;
        SecondTeamScore = secondTeamScore;
        StatiumName = statiumName;
    }

    public int getId() {
        return id;
    }

    public String getDate() {
        return date;
    }

    public Teams getTeam1() {
        return team1;
    }

    public Teams getTeam2() {
        return team2;
    }

    public String getFootballReferee() {
        return footballReferee;
    }

    public int getFisrtTeamScore() {
        return FisrtTeamScore;
    }

    public int getSecondTeamScore() {
        return SecondTeamScore;
    }

    public int getStatiumName() {
        return StatiumName;
    }

    public void setFisrtTeamScore(int fisrtTeamScore) {
        FisrtTeamScore = fisrtTeamScore;
    }

    public void setSecondTeamScore(int secondTeamScore) {
        SecondTeamScore = secondTeamScore;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setFootballReferee(String footballReferee) {
        this.footballReferee = footballReferee;
    }
}
