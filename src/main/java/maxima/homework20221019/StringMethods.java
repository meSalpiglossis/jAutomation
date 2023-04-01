package src.main.java.maxima.homework20221019;

import java.util.Scanner;

public class StringMethods {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Input arbitrary text line: ");
    String inputString = scanner.nextLine();

    System.out.printf("Your string in uppercase will be like \"%s\"%n", inputString.toUpperCase());
    System.out.printf("Your string in lowercase will be like \"%s\"%n", inputString.toLowerCase());
    System.out.printf("First symbol in your string is '%s'%n", inputString.charAt(0));
    System.out.printf("Last symbol in your string is '%s'%n", inputString.charAt(inputString.length() -1));
    System.out.printf("Symbols amount in your string: %d%n", inputString.length());
    System.out.printf("If there were letters 'a' in your line, then they disappeared, right? %s%n", inputString.replace("a", ""));
    System.out.printf("Your string is beautiful, let's make it twice bigger! \"%s\"%n", inputString.concat(inputString));
    System.out.printf("Is your string contains \"asd\" ?... \"%s\"%n", inputString.contains("asd"));
    System.out.printf("Is your string starts with 'a' ?... \"%s\"%n", inputString.startsWith("a"));
    System.out.printf("Is your string ends with '.' ?... \"%s\"%n", inputString.endsWith("."));

    System.out.print("Input nextArbitrary text line: ");
    String inputString2 = scanner.nextLine();
    System.out.printf("Is both of your strings are same regardless off register ?... \"%s\"%n", inputString.equalsIgnoreCase(inputString2));
    System.out.printf("Is both of your strings are absolutely the same ?... \"%s\"%n", inputString.equals(inputString2));
    System.out.printf("Is your first strings empty ?... \"%s\"%n", inputString.isEmpty());
    System.out.printf("Is your second strings empty ?... \"%s\"%n", inputString2.isEmpty());
    System.out.printf("Let's concatenate your strings: \"%s\"%n", inputString + inputString2);


  }
}
