package com.example.cricketAPI;
import java.util.*;
public class Team {
    private int teamruns=0;
    private String name;

    private ArrayList<Player> T1=new ArrayList<>();
    public String Statistics="";
    public String getName(){

        return name;

    }
    public void setName(String name){


        this.name=name;
    }

    public int getTeamruns(){

        return teamruns;

    }
    public void setTeamruns(int runs){


    this.teamruns=runs;
    }

    public int RandomRun(){
      int[] arr={-1,2,3,4,6,1};
      int index= (int) (Math.random()*6);
      return arr[index];
    }
    public String getStatistics(){


        return this.Statistics;
    }

    public int CalculateRuns(){

        for(int i=0;i<10;i++){
         int individualRuns=0;
         int score=this.RandomRun();
         while(score!=-1){

             individualRuns += score;
             score=this.RandomRun();
         }

            this.Statistics=this.Statistics+" Player "+ Integer.toString(i)+" scored  "+Integer.toString(individualRuns)+",  ";
            Player p=new Player.PlayerBuilder(true).setName("Player "+i).setRuns(individualRuns).builder();
         this.teamruns += individualRuns;

     }

     return this.teamruns;
    }




}
