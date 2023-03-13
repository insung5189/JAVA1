public class _22_class_car_speed {
    public static void main(String[] args) {
        // 클래스로 자동차를 만들어서 각 자동차 별로 자동차 최대 속력은 몇 입니다. 라고 출력하기
        자동차 벤츠;
        벤츠 = new 자동차();
        벤츠.자동차이름 = "벤츠";
        벤츠.최대속력 = 240;

        자동차 BMW;
        BMW = new 자동차();
        BMW.자동차이름 = "BMW";
        BMW.최대속력 = 300;


        벤츠.속력();
        BMW.속력();

    }
}
class 자동차 {
    int 최대속력;
    String 자동차이름;
    void 속력 () {
        System.out.println(자동차이름 + "의 최대 속력은 " + 최대속력 + "km/h 입니다.");
    }
        }