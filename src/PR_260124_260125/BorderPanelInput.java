package PR_260124_260125;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BorderPanelInput {
    public static void main(String[] args) {
        JFrame frame = new JFrame("입력폼");
        frame.setLayout(new BorderLayout());

        // 1. 서쪽 패널 (A, B, C 버튼)
        JPanel westPanel = new JPanel(new GridLayout(3, 1));
        westPanel.add(new JButton("A"));
        westPanel.add(new JButton("B"));
        westPanel.add(new JButton("C"));

        // 2. 중앙 패널 (입력 필드)
        JPanel centerPanel = new JPanel(new GridLayout(2, 2, 5, 5));
        JLabel idLabel = new JLabel("아이디: ");
        JTextField idField = new JTextField(8);
        JLabel pwLabel = new JLabel("비밀번호: ");
        JPasswordField pwField = new JPasswordField(8);

        centerPanel.add(idLabel);
        centerPanel.add(idField);
        centerPanel.add(pwLabel);
        centerPanel.add(pwField);

        // 3. 남쪽 패널 (저장 버튼 추가)
        JButton saveButton = new JButton("콘솔에 저장");

        // 버튼 클릭 이벤트 리스너 추가
        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String id = idField.getText();
                // 패스워드는 보안상 char[]를 반환하므로 String으로 변환이 필요합니다.
                String pw = new String(pwField.getPassword());

                System.out.println("--- 저장된 정보 ---");
                System.out.println("ID: " + id);
                System.out.println("PW: " + pw);
                System.out.println("----------------");
            }
        });

        // 레이아웃 배치
        frame.add(westPanel, BorderLayout.WEST);
        frame.add(centerPanel, BorderLayout.CENTER);
        frame.add(saveButton, BorderLayout.SOUTH); // 버튼을 아래쪽에 배치

        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null); // 화면 중앙에 띄우기
        frame.setVisible(true);
    }
}
