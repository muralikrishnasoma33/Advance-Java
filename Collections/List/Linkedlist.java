package Collections.List;
import java.util.LinkedList;
import java.util.Iterator;
import java.util.ListIterator;
public class Linkedlist {
    public static void main(String[] args){
        LinkedList <String> LL = new LinkedList<>();
        LL.add("200");
        LL.add("300");
        LL.add("400");
        LL.add("500");
        LL.add("600");
        LL.add("700");
        System.out.println("Original List : ");
        System.out.println(LL);

        //1. Addding Elements (add(E e), add(int index, E e), addFirst(E e), addLast(E e), offer(E e), offerFirst(E e), offerLast(E e))
        //add(int index, E e) --> Adds at specific position.
        System.out.println("\n");
        System.out.println("========== Adding Elements ==========");
        System.out.println("------>add(E,e), add(int index,E e), addFirst(E e), addLast(E e)");
        System.out.println("------.offer(E e), offerFirst(E e), offerLast(E e)");
        LL.add(3,"300");
        System.out.println("Adding at Specific position <add> : ");
        System.out.println(LL);

        //addFirst(E e)  --> Adds element at the beginning
        System.out.println("\n");
        LL.addFirst("100");
        System.out.println("Adding an element at the beginning <addFirst> : ");
        System.out.println(LL);

        //addLast(E e) --> Adds element at the end 
        System.out.println("\n");
        LL.addLast("800");
        System.out.println("Adding an element at the ending <addLast> : ");
        System.out.println(LL);

        //offer(E e) --> Adds element to the tail (like a queue)
        System.out.println("\n");
        LL.offer("900");
        System.out.println("Adds element to the tail (like a queue) <offer> : ");
        System.out.println(LL);

        //offerFirst(E e) --> Adds at the front 
        System.out.println("\n");
        LL.offerFirst("000");
        System.out.println("Adds at the front <offerFirst> : ");
        System.out.println(LL);

        //offerLast(E e) --> Adds at the end 
        System.out.println("\n");
        LL.offerLast("1000");
        System.out.println("Adds at the end <offerLast> : ");
        System.out.println(LL);


        //Accessing Elements (get(int index), getFirst(), getLast(), peek(), peekFirst(), peekLast())
        //get(int index) --> Get element at position   
        System.out.println("\n");
        System.out.println("========== Accessing Elements ==========");
        System.out.println("------>get(int index), getFirst(), getLast()");
        System.out.println("------>peek(), peekFirst(), peekLast()");
        String a = LL.get(3);
        System.out.println("Get element at position <get(int index)> : "+a);
        System.out.println(LL);

        // getFirst() --> Returns first element  
        System.out.println("\n");
        String b = LL.getFirst();
        System.out.println("Returns first element <getFirst()> : "+b);
        System.out.println(LL);

        // getLast() --> Returns last element  
        System.out.println("\n");
        String c = LL.getLast();
        System.out.println("Returns last element <getLast()> : "+c);
        System.out.println(LL);

        //peek() --> Returns head (first element) but doesn’t remove  [same as getFirst]
        System.out.println("\n");
        String d = LL.peek();
        System.out.println("Returns head (first element) but doesnot remove <peek()> : "+d);
        System.out.println(LL);
        
        //peekFirst() -->  Same as `peek()`
        System.out.println("\n");
        String e = LL.peekFirst();
        System.out.println("Same as `peek()`   <peekFirst()> : "+e);
        System.out.println(LL);

        //peekLast() -->  Returns last element 
        System.out.println("\n");
        String f = LL.peekLast();
        System.out.println("Returns last element <peekLast()> : "+f);
        System.out.println(LL);

        //3.Updating Elements (set(int index, E e))
        //set(int index, E e) --> Replace element at index
        System.out.println("\n");
        System.out.println("========== Updating Elements ==========");
        System.out.println("========== Set(in index, E e) method Only ==========");
        LL.set(5,"1100");
        System.out.println("Replace element at index <set(int index, E e)> : ");
        System.out.println(LL);

        //4. Removing Elements (remove(), remove(int index), remove(Object o), removeFirst(), removeLast(), poll(), pollFirst(), pollLast(), clear())
        //remove() --> Removes first element
        System.out.println("\n");
        System.out.println("========== Removing Elements ==========");
        System.out.println("------>> remove(), remove(int index(), remove(Obect o), removeFirst(), removeLast())");
        System.out.println("------>> poll(), pollFirst(), pollLast(), clear()");
        String s1 = LL.remove();
        System.out.println("Removes first element <remove()> : "+s1);
        System.out.println(LL);

        //remove(int index) --> Removes by index
        System.out.println("\n");
        String i = LL.remove(0);
        System.out.println("Removes by index <remove(int index)> : "+i);
        System.out.println(LL);

        //remove(Object o) --> Removes by object
        System.out.println("\n");
        LL.remove("1100");
        System.out.println("Removes by Object <remove(Object o)> : ");
        System.out.println(LL);

        // removeFirst(), and remove() are same

        //removeLast() --> removes last element
        System.out.println("\n");
        String s = LL.removeLast();
        System.out.println("Removes Last Element <removeLast()> : "+s);
        System.out.println(LL);

        //poll() --> Retrieves and removes head   
        System.out.println("\n");
        String x = LL.poll();
        System.out.println("Retrieves and removes first element <poll()> : "+x);
        System.out.println(LL);

        //pollFirst() is same as poll()

        //pollLast() --> Retrives and removes tail
        System.out.println("\n");
        String y=LL.pollLast();
        System.out.println("Retrieves and removes tail <poll()> : "+y);
        System.out.println(LL);
        
        //clear() --> Removes all elements 

        //5.Searching/Checking : (contains(Object o), indexof(Object o), lastIndexof(Object o), isEmpty(), size())
        //contains(Object o) --> Checks if element exists
        System.out.println("\n");
        System.out.println("========== Searching/Checking Elements ==========");
        System.out.println("------> contains(Object o), indexOf(Oject o), lastIndexof(Object o), isEmpty(), size()");
        boolean z = LL.contains("700");
        System.out.println("Checks if element exists <contains()> : "+z);
        System.out.println(LL);

        //indexOf(Object o) --> Returns first index 
        System.out.println("\n");
        int o = LL.indexOf("500");
        System.out.println("Returns first index <indexOf(Object o)> : "+o);
        System.out.println(LL);

        //lastIndexOf(Object o) --> Returns last index 
        System.out.println("\n");
        int t = LL.lastIndexOf("900");
        System.out.println("Returns last index <lastIndexOf(Object o)> : "+t);
        System.out.println(LL);

        //size() --> returns number of Elements
        System.out.println("\n");
        int u = LL.size();
        System.out.println("returns number of Elements <size()> : "+u);
        System.out.println(LL);

        //Iterating (iterator(), descendingIterator(), listIterator(), forEach() (labda expression))
        //iterator() --> Forward iteration  
        System.out.println("\n");
        System.out.println("========== Iterating Elements ==========");
        System.out.println("------>iterator(), descendingIterator(), listIterator(), forEach(), for loop");
        Iterator<String> it = LL.iterator();
        System.out.println("Iterator : ");
            while(it.hasNext()){
                System.out.println(it.next());
        }

        //descendingIterator() --> Backward iteration 
        System.out.println("\n");
        Iterator<String> it1 = LL.descendingIterator();
        System.out.println("Descending order : ");
        while(it1.hasNext()){
            System.out.println(it1.next());
        }

        //listIterator() --> Forward and Backward
        System.out.println("\n");
        ListIterator<String> lit = LL.listIterator();
        System.out.println("List Iterator Forward Direction : ");
        while(lit.hasNext()){
            System.out.println(lit.next());
        }
        System.out.println("List Iterator Backward Direction : ");
        while(lit.hasPrevious()){
            System.out.println(lit.previous());
        }

        //forEach -->  Uses lambda expression
        System.out.println("\n");
        System.out.println("forEach using lambda expression : ");
        LL.forEach(L -> System.out.println(L));

        //for loop
        System.out.println("\n");
        System.out.println("Using for loop : ");
        for(String L : LL){
            System.out.println(L);
        }

        //7. Queue / Deque Specific Methods : (push(E e), pop(), peek())
        //push(E e) --> Push element to stack (front) 
        System.out.println("\n");
        System.out.println("========== Queue / Deque Specific Methods : ==========");
        System.out.println("------>push(E e), pop(), peek()");
        LL.push("200");
        System.out.println("pushing an element into stack : ");
        System.out.println(LL);

        //pop() --> Pop element (remove first)
        System.out.println("\n");
        LL.pop();
        System.out.println("popping an element from stack : ");
        System.out.println(LL);

        //peek() --> Look at first element
        System.out.println("\n");
        String w = LL.peek();
        System.out.println("peeking an element from stack : "+w);
        System.out.println(LL);
    }
}
