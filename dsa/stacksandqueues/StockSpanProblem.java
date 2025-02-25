package com.bridgelabz.dsa.stacksandqueues;


import java.util.Stack;

class StockSpan{
    Stack<int[]> stack;

    StockSpan(){
        this.stack = new Stack<>();
    }

    public int next(int price){
        int day = 1;

        while (!stack.isEmpty() && stack.peek()[0] <= price){
            day += stack.pop()[1];
        }

        stack.push(new int[]{price, day});

        return day;
    }

}


public class StockSpanProblem {

    public static void main(String[] args) {
        StockSpan stockSpanner = new StockSpan();
        System.out.println(stockSpanner.next(100));
        System.out.println(stockSpanner.next(80));
        System.out.println(stockSpanner.next(60));
        System.out.println(stockSpanner.next(70));
        System.out.println(stockSpanner.next(60));
        System.out.println(stockSpanner.next(75));
        System.out.println(stockSpanner.next(85));

    }
}
