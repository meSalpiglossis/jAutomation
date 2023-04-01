package src.main.java.maxima.homework20221019;

import java.util.Scanner;

public class Switch {
  public static void main(String[] args){
    String name = "Aleksei";
    String surname = "Kazantsev";
    int year = 1979;
    int menuItem;
    Scanner scanner = new Scanner(System.in);
    final String menu = """
             
        _________________
             MENU
        1. Show name
        2. Show surname
        3. Year of birth
        4. Complete info
        0. Exit
        -----------------
        """;

    do {
      System.out.print(menu);
      System.out.print("Select menu item: ");
      menuItem = scanner.nextInt();

      switch (menuItem) {
        case 1 -> System.out.println(name);
        case 2 -> System.out.println(surname);
        case 3 -> System.out.println(year);
        case 4 -> System.out.printf("%s %s, %d%n", name, surname, year);
        case 0 -> {
          System.out.println("Good bye!");
          return;
        }
        default -> System.out.println("This item not presented. Try again.");
      }
    } while (true);
  }
}
