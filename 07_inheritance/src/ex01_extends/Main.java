package ex01_extends;

public class Main {
  public static void main(String[] args) {
    // 부모 클래스가 총 2개 Person -> Developer
    WebDeveloper webDev = new WebDeveloper("롤ㄹ랄ㄹ", "ㄹ라롤랄");
    webDev.develop();
    webDev.eat();
    webDev.webDevelop();

    Person per = new Person("ㄹ라라리");
    per.eat();
  }
}
