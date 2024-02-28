import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilter {

   public static void main(String[] args) {
      List<Product> product = new ArrayList<Product>();
      for (Product product2 : getProduct()) {
         if (product2.getPrice() > 25000) {
            product.add(product2);
         }

      }
      for (Product product3 : product) {
         System.out.println(product3);
      }

      // getProduct().stream().filter((pr) -> pr.getPrice() >
      // 25000).forEach(System.out::println);
      List<Product> result = getProduct().stream().filter((pr) -> pr.getPrice() > 25000).collect(Collectors.toList());

      result.forEach(System.out::println);

   }

   public static List<Product> getProduct() {
      List<Product> products = new ArrayList<Product>();
      products.add(new Product(1, "HP", 25000));
      products.add(new Product(1, "Dell", 30000));
      products.add(new Product(1, "Acer", 28000));
      products.add(new Product(1, "Toshiba", 35000));
      products.add(new Product(1, "Mac", 250000));

      return products;

   }
}