package maxima.homework20221109.Lesson09;

abstract class Jeep extends Car{
    @Override
    public void driveOn() {
        super.driveOn();
        // + 2 special lines due to AWD
    }

    @Override
    protected void changeGear() {
        super.changeGear();
        // ADD 2 lines of code
    }
}
