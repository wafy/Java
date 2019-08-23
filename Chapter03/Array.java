
public class Array {
    public static void main(String[] args) {
        int[] list = new int [5];

        list[0] = 1;
        list[1] = 3;
        list[2] = 5;
        list[3] = 7;
        list[4] = 9;
        for (int i  : list) {
            System.out.println(i);

        }
        /*
        System.out.println(list[2] + list[3]);

        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]);
        }

        */

        /*
        int[] iist = new int[100];

        for (int i = 0; i < list.length; i++) {
            list[i] = i + 1;
            System.out.println(list[i]);

        }
        */

    }
}
