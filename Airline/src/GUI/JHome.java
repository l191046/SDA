package GUI;

import Business.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.ArrayList;
import java.util.HashSet;
import javax.swing.table.DefaultTableModel;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

public class JHome extends javax.swing.JFrame {

    private JSystem system;
    private CardLayout cards;
    private ArrayList<JPanel> highlights;
    private DefaultTableModel model_routes;
    private DefaultTableModel model_status;
    private DefaultTableModel model_history;
    private DefaultComboBoxModel model_source;
    private DefaultComboBoxModel model_destination;
    
            
    public JHome(JSystem system) {
        this.system = system;
        
        setTableRoutes();
        setTableStatus();
        setTableHistory();
        setComboAirports();
        
        initComponents();
        setVisible(true);
        setTableRoutesColumns();
        
        this.err_status.setVisible(false);
        this.err_browse.setVisible(false);
        this.err_history.setVisible(false);
        this.btn_sortTime.setVisible(false);
        this.btn_sortCost.setVisible(false);                
        
        cards = (CardLayout) this.cardstack.getLayout();
        highlights = new ArrayList<JPanel>();
        highlights.add(this.highlight_home);
        highlights.add(this.highlight_flights);
        highlights.add(this.highlight_checkFlight);
        highlights.add(this.highlight_history);
        
        LocalDate  date = LocalDate.now();
        populateTableRoutes("US1","DO60",date);
    }
    //SETUP TABLE/COMBO MODELS
    private void setTableRoutes(){
        model_routes = new DefaultTableModel();
        String header[] = new String[] {
            "No.", "From", "To", "Departure Date", "Departure Time",
            "Connections", "Cost/PKR"
        };
        
        model_routes.setColumnCount(header.length);
        model_routes.setColumnIdentifiers(header);
    }
    private void setTableRoutesColumns(){
        this.table_routes.getColumnModel().getColumn(3).setPreferredWidth(100);
        this.table_routes.getColumnModel().getColumn(4).setPreferredWidth(100);
        this.table_routes.getColumnModel().getColumn(5).setPreferredWidth(267);
    }
    private void setTableStatus(){
        model_status = new DefaultTableModel();
        String header[] = new String[] {
            "Flight Code", "From", "To", "Departure Date", "Departure Time", "Expected Arrival Time", "Status"
        };
        model_status.setColumnCount(header.length);
        model_status.setColumnIdentifiers(header);
    }
    private void setTableHistory(){
        model_history = new DefaultTableModel();
        String header[] = new String[] {
            "Flight Code", "From", "To", "Departure Date", "Departure Time", "Arrival Time", "Status"
        };
        model_history.setColumnCount(header.length);
        model_history.setColumnIdentifiers(header);
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
    private void populateTableRoutes(String src, String dest, LocalDate date){
        if (system.findPaths(src, dest, date)){
            system.getPaths(model_routes);
            this.btn_sortTime.setVisible(true);
            this.btn_sortCost.setVisible(true);
        }   
        else {
            this.err_browse.setText("Sorry, no routes found");
            this.err_browse.setVisible(true);
            this.btn_sortTime.setVisible(false);
            this.btn_sortCost.setVisible(false);
            model_routes.setRowCount(0);
        }
    }
    private boolean populateTableStatus(String flightID){
        model_status.setRowCount(0);
        return system.checkFlightStatus(flightID, model_status);
    }
    private void setHighlights(String btn_name){
       for(int i=0; i<highlights.size(); i++){
           JPanel hl = highlights.get(i);
           
           if(hl.getName() == btn_name)
                hl.setBackground(Color.decode("#5C80BC"));
           else
               hl.setBackground(Color.decode("#4D5061"));
       }
    }
    
    private void gotoCheckStatus(){
        //go to card_checkFlight
        cards.show(this.cardstack, "card_checkFlight");
        //set highlights of buttons
        setHighlights("highlight_checkFlight");
        this.scroll_status.setVisible(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sidebar = new javax.swing.JPanel();
        btn_home = new javax.swing.JPanel();
        lbl_home = new javax.swing.JLabel();
        highlight_home = new javax.swing.JPanel();
        btn_flights = new javax.swing.JPanel();
        lbl_home1 = new javax.swing.JLabel();
        highlight_flights = new javax.swing.JPanel();
        btn_checkFlight = new javax.swing.JPanel();
        lbl_home2 = new javax.swing.JLabel();
        highlight_checkFlight = new javax.swing.JPanel();
        btn_history = new javax.swing.JPanel();
        lbl_home3 = new javax.swing.JLabel();
        highlight_history = new javax.swing.JPanel();
        btn_adminLogin = new javax.swing.JLabel();
        cardstack = new javax.swing.JPanel();
        card_home = new javax.swing.JPanel();
        lbl_flyWith = new javax.swing.JLabel();
        backDrop = new javax.swing.JPanel();
        lbl_name = new javax.swing.JLabel();
        lbl_takeOff = new javax.swing.JLabel();
        lbl_tagline = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        card_flights = new javax.swing.JPanel();
        backDrop1 = new javax.swing.JPanel();
        lbl_name1 = new javax.swing.JLabel();
        pnl_lable = new javax.swing.JPanel();
        lbl_search = new javax.swing.JLabel();
        cbox_source = new javax.swing.JComboBox<>();
        cbox_destination = new javax.swing.JComboBox<>();
        lbl_source = new javax.swing.JLabel();
        lbl_destination = new javax.swing.JLabel();
        cal_calendar = new com.toedter.calendar.JDateChooser();
        lbl_date = new javax.swing.JLabel();
        btn_searchFlights = new javax.swing.JLabel();
        pnl_instructions = new javax.swing.JPanel();
        lbl_instructions = new javax.swing.JLabel();
        err_browse = new javax.swing.JLabel();
        pnl_routes = new javax.swing.JPanel();
        scroll_routes = new javax.swing.JScrollPane();
        table_routes = new javax.swing.JTable();
        btn_sortTime = new javax.swing.JLabel();
        btn_sortCost = new javax.swing.JLabel();
        card_checkFlight = new javax.swing.JPanel();
        backDrop2 = new javax.swing.JPanel();
        lbl_name2 = new javax.swing.JLabel();
        panel_flightCodeBackdrop = new javax.swing.JPanel();
        lbl_enterFlightCode = new javax.swing.JLabel();
        txtbox_flightCode = new javax.swing.JTextField();
        btn_status = new javax.swing.JLabel();
        scroll_status = new javax.swing.JScrollPane();
        table_status = new javax.swing.JTable();
        err_status = new javax.swing.JLabel();
        card_history = new javax.swing.JPanel();
        backDrop3 = new javax.swing.JPanel();
        lbl_name3 = new javax.swing.JLabel();
        panel_enterCNIC = new javax.swing.JPanel();
        lbl_enterCNIC = new javax.swing.JLabel();
        txtbox_cnic = new javax.swing.JTextField();
        btn_checkHistory = new javax.swing.JLabel();
        scroll_history = new javax.swing.JScrollPane();
        table_history = new javax.swing.JTable();
        err_history = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        sidebar.setBackground(new java.awt.Color(48, 50, 61));

        btn_home.setBackground(new java.awt.Color(77, 80, 97));
        btn_home.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_homeMouseClicked(evt);
            }
        });

