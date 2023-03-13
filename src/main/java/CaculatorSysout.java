public class CaculatorSysout {
    public static void main(String[] args) {
        /*
        * 계산기 설계도 만들거임
계산기 class 만들고
안에 사칙연산이 다들어가야됨
플러스 마이너스 나누기 곱하기

처음에는 두 개의 매개변수를 받아서 더해주는 함수를 만들고
클래스안에 함수를 매서드라고 함
받아서 값을 리턴하고
객채의 설게도대로 실체화해서 실행시켜야 한다.*/

        계산기 a계산기= new 계산기();
        a계산기.plus(2, 5);
        a계산기.minus(2, 5);
        a계산기.time(2, 5);
        a계산기.divide(2, 5);






    }
}

class 계산기 {
    void plus (int a, int b) {
        System.out.println("더하기 값 = " + (a + b));
    }
    void minus (int a, int b) {
        System.out.println("빼기 값 = " + (a - b));
    }
    void time (int a, int b) {
        System.out.println("곱하기 값 = " + (a * b));
    }
    void divide (int a, int b) {
        System.out.println("나누기 값 = " + (a / b));
    }

}