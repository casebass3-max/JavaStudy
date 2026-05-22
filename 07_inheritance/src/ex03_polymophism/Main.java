package ex03_polymophism;
// 다형성 : 하나의 타입으로 여러 객체를 관리하는 성질

// 부모 타입으로 자식 객체를 관리할 수 있다.

public class Main {
  public static void main(String[] args) {
    // 업캐스팅
    // 자식 타입을 부모 타입으로 변환하는 것
    // 자동 형 변환 처리 됨
    // 자식 타입의 메소드를 실행 시킬수 없음
    Coffee coffee1 = new Espresso("브라질");
    Coffee coffee2 = new Americano("니카라과");
    // 업캐스팅 된 객체도 실제 메서드 실행 시에는 자신의 메서드를 차아서 실행한다.
    coffee1.taste();// 부모의 메서드를 참고하지만(정적 바인딩) 실행시에는 본 클래스의 메서드를 실행(동적 바인딩)
    coffee2.taste();
    // 부모 메서드 사용시 super.methed()로 사용

    coffee1.info();
    // 일반 적인 다운 캐스팅 방법 (형변환)
    // ((Espresso)coffee1).drink();

    // instanceof 사용
    // 참조 변수가 가리키는 실제 객체 타입을 확인할 떄 사용하는 연산자
    // 안전한 다운캐스팅을 위해서 사용

    if (coffee1 instanceof Espresso) {// coffee1객체가 Espresso타입이 맞다면
      Espresso esp = (Espresso) coffee1; // 안전하게 다운캐스팅
      // esp.drink(); // 다운캐스팅 메서드 사용
      // ((Espresso)coffee1).drink();//vs code는 자동으로 안내 버튼 나옴 (if가 true라면 .drink()가
      // 나옴)
    }
  }
}
