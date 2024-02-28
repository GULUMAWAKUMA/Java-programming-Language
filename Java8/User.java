public class User {
   private int id;
   private String name;
   private String password;
   private double salary;

   public User(int id, String name, double salary, String password) {
      this.id = id;
      this.name = name;
      this.salary = salary;
      this.password = password;
   }

   public int getId() {
      return id;
   }

   public void setId(int id) {
      this.id = id;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public double getSalary() {
      return salary;
   }

   public void setSalary(double salary) {
      this.salary = salary;
   }

   public String getPassword() {
      return password;
   }

   public void setPassword(String password) {
      this.password = password;
   }

   @Override
   public String toString() {
      return "User [id=" + id + ", name=" + name + ", salary=" + salary + ", password=" + password + "]";
   }
}
