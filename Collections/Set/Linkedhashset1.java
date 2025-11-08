package Collections.Set;
import java.util.LinkedHashSet;
public class Linkedhashset1 {
    public static void main(String[] args) {
        LinkedHashSet<String> LH = new LinkedHashSet<>();

        LH.add("Digital Edify");
        LH.add("Java Full Stack");
        LH.add("Hyderabad");
        LH.add("Hitec-city");
        System.out.println(LH);

        //Cloneable
        LinkedHashSet <String> LH1 =  (LinkedHashSet<String>)LH.clone();
        LH1.add("JNTU");
        LH1.add("Kukatpally");
        LH1.add("Secunderabad");
        System.out.println(LH1);

        

        System.out.println("\n");
        System.out.println("=========== LinkedHashSet has similar methods like HashSet ============");

    }
}