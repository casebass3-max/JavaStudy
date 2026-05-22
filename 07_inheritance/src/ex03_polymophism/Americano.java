package ex03_polymophism;

public class Americano extends Espresso {
  public Americano(String coffeeBean) {
    super(coffeeBean);
  }
  
  @Override
  public void taste() {
    System.out.println("맛있네");
  }
  
}
