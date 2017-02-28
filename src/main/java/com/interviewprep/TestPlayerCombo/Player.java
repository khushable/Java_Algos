package com.interviewprep.TestPlayerCombo;

public class Player implements Comparable<Player>{
String name;
String salary;
String fpts;
String pos;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getSalary() {
	return salary;
}
public void setSalary(String salary) {
	this.salary = salary;
}
public String getFpts() {
	return fpts;
}
public void setFpts(String fpts) {
	this.fpts = fpts;
}

public String getPos() {
	return pos;
}
public void setPos(String pos) {
	this.pos = pos;
}
public Player(String name, String salary, String fpts, String pos) {
	super();
	this.name = name;
	this.salary = salary;
	this.fpts = fpts;
	this.pos = pos;
}
@Override
public String toString() {
	return "Player [name=" + name + ", salary=" + salary + ", fpts=" + fpts + ", pos=" + pos + "]";
}
@Override
public int compareTo(Player anotherPlayer) {
	// TODO Auto-generated method stub
	return anotherPlayer.getName().compareTo(anotherPlayer.getName());
}

}
