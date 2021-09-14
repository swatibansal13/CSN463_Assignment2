package assignment2;

import java.util.Scanner;

public class CompareStringsLexicographically_Q1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();
		String str2 = sc.nextLine();

		int result = compare(str1, str2);

		if(result==0) 
			System.out.println("Both strings are equal");

		else if(result>0)
			System.out.println("str1 is greater than str2");

		else
			System.out.println("str2 is greater than str1");
	}

	

	public static int compare(String str1, String str2) {

		for(int i=0;i<str1.length() && i<str2.length();i++) {
			if(str1.charAt(i)==str2.charAt(i))
				continue;

			else
				return (int)str1.charAt(i) - (int)str2.charAt(i);
		}

		if(str1.length()==str2.length()) return 0;
		return str1.length() - str2.length();
	}
}