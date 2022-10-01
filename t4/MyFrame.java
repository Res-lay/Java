package t4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {
    JButton button1, button2;
    JLabel label1, label2, label3;
    int m = 0;
    int r = 0;
    String last = "";

    JTextField textField;
    MyFrame()
    {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());


        label1 = new JLabel("Result: " + r + " X " + m);
        label2 = new JLabel("Last Scorer: None" );
        label3 = new JLabel("Winner: DRAW");
        button1 = new JButton("AC Milan");
        button2 = new JButton("Real Madrid");
        button1.addActionListener(this);
        button2.addActionListener(this);

        textField = new JTextField();
        textField.setPreferredSize(new Dimension(500,200));

//        this.add(textField);
        this.add(button1);
        this.add(button2);
        this.add(label1);
        this.add(label2);
        this.add(label3);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button1){
            r += 1;
            label1.setText("Result: "+ r + " X " + m);
            label2.setText("Last Scorer: " + "AC Milan");
            if(r > m){
                label3.setText("Winner: " + "AC Milan");
            }
            else if (r == m) {
                label3.setText("Winner: DRAW");
            }
            this.pack();
        }
        else if (e.getSource()==button2){
            m += 1;
            label1.setText("Result: " + r + " X " + m);
            label2.setText("Last Scorer: " + "Real Madrid");
            if(r < m){
                label3.setText("Winner: " + "Real Madrid");
            }
            else if (r == m) {
                label3.setText("Winner: DRAW");
            }
            this.pack();
        }
    }
}
