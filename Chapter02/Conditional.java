public class Conditional {
    public static void main(String[] args) {
//        int a = 38, b = 27;
//        int a = 15, b = 15;
        int a = 27, b= 38;
        // 여기에 코드를 작성하세요.
        if (a == b) {
            System.out.println("a 와 b가 같습니다. a = b = " + a);
        } else {
            System.out.println("a와 b는 같지 않습니다.");

            if (a > b) {
                System.out.println("a가 b보다 " + (a - b) + "만큼 더 큽니다.");
            } else {
                System.out.println("b가 a보다 " + (b - a) + "만큼 더 큽니다.");
            }

        }
    }
}