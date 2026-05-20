public class TestEX {
  public static void main(String[] args) {

    // 6. 정수 변수 num에 저장된 값이 짝수라면 isEven 변수에 true를 아니면 false를 저장하세요.
    int num = 4;
    boolean isEven = (num % 2 == 0);
    System.out.println(isEven);
    // 7. 세 개의 정수 변수 a, b, c에 저장된 값 중 가장 큰 수를 max 변수에 저장하세요.
    int a = 1;
    int b = 2;
    int c = 3;

    int max = (a > b) && (a > c) ? a : (b > c) ? b : c;
    // 8. 정수 변수 month에 저장된 값이 3~5이면 "봄", 6~8이면 "여름", 9~11이면 "가을" 12,1,2이면 "겨울"을
    // season 변수에 저장하세요.
    int month = 2;
    int mod = month % 12;
    String season = mod <= 2 ? "겨울" : mod <= 5 ? "봄" : mod <= 8 ? "여름" : "가을";

    // 9. 정수 변수 data를 0으로 비트 마스킹(Bit Masking)하는 코드를 작성해 보세요.
    int data = 255;
    int mask = 0;
    data = data & mask;

    // 10. 정수 변수 data에 255를 저장합니다. data는 2진수로 11111111입니다. 이 때 하위 4개 비트만 남기려면(결과
    // 00001111) 변수 mask 값은 얼마여야 하는지 생각해 보고 코드를 작성해 보세요.
    int data2 = 255;
    int mask2 = 15;
    data2 = data2 & mask2;

  }
}
