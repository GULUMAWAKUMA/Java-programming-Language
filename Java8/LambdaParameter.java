interface Addition {
   int add(int a, int b);
}

// class additionimpl implements Addition {

// @Override
// public int add(int a, int b) {
// return a + b;

// }

// }

public class LambdaParameter {
   public static void main(String[] args) {
      Addition add = (a, b) -> {
         return a + b;
      };
      int result = add.add(12, 20);
      System.out.println(result);
   }

}
