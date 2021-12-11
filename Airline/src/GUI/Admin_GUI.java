/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.ArrayList;
import java.util.HashSet;

public class Admin_GUI extends javax.swing.JFrame {
    private CardLayout T_cardstack;
    private CardLayout inner_cardstack;
    /**
     * Creates new form Admin_GUI
     */
    public Admin_GUI() {
        initComponents();
        T_cardstack = (CardLayout) this.Top_cardstack.getLayout();
        inner_cardstack = (CardLayout) this.internal_cardstack.getLayout();
        
        
    }
    
   

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Top_cardstack = new javax.swing.JPanel();
        Login_page = new javax.swing.JPanel();
        Sigin_panel = new javax.swing.JPanel();
        Welcome_label = new javax.swing.JLabel();
        Username_field = new javax.swing.JTextField();
        Password_field = new javax.swing.JTextField();
        Username_label = new javax.swing.JLabel();
        Password_label = new javax.swing.JLabel();
        Signin_label = new javax.swing.JLabel();
        Image_panel = new javax.swing.JPanel();
        image_label = new javax.swing.JLabel();
        Landing_page = new javax.swing.JPanel();
        Navbar = new javax.swing.JPanel();
        Home_Highlight = new javax.swing.JPanel();
        Home_label = new javax.swing.JLabel();
        Manage_flight_highlight = new javax.swing.JPanel();
        Manage_flight_label = new javax.swing.JLabel();
        Add_flight_label = new javax.swing.JLabel();
        Add_flight_highlight = new javax.swing.JPanel();
        NoFlyList_label = new javax.swing.JLabel();
        NoFlyList_highlight = new javax.swing.JPanel();
        internal_cardstack = new javax.swing.JPanel();
        Home = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Manage_flights = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        Add_flight = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        View_NoFlyList = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Top_cardstack.setLayout(new java.awt.CardLayout());

        Sigin_panel.setBackground(new java.awt.Color(247, 127, 0));

