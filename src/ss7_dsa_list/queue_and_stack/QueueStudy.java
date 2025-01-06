package ss7_dsa_list.queue_and_stack;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class QueueStudy {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        queue.add("A");
        queue.add("B");
        queue.add("C");
        queue.add("D");

        while (!queue.isEmpty()) {
            System.out.println(queue.remove());
        }
    }
}
