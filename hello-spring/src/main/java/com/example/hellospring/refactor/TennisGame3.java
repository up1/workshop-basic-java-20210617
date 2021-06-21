package com.example.hellospring.refactor;

public class TennisGame3 {

    private int p2;
    private int p1;
    private String p1N;
    private String p2N;

    public TennisGame3(String p1N, String p2N) {
        this.p1N = p1N;
        this.p2N = p2N;
    }

    public String getScore() {
        String s;
        String[] p = new String[]{"Love", "Fifteen", "Thirty", "Forty"};

        // Advantage
        if(Math.abs(p1 - p2) == 1 && (p1+p2) > 5) {
            s = (p1 > p2) ? p1N : p2N;
            return "Advantage " + s;
        }

        // All
        if(p1 == p2 && p1 <= 2) {
            return p[p1] + "-All";
        }

        // Deuce
        if (isDeuce()) {
            return "Deuce";
        }



        // What ? Normal
        if (p1 < 4 && p2 < 4 && !(p1 + p2 == 6)) {
            return p[p1] + "-" + p[p2];
        }

        // TODO Next
        s = (p1 > p2) ? p1N : p2N;
        return "Win for " + s;

    }

    private boolean isDeuce() {
        return p1 == p2 && p1 > 2;
    }

    public void wonPoint(String playerName) {
        if (playerName == "player1")
            this.p1 += 1;
        else
            this.p2 += 1;

    }

}
