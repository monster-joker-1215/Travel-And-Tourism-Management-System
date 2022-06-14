package travel.management.system;

import java.awt.*;
import java.sql.*;
import javax.swing.*;
import javax.swing.border.*;        

public class HomePanel extends JPanel{
	
        JPanel homeheaderpanel;
	JLabel welcomelabel, l1, l2;
        String user;
	
        HomePanel() {
            
		setBorder(new EmptyBorder(0, 0, 0, 0));
		setBackground(Color.WHITE);
		this.setSize(1278, 900);
		setLayout(null);
		

		homeheaderpanel = new JPanel();
		homeheaderpanel.setBorder(new EmptyBorder(0, 0, 0, 0));
		homeheaderpanel.setBackground(new Color(32, 178, 170));
		homeheaderpanel.setLayout(null);
		homeheaderpanel.setBounds(7, 7, 1278, 63);
		add(homeheaderpanel);
                
                JLabel lblHome = new JLabel("Home Page");
		lblHome.setForeground(Color.WHITE);
                lblHome.setHorizontalAlignment(SwingConstants.LEFT);
		lblHome.setFont(new Font("Segoe UI", Font.BOLD, 29));
		lblHome.setBounds(5, 8, 380, 45);
		homeheaderpanel.add(lblHome);

                ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Travel/Management/System/icons/homepanel.jpeg"));
                Image i2 = i1.getImage().getScaledInstance(1278, 714, Image.SCALE_DEFAULT);
                ImageIcon i3 = new ImageIcon(i2);
                l1 = new JLabel(i3);
                l1.setBounds(7, 75, 1278, 714);
                add(l1); 

		welcomelabel = new JLabel("Welcome");
		welcomelabel.setHorizontalAlignment(SwingConstants.CENTER);
		welcomelabel.setFont(new Font("Segoe UI", Font.BOLD, 35));
		welcomelabel.setForeground(new Color(255, 204, 51));
		welcomelabel.setBounds(0, 300, 1278, 50);
		l1.add(welcomelabel);
                
                l2 = new JLabel();
		l2.setHorizontalAlignment(SwingConstants.CENTER);
		l2.setFont(new Font("Segoe UI", Font.BOLD, 35));
		l2.setForeground(Color.BLUE);
		l2.setBounds(0, 355, 1278, 50);
		l1.add(l2);
}	

	public HomePanel(AdminHome a){
		this();
                l2.setText("Administrator");
	}

	public HomePanel(CustomerHome c, String user) {
		this();
                this.user = user;
                try{
                    Conn conn = new Conn();
                    PreparedStatement ps = conn.c.prepareStatement("select *from account where username='"+user+"'");
                    ResultSet rs = ps.executeQuery();
                    if(rs.next()){
                        l2.setText(rs.getString("name"));
                    }
        }catch(Exception e){}
                
	}
        
        
}