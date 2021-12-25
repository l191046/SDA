package GUI;

import Business.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.ArrayList;
import java.util.HashSet;
import javax.swing.table.DefaultTableModel;

public class JHome extends javax.swing.JFrame {

    private JSystem system;
    private CardLayout cards;
    private ArrayList<JPanel> highlights;
    
            
    public JHome(JSystem system) {
        this.system = system;
       
        initComponents();
        setVisible(true);
        cards = (CardLayout) this.cardstack.getLayout();
        highlights = new ArrayList<JPanel>();
        highlights.add(this.highlight_home);
        highlights.add(this.highlight_flights);
        highlights.add(this.highlight_checkFlight);
        highlights.add(this.highlight_history);
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
        jLabel2 = new javax.swing.JLabel();
        pnl_instructions = new javax.swing.JPanel();
        lbl_instructions = new javax.swing.JLabel();
        pnl_routes = new javax.swing.JPanel();
        scroll_routes = new javax.swing.JScrollPane();
        table_routes = new javax.swing.JTable();
        card_checkFlight = new javax.swing.JPanel();
        backDrop2 = new javax.swing.JPanel();
        lbl_name2 = new javax.swing.JLabel();
        panel_flightCodeBackdrop = new javax.swing.JPanel();
        lbl_enterFlightCode = new javax.swing.JLabel();
        txtbox_flightCode = new javax.swing.JTextField();
        btn_status = new javax.swing.JLabel();
        scroll_status = new javax.swing.JScrollPane();
        table_status = new javax.swing.JTable();
        card_history = new javax.swing.JPanel();
        backDrop3 = new javax.swing.JPanel();
        lbl_name3 = new javax.swing.JLabel();
        panel_enterCNIC = new javax.swing.JPanel();
        lbl_enterCNIC = new javax.swing.JLabel();
        txtbox_cnic = new javax.swing.JTextField();
        btn_checkHistory = new javax.swing.JLabel();
        scroll_history = new javax.swing.JScrollPane();
        table_history = new javax.swing.JTable();

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
        cbox_source.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pakistan", "America", "Canada", "United Kingdom" }));
        cbox_source.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        cbox_destination.setBackground(new java.awt.Color(205, 209, 196));
        cbox_destination.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 12)); // NOI18N
        cbox_destination.setForeground(new java.awt.Color(48, 50, 61));
        cbox_destination.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "United Kingdom", "Pakistan", "America", "Canada" }));

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

        jLabel2.setBackground(new java.awt.Color(77, 80, 97));
        jLabel2.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("SEARCH FLIGHTS");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.setOpaque(true);

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
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pnl_instructions.setBackground(new java.awt.Color(92, 128, 188));
        pnl_instructions.setMaximumSize(new java.awt.Dimension(235, 250));
        pnl_instructions.setMinimumSize(new java.awt.Dimension(235, 250));

        lbl_instructions.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 12)); // NOI18N
        lbl_instructions.setForeground(new java.awt.Color(255, 255, 255));
        lbl_instructions.setText("<html>\n<p align = \"justify\">Enter Your Source and Destination to view a list of all possible flights.</p>\n<p>*Date for departure may be left blank</p>\n<br>\n<h5>NOTE:</h5>\n<p align = \"justify\">Before booking your ticket make sure you have a valid passport and visa. Our airline Will not be responsible for any loss, damages and delays.</p>\n</html>");
        lbl_instructions.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        lbl_instructions.setPreferredSize(new java.awt.Dimension(235, 250));

        javax.swing.GroupLayout pnl_instructionsLayout = new javax.swing.GroupLayout(pnl_instructions);
        pnl_instructions.setLayout(pnl_instructionsLayout);
        pnl_instructionsLayout.setHorizontalGroup(
            pnl_instructionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_instructionsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_instructions, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnl_instructionsLayout.setVerticalGroup(
            pnl_instructionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_instructionsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_instructions, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnl_routes.setBackground(new java.awt.Color(205, 209, 196));

        scroll_routes.setBackground(new java.awt.Color(205, 209, 196));
        scroll_routes.setBorder(null);

        table_routes.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 14)); // NOI18N
        table_routes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                { new Integer(1), "LHE", "FAT", "Monday, 20 DEC 21", "20:00", "DXB, SEA",  new Float(216605.0)},
                { new Integer(2), "LHE", "FAT", "Monday, 20 DEC 21", "12:00", "DXB, SEA", null}
            },
            new String [] {
                "No.", "Source", "Destination", "Departure Date", "Departure Time", "Connections", "Cost/PKR"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Float.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table_routes.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
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
        if (table_routes.getColumnModel().getColumnCount() > 0) {
            table_routes.getColumnModel().getColumn(0).setResizable(false);
            table_routes.getColumnModel().getColumn(1).setResizable(false);
            table_routes.getColumnModel().getColumn(2).setResizable(false);
            table_routes.getColumnModel().getColumn(3).setResizable(false);
            table_routes.getColumnModel().getColumn(4).setResizable(false);
            table_routes.getColumnModel().getColumn(5).setResizable(false);
            table_routes.getColumnModel().getColumn(6).setResizable(false);
        }

        javax.swing.GroupLayout pnl_routesLayout = new javax.swing.GroupLayout(pnl_routes);
        pnl_routes.setLayout(pnl_routesLayout);
        pnl_routesLayout.setHorizontalGroup(
            pnl_routesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_routesLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(scroll_routes))
        );
        pnl_routesLayout.setVerticalGroup(
            pnl_routesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_routesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scroll_routes, javax.swing.GroupLayout.DEFAULT_SIZE, 506, Short.MAX_VALUE)
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
        table_status.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"PK 214", "LHE", "FAT", "12:00", "22:00", "On time"}
            },
            new String [] {
                "Flight Code", "Source", "Destination", "Departure Time", "Arrival Time", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table_status.setGridColor(new java.awt.Color(205, 209, 196));
        table_status.setIntercellSpacing(new java.awt.Dimension(10, 10));
        table_status.setRowHeight(25);
        table_status.setRowSelectionAllowed(false);
        table_status.setSelectionBackground(new java.awt.Color(92, 128, 188));
        table_status.getTableHeader().setReorderingAllowed(false);
        scroll_status.setViewportView(table_status);
        if (table_status.getColumnModel().getColumnCount() > 0) {
            table_status.getColumnModel().getColumn(0).setResizable(false);
            table_status.getColumnModel().getColumn(1).setResizable(false);
            table_status.getColumnModel().getColumn(2).setResizable(false);
            table_status.getColumnModel().getColumn(3).setResizable(false);
            table_status.getColumnModel().getColumn(4).setResizable(false);
            table_status.getColumnModel().getColumn(5).setResizable(false);
        }

        javax.swing.GroupLayout card_checkFlightLayout = new javax.swing.GroupLayout(card_checkFlight);
        card_checkFlight.setLayout(card_checkFlightLayout);
        card_checkFlightLayout.setHorizontalGroup(
            card_checkFlightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(card_checkFlightLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(card_checkFlightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(backDrop2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel_flightCodeBackdrop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(scroll_status))
                .addContainerGap())
        );
        card_checkFlightLayout.setVerticalGroup(
            card_checkFlightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(card_checkFlightLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backDrop2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panel_flightCodeBackdrop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(scroll_status, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(396, Short.MAX_VALUE))
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
        table_history.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"PK 214", "LHE", "FAT", "12:00", "22:00", "On time"}
            },
            new String [] {
                "Flight Code", "Source", "Destination", "Departure Time", "Arrival Time", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
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

        javax.swing.GroupLayout card_historyLayout = new javax.swing.GroupLayout(card_history);
        card_history.setLayout(card_historyLayout);
        card_historyLayout.setHorizontalGroup(
            card_historyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(card_historyLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(card_historyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(backDrop3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel_enterCNIC, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(scroll_history))
                .addContainerGap())
        );
        card_historyLayout.setVerticalGroup(
            card_historyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(card_historyLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backDrop3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panel_enterCNIC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(scroll_history, javax.swing.GroupLayout.DEFAULT_SIZE, 438, Short.MAX_VALUE)
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
            .addComponent(cardstack, javax.swing.GroupLayout.DEFAULT_SIZE, 0, Short.MAX_VALUE)
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
        //go to card_checkFlight
        cards.show(this.cardstack, "card_checkFlight");
        //set highlights of buttons
        setHighlights("highlight_checkFlight");
        //hide table
        this.scroll_status.setVisible(false);
        this.txtbox_flightCode.setBackground(Color.decode("#CDD1C4"));
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
        String flight_id = this.txtbox_flightCode.getText().toString();
        System.out.println(">" + flight_id + "<");
        if (flight_id.equals("")){
            this.txtbox_flightCode.setBackground(Color.decode("#e87c74"));
        }
        else {
            this.txtbox_flightCode.setBackground(Color.decode("#CDD1C4"));
            if (system.checkFlightStatus(Integer.parseInt(flight_id), (DefaultTableModel) this.table_status.getModel())){
                this.scroll_status.setVisible(true);
                this.revalidate();
                this.repaint();
            }
        }
    }//GEN-LAST:event_btn_statusMouseClicked

    private void btn_checkHistoryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_checkHistoryMouseClicked
        this.scroll_history.setVisible(true);
        this.revalidate();
        this.repaint();
    }//GEN-LAST:event_btn_checkHistoryMouseClicked

    private void table_routesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_routesMouseClicked
        int row = this.table_routes.getSelectedRow();
       
        if (row != -1){
            //open customer info form
            String id = table_routes.getModel().getValueAt(row, 0).toString();
            String src = table_routes.getModel().getValueAt(row, 1).toString();
            String dest = table_routes.getModel().getValueAt(row, 2).toString();
            String Ddate = table_routes.getModel().getValueAt(row, 3).toString();
            String Dtime = table_routes.getModel().getValueAt(row, 4).toString();
            String Connections = table_routes.getModel().getValueAt(row, 5).toString();


            JBooking booking = new JBooking(id, src, dest, Ddate, Dtime, Connections);
        }
        
    }//GEN-LAST:event_table_routesMouseClicked


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
    private javax.swing.JLabel btn_status;
    private com.toedter.calendar.JDateChooser cal_calendar;
    private javax.swing.JPanel card_checkFlight;
    private javax.swing.JPanel card_flights;
    private javax.swing.JPanel card_history;
    private javax.swing.JPanel card_home;
    private javax.swing.JPanel cardstack;
    private javax.swing.JComboBox<String> cbox_destination;
    private javax.swing.JComboBox<String> cbox_source;
    private javax.swing.JPanel highlight_checkFlight;
    private javax.swing.JPanel highlight_flights;
    private javax.swing.JPanel highlight_history;
    private javax.swing.JPanel highlight_home;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
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
