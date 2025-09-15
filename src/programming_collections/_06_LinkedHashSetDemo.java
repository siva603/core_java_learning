package programming_collections;

import java.util.*;

public class _06_LinkedHashSetDemo {

    // ----------------- ADD METHODS -----------------

    static void addExample() {
        LinkedHashSet<String> set = new LinkedHashSet<>();
        set.add("Apple");
        set.add("Banana");
        set.add("Apple"); // duplicate ignored
        System.out.println("add(): " + set); 
        // Output: [Apple, Banana]
    }

    static void addAllExample() {
        LinkedHashSet<String> set1 = new LinkedHashSet<>();
        set1.add("Apple");
        LinkedHashSet<String> set2 = new LinkedHashSet<>();
        set2.add("Banana");
        set2.add("Orange");
        set1.addAll(set2);
        System.out.println("addAll(): " + set1); 
        // Output: [Apple, Banana, Orange]
    }

    // ----------------- REMOVE METHODS -----------------

    static void removeExample() {
        LinkedHashSet<String> set = new LinkedHashSet<>();
        set.add("Apple");
        set.add("Banana");
        set.remove("Apple");
        System.out.println("remove(Object): " + set); 
        // Output: [Banana]
    }

    static void removeAllExample() {
        LinkedHashSet<String> set1 = new LinkedHashSet<>();
        set1.add("Apple");
        set1.add("Banana");
        LinkedHashSet<String> set2 = new LinkedHashSet<>();
        set2.add("Banana");
        set1.removeAll(set2);
        System.out.println("removeAll(): " + set1); 
        // Output: [Apple]
    }

    static void retainAllExample() {
        LinkedHashSet<String> set1 = new LinkedHashSet<>();
        set1.add("Apple");
        set1.add("Banana");
        LinkedHashSet<String> set2 = new LinkedHashSet<>();
        set2.add("Banana");
        set1.retainAll(set2);
        System.out.println("retainAll(): " + set1); 
        // Output: [Banana]
    }

    static void clearExample() {
        LinkedHashSet<String> set = new LinkedHashSet<>();
        set.add("Apple");
        set.add("Banana");
        set.clear();
        System.out.println("clear(): " + set); 
        // Output: []
    }

    // ----------------- SEARCH METHODS -----------------

    static void containsExample() {
        LinkedHashSet<String> set = new LinkedHashSet<>();
        set.add("Apple");
        set.add("Banana");
        System.out.println("contains(Banana): " + set.contains("Banana")); 
        // Output: true
    }

    static void containsAllExample() {
        LinkedHashSet<String> set1 = new LinkedHashSet<>();
        set1.add("Apple");
        set1.add("Banana");
        LinkedHashSet<String> set2 = new LinkedHashSet<>();
        set2.add("Banana");
        System.out.println("containsAll(): " + set1.containsAll(set2)); 
        // Output: true
    }

    // ----------------- ACCESS METHODS -----------------

    static void iteratorExample() {
        LinkedHashSet<String> set = new LinkedHashSet<>();
        set.add("Apple");
        set.add("Banana");
        set.add("Orange");
        Iterator<String> it = set.iterator();
        System.out.print("iterator(): ");
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println(); 
        // Output: Apple Banana Orange (insertion order preserved)
    }

    static void forEachExample() {
        LinkedHashSet<String> set = new LinkedHashSet<>();
        set.add("Apple");
        set.add("Banana");
        System.out.print("forEach(): ");
        set.forEach(e -> System.out.print(e + " "));
        System.out.println(); 
        // Output: Apple Banana Orange
    }

    static void toArrayExample() {
        LinkedHashSet<String> set = new LinkedHashSet<>();
        set.add("Apple");
        set.add("Banana");
        Object[] arr = set.toArray();
        System.out.println("toArray(): " + Arrays.toString(arr)); 
        // Output: [Apple, Banana]
    }

    // ----------------- MISCELLANEOUS -----------------

    static void equalsHashCodeExample() {
        LinkedHashSet<String> set1 = new LinkedHashSet<>();
        set1.add("Apple");
        LinkedHashSet<String> set2 = new LinkedHashSet<>();
        set2.add("Apple");
        System.out.println("equals(): " + set1.equals(set2)); 
        // Output: true
        System.out.println("hashCode(): " + set1.hashCode()); 
        // Example Output: 63499 (varies)
    }

    static void sizeIsEmptyExample() {
        LinkedHashSet<String> set = new LinkedHashSet<>();
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
