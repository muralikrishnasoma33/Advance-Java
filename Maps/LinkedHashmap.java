package Maps;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
public class LinkedHashmap {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> LHM = new LinkedHashMap<>();
        LHM.put("Mahesh", 20);
        LHM.put("Venki", 27);
        LHM.put("Ravi", 18);
        LHM.put("Mahidhar", 29);
        LHM.put("Hari", 30);
        LHM.put("Rudra", 26);

        //get(Object Key), 
        //remove(Object Key), 
        //remove(Object Key, Object Value)
        System.out.println("\n");
        System.out.println("---get(Object Key)---, ---remove(Object Key)---, ---remove(Object Key, Object Value)---");
        System.out.println("Above Methods are same as HashMap");

        //putIfAbsent(K key, V value)` --> Add only if key not present.
        System.out.println("\n");
        System.out.println("------------ putIfAbsent(K key, V value) ------------");
        LHM.putIfAbsent("Akhil", 29);
        System.out.println(LHM);

        //getOrDefault(Object key, V defaultValue)`  --> Get value or default
        System.out.println("\n");
        System.out.println("------------ getOrDefault(Object key, V defaultValue) ------------");
        System.out.println("If Arjun is there then it's value will be printed otherwise default value : "+LHM.getOrDefault("Arjun", 10));

        //replace(K key, V value)`               --> Replace value for key       
        //replace(K key, V oldValue, V newValue) --> Replace only if old value matches
        //containsKey(Object key)`               --> Check if key exists                        
        //size()`   --> Number of entries
        //isEmpty()`--> Check if empty
        //clear()`  --> Remove all entries                                                                   
        System.out.println("\n");
        System.out.println("--- replace(K key, V value) ---");
        System.out.println("--- replace(K key, V oldValue, V newValue) ---");
        System.out.println("--- containsKey(Object key) ---");
        System.out.println("--- size() ---");
        System.out.println("--- isEmpty() ---");
        System.out.println("--- clear() ---");
        System.out.println("Above five Methods are same as Hashmap");

        //compute(K key, BiFunction<? super K,? super V,? extends V> remappingFunction)` --> Compute new value 
        System.out.println("\n");
        System.out.println("------------ compute(K key, BiFunction<? super K,? super V,? extends V> remappingFunction) ------------");
        // If key present then it updates value
        LHM.compute("Mahidhar", (key, value) -> value +10);
        System.out.println(LHM);
        //If key not present it adds to map
        LHM.compute("Mahindra", (key, value) -> (value == null) ? 19 : value);
        System.out.println(LHM);
        //If we will put null then that key will be removed
        LHM.compute("Mahesh",(key, value) -> null);
        System.out.println(LHM);

        //computeIfAbsent(K key, Function<? super K,? extends V> mappingFunction)`                -->   Compute if absent                                                                       |
        //computeIfPresent(K key, BiFunction<? super K,? super V,? extends V> remappingFunction)` -->   Compute if present 
        System.out.println("\n");
        System.out.println("--- computeIfAbsent() ---");
        System.out.println("--- computeIfPresent() ---");
        System.out.println("Above two methods are same as Hashmap");

        //merge(K key, V value, BiFunction<? super V,? super V,? extends V> remappingFunction)` -->  Merge value  -->  `map.merge(1,"++",(oldVal,newVal)->oldVal+newVal);
        System.out.println("\n");
        System.out.println("------------ merge(K key, V value, BiFunction<? super V,? super V,? extends V> remappingFunction) ------------");
        LHM.merge("Venki", 3, (oldVal, newVal) -> (oldVal+newVal));
        System.out.println(LHM);

        //keySet()` --> Return keys in order
        System.out.println("\n");
        System.out.println("------------ keySet() ------------");
        Set<String> keys = LHM.keySet();
        System.out.println(keys);
        //Iterating Key Set
        for(String k : keys){
            System.out.println(k);
        }

        //values() --> Return values in order
        System.out.println("\n");
        System.out.println("------------ values() ------------");
        Collection<Integer> values = LHM.values();
        System.out.println(values);
        //Iterating Values
        for(Integer i : values){
            System.out.println(i);
        }

        //entrySet() --> Return entries in order
        System.out.println("\n");
        System.out.println("------------ entrySet() ------------");
        //Getting All Entries
        Set<Map.Entry<String, Integer>> entrySet = LHM.entrySet();
        System.out.println(LHM);
        //Iterating All entries
        for(Map.Entry<String, Integer> r : entrySet){
            System.out.println(r);
        }

        //forEach(BiConsumer<? super K,? super V> action) --> Iterate in order 
        System.out.println("\n");
        System.out.println("------------ forEach(BiConsumer<? super K,? super V> action) ------------");
        LHM.forEach((key,value) -> {
              System.out.println(key +"=" +value);
        });

        //clone()  --> Shallow copy
        System.out.println("\n");
        System.out.println("------------ clone() ------------");
        LinkedHashMap<String, Integer> LHM1 = (LinkedHashMap<String, Integer>)LHM.clone();
        LHM1.put("Krishna", 29);
        System.out.println("Original Map : "+LHM);
        System.out.println("Shallow Copy : "+LHM1);

        //equals(), hashCode(), toString()
        System.out.println("\n");
        System.out.println("--- equals() ---");
        System.out.println("--- hashCode() ---");
        System.out.println("--- toString() ---");
        System.out.println("Above three methods are same as hashmap");

        //LinkedHashMap-Specific Method :
        //protected boolean removeEldestEntry(Map.Entry<K,V> eldest)
        System.out.println("\n");
        System.out.println("------------ protected boolean removeEldestEntry(Map.Entry<K,V> eldest) ------------");
        LinkedHashMap<Integer, String> lhm = new LinkedHashMap<Integer, String>(3, 0.75f,true){
            protected boolean removeEldestEntry(Map.Entry<Integer, String> eldest) {
                 return size() > 3;
            }
        };

        lhm.put(1, "Kamal");
        lhm.put(2, "Ayaan");
        lhm.put(3,"Akira");
        System.out.println(lhm);
        // Adding 4 → eldest (key=1) will be removed
        lhm.put(4, "Badshah");
        System.out.println("After adding 4: " + lhm);

        // Accessing key 2 moves it to the end (because accessOrder=true)
        lhm.get(1);
        //lhm.get(2);

        // Adding 5 → eldest (key=1) will be removed
        lhm.put(5, "Basha");
        System.out.println("After adding 5: " + lhm);
        //lhm.get(2);
    }    
}
