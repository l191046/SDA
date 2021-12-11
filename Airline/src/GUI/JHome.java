package GUI;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.ArrayList;
import java.util.HashSet;

public class JHome extends javax.swing.JFrame {

    private CardLayout cards;
    private ArrayList<JPanel> highlights;
    
            
    public JHome() {
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
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        card_checkFlight = new javax.swing.JPanel();
        backDrop2 = new javax.swing.JPanel();
        lbl_name2 = new javax.swing.JLabel();
        card_history = new javax.swing.JPanel();
        backDrop3 = new javax.swing.JPanel();
        lbl_name3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(null);
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

        javax.swing.GroupLayout sidebarLayout = new javax.swing.GroupLayout(sidebar);
        sidebar.setLayout(sidebarLayout);
        sidebarLayout.setHorizontalGroup(
            sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidebarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sidebarLayout.createSequentialGroup()
                        .addComponent(highlight_home, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(btn_home, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sidebarLayout.createSequentialGroup()
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
                .addContainerGap(287, Short.MAX_VALUE))
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
                            .addComponent(lbl_tagline, javax.swing.GroupLayout.DEFAULT_SIZE, 552, Short.MAX_VALUE)
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


        jLabel2.setText("Search All Possible Flights");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pakistan", "America", "Canada", "United Kingdom" }));
        jComboBox1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "United Kingdom", "Pakistan", "America", "Canada" }));

        jLabel3.setText("Source:");

        jLabel4.setText("Destination:");

        jLabel5.setText("Pick Your Date for Departure:");

        jButton1.setText("Search Flights");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jComboBox1, 0, 213, Short.MAX_VALUE)
                    .addComponent(jComboBox2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(14, 14, 14)
                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addGap(2, 2, 2)
                .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("Enter Your Source and Destination to view \na list of all possible flights.\n\n*other important information\n\n*Date for departure may be left blank\n\n\nNOTE:\nBefore booking your ticket make sure\nyou have a valid passport and visa. \nOur airline Will not be responsible\nfor any loss, damages and delays.\n");
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 235, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE))
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"1", "Pakistan", "USA", null, "Pakistan->USA", "$20,000"},
                {"2", "Pakistan", "USA", null, "Pakistan->Dubai->USA", "$50,000"},
                {"3", "Pakistan", "USA", null, "Pakistan->China->USA", "$50,000"}
            },
            new String [] {
                "Route Id", "Src", "Dest", "DOD", "All Connecting Flights", "Cost"
            }
        ));
        jTable1.setColumnSelectionAllowed(true);
        jScrollPane2.setViewportView(jTable1);
        jTable1.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 532, Short.MAX_VALUE)
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
                        .addGroup(card_flightsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
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
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
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
                .addContainerGap(461, Short.MAX_VALUE))
        );
        backDrop2Layout.setVerticalGroup(
            backDrop2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backDrop2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_name2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout card_checkFlightLayout = new javax.swing.GroupLayout(card_checkFlight);
        card_checkFlight.setLayout(card_checkFlightLayout);
        card_checkFlightLayout.setHorizontalGroup(
            card_checkFlightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(card_checkFlightLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backDrop2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        card_checkFlightLayout.setVerticalGroup(
            card_checkFlightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(card_checkFlightLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backDrop2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(539, Short.MAX_VALUE))
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
                .addContainerGap(669, Short.MAX_VALUE))
        );
        backDrop3Layout.setVerticalGroup(
            backDrop3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backDrop3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_name3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout card_historyLayout = new javax.swing.GroupLayout(card_history);
        card_history.setLayout(card_historyLayout);
        card_historyLayout.setHorizontalGroup(
            card_historyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(card_historyLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backDrop3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        card_historyLayout.setVerticalGroup(
            card_historyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(card_historyLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backDrop3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(539, Short.MAX_VALUE))
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
            .addComponent(cardstack, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
    }//GEN-LAST:event_btn_checkFlightMouseClicked

    private void btn_historyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_historyMouseClicked
         //go to card_history
        cards.show(this.cardstack, "card_history");
        //set highlights of buttons
        setHighlights("highlight_history");
    }//GEN-LAST:event_btn_historyMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel backDrop;
    private javax.swing.JPanel backDrop1;
    private javax.swing.JPanel backDrop2;
    private javax.swing.JPanel backDrop3;
    private javax.swing.JPanel btn_checkFlight;
    private javax.swing.JPanel btn_flights;
    private javax.swing.JPanel btn_history;
    private javax.swing.JPanel btn_home;
    private javax.swing.JPanel card_checkFlight;
    private javax.swing.JPanel card_flights;
    private javax.swing.JPanel card_history;
    private javax.swing.JPanel card_home;
    private javax.swing.JPanel cardstack;
    private javax.swing.JPanel highlight_checkFlight;
    private javax.swing.JPanel highlight_flights;
    private javax.swing.JPanel highlight_history;
    private javax.swing.JPanel highlight_home;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel lbl_flyWith;
    private javax.swing.JLabel lbl_home;
    private javax.swing.JLabel lbl_home1;
    private javax.swing.JLabel lbl_home2;
    private javax.swing.JLabel lbl_home3;
    private javax.swing.JLabel lbl_name;
    private javax.swing.JLabel lbl_name1;
    private javax.swing.JLabel lbl_name2;
    private javax.swing.JLabel lbl_name3;
    private javax.swing.JLabel lbl_tagline;
    private javax.swing.JLabel lbl_takeOff;
    private javax.swing.JPanel sidebar;
    // End of variables declaration//GEN-END:variables
}
