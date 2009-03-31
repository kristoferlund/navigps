/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * RunApp.java
 *
 * Created on 2009-03-28, 12:26:35
 */

package app.starter.gui;

import app.ArgumentsStartUp.FileValueParameter;
import app.ArgumentsStartUp.NoValueParameter;
import app.ArgumentsStartUp.SizeValueParameter;
import app.navigps.NaviGPSCore;
import app.navigps.gui.detailspanel.AlphaJPanel;
import app.ArgumentsStartUp.core.AbstractParameter;
import app.navigps.Version;
import app.navigps.gui.DefaultAlphaLabelPanel;
import app.navigps.utils.GraphicsUtilities;
import app.navigps.utils.MyFileFilter;
import app.starter.gui.swing.ObjectParameterForJTable;
import app.starter.gui.swing.ParameterTableModel;
import app.starter.gui.swing.TableRendererForFileParameter;
import app.starter.gui.swing.TableRendererForNoParameter;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JFileChooser;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.plaf.metal.MetalLabelUI;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableModel;

/**
 *
 * @author wara
 */
public class RunApp extends javax.swing.JFrame {


    private DefaultAlphaLabelPanel alphaDescPanel = new DefaultAlphaLabelPanel();

    /** Creates new form RunApp */
    public RunApp() {
        setTitle(Version.getVersion()+" (Starter)");
        setResizable(false);
        initComponents();

        PanelForImage.setLayout(new BorderLayout(2, 2));
        PanelForImage.add(new ImagePanel("icons/logo/NaviGPS3.png"),BorderLayout.CENTER);

        Vector<AbstractParameter> vec = NaviGPSCore.getAllparameters();
        for (AbstractParameter ap : vec) {            
            System.out.println(""+ap.getOption());
        }

        ParameterTableModel ptm= new ParameterTableModel(new String[]{"Option","Value"});
        ptm.insertRow(vec);
        tableParam.setModel(ptm);
        tableParam.setSelectionMode(
                    ListSelectionModel.SINGLE_SELECTION);
        
        tableParam.getSelectionModel().addListSelectionListener(new RowListener());
        
        //TableColumn tc = tableParam.getColumnModel().getColumn(1);
        //tc.setCellRenderer(new TableRendererForFileValue());
        //tableParam.setDefaultRenderer(AbstractParameter.class, new TableRendererForNoParameter());
        //tableParam.setDefaultRenderer(FileValueParameter.class, new TableRendererForFileValue());
        //NaviGPSCore nc = new NaviGPSCore();
        //nc.execute(new ArrayList<String>());

        //PanelDescription.setLayout(new BorderLayout());
        
        alphaDescPanel.setAnimatorEnabled(true);
        alphaDescPanel.getBumpArea().setVisible(false);
        alphaDescPanel.setText("Test");
        alphaDescPanel.setMaximumSize(new Dimension(100, 100));
        alphaDescPanel.getContentText().setUI(new MetalLabelUI());
        PanelDescription.add(alphaDescPanel,BorderLayout.CENTER);
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.err.println(getClass().getCanonicalName()+" method fnalize !");
    }


    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelContent = new javax.swing.JPanel();
        PanelForImage = new javax.swing.JPanel();
        PanelInfoParameter = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableParam = new MyJTable();
        jButton1 = new javax.swing.JButton();
        PanelDescription = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        getContentPane().setLayout(new java.awt.BorderLayout(2, 2));

        panelContent.setBackground(new java.awt.Color(255, 255, 255));

        PanelForImage.setBackground(new java.awt.Color(255, 255, 255));
        PanelForImage.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        PanelForImage.setLayout(new java.awt.BorderLayout());

        PanelInfoParameter.setBorder(javax.swing.BorderFactory.createTitledBorder("Parameters start up"));

