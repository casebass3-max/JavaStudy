package ex01_class;

public class Main {
  public static void main(String[] args) {

    // 클래스가 곧 타입이 된다.

    // 클래스를 타입으로 가지는 변수는 "객체"이다.
    // int a; a는 변수
    // Car b; b는 객체

    //패키지 명시를 안해도 되는 3가지 경우
    //1.같은 패키지에 있는 경우
    //2.java.lang 패키지 클래스(String,System등등)
    //3.import를 한 경우

    // 객체 선언
    Car car;

    // 객체 생성 (동적 할당을 통해 만듦)
    car = new Car();

    // 확인
    System.out.println(car);

    // 객체의 값 참조하기
    car.model = "G80";
    car.price = 8000;
    System.out.println(car.model + car.price);
  }
}
