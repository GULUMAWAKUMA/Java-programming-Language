import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListArrayList {
   public static void main(String[] args) {
      List<Integer> firstFivePrimeNumber = new ArrayList<>();
      firstFivePrimeNumber.add(2);
      firstFivePrimeNumber.add(3);
      firstFivePrimeNumber.add(5);
      firstFivePrimeNumber.add(7);
      firstFivePrimeNumber.add(11);
      List<Integer> firstTenPrimeNumber = new ArrayList<>(firstFivePrimeNumber);
      List<Integer> nextFivePrimeNumber = new ArrayList<>();
      nextFivePrimeNumber.add(13);
      nextFivePrimeNumber.add(17);
      nextFivePrimeNumber.add(19);
      nextFivePrimeNumber.add(23);
      nextFivePrimeNumber.add(29);
      firstTenPrimeNumber.addAll(nextFivePrimeNumber);
      System.out.println(firstTenPrimeNumber);
      System.out.println(firstTenPrimeNumber.get(9));
      System.out.println(firstTenPrimeNumber.getClass());
      System.out.println(firstTenPrimeNumber.size());
      System.out.println(firstTenPrimeNumber.isEmpty());
      System.out.println(firstTenPrimeNumber.contains(23));
      System.out.println(firstTenPrimeNumber.indexOf(23));
      System.out.println(firstTenPrimeNumber.lastIndexOf(23));
      // System.out.println(firstTenPrimeNumber.remove(23));
      System.out.println(firstTenPrimeNumber.set(9, null));
      System.out.println(firstTenPrimeNumber.get(9));
      System.out.println(firstTenPrimeNumber.remove(9));
      System.out.println(firstTenPrimeNumber);
      System.out.println(firstTenPrimeNumber.lastIndexOf(23));
      List<Integer> removePrimeNumber = new ArrayList<>();
      removePrimeNumber.addAll(nextFivePrimeNumber);
      System.out.println(removePrimeNumber.remove(0));
      removePrimeNumber.removeAll(nextFivePrimeNumber);
      // removePrimeNumber.clear();
      System.out.println(removePrimeNumber);
      List<String> ProgrammingLanguage = Arrays.asList("Java", "C++", "Python", "JavaScript", "R");
      System.out.println(ProgrammingLanguage);
      Collections.sort(firstTenPrimeNumber);
      Collections.reverse(firstTenPrimeNumber);

   }
}
