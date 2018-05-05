package me.rainking;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author Rain
 * @description 77.本题使用indexOf查询是容易实现的
 * @date 2018/5/4
 */
public class JewelsAndStones {
    public static void main(String[] args) {
        System.out.println(numJewelsInStones("aA", "aAAbbbb"));
    }

    public static int numJewelsInStones(String J, String S) {

        int result = 0;
        char[] jchArray = S.toCharArray();
        for(char ch : jchArray){
            if(J.indexOf(ch)!=-1){
                result++;
            }
        }
        return result;
    }


}
