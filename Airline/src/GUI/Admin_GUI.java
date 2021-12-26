package GUI;

import Business.JSystem;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;
import java.util.HashSet;

public class Admin_GUI extends javax.swing.JFrame {
    
    private JSystem system;
    private CardLayout T_cardstack;
    private CardLayout inner_cardstack;
    private ArrayList<JPanel> highlights;
    private ArrayList<JTextField> profile;
    private DefaultTableModel model_flights;
    
    
    public Admin_GUI(JSystem system) {
        this.system = system;
        
        setTableFlights();
        initComponents();
        setVisible(true);
        
        T_cardstack = (CardLayout) this.Top_cardstack.getLayout();
        inner_cardstack = (CardLayout) this.internal_cardstack.getLayout();
        
        highlights = new ArrayList<JPanel>();
        highlights.add(this.highlight_home);
        highlights.add(this.highlight_manageFlights);
        highlights.add(this.highlight_addFlight);
        highlights.add(this.highlight_noFlyList);
        
        profile = new ArrayList<JTextField>();
        profile.add(this.txtbox_firstName);
        profile.add(this.txtbox_lastName);
        profile.add(this.txtbox_CNIC);
        profile.add(this.txtbox_address);
        profile.add(this.txtbox_employment);
        profile.add(this.txtbox_salary);
        
    }
    
