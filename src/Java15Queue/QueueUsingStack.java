package Java15Queue;

import java.util.*;

public class QueueUsingStack {
    static class Queue {
        static Stack<Integer> s1 = new Stack<>();
        static Stack<Integer> s2 = new Stack<>();

        public boolean isEmpty() {
            return s1.isEmpty();
        }

        public void add(int data) {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }

            s1.push(data);

            while (!s2.isEmpty()) {
                s1.push(s2.pop());
            }
        }

        public int remove() {
            if (isEmpty()) {
                System.out.println("Empty Queue");
                return -1;
            }
            return s1.pop();
        }

        public int peek() {
            if (isEmpty()) {
                System.out.println("Empty Queue");
                return -1;
            }
            return s1.peek();
        }
    }

    public static void main(String[] args) {

        Queue queue = new Queue();
        queue.add(10);
        queue.add(20);
        queue.add(30);

        System.out.println("Front element: " + queue.peek());
        System.out.println("Dequeued: " + queue.remove());
        System.out.println("Front element: " + queue.peek());

        while(!queue.isEmpty()){
            System.out.println(queue.peek());
            queue.remove();
        }


    }
}
