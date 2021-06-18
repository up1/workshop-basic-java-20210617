package com.example.hellospring.refactor;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.jupiter.api.Assertions.*;

public class TennisGame3Test {

    private int player1Score;
    private int player2Score;
    private String expectedScore;

    public void checkAllScores(TennisGame3 game) {
        int highestScore = Math.max(this.player1Score, this.player2Score);
        for (int i = 0; i < highestScore; i++) {
            if (i < this.player1Score)
                game.wonPoint("player1");
            if (i < this.player2Score)
                game.wonPoint("player2");
        }
        assertEquals(this.expectedScore, game.getScore());
    }


    @ParameterizedTest(name = "{index} ==> {0} - {1} => {2}")
    @CsvSource({ "0, 0, Love-All" })
    public void checkAllScoresTennisGame3(int player1Score, int player2Score, String expectedScore) {
        this.player1Score = player1Score;
        this.player2Score = player2Score;
        this.expectedScore = expectedScore;
        TennisGame3 game = new TennisGame3("player1", "player2");
        checkAllScores(game);
    }

}