    private void setTableFlights(){
        model_flights = new DefaultTableModel();
        String header[] = new String[] {
            "Flight Code", "From", "To", "Departure", "Duration", "Status", "Ticket"
        };
        
        model_flights.setColumnCount(7);
        model_flights.setColumnIdentifiers(header);
    }
    private void populateTableFlights(){
        system.getTableFlights(this.model_flights);
    }
    private void setHighlights(String btn_name){
       for(int i=0; i<highlights.size(); i++){
           JPanel hl = highlights.get(i);
           
           if(hl.getName() == btn_name)
                hl.setBackground(Color.decode("#FEB63E"));
           else
               hl.setBackground(Color.decode("#4D5061"));
       }
    }
    private void setProfile(){
        ArrayList<String> fields = system.getAdmin();
        for (int i=0; i<profile.size(); i++){
            profile.get(i).setText(fields.get(i));
        }
        this.btn_edit.setVisible(false);
    }
    private void clearProfile(){
        for (int i=0; i<profile.size(); i++){
            profile.get(i).setText("");
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Top_cardstack = new javax.swing.JPanel();
        Login_page = new javax.swing.JPanel();
        Sigin_panel = new javax.swing.JPanel();
        Welcome_label = new javax.swing.JLabel();
        txtbox_username = new javax.swing.JTextField();
        Username_label = new javax.swing.JLabel();
        Password_label = new javax.swing.JLabel();
        btn_signin = new javax.swing.JLabel();
        btn_back = new javax.swing.JLabel();
        txtbox_password = new javax.swing.JPasswordField();
        Image_panel = new javax.swing.JPanel();
        image_label = new javax.swing.JLabel();
        Landing_page = new javax.swing.JPanel();
        Navbar = new javax.swing.JPanel();
        highlight_home = new javax.swing.JPanel();
        highlight_manageFlights = new javax.swing.JPanel();
        highlight_addFlight = new javax.swing.JPanel();
        highlight_noFlyList = new javax.swing.JPanel();
        btn_home = new javax.swing.JPanel();
        Home_label = new javax.swing.JLabel();
        btn_manageFlights = new javax.swing.JPanel();
        Manage_flight_label = new javax.swing.JLabel();
        btn_addFlight = new javax.swing.JPanel();
        Add_flight_label = new javax.swing.JLabel();
        btn_noFlyList = new javax.swing.JPanel();
        NoFlyList_label = new javax.swing.JLabel();
        btn_logout = new javax.swing.JLabel();
        internal_cardstack = new javax.swing.JPanel();
        Home = new javax.swing.JPanel();
        panel_empInfoBackdrop = new javax.swing.JPanel();
        lbl_employeeInfo = new javax.swing.JLabel();
        panel_empInfo = new javax.swing.JPanel();
        lbl_firstName = new javax.swing.JLabel();
        txtbox_firstName = new javax.swing.JTextField();
        lbl_lastName = new javax.swing.JLabel();
        txtbox_lastName = new javax.swing.JTextField();
        lbl_CNIC = new javax.swing.JLabel();
        txtbox_CNIC = new javax.swing.JTextField();
        lbl_address = new javax.swing.JLabel();
        txtbox_address = new javax.swing.JTextField();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 200), new java.awt.Dimension(2, 200), new java.awt.Dimension(32767, 200));
        lbl_employment = new javax.swing.JLabel();
        txtbox_employment = new javax.swing.JTextField();
        lbl_salary = new javax.swing.JLabel();
        txtbox_salary = new javax.swing.JTextField();
        btn_edit = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Manage_flights = new javax.swing.JPanel();
        Company_panel2 = new javax.swing.JPanel();
        Company_info_label2 = new javax.swing.JLabel();
        scroll_flights = new javax.swing.JScrollPane();
        table_flights = new javax.swing.JTable();
        btn_removeFlight = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        Add_flight = new javax.swing.JPanel();
        Company_panel1 = new javax.swing.JPanel();
        Company_info_label1 = new javax.swing.JLabel();
        Info_panel2 = new javax.swing.JPanel();
        lbl_flightCode = new javax.swing.JLabel();
        txtbox_flightCode = new javax.swing.JTextField();
        lbl_source = new javax.swing.JLabel();
        txtbox_source = new javax.swing.JTextField();
        lbl_destination = new javax.swing.JLabel();
        txtbox_destination = new javax.swing.JTextField();
        lbl_duration = new javax.swing.JLabel();
        txtbox_duration = new javax.swing.JTextField();
        filler5 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 200), new java.awt.Dimension(2, 200), new java.awt.Dimension(32767, 200));
        lbl_cost = new javax.swing.JLabel();
        txtbox_cost = new javax.swing.JTextField();
        lbl_capacity = new javax.swing.JLabel();
        txtbox_capacity = new javax.swing.JSpinner();
        btn_addNewFlight = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        View_NoFlyList = new javax.swing.JPanel();
        Company_panel3 = new javax.swing.JPanel();
        Company_info_label3 = new javax.swing.JLabel();
        scroll_customer = new javax.swing.JScrollPane();
        table_customers = new javax.swing.JTable();
        btn_addToNoFly = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btn_removeNoFly = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        Top_cardstack.setLayout(new java.awt.CardLayout());

        Sigin_panel.setBackground(new java.awt.Color(254, 182, 62));

        Welcome_label.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 18)); // NOI18N
        Welcome_label.setForeground(new java.awt.Color(255, 255, 255));
        Welcome_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Welcome_label.setText("Welcome to XYZ Airways");

        txtbox_username.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 14)); // NOI18N
        txtbox_username.setBorder(null);
        txtbox_username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbox_usernameActionPerformed(evt);
            }
        });

        Username_label.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 14)); // NOI18N
        Username_label.setForeground(new java.awt.Color(255, 255, 255));
        Username_label.setText("Username");

        Password_label.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 14)); // NOI18N
        Password_label.setForeground(new java.awt.Color(255, 255, 255));
        Password_label.setText("Password");

        btn_signin.setBackground(new java.awt.Color(77, 80, 97));
        btn_signin.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 18)); // NOI18N
        btn_signin.setForeground(new java.awt.Color(255, 255, 255));
        btn_signin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_signin.setText("Sign in");
        btn_signin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_signin.setOpaque(true);
        btn_signin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_signinMouseClicked(evt);
            }
        });

        btn_back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/images/arrow-91-24.png"))); // NOI18N
        btn_back.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_backMouseClicked(evt);
            }
        });

        txtbox_password.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 14)); // NOI18N
        txtbox_password.setBorder(null);

        javax.swing.GroupLayout Sigin_panelLayout = new javax.swing.GroupLayout(Sigin_panel);
        Sigin_panel.setLayout(Sigin_panelLayout);
        Sigin_panelLayout.setHorizontalGroup(
            Sigin_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Sigin_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_back)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Sigin_panelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_signin, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(93, 93, 93))
            .addGroup(Sigin_panelLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(Sigin_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Welcome_label, javax.swing.GroupLayout.Alignment.CENTER, javax.swing.GroupLayout.DEFAULT_SIZE, 257, Short.MAX_VALUE)
                    .addGroup(Sigin_panelLayout.createSequentialGroup()
                        .addGroup(Sigin_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Password_label, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Username_label)
                            .addComponent(txtbox_username)
                            .addComponent(txtbox_password, javax.swing.GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        Sigin_panelLayout.setVerticalGroup(
            Sigin_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Sigin_panelLayout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(Welcome_label)
                .addGap(54, 54, 54)
                .addComponent(Username_label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtbox_username, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Password_label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtbox_password, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_signin, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_back)
                .addContainerGap())
        );

        Image_panel.setBackground(new java.awt.Color(255, 255, 255));

        image_label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/images/Plane_image.jpg"))); // NOI18N

        javax.swing.GroupLayout Image_panelLayout = new javax.swing.GroupLayout(Image_panel);
        Image_panel.setLayout(Image_panelLayout);
        Image_panelLayout.setHorizontalGroup(
            Image_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(image_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        Image_panelLayout.setVerticalGroup(
            Image_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(image_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout Login_pageLayout = new javax.swing.GroupLayout(Login_page);
        Login_page.setLayout(Login_pageLayout);
        Login_pageLayout.setHorizontalGroup(
            Login_pageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Login_pageLayout.createSequentialGroup()
                .addComponent(Sigin_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(Image_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        Login_pageLayout.setVerticalGroup(
            Login_pageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Sigin_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Image_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        Top_cardstack.add(Login_page, "Login_card");
        Login_page.getAccessibleContext().setAccessibleName("Login_page");

        Landing_page.setPreferredSize(new java.awt.Dimension(612, 408));

        Navbar.setBackground(new java.awt.Color(48, 50, 61));

        highlight_home.setBackground(new java.awt.Color(254, 182, 62));
        highlight_home.setName("highlight_home"); // NOI18N

        javax.swing.GroupLayout highlight_homeLayout = new javax.swing.GroupLayout(highlight_home);
        highlight_home.setLayout(highlight_homeLayout);
        highlight_homeLayout.setHorizontalGroup(
            highlight_homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );
        highlight_homeLayout.setVerticalGroup(
            highlight_homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 43, Short.MAX_VALUE)
        );

        highlight_manageFlights.setBackground(new java.awt.Color(77, 80, 97));
        highlight_manageFlights.setName("highlight_manageFlights"); // NOI18N

        javax.swing.GroupLayout highlight_manageFlightsLayout = new javax.swing.GroupLayout(highlight_manageFlights);
        highlight_manageFlights.setLayout(highlight_manageFlightsLayout);
        highlight_manageFlightsLayout.setHorizontalGroup(
            highlight_manageFlightsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );
        highlight_manageFlightsLayout.setVerticalGroup(
            highlight_manageFlightsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        highlight_addFlight.setBackground(new java.awt.Color(77, 80, 97));
        highlight_addFlight.setName("highlight_addFlight"); // NOI18N

        javax.swing.GroupLayout highlight_addFlightLayout = new javax.swing.GroupLayout(highlight_addFlight);
        highlight_addFlight.setLayout(highlight_addFlightLayout);
        highlight_addFlightLayout.setHorizontalGroup(
            highlight_addFlightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );
        highlight_addFlightLayout.setVerticalGroup(
            highlight_addFlightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        highlight_noFlyList.setBackground(new java.awt.Color(77, 80, 97));
        highlight_noFlyList.setName("highlight_noFlyList"); // NOI18N

        javax.swing.GroupLayout highlight_noFlyListLayout = new javax.swing.GroupLayout(highlight_noFlyList);
        highlight_noFlyList.setLayout(highlight_noFlyListLayout);
        highlight_noFlyListLayout.setHorizontalGroup(
            highlight_noFlyListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );
        highlight_noFlyListLayout.setVerticalGroup(
            highlight_noFlyListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        btn_home.setBackground(new java.awt.Color(77, 80, 97));
        btn_home.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_homeMouseClicked(evt);
            }
        });

        Home_label.setBackground(new java.awt.Color(254, 182, 62));
        Home_label.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 14)); // NOI18N
        Home_label.setForeground(new java.awt.Color(255, 255, 255));
        Home_label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/images/home-2-16.png"))); // NOI18N
        Home_label.setText("HOME");
        Home_label.setIconTextGap(5);

        javax.swing.GroupLayout btn_homeLayout = new javax.swing.GroupLayout(btn_home);
        btn_home.setLayout(btn_homeLayout);
        btn_homeLayout.setHorizontalGroup(
            btn_homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_homeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Home_label)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btn_homeLayout.setVerticalGroup(
            btn_homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btn_homeLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Home_label)
                .addContainerGap())
        );

        btn_manageFlights.setBackground(new java.awt.Color(77, 80, 97));
        btn_manageFlights.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_manageFlights.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_manageFlightsMouseClicked(evt);
            }
        });

        Manage_flight_label.setBackground(new java.awt.Color(254, 182, 62));
        Manage_flight_label.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 14)); // NOI18N
        Manage_flight_label.setForeground(new java.awt.Color(255, 255, 255));
        Manage_flight_label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/images/airplane-5-16.png"))); // NOI18N
        Manage_flight_label.setText("MANAGE FLIGHTS");
        Manage_flight_label.setIconTextGap(5);

        javax.swing.GroupLayout btn_manageFlightsLayout = new javax.swing.GroupLayout(btn_manageFlights);
        btn_manageFlights.setLayout(btn_manageFlightsLayout);
        btn_manageFlightsLayout.setHorizontalGroup(
            btn_manageFlightsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_manageFlightsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Manage_flight_label)
                .addContainerGap(37, Short.MAX_VALUE))
        );
        btn_manageFlightsLayout.setVerticalGroup(
            btn_manageFlightsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_manageFlightsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Manage_flight_label)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btn_addFlight.setBackground(new java.awt.Color(77, 80, 97));
        btn_addFlight.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_addFlight.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_addFlightMouseClicked(evt);
            }
        });

        Add_flight_label.setBackground(new java.awt.Color(254, 182, 62));
        Add_flight_label.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 14)); // NOI18N
        Add_flight_label.setForeground(new java.awt.Color(255, 255, 255));
        Add_flight_label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/images/plus-4-16.png"))); // NOI18N
        Add_flight_label.setText("ADD FLIGHT");
        Add_flight_label.setIconTextGap(5);

        javax.swing.GroupLayout btn_addFlightLayout = new javax.swing.GroupLayout(btn_addFlight);
        btn_addFlight.setLayout(btn_addFlightLayout);
        btn_addFlightLayout.setHorizontalGroup(
            btn_addFlightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_addFlightLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Add_flight_label)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btn_addFlightLayout.setVerticalGroup(
            btn_addFlightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_addFlightLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Add_flight_label)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btn_noFlyList.setBackground(new java.awt.Color(77, 80, 97));
        btn_noFlyList.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_noFlyList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_noFlyListMouseClicked(evt);
            }
        });

        NoFlyList_label.setBackground(new java.awt.Color(254, 182, 62));
        NoFlyList_label.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 14)); // NOI18N
        NoFlyList_label.setForeground(new java.awt.Color(255, 255, 255));
        NoFlyList_label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/images/remove-user-16.png"))); // NOI18N
        NoFlyList_label.setText("MANAGE NO-FLY LIST");
        NoFlyList_label.setIconTextGap(5);

        javax.swing.GroupLayout btn_noFlyListLayout = new javax.swing.GroupLayout(btn_noFlyList);
        btn_noFlyList.setLayout(btn_noFlyListLayout);
        btn_noFlyListLayout.setHorizontalGroup(
            btn_noFlyListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_noFlyListLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(NoFlyList_label)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btn_noFlyListLayout.setVerticalGroup(
            btn_noFlyListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_noFlyListLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(NoFlyList_label)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btn_logout.setBackground(new java.awt.Color(77, 80, 97));
        btn_logout.setForeground(new java.awt.Color(255, 255, 255));
        btn_logout.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/images/account-logout-16.png"))); // NOI18N
        btn_logout.setText("LOGOUT");
        btn_logout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_logout.setOpaque(true);
        btn_logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_logoutMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout NavbarLayout = new javax.swing.GroupLayout(Navbar);
        Navbar.setLayout(NavbarLayout);
        NavbarLayout.setHorizontalGroup(
            NavbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NavbarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(NavbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(NavbarLayout.createSequentialGroup()
                        .addComponent(btn_logout, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(NavbarLayout.createSequentialGroup()
                        .addGroup(NavbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(highlight_manageFlights, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(highlight_addFlight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(highlight_noFlyList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(highlight_home, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, 0)
                        .addGroup(NavbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_home, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_manageFlights, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_addFlight, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_noFlyList, javax.swing.GroupLayout.PREFERRED_SIZE, 189, Short.MAX_VALUE))))
                .addContainerGap())
        );
        NavbarLayout.setVerticalGroup(
            NavbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NavbarLayout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(NavbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(highlight_home, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_home, javax.swing.GroupLayout.PREFERRED_SIZE, 43, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(NavbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(highlight_manageFlights, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_manageFlights, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(NavbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(highlight_addFlight, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_addFlight, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(NavbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(highlight_noFlyList, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_noFlyList, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_logout, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        highlight_home.getAccessibleContext().setAccessibleName("highlight_home");
        highlight_manageFlights.getAccessibleContext().setAccessibleName("highlight_manageFlights");
        highlight_addFlight.getAccessibleContext().setAccessibleName("highlight_addFlight");
        highlight_noFlyList.getAccessibleContext().setAccessibleName("highlight_noFlyList");

        internal_cardstack.setLayout(new java.awt.CardLayout());

        Home.setBackground(new java.awt.Color(205, 209, 196));

        panel_empInfoBackdrop.setBackground(new java.awt.Color(254, 182, 62));

        lbl_employeeInfo.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18)); // NOI18N
        lbl_employeeInfo.setForeground(new java.awt.Color(255, 255, 255));
        lbl_employeeInfo.setText("EMPLOYEE INFORMATION");

        javax.swing.GroupLayout panel_empInfoBackdropLayout = new javax.swing.GroupLayout(panel_empInfoBackdrop);
        panel_empInfoBackdrop.setLayout(panel_empInfoBackdropLayout);
        panel_empInfoBackdropLayout.setHorizontalGroup(
            panel_empInfoBackdropLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_empInfoBackdropLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_employeeInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel_empInfoBackdropLayout.setVerticalGroup(
            panel_empInfoBackdropLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_empInfoBackdropLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbl_employeeInfo)
                .addContainerGap())
        );

        panel_empInfo.setBackground(new java.awt.Color(205, 209, 196));
        panel_empInfo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(254, 182, 62), 5, true));

        lbl_firstName.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 14)); // NOI18N
        lbl_firstName.setForeground(new java.awt.Color(48, 50, 61));
        lbl_firstName.setText("First Name:");

        txtbox_firstName.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 14)); // NOI18N
        txtbox_firstName.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(254, 182, 62), 2, true));
        txtbox_firstName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtbox_firstNameKeyTyped(evt);
            }
        });

        lbl_lastName.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 14)); // NOI18N
        lbl_lastName.setForeground(new java.awt.Color(48, 50, 61));
        lbl_lastName.setText("Last Name:");

        txtbox_lastName.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 14)); // NOI18N
        txtbox_lastName.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(254, 182, 62), 2, true));
        txtbox_lastName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtbox_lastNameKeyTyped(evt);
            }
        });

        lbl_CNIC.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 14)); // NOI18N
        lbl_CNIC.setForeground(new java.awt.Color(48, 50, 61));
        lbl_CNIC.setText("CNIC:");

        txtbox_CNIC.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 14)); // NOI18N
        txtbox_CNIC.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(254, 182, 62), 2, true));
        txtbox_CNIC.setFocusable(false);

        lbl_address.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 14)); // NOI18N
        lbl_address.setForeground(new java.awt.Color(48, 50, 61));
        lbl_address.setText("Address:");

        txtbox_address.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 14)); // NOI18N
        txtbox_address.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(254, 182, 62), 2, true));
        txtbox_address.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtbox_addressKeyTyped(evt);
            }
        });

        filler1.setBackground(new java.awt.Color(254, 182, 62));
        filler1.setOpaque(true);

        lbl_employment.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 14)); // NOI18N
        lbl_employment.setForeground(new java.awt.Color(48, 50, 61));
        lbl_employment.setText("Employment");

        txtbox_employment.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 14)); // NOI18N
        txtbox_employment.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(254, 182, 62), 2, true));
        txtbox_employment.setFocusable(false);

        lbl_salary.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 14)); // NOI18N
        lbl_salary.setForeground(new java.awt.Color(48, 50, 61));
        lbl_salary.setText("Salary:");

        txtbox_salary.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 14)); // NOI18N
        txtbox_salary.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(254, 182, 62), 2, true));
        txtbox_salary.setFocusable(false);

        btn_edit.setBackground(new java.awt.Color(77, 80, 97));
        btn_edit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_edit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_editMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/images/edit-3-16.png"))); // NOI18N
        jLabel1.setText("EDIT");
        jLabel1.setIconTextGap(-50);

        javax.swing.GroupLayout btn_editLayout = new javax.swing.GroupLayout(btn_edit);
        btn_edit.setLayout(btn_editLayout);
        btn_editLayout.setHorizontalGroup(
            btn_editLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_editLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel1)
                .addGap(5, 5, 5))
        );
        btn_editLayout.setVerticalGroup(
            btn_editLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_editLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel1)
                .addGap(5, 5, 5))
        );

        javax.swing.GroupLayout panel_empInfoLayout = new javax.swing.GroupLayout(panel_empInfo);
        panel_empInfo.setLayout(panel_empInfoLayout);
        panel_empInfoLayout.setHorizontalGroup(
            panel_empInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_empInfoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_empInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_empInfoLayout.createSequentialGroup()
                        .addComponent(lbl_firstName, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtbox_firstName, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel_empInfoLayout.createSequentialGroup()
                        .addComponent(lbl_lastName, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtbox_lastName, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel_empInfoLayout.createSequentialGroup()
                        .addComponent(lbl_CNIC, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtbox_CNIC, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel_empInfoLayout.createSequentialGroup()
                        .addComponent(lbl_address, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtbox_address, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(panel_empInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_empInfoLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lbl_employment, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtbox_employment, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel_empInfoLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(lbl_salary, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtbox_salary, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(51, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_empInfoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_edit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panel_empInfoLayout.setVerticalGroup(
            panel_empInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_empInfoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_empInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_empInfoLayout.createSequentialGroup()
                        .addGroup(panel_empInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_employment)
                            .addComponent(txtbox_employment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel_empInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_salary)
                            .addComponent(txtbox_salary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panel_empInfoLayout.createSequentialGroup()
                        .addGroup(panel_empInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_firstName)
                            .addComponent(txtbox_firstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel_empInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_lastName)
                            .addComponent(txtbox_lastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel_empInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_CNIC)
                            .addComponent(txtbox_CNIC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel_empInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_address)
                            .addComponent(txtbox_address, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 134, Short.MAX_VALUE)
                .addComponent(btn_edit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout HomeLayout = new javax.swing.GroupLayout(Home);
        Home.setLayout(HomeLayout);
        HomeLayout.setHorizontalGroup(
            HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HomeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panel_empInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel_empInfoBackdrop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        HomeLayout.setVerticalGroup(
            HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HomeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel_empInfoBackdrop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel_empInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        internal_cardstack.add(Home, "Home");

        Company_panel2.setBackground(new java.awt.Color(254, 182, 62));

        Company_info_label2.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18)); // NOI18N
        Company_info_label2.setForeground(new java.awt.Color(255, 255, 255));
        Company_info_label2.setText("FLIGHT INFORMATION");

        javax.swing.GroupLayout Company_panel2Layout = new javax.swing.GroupLayout(Company_panel2);
        Company_panel2.setLayout(Company_panel2Layout);
        Company_panel2Layout.setHorizontalGroup(
            Company_panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Company_panel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Company_info_label2, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(420, Short.MAX_VALUE))
        );
        Company_panel2Layout.setVerticalGroup(
            Company_panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Company_panel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Company_info_label2)
                .addContainerGap())
        );

        scroll_flights.setBorder(null);
        scroll_flights.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 14)); // NOI18N

        table_flights.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        table_flights.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 14)); // NOI18N
        table_flights.setModel(model_flights);
        table_flights.setIntercellSpacing(new java.awt.Dimension(10, 10));
        table_flights.setRowHeight(30);
        table_flights.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_flightsMouseClicked(evt);
            }
        });
        scroll_flights.setViewportView(table_flights);

        btn_removeFlight.setBackground(new java.awt.Color(77, 80, 97));
        btn_removeFlight.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_removeFlight.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_removeFlightMouseClicked(evt);
            }
        });

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/images/minus-4-16.png"))); // NOI18N
        jLabel5.setText("REMOVE");
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel5.setIconTextGap(-80);

        javax.swing.GroupLayout btn_removeFlightLayout = new javax.swing.GroupLayout(btn_removeFlight);
        btn_removeFlight.setLayout(btn_removeFlightLayout);
        btn_removeFlightLayout.setHorizontalGroup(
            btn_removeFlightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btn_removeFlightLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel5)
                .addGap(5, 5, 5))
        );
        btn_removeFlightLayout.setVerticalGroup(
            btn_removeFlightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_removeFlightLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel5)
                .addGap(5, 5, 5))
        );

        javax.swing.GroupLayout Manage_flightsLayout = new javax.swing.GroupLayout(Manage_flights);
        Manage_flights.setLayout(Manage_flightsLayout);
        Manage_flightsLayout.setHorizontalGroup(
            Manage_flightsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Manage_flightsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Manage_flightsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Company_panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(scroll_flights, javax.swing.GroupLayout.PREFERRED_SIZE, 665, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Manage_flightsLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_removeFlight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        Manage_flightsLayout.setVerticalGroup(
            Manage_flightsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Manage_flightsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Company_panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scroll_flights, javax.swing.GroupLayout.DEFAULT_SIZE, 277, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btn_removeFlight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        internal_cardstack.add(Manage_flights, "Manage_flights");

        Add_flight.setBackground(new java.awt.Color(205, 209, 196));

        Company_panel1.setBackground(new java.awt.Color(254, 182, 62));

        Company_info_label1.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18)); // NOI18N
        Company_info_label1.setForeground(new java.awt.Color(255, 255, 255));
        Company_info_label1.setText("ADD NEW FLIGHT");

        javax.swing.GroupLayout Company_panel1Layout = new javax.swing.GroupLayout(Company_panel1);
        Company_panel1.setLayout(Company_panel1Layout);
        Company_panel1Layout.setHorizontalGroup(
            Company_panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Company_panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Company_info_label1, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Company_panel1Layout.setVerticalGroup(
            Company_panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Company_panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Company_info_label1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Info_panel2.setBackground(new java.awt.Color(205, 209, 196));
        Info_panel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(254, 182, 62), 5, true));

        lbl_flightCode.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 14)); // NOI18N
        lbl_flightCode.setForeground(new java.awt.Color(48, 50, 61));
        lbl_flightCode.setText("Flight Code:");

        txtbox_flightCode.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 14)); // NOI18N
        txtbox_flightCode.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(254, 182, 62), 2, true));

        lbl_source.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 14)); // NOI18N
        lbl_source.setForeground(new java.awt.Color(48, 50, 61));
        lbl_source.setText("Source:");

        txtbox_source.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 14)); // NOI18N
        txtbox_source.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(254, 182, 62), 2, true));

        lbl_destination.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 14)); // NOI18N
        lbl_destination.setForeground(new java.awt.Color(48, 50, 61));
        lbl_destination.setText("Destination:");

        txtbox_destination.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 14)); // NOI18N
        txtbox_destination.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(254, 182, 62), 2, true));

        lbl_duration.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 14)); // NOI18N
        lbl_duration.setForeground(new java.awt.Color(48, 50, 61));
        lbl_duration.setText("Duration");

        txtbox_duration.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 14)); // NOI18N
        txtbox_duration.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(254, 182, 62), 2, true));

        filler5.setBackground(new java.awt.Color(254, 182, 62));
        filler5.setOpaque(true);

        lbl_cost.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 14)); // NOI18N
        lbl_cost.setForeground(new java.awt.Color(48, 50, 61));
        lbl_cost.setText("Cost:");

        txtbox_cost.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 14)); // NOI18N
        txtbox_cost.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(254, 182, 62), 2, true));

        lbl_capacity.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 14)); // NOI18N
        lbl_capacity.setForeground(new java.awt.Color(48, 50, 61));
        lbl_capacity.setText("Capacity:");

        txtbox_capacity.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(254, 182, 62), 2, true));

        btn_addNewFlight.setBackground(new java.awt.Color(77, 80, 97));
        btn_addNewFlight.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel6.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/images/plus-4-16.png"))); // NOI18N
        jLabel6.setText("ADD");
        jLabel6.setIconTextGap(-50);

        javax.swing.GroupLayout btn_addNewFlightLayout = new javax.swing.GroupLayout(btn_addNewFlight);
        btn_addNewFlight.setLayout(btn_addNewFlightLayout);
        btn_addNewFlightLayout.setHorizontalGroup(
            btn_addNewFlightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_addNewFlightLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel6)
                .addGap(5, 5, 5))
        );
        btn_addNewFlightLayout.setVerticalGroup(
            btn_addNewFlightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_addNewFlightLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel6)
                .addGap(5, 5, 5))
        );

        javax.swing.GroupLayout Info_panel2Layout = new javax.swing.GroupLayout(Info_panel2);
        Info_panel2.setLayout(Info_panel2Layout);
        Info_panel2Layout.setHorizontalGroup(
            Info_panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Info_panel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Info_panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Info_panel2Layout.createSequentialGroup()
                        .addComponent(lbl_flightCode, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtbox_flightCode, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Info_panel2Layout.createSequentialGroup()
                        .addComponent(lbl_source, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtbox_source, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Info_panel2Layout.createSequentialGroup()
                        .addComponent(lbl_destination, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtbox_destination, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Info_panel2Layout.createSequentialGroup()
                        .addComponent(lbl_duration, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtbox_duration, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(Info_panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Info_panel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(filler5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lbl_cost, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtbox_cost, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Info_panel2Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(lbl_capacity, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtbox_capacity, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(51, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Info_panel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_addNewFlight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        Info_panel2Layout.setVerticalGroup(
            Info_panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Info_panel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Info_panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Info_panel2Layout.createSequentialGroup()
                        .addGroup(Info_panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_cost)
                            .addComponent(txtbox_cost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(Info_panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_capacity)
                            .addComponent(txtbox_capacity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(Info_panel2Layout.createSequentialGroup()
                        .addGroup(Info_panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_flightCode)
                            .addComponent(txtbox_flightCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(Info_panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_source)
                            .addComponent(txtbox_source, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(Info_panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_destination)
                            .addComponent(txtbox_destination, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(Info_panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_duration)
                            .addComponent(txtbox_duration, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(filler5, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 134, Short.MAX_VALUE)
                .addComponent(btn_addNewFlight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout Add_flightLayout = new javax.swing.GroupLayout(Add_flight);
        Add_flight.setLayout(Add_flightLayout);
        Add_flightLayout.setHorizontalGroup(
            Add_flightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Add_flightLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Add_flightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Company_panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Info_panel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        Add_flightLayout.setVerticalGroup(
            Add_flightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Add_flightLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Company_panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Info_panel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        internal_cardstack.add(Add_flight, "Add_flight");
        Add_flight.getAccessibleContext().setAccessibleName("");

        Company_panel3.setBackground(new java.awt.Color(254, 182, 62));

        Company_info_label3.setBackground(new java.awt.Color(254, 182, 62));
        Company_info_label3.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18)); // NOI18N
        Company_info_label3.setForeground(new java.awt.Color(255, 255, 255));
        Company_info_label3.setText("NO FLY LIST");

        javax.swing.GroupLayout Company_panel3Layout = new javax.swing.GroupLayout(Company_panel3);
        Company_panel3.setLayout(Company_panel3Layout);
        Company_panel3Layout.setHorizontalGroup(
            Company_panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Company_panel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Company_info_label3, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Company_panel3Layout.setVerticalGroup(
            Company_panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Company_panel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Company_info_label3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        table_customers.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        table_customers.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 14)); // NOI18N
        table_customers.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Customer CNIC", "First Name", "Last Name", "Contact Number"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        table_customers.setIntercellSpacing(new java.awt.Dimension(10, 10));
        table_customers.setRowHeight(30);
        table_customers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_customersMouseClicked(evt);
            }
        });
        scroll_customer.setViewportView(table_customers);

        btn_addToNoFly.setBackground(new java.awt.Color(77, 80, 97));
        btn_addToNoFly.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_addToNoFly.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_addToNoFlyMouseClicked(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/images/plus-4-16.png"))); // NOI18N
        jLabel2.setText("ADD");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.setIconTextGap(-50);

        javax.swing.GroupLayout btn_addToNoFlyLayout = new javax.swing.GroupLayout(btn_addToNoFly);
        btn_addToNoFly.setLayout(btn_addToNoFlyLayout);
        btn_addToNoFlyLayout.setHorizontalGroup(
            btn_addToNoFlyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_addToNoFlyLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel2)
                .addGap(5, 5, 5))
        );
        btn_addToNoFlyLayout.setVerticalGroup(
            btn_addToNoFlyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_addToNoFlyLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel2)
                .addGap(5, 5, 5))
        );

        btn_removeNoFly.setBackground(new java.awt.Color(77, 80, 97));
        btn_removeNoFly.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_removeNoFly.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_removeNoFlyMouseClicked(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/images/minus-4-16.png"))); // NOI18N
        jLabel3.setText("REMOVE");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.setIconTextGap(-80);

        javax.swing.GroupLayout btn_removeNoFlyLayout = new javax.swing.GroupLayout(btn_removeNoFly);
        btn_removeNoFly.setLayout(btn_removeNoFlyLayout);
        btn_removeNoFlyLayout.setHorizontalGroup(
            btn_removeNoFlyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btn_removeNoFlyLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel3)
                .addGap(5, 5, 5))
        );
        btn_removeNoFlyLayout.setVerticalGroup(
            btn_removeNoFlyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_removeNoFlyLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel3)
                .addGap(5, 5, 5))
        );

        javax.swing.GroupLayout View_NoFlyListLayout = new javax.swing.GroupLayout(View_NoFlyList);
        View_NoFlyList.setLayout(View_NoFlyListLayout);
        View_NoFlyListLayout.setHorizontalGroup(
            View_NoFlyListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(View_NoFlyListLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(View_NoFlyListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Company_panel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(scroll_customer, javax.swing.GroupLayout.DEFAULT_SIZE, 661, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, View_NoFlyListLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btn_removeNoFly, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_addToNoFly, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        View_NoFlyListLayout.setVerticalGroup(
            View_NoFlyListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(View_NoFlyListLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Company_panel3, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scroll_customer, javax.swing.GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE)
                .addGap(43, 43, 43)
                .addGroup(View_NoFlyListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_addToNoFly, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_removeNoFly, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        internal_cardstack.add(View_NoFlyList, "View_NoFlyList");

        javax.swing.GroupLayout Landing_pageLayout = new javax.swing.GroupLayout(Landing_page);
        Landing_page.setLayout(Landing_pageLayout);
        Landing_pageLayout.setHorizontalGroup(
            Landing_pageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Landing_pageLayout.createSequentialGroup()
                .addComponent(Navbar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(internal_cardstack, javax.swing.GroupLayout.PREFERRED_SIZE, 685, Short.MAX_VALUE))
        );
        Landing_pageLayout.setVerticalGroup(
            Landing_pageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(internal_cardstack, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Navbar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        Navbar.getAccessibleContext().setAccessibleName("Navbar");

        Top_cardstack.add(Landing_page, "Landing_page");
        Landing_page.getAccessibleContext().setAccessibleName("Landing_page");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Top_cardstack, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Top_cardstack, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        Top_cardstack.getAccessibleContext().setAccessibleName("Top_cardstack");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtbox_usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbox_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtbox_usernameActionPerformed

    private void btn_signinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_signinMouseClicked
        this.btn_signin.setFocusable(false);    //dont let user click again
        //get username and password
        String username = this.txtbox_username.getText();
        String password = new String(this.txtbox_password.getPassword());
        //clear fields
        this.txtbox_username.setText("");
        this.txtbox_password.setText("");
        
        if (!username.equals("") && !password.equals("") && system.adminSignIn(username, password)){
            setProfile();
            T_cardstack.show(this.Top_cardstack, "Landing_page");
        }
        else{
            this.btn_signin.setFocusable(true); //allow user to click again
        }
        
        
        
    }//GEN-LAST:event_btn_signinMouseClicked

    private void btn_backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_backMouseClicked
        this.dispose();
        JHome home = new JHome(system);
    }//GEN-LAST:event_btn_backMouseClicked

    private void btn_homeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_homeMouseClicked
        setProfile();
        this.inner_cardstack.show(this.internal_cardstack, "Home");
        this.setHighlights("highlight_home");
    }//GEN-LAST:event_btn_homeMouseClicked

    private void btn_manageFlightsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_manageFlightsMouseClicked
        //UPDATE TABLE
        populateTableFlights();
        this.inner_cardstack.show(this.internal_cardstack, "Manage_flights");
        this.setHighlights("highlight_manageFlights");
        this.btn_removeFlight.setVisible(false);
    }//GEN-LAST:event_btn_manageFlightsMouseClicked

    private void btn_addFlightMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_addFlightMouseClicked
        this.inner_cardstack.show(this.internal_cardstack, "Add_flight");
        this.setHighlights("highlight_addFlight");
    }//GEN-LAST:event_btn_addFlightMouseClicked

    private void btn_noFlyListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_noFlyListMouseClicked
        this.inner_cardstack.show(this.internal_cardstack, "View_NoFlyList");
        this.setHighlights("highlight_noFlyList");
        this.btn_removeNoFly.setVisible(false);
    }//GEN-LAST:event_btn_noFlyListMouseClicked

    private void btn_logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_logoutMouseClicked
        system.closeSession();
        this.clearProfile();
        this.T_cardstack.show(this.Top_cardstack, "Login_card");
    }//GEN-LAST:event_btn_logoutMouseClicked

    private void btn_addToNoFlyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_addToNoFlyMouseClicked
        JAddNoFly addNoFly = new JAddNoFly(system);
    }//GEN-LAST:event_btn_addToNoFlyMouseClicked

    private void btn_removeNoFlyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_removeNoFlyMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_removeNoFlyMouseClicked

    private void table_customersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_customersMouseClicked
        int row = this.table_customers.getSelectedRow();
        if (row != -1){
            this.btn_removeNoFly.setVisible(true);
        }
    }//GEN-LAST:event_table_customersMouseClicked

    private void btn_removeFlightMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_removeFlightMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_removeFlightMouseClicked

    private void table_flightsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_flightsMouseClicked
        int row = this.table_flights.getSelectedRow();
        if (row != -1){
            this.btn_removeFlight.setVisible(true);
        }
    }//GEN-LAST:event_table_flightsMouseClicked

    private void txtbox_addressKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtbox_addressKeyTyped
        if (!profile.get(3).equals(this.txtbox_address.getText())){
            this.btn_edit.setVisible(true);
        }
        else {
            this.btn_edit.setVisible(false);
        }
    }//GEN-LAST:event_txtbox_addressKeyTyped

    private void btn_editMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_editMouseClicked
        String new_fname = this.txtbox_firstName.getText();
        String new_lname = this.txtbox_lastName.getText();
        String new_address = this.txtbox_address.getText();
        if (new_fname.equals("") || new_lname.equals("") || new_address.equals("")){
            //validation check
        }
        else {
            
        }
    }//GEN-LAST:event_btn_editMouseClicked

    private void txtbox_firstNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtbox_firstNameKeyTyped
        if (!profile.get(0).equals(this.txtbox_address.getText())){
            this.btn_edit.setVisible(true);
        }
        else {
            this.btn_edit.setVisible(false);
        }
    }//GEN-LAST:event_txtbox_firstNameKeyTyped

    private void txtbox_lastNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtbox_lastNameKeyTyped
        if (!profile.get(1).equals(this.txtbox_address.getText())){
            this.btn_edit.setVisible(true);
        }
        else {
            this.btn_edit.setVisible(true);
        }
    }//GEN-LAST:event_txtbox_lastNameKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Add_flight;
    private javax.swing.JLabel Add_flight_label;
    private javax.swing.JLabel Company_info_label1;
    private javax.swing.JLabel Company_info_label2;
    private javax.swing.JLabel Company_info_label3;
    private javax.swing.JPanel Company_panel1;
    private javax.swing.JPanel Company_panel2;
    private javax.swing.JPanel Company_panel3;
    private javax.swing.JPanel Home;
    private javax.swing.JLabel Home_label;
    private javax.swing.JPanel Image_panel;
    private javax.swing.JPanel Info_panel2;
    private javax.swing.JPanel Landing_page;
    private javax.swing.JPanel Login_page;
    private javax.swing.JLabel Manage_flight_label;
    private javax.swing.JPanel Manage_flights;
    private javax.swing.JPanel Navbar;
    private javax.swing.JLabel NoFlyList_label;
    private javax.swing.JLabel Password_label;
    private javax.swing.JPanel Sigin_panel;
    private javax.swing.JPanel Top_cardstack;
    private javax.swing.JLabel Username_label;
    private javax.swing.JPanel View_NoFlyList;
    private javax.swing.JLabel Welcome_label;
    private javax.swing.JPanel btn_addFlight;
    private javax.swing.JPanel btn_addNewFlight;
    private javax.swing.JPanel btn_addToNoFly;
    private javax.swing.JLabel btn_back;
    private javax.swing.JPanel btn_edit;
    private javax.swing.JPanel btn_home;
    private javax.swing.JLabel btn_logout;
    private javax.swing.JPanel btn_manageFlights;
    private javax.swing.JPanel btn_noFlyList;
    private javax.swing.JPanel btn_removeFlight;
    private javax.swing.JPanel btn_removeNoFly;
    private javax.swing.JLabel btn_signin;
    private javax.swing.Box.Filler filler1;
    private javax.swing.Box.Filler filler5;
    private javax.swing.JPanel highlight_addFlight;
    private javax.swing.JPanel highlight_home;
    private javax.swing.JPanel highlight_manageFlights;
    private javax.swing.JPanel highlight_noFlyList;
    private javax.swing.JLabel image_label;
    private javax.swing.JPanel internal_cardstack;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel lbl_CNIC;
    private javax.swing.JLabel lbl_address;
    private javax.swing.JLabel lbl_capacity;
    private javax.swing.JLabel lbl_cost;
    private javax.swing.JLabel lbl_destination;
    private javax.swing.JLabel lbl_duration;
    private javax.swing.JLabel lbl_employeeInfo;
    private javax.swing.JLabel lbl_employment;
    private javax.swing.JLabel lbl_firstName;
    private javax.swing.JLabel lbl_flightCode;
    private javax.swing.JLabel lbl_lastName;
    private javax.swing.JLabel lbl_salary;
    private javax.swing.JLabel lbl_source;
    private javax.swing.JPanel panel_empInfo;
    private javax.swing.JPanel panel_empInfoBackdrop;
    private javax.swing.JScrollPane scroll_customer;
    private javax.swing.JScrollPane scroll_flights;
    private javax.swing.JTable table_customers;
    private javax.swing.JTable table_flights;
    private javax.swing.JTextField txtbox_CNIC;
    private javax.swing.JTextField txtbox_address;
    private javax.swing.JSpinner txtbox_capacity;
    private javax.swing.JTextField txtbox_cost;
    private javax.swing.JTextField txtbox_destination;
    private javax.swing.JTextField txtbox_duration;
    private javax.swing.JTextField txtbox_employment;
    private javax.swing.JTextField txtbox_firstName;
    private javax.swing.JTextField txtbox_flightCode;
    private javax.swing.JTextField txtbox_lastName;
    private javax.swing.JPasswordField txtbox_password;
    private javax.swing.JTextField txtbox_salary;
    private javax.swing.JTextField txtbox_source;
    private javax.swing.JTextField txtbox_username;
    // End of variables declaration//GEN-END:variables
}
