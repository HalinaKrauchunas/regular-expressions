//отсортировать абзацы по количеству предложений;

package com.epam.projects.nine;

import java.util.*;

public class SortParagraph {

    public static void main(String[] args) {

        String str = "My name.\nMy age. My dog. My cat. Beautiful. 67.\nMy mother. Good. Thank you. October. ";
        HashMap<String, Integer> hashMap = new HashMap<> ();
        String[] arrParagraphs = str.split ("([\\n])");

        numberOfSentenceInParagraph (hashMap, arrParagraphs);
        sortByNumbSent (hashMap);
    }

    public static void sortByNumbSent(HashMap<String, Integer> hashMap) {

        hashMap.entrySet ()
            .stream ()
            .sorted (Map.Entry.comparingByValue (Comparator.reverseOrder ())).forEach (System.out::println);
    }

    private static void numberOfSentenceInParagraph(HashMap<String, Integer> hashMap, String[] arrParagraphs) {

        for (String paragraph : arrParagraphs) {
            int countSent = paragraph.split ("([.!?])([\\s])([A-Z]*)").length;
            hashMap.put (paragraph, countSent);
        }
    }
}

