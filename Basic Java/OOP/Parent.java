// inheritance

import java.io.InputStream;
import java.util.Scanner;

public class Parent extends Entity {
   public static void main(String[] args) {
      // int [] ar = new int[3];
      int[] arr = { 1, 2, 3, 4, 5 };
      for (int ar : arr) {
         System.out.println(ar);

      }
      for (int i = 0; i < arr.length; i++) {

         switch (arr[i]) {
            case 1:
               System.out.println(1);
               break;
            case 2:
               System.out.println(2);
               break;
            case 3:
               System.out.println(3);
               break;
            case 4:
               System.out.println(4);
               break;
            case 5:
               System.out.println(5);
               break;
            default:
               break;
         }
      }
      int x = 2;
      int y = 3;
      System.out.println(y > x ? "True" : "False");

      String str = "Guluma Wakuma Olansa";
      System.out.println(str.toUpperCase());
      System.out.println(str.toLowerCase());
      System.out.println(str.length());
      System.out.println(str.substring(7, str.length()));
      System.out.println(str.trim());
      System.out.println(str.hashCode());
      System.out.println(str.endsWith("Olansa"));
   }

}
