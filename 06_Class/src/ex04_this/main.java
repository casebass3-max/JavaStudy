package ex04_this;

public class main {
  public static void main(String[] args) {
    // 객체를 만든 뒤, 메서드를 호출

    Car myCar = new Car();
    myCar.addOli(-10);
    myCar.addOli(10);
    System.out.println(myCar.oil);
    

  }
}
