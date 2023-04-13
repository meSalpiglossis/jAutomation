package maxima.homework20221116;

import java.security.InvalidParameterException;

public class CalculatorV2 {
    private static double result = 0;

    public static void cleanMemory() {
        result = 0;
    }

    public static double add(double a, double b){
        return result = a + b;
    }

    public static double add(double a){
        return result = add(result, a);
    }

    public static double sub(double a, double b){
        return result = a - b;
    }

    public static double sub(double a){
        return result = sub(result, a);
    }

    public static double mul(double a, double b){
        return result = a * b;
    }

    public static double mul(double a){
        return result = mul(result, a);
    }

    public static double div(double a, double b) {
        if(b == 0){
            throw new InvalidParameterException("Error: b == 0");
        }
        return result = a / b;
    }

    public static double div(double a){
        return result = div(result, a);
    }

    public static double pow(double a, double pow){
        return result = Math.pow(a, pow);
    }

    public static double pow(double a){
        return result = pow(result, a);
    }

    public static double sqrt(double a){
        return result = Math.sqrt(a);
    }

    public static double sqrt(){
        return result = sqrt(result);
    }

    public static double getMemory() {
        return result;
    }
}
