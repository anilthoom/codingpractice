package com.anilt.spring.security.test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import com.google.common.collect.Sets;

public class TempMain {

	//Rename when we need to run as java
	public static void main1(String[] args) {
		// TODO Auto-generated method stub
		Set<String> names = Sets.newHashSet("Anil", "Ramya");
		EnumTest[] enumTest = EnumTest.values();
		for (EnumTest et : enumTest) {
			System.out.println(et.name() + et.getSetC().size());
		}
	}

}
enum EnumTest {
	RED(new HashSet<>(Arrays.asList("a", "b", "c"))),
	GREEN(new HashSet<>(Arrays.asList("x", "y"))),
	YELLOW(new HashSet<>(Arrays.asList("z")));
	
	private Set<String> setC;

	/**
	 * @param setC
	 */
	private EnumTest(Set<String> setC) {
		this.setC = setC;
	}

	public Set<String> getSetC() {
		return setC;
	}
}
