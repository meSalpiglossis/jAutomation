package src.main.java.maxima.homework20221109.Lesson09;

public class Minivan extends Car{
    @Override
    public void driveOn() {
        super.driveOn();
        changeGear();
        // + 10 special lines due to AWD
        changeGear();
    }



    public void driveOff() {
        super.driveOff();
        changeGear();
        // + 2 special lines due to AWD
    }

}
