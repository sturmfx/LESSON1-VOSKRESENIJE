package com.company;

import java.util.Scanner;

public class Main
{
     //ttunikitashtobert@gmail.com
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
	    String x = input.nextLine();
	    String y = input.nextLine();
	    System.out.println(x + " " + y);
    }

    public static void func1()
    {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();

        if(x % 2 == 0)
        {
            System.out.println(x + " is even");
        }
        else
        {
            System.out.println(x + " is not even");
        }
    }
}
