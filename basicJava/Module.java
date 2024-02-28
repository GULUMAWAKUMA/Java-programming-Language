public class Module {
   private String id;
   private String name;
   private String slary;

   public Module(String id, String name, String slary) {
      this.id = id;
      this.name = name;
      this.slary = slary;

   }

   public String getId() {
      return id;
   }

   public void setId(String id) {
      this.id = id;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public String getSlary() {
      return slary;
   }

   public void setSlary(String slary) {
      this.slary = slary;
   }

   public String toString() {

      return "Module{" + id + ", name=" + name + ", slary=" + slary + '}';

   }
}
