package PR_260124_260125;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Grid3x1 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("3x1 Grid");
        JPanel panel = new JPanel(new GridLayout(3, 1));

        JLabel label = new JLabel("이름", SwingConstants.CENTER);
        JTextField textField = new JTextField(8);
        JButton button = new JButton("확인");

        // 버튼 클릭 시 동작할 이벤트 추가
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // 텍스트 필드에서 값을 가져옴
                String name = textField.getText();
                // 콘솔에 출력
                System.out.println("입력된 이름: " + name);
            }
        });

        panel.add(label);
        panel.add(textField);
        panel.add(button);

        frame.add(panel);
        frame.setSize(250, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
