package com.lambdaschool.solution;

public class TrackAthleteImpl implements AthleteCreation
{
	@Override
	public void displayAthlete(String sport, String athlete)
	{
		System.out.println(sport + " " + athlete);
	}

	@Override
	public String readMessage()
	{
		return "Not Implemented";
	}
}
