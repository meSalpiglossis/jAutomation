package maxima.homework20221013;

public class Bottle {
  double volume = 5.0;
  Water water = new Water(5.0);

  public double getAmountOfWater(){
    return water.getVolume();
  }


}
