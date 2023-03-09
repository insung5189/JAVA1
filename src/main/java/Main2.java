public class Main2 {
    public static void main(String[] args) {
        System.out.println("안녕하세요");
        System.out.println("안녕하세요");
        System.out.println("안녕하세요");
        System.out.println("안녕하세요");
        System.out.println("안녕하세요");
        System.out.println("안녕하세요");
        System.out.println("안녕하세요");
        System.out.println("안녕하세요");
        System.out.println("안녕하세요");
        System.out.println("안녕하세요");
        System.out.println("Hello world!\nHello world!\nHello world!\nHello world!\nHello world!\nHello world!");
        int e = 5;
        e = e + 10;
        System.out.println(e);

//     a와 b에 각각 값을 할당하고 서로 그 값이 바뀌게 하는 코드를 짜시오
        int a = 5;
        int b = 10;
        int c;
        c = a;
        a = b;
        b = c;
        System.out.println(a);
        System.out.println(b);
        System.out.println("-----");

//     문자열과 정수값의 차이 및 출력
        int x = 10;
        System.out.println(x);
        System.out.println("x");
        System.out.println("x" + x);
        System.out.println(x + 10);
        System.out.println("x: " + x * 10);
        System.out.println("x: " + x / 2);
        System.out.println("x: " + (x - 10));
        System.out.println("--------");

//        사칙연산
        int i = 2;
        System.out.println(i + 2);
        System.out.println(i - 2);
        System.out.println(i * 2);
        System.out.println(i / 2);
        System.out.println(i % 2);
        System.out.println("-----");


        int age = 50;
        System.out.println("당신의 나이 : " + age);

        if (age >= 20) {
            System.out.println("성인 입니다.");
        } else {
            System.out.println("미성년자 입니다.");
        }

        if (age >= 20 && age <= 34) {
            System.out.println("청년 입니다.");
        } else {
            System.out.println("청년이 아닙니다.");
        }

    }

}