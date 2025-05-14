/*
Autori Problem
https://open.kattis.com/problems/autori
Created by Hafidh Fikri
*/

import java.util.Scanner;

public class Autori {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 String a = sc.next();
		 String[] b = a.split("-");
		 int l = b.length;
		 
		 for(int i = 0; i < l;i++) {
			 String tmp = b[i];
			 System.out.print(tmp.substring(0,1));
		 }
	 }
}
