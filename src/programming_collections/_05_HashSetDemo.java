package programming_collections;

import java.util.*;

public class _05_HashSetDemo {

    // ----------------- ADD METHODS -----------------

    static void addExample() {
        HashSet<String> set = new HashSet<>();
        set.add("Apple");
        set.add("Banana");
        set.add("Apple"); // duplicate ignored
        System.out.println("add(): " + set); 
        // Output: [Apple, Banana] (order not guaranteed)
    }

    static void addAllExample() {
        HashSet<String> set1 = new HashSet<>();
        set1.add("Apple");
        HashSet<String> set2 = new HashSet<>();
        set2.add("Banana");
        set2.add("Orange");
        set1.addAll(set2);
        System.out.println("addAll(): " + set1); 
        // Output: [Apple, Banana, Orange]
    }

    // ----------------- REMOVE METHODS -----------------

    static void removeExample() {
        HashSet<String> set = new HashSet<>();
        set.add("Apple");
        set.add("Banana");
        set.remove("Apple");
        System.out.println("remove(Object): " + set); 
        // Output: [Banana]
    }

    static void removeAllExample() {
        HashSet<String> set1 = new HashSet<>();
        set1.add("Apple");
        set1.add("Banana");
        HashSet<String> set2 = new HashSet<>();
        set2.add("Banana");
        set1.removeAll(set2);
        System.out.println("removeAll(): " + set1); 
        // Output: [Apple]
    }

    static void retainAllExample() {
        HashSet<String> set1 = new HashSet<>();
        set1.add("Apple");
        set1.add("Banana");
        HashSet<String> set2 = new HashSet<>();
        set2.add("Banana");
        set1.retainAll(set2);
        System.out.println("retainAll(): " + set1); 
        // Output: [Banana]
    }

    static void clearExample() {
        HashSet<String> set = new HashSet<>();
        set.add("Apple");
        set.add("Banana");
        set.clear();
        System.out.println("clear(): " + set); 
        // Output: []
    }

    // ----------------- SEARCH METHODS -----------------

    static void containsExample() {
        HashSet<String> set = new HashSet<>();
        set.add("Apple");
        set.add("Banana");
        System.out.println("contains(Banana): " + set.contains("Banana")); 
        // Output: true
    }

    static void containsAllExample() {
        HashSet<String> set1 = new HashSet<>();
        set1.add("Apple");
        set1.add("Banana");
        HashSet<String> set2 = new HashSet<>();
        set2.add("Banana");
        System.out.println("containsAll(): " + set1.containsAll(set2)); 
        // Output: true
    }

    // ----------------- ACCESS METHODS -----------------

    static void iteratorExample() {
        HashSet<String> set = new HashSet<>();
        set.add("Apple");
        set.add("Banana");
        Iterator<String> it = set.iterator();
        System.out.print("iterator(): ");
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println(); 
        // Output: Apple Banana (order not guaranteed)
    }

    static void forEachExample() {
        HashSet<String> set = new HashSet<>();
        set.add("Apple");
        set.add("Banana");
        System.out.print("forEach(): ");
        set.forEach(e -> System.out.print(e + " "));
        System.out.println(); 
        // Output: Apple Banana (order not guaranteed)
    }

    static void toArrayExample() {
        HashSet<String> set = new HashSet<>();
        set.add("Apple");
        set.add("Banana");
        Object[] arr = set.toArray();
        System.out.println("toArray(): " + Arrays.toString(arr)); 
        // Output: [Apple, Banana]
    }

    // ----------------- MISCELLANEOUS -----------------

    static void equalsHashCodeExample() {
        HashSet<String> set1 = new HashSet<>();
        set1.add("Apple");
        HashSet<String> set2 = new HashSet<>();
        set2.add("Apple");
        System.out.println("equals(): " + set1.equals(set2)); 
        // Output: true
        System.out.println("hashCode(): " + set1.hashCode()); 
        // Example Output: 63499 (varies)
    }

    static void sizeIsEmptyExample() {
        HashSet<String> set = new HashSet<>();
        set.add("Apple");
        set.add("Banana");
        System.out.println("size(): " + set.size()); 
        // Output: 2
        System.out.println("isEmpty(): " + set.isEmpty()); 
        // Output: false
    }

    // ----------------- MAIN -----------------

    public static void main(String[] args) {
        addExample();
        addAllExample();

        removeExample();
        removeAllExample();
        retainAllExample();
        clearExample();

        containsExample();
        containsAllExample();

        iteratorExample();
        forEachExample();
        toArrayExample();

        equalsHashCodeExample();
        sizeIsEmptyExample();
    }
}

