import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SreamMap {
   public static void main(String[] args) {
      List<Character> alphabets = Arrays.asList('a', 'b', 'c', 'd', 'e', 'f');
      List<Character> upCharacters = new ArrayList<Character>();
      alphabets.forEach(alp -> {
         upCharacters.add(Character.toUpperCase(alp));
      });
      System.out.println(upCharacters);
      // for (Character alph : upCharacters) {
      // System.out.println(alph);
      // }

      List<Character> collect = alphabets.stream().map(Character::toUpperCase).collect(Collectors.toList());
      System.out.println(collect);
   }

}
