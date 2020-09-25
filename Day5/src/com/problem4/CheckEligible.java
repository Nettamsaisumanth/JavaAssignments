package com.problem4;

public class CheckEligible {
static String elegibilityCheck(String name,int age) throws CustomException
{
	if(age < 19)
	{
		throw new CustomException("InvalidAgeRangeException");
	}
	return "youe name is" + name + "your age is " + age + " you are eligible";
}
}
