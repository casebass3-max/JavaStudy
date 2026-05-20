package ex03_return;

public class main {
  public static void main(String[] args) {
    // 객체를 만들고, 객체로 메서드를 호출 합니다.

    Calculator calc = new Calculator();

    int result = calc.add(1, 2);
    System.out.println(result);
    System.out.println(calc.add(1, 2));
    calc.add(1.2, 2.3);

  }
}
