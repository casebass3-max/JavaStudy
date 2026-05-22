package ex03_polymophism;

public class Coffee {
  private String coffeeBean;

  public Coffee(String coffeeBean) {
    this.coffeeBean = coffeeBean;
  }

  // 자식 객체들이 호출 할수 있도록 taste 메서드를 추가해 둡니다.
  public void taste() {
  }

  // 커피 정보 출력 메서드
  public void info() {
    System.out.println("원산지 : " + coffeeBean);
  }

}
