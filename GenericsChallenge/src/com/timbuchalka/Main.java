package com.timbuchalka;

public class Main {
    public static void main(String[] args) {
        League<Team<FootballPlayer>> footballLeague = new League<>("AFL");

        Team<FootballPlayer> adelaideCrow = new Team<>("Adelaide Crows");
        Team<FootballPlayer> melbourne = new Team<>("Melbourne");
        Team<FootballPlayer> hawthorn = new Team<>("Hawthorn");
        Team<FootballPlayer> fremantle = new Team<>("Fremantle");

        footballLeague.addTeam(adelaideCrow);
        footballLeague.addTeam(melbourne);
        footballLeague.addTeam(hawthorn);
        footballLeague.addTeam(fremantle);

        FootballPlayer joe = new FootballPlayer("Joe");
        FootballPlayer banks = new FootballPlayer("Gordon");
        adelaideCrow.addPlayer(joe);
        melbourne.addPlayer(banks);
        System.out.println(adelaideCrow.numPlayers());

        hawthorn.matchResult(fremantle, 1, 0);
        hawthorn.matchResult(adelaideCrow, 3, 8);
        adelaideCrow.matchResult(fremantle, 2, 1);

        footballLeague.showLeagueTable();



//        BaseballPlayer pat = new BaseballPlayer("Pat");
//        SoccerPlayer kane = new SoccerPlayer("Harry Kane");
//
//        Team<FootballPlayer> rawTeam = new Team<>("Raw Team");
//        rawTeam.addPlayer(kane);
//        rawTeam.addPlayer(pat);
//
//        footballLeague.addTeam(rawTeam);
//
//        League<FootballPlayer, Team<FootballPlayer>> rawLeague= new League<>("Raw League");
//        rawLeague.addTeam(adelaideCrow);
//        rawLeague.addTeam(melbourne);
//        rawLeague.addTeam(rawTeam);
//
//        League reallyRaw = new League<>("Raw at its best");
//        reallyRaw.addTeam(adelaideCrow);
//        reallyRaw.addTeam(melbourne);
//        reallyRaw.addTeam(rawTeam);

//        SoccerPlayer son = new SoccerPlayer("Son");
//        Team<BaseballPlayer> chicagoCubs = new Team<>("Chicago Cubs");
//        chicagoCubs.addPlayer(pat);
//        System.out.println(chicagoCubs.numPlayers());
//        Team<SoccerPlayer> tottenhamSpurs = new Team<>("Tottenham Spurs");
//        tottenhamSpurs.addPlayer(kane);
//        tottenhamSpurs.addPlayer(son);
//        System.out.println(tottenhamSpurs.numPlayers());




//        adelaideCrow.matchResult(chicagoCubs, 1, 1);

//        System.out.println("\nRanking");
//        System.out.println(adelaideCrow.getName() + " : " + adelaideCrow.ranking());
//        System.out.println(melbourne.getName() + " : " + melbourne.ranking());
//        System.out.println(fremantle.getName() + " : " + fremantle.ranking());
//        System.out.println(hawthorn.getName() + " : " + hawthorn.ranking());
    }
}