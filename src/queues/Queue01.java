package queues;

import java.util.LinkedList;
import java.util.Queue;

public class Queue01 {
    public static void main(String[] args) {
        Queue<String> q=new LinkedList<>();
        q.add("Milk");
        q.add("Meat");
        q.add("Bread");
        q.add("Honey");
        q.add("bread");


//        q.poll();
//        q.poll();deletes it
//        q.poll();
        //System.
        // out.println(q.poll());
        q.peek();//just peeks at it retrieves it but doesnt delete it
        System.out.println(q.peek());
        System.out.println(q);

        //its like peek but throws exception nosuchelementexception
        System.out.println(q.element());


        Queue<String > emptyWareHouse=new LinkedList<>();
        System.out.println(emptyWareHouse.peek());


        emptyWareHouse.offer("Ozkan");
       // emptyWareHouse.offer(1);
        System.out.println(emptyWareHouse);
        emptyWareHouse.remove();//removes the head of the list, if emptythrows exception
       // emptyWareHouse.remove();
        System.out.println(emptyWareHouse);

    }
}
