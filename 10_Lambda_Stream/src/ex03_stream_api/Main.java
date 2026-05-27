package ex03_stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
  public static void main(String[] args) {
    // 초기값 생성 Array.asList()사용
    List<String> members = Arrays.asList("kim", "jessica", "john", "tomson");

    // 원본 리스트를 이용해 Stream 생성
    Stream<String> stream = members.stream();

    // 최종 연산
    // 최종 연산이 실행된 Stream은 사라진다(재사용 불가)
    // System.out.println("최종 연산");
    // stream.forEach(member -> System.out.println(member));

    // 중간 연산(filter) + 최종 연산
    // System.out.println("중간연산 + 최종연산");
    // stream.filter(member -> member.length() <= 4)
    // .forEach(member -> System.out.println(member));

    // 중간연산(filter+map) + 최종 연산(forEach)
    // stream.filter(member -> member.length() <= 4)
    // .map(name -> name + "님")
    // .forEach(member -> System.out.println(member));

    // 중간연산(filter+map) + 최종 연산(collect)
    // collect로 필터링된 List<> 생성
    List<String> list = stream.filter(member -> member.length() <= 4)
        .map(name -> name + "님")
        .collect(Collectors.toList());

    System.out.println(list);
  }
}
