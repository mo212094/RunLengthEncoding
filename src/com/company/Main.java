package com.company;
import java.util.Scanner;
import java.io.*;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Type in your letters:");
        String word;
        word = input.next();
        int numofchars = word.length();


        for (int i = 0; i < numofchars; i++) {
            int countOfChar = 1;
            while (i < numofchars - 1 && word.charAt(i) == word.charAt(i + 1)) {
                    countOfChar++;
                    i++;
                }
            System.out.print(word.charAt(i));
            System.out.print(countOfChar);
            }



        }
    }





