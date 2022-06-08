package com.chainsys.bestPractices.abstractdemo;

public class ScoreBoard {
	  public int TargetScore = 250;
	    private ScoreBoard() {
	        System.out.println("Object created for ScoreBoard");
	    }
	    // createObject() is a factory method 
	    public static ScoreBoard createObject() {
	        return new ScoreBoard();
	    }
	}