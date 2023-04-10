package maxima.homework20221102.hierarchy;

public class Speaker extends AudioEquipment{
  final boolean active;
  final int ampPower;
  final int freqLow;
  final int freqMax;
  final int width;
  final int height;
  final int depth;
  final int weight;
  final double price;


  public Speaker(String manufacturer, String model, boolean jackInput, boolean jackOutput, boolean active, int ampPower, int freqLow, int freqMax, int width, int height, int depth, int weight, double price) {
    super(manufacturer, model, jackInput, jackOutput);
    this.active = active;
    this.ampPower = ampPower;
    this.freqLow = freqLow;
    this.freqMax = freqMax;
    this.width = width;
    this.height = height;
    this.depth = depth;
    this.weight = weight;
    this.price = price;
  }

  public String getManufacturer() {
    return manufacturer;
  }

  public String getModel() {
    return model;
  }

  public boolean isJackInput() {
    return jackInput;
  }

  public boolean isJackOutput() {
    return jackOutput;
  }

  public boolean isActive() {
    return active;
  }

  public int getAmpPower() {
    return ampPower;
  }

  public int getFreqLow() {
    return freqLow;
  }

  public int getFreqMax() {
    return freqMax;
  }

  public int getWidth() {
    return width;
  }

  public int getHeight() {
    return height;
  }

  public int getDepth() {
    return depth;
  }

  public int getWeight() {
    return weight;
  }

  public double getPrice() {
    return price;
  }

  public static class Builder {
    private String manufacturer;
    private String model;
    private boolean jackInput;
    private boolean jackOutput;
    private boolean active;
    private int ampPower;
    private int freqLow;
    private int freqMax;
    private int width;
    private int height;
    private int depth;
    private int weight;
    private double price;

    public Builder setManufacturer(String manufacturer) {
      this.manufacturer = manufacturer;
      return this;
    }

    public Builder setModel(String model) {
      this.model = model;
      return this;
    }

    public Builder setJackInput(boolean jackInput) {
      this.jackInput = jackInput;
      return this;
    }

    public Builder setJackOutput(boolean jackOutput) {
      this.jackOutput = jackOutput;
      return this;
    }

    public Builder setActive(boolean active) {
      this.active = active;
      return this;
    }

    public Builder setAmpPower(int ampPower) {
      this.ampPower = ampPower;
      return this;
    }

    public Builder setFreqLow(int freqLow) {
      this.freqLow = freqLow;
      return this;
    }

    public Builder setFreqMax(int freqMax) {
      this.freqMax = freqMax;
      return this;
    }

    public Builder setWidth(int width) {
      this.width = width;
      return this;
    }

    public Builder setHeight(int height) {
      this.height = height;
      return this;
    }

    public Builder setDepth(int depth) {
      this.depth = depth;
      return this;
    }

    public Builder setWeight(int weight) {
      this.weight = weight;
      return this;
    }

    public Builder setPrice(double price) {
      this.price = price;
      return this;
    }

    public Speaker build() {
      return new Speaker(manufacturer, model, jackInput, jackOutput, active, ampPower, freqLow, freqMax, width, height, depth, weight, price);
    }
  }

  public static void main(String[] args) {
    Speaker speaker = new Speaker.Builder().setManufacturer("Yamaha").setModel("01").setJackInput(true).setActive(true).build();

    System.out.println(speaker.getManufacturer());
    System.out.println(speaker.isJackInput());
    System.out.println(speaker.isActive());


  }

}
