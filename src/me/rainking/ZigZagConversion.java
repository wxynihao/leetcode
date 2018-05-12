package me.rainking;

/**
 * @author Rain
 * @description 这题的运算时长很不稳定，就多掌握几种思路吧
 * @date 2018/5/12
 */
public class ZigZagConversion {
    public static void main(String[] args) {
        ZigZagConversion obj = new ZigZagConversion();
        String s = "PAYPALISHIRING";
//        String s = "A";
        System.out.println(obj.convert(s, 2));
        System.out.println(obj.convert(s, 3));
        System.out.println(obj.convert(s, 4));

    }


    /**
     * 第一种思路：将s转换为字符数组，构造有numRows个StringBuilder的数组，然后按照0,1,2,...,numRow-1,numRows-2,...,1,0的顺序
     * 依次获取一个s中的字符。然后合并数组中全部StringBuilder。
     */
    public String convert(String s, int numRows) {
        int length = s.length();
        if (numRows == 1 || length < numRows) {
            return s;
        }
        StringBuilder zigStr = new StringBuilder();
        StringBuilder[] sSub = new StringBuilder[numRows];
        int i = 0;
        boolean isNagative = true;
        for (int j = 0; j < length; j++) {
            if (sSub[i] == null) {
                sSub[i] = new StringBuilder();
            }
            sSub[i].append(s.charAt(j));
            if (isNagative) {
                i++;
                if (i == numRows) {
                    isNagative = false;
                    i = numRows - 2;
                }

            } else {
                i--;
                if (i == -1) {
                    isNagative = true;
                    i = 1;
                }
            }
        }
        for (StringBuilder str : sSub) {
            zigStr.append(str);
        }
        return zigStr.toString();
    }


    /**
     * 第二种思路：
     */
    public String convert3(String s, int numRows) {

        if (s == null || s.length() == 0 || numRows <= 1 || s.length() <= numRows) {
            return s;
        }
        final int length = s.length(), step = (2 * numRows) - 2;
        final char[] chars = s.toCharArray();
        final StringBuilder result = new StringBuilder(length);

        //首行
        for (int i = 0; i < length; i += step) {
            result.append(chars[i]);
        }
        //中间行
        for (int rowIndex = 1; rowIndex < (numRows - 1); rowIndex++) {
            int baseCharIndex = rowIndex;
            int neighbourCharIndex = step - rowIndex;

            while (baseCharIndex < length) {
                result.append(chars[baseCharIndex]);
                baseCharIndex += step;

                if (neighbourCharIndex < length) {
                    result.append(chars[neighbourCharIndex]);
                    neighbourCharIndex += step;
                }
            }
        }
        //末行
        for (int i = (numRows - 1); i < length; i += step) {
            result.append(chars[i]);
        }

        return result.toString();
    }


}
