public class WhilePt {
    public static void main(String[] args) {
        int num = 10000;
        int key = 153;
        // 10000 미만 정수 중에서, 153의 배수 중 가장 큰 값을 찾아 출력하세요. = 9945
        // 여기에 코드를 작성하세요.
        int i = 0;

        /*
        while (key * i < num) {
            i ++;
        }

        System.out.println(key *(i - 1));

        */

        while (num % key > 0) {
            num --;

        }

        System.out.println(num);


    }
}