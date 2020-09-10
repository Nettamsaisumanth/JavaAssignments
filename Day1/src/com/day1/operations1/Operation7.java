package com.day1.operations1;

public class Operation7 {
public String fizzBuzz(int temp)
{  
		//System.out.println(temp);
	if((temp%3==0)&&(temp%5==0))
		return temp+"fizzBuzz";
		if((temp%3) == 0)
			return temp+"fizz";
		if((temp%5) == 0)
		     return temp+"Buzz";
		
		 
			return "";
			
	}
	
	
	
}

