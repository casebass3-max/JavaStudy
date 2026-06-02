package ex02_standard_Functional_Interface_Study;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerPractice {
  public static void main(String[] args) {

    // 알림 메시지를 저장할 리스트
    List<String> messageLogs = new ArrayList<>();

    /*
     * 문제:
     * Consumer<String>을 사용해서
     * 전달받은 message를 출력하고,
     * messageLogs 리스트에도 저장하세요.
     *
     * 조건:
     * 1. message를 "[알림] " + message 형태로 출력
     * 2. messageLogs에 message를 저장
     * 3. Consumer는 반환값이 없으므로 return 사용 금지
     */
    Consumer<String> notificationConsumer = message -> {
      System.out.println("[알림] " + message);
      messageLogs.add(message);
    };

    notificationConsumer.accept("회원가입이 완료되었습니다.");
    notificationConsumer.accept("쿠폰이 발급되었습니다.");
    notificationConsumer.accept("배송이 시작되었습니다.");

    System.out.println("저장된 알림 개수: " + messageLogs.size());
    System.out.println("저장된 알림 목록: " + messageLogs);
  }
}