        lbl_home.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 18)); // NOI18N
        lbl_home.setForeground(new java.awt.Color(255, 255, 255));
        lbl_home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/images/home-2-24.png"))); // NOI18N
        lbl_home.setText("HOME");
        lbl_home.setIconTextGap(10);

        javax.swing.GroupLayout btn_homeLayout = new javax.swing.GroupLayout(btn_home);
        btn_home.setLayout(btn_homeLayout);
        btn_homeLayout.setHorizontalGroup(
            btn_homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_homeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_home, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
                .addContainerGap())
        );
        btn_homeLayout.setVerticalGroup(
            btn_homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_homeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_home)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        highlight_home.setBackground(new java.awt.Color(92, 128, 188));
        highlight_home.setName("highlight_home"); // NOI18N

        javax.swing.GroupLayout highlight_homeLayout = new javax.swing.GroupLayout(highlight_home);
        highlight_home.setLayout(highlight_homeLayout);
        highlight_homeLayout.setHorizontalGroup(
            highlight_homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        highlight_homeLayout.setVerticalGroup(
            highlight_homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        btn_flights.setBackground(new java.awt.Color(77, 80, 97));
        btn_flights.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_flights.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_flightsMouseClicked(evt);
            }
        });

        lbl_home1.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 18)); // NOI18N
        lbl_home1.setForeground(new java.awt.Color(255, 255, 255));
        lbl_home1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/images/airplane-5-24.png"))); // NOI18N
        lbl_home1.setText("FLIGHTS");
        lbl_home1.setIconTextGap(10);

        javax.swing.GroupLayout btn_flightsLayout = new javax.swing.GroupLayout(btn_flights);
        btn_flights.setLayout(btn_flightsLayout);
        btn_flightsLayout.setHorizontalGroup(
            btn_flightsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_flightsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_home1, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
                .addContainerGap())
        );
        btn_flightsLayout.setVerticalGroup(
            btn_flightsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btn_flightsLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbl_home1)
                .addContainerGap())
        );

        highlight_flights.setBackground(new java.awt.Color(77, 80, 97));
        highlight_flights.setName("highlight_flights"); // NOI18N

        javax.swing.GroupLayout highlight_flightsLayout = new javax.swing.GroupLayout(highlight_flights);
        highlight_flights.setLayout(highlight_flightsLayout);
        highlight_flightsLayout.setHorizontalGroup(
            highlight_flightsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        highlight_flightsLayout.setVerticalGroup(
            highlight_flightsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        btn_checkFlight.setBackground(new java.awt.Color(77, 80, 97));
        btn_checkFlight.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_checkFlight.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_checkFlightMouseClicked(evt);
            }
        });

        lbl_home2.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 18)); // NOI18N
        lbl_home2.setForeground(new java.awt.Color(255, 255, 255));
        lbl_home2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/images/info-2-24.png"))); // NOI18N
        lbl_home2.setText("CHECK FLIGHT");
        lbl_home2.setIconTextGap(10);

        javax.swing.GroupLayout btn_checkFlightLayout = new javax.swing.GroupLayout(btn_checkFlight);
        btn_checkFlight.setLayout(btn_checkFlightLayout);
        btn_checkFlightLayout.setHorizontalGroup(
            btn_checkFlightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_checkFlightLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_home2, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
                .addContainerGap())
        );
        btn_checkFlightLayout.setVerticalGroup(
            btn_checkFlightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_checkFlightLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_home2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        highlight_checkFlight.setBackground(new java.awt.Color(77, 80, 97));
        highlight_checkFlight.setName("highlight_checkFlight"); // NOI18N

        javax.swing.GroupLayout highlight_checkFlightLayout = new javax.swing.GroupLayout(highlight_checkFlight);
        highlight_checkFlight.setLayout(highlight_checkFlightLayout);
        highlight_checkFlightLayout.setHorizontalGroup(
            highlight_checkFlightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        highlight_checkFlightLayout.setVerticalGroup(
            highlight_checkFlightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        btn_history.setBackground(new java.awt.Color(77, 80, 97));
        btn_history.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_history.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_historyMouseClicked(evt);
            }
        });

        lbl_home3.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 18)); // NOI18N
        lbl_home3.setForeground(new java.awt.Color(255, 255, 255));
        lbl_home3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/images/time-8-24.png"))); // NOI18N
        lbl_home3.setText("HISTORY");
        lbl_home3.setIconTextGap(10);

        javax.swing.GroupLayout btn_historyLayout = new javax.swing.GroupLayout(btn_history);
        btn_history.setLayout(btn_historyLayout);
        btn_historyLayout.setHorizontalGroup(
            btn_historyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_historyLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_home3, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
                .addContainerGap())
        );
        btn_historyLayout.setVerticalGroup(
            btn_historyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_historyLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_home3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        highlight_history.setBackground(new java.awt.Color(77, 80, 97));
        highlight_history.setName("highlight_history"); // NOI18N

        javax.swing.GroupLayout highlight_historyLayout = new javax.swing.GroupLayout(highlight_history);
        highlight_history.setLayout(highlight_historyLayout);
        highlight_historyLayout.setHorizontalGroup(
            highlight_historyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        highlight_historyLayout.setVerticalGroup(
            highlight_historyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        btn_adminLogin.setBackground(new java.awt.Color(77, 80, 97));
        btn_adminLogin.setForeground(new java.awt.Color(255, 255, 255));
        btn_adminLogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_adminLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/images/administrator-24.png"))); // NOI18N
        btn_adminLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_adminLogin.setIconTextGap(10);
        btn_adminLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_adminLoginMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout sidebarLayout = new javax.swing.GroupLayout(sidebar);
        sidebar.setLayout(sidebarLayout);
        sidebarLayout.setHorizontalGroup(
            sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidebarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addGroup(sidebarLayout.createSequentialGroup()
                        .addComponent(highlight_home, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(btn_home, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(sidebarLayout.createSequentialGroup()
                        .addComponent(highlight_flights, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(btn_flights, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(sidebarLayout.createSequentialGroup()
                        .addComponent(highlight_checkFlight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(btn_checkFlight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(sidebarLayout.createSequentialGroup()
                        .addComponent(highlight_history, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(btn_history, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(sidebarLayout.createSequentialGroup()
                .addComponent(btn_adminLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        sidebarLayout.setVerticalGroup(
            sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidebarLayout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addGroup(sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_home, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(highlight_home, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_flights, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(highlight_flights, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_checkFlight, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(highlight_checkFlight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_history, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(highlight_history, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 255, Short.MAX_VALUE)
                .addComponent(btn_adminLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        highlight_home.getAccessibleContext().setAccessibleName("highlight_home");

        cardstack.setBackground(new java.awt.Color(205, 209, 196));
        cardstack.setLayout(new java.awt.CardLayout());

        lbl_flyWith.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 36)); // NOI18N
        lbl_flyWith.setForeground(new java.awt.Color(77, 80, 97));
        lbl_flyWith.setText("Fly, with");

        backDrop.setBackground(new java.awt.Color(77, 80, 97));

        lbl_name.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 48)); // NOI18N
        lbl_name.setForeground(new java.awt.Color(255, 255, 255));
        lbl_name.setText("XYZ AIRWAYS");

        javax.swing.GroupLayout backDropLayout = new javax.swing.GroupLayout(backDrop);
        backDrop.setLayout(backDropLayout);
        backDropLayout.setHorizontalGroup(
            backDropLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backDropLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_name)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        backDropLayout.setVerticalGroup(
            backDropLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backDropLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_name)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lbl_takeOff.setBackground(new java.awt.Color(102, 102, 102));
        lbl_takeOff.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_takeOff.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/images/takeoff_right.png"))); // NOI18N

        lbl_tagline.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 36)); // NOI18N
        lbl_tagline.setForeground(new java.awt.Color(92, 128, 188));
        lbl_tagline.setText("LOREM IPSUM");

        jLabel1.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 18)); // NOI18N
        jLabel1.setText("<html>\n<p align = \"justify\">dolor sit amet, consectetur adipiscing elit. Curabitur sollicitudin nisi ac hendrerit imperdiet. Donec ut suscipit tellus, vitae auctor ligula. Curabitur scelerisque dolor ut ullamcorper mattis. Proin eu lorem vulputate, malesuada diam quis, pharetra ipsum. Integer porta nibh vel blandit molestie. Integer aliquet, urna sed pulvinar rhoncus, metus sapien varius ante, sed iaculis nisl libero sed nulla. Proin sagittis quis augue ut faucibus.</p>\n<br>\n<p align = \"justify\">Proin sagittis turpis eget nibh eleifend, ac eleifend nulla posuere. Nunc maximus diam in aliquet rutrum. Maecenas posuere dictum nisl. Mauris vel est semper, ornare nisl et, semper mi.</p>\n</html>");
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout card_homeLayout = new javax.swing.GroupLayout(card_home);
        card_home.setLayout(card_homeLayout);
        card_homeLayout.setHorizontalGroup(
            card_homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(card_homeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(card_homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(backDrop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(card_homeLayout.createSequentialGroup()
                        .addComponent(lbl_flyWith)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(card_homeLayout.createSequentialGroup()
                        .addComponent(lbl_takeOff, javax.swing.GroupLayout.PREFERRED_SIZE, 456, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(card_homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_tagline, javax.swing.GroupLayout.DEFAULT_SIZE, 553, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))))
                .addContainerGap())
        );
        card_homeLayout.setVerticalGroup(
            card_homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(card_homeLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(lbl_flyWith)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(backDrop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(card_homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_takeOff, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(card_homeLayout.createSequentialGroup()
                        .addComponent(lbl_tagline, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)
                        .addContainerGap())))
        );

        cardstack.add(card_home, "card_home");

        card_flights.setBackground(new java.awt.Color(205, 209, 196));

        backDrop1.setBackground(new java.awt.Color(77, 80, 97));

        lbl_name1.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 48)); // NOI18N
        lbl_name1.setForeground(new java.awt.Color(255, 255, 255));
        lbl_name1.setText("Where to...?");

        javax.swing.GroupLayout backDrop1Layout = new javax.swing.GroupLayout(backDrop1);
        backDrop1.setLayout(backDrop1Layout);
        backDrop1Layout.setHorizontalGroup(
            backDrop1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backDrop1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_name1)
                .addContainerGap(735, Short.MAX_VALUE))
        );
        backDrop1Layout.setVerticalGroup(
            backDrop1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backDrop1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_name1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnl_lable.setBackground(new java.awt.Color(92, 128, 188));

        lbl_search.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 12)); // NOI18N
        lbl_search.setForeground(new java.awt.Color(255, 255, 255));
        lbl_search.setText("Search All Possible Flights");

        cbox_source.setBackground(new java.awt.Color(205, 209, 196));
        cbox_source.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 12)); // NOI18N
        cbox_source.setForeground(new java.awt.Color(48, 50, 61));
        cbox_source.setModel(model_source);
        cbox_source.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        cbox_destination.setBackground(new java.awt.Color(205, 209, 196));
        cbox_destination.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 12)); // NOI18N
        cbox_destination.setForeground(new java.awt.Color(48, 50, 61));
        cbox_destination.setModel(model_destination);

        lbl_source.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 12)); // NOI18N
        lbl_source.setForeground(new java.awt.Color(255, 255, 255));
        lbl_source.setText("Source:");

        lbl_destination.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 12)); // NOI18N
        lbl_destination.setForeground(new java.awt.Color(255, 255, 255));
        lbl_destination.setText("Destination:");

        cal_calendar.setBackground(new java.awt.Color(205, 209, 196));

        lbl_date.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 12)); // NOI18N
        lbl_date.setForeground(new java.awt.Color(255, 255, 255));
        lbl_date.setText("Pick Your Date for Departure:");

        btn_searchFlights.setBackground(new java.awt.Color(77, 80, 97));
        btn_searchFlights.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 12)); // NOI18N
        btn_searchFlights.setForeground(new java.awt.Color(255, 255, 255));
        btn_searchFlights.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_searchFlights.setText("SEARCH FLIGHTS");
        btn_searchFlights.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_searchFlights.setOpaque(true);
        btn_searchFlights.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_searchFlightsMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnl_lableLayout = new javax.swing.GroupLayout(pnl_lable);
        pnl_lable.setLayout(pnl_lableLayout);
        pnl_lableLayout.setHorizontalGroup(
            pnl_lableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_lableLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_lableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cal_calendar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbox_destination, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbox_source, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnl_lableLayout.createSequentialGroup()
                        .addGroup(pnl_lableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_search, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_source, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_destination, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_date, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(btn_searchFlights, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnl_lableLayout.setVerticalGroup(
            pnl_lableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_lableLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(lbl_search)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_source)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbox_source, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbl_destination)
                .addGap(14, 14, 14)
                .addComponent(cbox_destination, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbl_date)
                .addGap(2, 2, 2)
                .addComponent(cal_calendar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(btn_searchFlights, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pnl_instructions.setBackground(new java.awt.Color(92, 128, 188));
        pnl_instructions.setMaximumSize(new java.awt.Dimension(235, 250));
        pnl_instructions.setMinimumSize(new java.awt.Dimension(235, 250));

        lbl_instructions.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 12)); // NOI18N
        lbl_instructions.setForeground(new java.awt.Color(255, 255, 255));
        lbl_instructions.setText("<html>\n<p align = \"justify\">Enter Your Source and Destination to view a list of all possible flights.</p>\n<h5>NOTE:</h5>\n<p align = \"justify\">Before booking your ticket make sure you have a valid passport and visa. Our airline Will not be responsible for any loss, damages and delays.</p>\n</html>");
        lbl_instructions.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        lbl_instructions.setPreferredSize(new java.awt.Dimension(235, 250));

        err_browse.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 14)); // NOI18N
        err_browse.setForeground(new java.awt.Color(214, 40, 40));
        err_browse.setText("ERROR");
        err_browse.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout pnl_instructionsLayout = new javax.swing.GroupLayout(pnl_instructions);
        pnl_instructions.setLayout(pnl_instructionsLayout);
        pnl_instructionsLayout.setHorizontalGroup(
            pnl_instructionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_instructionsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_instructions, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(pnl_instructionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnl_instructionsLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(err_browse, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        pnl_instructionsLayout.setVerticalGroup(
            pnl_instructionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_instructionsLayout.createSequentialGroup()
                .addContainerGap(82, Short.MAX_VALUE)
                .addComponent(lbl_instructions, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(pnl_instructionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnl_instructionsLayout.createSequentialGroup()
                    .addComponent(err_browse, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 180, Short.MAX_VALUE)))
        );

        pnl_routes.setBackground(new java.awt.Color(205, 209, 196));

        scroll_routes.setBackground(new java.awt.Color(205, 209, 196));
        scroll_routes.setBorder(null);

        table_routes.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 14)); // NOI18N
        table_routes.setModel(model_routes);
        table_routes.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        table_routes.setGridColor(new java.awt.Color(205, 209, 196));
        table_routes.setIntercellSpacing(new java.awt.Dimension(10, 10));
        table_routes.setOpaque(false);
        table_routes.setRowHeight(30);
        table_routes.setSelectionBackground(new java.awt.Color(92, 128, 188));
        table_routes.getTableHeader().setReorderingAllowed(false);
        table_routes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_routesMouseClicked(evt);
            }
        });
        scroll_routes.setViewportView(table_routes);

        btn_sortTime.setBackground(new java.awt.Color(77, 80, 97));
        btn_sortTime.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 12)); // NOI18N
        btn_sortTime.setForeground(new java.awt.Color(255, 255, 255));
        btn_sortTime.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_sortTime.setText("Sort by time");
        btn_sortTime.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_sortTime.setOpaque(true);
        btn_sortTime.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_sortTimeMouseClicked(evt);
            }
        });

        btn_sortCost.setBackground(new java.awt.Color(77, 80, 97));
        btn_sortCost.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 12)); // NOI18N
        btn_sortCost.setForeground(new java.awt.Color(255, 255, 255));
        btn_sortCost.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_sortCost.setText("Sort by cost");
        btn_sortCost.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_sortCost.setOpaque(true);
        btn_sortCost.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_sortCostMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnl_routesLayout = new javax.swing.GroupLayout(pnl_routes);
        pnl_routes.setLayout(pnl_routesLayout);
        pnl_routesLayout.setHorizontalGroup(
            pnl_routesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_routesLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(pnl_routesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scroll_routes, javax.swing.GroupLayout.DEFAULT_SIZE, 770, Short.MAX_VALUE)
                    .addGroup(pnl_routesLayout.createSequentialGroup()
                        .addComponent(btn_sortTime, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_sortCost, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        pnl_routesLayout.setVerticalGroup(
            pnl_routesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_routesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scroll_routes, javax.swing.GroupLayout.DEFAULT_SIZE, 469, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_routesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_sortTime, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_sortCost, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout card_flightsLayout = new javax.swing.GroupLayout(card_flights);
        card_flights.setLayout(card_flightsLayout);
        card_flightsLayout.setHorizontalGroup(
            card_flightsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(card_flightsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(card_flightsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(backDrop1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(card_flightsLayout.createSequentialGroup()
                        .addGroup(card_flightsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(pnl_instructions, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pnl_lable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(16, 16, 16)
                        .addComponent(pnl_routes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        card_flightsLayout.setVerticalGroup(
            card_flightsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(card_flightsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backDrop1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(card_flightsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(card_flightsLayout.createSequentialGroup()
                        .addComponent(pnl_lable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(pnl_instructions, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(pnl_routes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        cardstack.add(card_flights, "card_flights");

        backDrop2.setBackground(new java.awt.Color(77, 80, 97));

        lbl_name2.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 48)); // NOI18N
        lbl_name2.setForeground(new java.awt.Color(255, 255, 255));
        lbl_name2.setText("Check your flight status");

        javax.swing.GroupLayout backDrop2Layout = new javax.swing.GroupLayout(backDrop2);
        backDrop2.setLayout(backDrop2Layout);
        backDrop2Layout.setHorizontalGroup(
            backDrop2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backDrop2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_name2)
                .addContainerGap(462, Short.MAX_VALUE))
        );
        backDrop2Layout.setVerticalGroup(
            backDrop2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backDrop2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_name2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panel_flightCodeBackdrop.setBackground(new java.awt.Color(92, 128, 188));

        lbl_enterFlightCode.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 18)); // NOI18N
        lbl_enterFlightCode.setForeground(new java.awt.Color(255, 255, 255));
        lbl_enterFlightCode.setText("ENTER FLIGHT CODE:");

        txtbox_flightCode.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 18)); // NOI18N
        txtbox_flightCode.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtbox_flightCode.setToolTipText("Enter Flight code");
        txtbox_flightCode.setBorder(null);
        txtbox_flightCode.setCaretColor(new java.awt.Color(205, 209, 196));

        btn_status.setBackground(new java.awt.Color(77, 80, 97));
        btn_status.setForeground(new java.awt.Color(255, 255, 255));
        btn_status.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_status.setText("CHECK STATUS");
        btn_status.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_status.setOpaque(true);
        btn_status.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_statusMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panel_flightCodeBackdropLayout = new javax.swing.GroupLayout(panel_flightCodeBackdrop);
        panel_flightCodeBackdrop.setLayout(panel_flightCodeBackdropLayout);
        panel_flightCodeBackdropLayout.setHorizontalGroup(
            panel_flightCodeBackdropLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_flightCodeBackdropLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_enterFlightCode)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtbox_flightCode, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_status, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panel_flightCodeBackdropLayout.setVerticalGroup(
            panel_flightCodeBackdropLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_flightCodeBackdropLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_flightCodeBackdropLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(panel_flightCodeBackdropLayout.createSequentialGroup()
                        .addComponent(txtbox_flightCode)
                        .addGap(2, 2, 2))
                    .addComponent(lbl_enterFlightCode, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_status, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        scroll_status.setBackground(new java.awt.Color(205, 209, 196));
        scroll_status.setBorder(null);
        scroll_status.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 12)); // NOI18N

        table_status.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 18)); // NOI18N
        table_status.setModel(model_status);
        table_status.setGridColor(new java.awt.Color(205, 209, 196));
        table_status.setIntercellSpacing(new java.awt.Dimension(10, 10));
        table_status.setRowHeight(25);
        table_status.setRowSelectionAllowed(false);
        table_status.setSelectionBackground(new java.awt.Color(92, 128, 188));
        table_status.getTableHeader().setReorderingAllowed(false);
        scroll_status.setViewportView(table_status);

        err_status.setBackground(new java.awt.Color(214, 40, 40));
        err_status.setFont(new java.awt.Font("Microsoft JhengHei Light", 1, 14)); // NOI18N
        err_status.setForeground(new java.awt.Color(214, 40, 40));
        err_status.setText("ERROR");

        javax.swing.GroupLayout card_checkFlightLayout = new javax.swing.GroupLayout(card_checkFlight);
        card_checkFlight.setLayout(card_checkFlightLayout);
        card_checkFlightLayout.setHorizontalGroup(
            card_checkFlightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(card_checkFlightLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(card_checkFlightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(backDrop2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel_flightCodeBackdrop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(scroll_status)
                    .addComponent(err_status, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        card_checkFlightLayout.setVerticalGroup(
            card_checkFlightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(card_checkFlightLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backDrop2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panel_flightCodeBackdrop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(err_status)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(scroll_status, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(353, Short.MAX_VALUE))
        );

        cardstack.add(card_checkFlight, "card_checkFlight");

        backDrop3.setBackground(new java.awt.Color(77, 80, 97));

        lbl_name3.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 48)); // NOI18N
        lbl_name3.setForeground(new java.awt.Color(255, 255, 255));
        lbl_name3.setText("Your past trips");

        javax.swing.GroupLayout backDrop3Layout = new javax.swing.GroupLayout(backDrop3);
        backDrop3.setLayout(backDrop3Layout);
        backDrop3Layout.setHorizontalGroup(
            backDrop3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backDrop3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_name3)
                .addContainerGap(670, Short.MAX_VALUE))
        );
        backDrop3Layout.setVerticalGroup(
            backDrop3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backDrop3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_name3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panel_enterCNIC.setBackground(new java.awt.Color(92, 128, 188));

        lbl_enterCNIC.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 18)); // NOI18N
        lbl_enterCNIC.setForeground(new java.awt.Color(255, 255, 255));
        lbl_enterCNIC.setText("ENTER CNIC:");

        txtbox_cnic.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 18)); // NOI18N
        txtbox_cnic.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtbox_cnic.setToolTipText("Enter Flight code");
        txtbox_cnic.setBorder(null);
        txtbox_cnic.setCaretColor(new java.awt.Color(205, 209, 196));

        btn_checkHistory.setBackground(new java.awt.Color(77, 80, 97));
        btn_checkHistory.setForeground(new java.awt.Color(255, 255, 255));
        btn_checkHistory.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_checkHistory.setText("CHECK HISTORY");
        btn_checkHistory.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_checkHistory.setOpaque(true);
        btn_checkHistory.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_checkHistoryMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panel_enterCNICLayout = new javax.swing.GroupLayout(panel_enterCNIC);
        panel_enterCNIC.setLayout(panel_enterCNICLayout);
        panel_enterCNICLayout.setHorizontalGroup(
            panel_enterCNICLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_enterCNICLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_enterCNIC)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtbox_cnic, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_checkHistory, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panel_enterCNICLayout.setVerticalGroup(
            panel_enterCNICLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_enterCNICLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_enterCNICLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panel_enterCNICLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbl_enterCNIC)
                        .addComponent(txtbox_cnic))
                    .addComponent(btn_checkHistory, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        scroll_history.setBackground(new java.awt.Color(205, 209, 196));
        scroll_history.setBorder(null);
        scroll_history.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 12)); // NOI18N

        table_history.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 18)); // NOI18N
        table_history.setModel(model_history);
        table_history.setGridColor(new java.awt.Color(205, 209, 196));
        table_history.setIntercellSpacing(new java.awt.Dimension(10, 10));
        table_history.setRowHeight(25);
        table_history.setRowSelectionAllowed(false);
        table_history.setSelectionBackground(new java.awt.Color(92, 128, 188));
        table_history.getTableHeader().setReorderingAllowed(false);
        scroll_history.setViewportView(table_history);
        if (table_history.getColumnModel().getColumnCount() > 0) {
            table_history.getColumnModel().getColumn(0).setResizable(false);
            table_history.getColumnModel().getColumn(1).setResizable(false);
            table_history.getColumnModel().getColumn(2).setResizable(false);
            table_history.getColumnModel().getColumn(3).setResizable(false);
            table_history.getColumnModel().getColumn(4).setResizable(false);
            table_history.getColumnModel().getColumn(5).setResizable(false);
        }

        err_history.setBackground(new java.awt.Color(214, 40, 40));
        err_history.setFont(new java.awt.Font("Microsoft JhengHei Light", 0, 14)); // NOI18N
        err_history.setForeground(new java.awt.Color(214, 40, 40));
        err_history.setText("ERROR");
        err_history.setToolTipText("");

        javax.swing.GroupLayout card_historyLayout = new javax.swing.GroupLayout(card_history);
        card_history.setLayout(card_historyLayout);
        card_historyLayout.setHorizontalGroup(
            card_historyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(card_historyLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(card_historyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(backDrop3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel_enterCNIC, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(scroll_history)
                    .addGroup(card_historyLayout.createSequentialGroup()
                        .addComponent(err_history, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        card_historyLayout.setVerticalGroup(
            card_historyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(card_historyLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backDrop3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panel_enterCNIC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(err_history, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scroll_history, javax.swing.GroupLayout.DEFAULT_SIZE, 418, Short.MAX_VALUE)
                .addContainerGap())
        );

        cardstack.add(card_history, "card_history");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(sidebar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(cardstack, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(sidebar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(cardstack, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //sets highlights of sidebar buttons. Button passed as parameter is set with active color
    //rest are inactive color
    private void btn_homeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_homeMouseClicked
        //go to card_home
        cards.show(this.cardstack, "card_home");
        //set highlights of buttons
        setHighlights("highlight_home");
    }//GEN-LAST:event_btn_homeMouseClicked

    private void btn_flightsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_flightsMouseClicked
        //go to card_flights
        cards.show(this.cardstack, "card_flights");
        //set highlights of buttons
        setHighlights("highlight_flights");
    }//GEN-LAST:event_btn_flightsMouseClicked

    private void btn_checkFlightMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_checkFlightMouseClicked
        gotoCheckStatus();
    }//GEN-LAST:event_btn_checkFlightMouseClicked

    private void btn_historyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_historyMouseClicked
         //go to card_history
        cards.show(this.cardstack, "card_history");
        //set highlights of buttons
        setHighlights("highlight_history");
        //hide table
        this.scroll_history.setVisible(false);
    }//GEN-LAST:event_btn_historyMouseClicked

    private void btn_adminLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_adminLoginMouseClicked
        //close current frame
        this.dispose();
        //open Admin_GUI
        Admin_GUI aGui = new Admin_GUI(system);
    }//GEN-LAST:event_btn_adminLoginMouseClicked

    private void btn_statusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_statusMouseClicked
        this.btn_status.setFocusable(false);
        this.err_status.setVisible(false);
        String flight_id = this.txtbox_flightCode.getText().toString();
        if (flight_id.equals("")){
            this.err_status.setText("Please enter Flight Code");
            this.err_status.setVisible(true);
        }
        else if (populateTableStatus(flight_id)){
            this.err_status.setVisible(false);
            this.scroll_status.setVisible(true);
            this.revalidate();
            this.repaint();
        }
        else {
            this.err_status.setText("Flight not found");
            this.err_status.setVisible(true);
        }
        this.btn_status.setFocusable(true);
    }//GEN-LAST:event_btn_statusMouseClicked

    private void btn_checkHistoryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_checkHistoryMouseClicked
        this.btn_checkHistory.setFocusable(false);
        this.err_history.setVisible(false);
        String cnic = this.txtbox_cnic.getText();
        if (cnic.equals("")){
            this.err_history.setText("Please enter CNIC");
            this.err_history.setVisible(true);
        }
        else {
            //system class function
            this.scroll_history.setVisible(true);
            this.revalidate();
            this.repaint();
        }
        this.btn_checkHistory.setFocusable(true);
    }//GEN-LAST:event_btn_checkHistoryMouseClicked

    private void table_routesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_routesMouseClicked
        int row = this.table_routes.getSelectedRow();
       
        if (row != -1){
            //open customer info form
//            String id = table_routes.getModel().getValueAt(row, 0).toString();
//            String src = table_routes.getModel().getValueAt(row, 1).toString();
//            String dest = table_routes.getModel().getValueAt(row, 2).toString();
//            String Ddate = table_routes.getModel().getValueAt(row, 3).toString();
//            String Dtime = table_routes.getModel().getValueAt(row, 4).toString();
//            String Connections = table_routes.getModel().getValueAt(row, 5).toString();
            Route r = (Route) table_routes.getModel().getValueAt(row,7);

            JBooking booking = new JBooking(system,r);
        }
        
    }//GEN-LAST:event_table_routesMouseClicked
    private void btn_searchFlightsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_searchFlightsMouseClicked
        this.btn_searchFlights.setFocusable(false);
        this.err_browse.setVisible(false);
        
        String Destination = null;
        String Source = null;
        LocalDate date = null;
        
        String err = "<html>";
        if (this.cbox_source.getSelectedIndex() == 0){  //SOURCE PRESENCE
            err += "<p>Please select source</p>";
        }
        else {
            Destination = this.cbox_destination.getSelectedItem().toString();
        }
        if (this.cbox_destination.getSelectedIndex() == 0){ //DESTINATION PRESENCE
            err += "<p>Please select destination</p>";
        }
        else {
            Source = this.cbox_source.getSelectedItem().toString();
        }
        if (Source != null && Destination != null && Source.equals(Destination)){   //SRC-DEST COMPARISON
            if (this.cbox_source.getSelectedIndex() != 0)
                err += "<p>Select different airports</p>";
        }
        if (this.cal_calendar.getDate() == null){
            err += "<p>Please select date</p>";
        }
        else {
            date = this.cal_calendar.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        }
        if (date != null && date.isBefore(LocalDate.now())){
            err += "<p>Please select future date</p>";
        }
        err += "</html>";
        if (err.equals("<html></html>")){
            populateTableRoutes(Source, Destination, date);
        }
        else {
            this.err_browse.setText(err);
            this.err_browse.setVisible(true);
        }
        this.btn_searchFlights.setFocusable(true);
    }//GEN-LAST:event_btn_searchFlightsMouseClicked

    private void btn_sortTimeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_sortTimeMouseClicked
        system.sortPathTime();
        system.getPaths(model_routes);
    }//GEN-LAST:event_btn_sortTimeMouseClicked

    private void btn_sortCostMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_sortCostMouseClicked
        system.sortPathCost();
        system.getPaths(model_routes);
    }//GEN-LAST:event_btn_sortCostMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel backDrop;
    private javax.swing.JPanel backDrop1;
    private javax.swing.JPanel backDrop2;
    private javax.swing.JPanel backDrop3;
    private javax.swing.JLabel btn_adminLogin;
    private javax.swing.JPanel btn_checkFlight;
    private javax.swing.JLabel btn_checkHistory;
    private javax.swing.JPanel btn_flights;
    private javax.swing.JPanel btn_history;
    private javax.swing.JPanel btn_home;
    private javax.swing.JLabel btn_searchFlights;
    private javax.swing.JLabel btn_sortCost;
    private javax.swing.JLabel btn_sortTime;
    private javax.swing.JLabel btn_status;
    private com.toedter.calendar.JDateChooser cal_calendar;
    private javax.swing.JPanel card_checkFlight;
    private javax.swing.JPanel card_flights;
    private javax.swing.JPanel card_history;
    private javax.swing.JPanel card_home;
    private javax.swing.JPanel cardstack;
    private javax.swing.JComboBox<String> cbox_destination;
    private javax.swing.JComboBox<String> cbox_source;
    private javax.swing.JLabel err_browse;
    private javax.swing.JLabel err_history;
    private javax.swing.JLabel err_status;
    private javax.swing.JPanel highlight_checkFlight;
    private javax.swing.JPanel highlight_flights;
    private javax.swing.JPanel highlight_history;
    private javax.swing.JPanel highlight_home;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lbl_date;
    private javax.swing.JLabel lbl_destination;
    private javax.swing.JLabel lbl_enterCNIC;
    private javax.swing.JLabel lbl_enterFlightCode;
    private javax.swing.JLabel lbl_flyWith;
    private javax.swing.JLabel lbl_home;
    private javax.swing.JLabel lbl_home1;
    private javax.swing.JLabel lbl_home2;
    private javax.swing.JLabel lbl_home3;
    private javax.swing.JLabel lbl_instructions;
    private javax.swing.JLabel lbl_name;
    private javax.swing.JLabel lbl_name1;
    private javax.swing.JLabel lbl_name2;
    private javax.swing.JLabel lbl_name3;
    private javax.swing.JLabel lbl_search;
    private javax.swing.JLabel lbl_source;
    private javax.swing.JLabel lbl_tagline;
    private javax.swing.JLabel lbl_takeOff;
    private javax.swing.JPanel panel_enterCNIC;
    private javax.swing.JPanel panel_flightCodeBackdrop;
    private javax.swing.JPanel pnl_instructions;
    private javax.swing.JPanel pnl_lable;
    private javax.swing.JPanel pnl_routes;
    private javax.swing.JScrollPane scroll_history;
    private javax.swing.JScrollPane scroll_routes;
    private javax.swing.JScrollPane scroll_status;
    private javax.swing.JPanel sidebar;
    private javax.swing.JTable table_history;
    private javax.swing.JTable table_routes;
    private javax.swing.JTable table_status;
    private javax.swing.JTextField txtbox_cnic;
    private javax.swing.JTextField txtbox_flightCode;
    // End of variables declaration//GEN-END:variables
}
