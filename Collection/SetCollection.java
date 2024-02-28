import java.util.*;
// import java.util.LinkedHashSet;
// import java.util.Set;
// import java.util.SortedSet;
// import java.util.TreeSet;

public class SetCollection {
   public static void main(String[] args) {
      Set<String> set = new HashSet<String>();
      // Set <String> linkedset = new LinkedHashSet();
      // SortedSet <String> sorted = new TreeSet<>();

      set.add("guluma");
      set.add("guluma");
      set.add("wakuma");
      set.add("olansa");
      System.out.println(set);

      // creating hashset from another set
      Set<Integer> firstFiveNaturalNumber = new HashSet<Integer>();
      for (int i = 1; i <= 5; i++) {
         firstFiveNaturalNumber.add(Integer.valueOf(i));
         // firstFiveNaturalNumber.add(i);
      }
      System.out.println(firstFiveNaturalNumber);
      Set<Integer> firstTenNaturalNumber = new HashSet<Integer>();
      firstTenNaturalNumber.addAll(firstFiveNaturalNumber);
      Set<Integer> nextFiveNaturalNumber = new HashSet<Integer>();
      for (int i = 6; i <= 10; i++) {
         nextFiveNaturalNumber.add(i);
      }
      firstTenNaturalNumber.addAll(nextFiveNaturalNumber);
      System.out.println(firstTenNaturalNumber);

   }

}
