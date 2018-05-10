package me.rainking;

/**
 * @author Rain
 * @description
 * @date 2018/5/10
 */
public class LongestSubstringWithoutRepeatingCharacters {

    public static void main(String[] args) {
        LongestSubstringWithoutRepeatingCharacters obj = new LongestSubstringWithoutRepeatingCharacters();

        System.out.println(obj.lengthOfLongestSubstring("abcabcbb"));
        System.out.println(obj.lengthOfLongestSubstring("bbbbb"));
        System.out.println(obj.lengthOfLongestSubstring("pwwkew"));

    }


    /**
     * 一次跑通，但是效率不好版
     * 从第一个开始记录长度，添加前判断是否已经包含该字符，如果包含则获取字符串上一次位置到当前位置的字符构造新的字符串，
     * 比较新字符串的长度与已有最长长度的大小关系
     */
    public int lengthOfLongestSubstring(String s) {
        int max = 0;
        StringBuilder tempStr = new StringBuilder(26);
        int length = s.length();
        for (int i = 0; i < length; i++) {
            int pos = tempStr.indexOf(s.charAt(i) + "");
            tempStr.append(s.charAt(i));
            if (pos != -1) {
                tempStr = new StringBuilder(tempStr.subSequence(pos + 1, tempStr.length()));
            }
            max = Math.max(max, tempStr.length());
        }
        return max;
    }

    /**
     * 大神版
     * 这个是效率靠前的一个版本，思路相当清奇，巧妙的利用ASCII码，如将a的位置记录在tempArray[97]，将b的位置记录在tempArray[98]，以此类推，
     */
    public int lengthOfLongestSubstring2(String s) {
        int length = s.length(), max = 0;
        int[] tempArray = new int[128];
        for (int j = 0, i = 0; j < length; j++) {
            i = Math.max(tempArray[s.charAt(j)], i);
            max = Math.max(max, j - i + 1);
            tempArray[s.charAt(j)] = j + 1;
        }
        return max;
    }

}
