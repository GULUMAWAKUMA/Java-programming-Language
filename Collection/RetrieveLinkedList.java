import java.util.Iterator;
import java.util.LinkedList;

public class RetrieveLinkedList {
   public static void main(String[] args) {
      LinkedList<String> list = new LinkedList<String>();
      list.add("Wakuma");
      list.add("Olansa");
      list.add("Guluma");
      list.add("osho");

      // getting the first element in the linkedlist using getFirst()
      System.out.println(list.getFirst());

      // getting the last element in the linkedlist using getFirst()
      System.out.println(list.getLast());

      // getting the element in the given position in the linkedlist using get()
      System.out.println(list.get(1));

      for (String name : list) {
         System.out.println(name);
      }
      for (Iterator<String> iterator = list.iterator(); iterator.hasNext();) {
         String name = (String) iterator.next();
         System.out.println(name);
      }
      list.forEach((String name) -> {
         System.out.println(name);
      });

   }
}
