import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Main {
    public static void main(String[] args) {
        // 생성자
        Calculator cal = new Calculator();
        cal.setTitle("Calculator");

        // 윈도우 종료 이벤트
        cal.addWindowListener(
                new WindowAdapter() {
                    @Override
                    public void windowClosing(WindowEvent e) {
                        super.windowClosing(e);
                    }
                }
        );

        // 컨테이너에 알맞은 크기로 배치
        cal.pack();

        // 화면에 배치
        cal.setVisible(true);

        // 사이즈
        cal.setSize(300,430);

        // 사이즈 조정 불가
        cal.setResizable(false);
    }
}