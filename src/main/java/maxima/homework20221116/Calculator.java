package maxima.homework20221116;

import java.security.InvalidParameterException;

public class Calculator {
    private double result = 0; // TODO: Impl me!

    public void cleanMemory() {
        result = 0;
    }

    public double add(double a, double b){
        return result = a + b;
    }

    public double add(double a){
        return result = add(result, a);
    }

    public double sub(double a, double b){
        return result = a - b;
    }

    public double sub(double a){
        return result = sub(result, a);
    }

    public double mul(double a, double b){
        return result = a * b;
    }

    public double mul(double a){
        return result = mul(result, a);
    }

    public double div(double a, double b) {
        if(b == 0){
            throw new InvalidParameterException("Error: b == 0");
        }
        return result = a / b;
    }

    public double div(double a){
        return result = div(result, a);
    }

    public double pow(double a, double pow){
        return result = Math.pow(a, pow);
    }

    public double pow(double a){
        return result = pow(result, a);
    }

    public double sqrt(double a){
        return result = Math.sqrt(a);
    }

    public double sqrt(){
        return result = sqrt(result);
    }

}
