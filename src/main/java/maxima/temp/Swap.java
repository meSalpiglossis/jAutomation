package src.main.java.maxima.temp;

public class Swap {
  public static void main(String[] args) {
    String z = "1";
    String a = z;
    String b = "2";

    swap(a, b);
    System.out.println("z = " + z);
    System.out.println("a = " + a);
    System.out.println("b = " + b);
  }

  static void swap(String a, String b) {
    String c = a;
    a = b;
    b = c;

    System.out.println("a=" + a + " , b=" + b);
  }
}
