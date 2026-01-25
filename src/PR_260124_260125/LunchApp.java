package PR_260124_260125;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LunchApp {
    public static void main(String[] args) {
        JFrame frame = new JFrame("오늘의 점심 메뉴");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();

        // 메뉴 텍스트 설정
        String menuText = "소고기뭇국+오징어회+제육볶음";
        JLabel label = new JLabel("오늘 점심: " + menuText);
        panel.add(label);

        JButton button = new JButton("메뉴 결정!");

        // --- 콘솔 저장 기능 추가 시작 ---
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // 버튼 클릭 시 콘솔에 출력 (로그 저장 방식)
                System.out.println("[저장] 오늘의 메뉴가 결정되었습니다: " + menuText);

                // 알림창도 띄워주면 더 좋겠죠?
                JOptionPane.showMessageDialog(frame, "콘솔에 메뉴가 저장되었습니다!");
            }
        });
        // --- 콘솔 저장 기능 추가 끝 ---

        panel.add(button);
        frame.add(panel);
        frame.setVisible(true);
    }
}