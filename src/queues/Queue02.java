package queues;

import java.util.Deque;
import java.util.LinkedList;

public class Queue02 {
    public static void main(String[] args) {
        /*
        only sets are unique data, queue can have multiple of the same data.
        and go are fifo and liso. first in first out , last in first out

        Deque can be repeated data.
        only sets are unique.

         */
        Deque<String> deq=new LinkedList<>();
        deq.add("laz");
        deq.add("oz");
        deq.add("biz");
        deq.add("say");
        deq.add("laz");
        System.out.println(deq);

        deq.push("can");
        System.out.println(deq);

        System.out.println(deq.pop());
        System.out.println(deq);

        System.out.println( deq.removeLastOccurrence("laz"));
        System.out.println(deq);
      deq.push("me");
        System.out.println(deq);




    }
}
