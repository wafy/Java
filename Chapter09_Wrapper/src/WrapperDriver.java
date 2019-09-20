public class WrapperDriver {

    public static void main(String[] args) {

        Integer i = new Integer(123);

        System.out.println(123 == 123);

        System.out.println(new Integer(123) == new Integer(123));

        System.out.println(new Integer(123).equals(new Integer(123)));
    }


}