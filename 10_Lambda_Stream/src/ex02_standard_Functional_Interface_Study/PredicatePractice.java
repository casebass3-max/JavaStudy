package ex02_standard_Functional_Interface_Study;

import java.util.function.Predicate;

public class PredicatePractice {
  public static void main(String[] args) {

    Member[] members = {
        new Member("김뿡빵", 20),
        new Member("홍길동", 17),
        new Member("제니", 25),
        new Member("로제", 19)
    };

    /*
     * 문제:
     * Predicate<Member>를 사용해서
     * Member의 나이가 20세 이상인지 판별하세요.
     *
     * 조건:
     * - 20세 이상이면 true
     * - 20세 미만이면 false
     */
    Predicate<Member> adultPredicate = member -> member.getAge() >= 20;
  

    for (Member member : members) {
      /*
       * 문제:
       * adultPredicate.test(member)를 사용해서
       * true이면 "입장 가능"
       * false이면 "입장 불가"
       * 를 출력하세요.
       */
      // TODO: if문을 작성하세요.
      if (adultPredicate.test(member)) {
        System.out.println("입장 가능");
      } else {
        System.out.println("입장 불가");
      }
    }
  }
}

class Member {
  private String name;
  private int age;

  public Member(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }
}