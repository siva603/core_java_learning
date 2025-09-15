package programming_collections;

import java.util.*;

public class _07_TreeSetDemo {

    // ----------------- ADD METHODS -----------------

    static void addExample() {
        TreeSet<String> set = new TreeSet<>();
        set.add("Banana");
        set.add("Apple");
        set.add("Orange");
        set.add("Apple"); // duplicate ignored
        System.out.println("add(): " + set); 
        // Output: [Apple, Banana, Orange] (sorted)
    }

    static void addAllExample() {
        TreeSet<String> set1 = new TreeSet<>();
        set1.add("Apple");
        TreeSet<String> set2 = new TreeSet<>();
        set2.add("Banana");
        set2.add("Orange");
        set1.addAll(set2);
        System.out.println("addAll(): " + set1); 
        // Output: [Apple, Banana, Orange] (sorted)
    }

    // ----------------- REMOVE METHODS -----------------

    static void removeExample() {
        TreeSet<String> set = new TreeSet<>();
        set.add("Apple");
        set.add("Banana");
        set.remove("Apple");
        System.out.println("remove(Object): " + set); 
        // Output: [Banana]
    }

    static void removeAllExample() {
        TreeSet<String> set1 = new TreeSet<>();
        set1.add("Apple");
        set1.add("Banana");
        TreeSet<String> set2 = new TreeSet<>();
        set2.add("Banana");
        set1.removeAll(set2);
        System.out.println("removeAll(): " + set1); 
        // Output: [Apple]
    }

    static void retainAllExample() {
        TreeSet<String> set1 = new TreeSet<>();
        set1.add("Apple");
        set1.add("Banana");
        TreeSet<String> set2 = new TreeSet<>();
        set2.add("Banana");
        set1.retainAll(set2);
        System.out.println("retainAll(): " + set1); 
        // Output: [Banana]
    }

    static void clearExample() {
        TreeSet<String> set = new TreeSet<>();
        set.add("Apple");
        set.add("Banana");
        set.clear();
        System.out.println("clear(): " + set); 
        // Output: []
    }

    // ----------------- SEARCH METHODS -----------------

    static void containsExample() {
        TreeSet<String> set = new TreeSet<>();
        set.add("Apple");
        set.add("Banana");
        System.out.println("contains(Banana): " + set.contains("Banana")); 
        // Output: true
    }

    static void containsAllExample() {
        TreeSet<String> set1 = new TreeSet<>();
        set1.add("Apple");
        set1.add("Banana");
        TreeSet<String> set2 = new TreeSet<>();
        set2.add("Banana");
        System.out.println("containsAll(): " + set1.containsAll(set2)); 
        // Output: true
    }

    // ----------------- ACCESS METHODS -----------------

    static void iteratorExample() {
        TreeSet<String> set = new TreeSet<>();
        set.add("Banana");
        set.add("Apple");
        set.add("Orange");
        Iterator<String> it = set.iterator();
        System.out.print("iterator(): ");
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println(); 
        // Output: Apple Banana Orange (sorted)
    }

    static void forEachExample() {
        TreeSet<String> set = new TreeSet<>();
        set.add("Apple");
        set.add("Banana");
        System.out.print("forEach(): ");
        set.forEach(e -> System.out.print(e + " "));
        System.out.println(); 
        // Output: Apple Banana
    }

    static void toArrayExample() {
        TreeSet<String> set = new TreeSet<>();
        set.add("Apple");
        set.add("Banana");
        Object[] arr = set.toArray();
        System.out.println("toArray(): " + Arrays.toString(arr)); 
        // Output: [Apple, Banana]
    }

    // ----------------- TREESET SPECIFIC METHODS -----------------

    static void firstLastExample() {
        TreeSet<String> set = new TreeSet<>();
        set.add("Apple");
        set.add("Banana");
        set.add("Orange");
        System.out.println("first(): " + set.first()); 
        // Output: Apple
        System.out.println("last(): " + set.last()); 
        // Output: Orange
    }

    static void lowerFloorCeilingHigherExample() {
        TreeSet<Integer> set = new TreeSet<>();
        set.add(10);
        set.add(20);
        set.add(30);
        System.out.println("lower(20): " + set.lower(20)); 
        // Output: 10
        System.out.println("floor(20): " + set.floor(20)); 
        // Output: 20
        System.out.println("ceiling(25): " + set.ceiling(25)); 
        // Output: 30
        System.out.println("higher(25): " + set.higher(25)); 
        // Output: 30
    }

    static void pollFirstLastExample() {
        TreeSet<String> set = new TreeSet<>();
        set.add("Apple");
        set.add("Banana");
        set.add("Orange");
        System.out.println("pollFirst(): " + set.pollFirst()); 
        // Output: Apple
        System.out.println("pollLast(): " + set.pollLast()); 
        // Output: Orange
        System.out.println("Set after pollFirst & pollLast: " + set); 
        // Output: [Banana]
    }

    static void descendingSubHeadTailExample() {
        TreeSet<String> set = new TreeSet<>();
        set.add("Apple");
        set.add("Banana");
        set.add("Orange");
        System.out.println("descendingSet(): " + set.descendingSet()); 
        // Output: [Orange, Banana, Apple]
        System.out.println("subSet(Apple, Orange): " + set.subSet("Apple", "Orange")); 
        // Output: [Apple, Banana]
        System.out.println("headSet(Banana): " + set.headSet("Banana")); 
        // Output: [Apple]
        System.out.println("tailSet(Banana): " + set.tailSet("Banana")); 
        // Output: [Banana, Orange]
    }

    // ----------------- MISCELLANEOUS -----------------

    static void equalsHashCodeExample() {
        TreeSet<String> set1 = new TreeSet<>();
        set1.add("Apple");
        TreeSet<String> set2 = new TreeSet<>();
        set2.add("Apple");
        System.out.println("equals(): " + set1.equals(set2)); 
        // Output: true
        System.out.println("hashCode(): " + set1.hashCode()); 
        // Example Output: 63499 (varies)
    }

    static void sizeIsEmptyExample() {
        TreeSet<String> set = new TreeSet<>();
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

        firstLastExample();
        lowerFloorCeilingHigherExample();
        pollFirstLastExample();
        descendingSubHeadTailExample();

        equalsHashCodeExample();
        sizeIsEmptyExample();
    }
}
