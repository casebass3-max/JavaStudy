package ex07_static;

public class Main {
  public static void main(String[] args) {
    // 정적 메서드 : 객체 생성 없이 메서드를 호출
    // Calculator calc = new Calculator();
    int result = Calculator.add(1, 2);// int result = calc.add(1, 2);
    System.out.println(result);
    System.out.println(Calculator.pi);

  }
}
