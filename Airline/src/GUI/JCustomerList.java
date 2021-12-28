package GUI;

import javax.swing.table.DefaultTableModel;

public class JCustomerList extends javax.swing.JFrame {

    private DefaultTableModel table_customers;
    private String flightID;
    
    public JCustomerList(String flightID) {
        setTableCustomers();
        initComponents();
        this.setVisible(true);
        this.flightID = flightID;
        this.lbl_flight.setText("FLIGHT: " + flightID);
    }
    
    private void setTableCustomers(){
        table_customers = new DefaultTableModel();
        String header[] = {
            "CNIC", "First Name", "Last Name", "Contact", "Seat No."
        };
        table_customers.setColumnCount(header.length);
        table_customers.setColumnIdentifiers(header);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_background = new javax.swing.JPanel();
        panel_backdrop = new javax.swing.JPanel();
        lbl_flight = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(600, 400));
        setResizable(false);

        panel_background.setBackground(new java.awt.Color(205, 209, 196));

        panel_backdrop.setBackground(new java.awt.Color(254, 182, 62));

        lbl_flight.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 24)); // NOI18N
        lbl_flight.setForeground(new java.awt.Color(255, 255, 255));
        lbl_flight.setText("FLIGHT:");

        javax.swing.GroupLayout panel_backdropLayout = new javax.swing.GroupLayout(panel_backdrop);
        panel_backdrop.setLayout(panel_backdropLayout);
        panel_backdropLayout.setHorizontalGroup(
            panel_backdropLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_backdropLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_flight, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panel_backdropLayout.setVerticalGroup(
            panel_backdropLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_flight, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        jTable1.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 14)); // NOI18N
        jTable1.setModel(table_customers);
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout panel_backgroundLayout = new javax.swing.GroupLayout(panel_background);
        panel_background.setLayout(panel_backgroundLayout);
        panel_backgroundLayout.setHorizontalGroup(
            panel_backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_backdrop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panel_backgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 576, Short.MAX_VALUE)
                .addContainerGap())
        );
        panel_backgroundLayout.setVerticalGroup(
            panel_backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_backgroundLayout.createSequentialGroup()
                .addComponent(panel_backdrop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 319, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lbl_flight;
    private javax.swing.JPanel panel_backdrop;
    private javax.swing.JPanel panel_background;
    // End of variables declaration//GEN-END:variables
}
