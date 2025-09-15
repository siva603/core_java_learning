package programming_collections;

import java.util.*;

public class _02_LinkedListDemo {

    // ----------------- ADD METHODS -----------------

    static void addExample() {
        
        LinkedList<String> list = new LinkedList<>();
        list.add("Apple");
        list.add("Banana");
        System.out.println("add(Object): " + list); 
        // Output: [Apple, Banana]
        
    }

    static void addAtIndexExample() {
        
        LinkedList<String> list = new LinkedList<>();
        list.add("Apple");
        list.add("Orange");
        list.add(1, "Banana");
        System.out.println("add(index,Object): " + list); 
        // Output: [Apple, Banana, Orange]
        
    }

    static void addAllExample() {
        
        LinkedList<String> list1 = new LinkedList<>();
        list1.add("Apple");
        LinkedList<String> list2 = new LinkedList<>();
        list2.add("Banana");
        list2.add("Orange");
        list1.addAll(list2);
        System.out.println("addAll(Collection): " + list1); 
        // Output: [Apple, Banana, Orange]
        
    }

    static void addAllAtIndexExample() {
        
        LinkedList<String> list = new LinkedList<>();
        list.add("Apple");
        list.add("Orange");
        LinkedList<String> newFruits = new LinkedList<>();
        newFruits.add("Banana");
        newFruits.add("Grapes");
        list.addAll(1, newFruits);
        System.out.println("addAll(index,Collection): " + list); 
        // Output: [Apple, Banana, Grapes, Orange]
        
    }

    // ----------------- REMOVE METHODS -----------------

    static void removeObjectExample() {
        
        LinkedList<String> list = new LinkedList<>();
        list.add("Apple");
        list.add("Banana");
        list.remove("Banana");
        System.out.println("remove(Object): " + list); 
        // Output: [Apple]
        
    }

    static void removeIndexExample() {
        
        LinkedList<String> list = new LinkedList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");
        list.remove(1);
        System.out.println("remove(index): " + list); 
        // Output: [Apple, Orange]
        
    }

    static void clearExample() {
        
        LinkedList<String> list = new LinkedList<>();
        list.add("Apple");
        list.add("Banana");
        list.clear();
        System.out.println("clear(): " + list); 
        // Output: []
        
    }

    // ----------------- SEARCH METHODS -----------------

    static void containsExample() {
        
        LinkedList<String> list = new LinkedList<>();
        list.add("Apple");
        list.add("Banana");
        System.out.println("contains(Banana): " + list.contains("Banana")); 
        // Output: true
        
    }

    static void indexOfExample() {
        
        LinkedList<String> list = new LinkedList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");
        list.add("Banana");
        System.out.println("indexOf(Banana): " + list.indexOf("Banana")); 
        // Output: 1
        
    }

    static void lastIndexOfExample() {
        
        LinkedList<String> list = new LinkedList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");
        list.add("Banana");
        System.out.println("lastIndexOf(Banana): " + list.lastIndexOf("Banana")); 
        // Output: 3
        
    }

    // ----------------- ACCESS METHODS -----------------

    static void getExample() {
        
        LinkedList<String> list = new LinkedList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");
        System.out.println("get(1): " + list.get(1)); 
        // Output: Banana
        
    }

    static void iteratorExample() {
        
        LinkedList<String> list = new LinkedList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");
        Iterator<String> it = list.iterator();
        System.out.print("iterator(): ");
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();
        // Output: Apple Banana Orange
        
    }

    // ----------------- MISCELLANEOUS -----------------

    static void sizeExample() {
        
        LinkedList<String> list = new LinkedList<>();
        list.add("Apple");
        list.add("Banana");
        System.out.println("size(): " + list.size()); 
        // Output: 2
        
    }

    static void isEmptyExample() {
        
        LinkedList<String> list = new LinkedList<>();
        System.out.println("isEmpty(): " + list.isEmpty()); 
        // Output: true
        
    }

    // ----------------- LINKEDLIST SPECIFIC METHODS -----------------

    static void addFirstExample() {
        
        LinkedList<String> list = new LinkedList<>();
        list.add("Banana");
        list.addFirst("Apple");
        System.out.println("addFirst(): " + list); 
        // Output: [Apple, Banana]
        
    }

    static void addLastExample() {
        
        LinkedList<String> list = new LinkedList<>();
        list.add("Apple");
        list.addLast("Banana");
        System.out.println("addLast(): " + list); 
        // Output: [Apple, Banana]
        
    }

    static void getFirstExample() {
        
        LinkedList<String> list = new LinkedList<>();
        list.add("Apple");
        list.add("Banana");
        System.out.println("getFirst(): " + list.getFirst()); 
        // Output: Apple
        
    }

    static void getLastExample() {
        
        LinkedList<String> list = new LinkedList<>();
        list.add("Apple");
        list.add("Banana");
        System.out.println("getLast(): " + list.getLast()); 
        // Output: Banana
        
    }

    static void removeFirstExample() {
        
        LinkedList<String> list = new LinkedList<>();
        list.add("Apple");
        list.add("Banana");
        list.removeFirst();
        System.out.println("removeFirst(): " + list); 
        // Output: [Banana]
        
    }

    static void removeLastExample() {
        
        LinkedList<String> list = new LinkedList<>();
        list.add("Apple");
        list.add("Banana");
        list.removeLast();
        System.out.println("removeLast(): " + list); 
        // Output: [Apple]
        
    }

    static void offerExample() {
        
        LinkedList<String> list = new LinkedList<>();
        list.offer("Apple");
        list.offer("Banana");
        System.out.println("offer(): " + list); 
        // Output: [Apple, Banana]
        
    }

    static void pollExample() {
        
        LinkedList<String> list = new LinkedList<>();
        list.offer("Apple");
        list.offer("Banana");
        System.out.println("poll(): " + list.poll()); 
        // Output: Apple
        System.out.println("List after poll: " + list); 
        // Output: [Banana]
        
    }

    static void peekExample() {
        
        LinkedList<String> list = new LinkedList<>();
        list.offer("Apple");
        list.offer("Banana");
        System.out.println("peek(): " + list.peek()); 
        // Output: Apple
        
    }

    // ----------------- MAIN -----------------

    public static void main(String[] args) {
        addExample();
        addAtIndexExample();
        addAllExample();
        addAllAtIndexExample();

        removeObjectExample();
        removeIndexExample();
        clearExample();

        containsExample();
        indexOfExample();
        lastIndexOfExample();

        getExample();
        iteratorExample();

        sizeExample();
        isEmptyExample();

        addFirstExample();
        addLastExample();
        getFirstExample();
        getLastExample();
        removeFirstExample();
        removeLastExample();
        offerExample();
        pollExample();
        peekExample();
    }
}

