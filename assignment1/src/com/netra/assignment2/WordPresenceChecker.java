package com.tnsif.assignment2;

import java.util.Scanner;

class SentenceChecker {
    private String sentence;
    private String word;

    public SentenceChecker(String sentence, String word) {
        this.sentence = sentence;
        this.word = word;
    }

    public String getSentence() {
        return sentence;
    }

    public String getWord() {
        return word;
    }

    public boolean isWordPresent() {
        return sentence.contains(word);
    }
}

public class WordPresenceChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the sentence");
        String sentence = scanner.nextLine();

        System.out.println("Enter the word");
        String word = scanner.nextLine();

        SentenceChecker sentenceChecker = new SentenceChecker(sentence, word);

        if (sentenceChecker.isWordPresent()) {
            System.out.println(word + " is present in the sentence");
        } else {
            System.out.println(word + " is not present in the sentence");
        }
    }
}
