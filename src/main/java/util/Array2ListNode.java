package util;

import dataStructure.ListNode;

import java.util.ArrayList;

/**
 * @author GeneYP
 * @version 1.0
 * @date 2022/9/17 19:29
 * @description 数组转链表工具类
 */
public class Array2ListNode {
    /**
     * 根据数组构建链表
     * @param arr 链表的数组表示
     * @return 构建成功后链表的头节点
     */
    public ListNode constructList(final int[] arr) {
        ListNode head = new ListNode(arr[0]);   // 把数组的第一个位置定义为头结点
        ListNode other = head;                  // 一个指针，此时指向头结点
        for(int i = 1; i < arr.length; i++){          //头结点已经定义，从1开始
            other.next = new ListNode(arr[i]);
            other = other.next;
        }
        //在此处打印结点容易导致head的变化
        return head;
    }

    public void nodeToList(ListNode node){
        ArrayList<Integer> list = new ArrayList<>();
        while(node != null){
            list.add(node.val);
            node = node.next;
        }
        System.out.println(list);
    }
}
