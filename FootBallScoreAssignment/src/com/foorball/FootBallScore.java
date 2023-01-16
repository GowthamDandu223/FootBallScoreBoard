package com.foorball;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FootBallScore {
	
	List<MatchInfo> fixturesData = new ArrayList<>();
	
	public String startNewGame(String homeTeam, String awayName) {
		MatchInfo mi = new MatchInfo();
		mi.setHomeTeam(homeTeam);
		mi.setAwayTeam(awayName);
		mi.setHomeTeamScore("0");
		mi.setAwayTeamScore("0");
		mi.setStartTime(java.time.LocalDate.now().toString());
		mi.setStatus("In-Progress");
		mi.setTotalScore(Integer.parseInt(mi.getHomeTeamScore())+Integer.parseInt(mi.getAwayTeamScore()));
		fixturesData.add(mi);
		System.out.println("new Game with match id "+mi.getMatchId()+" to the Dashboard ");
		return "new Game added to the Dashboard";
	}

	
	public String updateGame(String homeTeamScore, String awayTeamScore,String matchId) {		
		fixturesData.stream().filter(x -> x.getMatchId().equals(matchId))
	    .forEach(x -> { x.setHomeTeamScore(homeTeamScore);x.setAwayTeamScore(awayTeamScore);
	    x.setTotalScore(Integer.parseInt(x.getHomeTeamScore())+Integer.parseInt(x.getAwayTeamScore()));});
		System.out.println("update successfully");
		return "update successfully";
	}
	public List<MatchInfo> finishGame(String matchId) {
		fixturesData.removeIf(x-> x.getMatchId().equalsIgnoreCase(matchId));
		System.out.println(fixturesData);
		 for(MatchInfo mf : fixturesData) {
	        	System.out.println(mf.getHomeTeam()+" "+mf.getHomeTeamScore()+" :"+mf.getAwayTeam()+" "+mf.getAwayTeamScore());
	        }
		return fixturesData;
	}
	
	public List<MatchInfo> getSummary(){
		System.out.println(fixturesData.size());
	        fixturesData = fixturesData.stream()
	                .sorted((o1, o2) -> (int)(o2.getTotalScore() - o1.getTotalScore())).collect(Collectors.toList());
	        System.out.println(fixturesData);
	        for(MatchInfo mf : fixturesData) {
	        	System.out.println(mf.getHomeTeam()+" "+mf.getHomeTeamScore()+" :"+mf.getAwayTeam()+" "+mf.getAwayTeamScore());
	        }

		return fixturesData;
	}
	
}
