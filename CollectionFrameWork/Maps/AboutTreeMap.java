package Maps;

import java.util.Map;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;

public class AboutTreeMap {
    public static void main(String args[]) {

        NavigableMap<Integer, String> tmap = new TreeMap<>();
        tmap.put(3, "Soumyajit");
        tmap.put(1, "raj");
        tmap.put(2, "riddhi");

        System.out.println(tmap);

        /* Travserse through TreeMap - same as that of simple Maps */
        Set<Map.Entry<Integer, String>> entrySet = tmap.entrySet();
        for(Map.Entry<Integer, String> entry : entrySet) {
            System.out.println(entry.getKey() + "," + entry.getValue());
        }

        Set<Integer> keySet = tmap.keySet();
        for(int key : keySet) {
            System.out.println(key + "," + tmap.get(key));
        }

        /* First entry in TreeMap */
        System.out.println(tmap.pollFirstEntry());

        /* Ceiling Kay in TreeMap */
        System.out.println(tmap.ceilingKey(0));


        /* Sorting the keys in reverse order using Comparator */
        NavigableMap<Integer, String> tmap2 = new TreeMap<>((a, b) -> b - a);
        tmap2.put(3, "Soumyajit");
        tmap2.put(1, "raj");
        tmap2.put(2, "riddhi");

        System.out.println(tmap2);
    }
}
