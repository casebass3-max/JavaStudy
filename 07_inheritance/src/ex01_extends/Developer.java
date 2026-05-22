package ex01_extends;

//개발자는 사람이다.
//개발자는 사람을 상속 받을 수 있다.

//Person을 상속 받은 Developer
//Developer는 Person의 멤버를 내것처럼 다룰수 있다.

//부모 Person (상위 : super)
//자식 developer (하위 : sub)

//부모가 먼저 태어나야 자식이 태어날수있다.
//자식 생성자는 부모생성자를 호출해야한다.

//super() : 부모생성자 호출
public class Developer extends Person {

  private String skill;

  public Developer(String name,String skill){
    super(name);
    this.skill = skill; 
  }

  public void develop() {
    System.out.println("개발하기");
  }

}
