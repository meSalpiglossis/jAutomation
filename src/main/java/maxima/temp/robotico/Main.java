package src.main.java.maxima.temp.robotico;

public class Main {
    public static void main(String[] args) {

        Robot t1 = new Terminator.Builder().setBody("T_body")
                                           .setHead("T_head")
                                           .setLegs("T_legs")
                                           .setHands("T_hands")
                                           .build();


        Terminator t2 = (Terminator) t1;



    }
}
