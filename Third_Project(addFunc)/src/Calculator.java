import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.*;

/*
   다중 연산은 되지 않음 ex. 2 + 3 * 5
 */

class Calculator extends JFrame implements ActionListener {
    private JTextField jt = new JTextField("");
    private String num2 = "";
    private double result;
    private Integer ceCount = 0;
    private String mTemp = "";
    private boolean setDivide = false;

    private Double mNumber = 0.0;


    Calculator() {
        Container c = this.getContentPane();

        JPanel fp1 = new JPanel();
        JPanel fp2 = new JPanel();
        JPanel p1 = new JPanel();
        JPanel p2 = new JPanel();
        JButton[] memoryBtn = new JButton[6];
        JButton[] btn = new JButton[24];

        // 색상 설정
        Color lightBlack = new Color(31, 31, 31);
        Color white = new Color(255, 255, 255);
        Color black = new Color(0, 0, 0);
        Color green = new Color(72, 115, 25);
        Color orange = new Color(255, 127, 39);

        // 폰트
        Font textFont = new Font("", Font.BOLD, 25);
        Font memoryFont = new Font("", Font.BOLD, 15);
        Font btnFont = new Font("", Font.BOLD, 17);

        // 테두리
        LineBorder b = new LineBorder(Color.BLACK, 1);

        // 입출력창
        jt.setOpaque(true);
        jt.setBackground(white);
        jt.setHorizontalAlignment(JTextField.RIGHT);
        jt.setBorder(b);
        jt.setFont(textFont);
        jt.setBackground(black);
        jt.setForeground(white);

        // 패널 Layout
        fp1.setLayout(new GridLayout(2, 1, 0, 0));
        fp2.setLayout(new GridLayout(1, 1, 0, 0));

        p1.setLayout(new GridLayout(2, 6, 0, 0));
        p2.setLayout(new GridLayout(6, 4, 0, 0));
        p1.setBackground(black);
        p2.setBackground(black);

        // 메모리 버튼
        memoryBtn[0] = new JButton("MC");
        memoryBtn[1] = new JButton("MR");
        memoryBtn[2] = new JButton("M+");
        memoryBtn[3] = new JButton("M-");
        memoryBtn[4] = new JButton("MS");
        memoryBtn[5] = new JButton("M▼");

        for (JButton jButton : memoryBtn) {
            jButton.setBackground(lightBlack);
            jButton.setForeground(white);
            jButton.addActionListener(this);
//            jButton.addKeyListener(this);
            jButton.setBorder(null);
            jButton.setFont(memoryFont);
            jButton.setBorder(b);
            p1.add(jButton);
        }


        // 숫자, 연산 버튼
        btn[0] = new JButton("C");
        btn[1] = new JButton("CE");
        btn[2] = new JButton("%");
        btn[3] = new JButton("←");

        btn[4] = new JButton("¹/x");
        btn[5] = new JButton("x²");
        btn[6] = new JButton("²√x");
        btn[7] = new JButton("÷");

        btn[8] = new JButton("7");
        btn[9] = new JButton("8");
        btn[10] = new JButton("9");
        btn[11] = new JButton("X");

        btn[12] = new JButton("4");
        btn[13] = new JButton("5");
        btn[14] = new JButton("6");
        btn[15] = new JButton("-");

        btn[16] = new JButton("1");
        btn[17] = new JButton("2");
        btn[18] = new JButton("3");
        btn[19] = new JButton("+");

        btn[20] = new JButton("⁺/-");
        btn[21] = new JButton("0");
        btn[22] = new JButton(".");
        btn[23] = new JButton("=");

        for (JButton jButton : btn) {
            jButton.setBackground(lightBlack);
            jButton.setForeground(white);
            jButton.setFont(btnFont);
            jButton.addActionListener(this);
//            jButton.addKeyListener(this);
            jButton.setBorder(b);
            p2.add(jButton);
        }

        for (int i = 0; i < 8; i++) {
            btn[i].setForeground(green);
        }

        btn[0].setForeground(orange);
        btn[11].setForeground(green);
        btn[15].setForeground(green);
        btn[19].setForeground(green);
        btn[23].setBackground(green);


        // fp1 패널에 추가
        fp1.add(jt, BorderLayout.NORTH);
        fp1.add(p1, BorderLayout.CENTER);

        // fp1 패널에 추가
        fp2.add(p2, BorderLayout.SOUTH);

        // 컨테이너에 최종 추가
        c.add(fp1, BorderLayout.NORTH);
        c.add(fp2, BorderLayout.CENTER);

    }

