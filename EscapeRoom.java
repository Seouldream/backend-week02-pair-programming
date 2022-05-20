// TODO list
// - 숫자 2개 인풋 메세지 넣기
// - 입력 변수 2개를 x, y 받기
// - 받은 변수 를 계산하는 식 출력 값 작성
// - 사용자 입력 답안 입력란 작성
// - 불린으로 참 거짓 판별 식 작성
// - 조건문으로 입력결과에 따라 메세지 출력
// - while 문 만들기 + count 값 성정 + 루프횟수 설정
// - escape 출력값 작성
// - 시험 구동
// count +1씩 더해주느느 연산을 작성
// 결과가 거짓알때 what 문구 출력 코드 입력
// - you are right 옆 정답 횟수 count 코드 입력   - 명훈   !- 승준

import java.util.Scanner;

public class EscapeRoom {
    public static void main(String[] args) {
        //0. 준비
        Scanner scanner = new Scanner(System.in);

        int count = 0;

        while (count < 3) {
            //1.입력
            System.out.print("Input 2 numbers: ");

            int number1 = scanner.nextInt();
            int number2 = scanner.nextInt();

            System.out.println(number1 + " + " + number2 + " = ? ");

            int answer = scanner.nextInt();

            //2.계산
            boolean result = answer == number1 + number2;

            if (result) {
                count += 1;
            }

            //3.결과
            if (result) {
                System.out.println("You`re right! (" + count + ")");
            }

            if (!result) {
                System.out.println("What?");
            }
        }
        //4.종료
        System.out.println("Escape!");
    }
}
