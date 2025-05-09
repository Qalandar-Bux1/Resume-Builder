import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
//
//class LoadingPage {
//	
//	JLabel logo;
//	ImageIcon image;
//	JFrame loadframe;
//	JProgressBar ProgressBar;
//	
//	LoadingPage(){
//		
//		//LoadingMenuImage();
//		LoadingMenu();
//		Bar();
//	}	
//		
//	
//	public void Bar() {	
//		ProgressBar = new JProgressBar();
//		ProgressBar.setBounds(25,390,750 , 15);
//		ProgressBar.setBackground(Color.blue);
//		ProgressBar.setForeground(Color.white);
//		logo.add(ProgressBar);
//		loadframe.setVisible(true);
//		try {
//			for(int i=0; i<100; i++) {
//				Thread.sleep(35);
//				ProgressBar.setValue(i);
//			}
//		} catch (Exception e){
//		} 
//	}
//	
//	public void LoadingMenu() {
//		loadframe = new JFrame();
//		loadframe.getContentPane().setLayout(null);
//		loadframe.setBounds(0,0,815,450);
//		loadframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		loadframe.setResizable(false);
//		
//		// Set background image
//		image = new ImageIcon("D:\\java programs\\Project\\src\\pic2.jpg");
//		JLabel background = new JLabel(image);
//		background.setBounds(0, 0, 800, 410);
//		loadframe.getContentPane().add(background);
//		
//		logo = new JLabel();
//		logo.setOpaque(true);
//		logo.setBounds(0, 0, 800, 410);  
//		
//		background.add(logo);
//	}     
//}
//
//public class loading{
import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JProgressBar;

public class loading extends JFrame {
    private JLabel getStarted, generateCV, label;
    private JProgressBar progressBar;
    private JLabel background=new JLabel();

    public loading() {
        load();
        bar();
    }

    public void bar() {
        progressBar = new JProgressBar();
        progressBar.setBounds(25, 390, 750, 15);
        progressBar.setBackground(Color.blue);
        progressBar.setForeground(Color.white);
        background.add(progressBar);

        try {
            for (int i = 0; i < 100; i++) {
                Thread.sleep(30);
                progressBar.setValue(i);
               
            }
            new Firstpage();
            this.dispose();
        } catch (Exception e) {
        }
    }

    public void load() {
        ImageIcon imageIcon = new ImageIcon("C:\\Users\\hp\\Pictures\\IMAG2.jpeg");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 570);
        setResizable(false);
        setLocationRelativeTo(null);
        setVisible(true);

        background = new JLabel(imageIcon);
        background.setLayout(null);
        background.setSize(700, 600);

        label = new JLabel("Welcome To CV Maker ");
        label.setFont(new Font("Consolas", Font.HANGING_BASELINE, 30));
        label.setForeground(new Color(100, 130, 180));
        label.setBounds(190, 130, 500, 30);
        label.setBackground(Color.CYAN);

        background.add(label);
        add(background);
    }

    public static void main(String args[]) {
//    	 new Firstpage();
    //	 new loading();
    	
    }
}
