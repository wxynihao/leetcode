package me.rainking;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Rain
 * @description 804. 利用char数值型特性，将字母表的字符与摩斯码对应；利用Set的元素唯一性，消除翻译后重复的摩斯码。
 *                   删除非必需大括号可提高执行效率；将长数组写在1行可提高效率（第一个100%成就达成）
 * @date 2018/5/5
 */
public class UniqueMorseCodeWords {

    public static void main(String[] args) {

        String[] words={"rwjje","aittjje","auyyn","lqtktn","lmjwn"};
        System.out.println(uniqueMorseRepresentations(words));
    }

    public static int uniqueMorseRepresentations(String[] words) {
        String[] alphabet={".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        Set<String> strSet = new HashSet<>(12);
        for (String word : words) {
            StringBuilder str = new StringBuilder();
            char[] charArray = word.toCharArray();
            //a的ASCII码为97，char可用作整型，可使用算术运算符
            for(char ch : charArray) str.append(alphabet[ch-97]);
            strSet.add(str.toString());
        }
        return strSet.size();
    }
}
