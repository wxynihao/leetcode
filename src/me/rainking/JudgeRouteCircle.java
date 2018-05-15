package me.rainking;

/**
 * @author Rain
 * @description 简单题，即计算L与R是否一样多，U和D是否一样多
 *                  虽然这题简单，但是我是100%呀
 * @date 2018/5/15
 */
public class JudgeRouteCircle {

    public static void main(String[] args) {
        JudgeRouteCircle o = new JudgeRouteCircle();

        String[] strArr = {"UD", "LL"};

        for (String str : strArr) {
            System.out.println(o.judgeCircle(str));
        }
    }

    public boolean judgeCircle(String moves) {
        int intArr[] = new int['V'];
        for (char ch : moves.toCharArray()) {
            intArr[ch]++;
        }
        if (intArr['R'] == intArr['L'] && intArr['U'] == intArr['D'])
            return true;
        else
            return false;
    }

}
