// 클래스를 새로 만들어서 새로만든 클래스에 변수를 선언 및 초기화 하고
// 원래 있던 클래스에서 새로만든 클래스 안에 변수값을 불러와보자
public class _20_Class {
    public static void main(String[] args) {
        int[] arr = new int[3];
//        설계도 a설계도 = new 설계도();
//        a설계도.no = 1;
//        a설계도.age = 1;
//        a설계도.height = 1;

        자동차차 a자동차차;
        a자동차차= new 자동차차();
        System.out.println(a자동차차.a);
        System.out.println(a자동차차.b);
        System.out.println(a자동차차.f);


        자동차차 테슬라;
        테슬라 = new 자동차차();
        System.out.println("테슬라 모델" + 테슬라.f);

        자동차차 벤츠;
        벤츠 = new 자동차차();
        System.out.println(벤츠.b);
        벤츠.달린다();

    }
}
class 자동차차 {
    int a = 2;
    boolean b = a < 3;
    float f = 3.14f;

    class 테슬라 {
        int t = 3;
    }

    class 벤츠 {
        String b = "벤츠 마이바흐";
    }
    void 달린다 () {
        System.out.println("달립니다.");
    }
}


