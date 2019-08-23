public class MultiArray {
    public static void main(String[] args) {

        int[][] multiArray = new int[3][3];
        /*
        for (int i = 0; i < multiArray[0].length; i++) {
            multiArray[0][i] = 1 + i;
        }

        for (int i = 0; i < multiArray[1].length; i++) {
            multiArray[1][i] = 5 + i;
        }

        for (int i = 0; i < multiArray[2].length; i++) {
            multiArray[2][i] = 9 + i;
        }

        for (int i = 0; i < multiArray.length; i++){
            for (int j = 0; j < multiArray.length; j++) {
                System.out.print(multiArray[i][j]);
            }
            System.out.println();
        }
        */
        for (int i = 0; i < multiArray.length; i++) {
            for (int j = 0; j < multiArray.length; j++) {
                multiArray[i][j] = (i * 3 + j + 1);
                System.out.print(multiArray[i][j]);
            }

            System.out.println();
        }
    }
}