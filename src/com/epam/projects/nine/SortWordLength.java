//в каждом предложении отсортировать слова по длине;
package com.epam.projects.nine;

import java.util.*;

public class SortWordLength {

    public static void main(String[] args) {

        String str = "My name.\nMy age. My dog. My cat. Beautiful. 67.\nMy mother. Good. Thank you. October. ";
        String[] sent = str.split ("([.!?][\\s])");
        sortSentenceByLengthWord (sent);
    }

    private static void sortSentenceByLengthWord(String[] sent) {

        for (String words : sent) {
            System.out.println (words + ": ");
            String[] word = words.split ("\\s");
            Arrays.stream (word).sorted (Comparator.comparing (String::length).reversed ()).forEach (System.out::println);
        }
    }
}
