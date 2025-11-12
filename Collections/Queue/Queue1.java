package Collections.Queue;
import java.util.Queue;
import java.util.LinkedList;
public class Queue1 {
    public static void main(String[] args) {
        Queue<String> q = new LinkedList<>();
        q.add("Samsung");
        q.add("Iphone");
        q.add("Realme");
        q.add("Motorola");
        q.add("Honor");
        q.add("OnePlus");
        System.out.println("Original Queue");
        System.out.println(q);

        //offer()
        System.out.println("\n");
        System.out.println("---------- offer() ----------");
        q.offer("Blackberry");
        System.out.println(q);

        //remove()
        System.out.println("\n");
        System.out.println("---------- remove() ----------");
        q.remove("Blackberry");
        System.out.println(q);

        //poll()
        System.out.println("\n");
        System.out.println("---------- poll() ----------");
        String s = q.poll();
        System.out.println("Removing first element and retrieves first element : "+s);
        System.out.println(q);

        //element()
        System.out.println("\n");
        System.out.println("---------- element() ----------");
        String t = q.element();
        System.out.println("Retrieves first element but not remove : "+t);
        System.out.println(q);

        //peek()
        System.out.println("\n");
        System.out.println("---------- peek() ----------");
        String u = q.peek();
        System.out.println("Retrieves first element but not remove : "+u);
        System.out.println(q);
    }
}
