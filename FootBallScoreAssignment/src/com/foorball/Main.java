package com.foorball;

import java.util.Scanner;

public class Main {
	
	public static void acceptValidInput(FootBallScore fb) {
		System.out.println("Please enter action of the Game");
		Scanner sc = new Scanner(System.in);
		String action = sc.next().toUpperCase();
		
		
		switch (action) {
		
		case "NEWGAME": 
			System.out.println("Please enter home team");
			String homeTeam = sc.next();
			System.out.println("Please enter away team");
			String awayTeam = sc.next();
			fb.startNewGame(homeTeam, awayTeam);
			acceptValidInput(fb);
			break;
		
		case "UPDATEGAME":
			System.out.println("Please enter matchId ");
			String matchId = sc.next();
			System.out.println("Please enter hometeam score");
			String homeTeamscore = sc.next();
			System.out.println("Please enter awayteam score");
			String awayTeamScore = sc.next();
			fb.updateGame(homeTeamscore, awayTeamScore, matchId);
			acceptValidInput(fb);
			break;
			
		case "FINISHGAME":
			System.out.println("Please enter matchId ");
			String id = sc.next();			
			fb.finishGame(id);
			acceptValidInput(fb);
			break;
			
		case "SUMMARY":
			fb.getSummary();
			acceptValidInput(fb);
			break;
		default :
			System.out.println("session ended");
			sc.close();
			
		}
		if(!action.equalsIgnoreCase("exit"))
		acceptValidInput(fb);
		else {
			sc.close();
			System.out.println("session ended");
		}
	}

	
	public static void main(String[] args) {
		FootBallScore fb = new FootBallScore();
		acceptValidInput(fb);

}
}
