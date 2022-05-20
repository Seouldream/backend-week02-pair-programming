//1.변수 a,b 입력
//2. b/a   b= a* (int)b/a
//3.  b = 몫*a + 나머지     몫*a = ***  1번 = 몫  2번 ***의 제일 앞자리수 곱하기 a 곱하기 10 , 3번 비 - 2번, 4번 **의 두번째 수 곱하기 에이, 5번 비 % 메이
//4 1번 + 2번 + 3번 + 4번 + 5번
//5 4,5번이 존재하지 않을 떄, 3번까지만 더한다는 조건식을 만든다.
//6. 반복문을 어떻게 쓸까 ?

import java.util.Scanner;
public class Division {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // input
        System.out.print("a: ");
        int a = scanner.nextInt();

        System.out.print("B: ");
        int b = scanner.nextInt();

        // process
        int result1 = b / a;
        int quotient_1st_digit= (int)(b / a / 10);
        int result2 = quotient_1st_digit * a * 10;
        int result3 = b - result2;
        int quotien_2nd_digit = (b / a) % 10);
        int result4 =  quotien_2nd_digit * a;
        int result5 = b % a;

        ()
            //while  340 - a 를 *first dit*10 = 값 < 8


    }
}
