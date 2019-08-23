public class MainFloyd {
    public static void main(String[] args) {
        FloydPrinter printer = new FloydPrinter();

        // 테스트
        printer.printFloydsPyramid(3);
        System.out.println("----------");
        printer.printFloydsPyramid(5);
         System.out.println("----------");
        printer.printFloydsPyramid(15);

    }
}