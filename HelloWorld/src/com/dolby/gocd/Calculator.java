package com.dolby.gocd;

public class Calculator
{
	public int add(int a, int b)
	{
		return a + b;
	}
	
	public String concatString(String str1, String str2)
	{
		return str1 + str2;
	}
	
	public boolean isLeapYear(int year)
	{
		if(year%4==0&&year%100!=0||year%400==0)
			return true;
		else
			return false;
	}
}
