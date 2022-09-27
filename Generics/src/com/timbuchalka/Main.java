package com.timbuchalka;

public class Main {
    public static void main(String[] args) {
        FootballPlayer joe = new FootballPlayer("Joe");
        BaseballPlayer pat = new BaseballPlayer("Pat");
        SoccerPlayer kane = new SoccerPlayer("Harry Kane");
        SoccerPlayer son = new SoccerPlayer("Son");

        Team<FootballPlayer> adelaideCrow = new Team<>("Adelaide Crows");
        adelaideCrow.addPlayer(joe);
        System.out.println(adelaideCrow.numPlayers());

        Team<BaseballPlayer> chicagoCubs = new Team<>("Chicago Cubs");
        chicagoCubs.addPlayer(pat);
        System.out.println(chicagoCubs.numPlayers());

        Team<SoccerPlayer> tottenhamSpurs = new Team<>("Tottenham Spurs");
        tottenhamSpurs.addPlayer(kane);
        tottenhamSpurs.addPlayer(son);
        System.out.println(tottenhamSpurs.numPlayers());

        Team<FootballPlayer> melbourne = new Team<>("Melbourne");
        FootballPlayer banks = new FootballPlayer("Gordon");
        melbourne.addPlayer(banks);

        Team<FootballPlayer> hawthorn = new Team<>("Hawthorn");
        Team<FootballPlayer> fremantle = new Team<>("Fremantle");

        hawthorn.matchResult(fremantle, 1, 0);
        hawthorn.matchResult(adelaideCrow, 3, 8);

        adelaideCrow.matchResult(fremantle, 2, 1);
//        adelaideCrow.matchResult(chicagoCubs, 1, 1);

        System.out.println("\nRanking");
        System.out.println(adelaideCrow.getName() + " : " + adelaideCrow.ranking());
        System.out.println(melbourne.getName() + " : " + melbourne.ranking());
        System.out.println(fremantle.getName() + " : " + fremantle.ranking());
        System.out.println(hawthorn.getName() + " : " + hawthorn.ranking());


    }
}