import java.util.Scanner;

public class MainIntroduce {
    public static void main(String[] args) {
        boolean mainMenu = true;
        Scanner scanner = new Scanner(System.in);

        while(mainMenu) {

            System.out.println("(I)ntro (C)ourses (E)xit");
            String mainEnter = scanner.next();


            switch (mainEnter) {
                case "I":
                case "i":
                    System.out.println("안녕하세요! 우리는 코드잇입니다.");
                    System.out.println("함께 공부합시다!");
                    break;

                case "C":
                case "c":
                    boolean courseMenu = true;
                    while (courseMenu) {
                        System.out.println("코드잇을 수업을 소개합니다.");
                        System.out.println("(P)ython (J)ava (i)OS (B)ack");
                        String subEnter = scanner.next();

                        switch (subEnter) {
                            case "P":
                            case "p":
                                System.out.println("Python 언어를 통해 컴퓨터 사이언스의 기초를 배웁니다.");
                                System.out.println("강사: 강영훈");
                                System.out.println("추천 선수과목 없음");
                                break;

                            case "J":
                            case "j":
                                System.out.println("Java의 기본 문법과 객체지향적 프로그래밍을 배웁니다.");
                                System.out.println("강사: 김신의");
                                System.out.println("추천 선수과목: Python");
                                break;

                            case "I":
                            case "i":
                                System.out.println("최신 Switf 언어를 통해 iOS 개발을 시작할 수 있습니다.");
                                System.out.println("강사: 성태호");
                                System.out.println("추천 선수과목: Python, Java");
                                break;

                            case "B":
                            case "b":
                                courseMenu = false;
                                break;
                        }
                    }
                    break;

                case "E":
                case "e":
                    System.out.println("안녕히 가세요.");
                    mainMenu = false;
                    break;
            }

        }

    }
}