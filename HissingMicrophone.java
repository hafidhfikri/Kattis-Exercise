/*
Hissing Microphone Problem
https://open.kattis.com/problems/hissingmicrophone
Created by Hafidh Fikri	
*/

import java.util.Scanner;

public class HissingMicrophone{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String x = sc.next();
        int x_len = x.length();
        int i = 0;
        boolean no_hiss = true;

        while((no_hiss) && (i<x_len)){
            if(x.charAt(i)=='s'){
                if((i+1)<x_len){
                    if(x.charAt(i+1)=='s'){
                        no_hiss = false;
                    }
                }
            }
            i=i+1;
        }

        if(no_hiss){
            System.out.println("no hiss");
        }else{
            System.out.println("hiss");
        }
    }
}