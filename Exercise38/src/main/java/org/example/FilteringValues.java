package org.example;
import java.util.*;
import java.util.Scanner;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Jonathan Navarro
 */

public class FilteringValues {
    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);

        System.out.print("Enter a list of numbers, separated by spaces: ");
        String data = scnr.nextLine();

        String listofNumbers[] = data.split(" ");

        Integer evenListofNumbers[] = filterEvenNumbers(listofNumbers);

        System.out.print("The even numbers are ");
        for (int i = 0; i < evenListofNumbers.length; i++) {
            if (i < evenListofNumbers.length - 1) {
                System.out.print(evenListofNumbers[i] + " ");
            } else {
                System.out.print(evenListofNumbers[i] + ".");
            }
        }
    }


    public static Integer[] filterEvenNumbers(String listofNumbers[]) {

        ArrayList<Integer> alist = new ArrayList<>();

        for (int i = 0; i < listofNumbers.length; i++) {

            int num = Integer.parseInt(listofNumbers[i]);

            if (num % 2 == 0) {

                alist.add(num);
            }
        }

        Integer[] array = new Integer[alist.size()];
        array = alist.toArray(array);

        return array;
    }
}
