package Maps;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
public class Hashmap {
    public static void main(String[] args) {
        HashMap<String, Integer> HM = new HashMap<>();
        HM.put("Ravi", 28);
        HM.put("Ram", 24);
        HM.put("Raghu", 27);
        HM.put("Raghavendra", 34);
        HM.put("Rajesh", 22);
        System.out.println(HM);

        //ALL Hashmap Methods
        System.out.println("METHOD                           DESCRIPTION\r\n" + //
                        "-----------------------------------------------------------------------------------------\r\n" + //
                        "put(K key, V value)              Inserts key-value pair. Replaces value if key exists.\r\n" + //
                        "\r\n" + //
                        "putIfAbsent(K key, V value)      Inserts only if key is NOT already present.\r\n" + //
                        "\r\n" + //
                        "get(Object key)                  Returns value mapped to key, or null if not found.\r\n" + //
                        "\r\n" + //
                        "getOrDefault(Object key, V def)  Returns value if key exists, else returns default value.\r\n" + //
                        "\r\n" + //
                        "remove(Object key)               Removes mapping for the key.\r\n" + //
                        "\r\n" + //
                        "remove(Object key, Object val)   Removes key only if mapped to specified value.\r\n" + //
                        "\r\n" + //
                        "replace(K key, V value)          Replaces value for existing key.\r\n" + //
                        "\r\n" + //
                        "replace(K key, V old, V new)     Replaces value only if old value matches.\r\n" + //
                        "\r\n" + //
                        "containsKey(Object key)          Checks if key exists.\r\n" + //
                        "\r\n" + //
                        "containsValue(Object value)      Checks if value exists.\r\n" + //
                        "\r\n" + //
                        "size()                           Returns number of key-value pairs.\r\n" + //
                        "\r\n" + //
                        "isEmpty()                        Checks if map is empty.\r\n" + //
                        "\r\n" + //
                        "clear()                          Removes all entries.\r\n" + //
                        "\r\n" + //
                        "keySet()                         Returns a Set of all keys.\r\n" + //
                        "\r\n" + //
                        "values()                         Returns a Collection of all values.\r\n" + //
                        "\r\n" + //
                        "entrySet()                       Returns a Set of key-value pairs (Entry objects).\r\n" + //
                        "\r\n" + //
                        "forEach(BiConsumer)              Performs action for each entry.\r\n" + //
                        "\r\n" + //
                        "merge(K key, V value, remapping) Merges value with existing value using function.\r\n" + //
                        "\r\n" + //
                        "compute(K key, remapping)        Computes a new value for key using function.\r\n" + //
                        "\r\n" + //
                        "computeIfAbsent(K key, func)     Computes and inserts value only if key not present.\r\n" + //
                        "\r\n" + //
                        "computeIfPresent(K key, func)    Computes new value only if key already present.\r\n" + //
                        "\r\n" + //
                        "clone()                          Returns a shallow copy of the HashMap.\r\n" + //
                        "\r\n" + //
                        "equals(Object o)                 Compares with another map.\r\n" + //
                        "\r\n" + //
                        "hashCode()                       Returns hash code for the map.\r\n" + //
                        "\r\n" + //
                        "toString()                       Returns string representation of map.\r\n" + //
                        "-----------------------------------------------------------------------------------------\r\n" + //
                        "");
        
        //putIfAbsent(K key, V value) --> Inserts only if key is NOT already present.
        System.out.println("\n");
        System.out.println("------------ putIfAbsent(K key, V value) ------------");
        HM.putIfAbsent("Raghuram", 37);
        System.out.println(HM);
  
        //get(Object key) --> Returns value mapped to key, or null if not found.
        System.out.println("\n");
        System.out.println("------------ get(Object key) ------------");
        int i = HM.get("Rajesh");
        System.out.println("Rajesh Value : "+i);
        //System.out.println(HM);
  
        //getOrDefault(Object key, V def) --> Returns value if key exists, else returns default value.
        System.out.println("\n");
        System.out.println("------------ getOrDefault(Object key, V def) ------------");
        System.out.println("Rajesh Value is there or default : "+HM.getOrDefault("Rajesh", 0));
        System.out.println("Ramesh value in the map          : "+HM.getOrDefault("Ramesh", 0));
        
        //remove(Object key) --> Removes mapping for the key.
        System.out.println("\n");
        System.out.println("------------ remove(Object key) ------------");
        HM.remove("Raghuram");
        System.out.println(HM);

        //remove(Object key, Object val) --> Removes key only if mapped to specified value.
        System.out.println("\n");
        System.out.println("------------ remove(Object key, Object val) ------------");
        boolean b = HM.remove("Ram",24);
        System.out.println(HM +":" +b);

        //replace(K key, V value) --> Replaces value for existing key.
        System.out.println("\n");
        System.out.println("------------ replace(K key, V value) ------------");
        HM.replace("Rajesh", 25);
        System.out.println(HM);
        //Or we can write below code
        System.out.println("\n");
        HM.put("Raghavendra", 29);
        System.out.println(HM);

        //replace(K key, V old, V new) --> Replaces only old value matches
        System.out.println("\n");
        System.out.println("------------ replace(K key, V old, V new) ------------");
        boolean c = HM.replace("Ravi", 28, 33);
        System.out.println(HM +":" +c);

        //containsKey(Object key) --> Checks if key exists
        System.out.println("\n");
        System.out.println("------------ containsKey(Object key) ------------");
        boolean b1 = HM.containsKey("Ravi");
        System.out.println(HM +" : " +b1);

        //containsValue(Object value) --> Checks if value Exists
        System.out.println("\n");
        System.out.println("------------ containsValue(Object Value) ------------");
        boolean b2 = HM.containsValue(33);
        System.out.println(HM +" : " +b2);

        //size() --> Returns number of key-value pairs.
        System.out.println("\n");
        System.out.println("------------ size() ------------");
        int i1 = HM.size();
        System.out.println(HM +" : " +i1);

        //isEmpty() --> checks if map is empty
        System.out.println("\n");
        System.out.println("------------ isEmpty() ------------");
        boolean b3 = HM.isEmpty();
        System.out.println(HM +" : " +b3);

        //clear()  -->  Removes all entries.
        System.out.println("\n");
        System.out.println("------------ clear() ------------");
        System.out.println("Removes all entries.");
        
        //keySet() --> Returns a Set of all keys.
        System.out.println("\n");
        System.out.println("------------ keySet() ------------");
         // Getting all keys
        Set<String> keys = HM.keySet();
        System.out.println("Keys: " + keys);
        
        //Iterating Keys
        System.out.println("------ Iterating Keys ------");
        for(String k : keys){
            System.out.println(k);
        }

        //values() --> Returns a Collection of all values.
        System.out.println("\n");
        System.out.println("------------ values() ------------");
        //Getting all Values
        Collection<Integer> values = HM.values();
        System.out.println("Values : "+values );
        //Iterating Values 
        System.out.println("------ Iterating Values ------");
        for(Integer v : values){
            System.out.println(v);
        }

        //entrySet() --> Returns a Set of key-value pairs (Entry objects).
        System.out.println("\n");
        System.out.println("------------ entrySet() ------------");
        //Getting All entries
        Set<Map.Entry<String, Integer>> entrySet = HM.entrySet();
        System.out.println(entrySet);
        //Iterating entries
        System.out.println("------ Iterating entries ------");
        for(Map.Entry<String, Integer> e : entrySet){
             System.out.println(e);
        }

        //forEach(BiConsumer) --> Performs action for each entry.
        System.out.println("\n");
        System.out.println("------------ forEach(BiConsumer) ------------");
        HM.forEach((key , value) -> {
            System.out.println(key +":" +value);
        });

        //merge(K key, V value, remapping) --> Merges value with existing value using function.
        System.out.println("\n");
        System.out.println("------------ merge(K key, V value, remapping) ------------");
        //If already key value present then it merge
        HM.merge("Rajesh", 25,(oldVal ,newVal ) -> oldVal+newVal);
        System.out.println(HM);
        //If key not present it adds
        HM.merge("Rakesh", 25,(oldVal ,newVal ) -> oldVal+newVal);
        System.out.println(HM);
        //Key removed when function returns null
        HM.merge("Rakesh", 25,(oldVal ,newVal ) -> null);
        System.out.println(HM);

        //compute(K key, remapping) --> Computes a new value for key using function.
        System.out.println("\n");
        System.out.println("------------ compute(K key, remapping) ------------");
        // 1) Key not present
        HM.compute("Rajesh", (key, value) -> 10);
        System.out.println(HM);   // {A=10}
        // 2) Key present → change value
        HM.compute("Rajesh", (key, value) -> value + 5);
        System.out.println(HM);   // {A=15}
        // 3) Return null → removes key
        HM.compute("Rajesh", (key, value) -> null);
        System.out.println(HM);   // {}

        //computeIfAbsent(K key, func) --> Computes and inserts value only if key not present.
        System.out.println("\n");
        System.out.println("------------ computeIfAbsent(K key, func) ------------");
        // 2️⃣ Key present → function does NOT run → value unchanged
        HM.computeIfAbsent("Rajesh", key -> 26);
        System.out.println(HM);
        //1️⃣ Key not present → function runs → adds key
        HM.computeIfAbsent("Raju", key -> 28 );
        System.out.println(HM);
        // 3️⃣ New key → function runs again
        HM.computeIfAbsent("Raghu", key -> 30);
        System.out.println(HM);

        //computeIfPresent(K key, func)  -->  Computes new value only if key already present.
        System.out.println("\n");
        System.out.println("------------ computeIfPresent(K key, func) ------------");
        // Key present -> function runs -> updates value
        HM.computeIfPresent("Rajesh", (key, value) -> 28);
        System.out.println(HM);
        // Key not present → function runs → adds key
        HM.computeIfPresent("Rakesh", (key, value) -> 28);
        System.out.println(HM);

        //clone() -->  Returns a shallow copy of the HashMap.
        System.out.println("\n");
        System.out.println("------------ clone() ------------");
        HashMap<String, Integer> HM1 = (HashMap<String, Integer>)HM.clone();
        HM1.put("Murali",20);
        System.out.println("Original Map : "+HM);
        System.out.println("Clone map : "+HM1);

        //equals(Object o) --> Compares with another map.
        System.out.println("\n");
        System.out.println("------------ equals(Object o) ------------");
        HashMap<Integer, String> map1 = new HashMap<>();
        map1.put(1, "A");
        map1.put(2, "B");
        map1.put(3, "C");

        HashMap<Integer, String> map2 = new HashMap<>();
        map2.put(3, "C");
        map2.put(1, "A");
        map2.put(2, "B");

        System.out.println("Map1: " + map1);
        System.out.println("Map2: " + map2);

        if (map1.equals(map2)) {
            System.out.println("Both maps are EQUAL");
        } else {
            System.out.println("Maps are NOT equal");
        }

        //hashCode() --> Returns hash code for the map.
        System.out.println("\n");
        System.out.println("------------ hashCode() ------------");
        long l = HM.hashCode();
        System.out.println("HashCode of HM Map : "+l);
        System.out.println(HM);

        //toString() --> Returns string representation of map
        System.out.println("\n");
        System.out.println("------------ toString() ------------");
        HM.toString();
        System.out.println();
    }
}

