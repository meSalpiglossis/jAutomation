package maxima.homework20221019;

import java.util.Scanner;

public class WhileForIf {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    String str = new String();
    while (!str.equalsIgnoreCase("Exit")) {
      System.out.print("Please enter something: ");
      str = scanner.nextLine();
    }

    int x;
    int sum = 0;
    do {
      System.out.print("Please enter a positive number: ");
      x = scanner.nextInt();
    } while (x < 0);

    for (int i = 0; i <= x; i++) {
      sum += i;
    }
    System.out.printf("The sum of all numbers from 0 to %d is %d%n", x, sum);


    System.out.print("Please enter your score: ");
    int score = scanner.nextInt();
    while (score < 0 || score > 100){
      System.out.print("\r");
      System.out.print("Incorrect value. Please enter score from 0 to 100: ");
      score = scanner.nextInt();
    }
    if (score >= 70) {
      System.out.println("Congrats! You’ve passed the test!");
    } else {
      System.out.println("Sorry, you’ve failed the test.");
    }

    String[] channels = new String[]{
        "Exit",
        "First channel",
        "Second channel",
        "Third channel",
        "Fourth channel"};
    int knob;
    while (true){
      System.out.print("Select TV channel: ");
      knob = scanner.nextInt();
      switch (knob) {
        case 1 -> System.out.println(channels[1]);
        case 2 -> System.out.println(channels[2]);
        case 3 -> System.out.println(channels[3]);
        case 4 -> System.out.println(channels[4]);
        case 0 -> {
          System.out.println(channels[0]);
          return;
        }
        default -> System.out.println("This channel on maintenance. Try another.");
      }
    }
  }
}
