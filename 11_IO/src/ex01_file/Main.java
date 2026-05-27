package ex01_file;

import java.io.File;
import java.util.Arrays;
import java.util.stream.Stream;

public class Main {
  public static void main(String[] args) {
    // 자바 홈을 File 객체로 생성하기
    File javaHome = new File("/Users/eongdeong-ihaejeogdan/Downloads/SaSAC_AWS");

    // 기본 정보 확인
    System.out.println("이름 : " + javaHome.getName());
    System.out.println("절대 경로 : " + javaHome.getAbsolutePath());
    System.out.println("상대 경로 : " + javaHome.getPath());
    System.out.println(javaHome.isDirectory() ? "디렉토리" : "파일");
    System.out.println("크기 : " + javaHome.length() + "Byte");
    System.out.println("최종 수정일 : " + javaHome.lastModified());// 에포크 타임 정보

    // 하위 디렉터리/파일 객체를 가져오기
    System.out.println("하위 디렉터리/파일 객체를 가져오기");
    File[] files = javaHome.listFiles();
    Arrays.stream(files)
        .filter(flie -> flie.isFile())
        .forEach(flie -> {
          System.out.println(flie.getName());
          System.out.println(flie.length());
        });

    // 디렉터리 조작(생성 / 삭제)
    File dir = new File("/Users/eongdeong-ihaejeogdan/Downloads/SaSAC_AWS/JavaStudy/io_test");
    if (dir.exists()) {
      System.out.println(dir.getAbsolutePath() + "존재합니다.");
      dir.delete();// 폴더 삭제 (단 비어있는 디렉토리만 삭제 가능)
      System.out.println(dir.getAbsolutePath() + "를 삭제합니다.");

    } else {
      dir.mkdirs();// 폴더 만들기(하위 폴더까지 만듬)
      System.out.println(dir.getAbsolutePath() + "가 생성 되었습니다.");
    }

  }
}
