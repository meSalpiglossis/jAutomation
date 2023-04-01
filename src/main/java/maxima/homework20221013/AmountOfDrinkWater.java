package src.main.java.maxima.homework20221013;

//Algorithm: проверить наличие питьевой воды
public class AmountOfDrinkWater {

  public static double getAvailableAmount(Bottle bottle){
    return bottle.getAmountOfWater();
  }

  public static void main(String[] args) {
    Bottle bottle1 = new Bottle();

    System.out.printf("For now we have %.1f litres of drink water.", getAvailableAmount(bottle1));

  }
}
