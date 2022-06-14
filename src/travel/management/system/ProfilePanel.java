package travel.management.system;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*; 
import java.sql.*;

public class ProfilePanel extends JPanel implements ActionListener{
	
        JPanel panel, panel1;
	JLabel l1, l2, l3, l4, l5, l6, l7;
        JButton b1, b2, b3;
        JTextField t1, t2, t3, t4, t5, t6;
        String username, user;
        AdminHome a;
        CustomerHome c;
	
        ProfilePanel() {
            
                setBorder(new EmptyBorder(0, 0, 0, 0));
		setBackground(Color.WHITE);
		this.setSize(1278, 900);
		setLayout(null);
                
                panel1 = new JPanel();
		panel1.setBackground(Color.WHITE);
		panel1.setBounds(7, 167, 1278, 800);
		add(panel1);
		panel1.setLayout(null);
        
                panel = new JPanel();
		panel.setBackground(new Color(32, 178, 170));
		panel.setBounds(7, 7, 1278, 160);
		add(panel);
		panel.setLayout(null);
		
		l1 = new JLabel("Your Profile");
		l1.setBounds(5, 55, 224, 45);
		panel.add(l1);
		l1.setBackground(new Color(32, 178, 170));
		l1.setForeground(Color.WHITE);
		l1.setFont(new Font("Segoe UI", Font.BOLD, 30));
                
                b1 = new JButton("Edit Profile");
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
                b2.setVisible(false);
		b2.setForeground(Color.WHITE);
		b2.setFont(new Font("Segoe UI", Font.BOLD, 15));
		b2.setBackground(new Color(32, 178, 170));
                
                b3 = new JButton("Save");
		b3.setBorder(new EmptyBorder(0, 0, 0, 0));
		b3.setBounds(960, 120, 140, 30);
		panel.add(b3);
                b3.addActionListener(this);
		b3.setCursor(new Cursor(Cursor.HAND_CURSOR));
		b3.setFocusable(false);
                b3.setVisible(false);
		b3.setForeground(new Color(0, 128, 128));
		b3.setFont(new Font("Segoe UI", Font.BOLD, 15));
		b3.setBackground(Color.WHITE);
                
                l2 = new JLabel("Name: ");
                l2.setFont(new Font("Times New Roman", Font.BOLD, 30));
                l2.setBounds(400, 140, 200, 30);
                panel1.add(l2);
                
                l3 = new JLabel("Username: ");
                l3.setFont(new Font("Times New Roman", Font.BOLD, 30));
                l3.setBounds(400, 190, 200, 30);
                panel1.add(l3);
                
                l4 = new JLabel("Password: ");
                l4.setFont(new Font("Times New Roman", Font.BOLD, 30));
                l4.setBounds(400, 240, 200, 30);
                panel1.add(l4);
                
                l5 = new JLabel("Email Id: ");
                l5.setFont(new Font("Times New Roman", Font.BOLD, 30));
                l5.setBounds(400, 290, 200, 30);
                panel1.add(l5);
                
                l6 = new JLabel("Phone No.: ");
                l6.setFont(new Font("Times New Roman", Font.BOLD, 30));
                l6.setBounds(400, 340, 200, 30);
                panel1.add(l6);
                
                l7 = new JLabel("Pan Card No.:");
                l7.setFont(new Font("Times New Roman", Font.BOLD, 30));
                l7.setBounds(400, 390, 200, 30);
                panel1.add(l7);
                
                t1 = new JTextField();
	        t1.setBounds(610, 140, 250, 30);
                t1.setBackground(Color.WHITE);
                t1.setEditable(false);
                panel1.add(t1);
                
                t2 = new JTextField();
	        t2.setBounds(610, 190, 250, 30);
                t2.setBackground(Color.WHITE);
                t2.setEditable(false);
                panel1.add(t2);
        
                t3 = new JTextField();
	        t3.setBounds(610, 240, 250, 30);
                t3.setBackground(Color.WHITE);
                t3.setEditable(false);
                panel1.add(t3);
         
                t4 = new JTextField();
	        t4.setBounds(610, 290, 250, 30);
                t4.setBackground(Color.WHITE);
                t4.setEditable(false);
                panel1.add(t4);
        
                t5 = new JTextField();
	        t5.setBounds(610, 340, 250, 30);
                t5.setBackground(Color.WHITE);
                t5.setEditable(false);
                panel1.add(t5);
        
                t6 = new JTextField();
	        t6.setBounds(610, 390, 250, 30);
                t6.setBackground(Color.WHITE);
                t6.setEditable(false);
                panel1.add(t6);
                
        }
        public ProfilePanel(AdminHome a, String username){
            this();
            this.username = username;
            this.a = a;
                try{
                    Conn conn = new Conn();
                    String sql = "select *from adminlogin where username = '"+username+"'";
                    ResultSet rs = conn.s.executeQuery(sql);
                    if(rs.next()){
                        t2.setText(rs.getString("username"));
                        t3.setText(rs.getString("password"));
                    }
                    String sql1 = "select *from admin where username = '"+username+"'";
                    ResultSet rs1 = conn.s.executeQuery(sql1);
                    if(rs1.next()){
                        t1.setText(rs1.getString("name"));
                        t4.setText(rs1.getString("email"));
                        t5.setText(rs1.getString("phone"));
                        t6.setText(rs1.getString("pancard"));
                    }
                }catch(Exception e){}
                
        }
        public ProfilePanel(CustomerHome c, String user){
            this();
            this.user = user;
            this.c = c;
                try{
                    Conn conn = new Conn();
                    String sql = "select *from account where username = '"+user+"'";
                    ResultSet rs = conn.s.executeQuery(sql);
                    if(rs.next()){
                        t1.setText(rs.getString("name"));
                        t2.setText(rs.getString("username"));
                        t3.setText(rs.getString("password"));
                        
                    }
                    String sql1 = "select *from customer where username = '"+user+"'";
                    ResultSet rs1 = conn.s.executeQuery(sql1);
                    if(rs1.next()){
                        t4.setText(rs1.getString("email"));
                        t5.setText(rs1.getString("phone"));
                        t6.setText(rs1.getString("pancard"));
                    }
                }catch(Exception e){}
                
        }
        public void actionPerformed(ActionEvent ae){
            if(ae.getSource() == b1){
                t1.setEditable(true);
                t3.setEditable(true);
                t4.setEditable(true);
                t5.setEditable(true);
                t6.setEditable(true);
                b2.setVisible(true);
                b3.setVisible(true);
               
            }
            if(ae.getSource() == b2){
                t1.setEditable(false);
                t3.setEditable(false);
                t4.setEditable(false);
                t5.setEditable(false);
                t6.setEditable(false);
                b2.setVisible(false);
                b3.setVisible(false);
              
            }
            if(ae.getSource() == b3){
                if(a != null){
                try{
                    Conn conn = new Conn();
                    String sq = "select *from admin where username = '"+username+"'";
                    ResultSet rs1 = conn.s.executeQuery(sq);
                    if(rs1.next()){
                    String sql = "update admin set name=?, username=?, password=?, email=?, phone=?, pancard=? where username ='"+username+"'";
                    PreparedStatement ps = conn.c.prepareStatement(sql);
                    ps.setString(1, t1.getText());
                    ps.setString(2, t2.getText());
                    ps.setString(3, t3.getText());
                    ps.setString(4, t4.getText());
                    ps.setString(5, t5.getText());
                    ps.setString(6, t6.getText());
                    ps.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Update Data Successfully");
                    t1.setEditable(false);
                    t3.setEditable(false);
                    t4.setEditable(false);
                    t5.setEditable(false);
                    t6.setEditable(false);
                    b2.setVisible(false);
                    b3.setVisible(false);
                    String sql1 = "update adminlogin set username=?, password=? where username ='"+username+"'";
                    PreparedStatement ps1 = conn.c.prepareStatement(sql1);
                    ps1.setString(1, t2.getText());
                    ps1.setString(2, t3.getText());
                    ps1.executeUpdate();
                    }else{
                    String sql = "insert into admin values(?, ?, ?, ?, ?, ?)";
                    PreparedStatement ps = conn.c.prepareStatement(sql);
                    ps.setString(1, t1.getText());
                    ps.setString(2, t2.getText());
                    ps.setString(3, t3.getText());
                    ps.setString(4, t4.getText());
                    ps.setString(5, t5.getText());
                    ps.setString(6, t6.getText());
                    ps.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Insert Data Successfully");
                    t1.setEditable(false);
                    t3.setEditable(false);
                    t4.setEditable(false);
                    t5.setEditable(false);
                    t6.setEditable(false);
                    b2.setVisible(false);
                    b3.setVisible(false);
                    String sql1 = "update adminlogin set username=?, password=? where username ='"+username+"'";
                    PreparedStatement ps1 = conn.c.prepareStatement(sql1);
                    ps1.setString(1, t2.getText());
                    ps1.setString(2, t3.getText());
                    ps1.executeUpdate(); 
                    }
                }catch(Exception ae2){}
                }
                if(c != null){
                try{
                    Conn conn = new Conn();
                    String sq = "select *from customer where username = '"+user+"'";
                    ResultSet rs1 = conn.s.executeQuery(sq);
                    if(rs1.next()){
                    String sql = "update customer set name=?, username=?, password=?, email=?, phone=?, pancard=? where username ='"+user+"'";
                    PreparedStatement ps = conn.c.prepareStatement(sql);
                    ps.setString(1, t1.getText());
                    ps.setString(2, t2.getText());
                    ps.setString(3, t3.getText());
                    ps.setString(4, t4.getText());
                    ps.setString(5, t5.getText());
                    ps.setString(6, t6.getText());
                    ps.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Update Data Successfully");
                    c.l1.setText(t1.getText());
                    t1.setEditable(false);
                    t3.setEditable(false);
                    t4.setEditable(false);
                    t5.setEditable(false);
                    t6.setEditable(false);
                    b2.setVisible(false);
                    b3.setVisible(false);
                    String sql1 = "update account set name=?, username=?, password=? where username ='"+user+"'";
                    PreparedStatement ps1 = conn.c.prepareStatement(sql1);
                    ps1.setString(1, t1.getText());
                    ps1.setString(2, t2.getText());
                    ps1.setString(3, t3.getText());
                    ps1.executeUpdate();
                    }else{
                    String sql = "insert into customer values(?, ?, ?, ?, ?, ?)";
                    PreparedStatement ps = conn.c.prepareStatement(sql);
                    ps.setString(1, t1.getText());
                    ps.setString(2, t2.getText());
                    ps.setString(3, t3.getText());
                    ps.setString(4, t4.getText());
                    ps.setString(5, t5.getText());
                    ps.setString(6, t6.getText());
                    ps.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Insert Data Successfully");
                    c.l1.setText(t1.getText());
                    t1.setEditable(false);
                    t3.setEditable(false);
                    t4.setEditable(false);
                    t5.setEditable(false);
                    t6.setEditable(false);
                    b2.setVisible(false);
                    b3.setVisible(false);
                    String sql1 = "update account set name=?, username=?, password=? where username ='"+user+"'";
                    PreparedStatement ps1 = conn.c.prepareStatement(sql1);
                    ps1.setString(1, t1.getText());
                    ps1.setString(2, t2.getText());
                    ps1.setString(3, t3.getText());
                    ps1.executeUpdate(); 
                    }
                }catch(Exception ae2){}
            }
            
            }
            
        }}
