/*
Last Factorial Digit Problem
https://open.kattis.com/problems/lastfactorialdigit
Created by Hafidh Fikri	
*/
import java.util.Scanner;

public class LastFactorialDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        for(int i=0; i<a;i++){
            int fct = sc.nextInt();
            int tmp = 1;

            for(int f=1;f<=fct;f++){
                tmp = tmp*f;
            }

            String uhuy = ""+tmp;
            int ul = uhuy.length();
            System.out.println(uhuy.charAt(ul-1));
        }
    }
}
