package Collections.Queue;
import java.util.Deque;
import java.util.LinkedList;

public class Deque1 {
    public static void main(String[] args) {
        
        System.out.println("addFirst, addLast, offerFirst, offerLast, removeFirst, removeLast,"); 
        System.out.println("pollFirst, pollLast, getFirst, getLast, peekFirst, peekLast");

        //| **Operation**       | **Head (Front)**  | **Tail (Rear)**  |
       // | ------------------- | ----------------- | ---------------- |
       // | Insert (throws ex)  | `addFirst(E e)`   | `addLast(E e)`   |
       // | Insert (safe)       | `offerFirst(E e)` | `offerLast(E e)` |
       // | Remove (throws ex)  | `removeFirst()`   | `removeLast()`   |
       // | Remove (safe)       | `pollFirst()`     | `pollLast()`     |
       // | Examine (throws ex) | `getFirst()`      | `getLast()`      |
       // | Examine (safe)      | `peekFirst()`     | `peekLast()`     |


       Deque<String> DE = new LinkedList<>();
       DE.add("Hyderabad");
       DE.add("Bangalore");
       DE.add("Mumbai");
       DE.add("Chennai");
       DE.add("Amaravathi");
       DE.add("Pune");
       System.out.println("Original Deque List");
       System.out.println(DE);

       
        //addFirst(E e)   [Same as offerFirst]
        System.out.println("\n");
        ystem.out.println("========== Deque Specific methods ===========");
        System.out.println("-------------- addFirst(E e) --------------");
        DE.addFirst("Vishakapatnam");
        System.out.println(DE);

        //addLast(E e)   [Same as offerLast]
        System.out.println("\n");
        System.out.println("-------------- addLast(E e) --------------");
        DE.addLast("New Delhi");
        System.out.println(DE);

        //offerFirst(E e)
        System.out.println("\n");
        System.out.println("-------------- offerFirst(E e) --------------");
        DE.offerFirst("Itanagar");
        System.out.println(DE);

        //offerLast(E e)
        System.out.println("\n");
        System.out.println("-------------- offerLast(E e) --------------");
        DE.offerLast("Patna");
        System.out.println(DE);

        //removeFirst() and remove are the same as pollFirst() and pollLast()
        //pollFirst()
        System.out.println("\n");
        System.out.println("removeFirst() and remove are the same as pollFirst() and pollLast()");
        System.out.println("-------------- pollFirst() --------------");
        String s = DE.pollFirst();
        System.out.println("Removing and Retrieving First Element : "+s);
        System.out.println(DE); 

        //pollLast()
        System.out.println("\n");
        System.out.println("-------------- pollLast() --------------");
        String t = DE.pollLast();
        System.out.println("Removing and Retrieving Last Element : "+t);
        System.out.println(DE); 

        //getFirst() and getLast() are same as the peekFirst() and peekLast()
        //peekFirst()
        System.out.println("\n");
        System.out.println("-------------- peekFirst() --------------");
        String u = DE.peekFirst();
        System.out.println("Retrieving First Element : "+u);
        System.out.println(DE); 

        //peekLast()
        System.out.println("\n");
        System.out.println("-------------- peekLast() --------------");
        String v = DE.peekLast();
        System.out.println("Retrieving Last Element : "+u);
        System.out.println(DE);
        
        //size(), isEmpty(), contains(Object o),
        // iterator(), toArray(),
        // clear(), remove(Object o),
        // addAll(Collection c), containsAll(Collection c),
        // removeAll(Collection c), retainAll(Collection c)
        //These are common to all collections, including Set, List, Queue, etc.

        //Stack Methods
        Deque<Integer> IN = new LinkedList<>();
        IN.add(10); 
        IN.add(20); 
        IN.add(30); 
        IN.add(40); 
        IN.add(50); 
        System.out.println("Original Deque Set");
        System.out.println(IN);

        System.out.println("======== Stack Methods ========");
        //push()
        System.out.println("\n");
        System.out.println("------------ push() ------------");
        IN.push(60);
        System.out.println(IN);

        //pop()
        System.out.println("\n");
        System.out.println("------------ pop() ------------");
        IN.pop();
        System.out.println(IN);

    }
}
