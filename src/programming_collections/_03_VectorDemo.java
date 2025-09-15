package programming_collections;

import java.util.*;

public class _03_VectorDemo {

    // ----------------- ADD METHODS -----------------

    static void addExample() {
        
        Vector<String> v = new Vector<>();
        v.add("Apple");
        v.add("Banana");
        System.out.println("add(Object): " + v); 
        // Output: [Apple, Banana]
        
    }

    static void addAtIndexExample() {
        
        Vector<String> v = new Vector<>();
        v.add("Apple");
        v.add("Orange");
        v.add(1, "Banana");
        System.out.println("add(index,Object): " + v); 
        // Output: [Apple, Banana, Orange]
        
    }

    static void addAllExample() {
        
        Vector<String> v1 = new Vector<>();
        v1.add("Apple");
        Vector<String> v2 = new Vector<>();
        v2.add("Banana");
        v2.add("Orange");
        v1.addAll(v2);
        System.out.println("addAll(Collection): " + v1); 
        // Output: [Apple, Banana, Orange]
        
    }

    static void addAllAtIndexExample() {
        
        Vector<String> v = new Vector<>();
        v.add("Apple");
        v.add("Orange");
        Vector<String> newFruits = new Vector<>();
        newFruits.add("Banana");
        newFruits.add("Grapes");
        v.addAll(1, newFruits);
        System.out.println("addAll(index,Collection): " + v); 
        // Output: [Apple, Banana, Grapes, Orange]
        
    }

    static void addElementExample() {
        
        Vector<String> v = new Vector<>();
        v.addElement("Apple");
        v.addElement("Banana");
        System.out.println("addElement(): " + v); 
        // Output: [Apple, Banana]
        
    }

    // ----------------- REMOVE METHODS -----------------

    static void removeObjectExample() {
        
        Vector<String> v = new Vector<>();
        v.add("Apple");
        v.add("Banana");
        v.remove("Banana");
        System.out.println("remove(Object): " + v); 
        // Output: [Apple]
        
    }

    static void removeIndexExample() {
        
        Vector<String> v = new Vector<>();
        v.add("Apple");
        v.add("Banana");
        v.add("Orange");
        v.remove(1);
        System.out.println("remove(index): " + v); 
        // Output: [Apple, Orange]
        
    }

    static void removeElementExample() {
        
        Vector<String> v = new Vector<>();
        v.add("Apple");
        v.add("Banana");
        v.removeElement("Apple");
        System.out.println("removeElement(): " + v); 
        // Output: [Banana]
        
    }

    static void removeAllElementsExample() {
        
        Vector<String> v = new Vector<>();
        v.add("Apple");
        v.add("Banana");
        v.removeAllElements();
        System.out.println("removeAllElements(): " + v); 
        // Output: []
        
    }

    // ----------------- SEARCH METHODS -----------------

    static void containsExample() {
        
        Vector<String> v = new Vector<>();
        v.add("Apple");
        v.add("Banana");
        System.out.println("contains(Banana): " + v.contains("Banana")); 
        // Output: true
        
    }

    static void indexOfExample() {
        
        Vector<String> v = new Vector<>();
        v.add("Apple");
        v.add("Banana");
        v.add("Orange");
        v.add("Banana");
        System.out.println("indexOf(Banana): " + v.indexOf("Banana")); 
        // Output: 1
        
    }

    static void lastIndexOfExample() {
        
        Vector<String> v = new Vector<>();
        v.add("Apple");
        v.add("Banana");
        v.add("Orange");
        v.add("Banana");
        System.out.println("lastIndexOf(Banana): " + v.lastIndexOf("Banana")); 
        // Output: 3
        
    }

    // ----------------- ACCESS METHODS -----------------

    static void getExample() {
        
        Vector<String> v = new Vector<>();
        v.add("Apple");
        v.add("Banana");
        v.add("Orange");
        System.out.println("get(1): " + v.get(1)); 
        // Output: Banana
        
    }

    static void elementAtExample() {
        
        Vector<String> v = new Vector<>();
        v.add("Apple");
        v.add("Banana");
        System.out.println("elementAt(0): " + v.elementAt(0)); 
        // Output: Apple
        
    }

    static void firstLastExample() {
        
        Vector<String> v = new Vector<>();
        v.add("Apple");
        v.add("Banana");
        System.out.println("firstElement(): " + v.firstElement()); 
        // Output: Apple
        System.out.println("lastElement(): " + v.lastElement()); 
        // Output: Banana
        
    }

    // ----------------- MISCELLANEOUS -----------------

    static void sizeCapacityExample() {
        
        Vector<String> v = new Vector<>(2);
        v.add("Apple");
        v.add("Banana");
        System.out.println("size(): " + v.size()); 
        // Output: 2
        System.out.println("capacity(): " + v.capacity()); 
        // Output: 2
        v.add("Orange");
        System.out.println("capacity after adding extra element: " + v.capacity()); 
        // Output: 4 (doubles automatically)
        
    }

    // ----------------- MAIN -----------------

    public static void main(String[] args) {
        addExample();
        addAtIndexExample();
        addAllExample();
        addAllAtIndexExample();
        addElementExample();

        removeObjectExample();
        removeIndexExample();
        removeElementExample();
        removeAllElementsExample();

        containsExample();
        indexOfExample();
        lastIndexOfExample();

        getExample();
        elementAtExample();
        firstLastExample();

        sizeCapacityExample();
    }
}

