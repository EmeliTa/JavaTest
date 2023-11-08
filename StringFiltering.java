package com.example.demo;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class StringFiltering {
       public static List<String> filterStrings(List<String> inputList) {
        List<String> filteredList = new ArrayList<>();
        for (String str : inputList) {
            if (str.startsWith("a") && str.length() == 3) {
                filteredList.add(str);
            }
        }
        return filteredList;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> inputList = new ArrayList<>();

        System.out.println("Enter the strings on the same line, separated by commas:");
        String inputLine = scanner.nextLine();
        
        String[] inputArray = inputLine.split(",");
        for (String input : inputArray) {
            inputList.add(input);
        }

        List<String> filteredList = filterStrings(inputList);

        System.out.println("Strings that start with 'a' and have exactly 3 letters:");
        for (String str : filteredList) {
            System.out.println(str);
        }
    }
}