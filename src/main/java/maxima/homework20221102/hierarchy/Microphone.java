package maxima.homework20221102.hierarchy;

public class Microphone extends AudioEquipment{
  final String type;

  public Microphone(String manufacturer, String model, boolean jackInput, boolean jackOutput, String type) {
    super(manufacturer, model, jackInput, jackOutput);
    this.type = type;
  }
}
