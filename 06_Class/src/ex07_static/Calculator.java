package ex07_static;

public class Calculator {

  // 필드와 상관없는 메소드는 유틸리티 메서드라고 부름
  // public static으로 공개하고 사용가능하지만 값 수정을 막기 위해 final을 붙임
  public static final double pi = 3.1459;

  // static
  // 정적 멤버, 클래스 멤버라고 합니다.
  // 클래스로 호출
  public static int add(int a, int b) {
    return a + b;
  }

}
