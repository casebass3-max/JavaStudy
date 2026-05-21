package ex05_constructor;

public class Car {
  // 생성자
  // 객체 생성할때만, 자동으로 호출 되는 특별한 메서드
  // 안 만들면, 자바 컴파일러가 코드를 넣어줌( 기본생성자 : Default Constructor)

  // 핵심 규칙 2가지
  // 1. 반환 없음
  // 2. 메서드 이름이 정해져 있음

  // 생성자 역할
  // 생성할 때 필드 값 채우기

  // 필드 선언
  String model;
  // 기본 만들기
  // Car(String model) {
  // System.out.println("Car 객체 생성됨");
  // this.model = model;
  // System.out.println("제 차 모델명은 " + model + "입니다.");
  // }

  Car() {
    // this()
    // 다른 생성자를 호출하는 코드
    // 실행 순서
    // new Car()
    // ↓
    // Car() 생성자 실행
    // ↓
    // this("3시리즈")
    // ↓
    // Car(String model) 생성자 실행
    // ↓
    // model = "3시리즈"
    // ↓
    // this.model = model
    // ↓
    // 객체의 model 필드에 "3시리즈" 저장
    this("3시리즈");

  }

  // vs코드 방식 우클릭 + 소스 작업 + 제너레이터 콘스트럭터
  // public Car() {

  // }

  public Car(String model) {
    this.model = model;
  }

}
