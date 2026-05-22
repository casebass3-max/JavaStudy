package ex01_try_catch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    // 사용자 입력
    Scanner sc = new Scanner(System.in);
    // 정수 입력할 정수
    int a, b;
    // 무한 루프
    while (true) {

      // 예외 선언
      try {

        // 코드 작성 부분
        System.out.println("첫번째 입력");
        a = sc.nextInt();
        System.out.println("두번째 입력");
        b = sc.nextInt();
        System.out.println("몫:" + (a / b) + "나머지 : " + (a % b));

      } catch (ArithmeticException e) {

        // 예외처리 부분
        // getMessage(),printStackTrace()
        // System.out.println(e + "의 이유로 오류가 발생하였습니다.");
        // System.err.println("예외사유 : " + e.getMessage());
        // System.err.println("0으로 나눌수 없습니다 다시 시도하세요!");
        // e.printStackTrace();
        System.out.println(e + "의 이유로 오류가 발생하였습니다.");
        System.out.println("0으로 나눌 수 없습니다.");
        // 캐치 블록은 2개 이상 사용 가능하다.
      } catch (InputMismatchException e) {
        System.out.println(e + "의 이유로 오류가 발생하였습니다.");
        System.out.println("정수만 입력할 수 있습니다.");
      } finally {
        sc.close();
      }

    }

  }

}
