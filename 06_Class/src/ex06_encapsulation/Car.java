package ex06_encapsulation;

public class Car {
  // 필드 선언
  // 접근 제한 선언(클래스내에서만) private
  private String model;
  private int price;
  
  // 메서드 정의(만들기)

  // 인자 받아서 필드에 저장하기 :Setter
  public void setModel(String model) {
    this.model = model;
  }

  public void setPrice(int price) {
    this.price = price;
  }

  // 필드에 저장된 값 반환하는 메서드 : Getter
  public String getModel() {
    return model;
  }

  public int getPrice() {
    return price;
  }

}
