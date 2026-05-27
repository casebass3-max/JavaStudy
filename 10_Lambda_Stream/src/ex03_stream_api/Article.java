package ex03_stream_api;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

//lombok으로 보일러 플레이트 채우기(Constructor , get/setter , toString)
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Article {
  private String title;
  private int viewConut;
}
