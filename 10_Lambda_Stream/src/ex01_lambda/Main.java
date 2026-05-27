package ex01_lambda;

public class Main {
  public static void main(String[] args) {
    // 기본 형식
    // MyInterface my = new MyInterface() {
    // @Override
    // public void method() {
    // // TODO Auto-generated method stub
    // System.out.println("ㅇㅇ");
    // }
    // };

    // 람다식
    MyInterface my = () -> {// 화살표 함수 or 익명함수
      System.out.println("나의 첫 람다식");
    };
    my.method();

    // 매개변수가 있는 인터페이스 불러오기
    // 실행문이 한줄이면 중괄호{}를 생략할 수 있다.
    MyInterface2 my2 = (name) -> System.out.println(name + " 입니다.");
    my2.method("김빵뿡");

    // 반환값이 있는 인터페이스 불러오기
    // 실행문이 한줄이면 return도 생략 가능
    MyInterface3 my3 = () -> "김뿡빵 입니다.";
    System.out.println(my3.method());

    // 값 더하기 람다식 구현
    Calculater calc = (a, b) -> a + b;
    System.out.println("더한 값은 : " + calc.add(1, 3) + "입니다.");
  }
}
