package lesson2_control;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class DemoFlowLayout extends JFrame {
    public static void main(String[] args) {
        DemoFlowLayout frame = new DemoFlowLayout();
        frame.setVisible(true);
        frame.setSize(500, 500);
        
        JButton btn1 = new JButton("Button 1"),
            btn2 = new JButton("Button 2"),
            btn3 = new JButton("Button 3"),
            btn4 = new JButton("Button 4"),
            btn5 = new JButton("Button 5");
        
        // BorderLayout
        frame.setLayout(new BorderLayout());
        frame.add(btn1, BorderLayout.CENTER);
        frame.add(btn2, BorderLayout.NORTH);
        frame.add(btn3, BorderLayout.SOUTH);
        frame.add(btn4, BorderLayout.EAST);
        frame.add(btn5, BorderLayout.WEST);
        
        // FlowLayout
//        frame.setLayout(new FlowLayout());
//        frame.add(btn1);
//        frame.add(btn2);
//        frame.add(btn3);
//        frame.add(btn4);
//        frame.add(btn5);
    }
}
