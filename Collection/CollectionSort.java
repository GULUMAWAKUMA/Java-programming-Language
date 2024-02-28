import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionSort {
   public static void main(String[] args) {
      List<Integer> list = Arrays.asList(12, 44, 5, 66, 7, 8, 44, 2, 1, 12, 122);
      System.out.println(list);

      // using collections
      Collections.sort(list);
      System.out.println(list);
      Collections.reverse(list);
      System.out.println(list);

   }

}
