package hiber;

import hiber.config.AppConfig;
import hiber.model.Car;
import hiber.model.User;
import hiber.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.sql.SQLException;
import java.util.List;

public class MainApp {
   public static void main(String[] args) throws SQLException {
      AnnotationConfigApplicationContext context = 
            new AnnotationConfigApplicationContext(AppConfig.class);

      UserService userService = context.getBean(UserService.class);

      userService.add(new User("User1", "Lastname1", "user1@mail.ru",new Car("Тойота.set(СУЕТА)", 1234)));
      userService.add(new User("User2", "Lastname2", "user2@mail.ru",new Car("Хонда,братик", 5678)));
      userService.add(new User("User3", "Lastname3", "user3@mail.ru",new Car("Форд", 9012)));
      userService.add(new User("User4", "Lastname4", "user4@mail.ru",new Car("БиЭмВи", 3456)));

      List<User> users = userService.listUsers();
      for (User user : users) {
         System.out.println("Id = "+user.getId());
         System.out.println("Имя = "+user.getFirstName());
         System.out.println("Фамилия = "+user.getLastName());
         System.out.println("Почта = "+user.getEmail());
         System.out.println(""+user.getCar());
         System.out.println();
      }
      User userPoiskCar = userService.fUser("Форд",9012);
      if (userPoiskCar!=null) {
         System.out.println("Найден пользователь Форда с серийным номером 9012: " + userPoiskCar);
      }else {
         System.out.println("Пользователь с номером 9012 на Форде не обнаружен");
      }

      context.close();
   }
}