        tableParam.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tableParam);

        javax.swing.GroupLayout PanelInfoParameterLayout = new javax.swing.GroupLayout(PanelInfoParameter);
        PanelInfoParameter.setLayout(PanelInfoParameterLayout);
        PanelInfoParameterLayout.setHorizontalGroup(
            PanelInfoParameterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelInfoParameterLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
                .addContainerGap())
        );
        PanelInfoParameterLayout.setVerticalGroup(
            PanelInfoParameterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelInfoParameterLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
                .addContainerGap())
        );

        jButton1.setText("Run NaviGPS");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        PanelDescription.setMaximumSize(new java.awt.Dimension(100, 100));
        PanelDescription.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout panelContentLayout = new javax.swing.GroupLayout(panelContent);
        panelContent.setLayout(panelContentLayout);
        panelContentLayout.setHorizontalGroup(
            panelContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelContentLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(PanelDescription, javax.swing.GroupLayout.DEFAULT_SIZE, 527, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 527, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelContentLayout.createSequentialGroup()
                        .addComponent(PanelForImage, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(PanelInfoParameter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelContentLayout.setVerticalGroup(
            panelContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelContentLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PanelForImage, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                    .addComponent(PanelInfoParameter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addComponent(PanelDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(jButton1)
                .addContainerGap())
        );

        getContentPane().add(panelContent, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        ArrayList <String> selectedParams = new ArrayList<String>();
        int row = tableParam.getModel().getRowCount();
        for (int i = 0; i < row; i++) {
            ObjectParameterForJTable obj = 
                    (ObjectParameterForJTable)tableParam.getModel().getValueAt(i, 1);
            AbstractParameter ap = obj.getAbstractParam();
            Object valParam = obj.getValueForTable();
            if(valParam != null){
                if(valParam instanceof Dimension){
                    Dimension dim = (Dimension)valParam;
                    valParam = new String(dim.width+","+dim.height);
                }else if(valParam instanceof String){
                    if( !((String)valParam).equals("")){
                       selectedParams.add(ap.getOption());
                       selectedParams.add(valParam.toString());
                    }
                }else if(valParam.toString().equals("true")){
                    selectedParams.add(ap.getOption());
                }
            }           
        }
        {
            NaviGPSCore ng=null;
            ng = new NaviGPSCore();
            try {

                ng.parseParameters(selectedParams);
            } catch (Exception ex) {
                alphaDescPanel.setText("<html>"+ex.getMessage());
                return;
            }
            ng.reload();

            
            setVisible(false);
            getContentPane().removeAll();
            removeNotify();
            dispose();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RunApp().setVisible(true);
            }
        });
    }

    public static BufferedImage loadimage(String name){

        URL href = RunApp.class.getResource("resources/graphics/"+name);
        BufferedImage tmpBi = null;
        try {
            tmpBi = GraphicsUtilities.loadCompatibleImage(href);

        } catch (IOException ex) {
            System.err.println(""+ex);
        }

        return tmpBi;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelDescription;
    private javax.swing.JPanel PanelForImage;
    private javax.swing.JPanel PanelInfoParameter;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelContent;
    private javax.swing.JTable tableParam;
    // End of variables declaration//GEN-END:variables


    private File openFileChoserWindow(String path) {

        File currentDir = null;
        if(path!=null && !path.equals("")){
            currentDir = new File(path);
        }else{
            currentDir = new File(System.getProperty("user.dir"));
        }

        JFileChooser chooser = new JFileChooser();
        String fileFilter = "svg";
        chooser.addChoosableFileFilter(new MyFileFilter(new String[]{"svg"}, fileFilter));
        chooser.setAcceptAllFileFilterUsed(false);
        chooser.setCurrentDirectory(currentDir);
        int retour = chooser.showOpenDialog(this);
        if (retour == JFileChooser.APPROVE_OPTION) {
            try {
                return chooser.getSelectedFile();

            } catch (Exception e1) {   
            }
        }
        return null;
    }

    class ImagePanel extends AlphaJPanel{

        private BufferedImage bi = null;

        private String imgName;

        public ImagePanel(String imgName){
            this.imgName = imgName;
        }

        @Override
        protected void paintComponent(Graphics g) {
            Graphics2D g2= (Graphics2D)g;
            super.paintComponent(g2);

            int width = getWidth();
            int height = getHeight();
            if(bi==null || bi.getWidth() != width || bi.getHeight()!=height){
               BufferedImage tmpB = loadimage(imgName);
               bi = GraphicsUtilities.createThumbnail(tmpB, width, height);
            }
            g2.drawImage(bi, 0, 0, rootPane);
        }
    }

    class MyJTable extends JTable implements MouseListener{

        TableRendererForNoParameter trfnp = new TableRendererForNoParameter();
        TableRendererForFileParameter trffp = new TableRendererForFileParameter();
        public MyJTable(){
            super();
            init();
        }
        public MyJTable(TableModel tm){
            super(tm);
            init();            
        }

        private void init(){
            addMouseListener(this);
        }

        @Override
        public TableCellRenderer getCellRenderer(int row, int column) {
            Object val =getModel().getValueAt(row, column);
            String str = "For row "+row+" col "+column+" Object=";

                if(val instanceof String){
                    str+="String";
                    //System.out.println(str);
                    return super.getCellRenderer(row, column);

                }else if(val instanceof ObjectParameterForJTable){
                    val = ((ObjectParameterForJTable)val).getAbstractParam();
                    if(val instanceof SizeValueParameter){
                        str+="SizeValueParameter";
                        //System.out.println(str);
                        return trfnp;
                    }else if(val instanceof FileValueParameter){
                        str+="FileValueParameter";
                        //System.out.println(str);
                        return trffp;
                    }else if(val instanceof NoValueParameter){
                        str+="NoValueParameter";
                        //System.out.println(str);
                        return trfnp;
                    }
            }

            str+=val;
            System.out.println(str);
            return super.getCellRenderer(row, column);
        }

        @Override
        public void mouseClicked(MouseEvent e) {
            //System.out.println("MouseClicked");
            int row = rowAtPoint(e.getPoint());
            int col = columnAtPoint(e.getPoint());

            ObjectParameterForJTable obj =
                    (ObjectParameterForJTable)tableParam.getModel().getValueAt(row, 1);
            if(col == 0){
                String msg = obj.getAbstractParam().getOptionDescription();                
                alphaDescPanel.setText(createHtmlInfo(msg));
                return;
            }                

            Object val = obj.getValueForTable();
            if(val instanceof Boolean){                
                obj.setValueForTable(!(Boolean)val);                
            }else if(val instanceof String){
                File f = openFileChoserWindow((String)val);
                if(f!=null){
                    obj.setValueForTable(f.getAbsolutePath());
                }else{
                    return;
                }
            }
            System.err.println("Value changed");
            tableParam.getModel().setValueAt(obj, row, 1);
            ((AbstractTableModel)tableParam.getModel()).
                                    fireTableRowsUpdated(row, row);
        }

        protected String createHtmlInfo(String str){
            String ns = str.replaceAll("(\r\n|\r|\n|\n\r)", "<br>");
            ns = ns.replaceAll("(\t)", "&#9;");
            String retString = "<html>"+ns+"</html>";
            return retString;
        }

        @Override
        public void mousePressed(MouseEvent e) {
        }

        @Override
        public void mouseReleased(MouseEvent e) {
        }

        @Override
        public void mouseEntered(MouseEvent e) {
        }

        @Override
        public void mouseExited(MouseEvent e) {
        }
    }

    class RowListener implements ListSelectionListener {
        @Override
        public void valueChanged(ListSelectionEvent event) {
            if (event.getValueIsAdjusting()) {
                return;
            }                      
        }
    }
/*
    class JTableButtonMouseListener extends MouseInputAdapter{
            
        private JTable jTable;

        public JTableButtonMouseListener(JTable table) {
            jTable = table;
        }

        private void forwardEventToButton(MouseEvent e) {

            TableColumnModel columnModel = jTable.getColumnModel();
            int column = columnModel.getColumnIndexAtX(e.getX());
            int row    = e.getY() / jTable.getRowHeight();

            Object value;
            JButton button;
            MouseEvent buttonEvent;

            if(row >= jTable.getRowCount() || row < 0 ||
                column >= jTable.getColumnCount() || column < 0){
                    return;
            }


            value = jTable.getValueAt(row, column);

            if(!(value instanceof JButton))
                return;

            button = (JButton)value;

            buttonEvent =
              (MouseEvent)SwingUtilities.convertMouseEvent(jTable, e, button);
            button.dispatchEvent(buttonEvent);
            // This is necessary so that when a button is pressed and released
            // it gets rendered properly.  Otherwise, the button may still appear
            // pressed down when it has been released.
            jTable.repaint();
        }

        @Override
        public void mouseClicked(MouseEvent e) {
            forwardEventToButton(e);
        }

        @Override
        public void mouseEntered(MouseEvent e) {
            forwardEventToButton(e);
        }

        @Override
        public void mouseExited(MouseEvent e) {
            forwardEventToButton(e);
        }

        @Override
        public void mousePressed(MouseEvent e) {
            forwardEventToButton(e);
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            forwardEventToButton(e);
        }

        @Override
        public void mouseMoved(MouseEvent e) {
            forwardEventToButton(e);
        }
    }
 */
}

