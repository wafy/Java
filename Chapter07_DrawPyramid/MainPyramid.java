public class MainPyramid {
    public static void main(String[] args) {
        PyramidPrinter printer = new PyramidPrinter();

        // 테스트
        printer.printPyramid(3);
        System.out.println("----------");
        printer.printPyramid(5);
        System.out.println("----------");
        printer.printPyramid(10);

    }
}