package src.main.java.maxima.homework20221106.zoo;

import java.util.Scanner;

import static src.main.java.maxima.homework20221106.zoo.Util.isPositiveDigit;

public class Zoo {

    public static void main(String[] args) {

        Animal lion1 = new Animal("African lion", "Simba", "Roar");
        Animal lion2 = new Animal("African lion", "Mufasa", "Power");
        Animal lion3 = new Animal("African lion", "Scar", "Cunning");

        Fish fish1 = new Fish("Sea fish", "Golden Fish", "3 wishes");
        Fish fish2 = new Fish("River fish", "Pike", "Magick tricks");
        Fish fish3 = new Fish("Sea fish", "Nemo", "Curiosity");

        Bird bird1 = new Bird("Woodpecker", "Woody", "Laughter");
        Bird bird2 = new Bird("Chicken", "Ryaba", "Golden Eggs");
        Bird bird3 = new Bird("Goose", "Gray", "Eat");

        Creature[] creatures = new Creature[10];

        creatures[1] = lion1;
        creatures[2] = lion2;
        creatures[3] = lion3;
        creatures[4] = fish1;
        creatures[5] = fish2;
        creatures[6] = fish3;
        creatures[7] = bird1;
        creatures[8] = bird2;
        creatures[9] = bird3;

        while (true) {
            System.out.println("Who do you want to know more about?");
            for (int i = 1; i < creatures.length; i++) {
                System.out.println(i + ". " + creatures[i].getName());
            }
            System.out.println("0. Exit");

            int menuItem = 99;
            final String errorInputMessage = "Please, use only digits from menu items";

            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine().trim();

            try {
                menuItem = Integer.parseInt(input);
            } catch (NumberFormatException e){
                System.out.println(errorInputMessage);
            }

            if (menuItem == 0) {
                return;
            } else if (!isPositiveDigit(menuItem) || menuItem >= creatures.length){
                System.out.println(errorInputMessage);
            } else {
                System.out.println("___________________________" + "\n" +
                    "Info about " +
                    creatures[menuItem].getName() + "\n" +
                    "Type: " + creatures[menuItem].getType() + "\n" +
                    "Skill: " + creatures[menuItem].getSkill() + "\n" +
                    "How it breath: " + creatures[menuItem].breath() + "\n" +
                    "How it moves: " + creatures[menuItem].move() + "\n" +
                    "---------------------------"
                );
            }
        }
    }
}
