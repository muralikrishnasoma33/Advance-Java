package Collections.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
public class Arraylist {
    public static void main(String[] args){ 
    ArrayList <String> cousins = new ArrayList<>();
    cousins.add("Murali");
    cousins.add("Mahesh");
    cousins.add("Rajesh");
    cousins.add("Venkatesh");
    cousins.add("Nagendra");
    cousins.add("Mahesh");
    cousins.add("Hari Krishna");
    cousins.add("Murali");
    System.out.println("Given List Items :");
    System.out.println(cousins);
    //Adding an element at a specific position
    cousins.add(0,"Tirumala");
    System.out.println("\n");
    System.out.println("Adding Bro At 1st Position :");
    System.out.println(cousins);
    
    //Accessing elements
    //getting an element from the arraylist
    String Index = cousins.get(4);
    System.out.println("\n");
    System.out.println("======== Accessing Elements in the Array List(get, size, isEmpty) ========");
    System.out.println("Getting an element :"+Index);
    System.out.println(cousins);
    //size of a list
    int size = cousins.size();
    System.out.println("\n");
    System.out.println("Size of a List :"+size);
    System.out.println(cousins);
    //isEmpty
    System.out.println("\n");
    System.out.println("Is Given list is empty or not :"+cousins.isEmpty());

    //Updating Elements
    //set(index element)
    cousins.set(1, "Murali Krishna");
    System.out.println("\n");
    System.out.println("========= Updating Elements in the Array List (Set, remove, clear())=========");
    System.out.println("After Updating Element :");
    System.out.println(cousins);

    //Removing Elements
    //remove(int index)
    cousins.remove(6);
    System.out.println("\n");
    System.out.println("After Removing of an Element with index :");
    System.out.println(cousins);
    //remove(object o)
    cousins.remove("Murali");
    System.out.println("\n");
    System.out.println("After Removing of an Element with Specific object name :");
    System.out.println(cousins);
    //clear() also there

    //Searching Elements
    //contains(object o)
    boolean x = cousins.contains("Hari Krishna");
    System.out.println("\n");
    System.out.println("====== Searching Elements in the array list (contains, indexOf, lastIndexOf) ======");
    System.out.println("Searching Hari Krishna is there in the List or Not? : "+x);
    System.out.println(cousins);
    //indexOf(object o)
    int y = cousins.indexOf("Nagendra");
    System.out.println("\n");
    System.out.println("Index of an Element of Nagendra : "+y);
    System.out.println(cousins);
    //lastIndexOf(object o)
    int z = cousins.lastIndexOf(cousins);
    System.out.println("\n");
    System.out.println("Last Index of a list : "+z);
    System.out.println(cousins);

    //Iteration
    //for
    System.out.println("\n");
    System.out.println("========= Iteration (for, Iterator, listIterator, forEach) =========");
    System.out.println("======Using for loop=======");
    for(int i=0; i < cousins.size(); i++){
        System.out.println(cousins.get(i));
    }
    //Iterator
    System.out.println("\n");
    System.out.println("=======Using Iterator=======");
    Iterator<String> it = cousins.iterator(); 
    while(it.hasNext()){
        System.out.println(it.next());
    }
    //listIterator
    System.out.println("\n");
    System.out.println("=======Using List Iterator=======");
    System.out.println("------Forward Order of List------");
    ListIterator<String>listit = cousins.listIterator();
    while(listit.hasNext()){
        System.out.println(listit.next());
    }
    System.out.println("\n");
    System.out.println("------BackWard Order of List------");
    while(listit.hasPrevious()){
        System.out.println(listit.previous());
    }
    //forEach
    System.out.println("\n");
    System.out.println("\n5. Using forEach() method:");
    cousins.forEach(cousin -> System.out.println(cousin));

    //Conversion
    //toArray (Converting Arraylist to array)
    System.out.println("\n");
    System.out.println("======== Conversion (toArray, Clone) ========");
    Object[] arr = cousins.toArray();
    System.out.println("Converted to Array : ");
    for(Object cousin : arr) {
        System.out.println(cousin);
    }
    // Convert ArrayList to another ArrayList (clone)
    // Clone
    System.out.println("\n");
    ArrayList<String> clonedList = (ArrayList<String>) cousins.clone();
    clonedList.add("Harshith");
    System.out.println("Original ArrayList :"+cousins);
    System.out.println("Cloned ArrayList : " +clonedList);
}
}


