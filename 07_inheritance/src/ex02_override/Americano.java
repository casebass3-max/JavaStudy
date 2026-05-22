package ex02_override;

public class Americano extends Espresso {
  public Americano(String coffeeBean) {
    super(coffeeBean);
  }
  // 부모가 가진 메서드를 자식이 사용할 수 없는 경우
  // 해당 메서드를 다시 만들면 된다.
  // 메서드 오버라이딩 ,메서드 재정의 라고 한다

  // 똑같이 만들 것(접근 제한자 제외)
  // 오버라이드 에너테이션 // @로 시작하는걸 애너테이션이라고 한다.
  @Override // 컴파일러에게 부모를 오버라이딩한거라고 알려주는 애너테이션( 항상 사용하는것이 관례 )
  public void taste() {
    System.out.println("맛있네");
  }
  // 대표적인 자바 오버라이딩
  // @Override
  // public String toString() {
  // return "학생 정보";
  // }

  
}
