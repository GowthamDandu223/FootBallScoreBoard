package com.foorball;

import java.util.concurrent.atomic.AtomicLong;

public class MatchInfo {
	private static AtomicLong idCounter = new AtomicLong();
	private String matchId =String.valueOf(idCounter.getAndIncrement()) ;
	private String homeTeam;
	private String awayTeam;
	private String homeTeamScore;
	private String awayTeamScore;
	private String startTime;
	private String status;
	private int TotalScore;
	
	public String getHomeTeam() {
		return homeTeam;
	}
	public void setHomeTeam(String homeTeam) {
		this.homeTeam = homeTeam;
	}
	public String getAwayTeam() {
		return awayTeam;
	}
	public void setAwayTeam(String awayTeam) {
		this.awayTeam = awayTeam;
	}
	
	public String getHomeTeamScore() {
		return homeTeamScore;
	}
	public void setHomeTeamScore(String homeTeamScore) {
		this.homeTeamScore = homeTeamScore;
	}
	public String getAwayTeamScore() {
		return awayTeamScore;
	}
	public void setAwayTeamScore(String awayTeamScore) {
		this.awayTeamScore = awayTeamScore;
	}
	public String getStartTime() {
		return startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getMatchId() {
		return matchId;
	}
	public void setMatchId(String matchId) {
		this.matchId = matchId;
	}
	public int getTotalScore() {
		return TotalScore;
	}
	public void setTotalScore(int totalScore) {
		TotalScore = totalScore;
	}
	

}
