package com.zt.petclinic.owner;

public class NameUtil {

public static String lastNameUpperCase(String input) {

	if (input != null && 0 < input.length()) 
	{
		return input.toUpperCase();
	}
		return " ";

}

}

