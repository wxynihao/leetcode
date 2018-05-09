package me.rainking;

/**
 * @author Rain
 * @description 2. 这题主要需要处理和溢出和长度不一时的问题，这题的运行时长及其不稳定，可能与测试用例非常多有关系
 * @date 2018/5/8
 */
public class AddTwoNumbers {

    public static void main(String[] args) {

        ListNode a1 = new ListNode(2);
//        ListNode a2 = new ListNode(4);
//        a1.next = a2;
//        ListNode a3 = new ListNode(3);
//        a2.next = a3;

        ListNode b1 = new ListNode(8);
        ListNode b2 = new ListNode(9);
        b1.next = b2;
        ListNode b3 = new ListNode(9);
        b2.next = b3;

        AddTwoNumbers obj = new AddTwoNumbers();
        ListNode c = obj.addTwoNumbers2(b1, a1);

        while (c != null) {
            System.out.print(c.val + "\t");
            c = c.next;
        }
    }

    /**
     * 先合并，再处理，遍历两次，改进方向就是只遍历一次 64ms
     */
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        //1.将两个序列求和到第一个序列，
        ListNode h = l1;
        ListNode t = null;
        while (l1 != null || l2 != null) {
            if (l1 == null) {
                //1.1 第1个序列为空时，第2个序列后续值即为其和，将第2个序列的后续值接到第1个序列后即可
                t.next = l2;
                break;
            } else if (l2 == null)
                //1.2 第2个序列为空时，表示不再需要求和，第一个序列的后续值即为其和
                break;
            else {
                //1.3 都不为空时直接相加到第1个序列
                l1.val = l1.val + l2.val;
                t = l1;
                l1 = l1.next;
                l2 = l2.next;
            }
        }
        // 2.遍历第1个序列，处理其中大于9的节点
        l1 = h;
        while (l1 != null) {
            if (9 < l1.val) {
                l1.val %= 10;
                if (l1.next != null) {
                    l1.next.val += 1;
                } else {
                    //当序列最后一个元素大于9时，需要新增一个节点
                    l1.next = new ListNode(1);
                    break;
                }
            }
            l1 = l1.next;
        }
        return h;
    }

    /**
     * 只遍历一次的方法，效果还是不稳定 53-65ms
     */
    public ListNode addTwoNumbers2(ListNode l1, ListNode l2) {
        //1.将两个序列求和到第一个序列，
        ListNode h = l1;
        ListNode t = null;
        while (l1 != null || l2 != null) {
            if (l1 == null) {
                //1.1 第1个序列为空时，第2个序列后续值即为其和，将第2个序列的后续值接到第1个序列后即可
                t.next = l2;
                break;
            } else if (l2 == null) {
                //1.2 第2个序列为空时，表示不再需要求和，第一个序列的后续值即为其和
                if (9 < l1.val) {
                    l1.val %= 10;
                    if (l1.next != null)
                        l1.next.val += 1;
                    else {
                        l1.next = new ListNode(1);
                    }
                    l1 = l1.next;
                }else
                    break;
            } else {
                //1.3 都不为空时直接相加到第1个序列
                l1.val = l1.val + l2.val;
                if (9 < l1.val) {
                    l1.val %= 10;
                    if (l1.next != null)
                        l1.next.val += 1;
                    else {
                        l1.next = new ListNode(1);
                    }
                }
                t = l1;
                l1 = l1.next;
                l2 = l2.next;
            }
        }
        return h;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}
