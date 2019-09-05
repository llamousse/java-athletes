package com.lambdaschool.solution;

import com.lambdaschool.initial.Athlete;

public class MyApplication implements Processor
{
    private AthleteCreation myAthlete;

    public MyApplication(AthleteCreation myAthlete)
    {
        this.myAthlete = myAthlete;
    }

    @Override
    public void displayAthlete(String sport, String athlete)
    {
//        System.out.println("************");
//        athlete.display(sport);
//        System.out.println("************\n");

        sport = "************\n" + sport;
        athlete = athlete + "\n************";
        myAthlete.displayAthlete(sport, athlete);
    }

    @Override
    public String readMessage()
    {
        return "Not Implemented";
    }
}
