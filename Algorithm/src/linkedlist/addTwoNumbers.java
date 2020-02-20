package linkedlist;

import java.util.Stack;

public class addTwoNumbers {

    public static void main(String[] args) {

//        Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
//        Output: 7 -> 0 -> 8
//        Explanation: 342 + 465 = 807.

    ListNode n1 = new ListNode(2);
    n1.next = new ListNode(4);
    n1.next.next = new ListNode(3);

    ListNode n2 = new ListNode(5);
    n2.next = new ListNode(6);
    n2.next.next = new ListNode(4);

    int result = 0;
    result = addTwoNumbers(n1,n2);
    System.out.println(result);



    }

    public static int addTwoNumbers(ListNode l1, ListNode l2) {
        int result = 0;
        //find number looping through listnode
        //until next node is not null
        Stack<Integer> intStack1= new Stack<>();
        Stack<Integer> intStack2= new Stack<>();

        int number1=0;
        int number2=0;

        intStack1 = addTwoNumbers.convertToNumber(l1,intStack1);
        intStack2 = addTwoNumbers.convertToNumber(l2,intStack2);

        result = convertToNumber(intStack1) + convertToNumber(intStack2);
    return result;
    }

    public static Stack<Integer>  convertToNumber(ListNode node,Stack<Integer> intStack){

        intStack.push(node.val);
        if(node.next != null){
            addTwoNumbers.convertToNumber(node.next,intStack);
        }

        return intStack;
    }
    public static int convertToNumber(Stack<Integer> intStack){
        int result = 0;
        String stringResult = "";
        while(!intStack.empty()){
            stringResult=stringResult.concat(String.valueOf(intStack.pop()));
        }
        result = Integer.parseInt(stringResult);
        return result;
    }

    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

}

