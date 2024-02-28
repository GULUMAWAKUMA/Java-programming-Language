class Entity {
   int age;
   String name;

   void constructor(int age, String name) {
      this.age = age;
      this.name = name;
   }

   // public Entity(int age, String name) {
   // this.age = age;
   // this.name = name;
   // }
   public void display() {
      System.out.println(age);
      System.out.println(name);
   }

   public String getName() {
      return this.name;
   }
}
