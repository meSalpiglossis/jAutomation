/*
package firstpackage;

public interface DriveEngine{
    void driveStart();
     void driveStop();
}

public interface LoadEngine{
    void load();
    void reLoad();
}

public interface RadioEngine{
    void switchMusicOn();
    void switchMusicOf();
}

public interface EmbeddedLaptopEngine{
    void switchVideoOn();
    void switchVideoOf();
    void internetSearch();
}

public interface UserMaintanencer{
    void fillFuel(){};
    void fillWater(){};
    void changeOil(){};
}

public interface TechMaintanencer{
    void maintenance();
    void repair();
}

public class Car implements DriveEngine, LoadEngine, RadioEngine, EmbeddedLaptopEngine, UserMaintanencer, TechMaintanencer {
    public void driveStart(){} // class Driver
    public void driveStop(){} // class Driver

    public void load(){} // class Driver
    public void reLoad(){} // class Driver


    // class Passenger or class Driver
    public void switchMusicOn(){} // class Radio
    public void switchMusicOf(){} // class Radio

    public void switchVideoOn(){} // class Embedded Laptop
    public void switchVideoOf(){} // class Embedded Laptop
    public void internetSearch(){} // class Embedded Laptop


    // class Passenger or class Driver or class AREmployee
    public void fillFuel(){}
    public void fillWater(){}
    public void changeOil(){}

    public void maintenance(){} // class Tech
    public void repair(){} // class TechLead (Tech)
}

    DriveEngine myFirstCar = new Car();
    myFirstCar.driveStart();
    // Add some actions or conditions
    myFirstCar.driveStop();

    DriveEngine myFirstBike = new Bike();
    myFirstBike.driveStart();
    // Add some actions or conditions
    myFirstBike.driveStop();

    UserMaintanencer theSameCar = myFirstCar;
    theSameCar.fillFuel();


    TechLead lead = new TechLead();
    TechMaintanencer needRepairCar = theSameCar;
    lead.repair(needRepairCar);
*/