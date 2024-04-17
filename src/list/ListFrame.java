package list;

import javax.swing.*;
import java.awt.*;

public class ListFrame extends JFrame {

    public ListFrame() {
        setTitle("楽しいJAVA-LIST");
        setSize(300,500);
        setLocationRelativeTo(null);

        JLabel j1 = new JLabel("1)問題");
        JTextField t1 = new JTextField();
        t1.setText("aaaaaa//nbbbbbb//nccccc");
        add(j1);
        add(t1);



        setVisible(true);
    }

    public static void main(String[] args) {
        new ListFrame();
    }
}
