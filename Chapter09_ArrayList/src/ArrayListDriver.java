import java.util.ArrayList;

public class ArrayListDriver {
    public static void main(String[] args) {
        ArrayList <String> nameList = new ArrayList<>();

        nameList.add("이민진");
        nameList.add("이민진");
        nameList.add("이민진");
        nameList.add("이민진");
        nameList.add("이민진");
        nameList.add("이민진");
        nameList.add("이민진");

//        nameList.remove(0);

        for (String name: nameList) {
            System.out.println(name);
        }

    }
}
