public class CaculatorReturn {
    public static void main(String[] args) {
        // 매개변수를 이용해서 파라미터 입력해서 출력하는데 System.out.println(); 대신 return;으로 출력한 방법
        계산기2 a계산기= new 계산기2();
        System.out.println("a + b = " + a계산기.더하기2(1, 2));

    }
}
class 계산기2 {
    int 더하기2 (int a, int b) {
        int result = a + b;
        return result;
    }
}