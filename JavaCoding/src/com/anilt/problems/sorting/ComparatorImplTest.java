package com.anilt.problems.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorImplTest 
{

	public static void main(String[] args) 
	{
		ArrayList<Player> playersArr = new ArrayList<Player>();
		playersArr.add(new Player("Vijay", 100));
		playersArr.add(new Player("Anil", 100));
		playersArr.add(new Player("Gopi", 80));
		playersArr.add(new Player("Aarthi", 90));
		
		Checker checker = new Checker();
//		Arrays.sort(playersArr, checker);
		Collections.sort(playersArr, checker);
		for (Player player : playersArr) 
		{
			System.out.println("Name: "+ player.name+" : Score- "+player.score);
		}
	}

}
class Checker implements Comparator<Player> 
{
	@Override
	public int compare(Player a, Player b) 
	{
		Integer aScore = a.score;
		Integer bScore = b.score;
		int scoreResult = bScore.compareTo(aScore);
		if(scoreResult == 0)
		{
			return a.name.compareTo(b.name);
		}
		else
		{
			return scoreResult;
		}
	}
}
class Player
{
	String name;
	int score;
	public Player(String name, int score) 
	{
		this.name = name;
		this.score = score;
	}
}
