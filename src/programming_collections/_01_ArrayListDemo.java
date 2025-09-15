package programming_collections;

import java.util.*;

public class _01_ArrayListDemo {

    // ----------------- ADD METHODS -----------------

    // add(Object) -> boolean : adds element at end
    static void addExample() {
        
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        System.out.println("add(Object): " + list); 
        // Output: [Apple, Banana]
        
    }

    // add(index, Object) -> void : adds element at given index
    static void addAtIndexExample() {
        
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Orange");
        list.add(1, "Banana");
        System.out.println("add(index,Object): " + list); 
        // Output: [Apple, Banana, Orange]
        
    }

    // addAll(Collection) -> boolean : add all elements from another list
    static void addAllExample() {
        
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Apple");
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Banana");
        list2.add("Orange");
        list1.addAll(list2);
        System.out.println("addAll(Collection): " + list1); 
        // Output: [Apple, Banana, Orange]
        
    }

    // addAll(index, Collection) -> boolean : insert all at given index
    static void addAllAtIndexExample() {
        
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Orange");
        ArrayList<String> newFruits = new ArrayList<>();
        newFruits.add("Banana");
        newFruits.add("Grapes");
        list.addAll(1, newFruits);
        System.out.println("addAll(index,Collection): " + list); 
        // Output: [Apple, Banana, Grapes, Orange]
        
    }

    // ----------------- REMOVE METHODS -----------------

    // remove(Object) -> boolean
    static void removeObjectExample() {
        
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.remove("Banana");
        System.out.println("remove(Object): " + list); 
        // Output: [Apple]
        
    }

    // remove(index) -> Object
    static void removeIndexExample() {
        
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");
        list.remove(1);  // removes Banana
        System.out.println("remove(index): " + list); 
        // Output: [Apple, Orange]
        
    }

    // removeAll(Collection) -> boolean
    // it will remove mathcing objects only
    static void removeAllExample() {
        
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");
        ArrayList<String> removeList = new ArrayList<>();
        removeList.add("Banana");
        removeList.add("Orange");
        list.removeAll(removeList);
        System.out.println("removeAll(Collection): " + list); 
        // Output: [Apple]
        
    }
    
    
    // retainAll(Collection) -> boolean
    // it will keep mathcing objects and remove others objects
    
    static void retainAllExample() {
        
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");
        ArrayList<String> retainList = new ArrayList<>();
        retainList.add("Banana");
        retainList.add("Orange");
        list.retainAll(retainList);
        System.out.println("retainAll(Collection): " + list); 
        // Output: [Banana, Orange]
        
    }
    
    

    // clear() -> void
    static void clearExample() {
        
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.clear();
        System.out.println("clear(): " + list); 
        // Output: []
        
    }
    
    
 // ----------------- ACCESS METHODS -----------------

    // get(index) -> Object
    static void getExample() {
        
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");  // index value 0
        list.add("Banana"); // 1
        list.add("Orange"); // 2
        System.out.println("get(1): " + list.get(1));  // a[i]
        // Output: Banana
        
    }

    // iterator() -> Iterator
    static void iteratorExample() {
        
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");
        System.out.print("iterator(): ");
        
        
        Iterator<String> it = list.iterator();
        
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();
        // Output: Apple Banana Orange
        
    }

    // listIterator() -> ListIterator
    static void listIteratorExample() {
        
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");
        
        System.out.print("listIterator(): forward direction");
        
        ListIterator<String> it = list.listIterator();
        
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();
        // Output: Apple Banana Orange
        
        System.out.print("listIterator(): backward direction");

        while (it.hasPrevious()) {
        	System.out.print(it.previous() + " ");
        }
        System.out.println();
        // Output:  Orange Banana Apple
        
    }

    // forEach loop
    static void forEachExample() {
        
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");
        System.out.print("forEach: ");
        
        for (String fruit : list) { // we don't need index, we use this approach
        	
            System.out.print(fruit + " ");
        }
        System.out.println();
        // Output: Apple Banana Orange
        
    }
    
   // for loop
    static void forExample() {
        
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");
        System.out.print(": ");
        
        for (int i=0; i<list.size(); i++) {
        	
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
        // Output: Apple Banana Orange
        
    }


    // ----------------- SEARCH METHODS -----------------

    // contains(Object) -> boolean
    static void containsExample() {
        
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        System.out.println(list.contains("Banana")); 
        // Output: true
        
    }

    // containsAll(Collection) -> boolean
    static void containsAllExample() {
        
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");
        ArrayList<String> checkList = new ArrayList<>();
        checkList.add("Apple");
        checkList.add("Orange");
        System.out.println( list.containsAll(checkList)); 
        // Output: true
        
    }

    // indexOf(Object) -> int
    static void indexOfExample() {
        
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");
        list.add("Banana");
        System.out.println( list.indexOf("Banana")); 
        // Output: 1
        
    }

    // lastIndexOf(Object) -> int
    static void lastIndexOfExample() {
        
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");
        list.add("Banana");
        System.out.println(list.lastIndexOf("Banana")); 
        // Output: 3
        
    }

    
    // ----------------- MISCELLANEOUS -----------------

    // size() -> int
    static void sizeExample() {
        
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        System.out.println("size(): " + list.size()); 
        // Output: 2
        
    }

    // isEmpty() -> boolean
    static void isEmptyExample() {
        
        ArrayList<String> list = new ArrayList<>();
        System.out.println("isEmpty(): " + list.isEmpty()); 
        // Output: true
        
    }

    // hashCode() -> int
    static void hashCodeExample() {
        
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        System.out.println("hashCode(): " + list.hashCode()); 
        // Output: some integer
        
    }

    // equals(Object) -> boolean
    static void equalsExample() {
        
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Apple");
        list1.add("Banana");
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Apple");
        list2.add("Banana");
        System.out.println("equals(): " + list1.equals(list2)); 
        // Output: true
        
    }

    // toArray() -> Object[]
    static void toArrayExample() {
        
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        Object[] arr = list.toArray();
        System.out.println("toArray(): " + Arrays.toString(arr)); 
        // Output: [Apple, Banana]
        
    }

    // ----------------- MAIN -----------------
    
    public static void main(String[] args) {
    
        addExample();
        addAtIndexExample();
        addAllExample();
        addAllAtIndexExample();
        
        removeObjectExample();
        removeIndexExample();
        removeAllExample();
        retainAllExample();
        clearExample();
        
        containsExample();
        containsAllExample();
        indexOfExample();
        lastIndexOfExample();
        
        getExample();
        iteratorExample();
        listIteratorExample();
        forEachExample();
        
        sizeExample();
        isEmptyExample();
        hashCodeExample();
        equalsExample();
        toArrayExample();
    }
}


