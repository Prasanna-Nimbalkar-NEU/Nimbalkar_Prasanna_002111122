/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.RestaurantAdminRole;

import Business.DeliveryMan.DeliveryMan;
import Business.DeliveryMan.DeliveryManDirectory;
import Business.EcoSystem;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.ItemWithQuantity;
import Business.WorkQueue.OrderWorkRequest;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author prasannanimbalkar
 */
public class ManageOrderDetailsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageOrderDetailsJPanel
     */
    JPanel userProcessContainer;
    UserAccount account;
    EcoSystem ecosystem;
    OrderWorkRequest workRequest;
    double total = 0.0;
    private DefaultTableModel orderTable;
    private DeliveryManDirectory deliveryManDirectory;
    private int index = -1;

    public ManageOrderDetailsJPanel(JPanel userProcessContainer, EcoSystem ecosystem, UserAccount account, OrderWorkRequest workRequest) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ecosystem = ecosystem;
        this.account = account;
        this.workRequest = workRequest;
        orderTable = (DefaultTableModel) tblOrderDetails.getModel();
        deliveryManDirectory = ecosystem.getDeliveryManDirectory();
        populateDeliveryManList(deliveryManDirectory.getDeliveryManList());
        changeButtonText();
        setVisibleEditable();
        display();
    }

    private void display() {
        
        populateDeliveryManUI();
        
        restaurantName.setText(workRequest.getRestaurant().getName());
        requestDate.setText(workRequest.getRequestDate().toString());
        status.setText(workRequest.getStatus());
        message.setText(workRequest.getMessage());

        orderTable.setRowCount(0);
        for (ItemWithQuantity itemWithQuantity : workRequest.getItemsWithQuatityList()) {
            Object[] row = new Object[orderTable.getColumnCount()];
            row[0] = itemWithQuantity;
            row[1] = itemWithQuantity.getQuantity();
            row[2] = itemWithQuantity.getItem().getPrice() * itemWithQuantity.getQuantity();
            total += itemWithQuantity.getItem().getPrice() * itemWithQuantity.getQuantity();
            orderTable.addRow(row);
        }
        totalPrice.setText(total + "");

    }

    private void populateDeliveryManUI() {
        if(workRequest.getDeliverMan() == null &&  
                !("ordered".equalsIgnoreCase(workRequest.getStatus()) || "declined".equalsIgnoreCase(workRequest.getStatus()))){
            assignDeliveryPersonLabel.setVisible(true);
            assignDeliveryPerson.setVisible(true);
            addDeliveryPerson.setVisible(true);
            deliveryManNameValue.setVisible(false);
            deliveryManLabel.setVisible(false);
        }else{
            assignDeliveryPersonLabel.setVisible(false);
            assignDeliveryPerson.setVisible(false);
            addDeliveryPerson.setVisible(false);
            deliveryManNameValue.setVisible(true);
            deliveryManLabel.setVisible(true);
            if(workRequest.getDeliverMan() != null){
                deliveryManNameValue.setText(workRequest.getDeliverMan().getName());
            }else{
              deliveryManNameValue.setText("Not Assigned");  
            }
        }
    }
    
      public void populateDeliveryManList(ArrayList<DeliveryMan> deliveryManList) {
        if(workRequest.getDeliverMan() == null) {
            assignDeliveryPerson.setVisible(true);
             for (DeliveryMan deliveryMan : deliveryManList) {
                assignDeliveryPerson.addItem(deliveryMan.getName());
              }
        }else{
            assignDeliveryPerson.setVisible(false);
        } 
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        deliveryManLabel = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        restaurantName = new javax.swing.JLabel();
        deliveryManNameValue = new javax.swing.JLabel();
        requestDate = new javax.swing.JLabel();
        cartScrollPane1 = new javax.swing.JScrollPane();
        tblOrderDetails = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        totalPrice = new javax.swing.JLabel();
        message = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        status = new javax.swing.JLabel();
        btnBack1 = new javax.swing.JButton();
        acceptOrder = new javax.swing.JButton();
        assignDeliveryPerson = new javax.swing.JComboBox<>();
        assignDeliveryPersonLabel = new javax.swing.JLabel();
        addDeliveryPerson = new javax.swing.JButton();
        customerFeedBackPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        customerFeedbackField = new javax.swing.JTextArea();
        customerFeedbackLabel = new javax.swing.JLabel();
        declineOrder = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Futura", 0, 13)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 102, 0));
        jLabel4.setText("Restaurant Name");

        deliveryManLabel.setBackground(new java.awt.Color(255, 255, 255));
        deliveryManLabel.setFont(new java.awt.Font("Futura", 0, 13)); // NOI18N
        deliveryManLabel.setForeground(new java.awt.Color(255, 102, 0));
        deliveryManLabel.setText("Delivery Man Name");

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Futura", 0, 13)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 102, 0));
        jLabel6.setText("Request Date");

        restaurantName.setText("arun");

        deliveryManNameValue.setText("adarsh");

        requestDate.setText("<value>");

        tblOrderDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item Name", "Item Qty", "Item Price"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        cartScrollPane1.setViewportView(tblOrderDetails);

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Futura", 0, 13)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 102, 0));
        jLabel9.setText("Total");

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Futura", 0, 13)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 102, 0));
        jLabel10.setText("Message");

        totalPrice.setBackground(new java.awt.Color(255, 255, 255));
        totalPrice.setFont(new java.awt.Font("Futura", 0, 13)); // NOI18N
        totalPrice.setForeground(new java.awt.Color(255, 102, 0));
        totalPrice.setText("<value>");

        message.setBackground(new java.awt.Color(255, 255, 255));
        message.setFont(new java.awt.Font("Futura", 0, 13)); // NOI18N
        message.setForeground(new java.awt.Color(255, 102, 0));
        message.setText("<value>");

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setFont(new java.awt.Font("Futura", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 102, 0));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("ORDER DETAILS");

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setFont(new java.awt.Font("Futura", 0, 13)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 102, 0));
        jLabel14.setText("Status");

        status.setText("<value>");

        btnBack1.setText("Back");
        btnBack1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBack1ActionPerformed(evt);
            }
        });

        acceptOrder.setBackground(new java.awt.Color(255, 255, 255));
        acceptOrder.setFont(new java.awt.Font("Futura", 0, 13)); // NOI18N
        acceptOrder.setForeground(new java.awt.Color(255, 102, 0));
        acceptOrder.setText("Accept Order");
        acceptOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acceptOrderActionPerformed(evt);
            }
        });

        assignDeliveryPerson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignDeliveryPersonActionPerformed(evt);
            }
        });

        assignDeliveryPersonLabel.setBackground(new java.awt.Color(255, 255, 255));
        assignDeliveryPersonLabel.setFont(new java.awt.Font("Futura", 0, 13)); // NOI18N
        assignDeliveryPersonLabel.setForeground(new java.awt.Color(255, 102, 0));
        assignDeliveryPersonLabel.setText("Assign Delivery Person");

        addDeliveryPerson.setBackground(new java.awt.Color(255, 255, 255));
        addDeliveryPerson.setFont(new java.awt.Font("Futura", 0, 13)); // NOI18N
        addDeliveryPerson.setForeground(new java.awt.Color(255, 102, 0));
        addDeliveryPerson.setText("Add");
        addDeliveryPerson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addDeliveryPersonActionPerformed(evt);
            }
        });

        customerFeedBackPanel.setBackground(new java.awt.Color(255, 255, 255));

        customerFeedbackField.setColumns(20);
        customerFeedbackField.setRows(5);
        jScrollPane1.setViewportView(customerFeedbackField);

        customerFeedbackLabel.setBackground(new java.awt.Color(255, 255, 255));
        customerFeedbackLabel.setFont(new java.awt.Font("Futura", 0, 13)); // NOI18N
        customerFeedbackLabel.setForeground(new java.awt.Color(255, 102, 0));
        customerFeedbackLabel.setText("Customer Feedback");

        javax.swing.GroupLayout customerFeedBackPanelLayout = new javax.swing.GroupLayout(customerFeedBackPanel);
        customerFeedBackPanel.setLayout(customerFeedBackPanelLayout);
        customerFeedBackPanelLayout.setHorizontalGroup(
            customerFeedBackPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, customerFeedBackPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(customerFeedbackLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 476, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        customerFeedBackPanelLayout.setVerticalGroup(
            customerFeedBackPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, customerFeedBackPanelLayout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(customerFeedBackPanelLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(customerFeedbackLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        declineOrder.setBackground(new java.awt.Color(255, 255, 255));
        declineOrder.setFont(new java.awt.Font("Futura", 0, 13)); // NOI18N
        declineOrder.setForeground(new java.awt.Color(255, 102, 0));
        declineOrder.setText("Decline Order");
        declineOrder.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                declineOrderMousePressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(btnBack1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(80, 80, 80)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(restaurantName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE)
                                    .addComponent(requestDate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(status, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(assignDeliveryPersonLabel)
                                    .addComponent(deliveryManLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(80, 80, 80)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(assignDeliveryPerson, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(addDeliveryPerson))
                                    .addComponent(deliveryManNameValue, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(cartScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 660, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(48, 48, 48)
                                .addComponent(totalPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(message, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(15, 15, 15))
                            .addComponent(customerFeedBackPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(319, 319, 319)
                        .addComponent(acceptOrder)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(declineOrder)))
                .addContainerGap(134, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnBack1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel12)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(assignDeliveryPerson, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(assignDeliveryPersonLabel)
                    .addComponent(addDeliveryPerson))
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deliveryManLabel)
                    .addComponent(deliveryManNameValue))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(restaurantName)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(requestDate)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addComponent(status))
                .addGap(39, 39, 39)
                .addComponent(cartScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(totalPrice)
                    .addComponent(jLabel10)
                    .addComponent(message))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(acceptOrder)
                    .addComponent(declineOrder))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(customerFeedBackPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBack1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBack1ActionPerformed
        // TODO add your handling code here:
        ManageOrderJPanel manageOrderJPanel = new ManageOrderJPanel(userProcessContainer,ecosystem, account);
            userProcessContainer.add("ManageOrderJPanel", manageOrderJPanel);
            CardLayout layout = (CardLayout)userProcessContainer.getLayout();
            layout.next(userProcessContainer);
    }//GEN-LAST:event_btnBack1ActionPerformed

    private void acceptOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acceptOrderActionPerformed
        // TODO add your handling code here:
        if (workRequest.getStatus().equals("Ordered")) {
            workRequest.setStatus("Preparing"); 
            JOptionPane.showMessageDialog(null, " Order Accepted Successfully!!, Please assign delivery person");
        }else if(workRequest.getStatus().equals("Preparing")){
             workRequest.setStatus("Prepared");
             if(workRequest.getDeliverMan() == null){
                 JOptionPane.showMessageDialog(null, " Order Prepared Successfully!!, Please assign delivery person");
             }else{
                 JOptionPane.showMessageDialog(null, "Hurray, Delivery person will pick up the order in few minutes !!!");
             }
        }else if (workRequest.getStatus().equalsIgnoreCase("delivered")){
                setVisibleEditable();
        }else{  
            acceptOrder.setVisible(false);
        }
        changeButtonText();
        status.setText(workRequest.getStatus());
        
    }//GEN-LAST:event_acceptOrderActionPerformed

    private void assignDeliveryPersonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignDeliveryPersonActionPerformed
        // TODO add your handling code here:
        index = assignDeliveryPerson.getSelectedIndex();
        //clear of the selected items
     
       
    }//GEN-LAST:event_assignDeliveryPersonActionPerformed

    private void addDeliveryPersonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addDeliveryPersonActionPerformed
        // TODO add your handling code here:
        if(index >= 0){
            DeliveryMan deliveryMan = deliveryManDirectory.getDeliveryManList().get(index);
            workRequest.setDeliverMan(deliveryMan);
            JOptionPane.showMessageDialog(null, "Delivery person assigned successfully!!!");
            populateDeliveryManUI();
        }
    }//GEN-LAST:event_addDeliveryPersonActionPerformed

    private void declineOrderMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_declineOrderMousePressed
        declineOrder();
    }//GEN-LAST:event_declineOrderMousePressed

    private void declineOrder(){
        workRequest.setStatus("Declined");
        JOptionPane.showMessageDialog(null, "You have just declined the order, we will notify it to the customer!!");
        changeButtonText();
        status.setText(workRequest.getStatus());
    }
    
    private void changeButtonText() {
        switch(workRequest.getStatus()){
            case "Ordered":
                  acceptOrder.setText("Accept order");
                  declineOrder.setVisible(true);
                  break;
            case "Preparing":
                  acceptOrder.setText("Ready for delivery");
                  declineOrder.setVisible(false);
                  break;
            default:
                declineOrder.setVisible(false);
                acceptOrder.setVisible(false);
        }
        populateDeliveryManUI();
    }
    
      private void setVisibleEditable(){
        if(workRequest.getStatus().equalsIgnoreCase("delivered")){
            customerFeedBackPanel.setVisible(true);
            customerFeedbackField.setVisible(true);
            customerFeedbackField.setEditable(true);
            if(workRequest.getCustomerFeedback() != null){
                customerFeedbackField.setText(workRequest.getCustomerFeedback());
                customerFeedbackField.setEditable(false);
            }
        }else{
            customerFeedBackPanel.setVisible(false);
            customerFeedbackField.setVisible(false);
            customerFeedbackField.setEditable(false);
           
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton acceptOrder;
    private javax.swing.JButton addDeliveryPerson;
    private javax.swing.JComboBox<String> assignDeliveryPerson;
    private javax.swing.JLabel assignDeliveryPersonLabel;
    private javax.swing.JButton btnBack1;
    private javax.swing.JScrollPane cartScrollPane1;
    private javax.swing.JPanel customerFeedBackPanel;
    private javax.swing.JTextArea customerFeedbackField;
    private javax.swing.JLabel customerFeedbackLabel;
    private javax.swing.JButton declineOrder;
    private javax.swing.JLabel deliveryManLabel;
    private javax.swing.JLabel deliveryManNameValue;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel message;
    private javax.swing.JLabel requestDate;
    private javax.swing.JLabel restaurantName;
    private javax.swing.JLabel status;
    private javax.swing.JTable tblOrderDetails;
    private javax.swing.JLabel totalPrice;
    // End of variables declaration//GEN-END:variables

    
}
