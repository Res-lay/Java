package t21_22;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI extends JFrame {
    private ICreateDocument createDocument;
    private JButton button1 = new JButton("New");
    private JButton button2 = new JButton("Open");
    private JButton button3 = new JButton("Save");
    private JButton button4 = new JButton("Exit");

    public GUI(ICreateDocument createDocument){
        super("t21_22");
        this.createDocument = createDocument;
        this.setBounds(100, 100,300,300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = this.getContentPane();
        container.setLayout(new GridLayout(3,2,2,2));
        container.add(button1);
        container.add(button2);
        container.add(button3);
        container.add(button4);
        button1.addActionListener(new Button1EventListener());
        button2.addActionListener(new Button2EventListener());
        setVisible(true);
    }
    public class Button1EventListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            createDocument.createNew();
            System.out.println("Done");
        }
    }
    public class Button2EventListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            createDocument.createOpen();
            System.out.println("Opened");
        }
    }

}
