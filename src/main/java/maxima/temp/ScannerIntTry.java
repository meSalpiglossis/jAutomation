package src.main.java.maxima.temp;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ScannerIntTry {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int divider;

        try {
            divider = scanner.nextInt();
        } catch (ArithmeticException ex) {
            System.out.println("Divide by zero? Divider will be '1'");
            divider = 1;
        } catch (InputMismatchException ex) {
            System.out.println("Divide by symbol? Divider will be '1'");
            divider = 1;
        }catch (Exception ex) {
            System.out.println("Any other Exception... Divider will be '1'");
            divider = 1;
        }

        System.out.println(100 / divider);

    }
}
