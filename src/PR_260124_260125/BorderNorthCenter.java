package PR_260124_260125;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BorderNorthCenter {
    public static void main(String[] args) {
        JFrame frame = new JFrame("텍스트 저장하기");
        frame.setLayout(new BorderLayout());

        JLabel label = new JLabel("내용을 입력하고 저장 버튼을 누르세요", SwingConstants.CENTER);
        JTextArea textArea = new JTextArea(5, 20);
        JButton saveButton = new JButton("콘솔에 저장");

        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String content = textArea.getText();
                System.out.println("--- 콘솔 저장 내용 ---");
                System.out.println(content);
                System.out.println("---------------------");

            }
        });

        frame.add(label, BorderLayout.NORTH);
        frame.add(new JScrollPane(textArea), BorderLayout.CENTER); // 스크롤 추가
        frame.add(saveButton, BorderLayout.SOUTH); // 하단에 버튼 배치

        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null); // 화면 중앙에 배치
        frame.setVisible(true);
    }
}
