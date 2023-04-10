package maxima.homework20221102.geometrypackage;

public class Ellipse implements Shape{

  static final double PI = 3.14;
  private double bigRadius;
  private double smallRadius;

  public Ellipse() {
    this.bigRadius = 0;
    this.smallRadius = 0;
  }

  public Ellipse(double bigRadius, double smallRadius) {
    this.bigRadius = bigRadius;
    this.smallRadius = smallRadius;
  }

  public double getBigRadius() {
    return bigRadius;
  }

  public void setBigRadius(double bigRadius) {
    this.bigRadius = bigRadius;
  }

  public double getSmallRadius() {
    return smallRadius;
  }

  public void setSmallRadius(double smallRadius) {
    this.smallRadius = smallRadius;
  }

  @Override
  public double getArea() {
    return PI * bigRadius * smallRadius;
  }
}
