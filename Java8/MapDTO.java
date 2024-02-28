import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MapDTO {

   public static void main(String[] args) {
      List<User> users = new ArrayList<User>();
      users.add(new User(11, "Guluma Wakuma", 70000, "11132455"));
      users.add(new User(11, "Abdi Wakuma", 600, "11132455"));
      users.add(new User(11, "Guta Wakuma", 500, "11132455"));
      users.add(new User(11, "Kuma Wakuma", 8000, "11132455"));
      users.add(new User(11, "Roba Wakuma", 8000, "11132455"));
      users.add(new User(11, "Injo Wakuma", 7000, "11132455"));

      // this is the traditional way of map users to userDTO
      List<UserDto> usersDto = new ArrayList<UserDto>();
      // users.forEach((u)->{
      // usersDto.add(new UserDto(u.getId(), u.getName(), u.getSalary()));
      // });
      for (User user : users) {
         usersDto.add(new UserDto(user.getId(), user.getName(), user.getSalary()));
      }

      // mapping using stream map methods
      users.stream().map(new Function<User, UserDto>() {
         @Override
         public UserDto apply(User user) {
            return new UserDto(user.getId(), user.getName(), user.getSalary());
         }

      });

      // using lambda exepretion
      // users.stream().map((User user) -> new UserDto(user.getId(), user.getName(),
      // user.getSalary()))
      // .forEach((userdto) -> {
      // System.out.println(userdto);
      // });
      List<UserDto> usersdto = users.stream()
            .map((User user) -> new UserDto(user.getId(), user.getName(), user.getSalary()))
            .collect(Collectors.toList());
      // System.out.println(usersdto);
      usersdto.forEach((u) -> {
         System.out.println(u);
      });

   }
}
