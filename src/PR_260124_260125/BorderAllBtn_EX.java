package PR_260124_260125;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BorderAllBtn_EX {
    public static void main(String[] args) {
        JFrame frame = new JFrame("BorderLayout 모든영역 실습");
        frame.setLayout(new BorderLayout());

        // 컴포넌트들을 변수로 선언 (데이터 추출을 위해)
        JLabel header = new JLabel("헤더", SwingConstants.CENTER);
        JButton btnConfirm = new JButton("확인");
        JTextField inputField = new JTextField("입력");
        JCheckBox checkBox = new JCheckBox("선택");
        JTextArea textArea = new JTextArea(4, 12);

        // 레이아웃 배치
        frame.add(header, BorderLayout.NORTH);
        frame.add(btnConfirm, BorderLayout.SOUTH);
        frame.add(inputField, BorderLayout.EAST);
        frame.add(checkBox, BorderLayout.WEST);
        frame.add(textArea, BorderLayout.CENTER);

        // 버튼 클릭 시 콘솔에 저장(출력)하는 로직 추가
        btnConfirm.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("--- 데이터 저장 시작 ---");
                System.out.println("텍스트 필드: " + inputField.getText());
                System.out.println("체크박스 선택 여부: " + (checkBox.isSelected() ? "체크됨" : "체크 안 됨"));
                System.out.println("텍스트 영역 내용: \n" + textArea.getText());
                System.out.println("-----------------------");
            }
        });

        frame.setSize(400, 250); // 가독성을 위해 크기를 살짝 키웠습니다.
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}