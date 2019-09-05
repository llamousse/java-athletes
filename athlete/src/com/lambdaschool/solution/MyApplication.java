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
    public void displayAthlete()
    {
		System.out.println("************");
		myAthlete.displayAthlete();
		System.out.println("************");
    }

}
