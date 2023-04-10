package maxima.homework20221109.Lesson09;

public class Car implements Drive{
    @Override
    public void driveOn() {
        // 100 lines of code (90% call private and protected)
        changeGear();
        changeGear();
        changeGear();
        // 100 lines of code
    }

    @Override
    public void driveOff() {
        // 5 lines of code
        changeGear();
    }

    protected void changeGear()
    {
        // 30 lines of code
    }
}
