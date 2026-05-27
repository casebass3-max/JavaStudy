package ex03_set;

import java.util.HashSet;
import java.util.Set;

public class Main {
  public static void main(String[] args) {

    // 1. HashSet (해시 기반 Set : 인덱스 없음(저장 순서 없음) ,데이터 중복 저장 불가)
    Set<String> members = new HashSet<>();

    // 2. 요소 추가
    members.add("지수");
    members.add("로제");
    members.add("제니");
    members.add("리사");

    // 3. 요소 하나씩 가져오기는 불가능

    // 4. 요소 삭제
    members.remove("지수");

    // 5. 요소가 있는지 없는지 비교

    if (members.contains("로제")) {
      System.out.println("있다");
    } else {
      System.out.println("없다");
    }
    // 6. for문 순회하기(향상된 for문만 가능)
    for (String member : members) {
      System.out.println(member);
    }

  }
}
