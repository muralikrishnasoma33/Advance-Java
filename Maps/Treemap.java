package Maps;
import java.util.TreeMap;
import java.util.SortedMap;
import java.util.Comparator;
import java.util.NavigableMap;
import java.util.HashMap;
public class Treemap {
    public static void main(String[] args) {
        System.out.println("| **Method**                                  | **Description**                                     | **Example Call**                                                          |\r\n" + //
                        "| ------------------------------------------- | --------------------------------------------------- | ------------------------------------------------------------------------- |\r\n" + //
                        "| `TreeMap()`                                 | Constructor → empty TreeMap with natural order      | `TreeMap<Integer,String> map = new TreeMap<>();`                          |\r\n" + //
                        "| `TreeMap(Comparator<? super K> comparator)` | Constructor → TreeMap with custom order             | `TreeMap<Integer,String> map = new TreeMap<>(Comparator.reverseOrder());` |\r\n" + //
                        "| `TreeMap(Map<? extends K,? extends V> m)`   | Constructor → TreeMap from another map              | `TreeMap<Integer,String> map2 = new TreeMap<>(map1);`                     |\r\n" + //
                        "| `TreeMap(SortedMap<K,? extends V> m)`       | Constructor → TreeMap from a SortedMap              | `TreeMap<Integer,String> map3 = new TreeMap<>(sortedMap);`                |\r\n" + //
                        "| `comparator()`                              | Returns the Comparator used (null if natural order) | `Comparator<? super Integer> comp = map.comparator();`                    |\r\n" + //
                        "| `clone()`                                   | Returns a shallow copy of the TreeMap               | `TreeMap<Integer,String> copy = (TreeMap<Integer,String>) map.clone();`   |\r\n" + //
                        "");
        System.out.println("\n");   
        
        System.out.println("| **Method**                                 | **Description (Simple)**             |\r\n" + //
                        "| ------------------------------------------ | ------------------------------------ |\r\n" + //
                        "| `clear()`                                  | Deletes all entries.                 |\r\n" + //
                        "| `containsKey(Object key)`                  | Checks if key exists.                |\r\n" + //
                        "| `containsValue(Object value)`              | Checks if a value exists.            |\r\n" + //
                        "| `equals(Object o)`                         | Compares two maps.                   |\r\n" + //
                        "| `get(Object key)`                          | Returns value for key.               |\r\n" + //
                        "| `getOrDefault(Object key, V defaultValue)` | Returns default if key not found.    |\r\n" + //
                        "| `hashCode()`                               | Returns hash of map.                 |\r\n" + //
                        "| `isEmpty()`                                | Checks if empty.                     |\r\n" + //
                        "| `put(K key, V value)`                      | Insert/update key-value.             |\r\n" + //
                        "| `putAll(Map<? extends K,? extends V> m)`   | Adds all entries from another map.   |\r\n" + //
                        "| `putIfAbsent(K key, V value)`              | Inserts only if key not present.     |\r\n" + //
                        "| `remove(Object key)`                       | Removes key.                         |\r\n" + //
                        "| `remove(Object key, Object value)`         | Removes only if key maps to value.   |\r\n" + //
                        "| `replace(K key, V value)`                  | Replace value only if key exists.    |\r\n" + //
                        "| `replace(K key, V oldValue, V newValue)`   | Replace only if oldValue matches.    |\r\n" + //
                        "| `replaceAll(BiFunction)`                   | Apply function to every entry.       |\r\n" + //
                        "| `size()`                                   | Returns number of entries.           |\r\n" + //
                        "| `values()`                                 | Collection of values.                |\r\n" + //
                        "| `entrySet()`                               | Set of key-value pairs.              |\r\n" + //
                        "| `keySet()`                                 | Set of keys.                         |\r\n" + //
                        "| `forEach(BiConsumer)`                      | Loop through all entries.            |\r\n" + //
                        "| `compute(K key, BiFunction)`               | Recalculate value.                   |\r\n" + //
                        "| `computeIfAbsent(K key, Function)`         | Compute value only when key missing. |\r\n" + //
                        "| `computeIfPresent(K key, BiFunction)`      | Compute value only when key exists.  |\r\n" + //
                        "| `merge(K key, V value, BiFunction)`        | Combines old and new value.          |\r\n" + //
                        "");
        System.out.println("\n");                
        System.out.println("========================= TreeMap Methods =========================");
        TreeMap<String, Integer> TM = new TreeMap<>();
        TM.put("Tiru", 35);
        TM.put("Nagu",32);
        TM.put("Venki",29);
        TM.put("Krish",24);
        TM.put("Mahesh",26);
        System.out.println("Original TreeMap : "+TM);
        //TreeMap(Comparator<? super K> comparator)` --> Constructor → TreeMap with custom order 
        System.out.println("-------------- TreeMap(Comparator<? super K> comparator) --------------");
        TreeMap<String, Integer> TM1 = new TreeMap<>(Comparator.reverseOrder());
        TM1.put("Hyderabad",02);
        TM1.put("Mumbai", 01);
        TM1.put("Pune", 03);
        System.out.println("Reverse Order : ");
        System.out.println(TM1);
        
        System.out.println("\n");
        //TreeMap(Map<? extends K,? extends V> m)` --> Constructor → TreeMap from another map  --> `TreeMap<Integer,String> map2 = new TreeMap<>(map1);
        System.out.println("-------------- TreeMap(Map<? extends K,? extends V> m) --------------");
        HashMap<String, Integer> TM2 = new HashMap<>();
        TM2.put("Mumbai",03);
        TM2.put("Hyderabad", 01);
        TM2.put("Pune", 02);
        TreeMap<String, Integer> newMap = new TreeMap<>(TM2);
        System.out.println("Other Map: " + TM2);
        System.out.println("TreeMap (Sorted): " + newMap);

        //TreeMap(SortedMap<K,? extends V> m) --> Constructor → TreeMap from a SortedMap --> `TreeMap<Integer,String> map3 = new TreeMap<>(sortedMap);
        System.out.println("\n");
        System.out.println("-------------- TreeMap(SortedMap<K,? extends V> m) --------------");
        SortedMap<String, Integer> sm = new TreeMap<>();
        sm.put("Cat", 3);
        sm.put("Apple", 1);
        sm.put("Ball", 2);

        // 2. Create a TreeMap using SortedMap constructor
        TreeMap<String, Integer> tm = new TreeMap<>(sm);

        System.out.println("SortedMap (sm): " + sm);
        System.out.println("TreeMap (tm): " + tm);

        //comparator()`  --> Returns the Comparator used (null if natural order) --> `Comparator<? super Integer> comp = map.comparator();`

        //Remaining all methods are same as hashmap and linkedhashmap 
        System.out.println("\n");
        System.out.println("Remaining all methods are same as hashmap and linkedhashmap");

        System.out.println("\n");
        //SortedMap Methods
        System.out.println("======================== SortedMap Methods ========================");
        System.out.println("| **Method**                   | **Description (Simple)**                                        |\r\n" + //
                        "| ---------------------------- | --------------------------------------------------------------- |\r\n" + //
                        "| `comparator()`               | Returns the comparator used for sorting (null = natural order). |\r\n" + //
                        "| `firstKey()`                 | Returns the first (smallest) key.                               |\r\n" + //
                        "| `lastKey()`                  | Returns the last (largest) key.                                 |\r\n" + //
                        "| `headMap(K toKey)`           | Returns keys `< toKey`.                                         |\r\n" + //
                        "| `tailMap(K fromKey)`         | Returns keys `>= fromKey`.                                      |\r\n" + //
                        "| `subMap(K fromKey, K toKey)` | Returns keys in range `[fromKey, toKey)`.                       |");
        System.out.println("\n");
        //comparator()` --> Returns the comparator used for sorting (null = natural order). 
        System.out.println("-------------- comparator() --------------");
        System.out.println("---- SortedMap WITHOUT custom comparator ----");
        SortedMap<String, Integer> SM = new TreeMap<>();
        SM.put("Banana", 20);
        SM.put("Apple", 10);
        System.out.println("SortedMap: " + SM);
        System.out.println("sm.comparator(): " + SM.comparator());

        System.out.println("---- SortedMap WITH custom comparator ----");
        SortedMap<String, Integer> SM1 = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);
        SM1.put("apple", 50);
        SM1.put("Banana", 20);
        SM1.put("CAT", 30);
        System.out.println("SortedMap: " + SM1);
        System.out.println("sm.comparator(): " + SM1.comparator());

