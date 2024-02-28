import java.util.HashMap;
import java.util.Map;

public class HashMapStudent {
   public static void main(String[] args) {
      Map<String, Student> students = new HashMap<>();
      students.put("first", new Student("Guluma", "Wakuma", 24));
      students.put("second", new Student("Abdi", "Wakuma", 23));
      students.put("third", new Student("Guta", "Wakuma", 22));

      System.out.println(students.values());
   }
}
