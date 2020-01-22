package com.example.cricketAPI;

public class LaunchCricket {

    private String team1;
    private String team2;
    private String winner;
    private Team Team1=new Team();
    private Team Team2=new Team();


    public String getTeam1() {
        return team1;
    }

    public void setTeam1(String team1) {


        ////////
        this.team1=ResultGenerator(Team1,team1);
    }

    public String getTeam2() {
        return team2;
    }

    public void setTeam2(String team2) {

        this.team2 = ResultGenerator(Team2,team2);
        //////////



    }
    public String ResultGenerator(Team Team1,String team1){

        String t1=team1;
        Team1.setName(t1);

        int Run1=Team1.CalculateRuns();
        Team1.setTeamruns(Run1);
        String Result= "INNING OVER..."+"\n"+team1 +" scored "+Team1.getTeamruns()+" runs";
        Result += ".............stats................."+Team1.getStatistics();

        return(Result);

    }
    public String getWinner(){
        return winner;
    }
    public void setWinner(String winner){
        if(Team1.getTeamruns() == Team2.getTeamruns()){ this.winner = " ......DRAW...... "; }
            else {

            this.winner = ((Team1.getTeamruns() > Team2.getTeamruns()) ? Team1.getName() : Team2.getName());

        }
    }



}