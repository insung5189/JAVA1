public class _12_while_for_100to1 {
    public static void main(String[] args) {
        // 100부터 1까지 감소
        int i = 100;
        while (i >= 1) {
            System.out.println(i);
            i--;
        }
        for (int e = 100; e >= 1; e--) {
            System.out.println(e);
        }
    }
    /*
    * 출력
    * 100
    * 99
    * 98
    * ...
    * 1*/
}