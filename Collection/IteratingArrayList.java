import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IteratingArrayList {
   public static void main(String[] args) {
      List<String> ProgrammingLanguage = Arrays.asList("Java", "C++", "Python", "JavaScript", "R");

      // for loop
      for (int i = 0; i < ProgrammingLanguage.size(); i++) {
         System.out.println(ProgrammingLanguage.get(i));
      }

      // enhance for each loop
      for (String pl : ProgrammingLanguage) {
         System.out.println(pl);
      }

      // using iterative -> for loop
      for (Iterator<String> iterator = ProgrammingLanguage.iterator(); iterator.hasNext();) {
         String pl = (String) iterator.next();
         System.out.println(pl);
         // System.out.println(iterator.next());
      }
      // iterative -> while loop
      Iterator<String> iterator = ProgrammingLanguage.iterator();
      while (iterator.hasNext()) {
         String pl = (String) iterator.next();
         System.out.println(pl);
         // System.out.println(iterator.next());
      }

      // java 8 stream and Lambda example
      ProgrammingLanguage.stream()
            .forEach(
                  System.out::println);
      // java 8 stream and Lambda example
      ProgrammingLanguage.stream()
            .forEach(pl -> System.out.println(pl));
      // java 8 stream and Lambda example
      ProgrammingLanguage.forEach(pl -> System.out.println(pl));

   }
}
