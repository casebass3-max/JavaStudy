package ex02_standard_Functional_Interface_Study;

import java.util.function.Supplier;

public class SupplierPractice {

  public static void main(String[] args) {

    // 기본 닉네임을 공급하는 Supplier
    Supplier<String> defaultNicknameSupplier = () -> {
      System.out.println("기본 닉네임을 생성합니다.");
      return "익명사용자" + (int) (Math.random() * 1000);
    };

    String nickname1 = createNickname("김뿡빵", defaultNicknameSupplier);
    System.out.println("닉네임1: " + nickname1);

    String nickname2 = createNickname("", defaultNicknameSupplier);
    System.out.println("닉네임2: " + nickname2);
  }

  /*
   * 문제:
   * nickname이 null이거나 빈 문자열이면
   * defaultNicknameSupplier.get()을 호출해서 기본 닉네임을 반환하세요.
   *
   * nickname이 정상적으로 들어왔다면
   * Supplier를 호출하지 말고 nickname을 그대로 반환하세요.
   */

  public static String createNickname(String nickname, Supplier<String> defaultNicknameSupplier) {
    String result = nickname == null || nickname.isBlank() ? defaultNicknameSupplier.get() : nickname;
    return result.trim();
  }
}