        //firstKey()`--> Returns the first (smallest) key.
        System.out.println("\n");
        System.out.println("-------------- firstKey() --------------");
        SortedMap<String, Integer> SM2 = new TreeMap<>();
        SM2.put("Tiru", 35);
        SM2.put("Nagu",32);
        SM2.put("Venki",29);
        SM2.put("Krish",24);
        SM2.put("Mahesh",26);

        String s = SM2.firstKey();
        System.out.println(SM2 +":" +s);

        //lastKey()`--> Returns the last (largest) key.
        System.out.println("\n");
        System.out.println("-------------- lastKey() --------------");
        String s1 = SM2.lastKey();
        System.out.println(SM2 +":" +s1);

        //headMap(K toKey)`--> Returns keys `< toKey`
        System.out.println("\n");
        System.out.println("-------------- headMap(K toKey) --------------");
        SortedMap<String, Integer> head = SM2.headMap("Nagu");
        System.out.println("Original SortedMap: " + SM2);
        System.out.println("headMap  Nagu< : "+ head);

        //tailMap(K fromKey)` --> Returns keys `>= fromKey`
        System.out.println("\n");
        System.out.println("-------------- tailMap(K fromKey) --------------");
        SortedMap<String, Integer> tail = SM2.tailMap("Mahesh");
        System.out.println("Original SortedMap: " + SM2);
        System.out.println("tailMap  Mahesh>= : "+ tail);

