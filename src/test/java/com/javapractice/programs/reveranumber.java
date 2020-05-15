package com.javapractice.programs;

public class reveranumber {

	public static void main(String[] args) {
		int a = 1258;

		int rev = 0;

		while (a != 0) {
			rev = rev * 10 + a % 10;
			a = a / 10;
		}
		System.out.println(rev);
		
		/*
		 * StringBuffer sb=new StringBuffer(String.valueOf(a)); StringBuffer rev1 =
		 * sb.reverse(); System.out.println(rev1);
		 */
	}

}
