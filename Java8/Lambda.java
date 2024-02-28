
//Functional interface
interface Shape {
   void draw();
}

public class Lambda {
   public static void main(String[] args) {

      // Shape rectangle = () -> {
      // System.out.println("Rectangle");
      // };

      // Shape circle = () -> {
      // System.out.println("Circle");
      // };

      // Shape square = () -> {
      // System.out.println("Square");
      // };

      display(() -> {
         System.out.println("Square");
      });
      display(() -> {
         System.out.println("Circle");
      });
      display(() -> System.out.println("Rectangle"));
   }

   private static void display(Shape shape) {
      shape.draw();
   }
}
