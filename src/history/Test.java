package history;

import list.AnswerListFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;

public class Test extends JFrame {
    public Test() {
        setTitle("履歴一覧");
        setSize(400,500);
        setLocationRelativeTo(null);

        JPanel p = new JPanel();
        JLabel l = new JLabel("<html><a href='#'>4/17の解答</a></html>");
        //クリック可能かどうかの視認性
        l.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        l.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
//                setVisible(false);
                new AnswerListFrame();
//                try {
//                    Desktop.getDesktop().open(new File("C:/STUDY/enjoy/enjoyjava/src/list/AnswerListFrame.java"));
//                } catch (Exception ex) {
////                    ex.printStackTrace();
//                }
            }
        });

        p.add(l);


        add(p);
        setVisible(true);
    }
    public static void main(String[] args) {
        new Test();
    }
}