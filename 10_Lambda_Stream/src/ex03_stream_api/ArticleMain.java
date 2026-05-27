package ex03_stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ArticleMain {

  public static void main(String[] args) {
    // 원본 리스트 생성
    List<Article> articles = Arrays.asList(
        new Article("오늘날씨", 230),
        new Article("이란전쟁", 240),
        new Article("철근", 28),
        new Article("스타벅스", 220),
        new Article("코스피", 290));

    // Stream API를 활용하여 조회수 100이상인 제목을 list에 저장하시오
    List<String> titles = articles.stream().filter(article -> article.getViewConut() > 100)
        .map(article -> article.getTitle())
        .collect(Collectors.toList());

    System.out.println(titles);
  }

}
