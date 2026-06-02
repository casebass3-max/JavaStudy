package ex02_standard_Functional_Interface_Study;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {
  public static void main(String[] args) {
    // Runnable 객체 생성
    // Runnable은 실행할 작업을 표현
    // 추상 메서드로는 run()을 사용합니다.
    // 입력 값 없음
    // 반환 값 없음
    // 실행만 합니다.
    Runnable testRunnable = () -> System.out.println("함수형 인터페이스 Runnable 실행!");

    // run() 직접 호출
    System.out.println("run()을 호출합니다.");
    testRunnable.run();

    // Supplier 생성
    // 매개변수를 받지 않고 반환만 합니다.
    // 값 자체를 저장한다기보다 값을 만들어 반환하는 동작을 표현함(데이터 공급)
    // 추상 메서드는 get()
    Supplier<String> testSupplier = () -> "String 타입의 이 문장을 반환 합니다.";
    System.out.println(testSupplier.get());

    // Consumer 생성
    // 값(데이터)을 받아서 사용합니다.
    // 데이터를 소비하는 작업에 사용됩니다.
    // 추상 메서드는 accept()
    Consumer<String> testConsumer = value -> System.out.println(value + "을 받았습니다.");
    testConsumer.accept("Consumer에 건내줄 String 값");

    // Function 생성
    // Function<T,R>은 입력값(T)이 있고 반환값(R)이 있음
    // 데이터를 받아서 가공, 변환 , 추출 계산 하는 작업에 사용
    // 추상 메서드는 apply(T t)
    Function<String, Integer> testFunction = value -> value.length();
    Integer num = testFunction.apply("Function에 넘길 글자 수");
    System.out.println("넘겨 받은 글자 수는 " + num + "입니다.");

    // Predicate 생성
    // Predicate<T>는 입력값(T)이 있고 반환값은 boolean입니다.
    // 데이터를 받아서 조건을 판별하는 작업에 사용합니다.
    // T는 검사할 데이터의 타입입니다.
    // 추상 메서드는 test(T t)입니다.
    Predicate<Integer> positivePredicate = testNum -> testNum > 0;

    boolean result1 = positivePredicate.test(10);
    boolean result2 = positivePredicate.test(-1);

    System.out.println("10은 양수인가요? " + result1);
    System.out.println("-1은 양수인가요? " + result2);

  }

}
