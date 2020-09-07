package com.anilt.enumtest;

public enum EnumTest {
	RED("stop"),
	ORANGE("slowdown"),
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
