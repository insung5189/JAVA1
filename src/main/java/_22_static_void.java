public class _22_static_void {
    public static void main(String[] args) {
        캐릭터 이광수; // 클래스 이름
        이광수 = new 캐릭터();
        이광수.이름 = "이광수";
        이광수.나이 = 31;
        이광수.키 = 191;

        캐릭터 유재석;
        유재석 = new 캐릭터();
        유재석.이름 = "유재석";
        유재석.나이 = 42;
        유재석.키 = 178;


        캐릭터 지석진;
        지석진 = new 캐릭터();
        지석진.이름 = "지석진";
        지석진.나이 = 54;
        지석진.키 = 172;

        이광수.자기소개(); // void 출력
        유재석.자기소개(); // void 출력
        지석진.자기소개(); // void 출력


    }
}
class 캐릭터 {
    int 나이; // 나이 선언
    int 키; // 키 선언
    String 이름; // 이름 선언

    void 자기소개 () { // 리모컨 역할
        System.out.println("안녕하세요. 제 이름은 " + 이름 + "이고, 나이는 " + 나이 + "살 이고, 키는" + 키 + "입니다." );
//        System.out.println("제 이름은 " + this.이름 + "입니다." ); // 해당 객체데이터에 접근할 땐 this.을 사용함
    }
}