package ex02_parameter;

class main2 {
  public static void main(String[] args) {

    Calculator myCalc;
    myCalc = new Calculator();

    myCalc.add(1, 3);
    myCalc.add(1.5, 2.8);
    // 1번째 방법 기본
    int[] arr = { 1, 2, 3, 4, 5 };
    // 2번째 곧바로 전달
    myCalc.add(new int[] { 1, 2, 3, 4, 5 });
    myCalc.multiply(1, 2);

  }
}

public class Calculator {

  // 메서드 오버로딩
  // 같은 이름의 메서드 + 개수나 타입이 다른 매개변수

  // 받은 타입이 다름
  void add(int a, int b) {
    System.out.println(a + b);

  }

  void add(double a, double b) {
    System.out.println(a + b);
  }

  void add(int[] numbers) {
    int result = 0;
    for (int num : numbers) {
      result += num;
    }
    System.out.println(result);
  }

  // 받는 개수가 다름
  void multiply(int a, int b) {
    System.out.println(a * b);
    System.out.println("1번째");
  }

  void multiply(int a, int b, int c) {
    System.out.println(a * b * c);

  }

  // 가변 인자 방식
  // void multiply(int... numbers) { // 가변 인자 처리를 위한 말 줄임표
  // 개선판
  void multiply(int a, int b, int... numbers) {
    // 가변인자는 실제로 배열로 처리됩니다.
    // void multiply(int[] numbers) 내부적으로 같음
    // 개선판
    int result = a * b;
    for (int n : numbers) {
      result *= n;
    }
    System.out.println(result);
    System.out.println("2번째");

  }
}