        //subMap(K fromKey, K toKey) --> Returns keys in range `[fromKey, toKey)
        System.out.println("\n");
        System.out.println("-------------- subMap(K fromKey, K toKey) --------------");
        SortedMap<String, Integer> sub = SM2.subMap("Mahesh","Tiru");
        System.out.println("Original SortedMap: " + SM2);
        System.out.println("tailMap  Mahesh>= : "+ sub);

        //NavigableMap Methods
        System.out.println("\n");
        System.out.println("======================== NavigableMap Methods ========================");
        System.out.println("| **Method**                                                                 | **Description (Simple)**                                |\r\n" + //
                        "| -------------------------------------------------------------------------- | ------------------------------------------------------- |\r\n" + //
                        "| **lowerKey(K key)**                                                        | Returns greatest key **< key**                          |\r\n" + //
                        "| **floorKey(K key)**                                                        | Returns greatest key **≤ key**                          |\r\n" + //
                        "| **ceilingKey(K key)**                                                      | Returns smallest key **≥ key**                          |\r\n" + //
                        "| **higherKey(K key)**                                                       | Returns smallest key **> key**                          |\r\n" + //
                        "| **lowerEntry(K key)**                                                      | Returns entry with greatest key < key                   |\r\n" + //
                        "| **floorEntry(K key)**                                                      | Returns entry with greatest key ≤ key                   |\r\n" + //
                        "| **ceilingEntry(K key)**                                                    | Returns entry with smallest key ≥ key                   |\r\n" + //
                        "| **higherEntry(K key)**                                                     | Returns entry with smallest key > key                   |\r\n" + //
                        "| **firstEntry()**                                                           | Returns entry with smallest key                         |\r\n" + //
                        "| **lastEntry()**                                                            | Returns entry with largest key                          |\r\n" + //
                        "| **pollFirstEntry()**                                                       | Removes and returns first entry                         |\r\n" + //
                        "| **pollLastEntry()**                                                        | Removes and returns last entry                          |\r\n" + //
                        "| **descendingMap()**                                                        | Returns a reverse-sorted map view                       |\r\n" + //
                        "| **descendingKeySet()**                                                     | Returns a reverse-sorted key set                        |\r\n" + //
                        "| **subMap(K fromKey, boolean fromInclusive, K toKey, boolean toInclusive)** | Returns a range view with inclusive/exclusive endpoints |\r\n" + //
                        "| **headMap(K toKey, boolean inclusive)**                                    | Returns a view of keys < or ≤ toKey                     |\r\n" + //
                        "| **tailMap(K fromKey, boolean inclusive)**                                  | Returns a view of keys ≥ or > fromKey                   |");
        

