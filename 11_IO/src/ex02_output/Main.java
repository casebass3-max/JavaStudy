package ex02_output;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Main {
  public static void main(String[] args) {

    // file 객체 (우리가 만드려는 대상)
    File dir = new File("/Users/eongdeong-ihaejeogdan/Downloads/SaSAC_AWS/storage");

    if (!dir.exists()) {// 존재하지 않으면
      dir.mkdirs();// 폴더 생성
    }
    // 위 루트에 생성될 txt 파일
    File file = new File(dir, "test01.txt");

    // 파일로 데이터를 보내는 스트림(출력 스트림 == 데이터를 내보내는 통로)
    // try()안에 생성을 하면 자동으로 close()를 해줍니다.
    // 성능이 좋지 않아 FileOutputStream -> BufferedOutputStream로 버퍼로 한번에 내보냄
    // 보조 스트림을 중첩하여 사용 (데코레이터 패턴)
    // BufferedInputStream bis = new BufferedInputStream(
    // new FileInputStream("video.mp4"));
    // BufferedOutputStream bos = new BufferedOutputStream(
    // new FileOutputStream("video_copy.mp4"));
    try (BufferedOutputStream fos = new BufferedOutputStream(new FileOutputStream(file, true))) {
      // 실제로 데이터 내보내기(int,byte[])
      int c = 'A';
      byte[] b = "pple".getBytes();
      fos.write(c);
      fos.write(b);
    } catch (Exception e) {
      System.err.println(e.getMessage());
    }

  }
}
