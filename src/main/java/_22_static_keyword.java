// static을 이용해서 전역변수처럼 값을 가져와서 인류평균나이를 계산해보자.
public class _22_static_keyword {
    public static void main(String[] args) {
        Person aPerson = new Person();
        aPerson.나이 = 100;
        aPerson.인류평균나이 += 100;
        aPerson.이름 = "박명수";

        Person bPerson = new Person();
        bPerson.나이 = 200;
        bPerson.인류평균나이 += 200;
        bPerson.이름 = "하하";

        Person cPerson = new Person();
        cPerson.나이 = 300;
        cPerson.인류평균나이 += 300;
        cPerson.이름 = "정준하";

        aPerson.자기소개();
        bPerson.자기소개();
        cPerson.자기소개();

        Person.인류평균나이();
    }
}
class Person {
    int 나이;
    String 이름;
    static int 인류평균나이;

    void 자기소개 () {
        System.out.println("저는 " + this.이름 + "이고 제 나이는 " + this.나이 + "살 입니다.");
    }
    static void 인류평균나이 () {
        System.out.println("인류 평균나이는 " + 인류평균나이 / 3 + "살 입니다.");
    }
}