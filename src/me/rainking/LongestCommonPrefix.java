package me.rainking;

/**
 * @author Rain
 * @date 2018/5/21
 */
public class LongestCommonPrefix {
    public static void main(String[] args) {
        LongestCommonPrefix o = new LongestCommonPrefix();
        String[][] strArrArr = {{"flower", "flow", "flight"}, {"dog", "racecar", "car"}, {"aaaaa", "a"}};

        for (String[] strArr : strArrArr) {
            System.out.println(o.longestCommonPrefix2(strArr));
        }
    }

    public String longestCommonPrefix(String[] strs) {
        int strLength = strs.length;
        if (strLength == 0) {
            return "";
        }
        StringBuilder strBuilder = new StringBuilder();


        for (int i = 0; i < strs[0].length(); i++) {

            for (String str : strs) {
                int length = str.length();
                if (length == i || str.charAt(i) != strs[0].charAt(i)) {
                    return strBuilder.toString();
                }
            }
            strBuilder.append(strs[0].charAt(i));
        }

        return strBuilder.toString();
    }

    public String longestCommonPrefix2(String[] strs) {
        if (strs.length == 0) return "";
        String pre = strs[0];

        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(pre) != 0) {
                pre = pre.substring(0, pre.length() - 1);
            }
        }

        return pre;
    }
}
