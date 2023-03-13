public class CaculatorSum {
    public static void main(String[] args) {
        int b = 1;
        계산기2 b계산기 = new 계산기2();
        System.out.println(b계산기.합산(3));
        // 1부터 n까지 합산 값을 출력
    }
}
class 계산기2 {
    int sum;
    void 합산(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(i);
            sum++;
        }
        return sum;
    }
}