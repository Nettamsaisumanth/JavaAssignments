package com.excercise.day2;

public class Length2 {

	String input;
	static String returnString;

	public String getInput() {
		return input;
	}

	public void setInput(String input) {
		this.input = input;
	}
	
	public static String returnMiddle(String string)
	{
		int length = string.length();
		//
		if(length%2 == 0)
		{
			returnString = string.substring((string.length()/2)-1,string.length()/2+1);
		}
		else{
			returnString = String.valueOf(string.substring(string.length()/2).charAt(0));}
		return returnString;
	}
}