    public void actionPerformed(ActionEvent e) {
        String str = e.getActionCommand();
        String labelStr = jt.getText();
        jt.setText(labelStr + str);
        String num1 = labelStr + str;

        // 연산자 클릭시 num2로 값 넘김
        if (str.equals("+") || str.equals("-") || str.equals("X") ||
                str.equals("%") || str.equals("÷")) {
            num2 = labelStr + str;
        }

        try {
            // 메모리 버튼
            if (str.equals("MC") || str.equals("MR") || str.equals("M+") ||
                    str.equals("M-") || str.equals("MS") || str.equals("M▼")) {
                jt.setText("");

                switch (str) {
                    case "MC":
                        mTemp = "";
                        jt.setText("");
                        break;

                    case "MR":
                    case "M▼":
                        jt.setText(mTemp);
                        break;

                    case "M+":
                        mNumber += Double.parseDouble(labelStr);
                        if (String.valueOf(mNumber).contains(".0")) {
                            int idx = String.valueOf(mNumber).indexOf(".");
                            mTemp = String.valueOf(mNumber).substring(0, idx);
                            jt.setText(mTemp);
                        }
                        break;

                    case "M-":
                        mNumber -= Double.parseDouble(labelStr);
                        if (String.valueOf(mNumber).contains(".0")) {
                            int idx = String.valueOf(mNumber).indexOf(".");
                            mTemp = String.valueOf(mNumber).substring(0, idx);
                            jt.setText(mTemp);
                        }
                        break;

                    case "MS":
                        mNumber = Double.parseDouble(labelStr);
                        if (String.valueOf(mNumber).contains(".0")) {
                            int idx = String.valueOf(mNumber).indexOf(".");
                            mTemp = String.valueOf(mNumber).substring(0, idx);
                            jt.setText(mTemp);
                        }
                        break;
                }
            }

            if (str.equals("=")) {
                jt.setText("");
                getResult(num1, num2);

                // 0으로 나누려고 시도
                if (setDivide) {
                    jt.setText("0으로 나눌 수 없습니다.");
                    setDivide = false;
                    // 소수점 절삭
                } else if (String.valueOf(result).contains(".0")) {
                    int idx = String.valueOf(result).indexOf(".");
                    String temp = String.valueOf(result).substring(0, idx);
                    jt.setText(temp);
                } else {
                    jt.setText(String.valueOf(result));
                }

            }

            switch (str) {
                case "←": // Backspace
                    if (labelStr.length() == 0) {
                        jt.setText("");
                    } else {
                        jt.setText(labelStr.substring(0, labelStr.length() - 1));
                    }
                    break;

                case "C": // Clear
                    jt.setText("");
                    num1 = "";
                    num2 = "";
                    break;

                case "CE": // Clear Error
                    if (ceCount > 0) {
                        jt.setText("");
                    } else {
                        jt.setText(labelStr.substring(0, labelStr.length() - 1));
                    }
                    ceCount = 0;
                    break;

                case "⁺/-": // +/- Operator
                    jt.setText("");
                    double tmpNum = Double.parseDouble(labelStr);
                    tmpNum *= -1;

                    if (tmpNum < 0) {
                        jt.setText("-" + labelStr);
                    } else if (tmpNum > 0) {
                        jt.setText(labelStr.substring(1));
                    }
                    break;
            }

            switch (str) {
                case "x²": // 제곱
                    ceCount++;
                    jt.setText("");
                    if (String.valueOf(oneClick.getSqaure(num1)).contains(".0")) {
                        int idx = String.valueOf(oneClick.getSqaure(num1)).indexOf(".");
                        String temp = String.valueOf(oneClick.getSqaure(num1)).substring(0, idx);
                        jt.setText(temp);
                    }
                    break;

                case "¹/x": // 분수
                    ceCount++;
                    jt.setText("");
                    jt.setText(String.valueOf(oneClick.getFraction(num1)));
                    break;

                case "²√x": // 제곱근
                    ceCount++;
                    jt.setText("");
                    if (String.valueOf(oneClick.getSqrt(num1)).contains(".0")) {
                        int idx = String.valueOf(oneClick.getSqrt(num1)).indexOf(".");
                        String temp = String.valueOf(oneClick.getSqrt(num1)).substring(0, idx);
                        jt.setText(temp);
                    } else {
                        jt.setText(String.valueOf(oneClick.getSqrt(num1)));
                    }
                    break;
            }

        // 예외 처리
        } catch (StringIndexOutOfBoundsException | NumberFormatException ignored) {

        }

    }

    private double getResult(String str1, String str2) {
        ceCount++;
        String val1 = str1.substring(0, str2.length() - 1);
        String op = str1.substring(val1.length(), val1.length() + 1);
        String val2 = str1.substring(str2.length(), str1.length() - 1);

        if (val2.equals("0")) {
            setDivide = true;
        }

        switch (op) {
            case "+":
                result = Double.parseDouble(val1) + Double.parseDouble(val2);
                break;
            case "-":
                result = Double.parseDouble(val1) - Double.parseDouble(val2);
                break;
            case "X":
                result = Double.parseDouble(val1) * Double.parseDouble(val2);
                break;
            case "%":
                result = Double.parseDouble(val1) % Double.parseDouble(val2);
                break;
            case "÷":
                result = Double.parseDouble(val1) / Double.parseDouble(val2);
                break;
        }

        return result;

    }

}