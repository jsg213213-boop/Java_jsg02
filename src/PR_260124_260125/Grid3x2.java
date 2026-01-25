package PR_260124_260125;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Grid3x2 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("3행 폼 데이터 저장");

        // 레이아웃 설정 (4행 2열로 변경하여 버튼 공간 확보)
        JPanel panel = new JPanel(new GridLayout(4, 2, 5, 5));

        // 텍스트 필드를 나중에 참조하기 위해 배열에 보관
        JTextField[] fields = new JTextField[3];

        for (int i = 0; i < 3; i++) {
            panel.add(new JLabel("항목 " + (i + 1)));
            fields[i] = new JTextField(5);
            panel.add(fields[i]);
        }

        // 저장 버튼 추가
        JButton saveButton = new JButton("콘솔에 저장");
        panel.add(new JLabel("")); // 빈 공간 채우기용 레이블
        panel.add(saveButton);

        // 버튼 클릭 이벤트 리스너 추가
        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("--- 저장된 데이터 ---");
                for (int i = 0; i < fields.length; i++) {
                    String text = fields[i].getText();
                    System.out.println("항목 " + (i + 1) + ": " + text);
                }
                System.out.println("--------------------");
            }
        });

        frame.add(panel);
        frame.pack(); // 컴포넌트 크기에 맞게 조절
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}