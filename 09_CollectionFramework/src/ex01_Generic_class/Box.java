package ex01_Generic_class;

// 제네릭 클래스
// 정해지지 않은 타입 T를 사용 <- 객체 생성 시점에 정해짐(구체화)
public class Box<T> { // 문법상으론 정해진게 없지만 최대 2개정도
  // 필드
  private T content;

  public T getContent() {
    return content;
  }

  public void setContent(T content) {
    this.content = content;
  }

}
