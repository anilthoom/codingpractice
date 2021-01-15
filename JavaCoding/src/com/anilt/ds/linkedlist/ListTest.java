package com.anilt.ds.linkedlist;

import java.util.ArrayList;
import java.util.List;

public class ListTest {

	public static void main(String[] args)
	{
		ArrayList<String> carsList = new ArrayList<String>();
		carsList.add("Xcent");
		carsList.add("POLO");
		carsList.add("Creata");
		
		for (String car : carsList) {
			System.out.println(car);
		}
	}

}
