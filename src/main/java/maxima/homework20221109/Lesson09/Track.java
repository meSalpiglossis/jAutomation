package maxima.homework20221109.Lesson09;

public class Track extends Car{
    @Override
    public void driveOn() {
        super.driveOn();
        changeGear();
        // + 150 special lines due to AWD
        changeGear();
    }

    @Override
    public void driveOff() {
        super.driveOff();
        changeGear();
        // + 20 special lines due to AWD
    }
}
