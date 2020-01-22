package com.example.cricketAPI;

public class Player {
    private String name;
    private boolean fit;
    private int runs=0;

   // Using builder pattern
    private Player(PlayerBuilder builder){

        this.fit=builder.fit;
        this.name=builder.name;
        this.runs=builder.runs;

    }

    public String getName(){

        return this.name;

    }

    public int getRuns(){

        return this.runs;

    }



public static class PlayerBuilder{

        private String name;
        private boolean fit;
        private int runs=0;
        public PlayerBuilder(boolean status){
            this.fit=status;

        }
        public PlayerBuilder setName(String name){

            this.name=name;
            return this;

        }

    public PlayerBuilder setRuns(int runs){

        this.runs=runs;
         return this;
    }
    public Player builder(){
            return new Player(this);


    }


    }
}
