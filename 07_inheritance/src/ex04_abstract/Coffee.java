package ex04_abstract;
// 추상 클래스
// 하나 이상의 추상 메서드를 포함한다면 추상클래스로 변경
// 미완성 상태


abstract class Coffee {//2. 클래스에도 abstract로 만들어 추상 클래스로 변환
  private String coffeeBean;

  public Coffee(String coffeeBean) {
    this.coffeeBean = coffeeBean;
  }
  
  // 형태가 없는 추상 메서드
  // 추상 메서드란 선언부만 있고 구현부{}가 없는 메서드
  // 자식 클래스에게 이 메서드는 너의 상황에 맞게 반드시 오버라이딩을 해야한다는 강제성을 부여하기 위함.
  abstract void taste();//1. abstract를 사용하여 추상 메서드를 만듬

  // 커피 정보 출력 메서드
  public void info() {
    System.out.println("원산지 : " + coffeeBean);
  }

}
