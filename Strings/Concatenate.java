package com.wipro.Strings;
import java.util.*;
public class Concatenate {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		String s2=sc.nextLine();
		String s3=s1.concat(s2);
		System.out.println(s3.toLowerCase());
	}

}
