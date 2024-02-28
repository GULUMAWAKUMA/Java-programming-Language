import java.util.HashSet;
import java.util.Iterator;

public class HashsetCollection {
   public static void main(String[] args) {
      HashSet<String> cources = new HashSet<String>();
      cources.add("C");
      cources.add("C++");
      cources.add("Java");
      cources.add("Python");
      cources.add("JavaScript");
      cources.add("R");
      System.out.println(cources);

      // Enhanced for loop
      for (String cource : cources) {
         System.out.println(cource);
      }

      // Basic loop with Iterator
      //
      for (Iterator<String> iterator = cources.iterator(); iterator.hasNext();) {
         String cource = (String) iterator.next();
         System.out.println(cource);
      }

      // while loop with Iterator

      Iterator<String> iterator = cources.iterator();
      while (iterator.hasNext()) {
         String cource = (String) iterator.next();
         System.out.println(cource);

      }

      // JDK 8 forEach() method with Lambda
      cources.forEach((String cource) -> {
         System.out.println(cource);
      });
      // JDK 8 forEach() method with Lambda
      cources.forEach(cource -> {
         System.out.println(cource);
      });

      //
      // JDK 8 streaming + forEach() method with Lambda
      cources.stream().forEach((String cource) -> {
         System.out.println(cource);
      });
      // JDK 8 streaming + forEach() method with Lambda
      cources.stream().filter(cource -> !"C".equals(cource)).forEach((String cource) -> {
         System.out.println(cource);
      });

   }
}