        Welcome_label.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 18)); // NOI18N
        Welcome_label.setForeground(new java.awt.Color(255, 255, 255));
        Welcome_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Welcome_label.setText("Welcome to XYZ Airlines");

        Username_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Username_fieldActionPerformed(evt);
            }
        });

        Password_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Password_fieldActionPerformed(evt);
            }
        });

        Username_label.setForeground(new java.awt.Color(255, 255, 255));
        Username_label.setText("Username");

        Password_label.setForeground(new java.awt.Color(255, 255, 255));
        Password_label.setText("Password");

        Signin_label.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 18)); // NOI18N
        Signin_label.setForeground(new java.awt.Color(255, 255, 255));
        Signin_label.setText("Sign in");
        Signin_label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Signin_labelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Sigin_panelLayout = new javax.swing.GroupLayout(Sigin_panel);
        Sigin_panel.setLayout(Sigin_panelLayout);
        Sigin_panelLayout.setHorizontalGroup(
            Sigin_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Sigin_panelLayout.createSequentialGroup()
                .addGroup(Sigin_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Sigin_panelLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(Sigin_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Sigin_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(Welcome_label, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                                .addComponent(Username_field)
                                .addComponent(Password_field))
                            .addComponent(Username_label)
                            .addComponent(Password_label, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(Sigin_panelLayout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(Signin_label)))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        Sigin_panelLayout.setVerticalGroup(
            Sigin_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Sigin_panelLayout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(Welcome_label)
                .addGap(81, 81, 81)
                .addComponent(Username_label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Username_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addComponent(Password_label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Password_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(Signin_label)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
            .addComponent(image_label, javax.swing.GroupLayout.DEFAULT_SIZE, 454, Short.MAX_VALUE)
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

        Navbar.setBackground(new java.awt.Color(240, 40, 40));

        Home_Highlight.setBackground(new java.awt.Color(250, 250, 250));

        javax.swing.GroupLayout Home_HighlightLayout = new javax.swing.GroupLayout(Home_Highlight);
        Home_Highlight.setLayout(Home_HighlightLayout);
        Home_HighlightLayout.setHorizontalGroup(
            Home_HighlightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );
        Home_HighlightLayout.setVerticalGroup(
            Home_HighlightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 43, Short.MAX_VALUE)
        );

        Home_label.setBackground(new java.awt.Color(247, 127, 0));
        Home_label.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Home_label.setForeground(new java.awt.Color(255, 255, 255));
        Home_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Home_label.setText("Home");
        Home_label.setOpaque(true);
        Home_label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Home_labelMouseClicked(evt);
            }
        });

        Manage_flight_highlight.setBackground(new java.awt.Color(250, 250, 250));

        javax.swing.GroupLayout Manage_flight_highlightLayout = new javax.swing.GroupLayout(Manage_flight_highlight);
        Manage_flight_highlight.setLayout(Manage_flight_highlightLayout);
        Manage_flight_highlightLayout.setHorizontalGroup(
            Manage_flight_highlightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );
        Manage_flight_highlightLayout.setVerticalGroup(
            Manage_flight_highlightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 43, Short.MAX_VALUE)
        );

        Manage_flight_label.setBackground(new java.awt.Color(247, 127, 0));
        Manage_flight_label.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Manage_flight_label.setForeground(new java.awt.Color(255, 255, 255));
        Manage_flight_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Manage_flight_label.setText("Manage Flights");
        Manage_flight_label.setOpaque(true);
        Manage_flight_label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Manage_flight_labelMouseClicked(evt);
            }
        });

        Add_flight_label.setBackground(new java.awt.Color(247, 127, 0));
        Add_flight_label.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Add_flight_label.setForeground(new java.awt.Color(255, 255, 255));
        Add_flight_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Add_flight_label.setText("Add Flight");
        Add_flight_label.setOpaque(true);
        Add_flight_label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Add_flight_labelMouseClicked(evt);
            }
        });

        Add_flight_highlight.setBackground(new java.awt.Color(250, 250, 250));

        javax.swing.GroupLayout Add_flight_highlightLayout = new javax.swing.GroupLayout(Add_flight_highlight);
        Add_flight_highlight.setLayout(Add_flight_highlightLayout);
        Add_flight_highlightLayout.setHorizontalGroup(
            Add_flight_highlightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );
        Add_flight_highlightLayout.setVerticalGroup(
            Add_flight_highlightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 43, Short.MAX_VALUE)
        );

        NoFlyList_label.setBackground(new java.awt.Color(247, 127, 0));
        NoFlyList_label.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        NoFlyList_label.setForeground(new java.awt.Color(255, 255, 255));
        NoFlyList_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        NoFlyList_label.setText("Manage No-fly list");
        NoFlyList_label.setOpaque(true);
        NoFlyList_label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NoFlyList_labelMouseClicked(evt);
            }
        });

        NoFlyList_highlight.setBackground(new java.awt.Color(250, 250, 250));

        javax.swing.GroupLayout NoFlyList_highlightLayout = new javax.swing.GroupLayout(NoFlyList_highlight);
        NoFlyList_highlight.setLayout(NoFlyList_highlightLayout);
        NoFlyList_highlightLayout.setHorizontalGroup(
            NoFlyList_highlightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );
        NoFlyList_highlightLayout.setVerticalGroup(
            NoFlyList_highlightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 43, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout NavbarLayout = new javax.swing.GroupLayout(Navbar);
        Navbar.setLayout(NavbarLayout);
        NavbarLayout.setHorizontalGroup(
            NavbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NavbarLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(NavbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Home_Highlight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Manage_flight_highlight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Add_flight_highlight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NoFlyList_highlight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(NavbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(NavbarLayout.createSequentialGroup()
                        .addGap(0, 0, 0)
                        .addComponent(Home_label, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(NavbarLayout.createSequentialGroup()
                        .addGap(0, 0, 0)
                        .addGroup(NavbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Add_flight_label, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Manage_flight_label, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NoFlyList_label, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        NavbarLayout.setVerticalGroup(
            NavbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NavbarLayout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addGroup(NavbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Home_Highlight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Home_label, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(NavbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Manage_flight_highlight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Manage_flight_label, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(NavbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Add_flight_highlight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Add_flight_label, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(NavbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(NoFlyList_highlight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NoFlyList_label, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Home_Highlight.getAccessibleContext().setAccessibleName("Home_Highlight");

        internal_cardstack.setLayout(new java.awt.CardLayout());

        jLabel1.setText("Home");

        javax.swing.GroupLayout HomeLayout = new javax.swing.GroupLayout(Home);
        Home.setLayout(HomeLayout);
        HomeLayout.setHorizontalGroup(
            HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HomeLayout.createSequentialGroup()
                .addGap(246, 246, 246)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(384, Short.MAX_VALUE))
        );
        HomeLayout.setVerticalGroup(
            HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HomeLayout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addComponent(jLabel1)
                .addContainerGap(334, Short.MAX_VALUE))
        );

        internal_cardstack.add(Home, "Home");

        jLabel2.setText("Manage flights");

        javax.swing.GroupLayout Manage_flightsLayout = new javax.swing.GroupLayout(Manage_flights);
        Manage_flights.setLayout(Manage_flightsLayout);
        Manage_flightsLayout.setHorizontalGroup(
            Manage_flightsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Manage_flightsLayout.createSequentialGroup()
                .addGap(285, 285, 285)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(345, Short.MAX_VALUE))
        );
        Manage_flightsLayout.setVerticalGroup(
            Manage_flightsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Manage_flightsLayout.createSequentialGroup()
                .addGap(129, 129, 129)
                .addComponent(jLabel2)
                .addContainerGap(309, Short.MAX_VALUE))
        );

        internal_cardstack.add(Manage_flights, "Manage_flights");

        jLabel3.setText("Add flights");

        javax.swing.GroupLayout Add_flightLayout = new javax.swing.GroupLayout(Add_flight);
        Add_flight.setLayout(Add_flightLayout);
        Add_flightLayout.setHorizontalGroup(
            Add_flightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Add_flightLayout.createSequentialGroup()
                .addGap(298, 298, 298)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(332, Short.MAX_VALUE))
        );
        Add_flightLayout.setVerticalGroup(
            Add_flightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Add_flightLayout.createSequentialGroup()
                .addGap(122, 122, 122)
                .addComponent(jLabel3)
                .addContainerGap(316, Short.MAX_VALUE))
        );

        internal_cardstack.add(Add_flight, "Add_flight");
        Add_flight.getAccessibleContext().setAccessibleName("");

        jLabel4.setText("No fly list");

        javax.swing.GroupLayout View_NoFlyListLayout = new javax.swing.GroupLayout(View_NoFlyList);
        View_NoFlyList.setLayout(View_NoFlyListLayout);
        View_NoFlyListLayout.setHorizontalGroup(
            View_NoFlyListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(View_NoFlyListLayout.createSequentialGroup()
                .addGap(310, 310, 310)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(320, Short.MAX_VALUE))
        );
        View_NoFlyListLayout.setVerticalGroup(
            View_NoFlyListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(View_NoFlyListLayout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(jLabel4)
                .addContainerGap(369, Short.MAX_VALUE))
        );

        internal_cardstack.add(View_NoFlyList, "View_NoFlyList");

        javax.swing.GroupLayout Landing_pageLayout = new javax.swing.GroupLayout(Landing_page);
        Landing_page.setLayout(Landing_pageLayout);
        Landing_pageLayout.setHorizontalGroup(
            Landing_pageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Landing_pageLayout.createSequentialGroup()
                .addComponent(Navbar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(internal_cardstack, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Landing_pageLayout.setVerticalGroup(
            Landing_pageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Navbar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(internal_cardstack, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        Navbar.getAccessibleContext().setAccessibleName("Navbar");

        Top_cardstack.add(Landing_page, "Landing_page");
        Landing_page.getAccessibleContext().setAccessibleName("Landing_page");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Top_cardstack, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Top_cardstack, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        Top_cardstack.getAccessibleContext().setAccessibleName("Top_cardstack");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Username_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Username_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Username_fieldActionPerformed

    private void Password_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Password_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Password_fieldActionPerformed

    private void Signin_labelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Signin_labelMouseClicked
        T_cardstack.show(this.Top_cardstack, "Landing_page");
    }//GEN-LAST:event_Signin_labelMouseClicked

    private void Home_labelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Home_labelMouseClicked

        this.Home_Highlight.setBackground(Color.BLACK);
        this.Manage_flight_highlight.setBackground(Color.WHITE);
        this.Add_flight_highlight.setBackground(Color.WHITE);
        this.NoFlyList_highlight.setBackground(Color.WHITE);
        inner_cardstack.show(this.internal_cardstack, "Home");
        
    }//GEN-LAST:event_Home_labelMouseClicked

    private void Manage_flight_labelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Manage_flight_labelMouseClicked

        this.Home_Highlight.setBackground(Color.WHITE);
        this.Manage_flight_highlight.setBackground(Color.BLACK);
        this.Add_flight_highlight.setBackground(Color.WHITE);
        this.NoFlyList_highlight.setBackground(Color.WHITE);
        inner_cardstack.show(this.internal_cardstack, "Manage_flights");
        
    }//GEN-LAST:event_Manage_flight_labelMouseClicked

    private void Add_flight_labelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Add_flight_labelMouseClicked

        this.Home_Highlight.setBackground(Color.WHITE);
        this.Manage_flight_highlight.setBackground(Color.WHITE);
        this.Add_flight_highlight.setBackground(Color.BLACK);
        this.NoFlyList_highlight.setBackground(Color.WHITE);
        inner_cardstack.show(this.internal_cardstack, "Add_flight");
        
    }//GEN-LAST:event_Add_flight_labelMouseClicked

    private void NoFlyList_labelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NoFlyList_labelMouseClicked
 
        this.Home_Highlight.setBackground(Color.WHITE);
        this.Manage_flight_highlight.setBackground(Color.WHITE);
        this.Add_flight_highlight.setBackground(Color.WHITE);
        this.NoFlyList_highlight.setBackground(Color.BLACK);
        inner_cardstack.show(this.internal_cardstack, "View_NoFlyList");
        
    }//GEN-LAST:event_NoFlyList_labelMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Admin_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin_GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Add_flight;
    private javax.swing.JPanel Add_flight_highlight;
    private javax.swing.JLabel Add_flight_label;
    private javax.swing.JPanel Home;
    private javax.swing.JPanel Home_Highlight;
    private javax.swing.JLabel Home_label;
    private javax.swing.JPanel Image_panel;
    private javax.swing.JPanel Landing_page;
    private javax.swing.JPanel Login_page;
    private javax.swing.JPanel Manage_flight_highlight;
    private javax.swing.JLabel Manage_flight_label;
    private javax.swing.JPanel Manage_flights;
    private javax.swing.JPanel Navbar;
    private javax.swing.JPanel NoFlyList_highlight;
    private javax.swing.JLabel NoFlyList_label;
    private javax.swing.JTextField Password_field;
    private javax.swing.JLabel Password_label;
    private javax.swing.JPanel Sigin_panel;
    private javax.swing.JLabel Signin_label;
    private javax.swing.JPanel Top_cardstack;
    private javax.swing.JTextField Username_field;
    private javax.swing.JLabel Username_label;
    private javax.swing.JPanel View_NoFlyList;
    private javax.swing.JLabel Welcome_label;
    private javax.swing.JLabel image_label;
    private javax.swing.JPanel internal_cardstack;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
