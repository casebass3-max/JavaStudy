package ex03_input;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.stream.Stream;

public class Main {
  public static void main(String[] args) {

    // file 객체 (우리가 읽으려는 대상)
    File dir = new File("/Users/eongdeong-ihaejeogdan/Downloads/SaSAC_AWS/storage");
    // 위 루트에 생성된 txt 파일
    File file = new File(dir, "test01.txt");

    // 파일로 데이터를 받아들이는 스트림(입력 스트림 == 데이터를 받으려는 통로)
    try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file))) {
      // 어떤 단위로 읽을 것인지 결정 (int,byte[]) 바이트 배열을 권장
      // 네트워크는 스트림을 바이트가 표준이다.
      byte[] b = new byte[2];
      // 실제로 읽은 바이트 수
      int readByte = 0;
      // bis.read(b);// 반환 값은 읽은 글자수 다 읽고 한번더 마지막은 -1

      // 파일이 끝날때까지 읽기(파일이 끝나면 -1 반환)
      while ((readByte = bis.read(b)) != -1) {// 반복해야할 상황을 모를때 while을 사용
        // 실제로 읽은 바이트 수 만큼만 처리
        System.out.print(new String(b, 0, readByte));

      }

    } catch (Exception e) {
      System.err.println(e.getMessage());
    }

  }
}
