public class ShapePrinter {
    public void printTriangle(int height) {

        /*

        String star = "";

        for(int i = 0; i < height; i++) {
            star += "* ";
            System.out.println(star);
        }

        */

        for(int i = 0; i < height; i++) {
            for(int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }


    }
}