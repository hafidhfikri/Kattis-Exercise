/*
Stuck In A Time Loop Problem
https://open.kattis.com/problems/timeloop
Created by Hafidh Fikri
*/

import java.util.Scanner;

public class Abracadabra {
	 public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 long a = sc.nextLong();
		 for(int i =1; i <= a; i++) {
			 System.out.println(i + " Abracadabra");
		 }
	 } 
}
