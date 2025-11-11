package Collections.Set;
import java.util.TreeSet;

import javax.print.attribute.standard.MediaSize.NA;

import java.util.SortedSet;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;
public class Treeset {
    public static void main(String[] args) {
        System.out.println("---------------------------------------------------------------------------------------\r\n" + //
                        "|                                TreeSet Methods                                      |\r\n" + //
                        "---------------------------------------------------------------------------------------                             \r\n" + //
                        "| Method                              | Description                                   |\r\n" + //
                        "| ----------------------------------- | --------------------------------------------- |\r\n" + //
                        "| `add(E e)`                          | Adds an element if not already present.       |\r\n" + //
                        "| `addAll(Collection<? extends E> c)` | Adds all elements from another collection.    |\r\n" + //
                        "| `clear()`                           | Removes all elements.                         |\r\n" + //
                        "| `contains(Object o)`                | Checks if the element exists.                 |\r\n" + //
                        "| `containsAll(Collection<?> c)`      | Checks if all elements exist.                 |\r\n" + //
                        "| `isEmpty()`                         | Checks if the set is empty.                   |\r\n" + //
                        "| `remove(Object o)`                  | Removes a specific element.                   |\r\n" + //
                        "| `removeAll(Collection<?> c)`        | Removes all elements in the given collection. |\r\n" + //
                        "| `retainAll(Collection<?> c)`        | Keeps only elements in the given collection.  |\r\n" + //
                        "| `size()`                            | Returns number of elements.                   |\r\n" + //
                        "| `iterator()`                        | Returns an iterator in **ascending order**.   |\r\n" + //
                        "| `toArray()`                         | Converts TreeSet to an array.                 |\r\n" + //
                        "| `toArray(T[] a)`                    | Converts TreeSet to a typed array.            |\r\n" + //
                        "| `clone()`                           | Returns a shallow copy of the set.            |\r\n" + //
                        "| `equals(Object o)`                  | Checks equality with another set.             |\r\n" + //
                        "| `hashCode()`                        | Returns hash code for the set.                |");


        TreeSet<String> TR = new TreeSet<>();
        TR.add("Pushpa-The Rule");
        TR.add("Ala Vaikuntapuramlo");
        TR.add("Sarainodu");
        TR.add("Vedam");
        TR.add("Gangotri");
        TR.add("Bunny");
        System.out.println("First Set");
        System.out.println(TR);

        TreeSet<String> TR1 = new TreeSet<>();
        TR1.add("Racegurram");
        TR1.add("Badrinath");
        TR1.add("Julayi");
        TR1.add("Varudu");
        TR1.add("Naa Peru Surya");
        System.out.println("Second Set");
        System.out.println(TR1);

        TreeSet<String> TR2 = new TreeSet<>();
        TR2.add("Vedam");
        TR2.add("Gangotri");
        TR2.add("Bunny");
        System.out.println("Third Set");
        System.out.println(TR2);

        TreeSet<String> TR5 = new TreeSet<>();
        TR5.add("Vedam");
        TR5.add("Gangotri");
        TR5.add("Bunny");
        System.out.println("Sixth Set");
        System.out.println(TR2);

        TreeSet<String> TR3 = new TreeSet<>();
        TR3.add("Yevadu");
        TR3.add("Rangastalam");
        TR3.add("Peddi");
        System.out.println("Forth Set");
        System.out.println(TR3);

        //addAll(Collection<? extends E> c)
        System.out.println("\n");
        System.out.println("------------- addAll(Collection<? extends E> c) -------------");
        TR.addAll(TR1);
        System.out.println("TR1 Set elemnets adding to TR");
        System.out.println(TR);

        //clear() --> Removes all elements.
        System.out.println("\n");
        System.out.println("------------- clear() -------------");
        System.out.println("Clear() Method is same as all");

        //contains(Object o)
        System.out.println("\n");
        System.out.println("------------- contains(Object o) -------------");
        boolean b = TR.contains("Sarainodu");
        System.out.println("Is Sarainodu Element is in TR set or not ? : "+b);
        System.out.println(TR);

        //containsAll(Collection<?> c)
        System.out.println("\n");
        System.out.println("------------- containsAll(Collection<?> c) -------------");
        boolean d = TR.containsAll(TR2);
        System.out.println("Is TR2 Elements is in TR set or not ? : "+d);
        System.out.println(TR);
        System.out.println(TR2);

        //isEmpty()
        System.out.println("\n");
        System.out.println("------------- isEmpty() -------------");
        boolean e = TR.contains("Sarainodu");
        System.out.println("Is TR set is Empty or not ? : "+e);
        System.out.println(TR);

        //remove(Object o)
        System.out.println("\n");
        System.out.println("------------- remove(Object o) -------------");
        TR3.remove("Yevadu");
        System.out.println(TR3);

        //removeAll(Collection<?> c)
        System.out.println("\n");
        System.out.println("------------- removeAll(Collection<?> c) -------------");
        TR3.removeAll(TR3);
        System.out.println(TR3);

        //retainAll(Collection<?> c)
        System.out.println("\n");
        System.out.println("------------- retainAll(Collection<?> c) -------------");
        TR2.retainAll(TR2);
        System.out.println(TR2);

        //size();
        System.out.println("\n");
        System.out.println("------------- size() -------------");
        int i = TR.size();
        System.out.println("Size of a TR Set : "+i);
        
        //iterator()
        System.out.println("\n");
        System.out.println("------------- iterator() -------------");
        TR.iterator();
        System.out.println(TR);

        //toArray()
        System.out.println("\n");
        System.out.println("------------- toArray() -------------");
        TR.toArray();
        System.out.println(TR);

        //toArray(T[] a) --> Converts TreeSet to a typed array.
        System.out.println("\n");
        System.out.println("------------- toArray(T[] a) -------------");
        String[] n = TR.toArray(new String[0]);
        System.out.println("TreeSet elements converted to Array:");
        for(String T : TR){
            System.out.println(T);
        }

        //clone()
        System.out.println("\n");
        System.out.println("------------- clone() -------------");
        TreeSet<String> TR4 = (TreeSet<String>)TR.clone();
        TR4.add("Parugu");
        TR4.add("Arya");
        TR4.add("Arya-2");
        TR4.add("DJ");
        TR4.add("Desamuduru");
        TR4.add("Son of Satyamurthi");
        System.out.println("----- Clone Set [FifthSet] ----- : " );
        System.out.println(TR4);
        System.out.println("------ TR Set ------");
        System.out.println(TR); 

        //equals(Object o)
        System.out.println("\n");
        System.out.println("------------- equals(Object o) -------------");
        boolean b1 = TR2.equals(TR5);
        System.out.println("TR2 and TR5 both sets are having same elements are not? : "+b1);
        System.out.println(TR2);
        System.out.println(TR5);

        //hashCode()
        System.out.println("\n");
        System.out.println("------------- hashCode() -------------");
        long l = TR.hashCode();
        System.out.println("HashCode of TR Set : "+l);

        //For each Element
        System.out.println("----- For Each Element -----");
        for(String T : TR){
            System.out.println(T +"->" +T.hashCode());
        }

        System.out.println("\n");
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------\r\n" + //
                        "|                                            Methods from SortedSet                                                                  |\r\n" + //
                        "--------------------------------------------------------------------------------------------------------------------------------------    \r\n" + //
                        "| Method                                                               | Description                                                 |\r\n" + //
                        "| -------------------------------------------------------------------- | ----------------------------------------------------------- |\r\n" + //
                        "| `comparator()`                                                       | Returns the comparator used for ordering (null if natural). |\r\n" + //
                        "| `first()`                                                            | Returns the **first (lowest)** element.                     |\r\n" + //
                        "| `last()`                                                             | Returns the **last (highest)** element.                     |\r\n" + //
                        "| `headSet(E toElement)`                                               | Returns elements **less than toElement**.                   |\r\n" + //
                        "| `headSet(E toElement, boolean inclusive)`                            | Returns elements ≤ or < `toElement` based on `inclusive`.   |\r\n" + //
                        "| `tailSet(E fromElement)`                                             | Returns elements **≥ fromElement**.                         |\r\n" + //
                        "| `tailSet(E fromElement, boolean inclusive)`                          | Returns elements ≥ or > `fromElement` based on `inclusive`. |\r\n" + //
                        "| `subSet(E fromElement, E toElement)`                                 | Returns elements from `[fromElement, toElement)`.           |\r\n" + //
                        "| `subSet(E fromElement, boolean fromInc, E toElement, boolean toInc)` | Range with inclusive/exclusive bounds.                      |");

