package com.ReGexDemo2;

import java.util.regex.Pattern;

public class Demo2
{
	public static void main(String[] args) {
		System.out.println(Pattern.matches("SRI", "SR"));//I is missing in the input
		System.out.println(Pattern.matches("SRI", "SRI"));//matches
		System.out.println(Pattern.matches("[SRI]", "S"));//The input has the same character as ReGex
		System.out.println(Pattern.matches("[SRI]", "SKR"));//input mismatching with ReGex
		System.out.println(Pattern.matches("[SRI]?", "R"));//?- defines character in ReGex cannot occurs once or not at all in the input
		System.out.println(Pattern.matches("[SRI]?", "SSSKR"));//S is repeating
		System.out.println(Pattern.matches("[SRI]+", "SSSKR"));//+ -character in ReGex can occurs once or more in the input but not different characters
		System.out.println(Pattern.matches("[SRI]+", "SSSRI"));//matching
		System.out.println(Pattern.matches("[SRI]*", "SSSSSSIIII"));//ReGex can occur zero or more times
	}
}
