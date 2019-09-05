package com.lambdaschool.solution;

public class Main
{
    public static void main(String[] args)
    {
        String trackSport = "Track";
        String trackAthlete = "Runner";
        String hockeySport = "Hockey";
        String hockeyAthlete = "Goalie";
        String rugbySport = "Rugby";
        String baseballSport = "Baseball";
        String athlete = "Athlete";

        AthleteCreationInjector injector;
        Processor app;

        // Create a Track Athlete
        injector = new TrackAthleteCreationInjector();
        app = injector.getProcess();
        app.displayAthlete(trackSport, trackAthlete);

        System.out.println();

        // Create a Hockey Athlete
        injector = new HockeyAthleteCreationInjector();
        app = injector.getProcess();
        app.displayAthlete(hockeySport, hockeyAthlete);

        System.out.println();

        // Create a Rugby Athlete
        injector = new RugbyAthleteCreationInjector();
        app = injector.getProcess();
        app.displayAthlete(rugbySport, athlete);

        System.out.println();

        // Create a Baseball Athlete
        injector = new BaseballAthleteCreationInjector();
        app = injector.getProcess();
        app.displayAthlete(baseballSport, athlete);
    }
}
