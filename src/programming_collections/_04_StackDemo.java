package programming_collections;

import java.util.*;

public class _04_StackDemo {

    // ----------------- STACK METHODS -----------------
    static void stackMethods() {
        
        Stack<String> s = new Stack<>();
        s.push("Apple"); // add
        s.push("Banana");
        System.out.println("peek(): " + s.peek());// print top element // Banana
        System.out.println("pop(): " + s.pop()); // remove top element // Banana
        System.out.println("search(Apple): " + s.search("Apple")); // 1
        System.out.println("empty(): " + s.empty()); // false
        
    }

    // ----------------- VECTOR METHODS -----------------
    static void vectorMethods() {
        
        Stack<String> s = new Stack<>();
        s.addElement("Apple");
        s.addElement("Banana");
        System.out.println("elementAt(0): " + s.elementAt(0)); // Apple
        System.out.println("firstElement(): " + s.firstElement()); // Apple
        System.out.println("lastElement(): " + s.lastElement()); // Banana
        System.out.println("capacity(): " + s.capacity()); // 10
        
    }

    // ----------------- LIST METHODS -----------------
    static void listMethods() {
        
        Stack<String> s = new Stack<>();
        s.add("Apple");
        s.add(1, "Banana");
        List<String> extra = new ArrayList<>();
        extra.add("Orange");
        s.addAll(extra);
        System.out.println("add/addAll(): " + s); // [Apple, Banana, Orange]

        System.out.println("get(1): " + s.get(1)); // Banana
        System.out.println("contains(Orange): " + s.contains("Orange")); // true
        System.out.println("indexOf(Banana): " + s.indexOf("Banana")); // 1

        s.remove("Apple");
        System.out.println("remove(Object): " + s); // [Banana, Orange]
        s.clear();
        System.out.println("clear(): " + s); // []
        
    }

    // ----------------- MAIN -----------------
    public static void main(String[] args) {
        stackMethods();
        vectorMethods();
        listMethods();
    }
}

