import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class UserCollection {
   public static void main(String[] args) {
      // Employee employee = new Employee();
      List<Employee> employees = new ArrayList<Employee>();
      employees.add(new Employee(11, "Guluma", "24", "20000"));
      employees.add(new Employee(211, "Guluma", "24", "20000"));
      employees.add(new Employee(121, "Guluma", "24", "20000"));
      employees.add(new Employee(112, "Guluma", "24", "20000"));
      employees.add(new Employee(113, "Guluma", "24", "20000"));

      System.out.println(employees);
      // Collections.sort(employees, new Comparator<Employee>() {

      // @Override
      // public int compare(Employee o1, Employee o2) {
      // return o1.getId() - o2.getId();
      // }

      // });
      // System.out.println(employee.toString());
      // Collections.sort(employees, new MySort());
      // System.out.println(employees);

      Collections.sort(employees, (o1, o2) -> (o1.getId() - o2.getId()));
      System.out.println(employees);
   }
}

class MySort implements Comparator<Employee> {
   @Override
   public int compare(Employee o1, Employee o2) {
      return o1.getId() - o2.getId();

   }
}
