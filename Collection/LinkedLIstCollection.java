import java.util.LinkedList;

public class LinkedLIstCollection {

   public static void main(String[] args) {

      LinkedList<String> list = new LinkedList<String>();
      list.add("guluma");
      list.add("guluma");
      list.add("guluma");
      list.add("guluma");
      list.add("guluma");

      System.out.println(list);
      list.add(5, "guluma");
      System.out.println(list);

      list.addFirst("wakuma");
      System.out.println(list);
      list.addLast("olansa");
      System.out.println(list);
      System.out.println(list.get(2));

   }
}
