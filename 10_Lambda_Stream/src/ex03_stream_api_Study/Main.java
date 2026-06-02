package ex03_stream_api_Study;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
  public static void main(String[] args) {

    // 스트림 생성
    // Array -> Stream
    String[] arr = { "Java", "Python", "C++" };
    Stream stream1 = Arrays.stream(arr);
    Stream stream2 = Stream.of("Java", "Python", "C++");

    // Collection -> Stream
    List<String> list = Arrays.asList("a", "bb", "ccc", "dddd");
    Stream<String> listStream = list.stream();

    // 중간 연산
    // 중간연산만으로는 실행이 되지 않기 때문에 forEach()를 사용하여 최종 연산 처리를 진행
    // 최종연산 forEach()는 Consumer<> 인터페이스를 받아서 사용하기 때문에
    // 연산 확인을 위한 Consumer<>를 만들어서 forEach에서 돌아가도록 함
    Consumer con = value -> System.out.println("중간 연산 결과 : " + value);

    /*
     * // filter()
     * // 데이터 조건에 맞는 데이터만 통과
     * 
     * // filter(조건식) : 조건식 안에는 Predicate<T>가 들어감
     * // 즉 T을 받아서 boolean중 true인 값만 받아서 다음단계로 통과
     * 
     * // 예시) 3이거나 3이상의 글자수를 가진 결과만 필터링
     * System.out.println("filter() 결과");
     * listStream.filter(name -> name.length() >= 3).forEach(con);
     */

    /*
     * // map()
     * // 스트림의 데이터를 다른 형태로 변환하는 중간 연산
     * 
     * // map(조건식): 조건식 안에는 Function<T,R>이 들어감
     * // Function<>을 통해 기존 값을 다른 형태로 변환
     * 
     * // 예시) String을 int로 변환하여 글자수로 출력
     * // map에서 사용할 Function<> 생성 String의 길이로 Integer로 타입 변환
     * Function<String, Integer> func = value -> value.length();
     * 
     * System.out.println("map() 결과");
     * listStream.map(func).forEach(con);
     */
    /*
     * // sorted()
     * // 스트림의 데이터를 정렬합니다.
     * 
     * // 입력 값은 없으며 기본으로는 오름차순으로 정렬을 합니다.
     * // 문자열 스트림과 숫자 스트림를 만들어 확인해봅니다.
     * Stream<String> textList = Stream.of("4", "3", "c", "a");
     * Stream<String> textList2 = Stream.of("b", "d", "a", "c");
     * Stream<Integer> numList = Stream.of(3, 5, 1, 2, 4);
     * Stream<Integer> numList2 = Stream.of(3, 5, 1, 2, 4);
     * 
     * // 스트링 타입이더라도 숫자와 문자중 숫자를 더 상위에 둠
     * System.out.println("sorted() 텍스트 결과");
     * textList.sorted().forEach(con);
     * System.out.println("sorted() 숫자 결과");
     * numList.sorted().forEach(con);
     * // 역순으로 정렬 방법 sorted(Comparator.reverseOrder())
     * System.out.println("sorted() 텍스트 역순 결과");
     * textList2.sorted(Comparator.reverseOrder()).forEach(con);
     * System.out.println("sorted() 숫자 역순 결과");
     * numList2.sorted(Comparator.reverseOrder()).forEach(con);
     */

    /*
     * // distinct()
     * // 중복된 값을 제거합니다.
     * // 입력 값은 없으며 중복이 있다면 첫번째 값만 제외하고 제거합니다.
     * // 객체의 중복 판단은 equals(),hashCode()를 기준으로 합니다.
     * System.out.println("distinct() 결과");
     * Stream<String> stream = Stream.of("a","a","A","A","b","b","C","C");
     * stream.distinct().forEach(con);
     */
    /*
     * // limit(n)
     * // n개까지만 값을 가져옵니다.
     * // 입력 값은 가져올 개수를 입력합니다.
     * Stream<String> textStream = Stream.of("여기만", "가져옵니다.", "여기부턴 못 가져와요.",
     * "알겠죠?");
     * System.out.println("limit() 확인");
     * textStream.limit(2).forEach(con);
     */

    // 최종 연산
    // 최종 연산은 스트림처리를 실제로 실행하는 단계입니다.
    // 최종 연산 실행시 해당 스트림은 닫힌 상태가 되며
    // 닫힌 상태에서는 해당 스트림은 사용이 불가능합니다.
    // 최종 연산은 개수를 세거나 결과를 출력하거나 리스트로 모으거나 조건을 판별하는 역할은 합니다.
    /*
     * //forEach()
     * //각 요소를 순회하며 처리
     * //forEach(조건식) : 조건식 안에는 Consumer<T>가 들어갑니다.
     * //입력값은 있지만 반환값은 없습니다.
     * //주로 출력,로그 확인,값 소비 작업에 사용
     * Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5);
     * stream.forEach(System.out::println);
     */

    /*
     * // collect()
     * // 스트림 처리 결과를 List,Set,Map같은 컬렉션으로 다시 모으는 최종 연산입니다.
     * // 보통 Collectors.toList(), Collectors.toSet(), Collectors.toMap()과 함께 사용합니다.
     * Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5);
     * List<Integer> integerList = stream.filter(val -> val >
     * 3).collect(Collectors.toList());
     * System.out.println(integerList);
     */

    // count()
    // 스트림 안에 남아있는 갯수를 반환하는 최종 연산입니다.
    // 반환 타입은 long입니다.
    Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5);
    long num = stream.count();
    System.out.println("스트림 안에 남아 있는 갯수는 " + num + "입니다.");

  }
}
