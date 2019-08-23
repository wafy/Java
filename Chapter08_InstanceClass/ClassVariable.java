public class ClassVariable {

    static int count;

    public static void main(String[] args) {

        ClassVariable v1 = new ClassVariable();
        ClassVariable.count++;

        ClassVariable v2 = new ClassVariable();
        ClassVariable.count++;

        ClassVariable v3 = new ClassVariable();
        ClassVariable.count++;

        ClassVariable v4 = new ClassVariable();
        ClassVariable.count++;

        System.out.println(ClassVariable.count);
    }

}