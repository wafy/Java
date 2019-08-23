public class ArrayPt {
    public static void main (String[] args) {
        int[] intArray = new int[30];
        int num = 1001;
        String[] remainders = {"Zero", "One", "Two", "Three"};

        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = num;
            num++;
        }

        for (int j : intArray) {
            System.out.println(remainders[j % 4]);
        }

    }
}
/*
public class ArrayPt {
    public static void main(String[] args) {

        int [] intArray = new int[30];
        int j = 1001;
        String [] remainders = new String[4];

        remainders[0] = "Zero";
        remainders[1] = "One";
        remainders[2] = "Two";
        remainders[3] = "Three";

        //배열에 값 넣기 1001 ~ 1030
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = j;
            j++;
        }

        //for-each를 써서 출력
        for (int value : intArray) {
            System.out.println(remainders[value % 4]);
        }

    }
}
*/