        System.out.println("\n");
        //lowerKey(K key) --> Returns greatest key **< key
        NavigableMap<Integer, String> NM = new TreeMap<>();
        NM.put(20,"Krish");
        NM.put(30,"Yash");
        NM.put(10,"Laksh");
        NM.put(50,"Marsh");
        NM.put(40,"Karn");
        NM.put(70,"Rohith");
        NM.put(80,"Kohli");
        System.out.println(NM);
        System.out.println("-------------- lowerKey(K key) --------------");  
        //NM.lowerKey(5);
        System.out.println("Lower Key <50 : "+NM.lowerKey(50));
        
        //floorKey(K key) --> Returns greatest key **≤ key
        System.out.println("\n");
        System.out.println("-------------- floorKey(K key) --------------");
        System.out.println("Floor Key <=60 : "+NM.floorKey(60));

        //higherKey(K key) --> Returns smallest key **> key
         System.out.println("\n");
        System.out.println("-------------- higherKey(K key) --------------");
        System.out.println("higherKey >25 : "+NM.higherKey(25));

        //ceilingKey(K key) --> Returns smallest key **≥ key
        System.out.println("\n");
        System.out.println("-------------- ceilingKey(K key) --------------");
        System.out.println("Ceiling Key >=35 : "+NM.ceilingKey(35));

        //lowerEntry(K key) --> Returns entry with greatest key < key
        System.out.println("\n");
        System.out.println("-------------- lowerEntry(K key) --------------");
        System.out.println("LowerEntry < 35 : "+NM.lowerEntry(35));

        //floorEntry(K key) --> Returns entry with greatest key ≤ key
        System.out.println("\n");
        System.out.println("-------------- floorEntry(K key) --------------");
        System.out.println("floorEntry <= 40 "+NM.floorEntry(40));

        //higherEntry(k key) --> returns entry with smallest key > Key
        System.out.println("\n");
        System.out.println("-------------- higherEntry(k key) --------------");
        System.out.println("higherEntry <45 : "+NM.higherEntry(45));

        //ceilingEntry(k key) --> returns entry with smallest key >= key
        System.out.println("\n");
        System.out.println("-------------- ceilingEntry(k key) --------------");
        System.out.println("ceilingEntry <50 : "+NM.ceilingEntry(50));

        //firstEntry() --> Returns entry with smallest key
        System.out.println("\n");
        System.out.println("-------------- firstEntry() --------------");
        //NM.firstEntry();
        System.out.println("Entry with Smallest Key : "+NM.firstEntry());

        //lastEntry() --> Returns entry with largest key 
        System.out.println("\n");
        System.out.println("-------------- lastEntry() --------------");
        System.out.println("Entry with largest Key : "+NM.lastEntry());

        //pollFirstEntry() --> Removes and returns first entry
        System.out.println("\n");
        System.out.println("-------------- pollFirstEntry() --------------");
        System.out.println("Removing and retriving First Element : "+NM.pollFirstEntry());

        //pollLastEntry() --> Removes and returns last entry 
        System.out.println("\n");
        System.out.println("-------------- pollLastEntry() --------------");
        System.out.println("Removing and retriving Last Element : "+NM.pollLastEntry());

        //descendingMap() --> Returns a reverse-sorted map view 
        System.out.println("\n");
        System.out.println("-------------- descendingMap() --------------");
        System.out.println("Reverse sorted map view : "+NM.descendingMap());

        //descendingKeySet() --> Returns a reverse-sorted key set
        System.out.println("\n");
        System.out.println("-------------- descendingKeySet() --------------");
        System.out.println("Reverse sorted keyset : "+NM.descendingKeySet());

        //subMap(K fromKey, boolean fromInclusive, K toKey, boolean toInclusive) --> Returns a range view with inclusive/exclusive endpoints
        System.out.println("\n");
        System.out.println("-------------- subMap(K fromKey, boolean fromInclusive, K toKey, boolean toInclusive) --------------");
        System.out.println("From 30 to 60 : "+NM.subMap(30, true, 60, true));

        //headMap(K toKey, boolean inclusive) --> Returns a view of keys < or ≤ toKey
        System.out.println("\n");
        System.out.println("-------------- headMap(K toKey, boolean inclusive) --------------");
        System.out.println(NM.headMap(30, true));

        //tailMap(K fromKey, boolean inclusive) --> Returns a view of keys ≥ or > fromKey
        System.out.println("\n");
        System.out.println("-------------- tailMap(K fromKey, boolean inclusive) --------------");
        System.out.println(NM.tailMap(30, true));
    }



    }

