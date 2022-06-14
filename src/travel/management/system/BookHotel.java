package travel.management.system;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.event.*;
import java.sql.*;

public class BookHotel extends JFrame implements ActionListener{
    
    JPanel headerpanel;
    JTextField t1, t2, t3, t4, t5, t6, t7, t8;
    JLabel l1, l2, l3, l4, l5, l6, l7, l8, l9, l10, l11, l12, l13;
    Choice c1, c2;
    JButton b1, b2;
    String name, user;
    
    public BookHotel(String name, String user){
        
                this.name = name;
                this.user = user;
                setSize(750, 735);
                setLocationRelativeTo(null);
                getContentPane().setBackground(Color.WHITE);
                setLayout(null);
                
                headerpanel = new JPanel();
                headerpanel.setBackground(new Color(32, 178, 170));
		headerpanel.setBounds(0, 0, 750, 50);
		add(headerpanel);
                headerpanel.setLayout(null);
                
                l1 = new JLabel("Book Hotel");
		l1.setForeground(Color.WHITE);
		l1.setFont(new Font("Segoe UI Emoji", Font.BOLD, 30));
                l1.setHorizontalAlignment(SwingConstants.CENTER);
                l1.setBounds(0, 5, 750, 50);
		headerpanel.add(l1);
                
                l2 = new JLabel("Hotel Name: ");
		l2.setFont(new Font("Segoe UI Emoji", Font.PLAIN, 18));
		l2.setBounds(60, 80, 200, 40);
		add(l2);
                
                l3 = new JLabel("Customer Name: ");
		l3.setFont(new Font("Segoe UI Emoji", Font.PLAIN, 18));
		l3.setBounds(60, 130, 200, 40);
		add(l3);
                
                l4 = new JLabel("Username: ");
		l4.setFont(new Font("Segoe UI Emoji", Font.PLAIN, 18));
		l4.setBounds(60, 180, 200, 40);
		add(l4);
                
                l5 = new JLabel("AC Cost Per Day: ");
		l5.setFont(new Font("Segoe UI Emoji", Font.PLAIN, 18));
		l5.setBounds(60, 230, 200, 40);
		add(l5);
                
                l6 = new JLabel("Food Cost Per Day: ");
		l6.setFont(new Font("Segoe UI Emoji", Font.PLAIN, 18));
		l6.setBounds(60, 280, 200, 40);
		add(l6);
                
                l7 = new JLabel("Hotel Cost Per Day: ");
		l7.setFont(new Font("Segoe UI Emoji", Font.PLAIN, 18));
		l7.setBounds(60, 330, 200, 40);
		add(l7);
                
                l8 = new JLabel("Total Persons: ");
		l8.setFont(new Font("Segoe UI Emoji", Font.PLAIN, 18));
		l8.setBounds(60, 380, 200, 40);
		add(l8);
                
                l9 = new JLabel("No. Of Days: ");
		l9.setFont(new Font("Segoe UI Emoji", Font.PLAIN, 18));
		l9.setBounds(60, 430, 200, 40);
		add(l9);
                
                l10 = new JLabel("AC/Non-AC: ");
		l10.setFont(new Font("Segoe UI Emoji", Font.PLAIN, 18));
		l10.setBounds(60, 480, 200, 40);
		add(l10);
                
                l11 = new JLabel("Food Included: ");
		l11.setFont(new Font("Segoe UI Emoji", Font.PLAIN, 18));
		l11.setBounds(60, 530, 200, 40);
		add(l11);
                
                l12 = new JLabel("Total Price: ");
		l12.setFont(new Font("Segoe UI Emoji", Font.PLAIN, 18));
		l12.setBounds(60, 580, 200, 40);
		add(l12);
                
                t1 = new JTextField();
		t1.setForeground(Color.DARK_GRAY);
                t1.setEditable(false);
                t1.setBackground(Color.WHITE);
		t1.setFont(new Font("Segoe UI Emoji", Font.PLAIN, 18));
		t1.setBounds(270, 80, 380, 40);
		add(t1);
                
                t2 = new JTextField();
		t2.setForeground(Color.DARK_GRAY);
                t2.setEditable(false);
                t2.setBackground(Color.WHITE);
		t2.setFont(new Font("Segoe UI Emoji", Font.PLAIN, 18));
		t2.setBounds(270, 130, 380, 40);
		add(t2);
                
                t3 = new JTextField();
		t3.setForeground(Color.DARK_GRAY);
                t3.setEditable(false);
                t3.setBackground(Color.WHITE);
		t3.setFont(new Font("Segoe UI Emoji", Font.PLAIN, 18));
		t3.setBounds(270, 180, 380, 40);
		add(t3);
                
                t4 = new JTextField();
		t4.setForeground(Color.DARK_GRAY);
                t4.setEditable(false);
                t4.setBackground(Color.WHITE);
		t4.setFont(new Font("Segoe UI Emoji", Font.PLAIN, 18));
		t4.setBounds(270, 230, 380, 40);
		add(t4);
                
                t5 = new JTextField();
		t5.setForeground(Color.DARK_GRAY);
                t5.setEditable(false);
                t5.setBackground(Color.WHITE);
		t5.setFont(new Font("Segoe UI Emoji", Font.PLAIN, 18));
		t5.setBounds(270, 280, 380, 40);
		add(t5);
                
                t6 = new JTextField();
		t6.setForeground(Color.DARK_GRAY);
		t6.setEditable(false);
                t6.setBackground(Color.WHITE);
		t6.setFont(new Font("Segoe UI Emoji", Font.PLAIN, 18));
		t6.setBounds(270, 330, 380, 40);
		add(t6);
                
                t7 = new JTextField();
		t7.setForeground(Color.DARK_GRAY);
		t7.setFont(new Font("Segoe UI Emoji", Font.PLAIN, 18));
		t7.setBounds(270, 380, 380, 40);
		add(t7);
                
                t8 = new JTextField();
		t8.setForeground(Color.DARK_GRAY);
		t8.setFont(new Font("Segoe UI Emoji", Font.PLAIN, 18));
		t8.setBounds(270, 430, 380, 40);
		add(t8);
                
                c1 = new Choice();
                c1.add("AC");
                c1.add("Non-AC");
                c1.setForeground(Color.DARK_GRAY);
                c1.setBackground(Color.WHITE);
		c1.setFont(new Font("Segoe UI Emoji", Font.PLAIN, 25));
		c1.setBounds(270, 482, 380, 40);
                add(c1);
                
                c2 = new Choice();
                c2.add("Yes");
                c2.add("No");
                c2.setForeground(Color.DARK_GRAY);
                c2.setBackground(Color.WHITE);
		c2.setFont(new Font("Segoe UI Emoji", Font.PLAIN, 25));
		c2.setBounds(270, 532, 380, 40);
                add(c2);
                
                l13 = new JLabel();
		l13.setFont(new Font("Segoe UI Emoji", Font.BOLD, 18));
		l13.setBounds(270, 580, 380, 40);
                l13.setForeground(Color.BLUE);
                l13.setBackground(Color.WHITE);
		add(l13);
                
                try{
                    Conn conn = new Conn();
                    PreparedStatement ps = conn.c.prepareStatement("select *from hotel where name='"+name+"'");
                    ResultSet rs = ps.executeQuery();
                    if(rs.next()){
                        t1.setText(rs.getString("name"));
                        t4.setText(rs.getString("ac"));
                        t5.setText(rs.getString("food"));
                        t6.setText(rs.getString("hotelcost"));
                    }
                    PreparedStatement ps1 = conn.c.prepareStatement("select *from customer where username='"+user+"'");
                    ResultSet rs1 = ps1.executeQuery();
                    if(rs1.next()){
                        t2.setText(rs1.getString("name"));
                        t3.setText(rs1.getString("username"));
                    }
                }catch(Exception e){}
                
                b1 = new JButton("Book");
		b1.setBorder(new EmptyBorder(0, 0, 0, 0));
		b1.setForeground(new Color(255, 255, 255));
		b1.setBackground(new Color(32, 178, 170));
		b1.setFont(new Font("Segoe UI", Font.BOLD, 15));
		b1.addActionListener(this);
		b1.setCursor(new Cursor(Cursor.HAND_CURSOR));
		b1.setBounds(578, 645, 140, 38);
		b1.setFocusable(false);
		add(b1);
                
                b2 = new JButton("Check Price");
		b2.setBorder(new EmptyBorder(0, 0, 0, 0));
		b2.setForeground(new Color(255, 255, 255));
		b2.setBackground(new Color(32, 178, 170));
		b2.setFont(new Font("Segoe UI", Font.BOLD, 15));
		b2.addActionListener(this);
		b2.setCursor(new Cursor(Cursor.HAND_CURSOR));
		b2.setBounds(427, 645, 140, 38);
		b2.setFocusable(false);
		add(b2);
    }
    public void actionPerformed(ActionEvent ae){
             if(ae.getSource() == b1){
              try{
                 Conn conn = new Conn();
                 String sql = "insert into bookhotel values(?, ?, ?, ?, ?, ?, ?, ?)";
                 PreparedStatement ps = conn.c.prepareStatement(sql);
                 ps.setString(1, t1.getText());
                 ps.setString(2, t2.getText());
                 ps.setString(3, t3.getText());
                 ps.setString(4, t7.getText());
                 ps.setString(5, t8.getText());
                 ps.setString(6, c1.getSelectedItem());
                 ps.setString(7, c2.getSelectedItem());
                 ps.setString(8, l13.getText());
                 ps.executeUpdate();
                 JOptionPane.showMessageDialog(null, "Hotel Booked Successfully");
                 this.dispose();
              }catch(Exception e1){}  
             }
             if(ae.getSource() == b2){
                 int accost = Integer.parseInt(t4.getText());
                 int foodcost = Integer.parseInt(t5.getText());
                 int hotelcost = Integer.parseInt(t6.getText());
                 int person = Integer.parseInt(t7.getText());
                 int days = Integer.parseInt(t8.getText());
                 if(days * person > 0){
                     int totalcost = 0;
                     totalcost += c1.getSelectedItem().equals("AC") ? accost : 0;
                     totalcost += c2.getSelectedItem().equals("Yes") ? foodcost : 0;
                     totalcost += hotelcost;
                     totalcost = totalcost * days * person;
                     l13.setText(""+totalcost);
                 }else{
                     l13.setText("Please enter a valid number!!!");
                 }
             }
    }
}
