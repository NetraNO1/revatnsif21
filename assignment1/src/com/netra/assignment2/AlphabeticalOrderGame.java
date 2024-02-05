package com.tnsif.assignment2;

import java.util.Scanner;

class AlphabeticalSorter {
    private String sentence;

    public AlphabeticalSorter(String sentence) {
        this.sentence = sentence;
    }

    public String getSentence() {
        return sentence;
    }

    public String arrangeLetters() {
        // Check if the sentence contains only alphabets and spaces
        if (!sentence.matches("[a-z ]+")) {
            return sentence + " is an invalid input";
        }

        // Split the sentence into words
        String[] words = sentence.split(" ");
        StringBuilder result = new StringBuilder();

        // Loop through each word and arrange letters in alphabetical order
        for (String word : words) {
            char[] letters = word.toCharArray();
            java.util.Arrays.sort(letters);
            result.append(new String(letters)).append(" ");
        }

        return result.toString().trim();
    }
}

public class AlphabeticalOrderGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the sentence");
        String sentence = scanner.nextLine();

        AlphabeticalSorter sorter = new AlphabeticalSorter(sentence);
        String result = sorter.arrangeLetters();

        System.out.println(result);
    }
}
