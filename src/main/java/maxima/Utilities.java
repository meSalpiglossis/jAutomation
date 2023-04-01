package src.main.java.maxima;

public class Utilities {
  public final static void clearConsole(){
    try
    {
      final String os = System.getProperty("os.name");

      if (os.contains("Windows"))
      {
        Runtime.getRuntime().exec("cls");
      }
      else
      {
        Runtime.getRuntime().exec("clear");
      }
    }
    catch (final Exception e)
    {
      System.out.println("Unknown OS");
    }
  }
}
