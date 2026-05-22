package ex05_interface;
//노션 설명

// 인터페이스
// 객체가 어떤 동작을 해야하는지 정의한 규격
// 추상화 된 틀을 제공하여 서로 다른 소프트웨어 구성 요소들이 상호작용을 할 수 있도록 함

// 수업

// 인터페이스는 상속 받는게 아닌 구현한다로 생각


public interface Shape {
  double getPerimeter(); //둘레 길이 구하기 public abstract 생략
  double getArea(); // 넓이 구하기
}


//개인 정리
//상속은 무엇인가를 표현하고 인터페이스는 무엇을 할 수 있는가를 표현한다
//