package ex03_return;

public class Calculator {
  // 일반적인 리턴
  int add(int a, int b) {
    return a + b;
  }

  // 반환이 없는 메서드의 리턴
  void add(double a, double b) {
    if (a < 0 || b < 0) { // 메서드의 실행 종료
      return;
    }
    System.out.println(a + b);
  }
}
