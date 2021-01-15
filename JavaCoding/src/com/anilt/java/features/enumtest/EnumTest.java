package com.anilt.java.features.enumtest;

public enum EnumTest {
	RED("stop"),
	ORANGE("slowdown"),
//	ALL(),
	GREEN("go");
	
	private String action;
	
	public String getAcction()
	{
		return this.action;
	}
	
	private EnumTest(String action) {
		this.action= action;
	}
}
