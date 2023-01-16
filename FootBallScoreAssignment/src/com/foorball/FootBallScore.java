package com.foorball;

import java.util.ArrayList;
import java.util.List;

public class FootBallScore {
	
	List<MatchInfo> fixturesData = new ArrayList<>();
	
	public String startNewGame(String homeTeam, String awayName) {
		MatchInfo mi = new MatchInfo();
		mi.setHomeTeam(homeTeam);
		mi.setAwayTeam(awayName);
		mi.setHomeTeamScore(0);
		mi.setAwayTeamScore(0);
		mi.setStartTime(java.time.LocalDate.now().toString());
		mi.setStatus("In-Progress");
		fixturesData.add(mi);
		return null;
	}

	
	public String startNewGame(int homeTeamScore, int awayNameScore) {
		MatchInfo mi = new MatchInfo();
		mi.setHomeTeam(homeTeam);
		mi.setAwayTeam(awayName);
		mi.setHomeTeamScore(homeTeamScore);
		mi.setAwayTeamScore(awayNameScore);
		mi.setStartTime(java.time.LocalDate.now().toString());
		mi.setStatus("In-Progress");
		fixturesData.add(mi);
		return null;
	}
}
