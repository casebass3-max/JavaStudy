import java.util.Arrays;
import java.util.Scanner;

public class ArrayEx {
    public static void main(String[] args) throws Exception {
        // 배열 : 여러 변수를 하나의 이름으로 관리
        // int a,b,c;
        // int[] arr;

        // 배열 선언
        String[] blackPink;

        // new 실습 (동적할당))
        // Scanner sc = new Scanner(System.in);
        // System.out.println("4를 입력하시오.");
        // int a = sc.nextInt();
        blackPink = new String[4];

        // 배열 요소 (Element: 각 변수를 의미)
        blackPink[0] = "제니";
        blackPink[1] = "지수";
        blackPink[2] = "로제";
        blackPink[3] = "리사";

        // 출력 (배열 순회)
        for (int i = 0; i < blackPink.length; i++) {
            System.out.println(blackPink[i]);
        }
        // 배열 길이
        System.out.println(blackPink.length);

        // 정적 초기화 (배열 선언 시에만 가능한 초기화)
        String[] seasons = { "봄", "여름", "가을", "겨울" };
        // 배열용 포문(향상된 포문)
        for (String season : seasons) {
            System.out.println(season);
        }

        /*
         * seasons 배열의 요소를 하나씩 꺼내서
         * season 변수에 저장하고
         * 반복 실행
         */

        // 동적 초기화 (배열 선언과 분리가 가능한 초기화)
        String[] hobbies;
        // new = 메모리 할당
        // 실행 중에 실행하는 동적 할당
        // 동적 할당 heap 영역
        // 동적 할당이 끝나면 자바는 자동으로 메모리가 삭제함

        hobbies = new String[] { "낮잠", "밤잠", "이른잠", "늦잠" };

        // 배열의 길이는 수정이 불가
        // 배열의 길이를 늘리는 방법 : 새 배열을 만들어서 이사하기
        String[] names = { "김철수", "홍길동" };
        // 새 배열을 생성
        String[] newArray = new String[5];
        // System.arraycopy를 이용한 옮기기
        // 이동할 배열 ,
        System.arraycopy(names, 0, newArray, 0, names.length);
        // newArray를 다시 names 이름 변경
        names = newArray;
        // for문 없이 toString으로 확인
        System.out.println(Arrays.toString(names));
        // 1. 다음 정수형 배열에 저장된 모든 요소의 합계와 평균을 출력하세요.
        // int[] numbers = { 4, 7, 9, 12, 17, 19, 24, 28, 30 };
        // int sum = 0;
        // double num = 0L;
        // for (int i = 0; i < numbers.length; i++) {
        // sum += numbers[i];

        // }
        // num = (double) sum / numbers.length;
        // System.out.println("1번 답 = " + num);

        // 2. 다음 정수형 배열에 저장된 모든 요소 중 최대값과 최소값을 출력하세요.
        // int[] numbers = { 42, 17, 93, 120, 117, 59, 24, 28, 39 };
        // int max = numbers[0];
        // int min = numbers[0];
        // for (int num : numbers) {
        // if (max < num) {
        // max = num;
        // }
        // if (min > num) {
        // min = num;
        // }
        // }
        // System.out.println("max값 : " + max + "min값 :" + min);

        // 3. 다음 배열의 길이를 4로 늘려서 "autumn", "winter"를 저장하세요.
        // 방식 1 java.util.Arrays.copyOf 사용 (배열 ,설정할 길이)
        String[] seasons1 = { "autumn", "winter" };
        seasons1 = java.util.Arrays.copyOf(seasons1, 4);
        // 방식 2 새 배열을 만들고 복사 System.arraycopy() 사용
        String[] newArray2 = new String[4];
        // 원본 배열 / 시작할 인덱스 / 복사할 배열 / 시작할 인덱스 / 복사할 개수
        System.arraycopy(seasons1, 0, newArray2, 0, 2);
        // 이전 작업이 완료 될 시 이름 변경
        newArray2 = seasons1;
        // 4. 다음 정수형 배열의 모든 요소들의 저장 순서를 뒤집으세요.
        int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8 };
        // 반복문을 사용하여 앞 순서 인덱스 값과 뒷순서 인덱스 값을 교환
        for (int i = 0; i < numbers.length / 2; i++) {// 절반만 교환하면 되니 length의 절반만 반복
            int temp = numbers[i];// 앞자리의 인덱스의 값을 temp에 저장
            // -i를 하면 length는 인덱스와 다르게 1이 크니 1을 더해줌
            numbers[i] = numbers[numbers.length - 1 - i];
            // 마지막 인덱스의 값을 현재 인덱스의 값으로 덮어씌움
            numbers[numbers.length - 1 - i] = temp;
        }
        // 5. 다음 정수형 배열이 오름차순으로 정렬되어 있으면 true, 아니면 false를 boolean result 변수에 저장하세요.
        // int[] numbers2 = { 1, 2, 3, 4, 5, 0 };
        // boolean result = true;
        // int num = 0;
        // int temp = 0;
        // for (int i = 1; i < numbers2.length; i++) {
        // 내가 생각하는 기본적인 방식
        // num = numbers2[i - 1];
        // temp = numbers2[i];
        // if (num > temp) {
        // result = false;
        // break;
        // }
        // 깔끔한 삼항연산자 방식
        // 만약 앞 인덱스 숫자가 뒷 인덱스 숫자보다 높다면 false 반환
        // result = numbers2[i-1] > numbers2[i] ? false : result;
        // gpt 추천 패턴(실무방식?)
        // 기본으로는 true로 되지만 만약 앞 숫자가 뒷 숫자보다 작다면 false 반환
        // result = result && (numbers2[i-1] > numbers2[i]);
        // }

        // 6. uppers 배열에는 대문자를 순서대로 저장하고, lowers 배열에는 소문자를 순서대로 저장하세요.
        // 배열의 타입은 char[]로 처리하세요.
        // 영문자는 26개라서 26개의 배열을 만듬
        // char[] uppers = new char[26];
        // char[] lowers = new char[26];
        // int num2 = 65;// 대문자 A +1이 될수록 B.C....
        // int num3 = 97;// 소문자 a
        // for (int i = 0; i < uppers.length; i++) {
        // uppers[i] = (char) (num2 + i);
        // lowers[i] = (char) (num3 + i);
        // }
        // 정답으로 나온 리터럴 방식
        // for (int i = 0; i < uppers.length; i++) {
        //     uppers[i] = (char) ('A' + i);
        //     lowers[i] = (char) ('a' + i);
        // }
        // 7. 10진수(number)를 2진수로 변환한 결과를 int[] binary에 저장하세요.
        
    }
}
