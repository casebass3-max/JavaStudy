package ex02_standard_Functional_Interface_Study;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

public class FunctionPractice {
  public static void main(String[] args) {

    Member member1 = new Member("김뿡빵", 20);
    Member member2 = new Member("홍길동", 25);

    /*
     * 문제:
     * Function<Member, String>을 사용해서
     * Member 객체를 소개 문자열로 변환하세요.
     *
     * 조건:
     * 1. 입력 타입은 Member
     * 2. 반환 타입은 String
     * 3. 반환 형태는 아래와 같아야 함
     *
     * 이름: 김뿡빵, 나이: 20세
     */
    Function<Member, String> memberInfoFunction = member -> {
      // TODO: member의 name과 age를 이용해서 문자열을 반환하세요.
      String str = "이름 :" + member.getName() + " 나이 : " + member.getAge() + "세";

      return str;
    };

    String result1 = memberInfoFunction.apply(member1);
    String result2 = memberInfoFunction.apply(member2);

    System.out.println(result1);
    System.out.println(result2);
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