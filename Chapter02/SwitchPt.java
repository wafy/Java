public class SwitchPt {
    public static void main(String[] args) {
        int number = 134354;
        // 여기에 코드를 작성하세요.

        switch (134354 % 7) {
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            case 4:
                System.out.println("Four");
                break;
            case 5:
                System.out.println("Five");
                break;
            case 6:
                System.out.println("Six");
                break;
            default:
                System.out.println("Zero");
                break;
        }

    }
}