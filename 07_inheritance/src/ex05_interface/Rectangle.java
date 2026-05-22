package ex05_interface;

public class Rectangle implements Shape {

  // 필드
  private double width; // 너비
  private double height; // 높이

  // 생성자
  public Rectangle(double width, double height) {
    this.width = width;
    this.height = height;
  }

  @Override
  public double getArea() {
    // TODO Auto-generated method stub
    return width * height;
  }

  @Override
  public double getPerimeter() {
    // TODO Auto-generated method stub
    return 2 * (width + height);
  }

}
