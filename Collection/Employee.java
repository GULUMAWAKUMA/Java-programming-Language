public class Employee {
   private int id;
   private String name;
   private String age;
   private String salary;

   public Employee() {
   }

   public Employee(int id, String name, String age, String salary) {
      this.id = id;
      this.name = name;
      this.age = age;
      this.salary = salary;
   }

   public void setName(String name) {
      this.name = name;
   }

   public void setAge(String age) {
      this.age = age;
   }

   public void setId(int id) {
      this.id = id;
   }

   public void setSalary(String salary) {
      this.salary = salary;
   }

   public int getId() {
      return id;
   }

   public String getName() {
      return name;
   }

   public String getAge() {
      return age;
   }

   public String getSalary() {
      return salary;
   }

   public String toString() {
      return "Employee ==>  " + "id=" + id + "name=" + name + ", age=" + age + ", salary=" + salary;

   }
}
