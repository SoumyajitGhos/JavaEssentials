package Maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class AboutMaps {
    public static void main(String args[]) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Soumyajit", 1);
        map.put("raj", 2);
        map.put("riddhi", 3);

        /* getOrDefault method returns declared value when corresponding key is absent */
        System.out.println(map.getOrDefault("aryan", 0));

        /* containsKey method tells if the following key is present or not */
        System.out.println(map.containsKey("aryan"));

        /* Remove method to delete an element from the map */
        map.remove("riddhi");

        /* Creating adjacency List in Graph 
         * 1 - 2
         * 3 - 5
         * 1 - 3
        */
        Map<Integer, List<Integer>> adj = new HashMap<>();

        if(adj.get(1) == null) 
            adj.put(1, new ArrayList<>());
        adj.get(1).add(2);

        // The above three lines of code could be written as
        adj.computeIfAbsent(1, f -> new ArrayList<>()).add(2);

        /* Travserse Maps 
         * Since Map is not a part of collection Framework so it is not Iterable
         * but we need to travserse therefore we need to convert this Map into collection.
         * For this few methods are there
         * 1) entrySet
         * 2) keySet
         * 
        */
        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
        for(Map.Entry<String, Integer> entry : entrySet) {
            System.out.println(entry.getKey() + "," + entry.getValue());
        }

        Set<String> keySet = map.keySet();
        for(String key : keySet) {
            System.out.println(key + "," + map.get(key));
        }
    }
}
