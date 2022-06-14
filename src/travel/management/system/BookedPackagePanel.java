package travel.management.system;

import javax.swing.*;
import java.awt.*;
import java.sql.*;
import javax.swing.border.*;
import net.proteanit.sql.DbUtils;

public class BookedPackagePanel extends JPanel{
    
    JPanel panel;
    JLabel l1;
    JTable table;
    String user;
    JScrollPane tableviewscroll;
    
    BookedPackagePanel(){
        
                setBorder(new EmptyBorder(0, 0, 0, 0));
		setBackground(Color.WHITE);
		this.setSize(1278, 900);
		setLayout(null); 
        
                panel = new JPanel();
		panel.setBackground(new Color(32, 178, 170));
		panel.setBounds(7, 7, 1278, 160);
		add(panel);
		panel.setLayout(null);
		
		l1 = new JLabel("All Booked Packages");
		l1.setIcon(null);
		l1.setBounds(5, 55, 400, 45);
		panel.add(l1);
		l1.setBackground(new Color(32, 178, 170));
		l1.setForeground(Color.WHITE);
		l1.setFont(new Font("Segoe UI", Font.BOLD, 30));
                
                tableviewscroll = new JScrollPane();
		tableviewscroll.setBorder(new EmptyBorder(0, 0, 0, 0));
		tableviewscroll.setBounds(7, 172, 1271, 617);
		for(Component c : tableviewscroll.getComponents())
		{
			c.setBackground(Color.white);
		}
		add(tableviewscroll);
                  
                table = new JTable();
		table.setBorder(new LineBorder(Color.LIGHT_GRAY));
		table.getTableHeader().setBackground(new Color(32,178,170));
		table.getTableHeader().setForeground(Color.white);
		table.setSelectionBackground(new Color(240, 255, 255));
		table.getTableHeader().setFont(new Font("Arial",Font.BOLD,20));
		table.setFont(new Font("Segoe UI",Font.PLAIN,20));
		table.getTableHeader().setPreferredSize(new Dimension(50,40));
		table.setFocusable(false);
		table.setDragEnabled(false);
		table.setRowHeight(40);
		table.setDefaultEditor(Object.class, null);
		table.setCursor(new Cursor(Cursor.HAND_CURSOR));
		table.setGridColor(Color.LIGHT_GRAY);
		table.getTableHeader().setReorderingAllowed(false);
                tableviewscroll.setViewportView(table);
                
                try{
                 Conn conn = new Conn();
                 String sql = "select place as 'Place Name',name as 'Customer Name',username as 'Username',persons as 'Total Persons',date as 'Date',totalprice as 'Total Price' from bookpackage" ;
                 PreparedStatement ps = conn.c.prepareStatement(sql);
                 ResultSet rs = ps.executeQuery();
		 if(rs!=null){
			table.setModel(DbUtils.resultSetToTableModel(rs));
                 }
		 table.getColumnModel().getColumn(0).setMaxWidth(200);
		 table.getColumnModel().getColumn(1).setMaxWidth(230);
                 table.getColumnModel().getColumn(2).setMaxWidth(200);
                 table.getColumnModel().getColumn(3).setMaxWidth(200);
                 table.getColumnModel().getColumn(4).setMaxWidth(200);
                 table.getColumnModel().getColumn(5).setMaxWidth(241);
            } catch(Exception ae){}
    }
    public BookedPackagePanel(String user){
        this();
        this.user = user;
         try{
                 Conn conn = new Conn();
                 String sql = "select place as 'Place Name',name as 'Customer Name',username as 'Username',persons as 'Total Persons',date as 'Date',totalprice as 'Total Price' from bookpackage where username='"+user+"'" ;
                 PreparedStatement ps = conn.c.prepareStatement(sql);
                 ResultSet rs = ps.executeQuery();
		 if(rs!=null){
			table.setModel(DbUtils.resultSetToTableModel(rs));
                 }
		 table.getColumnModel().getColumn(0).setMaxWidth(200);
		 table.getColumnModel().getColumn(1).setMaxWidth(230);
                 table.getColumnModel().getColumn(2).setMaxWidth(200);
                 table.getColumnModel().getColumn(3).setMaxWidth(200);
                 table.getColumnModel().getColumn(4).setMaxWidth(200);
                 table.getColumnModel().getColumn(5).setMaxWidth(241);
            } catch(Exception ae){}
        
    }
}

    

