package Collections.Set;
import java.util.HashSet;
import java.util.Iterator;
public class Hashset {
    public static void main(String[] args) {
        System.out.println("| Method                      | Description                                         |\r\n" + //
                        "| --------------------------- | --------------------------------------------------- |\r\n" + //
                        "| `add(E e)`                  | Adds an element (ignored if duplicate)              |\r\n" + //
                        "| `addAll(Collection c)`      | Adds all elements from another collection           |\r\n" + //
                        "| `remove(Object o)`          | Removes element if present                          |\r\n" + //
                        "| `removeAll(Collection c)`   | Removes all elements present in another collection  |\r\n" + //
                        "| `retainAll(Collection c)`   | Retains only elements present in another collection |\r\n" + //
                        "| `contains(Object o)`        | Checks if element exists                            |\r\n" + //
                        "| `containsAll(Collection c)` | Checks if all elements in another collection exist  |\r\n" + //
                        "| `size()`                    | Returns number of elements                          |\r\n" + //
                        "| `isEmpty()`                 | Checks if HashSet is empty                          |\r\n" + //
                        "| `clear()`                   | Removes all elements                                |\r\n" + //
                        "| `iterator()`                | Returns Iterator to traverse elements               |\r\n" + //
                        "| `clone()`                   | Returns shallow copy of HashSet                     |\r\n" + //
                        "| `toArray()`                 | Converts HashSet to array                           |\r\n" + //
                        "| `equals(Object o)`          | Compares with another HashSet                       |\r\n" + //
                        "| `hashCode()`                | Returns hash code of the HashSet                    |\r\n" + //
                        "");


        //add(E e) 
        System.out.println("---------- add(E e) ----------");        
        HashSet<String> ha = new HashSet<>(); 
        ha.add("Dharma Raju");
        ha.add("Arjuna");
        ha.add("Bheema");
        ha.add("Nakula");
        ha.add("Sahadeva");
        ha.add("Dharma Raju");
        ha.add("Bheema");
        ha.add("Pandavas");
        ha.add("Real Warriors");
        ha.add("Karna");
        System.out.println(ha);

        ha.add("pandavas");
        
        //addAll(Collection c)
        System.out.println("\n");
        System.out.println("---------- addAll(Collection c) ----------");
        HashSet<String> ha1 = new HashSet<>();
        ha1.add("Pandavas");
        ha1.add("Real Warriors");
        
        ha.add("Nakula");
        ha.add("Sahadeva");
        ha.addAll(ha1);
        System.out.println("Updated Set with addAll method");
        System.out.println(ha);
        System.out.println("<addAll> Elements");
        System.out.println(ha1);

        //remove(Object o)
        System.out.println("\n");
        System.out.println("---------- remove(Object o)) ----------");
        ha.remove("Karna");
        System.out.println(ha);

        //removeAll(Collection c)
        HashSet<String> ha2 = new HashSet<>();
        ha2.add("Kurukshetra");
        ha2.add("Krishna");

        System.out.println("\n");
        System.out.println("---------- removeAll(Collection c) ----------");
        ha2.removeAll(ha2);
        System.out.println(ha2);

        //retainAll(Collection c)
        System.out.println("\n");
        System.out.println("---------- retainAll(Collection c) ----------");
        ha1.retainAll(ha1);
        System.out.println(ha1);

        //contains(Object o)
        System.out.println("\n");
        System.out.println("---------- contains(Object o) ----------");
        boolean b = ha.contains("Arjuna");
        System.out.println("Is Arjuna Present in the Set : "+b);
        

        //containsAll(Collection c)
        System.out.println("\n");
        System.out.println("---------- containsAll(Collection c) ----------");
        boolean d = ha.containsAll(ha1);
        System.out.println("collection ha1 elements are present in ha or not : "+d);
        System.out.println(ha);

        //size()
        System.out.println("\n");
        System.out.println("---------- size() ----------");
        int c = ha.size();
        System.out.println("Size of a given Set : "+c);
        System.out.println(ha);

        //isEmpty()
        System.out.println("\n");
        System.out.println("---------- isEmpty() ----------");
        boolean e = ha.isEmpty();
        System.out.println("Check given set is Empty or not : "+e);
        System.out.println(ha);

        //clear()
        System.out.println("\n");
        System.out.println("---------- Clear() ----------");
        ha1.clear();
        System.out.println(ha1);

        //iterator()
        System.out.println("\n");
        System.out.println("---------- iterator() ----------");
        ha.iterator();
        System.out.println(ha);

        //clone()
        System.out.println("\n");
        System.out.println("---------- clone() ----------");
        
        HashSet<String> ha3 = (HashSet<String>)ha.clone();
        ha3.add("Kurukshetra");
        ha3.add("Sri Krishna");
        ha3.add("War");

        System.out.println("Original Set [ha] : ");
        System.out.println(ha);

        System.out.println("Clone Set [ha3] : ");
        System.out.println(ha3); 

        //toArray()
        System.out.println("\n");
        System.out.println("---------- toArray() ----------");
        ha.toArray();
        System.out.println(ha);

        //equals(Object o)
        System.out.println("\n");
        System.out.println("---------- equals(Object o) ----------");
        boolean isEqual = ha.equals(ha3);
        System.out.println("is eual or not : "+isEqual);
        
        //hashCode()
        System.out.println("\n");
        System.out.println("---------- hashCode() ----------");
        long l = ha.hashCode();
        System.out.println("hashCode of the set : "+l);

        //For indvidual objects
        System.out.println("For indvidual objects");
        for(String h : ha) {
            System.out.println(h +"->" +h.hashCode());
        }
       

    }
}
