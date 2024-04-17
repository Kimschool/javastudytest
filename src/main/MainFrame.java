package main;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {

    public MainFrame() {
        setTitle("楽しいJAVA-MAIN");
        setSize(300,100);
        setLocationRelativeTo(null);

        setLayout(new BorderLayout());

        JPanel p1 = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        JLabel l1 = new JLabel("キムジョンファさん");
        p1.add(l1);
        add(p1, BorderLayout.NORTH);

        JPanel p2 = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JLabel l2 = new JLabel("進捗率(2/5) : 40%");
        p2.add(l2);

        JButton b1 = new JButton("問題リスト");
        JButton b2 = new JButton("履歴");
        p2.add(b1);
        p2.add(b2);

        add(p2);

        setVisible(true);
    }

    public static void main(String[] args) {
        new MainFrame();
    }
}
