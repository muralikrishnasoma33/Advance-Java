package Collections.List;

import java.util.Vector;

//import javax.lang.model.element.VariableElement;

import java.util.Stack;
//import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
public class Vector1 {
    public static void main(String[] args) {
       
       //Without Generics 
       Vector v = new Vector();
       v.add(2);
       v.add("Krishna");
       v.add(90);
       v.add(10.67);
       System.out.println("Without Generics Capacity : "+v.capacity());
       System.out.println(v);

       //With Generics
       System.out.println("\n");
       Vector<String> ve = new Vector<String>();
       ve.add("100");
       ve.add("200");
       ve.add("300");
       ve.add("400");
       ve.add("500");
       System.out.println("With Generics Capacity : "+ve.capacity());
       System.out.println(ve);
       System.out.println("\n");

       //Stack --> Follows LIFO - Last In First Out
       //Stack Special methods Methods (Push, Pop, peek, empty, Search)
       System.out.println("Stack special Methods : push, pop, peek, empty, Search");
       Stack<String> st = new Stack<>();
       st.push("Ravi");
       st.push("Ramu");
       st.push("Ramu");
       st.push("Raghu");
       st.push("Raghavendra");
       System.out.println("Given Stack Elements : ");
       System.out.println(st);
       
       //pop --> Removes and returns the top element.
       String s = st.pop();
       String t = st.pop();
       System.out.println("Removing Top Element : "+s);
       System.out.println("Removing Top Second Element : "+t);
       System.out.println("After Popping the Elements from the Stack : ");
       System.out.println(st);
       
       //peek --> Returns (but does not remove) the top element. 
       String u = st.peek();
       System.out.println("Returning peek Element : "+u);
       System.out.println("After Peeking the Elements from the Stack : "); 
       System.out.println(st); 

       //empty --> Returns true if the stack is empty.
       boolean b = st.empty();
       System.out.println("Is stack Empty : "+b);
        System.out.println("Checking whether given stack is EMPTY or not : ");
       System.out.println(st);

       //Search --> Returns 1-based position of element from the top.
       int i = st.search("Ravi");
       System.out.println("Seaching : "+i);
        System.out.println("Searching the Elements from the Stack : ");
       System.out.println(st);

       System.out.println("\n");
       //Vector Methods
       Vector<String> VE = new Vector<>(20);
       VE.add("Allu Arjun");
       VE.add("Dharun");
       VE.add("Chiranjeevi");
       VE.add("Mahesh Babu");
       VE.add("Jr NTR");
       VE.add("Dharun");
       VE.add("Vijay Devarakonda");
       VE.add("Dharun");
       VE.add("Pawan Kalyan");
       
       System.out.println("TFI Heroes : ");
       System.out.println(VE);
       
       System.out.println("\n");
       System.out.println("============== Adding Elements ==============");
       //Adding Elements (add(E e), add(int index, E e), addAll(Collection<? extends E> c), addAll(int index, Collection<? extends E> c), addElement(E obj))
       //add(int integer,E e) -->  Inserts at given index.
       System.out.println("---------------- add(int integer,E e) ----------------"); 
       VE.add(0,"TFI");
       System.out.println("Adding an Element at a Specific Position : ");
       System.out.println(VE);

       System.out.println("\n");
       System.out.println("---------------- addAll(Collection<? extends E> c) ----------------"); 
       //addAll(Collection<? extends E> c) --> Adds all elements of a collection.
       List<String> list = Arrays.asList("Prabhas","Dharun Tej", "Venkatesh" );
       VE.addAll(list);
       System.out.println("Adding multiple Elements in a List : ");
       System.out.println(VE);

       System.out.println("\n");
       System.out.println("---------------- addAll(int index, Collection<? extends E> c) ----------------"); 
       //addAll(int index, Collection<? extends E> c) --> Inserts all elements at index.
       List<String> list1 = Arrays.asList("Nagarjuna",  "Naga Chaitanya", "Kiran Abbavaram");
       VE.addAll(3,list1);
       System.out.println("Adding multiple Elements at specific position (3) in a List : ");
       System.out.println(VE);

       System.out.println("\n");
       System.out.println("============= Accessing Elements =============");
       //Accessing Elements (get(int index), firstElement(), lastElement(), indexOf(Object o), indexOf(Object o, int index), lastIndexOf(Object o), lastIndexOf(Object o, int index))
       //get(int index)
       System.out.println("---------------- get(int index) ----------------");
       String str = VE.get(5);
       System.out.println("Getting an Element by index : "+str);
       System.out.println(VE);

       //firstElemnent()
       System.out.println("\n");
       System.out.println("---------------- firstElement() ----------------");
       String str1 = VE.firstElement();
       System.out.println("Getting First Element : "+str1);
       System.out.println(VE);

       //lastElement()
       System.out.println("\n");
       System.out.println("---------------- lastElement() ----------------");
       String str2 = VE.lastElement();
       System.out.println("Getting Last Element : "+str2);
       System.out.println(VE);

       //indexOf(Object o)
       System.out.println("\n");
       System.out.println("---------------- indexOf(Object o) ----------------");
       int i1 = VE.indexOf("Venkatesh");
       System.out.println("Index of Venkatesh : "+i1);
       System.out.println(VE);

       //indexOf(Object o, int index)
       System.out.println("\n");
       System.out.println("---------------- indexOf(Object o, int index) ----------------");
       System.out.println("This method is especially helpful when you want to handle repeated elements in your list or vector.");
       System.out.println("Here We just used Normal Method");
       System.out.println("\n");
       int i2 = VE.indexOf("Dharun");
       System.out.println("First Dharun found at index of : "+i2);

       int i3 = VE.indexOf("Dharun", i2 + 1);
       System.out.println("Second time Dharun found at index of : "+i3);

       int i4 = VE.indexOf("Dharun", i3+1);
       System.out.println("Third time Dharun found at index of : "+i4);
       System.out.println(VE);
       System.out.println("\n");
       //indexOf(Object o, int index)
       System.out.println("This method is especially helpful when you want to handle repeated elements in your list or vector.");
       System.out.print("Here we used WHILE loop to find how many 'Dharun' Elements are there in vector");
       System.out.println("\n");
       int count = 0;
       int j = VE.indexOf("Dharun");
       while (j != -1){
            count++;
            System.out.println("'Dharun' found at index: " + j);
            // find next after current index
            j = VE.indexOf("Dharun", j + 1);
       }
       System.out.println("'Dharun' appears " + count + " times in the vector.");

       //lastIndexOf(Object o)
       System.out.println("\n");
       System.out.println("---------------- lastIndexOf(Object o) ----------------");
       int la = VE.lastIndexOf("Venkatesh");
       System.out.println("last Index of 'Venkatesh' : "+la);
       System.out.println(VE);

       //lastIndexOf(Object o, int index)
       System.out.println("\n");
       System.out.println("---------------- lastIndexOf(Object o, int index) ----------------");
       int la1 = VE.lastIndexOf("Chiranjeevi", 4);
       System.out.println("last Index of 'Chiranjeevi' : "+la1);
       int la2 = VE.indexOf("Chiranjeevi");
       System.out.println("Index of 'Chiranjeevi' : "+la2);
       System.out.println(VE);

       //3.Updating Elements : (set(int index, E element), setElementAt(E obj, int index), setSize(int newSize))
       //set(int index, E element)
       System.out.println("\n");
       System.out.println("============= Updating Elements =============");
       System.out.println("---------------- set(int index, E element) ----------------");
       VE.set(2, "Sai Dharam Tej");
       System.out.println(VE);

       //setElementAt(E obj, int index)
       System.out.println("\n");
       System.out.println("-- > set(int index, E element) is same as setElementAt(E obj, int index) --------");

       //setSize(int newSize)
       System.out.println("\n");
       System.out.println("---------------- setSize(int newSize) ----------------");
       VE.setSize(20);
       System.out.println(VE);

       //4.Removing Elements : (remove(Object o), remove(int index), removeAll(Collection<?> c), retainAll(Collection<?> c), removeAllElements(), removeElementAt(int index), removeElement(Object obj), clear())
       //(remove(Object o) --> Removes first occurrence.
       System.out.println("\n");
       System.out.println("============ Removing Elements ============");
       System.out.println("---------------- (remove(Object o) ----------------");
       VE.remove("Pawan Kalyan");
       System.out.println(VE);

       System.out.println("\n");
       System.out.println("remove(int index), removeAll(Collection<?> c), retainAll(Collection<?> c), removeAllElements(), removeElementAt(int index), removeElement(Object obj), clear()");
       System.out.println("above all are same as arraylist and linkedlist");
       
       System.out.println("\n");
       //5.Capacity & Size : (size(), capacity(), ensureCapacity(int minCapacity), trimToSize())
       System.out.println("---------------- setSize(int newSize) ----------------");
       System.out.println("above method is same as in arraylist and linkedlist");

       System.out.println("\n");
       //capacity() --> Returns current capacity.
       System.out.println("---------------- capacity() ----------------"); 
       int c = VE.capacity();
       System.out.println("Capacity of a vector : "+c);

    //    //ensureCapacity(int minCapacity) --> Ensures capacity at least minCapacity.
    //    System.out.println("\n");
    //    System.out.println("---------------- ensureCapacity(int minCapacity) ----------------"); 
    //    VE.ensureCapacity(5);
    //    System.out.println(VE);

       //trimToSize() --> Reduces capacity to match size.
       System.out.println("\n"); 
       System.out.println("---------------- trimToSize() ----------------"); 

       System.out.println("Before trim:");
       System.out.println("Elements: " + VE);
       System.out.println("Size: " + VE.size());
       System.out.println("Capacity: " + VE.capacity());

       System.out.println("After trim:");
       VE.trimToSize();
       System.out.println("Elements: " + VE);
       System.out.println("Size: " + VE.size());
       System.out.println("Capacity: " + VE.capacity());

       //iteration --> (elements(), iterator(), listIterator(), listIterator(int index))
       //element()
       System.out.println("\n");
       System.out.println("---------------- element() ----------------"); 
       VE.elements();
       System.out.println(VE);


       //6.Checking/Searching : 
       System.out.println("\n");
       System.out.println("============ Checking/Searching ============"); 
       System.out.println("-------- contains(object o), containsAll(Collection<?> c), isEmpty()--------");
       System.out.println("Above Methods are same as arraylist and linkedlist");


       //iterator()
       System.out.println("\n");
       System.out.println("============ iterations ============"); 
       System.out.println("---------------- iterator() ----------------"); 
       VE.iterator();
       System.out.println(VE);

       //listIterator()
       System.out.println("\n");
       
       Vector<String> removeList = new Vector();
       VE.removeAll(Collections.singleton(null));

       
       System.out.println("---------------- listIterator() ----------------");
       System.out.println("----- Forward -----"); 
       ListIterator <String> li = VE.listIterator();
       while(li.hasNext()){
          System.out.println(li.next());
       }

       System.out.println("\n");
       System.out.println("----- Backward -----");
       while(li.hasPrevious()){
        System.out.println(li.previous());
       }

       //listIterator(int index) --> Returns list iterator from index.
       System.out.println("\n");
       System.out.println("---------------- listIterator(int index) ----------------");
       ListIterator<String> stq = VE.listIterator(7);
       System.out.println("------ From index 7 -------");
       while(stq.hasNext()){
        System.out.println(stq.next());
       }

       System.out.println("\n");
       //8.Conversion / Copying : (clone(), toArray(), toArray(T[] a), copyInto(Object[] anArray))
       System.out.println("---------------- clone() ----------------");
       Vector <String> VE1 = (Vector<String>)VE.clone();
       VE1.add("BalaKrishna");
       VE1.add("Akhil");
       VE1.removeElementAt(10);
       System.out.println("Original Vector");
       System.out.println(VE);
       System.out.println("Shallow Copy of original vector");
       System.out.println(VE1);

       //toArray()
       System.out.println("\n");
       System.out.println("---------------- toArray() ----------------");
       VE.toArray();
       System.out.println(VE);

       System.out.println("\n");
       System.out.println("9.Other Utility Methods :\r\n" + 
                      "-----------------------------------\r\n" + 
                      "| Method                                        | Description                                  |\r\n" + //
                      "| --------------------------------------------- | -------------------------------------------- |\r\n" + //
                      "| `String toString()`                           | Returns string form.                         |\r\n" + //
                      "| `boolean equals(Object o)`                    | Checks equality.                             |\r\n" + //
                      "| `int hashCode()`                              | Returns hash code.                           |\r\n" + //
                      "| `List<E> subList(int fromIndex, int toIndex)` | Returns portion of vector as list.           |\r\n" + //
                      "| `Spliterator<E> spliterator()`                | Returns spliterator for parallel processing. |\r\n" + //
                      "");

    }
}
