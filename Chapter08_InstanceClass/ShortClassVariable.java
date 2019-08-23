public class ShortClassVariable {
    static int count;

    public ShortClassVariable() {
        count++;
    }

    public static void main(String[] args) {
        ShortClassVariable v1 = new ShortClassVariable();
        ShortClassVariable v2 = new ShortClassVariable();
        ShortClassVariable v3 = new ShortClassVariable();
        ShortClassVariable v4 = new ShortClassVariable();

        System.out.println(ShortClassVariable.count);
    }
}