package com.wipro.Strings;
import java.util.*;
public class SubString {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String str=sc.nextLine();
	int n=str.length();
	String two=str.substring(0,2);
	for(int i=0;i<n;i++)
	{
		System.out.print(two);
	}
}
}
