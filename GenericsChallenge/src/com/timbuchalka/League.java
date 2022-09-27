package com.timbuchalka;

import java.util.ArrayList;
import java.util.Collections;

public class League<T extends Team> {
    public String name;
    private ArrayList<T> league = new ArrayList<>();

    public League(String name) {
        this.name = name;
    }

    public boolean addTeam(T team) {
        if (league.contains(team)) {
            System.out.println(team + " already exists");
            return false;
        }
        league.add(team);
        return true;
    }

    public void showLeagueTable() {
        Collections.sort(league);
        for (T t: league) {
            System.out.println( (league.indexOf(t) + 1) + " --> " +t.getName() + " : " + t.ranking());
        }
    }
}
