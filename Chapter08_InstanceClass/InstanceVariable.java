public class InstanceVariable {
    int count;

    public static void main(String[] args) {

        InstanceVariable v1 = new InstanceVariable();
        v1.count++;

        InstanceVariable v2 = new InstanceVariable();
        v1.count++;
        v2.count = v1.count;

        InstanceVariable v3 = new InstanceVariable();
        v1.count++;
        v2.count++;
        v3.count = v2.count;

        InstanceVariable v4 = new InstanceVariable();
        v1.count++;
        v2.count++;
        v3.count++;
        v4.count = v3.count;

        System.out.println(v1.count);
        System.out.println(v2.count);
        System.out.println(v3.count);
        System.out.println(v4.count);
    }
}