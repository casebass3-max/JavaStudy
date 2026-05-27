package ex03_set;

import java.util.HashSet;
import java.util.Set;

public class MemberMain {
  public static void main(String[] args) {
    // 확인할 사항
    // 1. 중복해서 저장해보기
    Set<Member> members = new HashSet<>();
    members.add(new Member("지수", 20));
    members.add(new Member("로제", 21));
    members.add(new Member("제니", 22));
    members.add(new Member("리사", 23));
    members.add(new Member("리사", 23));

    // 2. 존재여부 확인해보기
    if (members.contains(new Member("지수", 20))) {
      System.out.println("존재함");
    } else {
      System.out.println("안존재함");
    }

    // 3. 저장된 객체정보 출력해보기

    for (Member member : members) {
      System.out.println("이름 :" + member.getName() + "나이 : " + member.getAge());
    }
  }
}
