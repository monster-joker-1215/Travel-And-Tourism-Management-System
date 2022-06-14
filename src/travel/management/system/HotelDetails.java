package travel.management.system;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.event.*;
import java.sql.*;

public class HotelDetails extends JPanel implements ActionListener{
    
    JLabel l1, l2, l3, l4, l5, l6, l7, l8, l9, l10, l11, l12;
    JButton b1, b2;
    JPanel panel, panel1;
    JTextArea ta1;
    public AdminHome a;
    public CustomerHome c;
    String name, user;
    
    HotelDetails(AdminHome a, String name){
        this();
        this.a = a;
        this.name = name;
        display();
    }
    HotelDetails(CustomerHome c, String name, String user){
        this();
        this.c = c;
        this.name = name;
        this.user = user;
        b1.setText("Book Hotel");
        display();
    }
    
    HotelDetails(){
        
                setBorder(new EmptyBorder(0, 0, 0, 0));
		setBackground(Color.WHITE);
		this.setSize(1278, 900);
		setLayout(null); 
        
                panel = new JPanel();
		panel.setBackground(new Color(32, 178, 170));
		panel.setBounds(7, 7, 1278, 160);
		add(panel);
		panel.setLayout(null);
                
                panel1 = new JPanel();
		panel1.setBackground(Color.WHITE);
		panel1.setBounds(7, 167, 1278, 740);
		add(panel1);
		panel1.setLayout(null);
		
		l11 = new JLabel("Hotel Details ");
		l11.setIcon(null);
		l11.setBounds(5, 55, 300, 45);
		panel.add(l11);
		l11.setBackground(new Color(32, 178, 170));
		l11.setForeground(Color.WHITE);
		l11.setFont(new Font("Segoe UI", Font.BOLD, 30));
                
                l1 = new JLabel("Hotel Name ");
		l1.setBorder(new LineBorder(new Color(192, 192, 192)));
		l1.setBackground(new Color(255, 255, 255));
		l1.setFont(new Font("Segoe UI Historic", Font.PLAIN, 20));
		l1.setBounds(2, 400, 274, 45);
		panel1.add(l1);
		
		l2 = new JLabel("AC Cost Per Day  ");
		l2.setFont(new Font("Segoe UI Historic", Font.PLAIN, 20));
		l2.setBorder(new LineBorder(new Color(192, 192, 192)));
		l2.setBackground(Color.WHITE);
		l2.setBounds(2, 444, 274, 45);
		panel1.add(l2);
                
                l3 = new JLabel();
		l3.setBorder(new LineBorder(new Color(192, 192, 192)));
		l3.setBackground(new Color(255, 255, 255));
		l3.setFont(new Font("Segoe UI Historic", Font.BOLD, 20));
		l3.setBounds(275, 400, 360, 45);
		panel1.add(l3);
		
		l4 = new JLabel();
		l4.setFont(new Font("Segoe UI Historic", Font.BOLD, 20));
		l4.setBorder(new LineBorder(new Color(192, 192, 192)));
		l4.setBackground(Color.WHITE);
		l4.setBounds(275, 444, 360, 45);
		panel1.add(l4);
                
                l5 = new JLabel("City/State ");
		l5.setBorder(new LineBorder(new Color(192, 192, 192)));
		l5.setBackground(new Color(255, 255, 255));
		l5.setFont(new Font("Segoe UI Historic", Font.PLAIN, 20));
		l5.setBounds(634, 400, 274, 45);
		panel1.add(l5);
		
		l6 = new JLabel("Food Cost Per Day ");
		l6.setFont(new Font("Segoe UI Historic", Font.PLAIN, 20));
		l6.setBorder(new LineBorder(new Color(192, 192, 192)));
		l6.setBackground(Color.WHITE);
		l6.setBounds(634, 444, 274, 45);
		panel1.add(l6);
                
                l7 = new JLabel();
		l7.setBorder(new LineBorder(new Color(192, 192, 192)));
		l7.setBackground(new Color(255, 255, 255));
		l7.setFont(new Font("Segoe UI Historic", Font.BOLD, 20));
		l7.setBounds(907, 400, 360, 45);
		panel1.add(l7);
		
		l8 = new JLabel();
		l8.setFont(new Font("Segoe UI Historic", Font.BOLD, 20));
		l8.setBorder(new LineBorder(new Color(192, 192, 192)));
		l8.setBackground(Color.WHITE);
		l8.setBounds(907, 444, 360, 45);
		panel1.add(l8);
                
                l9 = new JLabel("Hotel Cost Per Day ");
		l9.setFont(new Font("Segoe UI Historic", Font.PLAIN, 20));
		l9.setBorder(new LineBorder(new Color(192, 192, 192)));
		l9.setBackground(Color.WHITE);
		l9.setBounds(327, 488, 274, 45);
		panel1.add(l9);
                
                l12 = new JLabel();
		l12.setFont(new Font("Segoe UI Historic", Font.BOLD, 20));
		l12.setBorder(new LineBorder(new Color(192, 192, 192)));
		l12.setBackground(Color.WHITE);
		l12.setBounds(600, 488, 360, 45);
		panel1.add(l12);
               
                l10 = new JLabel();
		l10.setBounds(385, 20, 500, 360);
                l10.setBorder(new LineBorder(new Color(192, 192, 192)));
		panel1.add(l10);
                
                
                b1 = new JButton("Edit Hotel");
		b1.setBorder(new EmptyBorder(0, 0, 0, 0));
		b1.setBounds(1110, 120, 140, 30);
		panel.add(b1);
                b1.addActionListener(this);
                b1.setCursor(new Cursor(Cursor.HAND_CURSOR));
		b1.setFocusable(false);
		b1.setForeground(new Color(0, 128, 128));
		b1.setFont(new Font("Segoe UI", Font.BOLD, 15));
		b1.setBackground(Color.WHITE);
                
                b2 = new JButton("Back", new ImageIcon(ClassLoader.getSystemResource("Travel/Management/System/icons/back.png")));
                b2.setBorder(new EmptyBorder(0, 0, 0, 0));
		b2.setBounds(20, 120, 140, 30);
                panel.add(b2);
                b2.setHorizontalAlignment(SwingConstants.LEFT);
                b2.addActionListener(this);
		b2.setCursor(new Cursor(Cursor.HAND_CURSOR));
		b2.setFocusable(false);
                b2.setForeground(Color.WHITE);
		b2.setFont(new Font("Segoe UI", Font.BOLD, 15));
		b2.setBackground(new Color(32, 178, 170));
                
               
               
    }
    public void display(){
         try{
                    Conn conn = new Conn();
                    PreparedStatement ps = conn.c.prepareStatement("select *from hotel where name='"+name+"'");
                    ResultSet rs = ps.executeQuery();
                    if(rs.next()){
                        l3.setText(rs.getString(1));
                        l4.setText(rs.getString(3));
                        l7.setText(rs.getString(2));
                        l8.setText(rs.getString(4));
                        l12.setText(rs.getString(5));
                        byte [] photo = rs.getBytes(6);
                        Image i1 = new ImageIcon(photo).getImage().getScaledInstance(500, 360, Image.SCALE_SMOOTH);
                        l10.setIcon(new ImageIcon(i1));
                    }
                }catch(Exception e){}
    }
    public void actionPerformed(ActionEvent ae){
             if(ae.getSource() == b1){
                  if(a != null){
                  new AddHotel(this, name).setVisible(true);
                  }
                  if(c != null){
                  new BookHotel(name, user).setVisible(true);
                  }
                  
             }
             else if(ae.getSource() == b2){
                  panel.setVisible(false);
                  panel1.setVisible(false);
                  if(a != null){
                  HotelPanel hp = new HotelPanel(a);
                  add(hp);
                  hp.setVisible(true);
                  }
                  if(c != null){
                  HotelPanel hp = new HotelPanel(c, user);
                  add(hp);
                  hp.setVisible(true); 
                  }
             }
    }
}
