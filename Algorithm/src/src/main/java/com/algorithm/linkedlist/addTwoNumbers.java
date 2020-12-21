package com.algorithm.linkedlist;

import java.util.Stack;

public class addTwoNumbers {

    public static void main(String[] args) {

//        Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
//        Output: 7 -> 0 -> 8
//        Explanation: 342 + 465 = 807.


    ListNode n1 = new ListNode(9);
//    n1.next = new ListNode(4);
//    n1.next.next = new ListNode(3);

    ListNode n2 = new ListNode(1);
    n2.next = new ListNode(9);
    n2.next.next = new ListNode(9);
    n2.next.next.next = new ListNode(9);
    n2.next.next.next.next = new ListNode(9);
    n2.next.next.next.next.next = new ListNode(9);
    n2.next.next.next.next.next.next = new ListNode(9);
    n2.next.next.next.next.next.next.next= new ListNode(9);
    n2.next.next.next.next.next.next.next.next = new ListNode(9);
    n2.next.next.next.next.next.next.next.next.next= new ListNode(9);

    ListNode resultNode = addTwoNumbers(n1,n2);




    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        long result = 0;

        Stack<Integer> intStack= new Stack<>();
        intStack = convertToStack(l1,intStack);
        result+=convertToNumber(intStack);

        Stack<Integer> intStack2= new Stack<>();
        intStack = convertToStack(l2,intStack2);
        result+=convertToNumber(intStack);

        String [] string_arr= String.valueOf(result).split("");
        Stack<Integer> reversedStack = new Stack<>();
        for (int i = 0; i < string_arr.length; i++) {
            reversedStack.push(Integer.parseInt(string_arr[i]));
        }
        ListNode resultNode = new ListNode(reversedStack.pop());
        int index = 1;
        resultNode=rescursiveListNode(resultNode,reversedStack);


        return resultNode;
    }

    public static ListNode rescursiveListNode(ListNode node,Stack<Integer> stack){

        if(!stack.empty()){

            node.next = new ListNode(stack.pop());

            rescursiveListNode(node.next,stack);
        }

        return node;
    }

    public static Stack<Integer>  convertToStack(ListNode node,Stack<Integer> intStack){

        intStack.push(node.val);
        if(node.next != null){
            convertToStack(node.next,intStack);
        }

        return intStack;
    }
    public static Long convertToNumber(Stack<Integer> intStack){
        long result = 0;
        String stringResult = "";
        while(!intStack.empty()){
            stringResult=stringResult.concat(String.valueOf(intStack.pop()));
        }
        result = Long.parseLong(stringResult);
        return result;
    }

    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

}