        System.out.println("\n");                
        System.out.println("================== SortedSet Methods ==================");                
        //comparator() --> Returns the comparator used for ordering (null if natural).

        Comparator<String> sortedByName = (s1, s2) -> {
            String part1 = s1.split("\\. ")[1];
            String part2 = s2.split("\\. ")[1];

            String name1 = part1.split(" :")[0].trim();
            String name2 = part2.split(" :")[0].trim();

            return name1.compareTo(name2);
        };
        SortedSet<String> SS = new TreeSet<>(sortedByName);
        SS.add("1. Krishna : 25");
        SS.add("2. Murali  : 21");
        SS.add("3. Soma    : 23");
        System.out.println("Sorted by Name:");
        System.out.println(sortedByName);
        System.out.println(SS);

        System.out.println("\n");
        //Sorted by Age
        Comparator<String> sortedByAge = (s1,s2) -> {
            int t1 = Integer.parseInt(s1.split(" :")[1].trim());
            int t2 = Integer.parseInt(s2.split(" :")[1].trim());

            return Integer.compare(t1, t2);
        };
        SortedSet<String> SS1 = new TreeSet<>(sortedByAge);
        SS1.add("1. Krishna : 25");
        SS1.add("2. Murali  : 21");
        SS1.add("3. Soma    : 23");
        System.out.println("Sorted by Age ");
        System.out.println(SS1);

