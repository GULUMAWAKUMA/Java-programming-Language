
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapCollection {

   public static void main(String[] args) {
      Map<String, Integer> map = new HashMap<>();
      map.put("one", 1);
      map.put("two", 2);
      map.put("three", 3);
      map.put("four", 4);
      map.put("five", 5);

      System.out.println(map);
      System.out.println(map.get("one"));
      System.out.println(map.size());
      Set<String> set = map.keySet();
      System.out.println(set);
      if (map.containsKey("three")) {
         System.out.println(map.get("three"));
      } else {
         System.out.println("three is not in the map");
      }

      if (map.containsValue(3)) {
         System.out.println("3 is exist");
      } else {
         System.out.println("three is not in the map");
      }

      Collection<Integer> values = map.values();
      System.out.println(values);

      map.remove("three");
      System.out.println(map);

      // different ways to iterate over hashmap

      // for each method
      for (Map.Entry<String, Integer> entry : map.entrySet()) {
         String key = entry.getKey();
         Integer value = entry.getValue();
         System.out.println(key + " : " + value);
      }

      // using iterator
      Set<Map.Entry<String, Integer>> entries = map.entrySet();
      Iterator<Map.Entry<String, Integer>> iterator = entries.iterator();
      while (iterator.hasNext()) {
         Map.Entry<String, Integer> entry = iterator.next();
         String key = entry.getKey();
         Integer value = entry.getValue();
         System.out.println(key + " : " + value);

      }

      // hashmap using java 8 forEach
      map.forEach((key, value) -> {
         System.out.println(key + " : " + value);
      });
   }
}
