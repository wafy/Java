import java.util.ArrayList;

public class KingDriver {
    public static int getSurvivingIndex(int n, int k) {
        // 코드를 입력하세요.
        ArrayList<Integer> numArray = new ArrayList<>();
        int killIndex = 0;

        for (int i = 1; i <= n; i++) {
            numArray.add(i);
        }

        while (numArray.size() != 1) {
            /*
                killIndex += k - 1;
                if (numArray.size() <= killIndex) {
                    killIndex = killIndex % numArray.size();
                }

            */
            System.out.println(killIndex);
            System.out.println(numArray.size());

            killIndex = (killIndex + k - 1) % numArray.size();

            System.out.println(numArray.remove(killIndex) + "번 군사가 죽습니다. ");
            System.out.println(numArray);
            System.out.println();

        }

        return numArray.get(0);

    }
    public static void main (String[] args){
        System.out.println("김신은 " + getSurvivingIndex(20, 5) + "번 자리에 서있으면 됩니다.");
    }
}