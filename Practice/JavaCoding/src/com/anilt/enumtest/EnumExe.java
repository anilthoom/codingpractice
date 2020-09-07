package com.anilt.enumtest;

public class EnumExe {

	public static void main(String[] args) {
		EnumTest[] et = EnumTest.values();
		for (EnumTest enumTest : et) {
			System.out.println("Name : "+enumTest.name()
			+" Action : "
			+ enumTest.getAcction()
			);
		}
	}
}
