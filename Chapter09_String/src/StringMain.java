public class StringMain {

    public static void main(String[] args) {
        char data[] = {'a', 'b', 'c'};

        String myString = new String(data);


        System.out.println(myString.toUpperCase());
        System.out.println(myString.toLowerCase());
        System.out.println(myString);
    }
}