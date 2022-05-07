package day30Collections;

import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDeque {
    /*
    for queue :FIFO:fist in first out
    for Deque:LIFO:last in first out
    1)Queue:work with FIFO
     */
    public static void main(String[] args) {

        Queue<String> q1=new LinkedList<>();
        q1.offer("a");
        System.out.println(q1);//[a]
        //this will be learned more while Lamda instruction
        Queue<String> q2=new PriorityQueue<>();

        //Double Ended Queue
        Deque<String> dq1 =new LinkedList<>();
        dq1.addFirst("A");
        dq1.addFirst("B");
        dq1.addFirst("C");
        dq1.addLast("D");
        System.out.println(dq1);//[C, B, A, D]

    }
}
