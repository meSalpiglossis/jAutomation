package maxima.homework20221102.hierarchy;

public class AudioEquipment extends Equipment {

  final boolean jackInput;
  final boolean jackOutput;

  public AudioEquipment(String manufacturer, String model, boolean jackInput, boolean jackOutput) {
    super(manufacturer, model);
    this.jackInput = jackInput;
    this.jackOutput = jackOutput;
  }

}
