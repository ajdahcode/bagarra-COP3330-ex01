package org.example;

import java.util.Scanner;
public class App
{
    public static void main( String[] args )
    {
        Scanner scnN = new Scanner(System.in);
        System.out.print( "What is your name? " );
        String name = scnN.next();
        System.out.print( "Hello, "+ name +", nice to meet you!");
    }
}
