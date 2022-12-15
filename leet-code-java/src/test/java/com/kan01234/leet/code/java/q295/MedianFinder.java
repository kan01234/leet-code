package com.kan01234.leet.code.java.q295;

import java.util.Collections;
import java.util.PriorityQueue;

public class MedianFinder {

    private PriorityQueue<Integer> lefts = new PriorityQueue<>(Collections.reverseOrder());
    private PriorityQueue<Integer> rights = new PriorityQueue<>();
    private boolean even = true;
    public MedianFinder() {
    }

    public void addNum(int num) {
        if (even) {
            rights.offer(num);
            lefts.offer(rights.poll());
        } else {
            lefts.offer(num);
            rights.offer(lefts.poll());
        }
        even = !even;
    }

    public double findMedian() {
        return even ? (lefts.peek() + rights.peek()) / 2.0 : lefts.peek();
    }
}
