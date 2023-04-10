package maxima.homework20221109.Lesson09;

// Todo: think about how to add Track, Jeep

import jdk.jshell.spi.ExecutionControl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class Main {
    static public Drive[] getEngines(){
        Drive[] engines = new Drive[21];
        engines[0] = new Car();
        engines[1] = new Minivan();
        engines[2] = new Minivan();
        engines[3] = new Minivan();
        engines[4] = new JeepSUV();
        engines[5] = new JeepSUV();
        engines[6] = new JeepOffRoad();
        engines[7] = new JeepOffRoad();
        engines[8] = new Track();
        engines[9] = new Track();
        engines[10] = new Pajero();
        engines[11] = new Bike();
        engines[12] = new Bike();
        engines[13] = new Bike();
        engines[14] = new Bike();
        engines[15] = new Train();

        return engines;
    }

    static public ArrayList<Drive> getEnginesArrayList() {
        ArrayList<Drive> engines = new ArrayList<>(100);
        engines.add(new Car());
        engines.add(new Minivan());
        engines.add(new JeepSUV());
        engines.add(new JeepOffRoad());
        engines.add(new Track());
        engines.add(new Pajero());
        engines.add(new Bike());
        engines.add(new Train());

        return engines;
    }

    static public LinkedList<Drive> getEnginesLinkedList() {
        LinkedList<Drive> engines = new LinkedList<>();
        engines.add(new Car());
        engines.add(new Minivan());
        engines.add(new JeepSUV());
        engines.add(new JeepOffRoad());
        engines.add(new Track());
        engines.add(new Pajero());
        engines.add(new Bike());
        engines.add(new Train());

        return engines;
    }


    public static void main(String[] args){

        for (Drive engine : getEngines()) {
                engine.driveOn();
        }

        for (Drive engine : getEngines()) {
                engine.driveOff();
        }
    }
}