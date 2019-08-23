public class FloydPrinter {
    public void printFloydsPyramid(int height) {

        int length = String.valueOf(height * (height + 1) / 2).length();
        int num = 1;

        /*
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= i; j++) {
                String line = "";
                line += num;
                int space = length - line.length();

                for (int k = 0; k < space; k++) {
                    System.out.print(" ");
                }
                System.out.print(line + " ");
                num++;
            }
            System.out.println();
        }
        */

        for (int i = 1; i <= height; i++) {
            String line = "";

            for (int j = 1; j <= i; j++) {

                for (int k = String.valueOf(num).length(); k < length; k++) {
                    line += " ";
                }

                line += num + " ";
                num++;
            }

            System.out.println(line);
        }

    }
}
