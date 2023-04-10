package maxima.homework20221026;

public class Speaker {
  private final String manufacturer;
  private final String model;
  private final boolean active;
  private final int ampPower;
  private final int freqLow;
  private final int freqMax;
  private final int width;
  private final int height;
  private final int depth;
  private final int weight;
  private final double price;


  public Speaker(String manufacturer, String model, boolean active, int ampPower, int freqLow, int freqMax, int width, int height, int depth, int weight, double price) {
    this.manufacturer = manufacturer;
    this.model = model;
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
      return new Speaker(manufacturer, model, active, ampPower, freqLow, freqMax, width, height, depth, weight, price);
    }
  }
}
