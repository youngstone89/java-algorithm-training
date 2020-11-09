package linkedlist;

import linkedlist.addTwoNumbers.ListNode;

import java.util.List;

public class SolutionAddTwoNumbers {


    public static void main(String[] args) {





        int [] arr1 = {4,3};
        ListNode l1 = new ListNode(2);
        int [] arr2 = {6,4};
        ListNode l2 = new ListNode(5);

        l1 = generateListNode(l1,arr1);
        l2 = generateListNode(l2,arr2);

        ListNode node = addTwoNumbers(l1,l2);
        System.out.println(node);


    }

    public static ListNode generateListNode(ListNode rootnode, int [] arr){

        ListNode curr = rootnode;
        int index = 0;
        while(index < arr.length){
            curr.next = new ListNode(arr[index++]);
            curr = curr.next;
        }
        System.out.println(rootnode);

        return rootnode;
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode p = l1, q = l2, curr = dummyHead;
        int carry = 0;
        while (p != null || q != null) {
            int x = (p != null) ? p.val : 0;
            int y = (q != null) ? q.val : 0;
            int sum = carry + x + y;
            carry = sum / 10;
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
            if (p != null) p = p.next;
            if (q != null) q = q.next;7
        }
        if (carry > 0) {
            curr.next = new ListNode(carry);
        }
        return dummyHead.next;
    }
}
