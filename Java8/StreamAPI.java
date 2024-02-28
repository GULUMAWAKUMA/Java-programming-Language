
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

public class StreamAPI {
   public static void main(String[] args) {
      // create stream form the list
      List<String> list = Arrays.asList("C", "C++", "Java", "Python", "JavaScript");
      Stream<String> stream = list.stream();
      stream.forEach(System.out::println);
      list.stream().forEach(System.out::println);
      // list.stream().forEach((pl) -> {
      // System.out.println(pl);
      // });
      // create stream from collection
      Collection<String> collection = new ArrayList<String>(list);
      collection.stream().forEach(System.out::println);

      // create stream from set
      Set<String> set = new HashSet<String>(list);
      set.stream().forEach(System.out::println);

   }

}
