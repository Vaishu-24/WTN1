package com.wipro.Strings;
import java.util.*;
public class Palindrome {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number");
		int n=sc.nextInt();
		int temp=n;
		System.out.println("The temp value ="+temp);
		int rem=0;
		int rev=0;
		while(n!=0)
		{
			rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
		System.out.println("the rev no is = "+rev);
		if(temp==rev)
		{
			System.out.println(temp+" is the Palindrome");
		}
		else
			System.out.println(temp+" is not Palindrome");
		
		
		
	}

}
