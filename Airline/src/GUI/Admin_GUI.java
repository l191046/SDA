package GUI;

import Business.JSystem;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.DefaultComboBoxModel;
import java.util.ArrayList;
import java.time.*;
import java.math.*;
import java.util.HashSet;

public class Admin_GUI extends javax.swing.JFrame {
    
    private JSystem system;
    private CardLayout T_cardstack;
    private CardLayout inner_cardstack;
    private ArrayList<JPanel> highlights;
    private ArrayList<JTextField> profile;
    private DefaultTableModel model_flights;
    private DefaultTableModel model_nofly;
    private DefaultComboBoxModel model_status;
    private DefaultComboBoxModel model_source;
    private DefaultComboBoxModel model_destination;
    private ArrayList<JLabel> errors_home;
    private ArrayList<JLabel> errors_addFlight;
    
    public Admin_GUI(JSystem system) {
        this.system = system;
        
        //set arrays/tables/combobox models
        setTableFlights();
        setTableNoFly();
        setComboStatus();
        setComboAirports();
        //initialize swing components
        initComponents();
        setVisible(true);
        setErrorsHome();
        setErrorsAddFlight();
        this.err_username.setVisible(false);
        this.err_password.setVisible(false);
        
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
    
    //SETUP ERROR LABEL LISTS
    private void setErrorsHome(){
        errors_home = new ArrayList<JLabel>();
        for (Component label : this.panel_empInfo.getComponents()) {
            if (label.getName() != null && label.getName().equals("ERROR")){
                errors_home.add((JLabel)label);
            }
        }
        hideErrorsHome();
    }
    private void hideErrorsHome(){
        for (JLabel error : errors_home){
            error.setVisible(false);
        }
    }
    private void setErrorsAddFlight(){
        errors_addFlight = new ArrayList<JLabel>();
        for (Component label : this.Info_panel2.getComponents()) {
            if (label.getName() != null && label.getName().equals("ERROR")){
                errors_addFlight.add((JLabel)label);
            }
        }
        hideErrorsAddFlight();
    }
    private void hideErrorsAddFlight(){
        for (JLabel error : errors_addFlight){
            error.setVisible(false);
        }
    }
    
    //SETUP TABLE FORMAT
    private void setTableFlights(){
        model_flights = new DefaultTableModel();
        String header[] = new String[] {
            "Flight Code", "From", "To", "Departure", "Duration", "Status", "Cost"
        };
        
        model_flights.setColumnCount(7);
        model_flights.setColumnIdentifiers(header);
    }
    private void setTableNoFly(){
        model_nofly = new DefaultTableModel();
        String header[] = new String[] {
            "First Name", "Last Name", "CNIC", "Address", "Contact"
        };
        
        model_nofly.setColumnCount(5);
        model_nofly.setColumnIdentifiers(header);
    }
    private void setComboStatus(){
        model_status = new DefaultComboBoxModel();
        model_status.insertElementAt("On time", 0);
        model_status.insertElementAt("Cancelled", 1);
    }
    private void setComboAirports(){
        model_source = new DefaultComboBoxModel();
        model_destination = new DefaultComboBoxModel();
        model_source.addElement("Select Airport");
        system.getComboAirports(model_source);
        model_destination.addElement("Select Airport");
        system.getComboAirports(model_destination);
    }
    //LOAD TABLE DATA
    private void populateTableFlights(){
        this.model_flights.setRowCount(0);
        system.getTableFlights(this.model_flights);
    }
    private void populateTableNoFly(){
        this.model_nofly.setRowCount(0);
        system.getTableNoFly(model_nofly);
    }
    
    private void setProfile(){
        ArrayList<String> fields = new ArrayList<String>();
        system.getAdminProfile(fields);
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
    private void clearFlightForm(){
        this.txtbox_flightCode.setText("");
        this.txtbox_cost.setText("");
        this.spinner_hours.setValue(0);
        this.spinner_minutes.setValue(0);
        this.spinner_hoursD.setValue(0);
        this.spinner_minutesD.setValue(0);
        this.combo_source.setSelectedIndex(0);
        this.combo_destination.setSelectedIndex(0);
        this.calendar_departure.setDate(null);
    }
    
    //GOTO PAGE FUNCTIONS
    public void gotoManageFlights(){
        //UPDATE TABLE
        populateTableFlights();
        this.inner_cardstack.show(this.internal_cardstack, "Manage_flights");
        this.setHighlights("highlight_manageFlights");
        this.btn_removeFlight.setVisible(false);
        this.btn_view.setVisible(false);
        this.combo_status.setVisible(false);
    }
    public void gotoNoFly(){
        //UPDATE TABLE
        populateTableNoFly();
        this.inner_cardstack.show(this.internal_cardstack, "View_NoFlyList");
        this.setHighlights("highlight_noFlyList");
        this.btn_removeNoFly.setVisible(false);
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
        err_username = new javax.swing.JLabel();
        err_password = new javax.swing.JLabel();
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
        err_Home1 = new javax.swing.JLabel();
        err_Home2 = new javax.swing.JLabel();
        err_Home3 = new javax.swing.JLabel();
        Manage_flights = new javax.swing.JPanel();
        Company_panel2 = new javax.swing.JPanel();
        Company_info_label2 = new javax.swing.JLabel();
        scroll_flights = new javax.swing.JScrollPane();
        table_flights = new javax.swing.JTable();
        btn_removeFlight = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        combo_status = new javax.swing.JComboBox<>();
        btn_view = new javax.swing.JPanel();
        lbl_view = new javax.swing.JLabel();
        Add_flight = new javax.swing.JPanel();
        Company_panel1 = new javax.swing.JPanel();
        Company_info_label1 = new javax.swing.JLabel();
        Info_panel2 = new javax.swing.JPanel();
        lbl_flightCode = new javax.swing.JLabel();
        txtbox_flightCode = new javax.swing.JTextField();
        lbl_source = new javax.swing.JLabel();
        lbl_destination = new javax.swing.JLabel();
        lbl_duration = new javax.swing.JLabel();
        filler5 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 200), new java.awt.Dimension(2, 200), new java.awt.Dimension(32767, 200));
        lbl_cost = new javax.swing.JLabel();
        txtbox_cost = new javax.swing.JTextField();
        btn_addNewFlight = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        lbl_time = new javax.swing.JLabel();
        calendar_departure = new com.toedter.calendar.JDateChooser();
        combo_source = new javax.swing.JComboBox<>();
        combo_destination = new javax.swing.JComboBox<>();
        lbl_duration2 = new javax.swing.JLabel();
        lbl_separator = new javax.swing.JLabel();
        spinner_hours = new javax.swing.JSpinner();
        spinner_minutes = new javax.swing.JSpinner();
        spinner_hoursD = new javax.swing.JSpinner();
        lbl_separator1 = new javax.swing.JLabel();
        spinner_minutesD = new javax.swing.JSpinner();
        err_AddFlight1 = new javax.swing.JLabel();
        err_AddFlight2 = new javax.swing.JLabel();
        err_AddFlight3 = new javax.swing.JLabel();
        err_AddFlight7 = new javax.swing.JLabel();
        err_AddFlight5 = new javax.swing.JLabel();
        err_AddFlight6 = new javax.swing.JLabel();
        err_AddFlight4 = new javax.swing.JLabel();
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

        err_username.setBackground(new java.awt.Color(214, 40, 40));
        err_username.setFont(new java.awt.Font("Microsoft JhengHei Light", 1, 12)); // NOI18N
        err_username.setForeground(new java.awt.Color(214, 40, 40));
        err_username.setText("ERROR");

        err_password.setBackground(new java.awt.Color(214, 40, 40));
        err_password.setFont(new java.awt.Font("Microsoft JhengHei Light", 1, 12)); // NOI18N
        err_password.setForeground(new java.awt.Color(214, 40, 40));
        err_password.setText("ERROR");

        javax.swing.GroupLayout Sigin_panelLayout = new javax.swing.GroupLayout(Sigin_panel);
        Sigin_panel.setLayout(Sigin_panelLayout);
        Sigin_panelLayout.setHorizontalGroup(
            Sigin_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Sigin_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_back)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(Sigin_panelLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(Sigin_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Welcome_label, javax.swing.GroupLayout.Alignment.CENTER, javax.swing.GroupLayout.DEFAULT_SIZE, 257, Short.MAX_VALUE)
                    .addGroup(Sigin_panelLayout.createSequentialGroup()
                        .addGroup(Sigin_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Password_label, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Username_label)
                            .addComponent(txtbox_username)
                            .addComponent(txtbox_password, javax.swing.GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE)
                            .addComponent(err_username, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(err_password, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Sigin_panelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_signin, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(90, 90, 90))
        );
        Sigin_panelLayout.setVerticalGroup(
            Sigin_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Sigin_panelLayout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(Welcome_label)
                .addGap(31, 31, 31)
                .addComponent(Username_label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtbox_username, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(err_username)
                .addGap(13, 13, 13)
                .addComponent(Password_label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtbox_password, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(err_password)
                .addGap(18, 18, 18)
                .addComponent(btn_signin, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
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
                            .addComponent(btn_noFlyList, javax.swing.GroupLayout.PREFERRED_SIZE, 190, Short.MAX_VALUE))))
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

        err_Home1.setBackground(new java.awt.Color(214, 40, 40));
        err_Home1.setFont(new java.awt.Font("Microsoft JhengHei Light", 1, 12)); // NOI18N
        err_Home1.setForeground(new java.awt.Color(214, 40, 40));
        err_Home1.setText("ERROR");
        err_Home1.setName("ERROR"); // NOI18N

        err_Home2.setBackground(new java.awt.Color(214, 40, 40));
        err_Home2.setFont(new java.awt.Font("Microsoft JhengHei Light", 1, 12)); // NOI18N
        err_Home2.setForeground(new java.awt.Color(214, 40, 40));
        err_Home2.setText("ERROR");
        err_Home2.setName("ERROR"); // NOI18N

        err_Home3.setBackground(new java.awt.Color(214, 40, 40));
        err_Home3.setFont(new java.awt.Font("Microsoft JhengHei Light", 1, 12)); // NOI18N
        err_Home3.setForeground(new java.awt.Color(214, 40, 40));
        err_Home3.setText("ERROR");
        err_Home3.setName("ERROR"); // NOI18N

        javax.swing.GroupLayout panel_empInfoLayout = new javax.swing.GroupLayout(panel_empInfo);
        panel_empInfo.setLayout(panel_empInfoLayout);
        panel_empInfoLayout.setHorizontalGroup(
            panel_empInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_empInfoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_empInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_empInfoLayout.createSequentialGroup()
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
                        .addGap(0, 39, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_empInfoLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btn_edit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(err_Home1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(err_Home2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(err_Home3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addGap(23, 23, 23)
                .addComponent(err_Home1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(err_Home2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(err_Home3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
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

        combo_status.setModel(model_status);
        combo_status.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                combo_statusItemStateChanged(evt);
            }
        });
        combo_status.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_statusActionPerformed(evt);
            }
        });

        btn_view.setBackground(new java.awt.Color(77, 80, 97));
        btn_view.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_view.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_viewMouseClicked(evt);
            }
        });

        lbl_view.setBackground(new java.awt.Color(255, 255, 255));
        lbl_view.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 14)); // NOI18N
        lbl_view.setForeground(new java.awt.Color(255, 255, 255));
        lbl_view.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/images/info-16.png"))); // NOI18N
        lbl_view.setText("VIEW");
        lbl_view.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_view.setIconTextGap(-80);

        javax.swing.GroupLayout btn_viewLayout = new javax.swing.GroupLayout(btn_view);
        btn_view.setLayout(btn_viewLayout);
        btn_viewLayout.setHorizontalGroup(
            btn_viewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btn_viewLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(lbl_view)
                .addGap(5, 5, 5))
        );
        btn_viewLayout.setVerticalGroup(
            btn_viewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_viewLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(lbl_view)
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
                .addComponent(combo_status, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_view, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_removeFlight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        Manage_flightsLayout.setVerticalGroup(
            Manage_flightsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Manage_flightsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Company_panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scroll_flights, javax.swing.GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(Manage_flightsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_removeFlight, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(combo_status)
                    .addComponent(btn_view, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

        lbl_destination.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 14)); // NOI18N
        lbl_destination.setForeground(new java.awt.Color(48, 50, 61));
        lbl_destination.setText("Destination:");

        lbl_duration.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 14)); // NOI18N
        lbl_duration.setForeground(new java.awt.Color(48, 50, 61));
        lbl_duration.setText("Duration:");

        filler5.setBackground(new java.awt.Color(254, 182, 62));
        filler5.setOpaque(true);

        lbl_cost.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 14)); // NOI18N
        lbl_cost.setForeground(new java.awt.Color(48, 50, 61));
        lbl_cost.setText("Ticket Price:");

        txtbox_cost.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 14)); // NOI18N
        txtbox_cost.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(254, 182, 62), 2, true));

        btn_addNewFlight.setBackground(new java.awt.Color(77, 80, 97));
        btn_addNewFlight.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_addNewFlight.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_addNewFlightMouseClicked(evt);
            }
        });

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

        lbl_time.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 14)); // NOI18N
        lbl_time.setForeground(new java.awt.Color(48, 50, 61));
        lbl_time.setText("Time:");

        combo_source.setModel(model_source);

        combo_destination.setModel(model_destination);

        lbl_duration2.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 14)); // NOI18N
        lbl_duration2.setForeground(new java.awt.Color(48, 50, 61));
        lbl_duration2.setText("Departure:");

        lbl_separator.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 14)); // NOI18N
        lbl_separator.setForeground(new java.awt.Color(48, 50, 61));
        lbl_separator.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_separator.setText(":");

        spinner_hours.setModel(new javax.swing.SpinnerNumberModel(0, 0, 23, 1));

        spinner_minutes.setModel(new javax.swing.SpinnerNumberModel(0, 0, 59, 1));

        spinner_hoursD.setModel(new javax.swing.SpinnerNumberModel(0, 0, 99, 1));

        lbl_separator1.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 14)); // NOI18N
        lbl_separator1.setForeground(new java.awt.Color(48, 50, 61));
        lbl_separator1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_separator1.setText(":");

        spinner_minutesD.setModel(new javax.swing.SpinnerNumberModel(0, 0, 59, 1));

        err_AddFlight1.setBackground(new java.awt.Color(214, 40, 40));
        err_AddFlight1.setFont(new java.awt.Font("Microsoft JhengHei Light", 1, 12)); // NOI18N
        err_AddFlight1.setForeground(new java.awt.Color(214, 40, 40));
        err_AddFlight1.setText("ERROR");
        err_AddFlight1.setName("ERROR"); // NOI18N

        err_AddFlight2.setBackground(new java.awt.Color(214, 40, 40));
        err_AddFlight2.setFont(new java.awt.Font("Microsoft JhengHei Light", 1, 12)); // NOI18N
        err_AddFlight2.setForeground(new java.awt.Color(214, 40, 40));
        err_AddFlight2.setText("ERROR");
        err_AddFlight2.setName("ERROR"); // NOI18N

        err_AddFlight3.setBackground(new java.awt.Color(214, 40, 40));
        err_AddFlight3.setFont(new java.awt.Font("Microsoft JhengHei Light", 1, 12)); // NOI18N
        err_AddFlight3.setForeground(new java.awt.Color(214, 40, 40));
        err_AddFlight3.setText("ERROR");
        err_AddFlight3.setName("ERROR"); // NOI18N

        err_AddFlight7.setBackground(new java.awt.Color(214, 40, 40));
        err_AddFlight7.setFont(new java.awt.Font("Microsoft JhengHei Light", 1, 12)); // NOI18N
        err_AddFlight7.setForeground(new java.awt.Color(214, 40, 40));
        err_AddFlight7.setText("ERROR");
        err_AddFlight7.setName("ERROR"); // NOI18N

        err_AddFlight5.setBackground(new java.awt.Color(214, 40, 40));
        err_AddFlight5.setFont(new java.awt.Font("Microsoft JhengHei Light", 1, 12)); // NOI18N
        err_AddFlight5.setForeground(new java.awt.Color(214, 40, 40));
        err_AddFlight5.setText("ERROR");
        err_AddFlight5.setName("ERROR"); // NOI18N

        err_AddFlight6.setBackground(new java.awt.Color(214, 40, 40));
        err_AddFlight6.setFont(new java.awt.Font("Microsoft JhengHei Light", 1, 12)); // NOI18N
        err_AddFlight6.setForeground(new java.awt.Color(214, 40, 40));
        err_AddFlight6.setText("ERROR");
        err_AddFlight6.setName("ERROR"); // NOI18N

        err_AddFlight4.setBackground(new java.awt.Color(214, 40, 40));
        err_AddFlight4.setFont(new java.awt.Font("Microsoft JhengHei Light", 1, 12)); // NOI18N
        err_AddFlight4.setForeground(new java.awt.Color(214, 40, 40));
        err_AddFlight4.setText("ERROR");
        err_AddFlight4.setName("ERROR"); // NOI18N

        javax.swing.GroupLayout Info_panel2Layout = new javax.swing.GroupLayout(Info_panel2);
        Info_panel2.setLayout(Info_panel2Layout);
        Info_panel2Layout.setHorizontalGroup(
            Info_panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Info_panel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Info_panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Info_panel2Layout.createSequentialGroup()
                        .addComponent(err_AddFlight4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(292, 292, 292)
                        .addComponent(btn_addNewFlight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Info_panel2Layout.createSequentialGroup()
                        .addGroup(Info_panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(err_AddFlight3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(err_AddFlight2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(err_AddFlight1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(Info_panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(Info_panel2Layout.createSequentialGroup()
                                    .addComponent(lbl_flightCode, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtbox_flightCode, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(Info_panel2Layout.createSequentialGroup()
                                    .addComponent(lbl_source, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(combo_source, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(Info_panel2Layout.createSequentialGroup()
                                    .addComponent(lbl_destination, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(combo_destination, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(Info_panel2Layout.createSequentialGroup()
                                    .addComponent(lbl_duration, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(spinner_hoursD, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(lbl_separator1, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(spinner_minutesD, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addComponent(filler5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(Info_panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Info_panel2Layout.createSequentialGroup()
                                .addComponent(lbl_duration2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(calendar_departure, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(Info_panel2Layout.createSequentialGroup()
                                .addGroup(Info_panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(Info_panel2Layout.createSequentialGroup()
                                        .addComponent(lbl_time, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(spinner_hours, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lbl_separator, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(spinner_minutes, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(Info_panel2Layout.createSequentialGroup()
                                        .addComponent(lbl_cost, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtbox_cost, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(err_AddFlight5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(err_AddFlight6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(err_AddFlight7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(0, 45, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        Info_panel2Layout.setVerticalGroup(
            Info_panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Info_panel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Info_panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(Info_panel2Layout.createSequentialGroup()
                        .addGroup(Info_panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(filler5, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(Info_panel2Layout.createSequentialGroup()
                                .addGroup(Info_panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(calendar_departure, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(Info_panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lbl_flightCode)
                                        .addComponent(txtbox_flightCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(lbl_duration2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(Info_panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(Info_panel2Layout.createSequentialGroup()
                                        .addGroup(Info_panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(lbl_source)
                                            .addComponent(combo_source, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(Info_panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(lbl_destination)
                                            .addComponent(combo_destination, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(9, 9, 9)
                                        .addGroup(Info_panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(lbl_duration, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(spinner_hoursD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lbl_separator1)
                                            .addComponent(spinner_minutesD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(Info_panel2Layout.createSequentialGroup()
                                        .addGroup(Info_panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(lbl_time)
                                            .addComponent(spinner_hours, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lbl_separator)
                                            .addComponent(spinner_minutes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(Info_panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(lbl_cost)
                                            .addComponent(txtbox_cost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE)))))
                        .addGap(30, 30, 30)
                        .addComponent(err_AddFlight1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(err_AddFlight2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(err_AddFlight3))
                    .addGroup(Info_panel2Layout.createSequentialGroup()
                        .addComponent(err_AddFlight5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(err_AddFlight6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(err_AddFlight7)))
                .addGroup(Info_panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Info_panel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_addNewFlight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(Info_panel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(err_AddFlight4)
                        .addContainerGap(40, Short.MAX_VALUE))))
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
        table_customers.setModel(model_nofly);
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
                .addComponent(scroll_customer, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)
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
        hideErrorsHome();
        boolean isValid = true;
        //get username and password
        String username = this.txtbox_username.getText();
        String password = new String(this.txtbox_password.getPassword());
        
        //VALIDATION
        if (username.equals("")){
            this.err_username.setText("Username required");
            this.err_username.setVisible(true);
            isValid = false;
        }
        else {
            this.err_username.setVisible(false);
        }
        if (password.equals("")){
            this.err_password.setText("Password required");
            this.err_password.setVisible(true);
            isValid = false;
        }
        else {
            this.err_password.setVisible(false);
        }

        //clear fields
        this.txtbox_username.setText("");
        this.txtbox_password.setText("");
        
        if (!isValid){  //invalid input
            this.btn_signin.setFocusable(true); //allow user to click again
        }
        else if (system.adminSignIn(username, password)) {  //successful signin
            setProfile();
            T_cardstack.show(this.Top_cardstack, "Landing_page");
            err_username.setVisible(false);
            err_password.setVisible(false);
        }
        else {  //unsuccessful signin
            this.err_username.setText("Incorrect Username/Password");
            this.err_password.setText("Incorrect Username/Password");
            this.err_username.setVisible(true);
            this.err_password.setVisible(true);
            this.btn_signin.setFocusable(true); //allow user to click again
        }
    }//GEN-LAST:event_btn_signinMouseClicked

    private void btn_backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_backMouseClicked
        this.dispose();
        JHome home = new JHome(system);
    }//GEN-LAST:event_btn_backMouseClicked

    private void btn_homeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_homeMouseClicked
        this.btn_home.setFocusable(false);
        setProfile();
        this.inner_cardstack.show(this.internal_cardstack, "Home");
        this.setHighlights("highlight_home");
        this.btn_home.setFocusable(true);
    }//GEN-LAST:event_btn_homeMouseClicked

    private void btn_manageFlightsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_manageFlightsMouseClicked
        this.btn_manageFlights.setFocusable(false);
        gotoManageFlights();
        this.btn_manageFlights.setFocusable(true);
    }//GEN-LAST:event_btn_manageFlightsMouseClicked

    private void btn_addFlightMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_addFlightMouseClicked
        this.btn_addFlight.setFocusable(false);
        this.inner_cardstack.show(this.internal_cardstack, "Add_flight");
        this.setHighlights("highlight_addFlight");
        this.btn_addFlight.setFocusable(true);
    }//GEN-LAST:event_btn_addFlightMouseClicked

    private void btn_noFlyListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_noFlyListMouseClicked
        this.btn_noFlyList.setFocusable(false);
        gotoNoFly();
        this.btn_noFlyList.setFocusable(true);
    }//GEN-LAST:event_btn_noFlyListMouseClicked

    private void btn_logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_logoutMouseClicked
        this.btn_logout.setFocusable(false);
        system.closeSession();
        this.clearProfile();
        this.T_cardstack.show(this.Top_cardstack, "Login_card");
        this.btn_logout.setFocusable(true);
    }//GEN-LAST:event_btn_logoutMouseClicked

    private void btn_addToNoFlyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_addToNoFlyMouseClicked
        this.btn_addToNoFly.setFocusable(false);
        JAddNoFly addNoFly = new JAddNoFly(system, this);
        this.btn_addToNoFly.setFocusable(true);
    }//GEN-LAST:event_btn_addToNoFlyMouseClicked

    private void btn_removeNoFlyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_removeNoFlyMouseClicked
        this.btn_removeNoFly.setFocusable(false);
        int row = this.table_customers.getSelectedRow();
        String cnic = new String(model_nofly.getValueAt(row, 2).toString());
        system.removeFromNoFly(cnic);
        gotoNoFly();
        this.btn_removeNoFly.setFocusable(true);
    }//GEN-LAST:event_btn_removeNoFlyMouseClicked

    private void table_customersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_customersMouseClicked
        this.table_customers.setFocusable(false);
        int row = this.table_customers.getSelectedRow();
        if (row != -1){
            this.btn_removeNoFly.setVisible(true);
        }
        this.table_customers.setFocusable(true);
    }//GEN-LAST:event_table_customersMouseClicked

    private void btn_removeFlightMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_removeFlightMouseClicked
        this.btn_removeFlight.setFocusable(false);
        
        DefaultTableModel flightsTable = (DefaultTableModel) this.table_flights.getModel();
        int row = this.table_flights.getSelectedRow();
        
        String flightID = flightsTable.getValueAt(row, 0).toString(); //get flightID to be removed
        system.removeFlight(flightID);
        gotoManageFlights();
        this.btn_removeFlight.setFocusable(true);
    }//GEN-LAST:event_btn_removeFlightMouseClicked

    private void table_flightsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_flightsMouseClicked
        this.table_flights.setFocusable(false);
        int row = this.table_flights.getSelectedRow();
        if (row != -1){
            this.btn_removeFlight.setVisible(true);
            this.btn_view.setVisible(true);
            this.combo_status.setVisible(true);
            int col = model_flights.findColumn("Status");
            String status = model_flights.getValueAt(row, col).toString();
            this.combo_status.setSelectedItem(status);
        }
        this.table_flights.setFocusable(true);
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
        this.btn_edit.setFocusable(false); //lock button
        
        String cnic = this.txtbox_CNIC.getText();
        String new_fname = this.txtbox_firstName.getText();
        String new_lname = this.txtbox_lastName.getText();
        String new_address = this.txtbox_address.getText();
        
        int errNo = 0;
        if (new_fname.equals("")){
            errors_home.get(errNo).setText("First name required");
            errors_home.get(errNo).setVisible(true);
            errNo++;
        }
        if (new_lname.equals("")){
            errors_home.get(errNo).setText("Lirst name required");
            errors_home.get(errNo).setVisible(true);
            errNo++;
        }
        if (new_address.equals("")){
            errors_home.get(errNo).setText("Address required");
            errors_home.get(errNo).setVisible(true);
            errNo++;
        }
        
        if (errNo == 0){
            system.editAdmin(cnic,new_fname, new_lname, new_address);
            setProfile();
            this.btn_edit.setVisible(false);
            hideErrorsHome();
        }
        
        this.btn_edit.setFocusable(true); //unlock button
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

    private void combo_statusItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_combo_statusItemStateChanged
        int row = this.table_flights.getSelectedRow();
        if (row != -1){
            int col = model_flights.findColumn("Status");
            String status = model_flights.getValueAt(row, col).toString();
            String new_status = this.combo_status.getSelectedItem().toString();
            if (!new_status.equals(status)){
                col = model_flights.findColumn("Flight Code");
                String flightID = model_flights.getValueAt(row, col).toString();
                system.changeStatus(flightID, new_status);
                gotoManageFlights();
            }
        }
    }//GEN-LAST:event_combo_statusItemStateChanged

    private void btn_addNewFlightMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_addNewFlightMouseClicked
        this.btn_addFlight.setFocusable(false);
        hideErrorsAddFlight();
        int errNo = 0;
        
        String flightID = this.txtbox_flightCode.getText();
        String source = this.combo_source.getSelectedItem().toString();
        String destination = this.combo_destination.getSelectedItem().toString();
        
        int dHours = (int)this.spinner_hoursD.getValue();
        int dMinutes = (int)this.spinner_minutesD.getValue();
        LocalTime duration = LocalTime.of(dHours, dMinutes);
        
        LocalDateTime departure = null;
        if (this.calendar_departure.getDate() != null){
            LocalDate tDate = tDate = this.calendar_departure.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            int tHours = (int)this.spinner_hours.getValue();
            int tMinutes = (int)this.spinner_minutes.getValue();
            departure = tDate.atTime(tHours, tMinutes);
        }
        
        String costS = this.txtbox_cost.getText();
        
        float cost = -1;
        try {
            cost = Float.parseFloat(costS);
        }
        catch(Exception e) {
            cost = -1;
        }
        
        if (flightID.equals("")){
            errors_addFlight.get(errNo).setText("FlightID required");
            errors_addFlight.get(errNo).setVisible(true);
            errNo++;
        }
        if (source.equals("Select Airport")){
            errors_addFlight.get(errNo).setText("Source airport required");
            errors_addFlight.get(errNo).setVisible(true);
            errNo++;
        }
        if (destination.equals("Select Airport")){
            errors_addFlight.get(errNo).setText("Destination airport required");
            errors_addFlight.get(errNo).setVisible(true);
            errNo++;
        }
        if (departure == null){
            errors_addFlight.get(errNo).setText("Departure date required");
            errors_addFlight.get(errNo).setVisible(true);
            errNo++;
        }
        if (duration == null || duration.equals(LocalTime.of(0,0))){
            errors_addFlight.get(errNo).setText("Duration required");
            errors_addFlight.get(errNo).setVisible(true);
            errNo++;
        }
        if (cost < 0){
            errors_addFlight.get(errNo).setText("Enter valid amount");
            errors_addFlight.get(errNo).setVisible(true);
            errNo++;
        }
        if (source.equals(destination) && !source.equals("Select Airport")){
            errors_addFlight.get(errNo).setText("Source and Destination can't be the same");
            errors_addFlight.get(errNo).setVisible(true);
            errNo++;
        }
        
        if (errNo == 0) {
            if (system.addFlight(flightID, source, destination, duration, departure, cost)){
                clearFlightForm();
                hideErrorsAddFlight();
            }
            else {
                errors_addFlight.get(errNo).setText("Please enter unique FlightID");
                errors_addFlight.get(errNo).setVisible(true);
                errNo++;
            }
        }
        this.btn_addFlight.setFocusable(true);
    }//GEN-LAST:event_btn_addNewFlightMouseClicked

    private void combo_statusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_statusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combo_statusActionPerformed

    private void btn_viewMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_viewMouseClicked
        this.btn_view.setFocusable(false);
        int row = this.table_flights.getSelectedRow();
        if (row != -1){
            int col = model_flights.findColumn("Flight Code");
            String flightID = model_flights.getValueAt(row, col).toString();
            JCustomerList customers = new JCustomerList(flightID);
        }
        this.btn_view.setFocusable(true);
    }//GEN-LAST:event_btn_viewMouseClicked


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
    private javax.swing.JPanel btn_removeFlight1;
    private javax.swing.JPanel btn_removeNoFly;
    private javax.swing.JLabel btn_signin;
    private javax.swing.JPanel btn_view;
    private com.toedter.calendar.JDateChooser calendar_departure;
    private javax.swing.JComboBox<String> combo_destination;
    private javax.swing.JComboBox<String> combo_source;
    private javax.swing.JComboBox<String> combo_status;
    private javax.swing.JLabel err_AddFlight1;
    private javax.swing.JLabel err_AddFlight2;
    private javax.swing.JLabel err_AddFlight3;
    private javax.swing.JLabel err_AddFlight4;
    private javax.swing.JLabel err_AddFlight5;
    private javax.swing.JLabel err_AddFlight6;
    private javax.swing.JLabel err_AddFlight7;
    private javax.swing.JLabel err_Home1;
    private javax.swing.JLabel err_Home2;
    private javax.swing.JLabel err_Home3;
    private javax.swing.JLabel err_password;
    private javax.swing.JLabel err_username;
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
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel lbl_CNIC;
    private javax.swing.JLabel lbl_address;
    private javax.swing.JLabel lbl_cost;
    private javax.swing.JLabel lbl_destination;
    private javax.swing.JLabel lbl_duration;
    private javax.swing.JLabel lbl_duration2;
    private javax.swing.JLabel lbl_employeeInfo;
    private javax.swing.JLabel lbl_employment;
    private javax.swing.JLabel lbl_firstName;
    private javax.swing.JLabel lbl_flightCode;
    private javax.swing.JLabel lbl_lastName;
    private javax.swing.JLabel lbl_salary;
    private javax.swing.JLabel lbl_separator;
    private javax.swing.JLabel lbl_separator1;
    private javax.swing.JLabel lbl_source;
    private javax.swing.JLabel lbl_time;
    private javax.swing.JLabel lbl_view;
    private javax.swing.JPanel panel_empInfo;
    private javax.swing.JPanel panel_empInfoBackdrop;
    private javax.swing.JScrollPane scroll_customer;
    private javax.swing.JScrollPane scroll_flights;
    private javax.swing.JSpinner spinner_hours;
    private javax.swing.JSpinner spinner_hoursD;
    private javax.swing.JSpinner spinner_minutes;
    private javax.swing.JSpinner spinner_minutesD;
    private javax.swing.JTable table_customers;
    private javax.swing.JTable table_flights;
    private javax.swing.JTextField txtbox_CNIC;
    private javax.swing.JTextField txtbox_address;
    private javax.swing.JTextField txtbox_cost;
    private javax.swing.JTextField txtbox_employment;
    private javax.swing.JTextField txtbox_firstName;
    private javax.swing.JTextField txtbox_flightCode;
    private javax.swing.JTextField txtbox_lastName;
    private javax.swing.JPasswordField txtbox_password;
    private javax.swing.JTextField txtbox_salary;
    private javax.swing.JTextField txtbox_username;
    // End of variables declaration//GEN-END:variables
}

