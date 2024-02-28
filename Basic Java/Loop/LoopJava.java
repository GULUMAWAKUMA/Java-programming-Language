public class LoopJava {
   static private int count = 10;

   static private String DisplayName() {
      return "Guluma Wakuma";
   }

   public static void main(String[] args) {

      for (int i = 0; i < 10; i++) {
         System.out.println(i);
      }

      while (count > 0) {
         System.out.println(count);
         count--;
      }
      do {
         System.out.println(count);
         count++;
      } while (count < 10);
      System.out.println(count);
      System.out.println(DisplayName());
   }
}
