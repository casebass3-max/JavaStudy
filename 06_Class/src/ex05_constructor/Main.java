package ex05_constructor;

public class Main {
  public static void main(String[] args) {

    // Car 객체를 생성 시 생성자가 호출됩니다.
    Car myCar = new Car("5 시리즈");
    Car momCar = new Car("7 시리즈");
    // System.out.println(myCar.model);
    // System.out.println(momCar.model);
    Car dadCar = new Car();

  }
}
