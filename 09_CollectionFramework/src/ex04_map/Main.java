package ex04_map;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class Main {
  public static void main(String[] args) {
    // 1.HashMap 객체 생성
    Map<String, Object> map = new HashMap<>();

    // 2.Entry 저장 (key + velue = Entry)
    map.put("name", "홍길동");
    map.put("age", 30);
    map.put("hobbies", new String[] { "러닝", "게임" });

    // 3.Entry 수정 (기존에 사용하던 key를 다시 사용하면? : 기존 Value가 수정됨)
    map.put("name", "김수정");

    // 4.정보 확인 (Value 확인 => Key를 이용해 Value 확인)
    System.out.println("이름 : " + map.get("name"));
    System.out.println("나이 : " + map.get("age"));
    System.out.println("취미 : " + Arrays.toString((String[]) map.get("hobbies")));// 스트링 배열 타입으로 다운캐스팅
    // birthday가 없으면 보여줄 기본 데이터를 지정하고 보여줌
    System.out.println("생일 : " + map.getOrDefault("birthday", "생일 정보 없음"));

    // 5.Entry 순회 1번 방법(key를 이용한 순회 방식)- 추천하지않음
    Set<String> keys = map.keySet();// 반환타입 set<>
    for (String key : keys) {
      System.out.println("Key :" + key + "Value :" + map.get(key));
    }
    // 6.Entry 순회 2번 방법(Entry 인터페이스를 이용한 순회 방식)- 추천
    for (Entry<String, Object> entry : map.entrySet()) {
      System.out.println("2번 방법 결과 " + "Key : " + entry.getKey() + "Value : " + entry.getValue());
    }

    // 7.Map.of()
    // 정적 팩토리 메서드 of() : new 대신 사용하는 객체 생성 메서드
    // 이렇게 만든 Map 객체는 수정 불가능(Immutable: put(),remove()등 호출 시 오류 발생)
    // JSON으로 보낼때 불변 성향으로 안전하게 보낼 수 있음(데이터가 변경되지 않기 때문)
    Map<String, Object> map2 = Map.of("name", "홍길동", "age", 30);
    System.out.println(map2);
    // return Map.of(,,,)으로 할때 이와 같은 형태로 구성하는게 좋다.

  }
}