        //first() --> Returns the **first (lowest)** element. 
        System.out.println("\n");
        System.out.println("------------- first() -------------");
        String z = TR.first();
        System.out.println("Returning First Lowest Element : "+z);
        System.out.println(TR);

        //last() --> Returns the **last (highest)** element.
        System.out.println("\n");
        System.out.println("------------- last() -------------");
        String z1 = TR.last();
        System.out.println("Returning Last Highest Element : "+z1);
        System.out.println(TR);
    
        //headSet(E toElement) --> Returns elements **less than toElement**.
        System.out.println("\n");
        System.out.println("------------- headSet(E toElement) -------------");
        TreeSet<String> SS2 = new TreeSet<String>();
        SS2.add("Chandra Babu");
        SS2.add("Pawan kalyan");
        SS2.add("Jagan");
        SS2.add("Lokesh");
        SS2.add("Modi");
        System.out.println(SS2);

        SortedSet<String> headSet =  SS2.headSet("Lokesh");
        System.out.println("Lokesh<");
        System.out.println(headSet);

        //headSet(E toElement, boolean inclusive) --> Returns elements ≤ or < `toElement` based on `inclusive
        System.out.println("\n");
        System.out.println("------------- headSet(E toElement, boolean inclusive) -------------");
        NavigableSet<String> headSetExclusive = SS2.headSet("Lokesh", false);
        System.out.println("Exclusive : "+headSetExclusive);

        NavigableSet<String> headSetInclusive = SS2.headSet("Lokesh", true);
        System.out.println("Inclusive : "+headSetInclusive);
        System.out.println(SS2);

        //tailSet(E fromElement) --> Returns elements **≥ fromElement**.  
        System.out.println("\n");
        System.out.println("------------- tailSet(E fromElement) -------------");
        SortedSet<String> tailSet = SS2.tailSet("Modi");
        System.out.println("Modi>");
        System.out.println(tailSet);

        //tailSet(E fromElement, boolean inclusive) --> Returns elements ≥ or > `fromElement` based on `inclusive`  
        System.out.println("\n");
        System.out.println("------------- tailSet(E fromElement, boolean inclusive) -------------");
        NavigableSet<String> tailSetExclusive = SS2.tailSet("Modi",false);
        System.out.println("Exclusive : "+tailSetExclusive);
        System.out.println(SS2);

        NavigableSet<String> tailSetInclusive = SS2.tailSet("Modi", true);
        System.out.println("Inclusive : "+tailSetInclusive);
        System.out.println(SS2);

        //subSet(E fromElement, E toElement) --> Returns elements from `[fromElement, toElement)`.
        System.out.println("\n");
        System.out.println("------------- subSet(E fromElement, E toElement) -------------");
        SortedSet<String> subSet = SS2.subSet("Chandra Babu", "Lokesh");
        System.out.println(subSet);

