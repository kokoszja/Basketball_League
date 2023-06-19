package com.jk.basketballleague.domain;

import java.util.List;

public class Team {
    private Long teamId;
    private String teamName;
    private int classificationPoints;
    private int gamesWon;
    private int gamesLost;
    private int pointsScored;
    private int pointsLost;
    private boolean advanceToPlayOffs;
    private String nameOfCaptain;
    private List<Players> players;

}
