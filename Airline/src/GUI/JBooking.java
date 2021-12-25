package GUI;

import Business.JSystem;
import java.awt.CardLayout;
import java.util.ArrayList;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.JTextField;


public class JBooking extends javax.swing.JFrame {
    
    private JSystem system;
    private CardLayout cards;
    private String flightId;
    private ArrayList<JTextField> textFields;
    
    public JBooking(JSystem system) {
        this.system = system;
        initComponents();
        this.setVisible(true);
    }
    
    public JBooking(String id, String src, String dest, String Ddate, String Dtime, String Connections){
        initComponents();
        this.setVisible(true);
        
        flightId = id;
        textFields = new ArrayList<>();
        textFields.add(txtbox_firstName);
        textFields.add(txtbox_lastName);
        textFields.add(txtbox_cnic);
        textFields.add(txtbox_address);
        textFields.add(txtbox_contact);
    }
    
    public boolean anyFieldsEmpty() {
        for (JTextField textbox : textFields) {
            if (textbox.getText().trim().isEmpty() ) {
                return true;   // one field is non-empty, so we can stop immediately
            }
        }
        return false;  // every field was empty (or else we'd have stopped earlier)
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cardstack = new javax.swing.JPanel();
        card_customerInfo = new javax.swing.JPanel();
        backdrop1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        panel_firstName = new javax.swing.JPanel();
        lbl_firstName = new javax.swing.JLabel();
        panel_firstNameField = new javax.swing.JPanel();
        txtbox_firstName = new javax.swing.JTextField();
        panel_lastName = new javax.swing.JPanel();
        lbl_lastName = new javax.swing.JLabel();
        panel_lastNameField = new javax.swing.JPanel();
        txtbox_lastName = new javax.swing.JTextField();
        panel_cnic = new javax.swing.JPanel();
        lbl_cnic = new javax.swing.JLabel();
        panel_cnicField = new javax.swing.JPanel();
        txtbox_cnic = new javax.swing.JTextField();
        panel_address = new javax.swing.JPanel();
        lbl_address = new javax.swing.JLabel();
        panel_addressField = new javax.swing.JPanel();
        txtbox_address = new javax.swing.JTextField();
        panel_contact = new javax.swing.JPanel();
        lbl_contact = new javax.swing.JLabel();
        panel_contactField = new javax.swing.JPanel();
        txtbox_contact = new javax.swing.JTextField();
        btn_cancel = new javax.swing.JLabel();
        btn_next = new javax.swing.JLabel();
        card_seatSelection = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        cardstack.setBackground(new java.awt.Color(205, 209, 196));
        cardstack.setLayout(new java.awt.CardLayout());

        backdrop1.setBackground(new java.awt.Color(48, 50, 61));

        jLabel1.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("BOOKING | CUSTOMER DETAILS");

        javax.swing.GroupLayout backdrop1Layout = new javax.swing.GroupLayout(backdrop1);
        backdrop1.setLayout(backdrop1Layout);
        backdrop1Layout.setHorizontalGroup(
            backdrop1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backdrop1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 376, Short.MAX_VALUE)
                .addContainerGap())
        );
        backdrop1Layout.setVerticalGroup(
            backdrop1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backdrop1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        panel_firstName.setBackground(new java.awt.Color(77, 80, 97));

        lbl_firstName.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 14)); // NOI18N
        lbl_firstName.setForeground(new java.awt.Color(255, 255, 255));
        lbl_firstName.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lbl_firstName.setText("First Name");

        javax.swing.GroupLayout panel_firstNameLayout = new javax.swing.GroupLayout(panel_firstName);
        panel_firstName.setLayout(panel_firstNameLayout);
        panel_firstNameLayout.setHorizontalGroup(
            panel_firstNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_firstNameLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_firstName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panel_firstNameLayout.setVerticalGroup(
            panel_firstNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_firstNameLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_firstName)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        txtbox_firstName.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 14)); // NOI18N

        javax.swing.GroupLayout panel_firstNameFieldLayout = new javax.swing.GroupLayout(panel_firstNameField);
        panel_firstNameField.setLayout(panel_firstNameFieldLayout);
        panel_firstNameFieldLayout.setHorizontalGroup(
            panel_firstNameFieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtbox_firstName)
        );
        panel_firstNameFieldLayout.setVerticalGroup(
            panel_firstNameFieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtbox_firstName)
        );

        panel_lastName.setBackground(new java.awt.Color(77, 80, 97));

        lbl_lastName.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 14)); // NOI18N
        lbl_lastName.setForeground(new java.awt.Color(255, 255, 255));
        lbl_lastName.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lbl_lastName.setText("Last Name");

        javax.swing.GroupLayout panel_lastNameLayout = new javax.swing.GroupLayout(panel_lastName);
        panel_lastName.setLayout(panel_lastNameLayout);
        panel_lastNameLayout.setHorizontalGroup(
            panel_lastNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_lastNameLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_lastName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panel_lastNameLayout.setVerticalGroup(
            panel_lastNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_lastNameLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_lastName)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        txtbox_lastName.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 14)); // NOI18N

        javax.swing.GroupLayout panel_lastNameFieldLayout = new javax.swing.GroupLayout(panel_lastNameField);
        panel_lastNameField.setLayout(panel_lastNameFieldLayout);
        panel_lastNameFieldLayout.setHorizontalGroup(
            panel_lastNameFieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtbox_lastName)
        );
        panel_lastNameFieldLayout.setVerticalGroup(
            panel_lastNameFieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtbox_lastName)
        );

        panel_cnic.setBackground(new java.awt.Color(77, 80, 97));

        lbl_cnic.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 14)); // NOI18N
        lbl_cnic.setForeground(new java.awt.Color(255, 255, 255));
        lbl_cnic.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lbl_cnic.setText("CNIC");

        javax.swing.GroupLayout panel_cnicLayout = new javax.swing.GroupLayout(panel_cnic);
        panel_cnic.setLayout(panel_cnicLayout);
        panel_cnicLayout.setHorizontalGroup(
            panel_cnicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_cnicLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_cnic, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panel_cnicLayout.setVerticalGroup(
            panel_cnicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_cnicLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_cnic)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        txtbox_cnic.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 14)); // NOI18N

        javax.swing.GroupLayout panel_cnicFieldLayout = new javax.swing.GroupLayout(panel_cnicField);
        panel_cnicField.setLayout(panel_cnicFieldLayout);
        panel_cnicFieldLayout.setHorizontalGroup(
            panel_cnicFieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtbox_cnic)
        );
        panel_cnicFieldLayout.setVerticalGroup(
            panel_cnicFieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtbox_cnic)
        );

        panel_address.setBackground(new java.awt.Color(77, 80, 97));

        lbl_address.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 14)); // NOI18N
        lbl_address.setForeground(new java.awt.Color(255, 255, 255));
        lbl_address.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lbl_address.setText("Address");

        javax.swing.GroupLayout panel_addressLayout = new javax.swing.GroupLayout(panel_address);
        panel_address.setLayout(panel_addressLayout);
        panel_addressLayout.setHorizontalGroup(
            panel_addressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_addressLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_address, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panel_addressLayout.setVerticalGroup(
            panel_addressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_addressLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_address)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        txtbox_address.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 14)); // NOI18N

        javax.swing.GroupLayout panel_addressFieldLayout = new javax.swing.GroupLayout(panel_addressField);
        panel_addressField.setLayout(panel_addressFieldLayout);
        panel_addressFieldLayout.setHorizontalGroup(
            panel_addressFieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtbox_address)
        );
        panel_addressFieldLayout.setVerticalGroup(
            panel_addressFieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtbox_address)
        );

        panel_contact.setBackground(new java.awt.Color(77, 80, 97));

        lbl_contact.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 14)); // NOI18N
        lbl_contact.setForeground(new java.awt.Color(255, 255, 255));
        lbl_contact.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lbl_contact.setText("Contact No");

        javax.swing.GroupLayout panel_contactLayout = new javax.swing.GroupLayout(panel_contact);
        panel_contact.setLayout(panel_contactLayout);
        panel_contactLayout.setHorizontalGroup(
            panel_contactLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_contactLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_contact)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel_contactLayout.setVerticalGroup(
            panel_contactLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_contactLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_contact)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        txtbox_contact.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 14)); // NOI18N

        javax.swing.GroupLayout panel_contactFieldLayout = new javax.swing.GroupLayout(panel_contactField);
        panel_contactField.setLayout(panel_contactFieldLayout);
        panel_contactFieldLayout.setHorizontalGroup(
            panel_contactFieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtbox_contact, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        panel_contactFieldLayout.setVerticalGroup(
            panel_contactFieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtbox_contact)
        );

        btn_cancel.setBackground(new java.awt.Color(77, 80, 97));
        btn_cancel.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 14)); // NOI18N
        btn_cancel.setForeground(new java.awt.Color(255, 255, 255));
        btn_cancel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_cancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/images/cancel-24.png"))); // NOI18N
        btn_cancel.setText("CANCEL");
        btn_cancel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_cancel.setOpaque(true);
        btn_cancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_cancelMouseClicked(evt);
            }
        });

        btn_next.setBackground(new java.awt.Color(77, 80, 97));
        btn_next.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 14)); // NOI18N
        btn_next.setForeground(new java.awt.Color(255, 255, 255));
        btn_next.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_next.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/images/arrow-27-24.png"))); // NOI18N
        btn_next.setText("NEXT");
        btn_next.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_next.setIconTextGap(-70);
        btn_next.setOpaque(true);
        btn_next.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_nextMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout card_customerInfoLayout = new javax.swing.GroupLayout(card_customerInfo);
        card_customerInfo.setLayout(card_customerInfoLayout);
        card_customerInfoLayout.setHorizontalGroup(
            card_customerInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backdrop1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(card_customerInfoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(card_customerInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(card_customerInfoLayout.createSequentialGroup()
                        .addComponent(btn_cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_next, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(card_customerInfoLayout.createSequentialGroup()
                        .addGroup(card_customerInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(panel_firstName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(panel_contact, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(panel_address, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(panel_cnic, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(panel_lastName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(card_customerInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panel_lastNameField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(panel_cnicField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(panel_addressField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(panel_contactField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(panel_firstNameField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        card_customerInfoLayout.setVerticalGroup(
            card_customerInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(card_customerInfoLayout.createSequentialGroup()
                .addComponent(backdrop1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(card_customerInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panel_firstName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel_firstNameField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(card_customerInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panel_lastName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel_lastNameField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(card_customerInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panel_cnic, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel_cnicField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(card_customerInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panel_address, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel_addressField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(card_customerInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panel_contact, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel_contactField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(card_customerInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_next, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_cancel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        cardstack.add(card_customerInfo, "card2");

        javax.swing.GroupLayout card_seatSelectionLayout = new javax.swing.GroupLayout(card_seatSelection);
        card_seatSelection.setLayout(card_seatSelectionLayout);
        card_seatSelectionLayout.setHorizontalGroup(
            card_seatSelectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        card_seatSelectionLayout.setVerticalGroup(
            card_seatSelectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 450, Short.MAX_VALUE)
        );

        cardstack.add(card_seatSelection, "card3");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cardstack, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cardstack, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_cancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_cancelMouseClicked
        this.dispose();
    }//GEN-LAST:event_btn_cancelMouseClicked

    private void btn_nextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_nextMouseClicked
        
        if(anyFieldsEmpty()){
            showMessageDialog(null, "Please Fill Out All Details To Continue!");
        } else{
            String firstName = txtbox_firstName.getText().trim();
            String lastName = txtbox_lastName.getText().trim();
            String cnic = txtbox_cnic.getText().trim();
            String address = txtbox_address.getText().trim();
            String contact = txtbox_contact.getText().trim();
            
            
            this.dispose();
            JSeatSelect seats = new JSeatSelect(flightId, firstName, lastName, cnic, address, contact);
        }
    }//GEN-LAST:event_btn_nextMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel backdrop1;
    private javax.swing.JLabel btn_cancel;
    private javax.swing.JLabel btn_next;
    private javax.swing.JPanel card_customerInfo;
    private javax.swing.JPanel card_seatSelection;
    private javax.swing.JPanel cardstack;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lbl_address;
    private javax.swing.JLabel lbl_cnic;
    private javax.swing.JLabel lbl_contact;
    private javax.swing.JLabel lbl_firstName;
    private javax.swing.JLabel lbl_lastName;
    private javax.swing.JPanel panel_address;
    private javax.swing.JPanel panel_addressField;
    private javax.swing.JPanel panel_cnic;
    private javax.swing.JPanel panel_cnicField;
    private javax.swing.JPanel panel_contact;
    private javax.swing.JPanel panel_contactField;
    private javax.swing.JPanel panel_firstName;
    private javax.swing.JPanel panel_firstNameField;
    private javax.swing.JPanel panel_lastName;
    private javax.swing.JPanel panel_lastNameField;
    private javax.swing.JTextField txtbox_address;
    private javax.swing.JTextField txtbox_cnic;
    private javax.swing.JTextField txtbox_contact;
    private javax.swing.JTextField txtbox_firstName;
    private javax.swing.JTextField txtbox_lastName;
    // End of variables declaration//GEN-END:variables
}
