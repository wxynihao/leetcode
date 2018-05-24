package me.rainking;

import java.util.LinkedList;

/**
 * @author Rain
 * @date 2018/5/24
 */
public class ValidParentheses {
    public static void main(String[] args) {
        ValidParentheses o = new ValidParentheses();

        String strArr[] = {"()", "()[]{}", "(]", "([)]", "{[]}", "", "]"};

        for (String str : strArr) {
            System.out.println(o.isValid3(str));
        }

    }

    /**
     * 不使用栈
     */
    public boolean isValid(String s) {

        if (s.length() % 2 == 1)
            return false;

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {
                sb.append(s.charAt(i));
            } else if (s.charAt(i) == ')') {
                if (sb.length() != 0 && sb.charAt(sb.length() - 1) == '(') {
                    sb.deleteCharAt(sb.length() - 1);
                } else {
                    return false;
                }
            } else if (s.charAt(i) == ']') {
                if (sb.length() != 0 && sb.charAt(sb.length() - 1) == '[') {
                    sb.deleteCharAt(sb.length() - 1);
                } else {
                    return false;
                }

            } else if (s.charAt(i) == '}') {
                if (sb.length() != 0 && sb.charAt(sb.length() - 1) == '{') {
                    sb.deleteCharAt(sb.length() - 1);
                } else {
                    return false;
                }
            }

        }

        if (sb.length() == 0)
            return true;
        else
            return false;
    }

    /**
     * 使用栈
     * Stack 因为同步，效率肯定没有LinkedList高
     */
    public boolean isValid2(String s) {
        LinkedList<Character> stack = new LinkedList<Character>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.addFirst(ch);
            } else {

                if (stack.isEmpty())
                    return false;

                char temp = stack.poll();

                if (ch == ')' && temp != '(') {
                    return false;
                } else if (ch == ']' && temp != '[') {
                    return false;
                } else if (ch == '}' && temp != '{') {
                    return false;
                }
            }
        }
        if (!stack.isEmpty())
            return false;
        return true;
    }

    /**
     * 使用char数组实现栈
     */
    public boolean isValid3(String s) {
        int maxLength = s.length() / 2 + 1;
        char[] a = new char[maxLength];
        int top = 0;
        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case '(':
                case '{':
                case '[':
                    a[top++] = s.charAt(i);
                    if (top >= maxLength)
                        return false;
                    break;
                case ')':
                    if (top > 0 && a[top - 1] == '(') {
                        top--;
                        break;
                    }
                    return false;
                case '}':
                    if (top > 0 && a[top - 1] == '{') {
                        top--;
                        break;
                    }
                    return false;
                case ']':
                    if (top > 0 && a[top - 1] == '[') {
                        top--;
                        break;
                    }
                    return false;
                default:
                    return false;
            }
        }

        if (top != 0)
            return false;

        return true;
    }

}
