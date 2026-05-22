package ex02_throw;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);
    // 스캐너같은 부류는 스트림이라고 한다
    // 스캐너는 끝내는 코드를 넣어야한다.

    // try with resources : 자동으로 close()처리
    // try( 자원 생성 ) {} catch{}

    try (Scanner sc = new Scanner(System.in);) {// 트라이 ()안에 둘수 있음

      System.out.println("점수(0~100)를 입력하세요");
      int score = sc.nextInt();

      if (score < 0 || score > 100) {// 예외 발생 조건
        // 직접 예외를 만들어서 던지기 => catch
        throw new RuntimeException("0~100 사이의 값을 입력하세요. 다시 시도하세요.");
      }
      System.out.println(score >= 60 ? "합격" : "불합격");

    } catch (Exception e) {
      System.err.println(e.getMessage());
      System.err.println(e);

    } /*
       * finally {
       * // 항상 마지막에 실행 되는 영역
       * // 일반적으로 자원 정리할 때 사용
       * sc.close();// 스캐너의 자동 누수를 막는 해결책 1번
       * }
       */

  }
}
