import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class Firstpage extends JFrame implements MouseListener {
    private JLabel getStarted, generateCV,label;

    public Firstpage() {
        ImageIcon imageIcon = new ImageIcon("C:\\Users\\hp\\Pictures\\IMAG1.jpeg");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(810, 540);
        setResizable(false);
        setLocationRelativeTo(null);
        setVisible(true);

        JLabel background = new JLabel(imageIcon);
        background.setLayout(null);
        background.setSize(800, 450);

        
      //  label = new JLabel("Welcome To CV Maker ");
        //label.setFont(new Font("Consolas", Font.ITALIC, 30));
        //label.setForeground(new Color(70,130,180));
        //label.setBounds(110, 110, 500, 30);
        //label.setBackground(Color.CYAN);
        //label.addMouseListener(this);
        //background.add(label);
        
        
        
        
        
        // create and add "Get Started" label
        getStarted = new JLabel("Get Start");
        getStarted.setFont(new Font("Consolas", Font.HANGING_BASELINE, 25));
        getStarted.setForeground(Color.BLACK);
        getStarted.setBounds(320, 230, 300, 30);
        getStarted.setBackground(Color.BLACK);
        getStarted.addMouseListener(this);
        background.add(getStarted);
            
       
        
        // create and add "Generate CV" label
        generateCV = new JLabel("Generate CV");
        generateCV.setFont(new Font("Consolas", Font.HANGING_BASELINE, 25));
        generateCV.setForeground(Color.BLACK);
        generateCV.setBounds(320, 280, 300, 30);
        generateCV.addMouseListener(this);
        background.add(generateCV);

        this.setContentPane(background);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource() == getStarted) {
            dispose();
            new PersonalDetail();
        } else if (e.getSource() == generateCV) {
            dispose();
            new Genrate();
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {}

    @Override
    public void mouseReleased(MouseEvent e) {}

    @Override
    public void mouseEntered(MouseEvent e) {}

    @Override
    public void mouseExited(MouseEvent e) {}
}
