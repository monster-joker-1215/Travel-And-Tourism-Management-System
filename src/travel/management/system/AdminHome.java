package travel.management.system;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.event.*;

public class AdminHome extends JFrame implements ActionListener {

    public JPanel contentPane;
    public JPanel profilepanel;

    private final Color buttonbcolor = Color.DARK_GRAY;
    private final Color buttonfcolor = Color.LIGHT_GRAY;
    private final Font buttonfont = new Font("Tw Cen MT", Font.PLAIN, 20);

    JButton b1, b2, b3, b4, b5, b6, b7, b8, btn;

    public int panely = 0, panelx = 250, row = 0;

    public HomePanel homepanel;
    public ProfilePanel yourprofile;
    public PackagePanel packagepanel;
    public HotelPanel hotelpanel;
    public AllCustomerPanel allcustomerpanel;
    public BookedPackagePanel bookedpackagepanel;
    public BookedHotelPanel bookedhotelpanel;

    String username;

    public static void main(String[] args) {
        new AdminHome("").setVisible(true);
    }

    AdminHome(String username) {

        super("AdminHome");
        this.username = username;
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        contentPane = new JPanel();
        contentPane.setBackground(Color.WHITE);
        setContentPane(contentPane);
        contentPane.setLayout(null);

        profilepanel = new JPanel();
        profilepanel.setBounds(5, 7, 240, 63);
        contentPane.add(profilepanel);
        profilepanel.setBackground(Color.DARK_GRAY);
        profilepanel.setLayout(null);

        JLabel l1 = new JLabel("Administrator");
        l1.setForeground(Color.WHITE);
        l1.setFont(new Font("Tw Cen MT", Font.BOLD, 25));
        l1.setBackground(Color.DARK_GRAY);
        l1.setHorizontalAlignment(SwingConstants.CENTER);
        l1.setBounds(0, 14, 240, 36);
        profilepanel.add(l1);

        createHomepanel();

        JPanel sidebarpanel = new JPanel();
        sidebarpanel.setBackground(Color.DARK_GRAY);
        sidebarpanel.setBounds(5, 75, 240, 714);
        contentPane.add(sidebarpanel);
        sidebarpanel.setLayout(null);

        b1 = createButton("Home");
        sidebarpanel.add(b1);
        btn = b1;

        b2 = createButton("Your Profile");
        sidebarpanel.add(b2);

        b3 = createButton("Package");
        sidebarpanel.add(b3);

        b4 = createButton("Hotel");
        sidebarpanel.add(b4);

        b5 = createButton("All Customer");
        sidebarpanel.add(b5);

        b6 = createButton("Booked Package");
        sidebarpanel.add(b6);

        b7 = createButton("Booked hotel");
        sidebarpanel.add(b7);

        b8 = createButton("LogOut");
        sidebarpanel.add(b8);

        activeButton(b1);
        homepanel.setVisible(true);

    }

    public void createHomepanel() {
        homepanel = new HomePanel(this);
        homepanel.setLocation(panelx, panely);
        homepanel.setFocusable(true);
        contentPane.add(homepanel);
    }

    public void activeButton(JButton button) {
        btn.setBackground(buttonbcolor);
        btn.setForeground(buttonfcolor);
        btn.setFont(buttonfont);
        btn = button;
        btn.setForeground(Color.WHITE);
        btn.setFont(new Font("Tw Cen MT", Font.BOLD, 23));
        disablePanel();
    }

    public JButton createButton(String text) {
        JButton button = new JButton(text);
        button.setForeground(buttonfcolor);
        button.setFont(buttonfont);
        button.setBackground(buttonbcolor);
        button.setHorizontalAlignment(SwingConstants.LEFT);
        button.setFocusable(false);
        button.setCursor(new Cursor(Cursor.HAND_CURSOR));
        button.setBorder(new EmptyBorder(0, 0, 0, 0));
        button.addActionListener(this);
        button.setLocation(0, row);
        button.setSize(234, 40);
        row += 40;
        return button;
    }

    public void disablePanel() {
        if (homepanel != null && homepanel.isVisible()) {
            homepanel.setVisible(false);
        } else if (packagepanel != null && packagepanel.isVisible()) {
            packagepanel.setVisible(false);
        } else if (yourprofile != null && yourprofile.isVisible()) {
            yourprofile.setVisible(false);
        } else if (hotelpanel != null && hotelpanel.isVisible()) {
            hotelpanel.setVisible(false);
        }
        else if(allcustomerpanel!=null && allcustomerpanel.isVisible())
		{
		        allcustomerpanel.setVisible(false);
		}
        else if(bookedpackagepanel!=null && bookedpackagepanel.isVisible())
		{
			bookedpackagepanel.setVisible(false);
		}
	else if(bookedhotelpanel!=null && bookedhotelpanel.isVisible())
		{
			bookedhotelpanel.setVisible(false);
		}
	
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        openPanel(e.getSource());
    }

    public void openPanel(Object source) {
        if (source == b1) {
            activeButton(b1);
            homepanel = new HomePanel(this);
            homepanel.setLocation(panelx, panely);
            homepanel.setFocusable(true);
            contentPane.add(homepanel);

        } else if (source == b2) {
            activeButton(b2);
            yourprofile = new ProfilePanel(this, username);
            yourprofile.setLocation(panelx, panely);
            yourprofile.setFocusable(true);
            contentPane.add(yourprofile);

        } else if (source == b3) {
            activeButton(b3);
            packagepanel = new PackagePanel(this);
            packagepanel.setLocation(panelx, panely);
            packagepanel.setFocusable(true);
            contentPane.add(packagepanel);

        } else if (source == b4) {
            activeButton(b4);
            hotelpanel = new HotelPanel(this);
            hotelpanel.setLocation(panelx, panely);
            hotelpanel.setFocusable(true);
            contentPane.add(hotelpanel);

        } else if (source == b5) {
            activeButton(b5);
            allcustomerpanel = new AllCustomerPanel();
            allcustomerpanel.setLocation(panelx, panely);
            allcustomerpanel.setFocusable(true);
            contentPane.add(allcustomerpanel);

        } else if (source == b6) {
            activeButton(b6);
            bookedpackagepanel = new BookedPackagePanel();
            bookedpackagepanel.setLocation(panelx, panely);
            bookedpackagepanel.setFocusable(true);
            contentPane.add(bookedpackagepanel);

        } else if (source == b7) {
            activeButton(b7);
            bookedhotelpanel = new BookedHotelPanel();
            bookedhotelpanel.setLocation(panelx, panely);
            bookedhotelpanel.setFocusable(true);
            contentPane.add(bookedhotelpanel);
            
        } else if (source == b8) {
            activeButton(b8);
            this.dispose();
            new Home().setVisible(true);
            
            
        }

    }

}
