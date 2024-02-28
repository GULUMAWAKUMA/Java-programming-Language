
public class LambdaRunable {
   public static void main(String[] args) {

      Thread runnableUlamda = new Thread(() -> System.out.println("run  using lambda "));
      runnableUlamda.start();
   }
}
