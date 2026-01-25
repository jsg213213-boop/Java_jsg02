package PR_260124_260125;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GridCalculator {

    private static String currentInput = "";
    private static int result = 0;
    private static String lastOperator = "";

    public static void main(String[] args) {
        JFrame frame = new JFrame("진짜 계산기");
        frame.setLayout(new BorderLayout(5, 5));

        JTextField display = new JTextField("0");
        display.setEditable(false);
        display.setHorizontalAlignment(JTextField.RIGHT);
        display.setFont(new Font("Arial", Font.BOLD, 25));
        frame.add(display, BorderLayout.NORTH);

        JPanel panel = new JPanel(new GridLayout(4, 3, 5, 5));
        String[] buttons = { "7", "8", "9", "4", "5", "6", "1", "2", "3", "0", "+", "=" };

        for (String text : buttons) {
            JButton button = new JButton(text);
            panel.add(button);

            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String cmd = e.getActionCommand();

                    if (cmd.matches("[0-9]")) {
                        currentInput += cmd;
                        display.setText(currentInput);
                    } else if (cmd.equals("+")) {
                        if (!currentInput.isEmpty()) {
                            result = Integer.parseInt(currentInput);
                            currentInput = ""; // 다음 숫자를 받기 위해 비움
                            lastOperator = "+";
                        }
                    } else if (cmd.equals("=")) {
                        if (!currentInput.isEmpty() && lastOperator.equals("+")) {
                            int secondNum = Integer.parseInt(currentInput);
                            result += secondNum;

                            display.setText(String.valueOf(result));

                            System.out.println("계산 완료: " + result);

                            currentInput = "";
                            lastOperator = "";
                        }
                    }
                }
            });
        }

        frame.add(panel, BorderLayout.CENTER);
        frame.setSize(300, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
