package com.nicholasblackburn;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        int menu;

        int selection;
        Scanner input = new Scanner(System.in);

        /***************************************************/

        System.out.println("Nicks all in one text to hex to binary converter");
        System.out.println("-------------------------\n");
        System.out.println("1 - java client");
        System.out.println("2 - java server");
        System.out.println("3 - guide");
        System.out.println("4 - Quit");
        System.out.println("-------------------------\n");
        selection = input.nextInt();
        if (selection == 1){
            javaclient.main(args);
        }
        if (selection == 2){
            javaserver.main(args);
        }
        if(selection ==3){
            System.out.print("to m text to binaryake \n");
            System.out.print("first use text to hex and then use hex to binary");

        }
        if (selection == 4) {
            System.exit(0);
        }


    }
}


