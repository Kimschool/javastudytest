import javax.swing.*;
import java.awt.*;

public class Test extends JFrame {
    public Test(){

        setTitle("WEAVUS-Main");
        setSize(300,400);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(3,1));


        JPanel p1=new JPanel(new FlowLayout(FlowLayout.RIGHT));
        JLabel l1=new JLabel("さん");

        JPanel p2 = new JPanel();
        JButton l2 = new JButton("問題");

        JPanel p3 = new JPanel();
        JButton l3 = new JButton("進捗");


        p1.add(l1);
        add(p1);

        p2.add(l2);
        add(p2);

        p3.add(l3);
        add(p3);

        setVisible(true);



    }
    public static void main(String[] args) {
        new Test();
    }
}
