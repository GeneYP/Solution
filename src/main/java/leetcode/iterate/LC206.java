package leetcode.iterate;

import dataStructure.ListNode;
import util.Array2ListNode;

import java.util.Scanner;

/**
 * Leetcode 206: 反转链表
 * 给你单链表的头节点 head ，请你反转链表，并返回反转后的链表。
 *
 * 输入：head = [1,2,3,4,5]
 * 输出：[5,4,3,2,1]
 */
public class LC206 {

    /**
     * 反转链表：（迭代法）
     * 在遍历链表时，将当前节点的 next 指针改为指向前一个节点。
     * 由于节点没有引用其前一个节点，因此必须事先存储其前一个节点。
     * 在更改引用之前，还需要存储后一个节点。最后返回新的头引用。
     *
     * @param head 链表头节点
     * @return prev 链表
     */
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;

            prev = curr;
            // 存储前一个节点
            curr = next;
        }
        return prev;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("输入链表长度：");
        int num = in.nextInt();
        int[] nodes = new int[num];
        System.out.println("输入链表：");
        for (int i = 0; i < num; i++) {
            nodes[i] = in.nextInt();
        }
        Array2ListNode array2ListNode = new Array2ListNode();
        ListNode head = array2ListNode.constructList(nodes);
        LC206 lc206 = new LC206();
        ListNode listNode = lc206.reverseList(head);
        array2ListNode.nodeToList(listNode);
    }
}
