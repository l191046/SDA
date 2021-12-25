/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.List;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JPanel;

public class JSeatSelect extends javax.swing.JFrame {

    private ArrayList<JPanel> seats;
    
    public JSeatSelect() {
        initComponents();
        this.setVisible(true);
        
        seats = new ArrayList<JPanel>();

        getComponentsRecursive(JSeatSelect.this,seats);
        System.out.println("Hello World");
        for(int i = 0; i < seats.size(); i++){
            String loc = seats.get(i).getName();

                seats.get(i).addMouseListener(new MouseAdapter(){
                    public void mouseClicked(MouseEvent e) {

                    JPanel p = (JPanel)e.getSource();
                    //Makes sure it only registers for single clicks(always registers even on double clicks, just registers twice.)
                     if (e.getClickCount() == 1) {

                       p.setBackground(Color.red);
                       Seat_Loc.setText(loc);
                        }
                    }       
                });

        }
        
       // PanelListener listener = new PanelListener();

//        listAllComponentsIn(JSeatSelect.this,seats);
//        
//        seats.get(0).setBackground(Color.red);
//        seats.get(1).setBackground(Color.blue);
//        seats.get(2).setBackground(Color.green);
//        seats.get(3).setBackground(Color.CYAN);
//        
//        
//        seats.get(4).setBackground(Color.red);
//        seats.get(5).setBackground(Color.blue);
//        seats.get(6).setBackground(Color.green);
//        seats.get(7).setBackground(Color.CYAN);
//        
//        seats.get(8).setBackground(Color.red);
//        seats.get(9).setBackground(Color.blue);
//        seats.get(10).setBackground(Color.green);
//        seats.get(11).setBackground(Color.CYAN);
//        
//        seats.get(12).setBackground(Color.red);
//        seats.get(13).setBackground(Color.blue);
//        seats.get(14).setBackground(Color.green);
//        seats.get(15).setBackground(Color.CYAN);
//        
//        seats.get(16).setBackground(Color.red);
//        seats.get(17).setBackground(Color.blue);
//        seats.get(18).setBackground(Color.green);
//        seats.get(19).setBackground(Color.CYAN);

        
        
//        for(int i = 0; i < seats.size(); i++){
//            seats.get(i).setBackground(Color.red);
//            
//        }
        
    }
    
