package me.rainking;

/**
 * @author Rain
 * @date 2018/6/5
 */
public class NumberOfLinesToWriteString {
    public static void main(String[] args) {
        NumberOfLinesToWriteString o = new NumberOfLinesToWriteString();

        int[] widths = {
                4,10,10,10,10,10,10,10,10,10,
                10,10,10,10,10,10,10,10,10,10,
                10,10,10,10,10,10};
        String S = "bbbcccdddaaa";

        for (int i : o.numberOfLines(widths, S)) {
            System.out.println(i);
        }


    }

    /**
     * 把长度加到一行，如果超过100则另起一行
     */
    public int[] numberOfLines(int[] widths, String S) {
        int[] result = {0, 0};
        int length = 0;
        int current = 0;
        for (char ch : S.toCharArray()) {
            current = widths[ch - 97];
            length += current;
            if (length > 100) {
                result[0]++;
                length = current;
            }
        }
        if (length != 0) {
            result[0]++;
        }
        result[1] = length;
        return result;
    }
}
