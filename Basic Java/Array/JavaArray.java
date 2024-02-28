public class JavaArray {
   public static void main(String[] args) {
      int[] arr = new int[10];
      String[] names = new String[5];
      for (int i = 0; i < 10; i++) {
         arr[i] = i;
         if (i < 5) {
            if (i == 0)
               names[i] = "Guluma";
            else if (i == 1)
               names[i] = "Wakuma";
            else if (i == 2)
               names[i] = "Abdi";
            else if (i == 3)
               names[i] = "Nabila";
            else if (i == 4)
               names[i] = "guta";
            else
               continue;

         } else
            continue;
      }
      for (int i = 0; i < 10; i++) {
         System.out.println(arr[i]);
         if (i < 5)
            System.out.println(names[i]);
         else
            continue;
      }

   }
}
