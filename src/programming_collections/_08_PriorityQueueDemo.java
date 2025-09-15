package programming_collections;

import java.util.*;

public class _08_PriorityQueueDemo {

    // ----------------- ADD METHODS -----------------

    static void addExample() {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(30);
        pq.add(10);
        pq.add(20);
        System.out.println("add(): " + pq); 
        // Output (natural order, may vary in internal storage): [10, 30, 20]
    }

    static void offerExample() {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.offer(50);
        pq.offer(40);
        System.out.println("offer(): " + pq); 
        // Output: [40, 50]
    }

    // ----------------- REMOVE METHODS -----------------

    static void removeExample() {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(10);
        pq.add(20);
        pq.add(30);
        System.out.println("remove(): " + pq.remove()); 
        // Output: 10 (head element removed)
        System.out.println("Queue after remove(): " + pq); 
        // Output: [20, 30]
    }

    static void pollExample() {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(15);
        pq.add(5);
        System.out.println("poll(): " + pq.poll()); 
        // Output: 5
        System.out.println("Queue after poll(): " + pq); 
        // Output: [15]
    }

    // ----------------- ACCESS METHODS -----------------

    static void elementExample() {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(100);
        pq.add(50);
        System.out.println("element(): " + pq.element()); 
        // Output: 50
    }

    static void peekExample() {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(200);
        pq.add(150);
        System.out.println("peek(): " + pq.peek()); 
        // Output: 150
    }

    // ----------------- SEARCH METHODS -----------------

    static void containsExample() {
        PriorityQueue<String> pq = new PriorityQueue<>();
        pq.add("Apple");
        pq.add("Banana");
        System.out.println("contains(Banana): " + pq.contains("Banana")); 
        // Output: true
    }

    // ----------------- MISCELLANEOUS -----------------

    static void sizeIsEmptyExample() {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(1);
        pq.add(2);
        System.out.println("size(): " + pq.size()); // Output: 2
        System.out.println("isEmpty(): " + pq.isEmpty()); // Output: false
    }

    static void iteratorToArrayExample() {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(5);
        pq.add(10);
        Iterator<Integer> it = pq.iterator();
        System.out.print("iterator(): ");
        while(it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();
        Object[] arr = pq.toArray();
        System.out.println("toArray(): " + Arrays.toString(arr));
    }

    static void comparatorExample() {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        System.out.println("comparator(): " + pq.comparator()); 
        // Output: null (natural ordering)
    }

    // ----------------- MAIN -----------------

    public static void main(String[] args) {
        addExample();
        offerExample();

        removeExample();
        pollExample();

        elementExample();
        peekExample();

        containsExample();

        sizeIsEmptyExample();
        iteratorToArrayExample();
        comparatorExample();
    }
}
