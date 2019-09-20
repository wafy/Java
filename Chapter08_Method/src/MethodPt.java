/*

public class MethodPt {


    int num;

    public static void main(String[] args) {

        MethodPt m1 = new MethodPt();
        m1.num++;

        MethodPt m2 = new MethodPt();
        m1.num++;

        MethodPt m3 = new MethodPt();
        m1.num++;

        MethodPt m4 = new MethodPt();
        m1.num++;

        System.out.println(m1.num);
    }
}

*/


/*
public class MethodPt {

    static int num;

    public static void main(String[] args) {
        MethodPt.num++;
        MethodPt.num++;
        MethodPt.num++;

        System.out.println(MethodPt.num);
    }
}

*/

public class MethodPt {

    static int num;

    public MethodPt() {
        num++;
    }

    public static void main(String[] args) {
        MethodPt m1 = new MethodPt();
        MethodPt m2 = new MethodPt();
        MethodPt m3 = new MethodPt();
        MethodPt m4 = new MethodPt();
        MethodPt m5 = new MethodPt();

        System.out.println(MethodPt.num);
    }
}