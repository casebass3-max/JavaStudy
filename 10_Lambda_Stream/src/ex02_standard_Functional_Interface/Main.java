package ex02_standard_Functional_Interface;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

//매개변수가 함수형 인터페이스인 경우 : 람다식을 전달합니다.

public class Main {
  public static void main(String[] args) {

    // Consumer<> 사용
    executeConsumer("김뿡빵", name -> System.out.println(name + " 입니다."));
    // Supplier<> 사용
    executeSupplier(() -> "Hello");
    // Function<> 사용
    executeFunction("홍길동", name -> name.length()); 
    // Predicate<> 사용
    executePredicate(1, num -> num > 0);
    executePredicate(-10, num -> num > 0);
  }

  // Predicate<t> : 조건을 판별함
  // 메서드 test(T t)
  // 반환 타입 boolean
  /**
   * 
   * @param param     람다식에 전달할 값
   * @param predicate 값을 받아서 체크한 뒤 boolean을 반환하는 함수(람다식)
   */
  public static void executePredicate(Integer param, Predicate<Integer> predicate) {
    if (predicate.test(param)) {
      System.out.println(param + "은 양수 입니다.");
    } else {
      System.out.println(param + "은 음수 입니다.");
    }
  }

  // Function<T, R> T를 받아서 R로 변환
  /**
   * 
   * @param param    람다식에 전달할 값
   * @param function 값(param)을 받아서 가공하여 반환하는 함수(람다식)
   */
  public static void executeFunction(String param, Function<String, Integer> function) {
    Integer result = function.apply(param);
    System.out.println("Function 결과 : " + result);

  }

  // Supplier<> 데이터를 공급함
  // 메서드는 get()
  /**
   * 
   * @param supplier 값을 반환하는 함수(람다식)
   */
  public static void executeSupplier(Supplier<String> supplier) {
    String result = supplier.get();
    System.out.println("Supplier 결과 : " + result);
  }

  // Consumer<> 데이터를 소비함(출력등)
  // 메서드는 accept(T t)
  /**
   * 
   * @param param    람다식에 전달 할 값
   * @param consumer 값(param)을 받아서 사용하는 함수(람다식)
   */
  public static void executeConsumer(String param, Consumer<String> consumer) {
    consumer.accept(param);
  }

}
