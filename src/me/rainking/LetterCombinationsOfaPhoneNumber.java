package me.rainking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Rain
 * @date 2018/5/22
 */
public class LetterCombinationsOfaPhoneNumber {

    public static void main(String[] args) {

        LetterCombinationsOfaPhoneNumber o = new LetterCombinationsOfaPhoneNumber();
        String digits = "23";
        System.out.println(o.letterCombinations(digits));

    }

    public List<String> letterCombinations(String digits) {
        // -2
        char[][] chars = {{'a', 'b', 'c'}, {'d', 'e', 'f'},
                {'g', 'h', 'i'}, {'j', 'k', 'l'}, {'m', 'n', 'o'},
                {'p', 'q', 's'}, {'t', 'u', 'v'}, {'w', 'x', 'y', 'z'},};


        int listLength = 1;
        for (int i = 0; i < digits.length(); i++) {
            int pos = digits.charAt(i) - '0' - 2;
            if (pos == 7)
                listLength *= 4;
            else
                listLength *= 3;
        }

        String[] strList = new String[listLength];

        for (int i = 0; i < listLength; i++) {
            strList[i] = "";
        }

        for (int i = 0; i < digits.length(); i++) {
            int pos = digits.charAt(i) - '0' - 2;

            if (pos == 7) {
                for (int j = 0; j < listLength; j++) {
                    strList[j] += chars[pos][j % 4];
                }
            } else {
                for (int j = 0; j < listLength; j++) {
                    strList[j] += chars[pos][j % 3];
                }
            }

        }

        return Arrays.asList(strList);
    }
}
