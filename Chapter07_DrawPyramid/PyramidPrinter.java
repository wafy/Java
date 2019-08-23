public class PyramidPrinter {
    public void printPyramid(int height) {

        for (int i = 1; i <= height; i++) {
//            공백추가
            for (int j = height - i; j > 0; j--) {
                System.out.print(" ");
            }

            for (int k = 1; k <= (i * 2 - 1); k++) {
                System.out.print("*");
            }

            System.out.println();
        }

    }
}
