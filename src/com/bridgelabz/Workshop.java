package com.bridgelabz;

import java.util.Scanner;

public class Workshop {
    public void OccuranceChar(String str, char ch){
        int count = 0;
        for(int i = 0; i < str.length(); i++)
        {
            if(str.charAt(i) == ch){
                count++;
            }
        }
        System.out.println("character are:" +ch);
        System.out.println("Count is:" +count);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string");
        String str = sc.next();
        System.out.println("Enter character");
        char ch = sc.next().charAt(1);
        Workshop w = new Workshop();
        w.OccuranceChar(str, ch);

    }


}
