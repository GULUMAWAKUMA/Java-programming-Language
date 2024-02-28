public class HelloWorld {
   public static void main(String[] args) {
      System.out.println("Hello World this is the complete java tutorial");
      Test test = new Test();
      String ReturnValue = test.Display();
      System.out.println(ReturnValue);
   }

}

class Test {
   String Display() {
      return "This is the test class";
   }
}