    public void getComponentsRecursive(Container parent,ArrayList<JPanel> seats)
{
    for (Component c : parent.getComponents())
    {
        
        //System.out.println(c.getParent().toString());
        Dimension d = c.getSize();
        if(d.height == 26 && d.width == 28){
          //  System.out.println(c.toString());
            seats.add((JPanel) c);
        }
        
        //seats.add((JPanel) c);
        if (c instanceof Container)
            getComponentsRecursive((Container)c,seats);
    }
 
}
    


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        backDrop4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        backDrop5 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        backDrop6 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        backDrop7 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        backDrop8 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        backDrop9 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        backDrop1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        FirstClass = new javax.swing.JPanel();
        A1 = new javax.swing.JPanel();
        A2 = new javax.swing.JPanel();
        A3 = new javax.swing.JPanel();
        B1 = new javax.swing.JPanel();
        B2 = new javax.swing.JPanel();
        B3 = new javax.swing.JPanel();
        C1 = new javax.swing.JPanel();
        C2 = new javax.swing.JPanel();
        C3 = new javax.swing.JPanel();
        D1 = new javax.swing.JPanel();
        D2 = new javax.swing.JPanel();
        D3 = new javax.swing.JPanel();
        E1 = new javax.swing.JPanel();
        E2 = new javax.swing.JPanel();
        E3 = new javax.swing.JPanel();
        F1 = new javax.swing.JPanel();
        F2 = new javax.swing.JPanel();
        F3 = new javax.swing.JPanel();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(120, 0), new java.awt.Dimension(120, 0), new java.awt.Dimension(120, 32767));
        MiddleClass = new javax.swing.JPanel();
        A4 = new javax.swing.JPanel();
        A5 = new javax.swing.JPanel();
        A6 = new javax.swing.JPanel();
        B4 = new javax.swing.JPanel();
        B5 = new javax.swing.JPanel();
        B6 = new javax.swing.JPanel();
        C4 = new javax.swing.JPanel();
        C5 = new javax.swing.JPanel();
        C6 = new javax.swing.JPanel();
        D4 = new javax.swing.JPanel();
        D5 = new javax.swing.JPanel();
        D6 = new javax.swing.JPanel();
        E4 = new javax.swing.JPanel();
        E5 = new javax.swing.JPanel();
        E6 = new javax.swing.JPanel();
        F4 = new javax.swing.JPanel();
        F5 = new javax.swing.JPanel();
        F6 = new javax.swing.JPanel();
        MiddleClass1 = new javax.swing.JPanel();
        A10 = new javax.swing.JPanel();
        A11 = new javax.swing.JPanel();
        A12 = new javax.swing.JPanel();
        B10 = new javax.swing.JPanel();
        B11 = new javax.swing.JPanel();
        B12 = new javax.swing.JPanel();
        C10 = new javax.swing.JPanel();
        C11 = new javax.swing.JPanel();
        C12 = new javax.swing.JPanel();
        D10 = new javax.swing.JPanel();
        D11 = new javax.swing.JPanel();
        D12 = new javax.swing.JPanel();
        E10 = new javax.swing.JPanel();
        E11 = new javax.swing.JPanel();
        E12 = new javax.swing.JPanel();
        F10 = new javax.swing.JPanel();
        F11 = new javax.swing.JPanel();
        F12 = new javax.swing.JPanel();
        MiddleClass2 = new javax.swing.JPanel();
        A7 = new javax.swing.JPanel();
        A8 = new javax.swing.JPanel();
        A9 = new javax.swing.JPanel();
        B7 = new javax.swing.JPanel();
        B8 = new javax.swing.JPanel();
        B9 = new javax.swing.JPanel();
        C7 = new javax.swing.JPanel();
        C8 = new javax.swing.JPanel();
        C9 = new javax.swing.JPanel();
        D7 = new javax.swing.JPanel();
        D8 = new javax.swing.JPanel();
        D9 = new javax.swing.JPanel();
        E7 = new javax.swing.JPanel();
        E8 = new javax.swing.JPanel();
        E9 = new javax.swing.JPanel();
        F7 = new javax.swing.JPanel();
        F8 = new javax.swing.JPanel();
        F9 = new javax.swing.JPanel();
        MiddleClass3 = new javax.swing.JPanel();
        A13 = new javax.swing.JPanel();
        A14 = new javax.swing.JPanel();
        A15 = new javax.swing.JPanel();
        B13 = new javax.swing.JPanel();
        B14 = new javax.swing.JPanel();
        B15 = new javax.swing.JPanel();
        C13 = new javax.swing.JPanel();
        C14 = new javax.swing.JPanel();
        C15 = new javax.swing.JPanel();
        D13 = new javax.swing.JPanel();
        D14 = new javax.swing.JPanel();
        D15 = new javax.swing.JPanel();
        E13 = new javax.swing.JPanel();
        E14 = new javax.swing.JPanel();
        E15 = new javax.swing.JPanel();
        F13 = new javax.swing.JPanel();
        F14 = new javax.swing.JPanel();
        F15 = new javax.swing.JPanel();
        backDrop2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        backDrop3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        backDrop11 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        backDrop10 = new javax.swing.JPanel();
        jPanel92 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        backDrop12 = new javax.swing.JPanel();
        jPanel93 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        backDrop13 = new javax.swing.JPanel();
        jPanel94 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jPanel95 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        txtbox_firstName = new javax.swing.JTextField();
        txtbox_firstName1 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        panel_firstName = new javax.swing.JPanel();
        lbl_firstName = new javax.swing.JLabel();
        txtbox_firstName2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        Seat_Loc = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                formMouseEntered(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(64, 81, 178));

        backDrop4.setBackground(new java.awt.Color(255, 255, 255));
        backDrop4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("A");

        javax.swing.GroupLayout backDrop4Layout = new javax.swing.GroupLayout(backDrop4);
        backDrop4.setLayout(backDrop4Layout);
        backDrop4Layout.setHorizontalGroup(
            backDrop4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backDrop4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        backDrop4Layout.setVerticalGroup(
            backDrop4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backDrop4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel4))
        );

        backDrop5.setBackground(new java.awt.Color(255, 255, 255));
        backDrop5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("B");

        javax.swing.GroupLayout backDrop5Layout = new javax.swing.GroupLayout(backDrop5);
        backDrop5.setLayout(backDrop5Layout);
        backDrop5Layout.setHorizontalGroup(
            backDrop5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backDrop5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        backDrop5Layout.setVerticalGroup(
            backDrop5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backDrop5Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel5))
        );

        backDrop6.setBackground(new java.awt.Color(255, 255, 255));
        backDrop6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("C");

        javax.swing.GroupLayout backDrop6Layout = new javax.swing.GroupLayout(backDrop6);
        backDrop6.setLayout(backDrop6Layout);
        backDrop6Layout.setHorizontalGroup(
            backDrop6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backDrop6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        backDrop6Layout.setVerticalGroup(
            backDrop6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backDrop6Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel6))
        );

        backDrop7.setBackground(new java.awt.Color(255, 255, 255));
        backDrop7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel7.setBackground(new java.awt.Color(0, 0, 0));
        jLabel7.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel7.setText("D");

        javax.swing.GroupLayout backDrop7Layout = new javax.swing.GroupLayout(backDrop7);
        backDrop7.setLayout(backDrop7Layout);
        backDrop7Layout.setHorizontalGroup(
            backDrop7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backDrop7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addContainerGap(15, Short.MAX_VALUE))
        );
        backDrop7Layout.setVerticalGroup(
            backDrop7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backDrop7Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel7))
        );

        backDrop8.setBackground(new java.awt.Color(255, 255, 255));
        backDrop8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel8.setBackground(new java.awt.Color(0, 0, 0));
        jLabel8.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel8.setText("E");

        javax.swing.GroupLayout backDrop8Layout = new javax.swing.GroupLayout(backDrop8);
        backDrop8.setLayout(backDrop8Layout);
        backDrop8Layout.setHorizontalGroup(
            backDrop8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backDrop8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        backDrop8Layout.setVerticalGroup(
            backDrop8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backDrop8Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel8))
        );

        backDrop9.setBackground(new java.awt.Color(255, 255, 255));
        backDrop9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel9.setBackground(new java.awt.Color(0, 0, 0));
        jLabel9.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 14)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel9.setText("F");

        javax.swing.GroupLayout backDrop9Layout = new javax.swing.GroupLayout(backDrop9);
        backDrop9.setLayout(backDrop9Layout);
        backDrop9Layout.setHorizontalGroup(
            backDrop9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backDrop9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        backDrop9Layout.setVerticalGroup(
            backDrop9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backDrop9Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel9))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backDrop4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(backDrop5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(backDrop6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(backDrop7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(backDrop8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(backDrop9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(backDrop4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(backDrop5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(backDrop6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(backDrop7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(backDrop8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(backDrop9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        backDrop1.setBackground(new java.awt.Color(77, 80, 97));

        jLabel2.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("BOOKING | SELECT YOUR SEAT");

        javax.swing.GroupLayout backDrop1Layout = new javax.swing.GroupLayout(backDrop1);
        backDrop1.setLayout(backDrop1Layout);
        backDrop1Layout.setHorizontalGroup(
            backDrop1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backDrop1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        backDrop1Layout.setVerticalGroup(
            backDrop1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backDrop1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap())
        );

        A1.setBackground(new java.awt.Color(238, 193, 48));
        A1.setToolTipText("");
        A1.setName("A1"); // NOI18N
        A1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                A1MouseEntered(evt);
            }
        });

        javax.swing.GroupLayout A1Layout = new javax.swing.GroupLayout(A1);
        A1.setLayout(A1Layout);
        A1Layout.setHorizontalGroup(
            A1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        A1Layout.setVerticalGroup(
            A1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 26, Short.MAX_VALUE)
        );

        A2.setBackground(new java.awt.Color(238, 193, 48));
        A2.setName("A2"); // NOI18N

        javax.swing.GroupLayout A2Layout = new javax.swing.GroupLayout(A2);
        A2.setLayout(A2Layout);
        A2Layout.setHorizontalGroup(
            A2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        A2Layout.setVerticalGroup(
            A2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 26, Short.MAX_VALUE)
        );

        A3.setBackground(new java.awt.Color(238, 193, 48));
        A3.setName("A3"); // NOI18N

        javax.swing.GroupLayout A3Layout = new javax.swing.GroupLayout(A3);
        A3.setLayout(A3Layout);
        A3Layout.setHorizontalGroup(
            A3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        A3Layout.setVerticalGroup(
            A3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 26, Short.MAX_VALUE)
        );

        B1.setBackground(new java.awt.Color(238, 193, 48));
        B1.setName("B1"); // NOI18N

        javax.swing.GroupLayout B1Layout = new javax.swing.GroupLayout(B1);
        B1.setLayout(B1Layout);
        B1Layout.setHorizontalGroup(
            B1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        B1Layout.setVerticalGroup(
            B1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 26, Short.MAX_VALUE)
        );

        B2.setBackground(new java.awt.Color(238, 193, 48));
        B2.setName("B2"); // NOI18N

        javax.swing.GroupLayout B2Layout = new javax.swing.GroupLayout(B2);
        B2.setLayout(B2Layout);
        B2Layout.setHorizontalGroup(
            B2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        B2Layout.setVerticalGroup(
            B2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 26, Short.MAX_VALUE)
        );

        B3.setBackground(new java.awt.Color(238, 193, 48));
        B3.setName("B3"); // NOI18N

        javax.swing.GroupLayout B3Layout = new javax.swing.GroupLayout(B3);
        B3.setLayout(B3Layout);
        B3Layout.setHorizontalGroup(
            B3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        B3Layout.setVerticalGroup(
            B3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 26, Short.MAX_VALUE)
        );

        C1.setBackground(new java.awt.Color(238, 193, 48));

        javax.swing.GroupLayout C1Layout = new javax.swing.GroupLayout(C1);
        C1.setLayout(C1Layout);
        C1Layout.setHorizontalGroup(
            C1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        C1Layout.setVerticalGroup(
            C1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 26, Short.MAX_VALUE)
        );

        C2.setBackground(new java.awt.Color(238, 193, 48));

        javax.swing.GroupLayout C2Layout = new javax.swing.GroupLayout(C2);
        C2.setLayout(C2Layout);
        C2Layout.setHorizontalGroup(
            C2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        C2Layout.setVerticalGroup(
            C2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 26, Short.MAX_VALUE)
        );

        C3.setBackground(new java.awt.Color(238, 193, 48));

        javax.swing.GroupLayout C3Layout = new javax.swing.GroupLayout(C3);
        C3.setLayout(C3Layout);
        C3Layout.setHorizontalGroup(
            C3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        C3Layout.setVerticalGroup(
            C3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 26, Short.MAX_VALUE)
        );

        D1.setBackground(new java.awt.Color(238, 193, 48));

        javax.swing.GroupLayout D1Layout = new javax.swing.GroupLayout(D1);
        D1.setLayout(D1Layout);
        D1Layout.setHorizontalGroup(
            D1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        D1Layout.setVerticalGroup(
            D1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 26, Short.MAX_VALUE)
        );

        D2.setBackground(new java.awt.Color(238, 193, 48));

        javax.swing.GroupLayout D2Layout = new javax.swing.GroupLayout(D2);
        D2.setLayout(D2Layout);
        D2Layout.setHorizontalGroup(
            D2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        D2Layout.setVerticalGroup(
            D2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 26, Short.MAX_VALUE)
        );

        D3.setBackground(new java.awt.Color(238, 193, 48));

        javax.swing.GroupLayout D3Layout = new javax.swing.GroupLayout(D3);
        D3.setLayout(D3Layout);
        D3Layout.setHorizontalGroup(
            D3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        D3Layout.setVerticalGroup(
            D3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 26, Short.MAX_VALUE)
        );

        E1.setBackground(new java.awt.Color(238, 193, 48));

        javax.swing.GroupLayout E1Layout = new javax.swing.GroupLayout(E1);
        E1.setLayout(E1Layout);
        E1Layout.setHorizontalGroup(
            E1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        E1Layout.setVerticalGroup(
            E1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 26, Short.MAX_VALUE)
        );

        E2.setBackground(new java.awt.Color(238, 193, 48));

        javax.swing.GroupLayout E2Layout = new javax.swing.GroupLayout(E2);
        E2.setLayout(E2Layout);
        E2Layout.setHorizontalGroup(
            E2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        E2Layout.setVerticalGroup(
            E2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 26, Short.MAX_VALUE)
        );

        E3.setBackground(new java.awt.Color(238, 193, 48));

        javax.swing.GroupLayout E3Layout = new javax.swing.GroupLayout(E3);
        E3.setLayout(E3Layout);
        E3Layout.setHorizontalGroup(
            E3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        E3Layout.setVerticalGroup(
            E3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 26, Short.MAX_VALUE)
        );

        F1.setBackground(new java.awt.Color(238, 193, 48));

        javax.swing.GroupLayout F1Layout = new javax.swing.GroupLayout(F1);
        F1.setLayout(F1Layout);
        F1Layout.setHorizontalGroup(
            F1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        F1Layout.setVerticalGroup(
            F1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 26, Short.MAX_VALUE)
        );

        F2.setBackground(new java.awt.Color(238, 193, 48));

        javax.swing.GroupLayout F2Layout = new javax.swing.GroupLayout(F2);
        F2.setLayout(F2Layout);
        F2Layout.setHorizontalGroup(
            F2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        F2Layout.setVerticalGroup(
            F2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 26, Short.MAX_VALUE)
        );

        F3.setBackground(new java.awt.Color(238, 193, 48));

        javax.swing.GroupLayout F3Layout = new javax.swing.GroupLayout(F3);
        F3.setLayout(F3Layout);
        F3Layout.setHorizontalGroup(
            F3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        F3Layout.setVerticalGroup(
            F3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 26, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout FirstClassLayout = new javax.swing.GroupLayout(FirstClass);
        FirstClass.setLayout(FirstClassLayout);
        FirstClassLayout.setHorizontalGroup(
            FirstClassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FirstClassLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(FirstClassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FirstClassLayout.createSequentialGroup()
                        .addComponent(D1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(D2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(D3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(FirstClassLayout.createSequentialGroup()
                        .addComponent(E1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(E2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(E3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(FirstClassLayout.createSequentialGroup()
                        .addComponent(F1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(F2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(F3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(FirstClassLayout.createSequentialGroup()
                        .addComponent(A1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(A2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(A3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(FirstClassLayout.createSequentialGroup()
                        .addComponent(B1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(B2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(B3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(FirstClassLayout.createSequentialGroup()
                        .addComponent(C1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(C2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(C3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FirstClassLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        FirstClassLayout.setVerticalGroup(
            FirstClassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FirstClassLayout.createSequentialGroup()
                .addGroup(FirstClassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(A1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(A2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(A3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(FirstClassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(B1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(FirstClassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(C1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(C2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(C3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(FirstClassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(D1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(D2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(D3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(FirstClassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(E1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(E2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(E3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(FirstClassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(F1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(F2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(F3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        A1.getAccessibleContext().setAccessibleName("");
        A2.getAccessibleContext().setAccessibleName("A3");
        A3.getAccessibleContext().setAccessibleName("A3");
        B1.getAccessibleContext().setAccessibleName("A2");

        MiddleClass.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        A4.setBackground(new java.awt.Color(53, 140, 250));
        A4.setName("A4"); // NOI18N

        javax.swing.GroupLayout A4Layout = new javax.swing.GroupLayout(A4);
        A4.setLayout(A4Layout);
        A4Layout.setHorizontalGroup(
            A4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        A4Layout.setVerticalGroup(
            A4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 26, Short.MAX_VALUE)
        );

        MiddleClass.add(A4, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 0, -1, -1));
        A4.getAccessibleContext().setAccessibleName("A4");

        A5.setBackground(new java.awt.Color(53, 140, 250));
        A5.setName("A5"); // NOI18N

        javax.swing.GroupLayout A5Layout = new javax.swing.GroupLayout(A5);
        A5.setLayout(A5Layout);
        A5Layout.setHorizontalGroup(
            A5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        A5Layout.setVerticalGroup(
            A5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 26, Short.MAX_VALUE)
        );

        MiddleClass.add(A5, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 0, -1, -1));
        A5.getAccessibleContext().setAccessibleName("A5");

        A6.setBackground(new java.awt.Color(53, 140, 250));
        A6.setName("A6"); // NOI18N

        javax.swing.GroupLayout A6Layout = new javax.swing.GroupLayout(A6);
        A6.setLayout(A6Layout);
        A6Layout.setHorizontalGroup(
            A6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        A6Layout.setVerticalGroup(
            A6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 26, Short.MAX_VALUE)
        );

        MiddleClass.add(A6, new org.netbeans.lib.awtextra.AbsoluteConstraints(92, 0, -1, -1));
        A6.getAccessibleContext().setAccessibleName("A6");

        B4.setBackground(new java.awt.Color(53, 140, 250));
        B4.setName("B4"); // NOI18N

        javax.swing.GroupLayout B4Layout = new javax.swing.GroupLayout(B4);
        B4.setLayout(B4Layout);
        B4Layout.setHorizontalGroup(
            B4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        B4Layout.setVerticalGroup(
            B4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 26, Short.MAX_VALUE)
        );

        MiddleClass.add(B4, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 39, -1, -1));

        B5.setBackground(new java.awt.Color(53, 140, 250));
        B5.setName("B5"); // NOI18N

        javax.swing.GroupLayout B5Layout = new javax.swing.GroupLayout(B5);
        B5.setLayout(B5Layout);
        B5Layout.setHorizontalGroup(
            B5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        B5Layout.setVerticalGroup(
            B5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 26, Short.MAX_VALUE)
        );

        MiddleClass.add(B5, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 39, -1, -1));

        B6.setBackground(new java.awt.Color(53, 140, 250));

        javax.swing.GroupLayout B6Layout = new javax.swing.GroupLayout(B6);
        B6.setLayout(B6Layout);
        B6Layout.setHorizontalGroup(
            B6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        B6Layout.setVerticalGroup(
            B6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 26, Short.MAX_VALUE)
        );

        MiddleClass.add(B6, new org.netbeans.lib.awtextra.AbsoluteConstraints(92, 39, -1, -1));

        C4.setBackground(new java.awt.Color(53, 140, 250));

        javax.swing.GroupLayout C4Layout = new javax.swing.GroupLayout(C4);
        C4.setLayout(C4Layout);
        C4Layout.setHorizontalGroup(
            C4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        C4Layout.setVerticalGroup(
            C4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 26, Short.MAX_VALUE)
        );

        MiddleClass.add(C4, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 98, -1, -1));

        C5.setBackground(new java.awt.Color(53, 140, 250));

        javax.swing.GroupLayout C5Layout = new javax.swing.GroupLayout(C5);
        C5.setLayout(C5Layout);
        C5Layout.setHorizontalGroup(
            C5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        C5Layout.setVerticalGroup(
            C5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 26, Short.MAX_VALUE)
        );

        MiddleClass.add(C5, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 98, -1, -1));

        C6.setBackground(new java.awt.Color(53, 140, 250));

        javax.swing.GroupLayout C6Layout = new javax.swing.GroupLayout(C6);
        C6.setLayout(C6Layout);
        C6Layout.setHorizontalGroup(
            C6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        C6Layout.setVerticalGroup(
            C6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 26, Short.MAX_VALUE)
        );

        MiddleClass.add(C6, new org.netbeans.lib.awtextra.AbsoluteConstraints(92, 98, -1, -1));

        D4.setBackground(new java.awt.Color(53, 140, 250));

        javax.swing.GroupLayout D4Layout = new javax.swing.GroupLayout(D4);
        D4.setLayout(D4Layout);
        D4Layout.setHorizontalGroup(
            D4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        D4Layout.setVerticalGroup(
            D4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 26, Short.MAX_VALUE)
        );

        MiddleClass.add(D4, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 137, -1, -1));

        D5.setBackground(new java.awt.Color(53, 140, 250));

        javax.swing.GroupLayout D5Layout = new javax.swing.GroupLayout(D5);
        D5.setLayout(D5Layout);
        D5Layout.setHorizontalGroup(
            D5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        D5Layout.setVerticalGroup(
            D5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 26, Short.MAX_VALUE)
        );

        MiddleClass.add(D5, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 137, -1, -1));

        D6.setBackground(new java.awt.Color(53, 140, 250));

        javax.swing.GroupLayout D6Layout = new javax.swing.GroupLayout(D6);
        D6.setLayout(D6Layout);
        D6Layout.setHorizontalGroup(
            D6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        D6Layout.setVerticalGroup(
            D6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 26, Short.MAX_VALUE)
        );

        MiddleClass.add(D6, new org.netbeans.lib.awtextra.AbsoluteConstraints(92, 137, -1, -1));

        E4.setBackground(new java.awt.Color(53, 140, 250));

        javax.swing.GroupLayout E4Layout = new javax.swing.GroupLayout(E4);
        E4.setLayout(E4Layout);
        E4Layout.setHorizontalGroup(
            E4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        E4Layout.setVerticalGroup(
            E4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 26, Short.MAX_VALUE)
        );

        MiddleClass.add(E4, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 209, -1, -1));

        E5.setBackground(new java.awt.Color(53, 140, 250));

        javax.swing.GroupLayout E5Layout = new javax.swing.GroupLayout(E5);
        E5.setLayout(E5Layout);
        E5Layout.setHorizontalGroup(
            E5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        E5Layout.setVerticalGroup(
            E5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 26, Short.MAX_VALUE)
        );

        MiddleClass.add(E5, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 209, -1, -1));

        E6.setBackground(new java.awt.Color(53, 140, 250));

        javax.swing.GroupLayout E6Layout = new javax.swing.GroupLayout(E6);
        E6.setLayout(E6Layout);
        E6Layout.setHorizontalGroup(
            E6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        E6Layout.setVerticalGroup(
            E6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 26, Short.MAX_VALUE)
        );

        MiddleClass.add(E6, new org.netbeans.lib.awtextra.AbsoluteConstraints(92, 209, -1, -1));

        F4.setBackground(new java.awt.Color(53, 140, 250));

        javax.swing.GroupLayout F4Layout = new javax.swing.GroupLayout(F4);
        F4.setLayout(F4Layout);
        F4Layout.setHorizontalGroup(
            F4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        F4Layout.setVerticalGroup(
            F4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 26, Short.MAX_VALUE)
        );

        MiddleClass.add(F4, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 248, -1, -1));

        F5.setBackground(new java.awt.Color(53, 140, 250));

        javax.swing.GroupLayout F5Layout = new javax.swing.GroupLayout(F5);
        F5.setLayout(F5Layout);
        F5Layout.setHorizontalGroup(
            F5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        F5Layout.setVerticalGroup(
            F5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 26, Short.MAX_VALUE)
        );

        MiddleClass.add(F5, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 248, -1, -1));

        F6.setBackground(new java.awt.Color(53, 140, 250));

        javax.swing.GroupLayout F6Layout = new javax.swing.GroupLayout(F6);
        F6.setLayout(F6Layout);
        F6Layout.setHorizontalGroup(
            F6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        F6Layout.setVerticalGroup(
            F6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 26, Short.MAX_VALUE)
        );

        MiddleClass.add(F6, new org.netbeans.lib.awtextra.AbsoluteConstraints(92, 248, -1, -1));

        A10.setBackground(new java.awt.Color(53, 140, 250));
        A10.setName("A10"); // NOI18N

        javax.swing.GroupLayout A10Layout = new javax.swing.GroupLayout(A10);
        A10.setLayout(A10Layout);
        A10Layout.setHorizontalGroup(
            A10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        A10Layout.setVerticalGroup(
            A10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 26, Short.MAX_VALUE)
        );

        A11.setBackground(new java.awt.Color(53, 140, 250));
        A11.setName("A11"); // NOI18N

        javax.swing.GroupLayout A11Layout = new javax.swing.GroupLayout(A11);
        A11.setLayout(A11Layout);
        A11Layout.setHorizontalGroup(
            A11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        A11Layout.setVerticalGroup(
            A11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 26, Short.MAX_VALUE)
        );

        A12.setBackground(new java.awt.Color(53, 140, 250));
        A12.setName("A12"); // NOI18N

        javax.swing.GroupLayout A12Layout = new javax.swing.GroupLayout(A12);
        A12.setLayout(A12Layout);
        A12Layout.setHorizontalGroup(
            A12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        A12Layout.setVerticalGroup(
            A12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 26, Short.MAX_VALUE)
        );

        B10.setBackground(new java.awt.Color(53, 140, 250));

        javax.swing.GroupLayout B10Layout = new javax.swing.GroupLayout(B10);
        B10.setLayout(B10Layout);
        B10Layout.setHorizontalGroup(
            B10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        B10Layout.setVerticalGroup(
            B10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 26, Short.MAX_VALUE)
        );

        B11.setBackground(new java.awt.Color(53, 140, 250));

        javax.swing.GroupLayout B11Layout = new javax.swing.GroupLayout(B11);
        B11.setLayout(B11Layout);
        B11Layout.setHorizontalGroup(
            B11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        B11Layout.setVerticalGroup(
            B11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 26, Short.MAX_VALUE)
        );

        B12.setBackground(new java.awt.Color(53, 140, 250));

        javax.swing.GroupLayout B12Layout = new javax.swing.GroupLayout(B12);
        B12.setLayout(B12Layout);
        B12Layout.setHorizontalGroup(
            B12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        B12Layout.setVerticalGroup(
            B12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 26, Short.MAX_VALUE)
        );

        C10.setBackground(new java.awt.Color(53, 140, 250));

        javax.swing.GroupLayout C10Layout = new javax.swing.GroupLayout(C10);
        C10.setLayout(C10Layout);
        C10Layout.setHorizontalGroup(
            C10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        C10Layout.setVerticalGroup(
            C10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 26, Short.MAX_VALUE)
        );

        C11.setBackground(new java.awt.Color(53, 140, 250));

        javax.swing.GroupLayout C11Layout = new javax.swing.GroupLayout(C11);
        C11.setLayout(C11Layout);
        C11Layout.setHorizontalGroup(
            C11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        C11Layout.setVerticalGroup(
            C11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 26, Short.MAX_VALUE)
        );

        C12.setBackground(new java.awt.Color(53, 140, 250));

        javax.swing.GroupLayout C12Layout = new javax.swing.GroupLayout(C12);
        C12.setLayout(C12Layout);
        C12Layout.setHorizontalGroup(
            C12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        C12Layout.setVerticalGroup(
            C12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 26, Short.MAX_VALUE)
        );

        D10.setBackground(new java.awt.Color(53, 140, 250));

        javax.swing.GroupLayout D10Layout = new javax.swing.GroupLayout(D10);
        D10.setLayout(D10Layout);
        D10Layout.setHorizontalGroup(
            D10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        D10Layout.setVerticalGroup(
            D10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 26, Short.MAX_VALUE)
        );

        D11.setBackground(new java.awt.Color(53, 140, 250));

        javax.swing.GroupLayout D11Layout = new javax.swing.GroupLayout(D11);
        D11.setLayout(D11Layout);
        D11Layout.setHorizontalGroup(
            D11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        D11Layout.setVerticalGroup(
            D11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 26, Short.MAX_VALUE)
        );

        D12.setBackground(new java.awt.Color(53, 140, 250));

        javax.swing.GroupLayout D12Layout = new javax.swing.GroupLayout(D12);
        D12.setLayout(D12Layout);
        D12Layout.setHorizontalGroup(
            D12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        D12Layout.setVerticalGroup(
            D12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 26, Short.MAX_VALUE)
        );

        E10.setBackground(new java.awt.Color(53, 140, 250));

        javax.swing.GroupLayout E10Layout = new javax.swing.GroupLayout(E10);
        E10.setLayout(E10Layout);
        E10Layout.setHorizontalGroup(
            E10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        E10Layout.setVerticalGroup(
            E10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 26, Short.MAX_VALUE)
        );

        E11.setBackground(new java.awt.Color(53, 140, 250));

        javax.swing.GroupLayout E11Layout = new javax.swing.GroupLayout(E11);
        E11.setLayout(E11Layout);
        E11Layout.setHorizontalGroup(
            E11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        E11Layout.setVerticalGroup(
            E11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 26, Short.MAX_VALUE)
        );

        E12.setBackground(new java.awt.Color(53, 140, 250));

        javax.swing.GroupLayout E12Layout = new javax.swing.GroupLayout(E12);
        E12.setLayout(E12Layout);
        E12Layout.setHorizontalGroup(
            E12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        E12Layout.setVerticalGroup(
            E12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 26, Short.MAX_VALUE)
        );

        F10.setBackground(new java.awt.Color(53, 140, 250));

        javax.swing.GroupLayout F10Layout = new javax.swing.GroupLayout(F10);
        F10.setLayout(F10Layout);
        F10Layout.setHorizontalGroup(
            F10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        F10Layout.setVerticalGroup(
            F10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 26, Short.MAX_VALUE)
        );

        F11.setBackground(new java.awt.Color(53, 140, 250));

        javax.swing.GroupLayout F11Layout = new javax.swing.GroupLayout(F11);
        F11.setLayout(F11Layout);
        F11Layout.setHorizontalGroup(
            F11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        F11Layout.setVerticalGroup(
            F11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 26, Short.MAX_VALUE)
        );

        F12.setBackground(new java.awt.Color(53, 140, 250));

        javax.swing.GroupLayout F12Layout = new javax.swing.GroupLayout(F12);
        F12.setLayout(F12Layout);
        F12Layout.setHorizontalGroup(
            F12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        F12Layout.setVerticalGroup(
            F12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 26, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout MiddleClass1Layout = new javax.swing.GroupLayout(MiddleClass1);
        MiddleClass1.setLayout(MiddleClass1Layout);
        MiddleClass1Layout.setHorizontalGroup(
            MiddleClass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MiddleClass1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(MiddleClass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MiddleClass1Layout.createSequentialGroup()
                        .addComponent(E10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(E11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(E12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(MiddleClass1Layout.createSequentialGroup()
                        .addComponent(F10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(F11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(F12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(MiddleClass1Layout.createSequentialGroup()
                        .addComponent(A10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(A11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(A12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(MiddleClass1Layout.createSequentialGroup()
                        .addComponent(B10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(B11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(B12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(MiddleClass1Layout.createSequentialGroup()
                        .addComponent(D10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(D11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(D12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(MiddleClass1Layout.createSequentialGroup()
                        .addComponent(C10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(C11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(C12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        MiddleClass1Layout.setVerticalGroup(
            MiddleClass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MiddleClass1Layout.createSequentialGroup()
                .addGroup(MiddleClass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(A10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(A11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(A12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(MiddleClass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(B10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(MiddleClass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(C10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(C11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(C12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(MiddleClass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(D10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(D11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(D12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(MiddleClass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(E11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(E12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(E10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(MiddleClass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(F10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(F11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(F12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        A10.getAccessibleContext().setAccessibleName("A10");
        A11.getAccessibleContext().setAccessibleName("A11");
        A12.getAccessibleContext().setAccessibleName("A12");

        A7.setBackground(new java.awt.Color(53, 140, 250));
        A7.setName("A7"); // NOI18N

        javax.swing.GroupLayout A7Layout = new javax.swing.GroupLayout(A7);
        A7.setLayout(A7Layout);
        A7Layout.setHorizontalGroup(
            A7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        A7Layout.setVerticalGroup(
            A7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 26, Short.MAX_VALUE)
        );

        A8.setBackground(new java.awt.Color(53, 140, 250));
        A8.setName("A8"); // NOI18N

        javax.swing.GroupLayout A8Layout = new javax.swing.GroupLayout(A8);
        A8.setLayout(A8Layout);
        A8Layout.setHorizontalGroup(
            A8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        A8Layout.setVerticalGroup(
            A8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 26, Short.MAX_VALUE)
        );

        A9.setBackground(new java.awt.Color(53, 140, 250));
        A9.setName("A9"); // NOI18N

        javax.swing.GroupLayout A9Layout = new javax.swing.GroupLayout(A9);
        A9.setLayout(A9Layout);
        A9Layout.setHorizontalGroup(
            A9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        A9Layout.setVerticalGroup(
            A9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 26, Short.MAX_VALUE)
        );

        B7.setBackground(new java.awt.Color(53, 140, 250));

        javax.swing.GroupLayout B7Layout = new javax.swing.GroupLayout(B7);
        B7.setLayout(B7Layout);
        B7Layout.setHorizontalGroup(
            B7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        B7Layout.setVerticalGroup(
            B7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 26, Short.MAX_VALUE)
        );

        B8.setBackground(new java.awt.Color(53, 140, 250));

        javax.swing.GroupLayout B8Layout = new javax.swing.GroupLayout(B8);
        B8.setLayout(B8Layout);
        B8Layout.setHorizontalGroup(
            B8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        B8Layout.setVerticalGroup(
            B8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 26, Short.MAX_VALUE)
        );

        B9.setBackground(new java.awt.Color(53, 140, 250));

        javax.swing.GroupLayout B9Layout = new javax.swing.GroupLayout(B9);
        B9.setLayout(B9Layout);
        B9Layout.setHorizontalGroup(
            B9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        B9Layout.setVerticalGroup(
            B9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 26, Short.MAX_VALUE)
        );

        C7.setBackground(new java.awt.Color(53, 140, 250));

        javax.swing.GroupLayout C7Layout = new javax.swing.GroupLayout(C7);
        C7.setLayout(C7Layout);
        C7Layout.setHorizontalGroup(
            C7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        C7Layout.setVerticalGroup(
            C7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 26, Short.MAX_VALUE)
        );

        C8.setBackground(new java.awt.Color(53, 140, 250));

        javax.swing.GroupLayout C8Layout = new javax.swing.GroupLayout(C8);
        C8.setLayout(C8Layout);
        C8Layout.setHorizontalGroup(
            C8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        C8Layout.setVerticalGroup(
            C8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 26, Short.MAX_VALUE)
        );

        C9.setBackground(new java.awt.Color(53, 140, 250));

        javax.swing.GroupLayout C9Layout = new javax.swing.GroupLayout(C9);
        C9.setLayout(C9Layout);
        C9Layout.setHorizontalGroup(
            C9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        C9Layout.setVerticalGroup(
            C9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 26, Short.MAX_VALUE)
        );

        D7.setBackground(new java.awt.Color(53, 140, 250));

        javax.swing.GroupLayout D7Layout = new javax.swing.GroupLayout(D7);
        D7.setLayout(D7Layout);
        D7Layout.setHorizontalGroup(
            D7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        D7Layout.setVerticalGroup(
            D7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 26, Short.MAX_VALUE)
        );

        D8.setBackground(new java.awt.Color(53, 140, 250));

        javax.swing.GroupLayout D8Layout = new javax.swing.GroupLayout(D8);
        D8.setLayout(D8Layout);
        D8Layout.setHorizontalGroup(
            D8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        D8Layout.setVerticalGroup(
            D8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 26, Short.MAX_VALUE)
        );

        D9.setBackground(new java.awt.Color(53, 140, 250));

        javax.swing.GroupLayout D9Layout = new javax.swing.GroupLayout(D9);
        D9.setLayout(D9Layout);
        D9Layout.setHorizontalGroup(
            D9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        D9Layout.setVerticalGroup(
            D9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 26, Short.MAX_VALUE)
        );

        E7.setBackground(new java.awt.Color(53, 140, 250));

        javax.swing.GroupLayout E7Layout = new javax.swing.GroupLayout(E7);
        E7.setLayout(E7Layout);
        E7Layout.setHorizontalGroup(
            E7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        E7Layout.setVerticalGroup(
            E7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 26, Short.MAX_VALUE)
        );

        E8.setBackground(new java.awt.Color(53, 140, 250));

        javax.swing.GroupLayout E8Layout = new javax.swing.GroupLayout(E8);
        E8.setLayout(E8Layout);
        E8Layout.setHorizontalGroup(
            E8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        E8Layout.setVerticalGroup(
            E8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 26, Short.MAX_VALUE)
        );

        E9.setBackground(new java.awt.Color(53, 140, 250));

        javax.swing.GroupLayout E9Layout = new javax.swing.GroupLayout(E9);
        E9.setLayout(E9Layout);
        E9Layout.setHorizontalGroup(
            E9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        E9Layout.setVerticalGroup(
            E9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 26, Short.MAX_VALUE)
        );

        F7.setBackground(new java.awt.Color(53, 140, 250));

        javax.swing.GroupLayout F7Layout = new javax.swing.GroupLayout(F7);
        F7.setLayout(F7Layout);
        F7Layout.setHorizontalGroup(
            F7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        F7Layout.setVerticalGroup(
            F7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 26, Short.MAX_VALUE)
        );

        F8.setBackground(new java.awt.Color(53, 140, 250));

        javax.swing.GroupLayout F8Layout = new javax.swing.GroupLayout(F8);
        F8.setLayout(F8Layout);
        F8Layout.setHorizontalGroup(
            F8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        F8Layout.setVerticalGroup(
            F8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 26, Short.MAX_VALUE)
        );

        F9.setBackground(new java.awt.Color(53, 140, 250));

        javax.swing.GroupLayout F9Layout = new javax.swing.GroupLayout(F9);
        F9.setLayout(F9Layout);
        F9Layout.setHorizontalGroup(
            F9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        F9Layout.setVerticalGroup(
            F9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 26, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout MiddleClass2Layout = new javax.swing.GroupLayout(MiddleClass2);
        MiddleClass2.setLayout(MiddleClass2Layout);
        MiddleClass2Layout.setHorizontalGroup(
            MiddleClass2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MiddleClass2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(MiddleClass2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MiddleClass2Layout.createSequentialGroup()
                        .addComponent(E7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(E8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(E9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(MiddleClass2Layout.createSequentialGroup()
                        .addComponent(F7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(F8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(F9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(MiddleClass2Layout.createSequentialGroup()
                        .addComponent(A7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(A8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(A9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(MiddleClass2Layout.createSequentialGroup()
                        .addComponent(B7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(B8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(B9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(MiddleClass2Layout.createSequentialGroup()
                        .addComponent(D7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(D8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(D9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(MiddleClass2Layout.createSequentialGroup()
                        .addComponent(C7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(C8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(C9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        MiddleClass2Layout.setVerticalGroup(
            MiddleClass2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MiddleClass2Layout.createSequentialGroup()
                .addGroup(MiddleClass2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(A7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(A8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(A9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(MiddleClass2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(B7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(MiddleClass2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(C7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(C8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(C9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(MiddleClass2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(D7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(D8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(D9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(MiddleClass2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(E8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(E9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(E7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(MiddleClass2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(F7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(F8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(F9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        A7.getAccessibleContext().setAccessibleName("A7");
        A8.getAccessibleContext().setAccessibleName("A8");
        A9.getAccessibleContext().setAccessibleName("A9");

        A13.setBackground(new java.awt.Color(53, 140, 250));
        A13.setName("A13"); // NOI18N

        javax.swing.GroupLayout A13Layout = new javax.swing.GroupLayout(A13);
        A13.setLayout(A13Layout);
        A13Layout.setHorizontalGroup(
            A13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        A13Layout.setVerticalGroup(
            A13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 26, Short.MAX_VALUE)
        );

        A14.setBackground(new java.awt.Color(53, 140, 250));
        A14.setName("A14"); // NOI18N

        javax.swing.GroupLayout A14Layout = new javax.swing.GroupLayout(A14);
        A14.setLayout(A14Layout);
        A14Layout.setHorizontalGroup(
            A14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        A14Layout.setVerticalGroup(
            A14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 26, Short.MAX_VALUE)
        );

        A15.setBackground(new java.awt.Color(53, 140, 250));
        A15.setName("A15"); // NOI18N

        javax.swing.GroupLayout A15Layout = new javax.swing.GroupLayout(A15);
        A15.setLayout(A15Layout);
        A15Layout.setHorizontalGroup(
            A15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        A15Layout.setVerticalGroup(
            A15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 26, Short.MAX_VALUE)
        );

        B13.setBackground(new java.awt.Color(53, 140, 250));

        javax.swing.GroupLayout B13Layout = new javax.swing.GroupLayout(B13);
        B13.setLayout(B13Layout);
        B13Layout.setHorizontalGroup(
            B13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        B13Layout.setVerticalGroup(
            B13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 26, Short.MAX_VALUE)
        );

        B14.setBackground(new java.awt.Color(53, 140, 250));

        javax.swing.GroupLayout B14Layout = new javax.swing.GroupLayout(B14);
        B14.setLayout(B14Layout);
        B14Layout.setHorizontalGroup(
            B14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        B14Layout.setVerticalGroup(
            B14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 26, Short.MAX_VALUE)
        );

        B15.setBackground(new java.awt.Color(53, 140, 250));

        javax.swing.GroupLayout B15Layout = new javax.swing.GroupLayout(B15);
        B15.setLayout(B15Layout);
        B15Layout.setHorizontalGroup(
            B15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        B15Layout.setVerticalGroup(
            B15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 26, Short.MAX_VALUE)
        );

        C13.setBackground(new java.awt.Color(53, 140, 250));

        javax.swing.GroupLayout C13Layout = new javax.swing.GroupLayout(C13);
        C13.setLayout(C13Layout);
        C13Layout.setHorizontalGroup(
            C13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        C13Layout.setVerticalGroup(
            C13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 26, Short.MAX_VALUE)
        );

        C14.setBackground(new java.awt.Color(53, 140, 250));

        javax.swing.GroupLayout C14Layout = new javax.swing.GroupLayout(C14);
        C14.setLayout(C14Layout);
        C14Layout.setHorizontalGroup(
            C14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        C14Layout.setVerticalGroup(
            C14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 26, Short.MAX_VALUE)
        );

        C15.setBackground(new java.awt.Color(53, 140, 250));

        javax.swing.GroupLayout C15Layout = new javax.swing.GroupLayout(C15);
        C15.setLayout(C15Layout);
        C15Layout.setHorizontalGroup(
            C15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        C15Layout.setVerticalGroup(
            C15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 26, Short.MAX_VALUE)
        );

        D13.setBackground(new java.awt.Color(53, 140, 250));

        javax.swing.GroupLayout D13Layout = new javax.swing.GroupLayout(D13);
        D13.setLayout(D13Layout);
        D13Layout.setHorizontalGroup(
            D13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        D13Layout.setVerticalGroup(
            D13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 26, Short.MAX_VALUE)
        );

        D14.setBackground(new java.awt.Color(53, 140, 250));

        javax.swing.GroupLayout D14Layout = new javax.swing.GroupLayout(D14);
        D14.setLayout(D14Layout);
        D14Layout.setHorizontalGroup(
            D14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        D14Layout.setVerticalGroup(
            D14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 26, Short.MAX_VALUE)
        );

        D15.setBackground(new java.awt.Color(53, 140, 250));

        javax.swing.GroupLayout D15Layout = new javax.swing.GroupLayout(D15);
        D15.setLayout(D15Layout);
        D15Layout.setHorizontalGroup(
            D15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        D15Layout.setVerticalGroup(
            D15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 26, Short.MAX_VALUE)
        );

        E13.setBackground(new java.awt.Color(53, 140, 250));

        javax.swing.GroupLayout E13Layout = new javax.swing.GroupLayout(E13);
        E13.setLayout(E13Layout);
        E13Layout.setHorizontalGroup(
            E13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        E13Layout.setVerticalGroup(
            E13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 26, Short.MAX_VALUE)
        );

        E14.setBackground(new java.awt.Color(53, 140, 250));

        javax.swing.GroupLayout E14Layout = new javax.swing.GroupLayout(E14);
        E14.setLayout(E14Layout);
        E14Layout.setHorizontalGroup(
            E14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        E14Layout.setVerticalGroup(
            E14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 26, Short.MAX_VALUE)
        );

        E15.setBackground(new java.awt.Color(53, 140, 250));

        javax.swing.GroupLayout E15Layout = new javax.swing.GroupLayout(E15);
        E15.setLayout(E15Layout);
        E15Layout.setHorizontalGroup(
            E15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        E15Layout.setVerticalGroup(
            E15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 26, Short.MAX_VALUE)
        );

        F13.setBackground(new java.awt.Color(53, 140, 250));

        javax.swing.GroupLayout F13Layout = new javax.swing.GroupLayout(F13);
        F13.setLayout(F13Layout);
        F13Layout.setHorizontalGroup(
            F13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        F13Layout.setVerticalGroup(
            F13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 26, Short.MAX_VALUE)
        );

        F14.setBackground(new java.awt.Color(53, 140, 250));

        javax.swing.GroupLayout F14Layout = new javax.swing.GroupLayout(F14);
        F14.setLayout(F14Layout);
        F14Layout.setHorizontalGroup(
            F14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        F14Layout.setVerticalGroup(
            F14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 26, Short.MAX_VALUE)
        );

        F15.setBackground(new java.awt.Color(53, 140, 250));

        javax.swing.GroupLayout F15Layout = new javax.swing.GroupLayout(F15);
        F15.setLayout(F15Layout);
        F15Layout.setHorizontalGroup(
            F15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        F15Layout.setVerticalGroup(
            F15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 26, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout MiddleClass3Layout = new javax.swing.GroupLayout(MiddleClass3);
        MiddleClass3.setLayout(MiddleClass3Layout);
        MiddleClass3Layout.setHorizontalGroup(
            MiddleClass3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MiddleClass3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(MiddleClass3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MiddleClass3Layout.createSequentialGroup()
                        .addComponent(E13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(E14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(E15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(MiddleClass3Layout.createSequentialGroup()
                        .addComponent(F13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(F14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(F15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(MiddleClass3Layout.createSequentialGroup()
                        .addComponent(A13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(A14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(A15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(MiddleClass3Layout.createSequentialGroup()
                        .addComponent(B13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(B14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(B15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(MiddleClass3Layout.createSequentialGroup()
                        .addComponent(D13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(D14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(D15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(MiddleClass3Layout.createSequentialGroup()
                        .addComponent(C13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(C14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(C15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        MiddleClass3Layout.setVerticalGroup(
            MiddleClass3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MiddleClass3Layout.createSequentialGroup()
                .addGroup(MiddleClass3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(A13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(A14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(A15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(MiddleClass3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(B13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(MiddleClass3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(C13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(C14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(C15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(MiddleClass3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(D13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(D14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(D15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(MiddleClass3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(E14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(E15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(E13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(MiddleClass3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(F13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(F14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(F15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        A13.getAccessibleContext().setAccessibleName("A13");
        A14.getAccessibleContext().setAccessibleName("A14");
        A15.getAccessibleContext().setAccessibleName("A15");

        backDrop2.setBackground(new java.awt.Color(255, 255, 255));
        backDrop2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("First Class");

        javax.swing.GroupLayout backDrop2Layout = new javax.swing.GroupLayout(backDrop2);
        backDrop2.setLayout(backDrop2Layout);
        backDrop2Layout.setHorizontalGroup(
            backDrop2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backDrop2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                .addGap(24, 24, 24))
        );
        backDrop2Layout.setVerticalGroup(
            backDrop2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backDrop2Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        backDrop3.setBackground(new java.awt.Color(255, 255, 255));
        backDrop3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Poor People Class");

        javax.swing.GroupLayout backDrop3Layout = new javax.swing.GroupLayout(backDrop3);
        backDrop3.setLayout(backDrop3Layout);
        backDrop3Layout.setHorizontalGroup(
            backDrop3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backDrop3Layout.createSequentialGroup()
                .addGap(146, 146, 146)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(171, Short.MAX_VALUE))
        );
        backDrop3Layout.setVerticalGroup(
            backDrop3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backDrop3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel3))
        );

        backDrop11.setBackground(new java.awt.Color(255, 255, 255));
        backDrop11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel10.setBackground(new java.awt.Color(0, 0, 0));
        jLabel10.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 14)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel10.setText("1   |    2   |    3            4        5        6           7        8        9           10       11     12        13      14      15");

        javax.swing.GroupLayout backDrop11Layout = new javax.swing.GroupLayout(backDrop11);
        backDrop11.setLayout(backDrop11Layout);
        backDrop11Layout.setHorizontalGroup(
            backDrop11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backDrop11Layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addContainerGap())
        );
        backDrop11Layout.setVerticalGroup(
            backDrop11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backDrop11Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel10))
        );

        backDrop10.setBackground(new java.awt.Color(255, 255, 255));
        backDrop10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jPanel92.setBackground(new java.awt.Color(238, 193, 48));
        jPanel92.setToolTipText("");

        javax.swing.GroupLayout jPanel92Layout = new javax.swing.GroupLayout(jPanel92);
        jPanel92.setLayout(jPanel92Layout);
        jPanel92Layout.setHorizontalGroup(
            jPanel92Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 35, Short.MAX_VALUE)
        );
        jPanel92Layout.setVerticalGroup(
            jPanel92Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 26, Short.MAX_VALUE)
        );

        jLabel11.setBackground(new java.awt.Color(0, 0, 0));
        jLabel11.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 14)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel11.setText("PREMIUM");

        javax.swing.GroupLayout backDrop10Layout = new javax.swing.GroupLayout(backDrop10);
        backDrop10.setLayout(backDrop10Layout);
        backDrop10Layout.setHorizontalGroup(
            backDrop10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backDrop10Layout.createSequentialGroup()
                .addComponent(jPanel92, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 8, Short.MAX_VALUE))
        );
        backDrop10Layout.setVerticalGroup(
            backDrop10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jPanel92, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jLabel11)
        );

        backDrop12.setBackground(new java.awt.Color(255, 255, 255));
        backDrop12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jPanel93.setBackground(new java.awt.Color(53, 140, 250));
        jPanel93.setToolTipText("");

        javax.swing.GroupLayout jPanel93Layout = new javax.swing.GroupLayout(jPanel93);
        jPanel93.setLayout(jPanel93Layout);
        jPanel93Layout.setHorizontalGroup(
            jPanel93Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 35, Short.MAX_VALUE)
        );
        jPanel93Layout.setVerticalGroup(
            jPanel93Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 26, Short.MAX_VALUE)
        );

        jLabel12.setBackground(new java.awt.Color(0, 0, 0));
        jLabel12.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 14)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel12.setText("Available");

        javax.swing.GroupLayout backDrop12Layout = new javax.swing.GroupLayout(backDrop12);
        backDrop12.setLayout(backDrop12Layout);
        backDrop12Layout.setHorizontalGroup(
            backDrop12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backDrop12Layout.createSequentialGroup()
                .addComponent(jPanel93, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 8, Short.MAX_VALUE))
        );
        backDrop12Layout.setVerticalGroup(
            backDrop12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel93, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        backDrop13.setBackground(new java.awt.Color(255, 255, 255));
        backDrop13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jPanel94.setBackground(new java.awt.Color(102, 102, 102));
        jPanel94.setToolTipText("");

        javax.swing.GroupLayout jPanel94Layout = new javax.swing.GroupLayout(jPanel94);
        jPanel94.setLayout(jPanel94Layout);
        jPanel94Layout.setHorizontalGroup(
            jPanel94Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 35, Short.MAX_VALUE)
        );
        jPanel94Layout.setVerticalGroup(
            jPanel94Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 26, Short.MAX_VALUE)
        );

        jLabel13.setBackground(new java.awt.Color(0, 0, 0));
        jLabel13.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 14)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel13.setText("TAKEN");

        javax.swing.GroupLayout backDrop13Layout = new javax.swing.GroupLayout(backDrop13);
        backDrop13.setLayout(backDrop13Layout);
        backDrop13Layout.setHorizontalGroup(
            backDrop13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backDrop13Layout.createSequentialGroup()
                .addComponent(jPanel94, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 8, Short.MAX_VALUE))
        );
        backDrop13Layout.setVerticalGroup(
            backDrop13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel94, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        jLabel14.setBackground(new java.awt.Color(0, 0, 0));
        jLabel14.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 14)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel14.setText("Name:");

        txtbox_firstName.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 14)); // NOI18N

        txtbox_firstName1.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 14)); // NOI18N

        jLabel15.setBackground(new java.awt.Color(0, 0, 0));
        jLabel15.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 14)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel15.setText("Flight:");

        panel_firstName.setBackground(new java.awt.Color(77, 80, 97));

        lbl_firstName.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 14)); // NOI18N
        lbl_firstName.setForeground(new java.awt.Color(255, 255, 255));
        lbl_firstName.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lbl_firstName.setText("SEAT COST:");

        txtbox_firstName2.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 14)); // NOI18N

        javax.swing.GroupLayout panel_firstNameLayout = new javax.swing.GroupLayout(panel_firstName);
        panel_firstName.setLayout(panel_firstNameLayout);
        panel_firstNameLayout.setHorizontalGroup(
            panel_firstNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_firstNameLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_firstName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtbox_firstName2, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panel_firstNameLayout.setVerticalGroup(
            panel_firstNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_firstNameLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_firstNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_firstName)
                    .addComponent(txtbox_firstName2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton1.setText("Confirm Seat");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel16.setBackground(new java.awt.Color(0, 0, 0));
        jLabel16.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 14)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel16.setText("Seat Selected:");

        Seat_Loc.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel95Layout = new javax.swing.GroupLayout(jPanel95);
        jPanel95.setLayout(jPanel95Layout);
        jPanel95Layout.setHorizontalGroup(
            jPanel95Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel95Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel95Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel95Layout.createSequentialGroup()
                        .addGroup(jPanel95Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel95Layout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                            .addGroup(jPanel95Layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addGap(9, 9, 9)))
                        .addGroup(jPanel95Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtbox_firstName, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                            .addComponent(txtbox_firstName1)))
                    .addGroup(jPanel95Layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Seat_Loc, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel95Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel_firstName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        jPanel95Layout.setVerticalGroup(
            jPanel95Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel95Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel95Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panel_firstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel95Layout.createSequentialGroup()
                        .addGroup(jPanel95Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(txtbox_firstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel95Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(txtbox_firstName1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(jPanel95Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jLabel16)
                    .addComponent(Seat_Loc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(backDrop1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(backDrop10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(backDrop12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(backDrop13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(FirstClass, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(backDrop2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(MiddleClass, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(MiddleClass2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(MiddleClass1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(MiddleClass3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jPanel95, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(backDrop3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addComponent(backDrop11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(backDrop1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(backDrop10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(backDrop12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(backDrop13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel95, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(backDrop2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backDrop3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(FirstClass, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(MiddleClass, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(MiddleClass2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(MiddleClass1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(MiddleClass3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(backDrop11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void A1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_A1MouseEntered
        // TODO add yfour handling code here:
    }//GEN-LAST:event_A1MouseEntered

    private void formMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseEntered
        // TODO add your handling code here:
        
    }//GEN-LAST:event_formMouseEntered


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel A1;
    private javax.swing.JPanel A10;
    private javax.swing.JPanel A11;
    private javax.swing.JPanel A12;
    private javax.swing.JPanel A13;
    private javax.swing.JPanel A14;
    private javax.swing.JPanel A15;
    private javax.swing.JPanel A2;
    private javax.swing.JPanel A3;
    private javax.swing.JPanel A4;
    private javax.swing.JPanel A5;
    private javax.swing.JPanel A6;
    private javax.swing.JPanel A7;
    private javax.swing.JPanel A8;
    private javax.swing.JPanel A9;
    private javax.swing.JPanel B1;
    private javax.swing.JPanel B10;
    private javax.swing.JPanel B11;
    private javax.swing.JPanel B12;
    private javax.swing.JPanel B13;
    private javax.swing.JPanel B14;
    private javax.swing.JPanel B15;
    private javax.swing.JPanel B2;
    private javax.swing.JPanel B3;
    private javax.swing.JPanel B4;
    private javax.swing.JPanel B5;
    private javax.swing.JPanel B6;
    private javax.swing.JPanel B7;
    private javax.swing.JPanel B8;
    private javax.swing.JPanel B9;
    private javax.swing.JPanel C1;
    private javax.swing.JPanel C10;
    private javax.swing.JPanel C11;
    private javax.swing.JPanel C12;
    private javax.swing.JPanel C13;
    private javax.swing.JPanel C14;
    private javax.swing.JPanel C15;
    private javax.swing.JPanel C2;
    private javax.swing.JPanel C3;
    private javax.swing.JPanel C4;
    private javax.swing.JPanel C5;
    private javax.swing.JPanel C6;
    private javax.swing.JPanel C7;
    private javax.swing.JPanel C8;
    private javax.swing.JPanel C9;
    private javax.swing.JPanel D1;
    private javax.swing.JPanel D10;
    private javax.swing.JPanel D11;
    private javax.swing.JPanel D12;
    private javax.swing.JPanel D13;
    private javax.swing.JPanel D14;
    private javax.swing.JPanel D15;
    private javax.swing.JPanel D2;
    private javax.swing.JPanel D3;
    private javax.swing.JPanel D4;
    private javax.swing.JPanel D5;
    private javax.swing.JPanel D6;
    private javax.swing.JPanel D7;
    private javax.swing.JPanel D8;
    private javax.swing.JPanel D9;
    private javax.swing.JPanel E1;
    private javax.swing.JPanel E10;
    private javax.swing.JPanel E11;
    private javax.swing.JPanel E12;
    private javax.swing.JPanel E13;
    private javax.swing.JPanel E14;
    private javax.swing.JPanel E15;
    private javax.swing.JPanel E2;
    private javax.swing.JPanel E3;
    private javax.swing.JPanel E4;
    private javax.swing.JPanel E5;
    private javax.swing.JPanel E6;
    private javax.swing.JPanel E7;
    private javax.swing.JPanel E8;
    private javax.swing.JPanel E9;
    private javax.swing.JPanel F1;
    private javax.swing.JPanel F10;
    private javax.swing.JPanel F11;
    private javax.swing.JPanel F12;
    private javax.swing.JPanel F13;
    private javax.swing.JPanel F14;
    private javax.swing.JPanel F15;
    private javax.swing.JPanel F2;
    private javax.swing.JPanel F3;
    private javax.swing.JPanel F4;
    private javax.swing.JPanel F5;
    private javax.swing.JPanel F6;
    private javax.swing.JPanel F7;
    private javax.swing.JPanel F8;
    private javax.swing.JPanel F9;
    private javax.swing.JPanel FirstClass;
    private javax.swing.JPanel MiddleClass;
    private javax.swing.JPanel MiddleClass1;
    private javax.swing.JPanel MiddleClass2;
    private javax.swing.JPanel MiddleClass3;
    private javax.swing.JTextField Seat_Loc;
    private javax.swing.JPanel backDrop1;
    private javax.swing.JPanel backDrop10;
    private javax.swing.JPanel backDrop11;
    private javax.swing.JPanel backDrop12;
    private javax.swing.JPanel backDrop13;
    private javax.swing.JPanel backDrop2;
    private javax.swing.JPanel backDrop3;
    private javax.swing.JPanel backDrop4;
    private javax.swing.JPanel backDrop5;
    private javax.swing.JPanel backDrop6;
    private javax.swing.JPanel backDrop7;
    private javax.swing.JPanel backDrop8;
    private javax.swing.JPanel backDrop9;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel92;
    private javax.swing.JPanel jPanel93;
    private javax.swing.JPanel jPanel94;
    private javax.swing.JPanel jPanel95;
    private javax.swing.JLabel lbl_firstName;
    private javax.swing.JPanel panel_firstName;
    private javax.swing.JTextField txtbox_firstName;
    private javax.swing.JTextField txtbox_firstName1;
    private javax.swing.JTextField txtbox_firstName2;
    // End of variables declaration//GEN-END:variables
}
