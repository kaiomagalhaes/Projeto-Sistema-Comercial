package br.com.siscom.view.compras;

import java.awt.EventQueue;
import java.beans.Beans;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import javax.persistence.RollbackException;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class PedidoCompra extends JPanel {
    
    public PedidoCompra() {
        initComponents();
        if (!Beans.isDesignTime()) {
            entityManager.getTransaction().begin();
        }
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        entityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("siscomjavaPU").createEntityManager();
        query = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT P FROM PedidoCab P");
        list = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : org.jdesktop.observablecollections.ObservableCollections.observableList(query.getResultList());
        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        masterScrollPane = new javax.swing.JScrollPane();
        masterTable = new javax.swing.JTable();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jRadioButton5 = new javax.swing.JRadioButton();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jTextField13 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        detailScrollPane = new javax.swing.JScrollPane();
        detailTable = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        newButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        saveButton = new javax.swing.JButton();
        refreshButton = new javax.swing.JButton();
        deleteDetailButton = new javax.swing.JButton();
        newDetailButton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        FormListener formListener = new FormListener();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, list, masterTable);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${codPedidoCab}"));
        columnBinding.setColumnName("Cod Pedido Cab");
        columnBinding.setColumnClass(Integer.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${codCotCab}"));
        columnBinding.setColumnName("Cod Cot Cab");
        columnBinding.setColumnClass(Integer.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${codFornecedor}"));
        columnBinding.setColumnName("Cod Fornecedor");
        columnBinding.setColumnClass(Integer.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${dataPedidoCab}"));
        columnBinding.setColumnName("Data Pedido Cab");
        columnBinding.setColumnClass(java.util.Date.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${enderecoEntrega}"));
        columnBinding.setColumnName("Endereco Entrega");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${enderecoCobranca}"));
        columnBinding.setColumnName("Endereco Cobranca");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${vlrPedidoCab}"));
        columnBinding.setColumnName("Vlr Pedido Cab");
        columnBinding.setColumnClass(Double.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${descontoPedidoCab}"));
        columnBinding.setColumnName("Desconto Pedido Cab");
        columnBinding.setColumnClass(Double.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${totalPedidoCab}"));
        columnBinding.setColumnName("Total Pedido Cab");
        columnBinding.setColumnClass(Double.class);
        bindingGroup.addBinding(jTableBinding);

        masterScrollPane.setViewportView(masterTable);

        jPanel1.add(masterScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 210, 0));
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 90, -1));
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, 100, -1));
        jPanel1.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 30, 80, -1));

        jRadioButton1.setBackground(new java.awt.Color(153, 204, 255));
        jRadioButton1.setText("Fornecedor 01");
        jPanel1.add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 100, -1));

        jRadioButton2.setBackground(new java.awt.Color(153, 204, 255));
        jRadioButton2.setText("Fornecedor 02");
        jRadioButton2.addActionListener(formListener);
        jPanel1.add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, 100, -1));

        jRadioButton3.setBackground(new java.awt.Color(153, 204, 255));
        jRadioButton3.setText("Fornecedor 03");
        jPanel1.add(jRadioButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 60, 100, -1));

        jRadioButton4.setBackground(new java.awt.Color(153, 204, 255));
        jRadioButton4.setText("Fornecedor 04");
        jPanel1.add(jRadioButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 60, 100, -1));

        jRadioButton5.setBackground(new java.awt.Color(153, 204, 255));
        jRadioButton5.setText("Fornecedor 05");
        jPanel1.add(jRadioButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 60, 100, -1));

        jTextField4.setBackground(new java.awt.Color(255, 255, 204));
        jTextField4.setEnabled(false);
        jTextField4.setFocusable(false);
        jPanel1.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 100, -1));

        jTextField5.setBackground(new java.awt.Color(255, 255, 204));
        jTextField5.setEnabled(false);
        jTextField5.setFocusable(false);
        jPanel1.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, 100, -1));

        jTextField6.setBackground(new java.awt.Color(255, 255, 204));
        jTextField6.setEnabled(false);
        jTextField6.setFocusable(false);
        jPanel1.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 90, 100, -1));

        jTextField7.setBackground(new java.awt.Color(255, 255, 204));
        jTextField7.setEnabled(false);
        jTextField7.setFocusable(false);
        jPanel1.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 90, 100, -1));

        jTextField8.setBackground(new java.awt.Color(255, 255, 204));
        jTextField8.setEnabled(false);
        jTextField8.setFocusable(false);
        jPanel1.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 90, 100, -1));
        jPanel1.add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 240, -1));
        jPanel1.add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 140, 290, -1));
        jPanel1.add(jTextField11, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 190, 100, -1));
        jPanel1.add(jTextField12, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 190, 100, -1));
        jPanel1.add(jTextField13, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 190, 100, -1));

        jLabel1.setText("Número do Pedido:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel2.setText("Número da Cotação:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, -1, -1));

        jLabel3.setText("Data do Pedido:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 10, -1, -1));

        jLabel4.setText("Local de Entrega:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));

        jLabel5.setText("Local de Cobrança:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 120, -1, -1));

        jLabel6.setText("SubTotal:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 170, -1, -1));

        jLabel7.setText("Desconto:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 170, -1, -1));

        jLabel8.setText("Total:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 170, -1, -1));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 220));

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 5));
        jPanel2.setLayout(new java.awt.BorderLayout());

        org.jdesktop.beansbinding.ELProperty eLProperty = org.jdesktop.beansbinding.ELProperty.create("${selectedElement.pedidoDetCollection}");
        jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, eLProperty, detailTable);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${qtdePedidoDet}"));
        columnBinding.setColumnName("Qtde Pedido Det");
        columnBinding.setColumnClass(Integer.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${vlrUnitPedidoDet}"));
        columnBinding.setColumnName("Vlr Unit Pedido Det");
        columnBinding.setColumnClass(Double.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${vlrTotalPedidoDet}"));
        columnBinding.setColumnName("Vlr Total Pedido Det");
        columnBinding.setColumnClass(Double.class);
        jTableBinding.setSourceUnreadableValue(null);
        bindingGroup.addBinding(jTableBinding);

        detailScrollPane.setViewportView(detailTable);

        jPanel2.add(detailScrollPane, java.awt.BorderLayout.CENTER);

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 560, 210));

        jPanel3.setBackground(new java.awt.Color(153, 204, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        newButton.setText("New");
        newButton.addActionListener(formListener);
        jPanel3.add(newButton);

        deleteButton.setText("Delete");

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement != null}"), deleteButton, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);

        deleteButton.addActionListener(formListener);
        jPanel3.add(deleteButton);

        saveButton.setText("Save");
        saveButton.addActionListener(formListener);
        jPanel3.add(saveButton);

        refreshButton.setText("Refresh");
        refreshButton.addActionListener(formListener);
        jPanel3.add(refreshButton);

        deleteDetailButton.setText("Delete");

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ, detailTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement != null}"), deleteDetailButton, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);

        deleteDetailButton.addActionListener(formListener);
        jPanel3.add(deleteDetailButton);

        newDetailButton.setText("New");

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement != null}"), newDetailButton, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);

        newDetailButton.addActionListener(formListener);
        jPanel3.add(newDetailButton);

        jButton1.setText("Imprimir Pedido");
        jPanel3.add(jButton1);

        add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 430, 560, -1));

        bindingGroup.bind();
    }

    // Code for dispatching events from components to event handlers.

    private class FormListener implements java.awt.event.ActionListener {
        FormListener() {}
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            if (evt.getSource() == jRadioButton2) {
                PedidoCompra.this.jRadioButton2ActionPerformed(evt);
            }
            else if (evt.getSource() == newButton) {
                PedidoCompra.this.newButtonActionPerformed(evt);
            }
            else if (evt.getSource() == deleteButton) {
                PedidoCompra.this.deleteButtonActionPerformed(evt);
            }
            else if (evt.getSource() == saveButton) {
                PedidoCompra.this.saveButtonActionPerformed(evt);
            }
            else if (evt.getSource() == refreshButton) {
                PedidoCompra.this.refreshButtonActionPerformed(evt);
            }
            else if (evt.getSource() == deleteDetailButton) {
                PedidoCompra.this.deleteDetailButtonActionPerformed(evt);
            }
            else if (evt.getSource() == newDetailButton) {
                PedidoCompra.this.newDetailButtonActionPerformed(evt);
            }
        }
    }// </editor-fold>//GEN-END:initComponents

    
    private void deleteDetailButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteDetailButtonActionPerformed
        int index = masterTable.getSelectedRow();
        br.com.siscom.bean.PedidoCab P = list.get(masterTable.convertRowIndexToModel(index));
        Collection<br.com.siscom.bean.PedidoDet> ps = P.getPedidoDetCollection();
        int[] selected = detailTable.getSelectedRows();
        List<br.com.siscom.bean.PedidoDet> toRemove = new ArrayList<br.com.siscom.bean.PedidoDet>(selected.length);
        for (int idx=0; idx<selected.length; idx++) {
            selected[idx] = detailTable.convertRowIndexToModel(selected[idx]);
            int count = 0;
            Iterator<br.com.siscom.bean.PedidoDet> iter = ps.iterator();
            while (count++ < selected[idx]) iter.next();
            br.com.siscom.bean.PedidoDet p = iter.next();
            toRemove.add(p);
            entityManager.remove(p);
        }
        ps.removeAll(toRemove);
        masterTable.clearSelection();
        masterTable.setRowSelectionInterval(index, index);
    }//GEN-LAST:event_deleteDetailButtonActionPerformed

    private void newDetailButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newDetailButtonActionPerformed
        int index = masterTable.getSelectedRow();
        br.com.siscom.bean.PedidoCab P = list.get(masterTable.convertRowIndexToModel(index));
        Collection<br.com.siscom.bean.PedidoDet> ps = P.getPedidoDetCollection();
        if (ps == null) {
            ps = new LinkedList<br.com.siscom.bean.PedidoDet>();
            P.setPedidoDetCollection(ps);
        }
        br.com.siscom.bean.PedidoDet p = new br.com.siscom.bean.PedidoDet();
        entityManager.persist(p);
        p.setPedidoCab(P);
        ps.add(p);
        masterTable.clearSelection();
        masterTable.setRowSelectionInterval(index, index);
        int row = ps.size()-1;
        detailTable.setRowSelectionInterval(row, row);
        detailTable.scrollRectToVisible(detailTable.getCellRect(row, 0, true));
    }//GEN-LAST:event_newDetailButtonActionPerformed
    
    @SuppressWarnings("unchecked")
    private void refreshButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshButtonActionPerformed
        entityManager.getTransaction().rollback();
        entityManager.getTransaction().begin();
        java.util.Collection data = query.getResultList();
        for (Object entity : data) {
            entityManager.refresh(entity);
        }
        list.clear();
        list.addAll(data);
    }//GEN-LAST:event_refreshButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        int[] selected = masterTable.getSelectedRows();
        List<br.com.siscom.bean.PedidoCab> toRemove = new ArrayList<br.com.siscom.bean.PedidoCab>(selected.length);
        for (int idx=0; idx<selected.length; idx++) {
            br.com.siscom.bean.PedidoCab P = list.get(masterTable.convertRowIndexToModel(selected[idx]));
            toRemove.add(P);
            entityManager.remove(P);
        }
        list.removeAll(toRemove);
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void newButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newButtonActionPerformed
        br.com.siscom.bean.PedidoCab P = new br.com.siscom.bean.PedidoCab();
        entityManager.persist(P);
        list.add(P);
        int row = list.size()-1;
        masterTable.setRowSelectionInterval(row, row);
        masterTable.scrollRectToVisible(masterTable.getCellRect(row, 0, true));
    }//GEN-LAST:event_newButtonActionPerformed
    
    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        try {
            entityManager.getTransaction().commit();
            entityManager.getTransaction().begin();
        } catch (RollbackException rex) {
            rex.printStackTrace();
            entityManager.getTransaction().begin();
            List<br.com.siscom.bean.PedidoCab> merged = new ArrayList<br.com.siscom.bean.PedidoCab>(list.size());
            for (br.com.siscom.bean.PedidoCab P : list) {
                merged.add(entityManager.merge(P));
            }
            list.clear();
            list.addAll(merged);
        }
    }//GEN-LAST:event_saveButtonActionPerformed

private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_jRadioButton2ActionPerformed
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton deleteButton;
    private javax.swing.JButton deleteDetailButton;
    private javax.swing.JScrollPane detailScrollPane;
    private javax.swing.JTable detailTable;
    private javax.persistence.EntityManager entityManager;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private java.util.List<br.com.siscom.bean.PedidoCab> list;
    private javax.swing.JScrollPane masterScrollPane;
    private javax.swing.JTable masterTable;
    private javax.swing.JButton newButton;
    private javax.swing.JButton newDetailButton;
    private javax.persistence.Query query;
    private javax.swing.JButton refreshButton;
    private javax.swing.JButton saveButton;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
    
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                JFrame frame = new JFrame();
                frame.setContentPane(new PedidoCompra());
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.pack();
                frame.setVisible(true);
            }
        });
    }

}
