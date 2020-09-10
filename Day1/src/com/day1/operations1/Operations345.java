package com.day1.operations1;

public class Operations345 {
private int number1;
public int getNumber1() {
	return number1;
}
public void setNumber1(int number1) {
	this.number1 = number1;
}
public int getNumber2() {
	return number2;
}
public void setNumber2(int number2) {
	this.number2 = number2;
}
public int getNumber3() {
	return number3;
}
public void setNumber3(int number3) {
	this.number3 = number3;
}
private int number2;
private int number3;

public float average(int num1,int num2,int num3)
{
	return (num1+num2+num3)/3;
}

public void SwapOfNumbers(int num1,int num2,Operations345 sop)
{
	int temp;
	/*temp = num1;
	num1 = num2;
	num2 = temp;
	/*num1 = num1 + num2;
	num2 = num1 - num2;
	num1 = num1 - num2*/;
	temp =sop.number1;
	sop.number1 = sop.number2;
	sop.number2=temp;
	
}

public boolean checkPrime(int num3)
{
	int temp;
	if(num3 == 2)
		return true;
	if(num3 == 0)
		return false;
	for(temp = 2;temp<num3;temp++)
	{
		if(num3%temp==0)
		{
			return false;
		}
	}
	return true;
	
}
}
