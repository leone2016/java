package leetCode;
import java.util.Collections;
import java.util.Map;
import java.util.HashMap;
import java.lang.Integer;


public class test {

    static class ListNode{
        private int value;
        private ListNode next = null;
        ListNode(){}
        ListNode(int val){
            this.value = val;
        }
        ListNode(int val, ListNode next){
            this.value = val;
            this.next  = next;
        }
    }


    public static void main(String[] args){
        test l1 = new test();
        test l2 = new test();

        l1.insertLast(9);
        l1.insertLast(9);
        l1.insertLast(9);
        l1.insertLast(9);
        l1.insertLast(9);
        l1.insertLast(9);
        l1.insertLast(9);

        l2.insertLast(9);
        l2.insertLast(9);
        l2.insertLast(9);
        l2.insertLast(9);

        print(l1.head);
        print(l2.head);
        //++++++++++++++++++++++
        ListNode add2Num = add2Numbers(l1.head, l2.head);
        print(add2Num);
    }

    ListNode head;

    public void insertLast(int value){
        ListNode newValue = new ListNode(value);
        if(head == null){
            head = newValue;
            return;
        }
        //traverse to the last value
        ListNode currentNode = head;
        while (currentNode.next !=null){
            currentNode = currentNode.next;
        }
        currentNode.next = newValue;
    }

    private static void print(ListNode l1){
        String acum ="";
        while(l1 != null){
            acum += l1.value +" | ";
            l1 = l1.next;
        }
        System.out.println(acum);
    }

    public static ListNode add2Numbers(ListNode l1, ListNode l2){
        test result = new test();
        int carry = 0;
        while(l1!=null || l2!=null){
            int x = l1 != null ?l1.value: 0;
            int y = l2 != null ?l2.value: 0;

            int sum = (x+carry)+y;
            int dividend = sum%10;
            carry = sum/10;//remainder
            result.insertLast(dividend);
            l1 = (l1!=null && l1.next != null) ? l1.next: null;
            l2 = (l2!=null && l2.next != null) ? l2.next: null;
        }

        if(carry!=0){
            result.insertLast(carry);
        }
        return result.head;
    }
}
