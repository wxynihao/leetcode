package me.rainking;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Rain
 * @date 2018/5/21
 */
public class RegularExpressionMatching {
    public static void main(String[] args) {

        RegularExpressionMatching o = new RegularExpressionMatching();

        String[] s = {"aa", "aa", "ab", "aab", "mississippi"};
        String[] p = {"a", "a*", ".*", "c*a*b", "mis*is*p*."};

        for (int i = 0; i < s.length; i++) {
            System.out.println(o.isMatch(s[i], p[i]));
        }

    }

    public boolean isMatch(String s, String p) {

        return false;
    }

}