        //subSet(E fromElement, boolean fromInc, E toElement, boolean toInc) --> Range with inclusive/exclusive bounds.
        System.out.println("\n");
        System.out.println("------------- subSet(E fromElement, boolean fromInc, E toElement, boolean toInc) -------------");
        NavigableSet<String> subSetExclusive = SS2.subSet("Chandra Babu", false, "Lokesh", false);
        System.out.println("subset Exclusive : "+subSetExclusive);

        NavigableSet<String> subSetInclusive = SS2.subSet("Chandra Babu", true, "Lokesh", true);
        System.out.println("subset Exclusive : "+subSetInclusive);

        System.out.println("\n");
        System.out.println("-------------------------------------------------------------------------------------\r\n" + //
                        "|                              Methods from NavigableSet                            |\r\n" + //
                        "------------------------------------------------------------------------------------- \r\n" + //
                        "| Method                 | Description                                              |\r\n" + //
                        "| ---------------------- | -------------------------------------------------------- |\r\n" + //
                        "| `lower(E e)`           | Greatest element **< e**, or null if none.               |\r\n" + //
                        "| `floor(E e)`           | Greatest element **≤ e**, or null if none.               |\r\n" + //
                        "| `ceiling(E e)`         | Smallest element **≥ e**, or null if none.               |\r\n" + //
                        "| `higher(E e)`          | Smallest element **> e**, or null if none.               |\r\n" + //
                        "| `pollFirst()`          | Retrieves and removes the first element.                 |\r\n" + //
                        "| `pollLast()`           | Retrieves and removes the last element.                  |\r\n" + //
                        "| `descendingSet()`      | Returns a **reverse order** view of the set.             |\r\n" + //
                        "| `descendingIterator()` | Iterator in **reverse order**.                           |\r\n" 
                        );
        System.out.println("\n");
        System.out.println("============= NavigableSet Methods ============="); 
        //lower(E e) --> Greatest element **< e**, or null if none.
        System.out.println("---------- lower(E e) ----------");
        String g = TR.lower("Vedam");
        System.out.println("Greatest element <Vedam : "+g);
        System.out.println(TR);               
        
        System.out.println("\n");
        //floor(E e) --> Greatest element **≤ e**, or null if none.
        System.out.println("---------- floor(E e) ----------");
        String f = TR.floor("Racegurram");
        System.out.println("Greatest element <=Racegurram : "+f);
        System.out.println(TR);

        System.out.println("\n");
        //ceiling(E e) --> Smallest element **≥ e**, or null if none
        System.out.println("---------- ceiling(E e) ----------");
        String f1 = TR.ceiling("Gangotri");
        System.out.println("Smallest element >=Gangotri : "+f1);
        System.out.println(TR);

        System.out.println("\n");
        //higher(E e) --> Smallest element **≥ e**, or null if none
        System.out.println("---------- higher(E e) ----------");
        String f2 = TR.higher("Gangotri");
        System.out.println("Smallest element >Gangotri : "+f2);
        System.out.println(TR);

        System.out.println("\n");
        //pollFirst() --> Retrieves and removes the first element.
        System.out.println("---------- pollFirst() ----------");
        String f3 = TR.pollFirst();
        System.out.println("Retrieves and removes the first element : "+f3);
        System.out.println(TR);

        System.out.println("\n");
        //pollLast() --> Retrieves and removes the last element.
        System.out.println("---------- pollFirst() ----------");
        String f4 = TR.pollLast();
        System.out.println("Retrieves and removes the last element : "+f4);
        System.out.println(TR);

        System.out.println("\n");
        //descendingSet() --> Returns a **reverse order** view of the set.
        System.out.println("---------- descendingSet() ----------");
        NavigableSet<String> f5 = TR.descendingSet();
        System.out.println("Reverse order of TR Set : "+f5);
        System.out.println(TR);

        System.out.println("\n");
        //descendingIterator()
        System.out.println("---------- descendingIterator() ----------");
        Iterator<String> f6 = TR.descendingIterator();
        while(f6.hasNext()){
            System.out.println(f6.next() +", ");
        }
        System.out.println("Reverse order of TR Set : "+f6);
        System.out.println(TR);

        
    }
}