package me.rainking;

/**
 * @author Rain
 * @date 2018/5/23
 */
public class ReverseWordsInaString {
    public static void main(String[] args) {
        ReverseWordsInaString o = new ReverseWordsInaString();
        String[] sArr = {"the sky is blue", ""};

        for (String s : sArr){
            System.out.println(o.reverseWords(s));
        }

    }


    /**
     * 正则表达式版，虽然这种方式效率低，但是其实更健壮
     * 关键是理解正则表达式
     * \s 表示空白字符，包括空格、换行、换页
     * + 表示一个及以上
     */
    public String reverseWords(String s) {
        String[] strArr = s.split("\\s+");
        StringBuilder str = new StringBuilder();
        for (int i = strArr.length - 1; -1 < i; i--) {
            if (i != 0)
                str.append(strArr[i]).append(" ");
            else
                str.append(strArr[i]);
        }
        return str.toString().trim();
    }

    /**
     * 稍作修改高效版
     */
    public String reverseWords2(String s) {
        String[] strArr = s.split(" ");
        StringBuilder str = new StringBuilder();
        for (int i = strArr.length - 1; -1 < i; i--) {
            if (!strArr[i].equals("")) {
                str.append(strArr[i]).append(" ");
            }
        }
        return str.toString().trim();
    }


}
