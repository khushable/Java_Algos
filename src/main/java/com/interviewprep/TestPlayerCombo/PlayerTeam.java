package com.interviewprep.TestPlayerCombo;

import java.util.List;

public class PlayerTeam {
List<Player> pgPlayerList;
List<Player> sgPlayerList;
List<Player> sfPlayerList;
List<Player> pfPlayerList;
public List<Player> getPgPlayerList() {
	return pgPlayerList;
}
public void setPgPlayerList(List<Player> pgPlayerList) {
	this.pgPlayerList = pgPlayerList;
}
public List<Player> getSgPlayerList() {
	return sgPlayerList;
}
public void setSgPlayerList(List<Player> sgPlayerList) {
	this.sgPlayerList = sgPlayerList;
}
public List<Player> getSfPlayerList() {
	return sfPlayerList;
}
public void setSfPlayerList(List<Player> sfPlayerList) {
	this.sfPlayerList = sfPlayerList;
}
public List<Player> getPfPlayerList() {
	return pfPlayerList;
}
public void setPfPlayerList(List<Player> pfPlayerList) {
	this.pfPlayerList = pfPlayerList;
}
@Override
public String toString() {
	return "PlayerTeam [pgPlayerList=" + pgPlayerList + ", sgPlayerList=" + sgPlayerList + ", sfPlayerList="
			+ sfPlayerList + ", pfPlayerList=" + pfPlayerList + "]";
}


}
