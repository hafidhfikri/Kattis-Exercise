/*
One Chicken Per Person! Problem
https://open.kattis.com/problems/onechicken
Created by Hafidh Fikri	
*/
import java.util.Scanner;

public class Chicken {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = a - b;

        if(c < 0){
            int tmp = c*-1;
            if(tmp==1){
                System.out.println("Dr. Chaz will have "+ tmp +" piece of chicken left over!");
            }else{
                System.out.println("Dr. Chaz will have "+ tmp +" pieces of chicken left over!");
            }
        }else{
            if(c==1){
                System.out.println("Dr. Chaz needs "+c+" more piece of chicken!");
            }else{
                System.out.println("Dr. Chaz needs "+c+" more pieces of chicken!");
            }
        }
    }
}
