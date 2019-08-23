public class OverLoading {


    int add(int x, int y) {
        return x + y;
    }

    int add(int x, int y, int z) {
        return x + y + z;
    }

    double add(double x, double y) {
        return x + y;
    }

    /*
    public static int add(int x, int y) {
        return x + y;

    }
    */

    public static void main(String[] args) {

        OverLoading c = new OverLoading();

        System.out.println(c.add(1, 2));

        System.out.println(c.add(1, 2, 3));
        System.out.println(c.add(1.2, 3));


    }
}