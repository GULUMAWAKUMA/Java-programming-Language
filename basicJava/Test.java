import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Test {
   public static void main(String[] args) {
      // collection frame work

      List<Module> modules = new ArrayList<Module>();

      // Set<Integer> xy = new HashSet<>();
      List<Integer> xy = new ArrayList<>();
      xy.add(1);
      xy.add(2);
      xy.add(3);
      xy.add(4);
      xy.add(3);
      // System.out.println(xy);

      // xy.forEach(p -> {
      // System.out.println(p);
      // });

      xy.forEach(System.out::println);

      // source stream filter collecttoList());toList());st());
      List<Integer> result = xy.stream().filter(null).collect(Collectors.toList());
      System.out.println(result);

      xy.stream().forEach(p -> {
         System.out.println(p);
      });

      modules.add(new Module("123", "gule", "$4646"));

   }
}