public class _15_array {
    public static void main(String[] args) {
        int a = 50;
        int sum = 0;

        int[] arr1 = {1, 2, 3}; // 총 길이가 3인 배열

        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]); // 배열 arr1 표시하기
//            배열 i안에 있는 내용들을 전부 더하기
            sum += arr1[i]; // sum이라는 변수를 선언해서 초기화 하고 그 안에 +=으로 배열i를 증감시켜서 반복한다.
        }
        System.out.println(sum); // 6
        System.out.println(sum/arr1.length); // 2
        System.out.println(arr1.length); // 3
    }
}