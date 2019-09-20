import java.util.Random;

public class MathDriver {
    public static void main(String[] args) {
        System.out.println(Math.min(4, 10));
        System.out.println(Math.max(4, 10));
        System.out.println(Math.abs(-4));

        Random random = new Random();
        System.out.println(random.nextInt(10));
        int min = 10;
        int max = 30;

        System.out.println(random.nextInt(21) + 10 );
    }

}