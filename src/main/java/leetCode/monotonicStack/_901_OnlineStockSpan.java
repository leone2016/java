package leetCode.monotonicStack;

import java.util.*;
public class _901_OnlineStockSpan {

    private Stack<int[]> stack;

    public _901_OnlineStockSpan() {
        stack = new Stack<>();
    }

    public int next(int price) {
        int span = 1;
        while(!stack.isEmpty() && stack.peek()[0] <= price){
            span += stack.pop()[1];
        }

        stack.push(new int[]{price, span });

        return span;
    }

    public static void main(String[] args) {
        _901_OnlineStockSpan stockSpan = new _901_OnlineStockSpan();
        System.out.println(stockSpan.next(100)); // 1
        System.out.println(stockSpan.next(80)); // 1
        System.out.println(stockSpan.next(60)); // 1
        System.out.println(stockSpan.next(70)); // 2
        System.out.println(stockSpan.next(60)); // 1
        System.out.println(stockSpan.next(75)); // 4
        System.out.println(stockSpan.next(85)); // 6
    }

}
