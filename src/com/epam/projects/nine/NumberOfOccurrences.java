// отсортировать лексемы в предложении по убыванию количества вхождений заданного символа, а в случае равенства – по
// алфавиту
package com.epam.projects.nine;

import com.epam.projects.*;

import java.util.*;
import java.util.regex.*;

import static com.epam.projects.nine.SortParagraph.*;

public class NumberOfOccurrences {

    public static void main(String[] args) {

        String str = "My name.\nMy age. My dog. My cat. Beautiful. 67.\nMy mother. Good. Thank you. October. ";
        System.out.println ("Enter character: ");
        InputStreamReader reader = new InputStreamReader (System.in);
        String inputString = reader.readLine ();
        HashMap<String, Integer> hashMap = new HashMap<> ();

        String[] parag = str.split ("([.!?][\\s])");
        for (String sentence : parag) {
            String[] wordsSent = sentence.split ("\\s");
            numbOfCharInWord (hashMap, wordsSent, inputString);
            System.out.print ("Sentence: " + sentence);
            System.out.println ();
            sortByNumbSent (hashMap);
            hashMap.clear ();
        }
    }

    private static void numbOfCharInWord(HashMap<String, Integer> hashMap, String[] wordsSent, String inputstring) {

        for (String word : wordsSent) {
            int countA = 0;
            Matcher matcher = Pattern.compile (inputstring).matcher (word);
            while (matcher.find ()) {
                countA++;
            }
            hashMap.put (word, countA);
        }
    }
}
