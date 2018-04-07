package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	//Ask for a message
        System.out.println("Enter a message ");

        //Scanner for message
        Scanner scan = new Scanner(System.in);

        //Scanner input
        String message = scan.next();

        //String builder for reverse string
        StringBuilder reverse = new StringBuilder(message);

//displays backwards message
        System.out.println(reverse.reverse());

    }
}
