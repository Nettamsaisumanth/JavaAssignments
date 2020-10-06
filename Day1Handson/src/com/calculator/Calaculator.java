package com.calculator;

public class Calaculator {
	private int addOfNums;
	private float subOfNums;
	private int mulOfNums;
	private float divOfNums;
	
public int add(int num1,int num2)
{
	
	this.addOfNums =num1+num2;
	return addOfNums;
}

public int add(int num1,int num2,int num3)
{
	
	this.addOfNums = num1+num2+num3;
	return addOfNums;
}

public float sub(float num1,float num2)
{
	
	this.subOfNums = num1 - num2;
	return subOfNums;
}


public int mul(int num1,int num2)
{
	this.mulOfNums = num1*num2;
	return mulOfNums;
}

public float div(float num1,float num2)
{
	
	this.divOfNums = num1 / num2;
	return divOfNums;
}
}

