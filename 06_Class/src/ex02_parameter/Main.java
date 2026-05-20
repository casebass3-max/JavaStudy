package ex02_parameter;

public class Main {
  public static void main(String[] args) {
    // 객체 선언 및 생성
    Car car = new Car();

    // 마침표(.)연산자로 호출하기
    // 메서드로 전달하는 값 : 인자(Argument)
    car.goToGasStation(100);
    car.drive("서울");
    System.out.println("메인쪽 오일 확인" + car.oil);
  }
}
