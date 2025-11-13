package Collections.Queue;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.SortedSet;
import java.util.Spliterator;
import java.util.TreeSet;

public class Priorityqueue {
    public static void main(String[] args) {
        PriorityQueue<String> PQ = new PriorityQueue<>();
        PQ.add("DJ");
        PQ.add("Adipurush");    
        PQ.add("GangLeader");
        PQ.add("Eega");
        PQ.add("Chakram");
        PQ.add("Bunny");
        PQ.add("F1");
        System.out.println("Original PriorityQueue : ");
        System.out.println(PQ);


        // while (!PQ.isEmpty()) {
        //     System.out.println(PQ.poll()); // prints in sorted order and removes element
        // }
        // System.out.println(PQ);
         
        //Adding Elements
        //add(), offer() are same as other frameworks
        //addAll()
        PriorityQueue<String> PQ1 = new PriorityQueue<>();
        PQ1.add("Bommarillu");
        PQ1.add("Gangotri");
        PQ1.add("Rebel");
        System.out.println("\n");
        System.out.println("------------ addAll() ------------");
        PQ.addAll(PQ1);
        System.out.println(PQ);

        //Retrieving elements
        //element() is same as peek()
        //peek()
        System.out.println("\n");
        System.out.println("------------ peek() ------------");
        String p = PQ1.peek();
        System.out.println("Retrieving an Element : "+p);
        System.out.println(PQ1);

        //Removing elements
        //remove(), remove(Object o), clear() already we have seen
        //poll()
        System.out.println("\n");
        System.out.println("------------ poll() ------------");
        String p1 = PQ1.poll();
        System.out.println("Retrieving an Element : "+p1);
        System.out.println(PQ1);

        //removeAll()
        System.out.println("\n");
        System.out.println("------------ removeAll() ------------");
        PQ.removeAll(PQ1);
        System.out.println("Removing all PQ1 Elements from PQ : ");
        System.out.println(PQ);

        //retainAll(Collection<?> c)
        System.out.println("\n");
        System.out.println("------------ retainAll(Collection<?> c) ------------");
        PQ1.retainAll(PQ1);
        System.out.println("Retaining all PQ1 Elements : ");
        System.out.println(PQ1);

        //check / info
        //size(), isEmpty(), and contains() are known as well
        //containsAll(Collection<?> c)
        System.out.println("\n");
        System.out.println("------------ containsAll(Collection<?> c) ------------");
        PriorityQueue PQ2 = new PriorityQueue<>();
        PQ2.add("DJ");
        PQ2.add("Chakram");
        PQ2.add("Eega");

        boolean b= PQ.containsAll(PQ2);
        System.out.println("Checking all PQ1 Elements are in PQ set or not : "+b);
        System.out.println(PQ2);

        //Iteration / Conversion
        //iterator()
        System.out.println("\n");
        System.out.println("------------ iterator() ------------");
        Iterator<String> i = PQ.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }

        // Get Spliterator
        System.out.println("Original Queue : ");
        System.out.println(PQ);
        Spliterator<String> sp = PQ.spliterator();

        System.out.println("\nTraversing using spliterator():");
        sp.forEachRemaining(System.out::println);

        //toArray()
        System.out.println("\n");
        System.out.println("------------ toArray() ------------");
        Object[] arr = PQ.toArray();

        System.out.println("\nElements using toArray():");
        for (Object element : arr) {
            System.out.println(element);
        }

        //comparator()
        System.out.println("\n");
        System.out.println("------------ comparator() ------------");
        //Sorted By name
        Comparator<String> sortedByName = (s1,s2) -> {
            String part1 = s1.split("\\. ")[1];
            String part2 = s2.split("\\. ")[1];

            String name1 = part1.split(":")[0].trim();
            String name2 = part2.split(":")[0].trim();

            return name1.compareTo(name2);

        };

        PriorityQueue<String> sr = new PriorityQueue<>(sortedByName);
        sr.add("2. Tiru     : 30");
        sr.add("5. Lakki    : 26");
        sr.add("1. Nagu     : 29");
        sr.add("4. Venki    : 29");
        sr.add("3. Kishore  : 30");
        System.out.println("Sorted By Name");
        System.out.println(sortedByName);
        System.out.println(sr);

        //Sorted By Age
        System.out.println("Sorted By Age");
        Comparator<String> SR = (s1,s2) -> {
               int t1 = Integer.parseInt(s1.split("\\ :")[1].trim());
               int t2 = Integer.parseInt(s2.split("\\ :")[1].trim());
               return Integer.compare(t1, t2);
        };

        PriorityQueue<String> sr1 = new PriorityQueue<>(SR);
        sr1.add("2. Tiru     : 30");
        sr1.add("5. Lakki    : 26");
        sr1.add("1. Nagu     : 29");
        sr1.add("4. Venki    : 29");
        sr1.add("3. Kishore  : 30");
        System.out.println(sr1);
        // //comparator() --> Returns the comparator used for ordering (null if natural).
        // Comparator<String> sortedByName = (s1, s2) -> {
        //     String part1 = s1.split("\. ")[1];
        //     String part2 = s2.split("\. ")[1];

        //     String name1 = part1.split(" :")[0].trim();
        //     String name2 = part2.split(" :")[0].trim();

        //     return name1.compareTo(name2);
        // };

        //Stream()
        System.out.println("\n");
        System.out.println("------------- Stream() -------------");
        PQ.stream().forEach(System.out::println);

        System.out.println("\nElements starting with 'B':");
        PQ.stream()
          .filter(name -> name.startsWith("B"))
          .forEach(System.out::println);
            
        

        System.out.println("\n");
        System.out.println("------------- Constructors -------------");
        // 1️⃣ Default constructor
        PriorityQueue<Integer> pq1 = new PriorityQueue<>();
        pq1.add(30);
        pq1.add(10);
        pq1.add(20);
        System.out.println("1️⃣ Default PriorityQueue: " + pq1);

        // 2️⃣ Constructor with initial capacity
        PriorityQueue<Integer> pq2 = new PriorityQueue<>(5);
        pq2.add(50);
        pq2.add(10);
        pq2.add(30);
        System.out.println("2️⃣ PriorityQueue with capacity 5: " + pq2);

        // 3️⃣ Constructor with capacity + comparator (reverse order)
        PriorityQueue<Integer> pq3 = new PriorityQueue<>(5, Comparator.reverseOrder());
        pq3.add(50);
        pq3.add(10);
        pq3.add(30);
        System.out.println("3️⃣ PriorityQueue with reverse order: " + pq3);

        // 4️⃣ Build from a collection
        List<Integer> list = Arrays.asList(40, 10, 30, 20);
        PriorityQueue<Integer> pq4 = new PriorityQueue<>(list);
        System.out.println("4️⃣ PriorityQueue from collection: " + pq4);

        // 5️⃣ Build from another PriorityQueue
        PriorityQueue<Integer> pq5 = new PriorityQueue<>(pq4);
        System.out.println("5️⃣ PriorityQueue copied from another: " + pq5);

        // 6️⃣ Build from a SortedSet (TreeSet)
        SortedSet<Integer> set = new TreeSet<>();
        set.add(25);
        set.add(15);
        set.add(35);
        PriorityQueue<Integer> pq6 = new PriorityQueue<>(set);
        System.out.println("6️⃣ PriorityQueue from SortedSet: " + pq6);
        
    
    }
}


