package maxima.homework20221013;

public class Main {
  public static void main(String[] args) {
    String firstName = "Aleksei";
    String middleName = "V";
    String lastName = "Kazantsev";
    int age = 43;
    String education = "Self educated";
    String hobby = "Programming";

    byte byteVar = 127;
    short shortVar = 32767;
    int intVar = 2147483647;
    long longVar = 2147483648L;
    float floatVar = 0.12345678f;
    double doubleVar = 123456.123456789;
    boolean booleanVar = true;
    char charVar = 'c';


    System.out.println("Info about "
        + firstName + " "
        +middleName + " "
        +lastName + ":");
    System.out.println("Age: " + age);
    System.out.println("Education: " + education);
    System.out.println("Hobby: " + hobby);

    System.out.println();
    System.out.println("He's familiar with the following type of variables:");
    System.out.println("byteVar = " + byteVar);
    System.out.println("shortVar = " + shortVar);
    System.out.println("intVar = " + intVar);
    System.out.println("longVar = " + longVar);
    System.out.println("floatVar = " + floatVar);
    System.out.println("doubleVar = " + doubleVar);
    System.out.println("booleanVar = " + booleanVar);
    System.out.println("charVar = " + charVar);
  }
}
