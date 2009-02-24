/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * SearchServicesPanel.java
 *
 * Created on 2008-12-10, 03:21:56
 */
package app.gui.searchServices;

import app.gui.ScrollBar.ui.LineScrollBarUI;
import app.gui.detailspanel.RoundWindow;
import java.awt.Component;
import java.awt.Point;
import java.awt.event.ActionListener;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTree.DynamicUtilTreeNode;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreeSelectionModel;
import odb.core.Search;

/**
 *
 * @author vara
 */
public class SearchServicesPanel extends javax.swing.JPanel {

    private JScrollPane jScrollPane1;
    private JCheckBoxTree jTree1;

    /** Creates new form SearchServicesPanel */
    public SearchServicesPanel() {
        initComponents();

        Vector<String> val = new Vector<String>();
//        val.add("a");
//        val.add("b");
        
        jTree1 = new JCheckBoxTree(val);
        jTree1.setCellRenderer(new JCheckBoxTreeRenderer());
        jTree1.getSelectionModel().setSelectionMode(TreeSelectionModel.SINGLE_TREE_SELECTION);
        jTree1.addMouseListener(new JCheckBoxTreeMouseListener(jTree1));

        jScrollPane1 = new JScrollPane(jTree1);
        jScrollPane1.setOpaque(false);
        jScrollPane1.getViewport().setOpaque(false);
        jScrollPane1.getViewport().setBorder(null);

        JScrollBar scbH = jScrollPane1.getHorizontalScrollBar();
        JScrollBar scbV = jScrollPane1.getVerticalScrollBar();
        scbH.setOpaque(false);
        scbV.setOpaque(false);
        scbV.setUI(new LineScrollBarUI());
        scbH.setUI(new LineScrollBarUI());

        scbH.removeAll();
        scbV.removeAll();

        jTree1.setOpaque(false);
        jTree1.setFocusable(false);

        panelForJTree.add(jScrollPane1);

        setServices(new Search().getCategories());

    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        gRadius = new javax.swing.JFormattedTextField();
        gCurrentX = new javax.swing.JFormattedTextField();
        gCurrentY = new javax.swing.JFormattedTextField();
        gCenterX = new javax.swing.JFormattedTextField();
        gCenterY = new javax.swing.JFormattedTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        panelForJTree = new javax.swing.JPanel();

        setDoubleBuffered(false);
        setFocusable(false);
        setOpaque(false);
        setRequestFocusEnabled(false);
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setOpaque(false);

        jButton1.setText("Search");
        jButton1.setFocusPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 219, 255)));
        jPanel1.setOpaque(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setText("x");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, -1, -1));

        jLabel4.setText("y");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, -1, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 150, -1));

        jLabel5.setText("Current Point");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, -1, -1));

        jLabel2.setText("Center Point");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, -1, -1));

        jLabel1.setText("Radius");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, -1, -1));

        gRadius.setCaretColor(new java.awt.Color(151, 151, 151));
        gRadius.setOpaque(false);
        jPanel1.add(gRadius, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 170, -1));

        gCurrentX.setCaretColor(new java.awt.Color(151, 151, 151));
        gCurrentX.setOpaque(false);
        jPanel1.add(gCurrentX, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 80, -1));

        gCurrentY.setCaretColor(new java.awt.Color(151, 151, 151));
        gCurrentY.setOpaque(false);
        jPanel1.add(gCurrentY, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, 80, -1));

        gCenterX.setCaretColor(new java.awt.Color(151, 151, 151));
        gCenterX.setOpaque(false);
        jPanel1.add(gCenterX, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 80, -1));

        gCenterY.setCaretColor(new java.awt.Color(151, 151, 151));
        gCenterY.setOpaque(false);
        jPanel1.add(gCenterY, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, 80, -1));

        jPanel3.setOpaque(false);

        jLabel6.setText("Services");

        jLabel7.setText("Parameters");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 149, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(69, 69, 69))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel7))
        );

        panelForJTree.setAlignmentX(0.0F);
        panelForJTree.setAlignmentY(0.0F);
        panelForJTree.setFocusable(false);
        panelForJTree.setOpaque(false);
        panelForJTree.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(panelForJTree, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(panelForJTree, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE))
                .addContainerGap())
        );

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, -1, 300));
    }// </editor-fold>//GEN-END:initComponents

    public void addActionForSearchButton(ActionListener al) {
        jButton1.addActionListener(al);
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Component comp;
        Vector catResult, subResult = null;
        for (comp = getParent(); comp != null; comp = comp.getParent()) {
            if (comp instanceof RoundWindow) {
                RoundWindow det = (RoundWindow) comp;
                System.out.println("current alpha " + det.getAlpha());
                break;
            }
        }

        catResult = new Search().getCategories();
        if (jTree1.getSelectionModel().isSelectionEmpty()) {
            JOptionPane.showMessageDialog(SearchServicesPanel.this, "You need to select category!", "Warning", JOptionPane.ERROR_MESSAGE);
        } else {
            subResult = new Search().getSubcategories(jTree1.getLastSelectedPathComponent().toString());
            System.out.println(subResult);
        }
        System.out.println(catResult);

    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFormattedTextField gCenterX;
    private javax.swing.JFormattedTextField gCenterY;
    private javax.swing.JFormattedTextField gCurrentX;
    private javax.swing.JFormattedTextField gCurrentY;
    private javax.swing.JFormattedTextField gRadius;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel panelForJTree;
    // End of variables declaration//GEN-END:variables

    public void setRadius(double val) {
        gRadius.setValue(val);
    }

    public void setCenterPoint(Point.Double val) {
        gCenterX.setValue(val.getX());
        gCenterY.setValue(val.getY());
    }

    public void setCurrentPos(Point.Double val) {
        gCurrentX.setValue(val.getX());
        gCurrentY.setValue(val.getY());
    }

    public void setServices(Vector<String> value) {
        

        DefaultMutableTreeNode root = new DefaultMutableTreeNode("root");
        DynamicUtilTreeNode.createChildren(root, value);
        DefaultTreeModel dtm = new DefaultTreeModel(root, false);
        jTree1.setModel(dtm);
    }
}
