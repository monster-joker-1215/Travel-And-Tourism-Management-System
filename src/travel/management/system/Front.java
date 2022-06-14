package travel.management.system;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.lang.Thread;

public class Front extends JFrame implements ActionListener{

        JButton b1;
        
        Front() {
		
                setBounds(90, 80, 1350, 700);
                getContentPane().setBackground(Color.WHITE);
                setResizable(false);
                setLayout(null);
 
                
                ImageIcon i1  = new ImageIcon(ClassLoader.getSystemResource("Travel/Management/System/icons/frontpage.jpg"));
                Image i3 = i1.getImage().getScaledInstance(1350, 700,Image.SCALE_DEFAULT);
                ImageIcon i2 = new ImageIcon(i3);
                JLabel l1 = new JLabel(i2);
                l1.setBounds(0, 0, 1350, 700);
                add(l1);
                
                JLabel l2=new JLabel("TRAVEL AND TOURISM MANAGEMENT SYSTEM");
                l2.setBounds(90, 10, 1345, 100);
                l2.setFont(new Font("serif",Font.PLAIN,50));
                l2.setForeground(Color.RED);
                l1.add(l2);
                
               
                b1 = new JButton("Next");
                b1.setBackground(new Color(255, 235, 205));
                b1.setForeground(Color.RED);
                b1.setBounds(1170,600,150,50);
                b1.setFocusable(false);
                b1.addActionListener(this);
                l1.add(b1);
                
		setVisible(true);
                
                while(true){
                        l2.setVisible(false); 
                    try{
                        Thread.sleep(500); 
                    }catch(Exception e){} 
                        l2.setVisible(true);
                    try{
                        Thread.sleep(500);
                    }catch(Exception e){}
                }
	}
        
        public void actionPerformed(ActionEvent ae){
                this.setVisible(false);
                new Home().setVisible(true);
               
        }
        
        public static void main(String[] args) {
                new Front().setVisible(true);			
	}
}