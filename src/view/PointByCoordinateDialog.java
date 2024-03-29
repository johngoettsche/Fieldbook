/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.AbstractAction;
import points.Coordinate;
import points.Point;
import points.RawDataCoordinate;
import points.RawDataType;

/**
 *
 * @author John
 */
public class PointByCoordinateDialog extends javax.swing.JDialog {

    /**
     * Creates new form CoordinateDialog
     */
    //public CoordinateDialog(java.awt.Frame parent, boolean modal)
    
    private ArrayList<Point> points;
    private Point point;
    private boolean isNew;
    private MainFrame mainFrame;
    
    public PointByCoordinateDialog(MainFrame thisMainFrame, ArrayList<Point> thesePoints, Point thisPoint, boolean thisIsNew) {
        //super(parent, modal);
        initComponents();
        this.mainFrame = thisMainFrame;
        this.points = thesePoints;
        this.point = thisPoint;
        this.isNew = thisIsNew;
        
        this.LabelTextField.setText(Integer.toString(point.getLabel()));
        this.NorthingTextField.setText(Double.toString(point.getNorthing()));
        this.EastingTextField.setText(Double.toString(point.getEasting()));
        this.ElevationTextField.setText(Double.toString(point.getElevation()));
        this.DescriptionTextField.setText(point.getDescription());
        
        OkButtonListener okButtonListener = new OkButtonListener();
        OKButton.addActionListener(okButtonListener);
        
        this.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PointLabel = new javax.swing.JLabel();
        NorthingLabel = new javax.swing.JLabel();
        EastingLabel = new javax.swing.JLabel();
        ElevationLabel = new javax.swing.JLabel();
        DescriptionLabel = new javax.swing.JLabel();
        LabelTextField = new javax.swing.JTextField();
        NorthingTextField = new javax.swing.JTextField();
        EastingTextField = new javax.swing.JTextField();
        ElevationTextField = new javax.swing.JTextField();
        DescriptionTextField = new javax.swing.JTextField();
        OKButton = new javax.swing.JButton();
        CancelButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        PointLabel.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        PointLabel.setText("Point Label");

        NorthingLabel.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        NorthingLabel.setText("Northing");

        EastingLabel.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        EastingLabel.setText("Easting");

        ElevationLabel.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        ElevationLabel.setText("Elevation");

        DescriptionLabel.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        DescriptionLabel.setText("Description");

        LabelTextField.setColumns(16);
        LabelTextField.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        LabelTextField.setToolTipText("");

        NorthingTextField.setColumns(16);
        NorthingTextField.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N

        EastingTextField.setColumns(16);
        EastingTextField.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N

        ElevationTextField.setColumns(16);
        ElevationTextField.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        ElevationTextField.setToolTipText("");

        DescriptionTextField.setColumns(16);
        DescriptionTextField.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N

        OKButton.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        OKButton.setText("OK");
        OKButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OKButtonActionPerformed(evt);
            }
        });

        CancelButton.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        CancelButton.setText("Cancel");
        CancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PointLabel)
                    .addComponent(NorthingLabel)
                    .addComponent(EastingLabel)
                    .addComponent(ElevationLabel)
                    .addComponent(DescriptionLabel))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(CancelButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(OKButton))
                    .addComponent(DescriptionTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ElevationTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EastingTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NorthingTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PointLabel)
                    .addComponent(LabelTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NorthingTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NorthingLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EastingTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EastingLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ElevationTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ElevationLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DescriptionTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DescriptionLabel))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(OKButton)
                    .addComponent(CancelButton))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        PointLabel.getAccessibleContext().setAccessibleName("PointLabel");
        PointLabel.getAccessibleContext().setAccessibleDescription("");
        NorthingLabel.getAccessibleContext().setAccessibleName("NorthingLabel");
        EastingLabel.getAccessibleContext().setAccessibleName("EastingLabel");
        ElevationLabel.getAccessibleContext().setAccessibleName("ElevationLabel");
        DescriptionLabel.getAccessibleContext().setAccessibleName("DescriptionLabel");
        DescriptionLabel.getAccessibleContext().setAccessibleDescription("");
        NorthingTextField.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void OKButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OKButtonActionPerformed
        point.setUpdate(true);
        if(isNew){
            javax.swing.JMenuItem pointMenuItem = new javax.swing.JMenuItem(new EditPointAction(Integer.toString(point.getLabel())));
            mainFrame.getEditPointMenu().add(pointMenuItem);
        }
        dispose();
    }//GEN-LAST:event_OKButtonActionPerformed

    private void CancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelButtonActionPerformed
        if(isNew){
            points.remove(point);
        }else{
            point.setUpdate(false);
        }
        dispose();
    }//GEN-LAST:event_CancelButtonActionPerformed

    /**
     * @param args the command line d
     */
   // public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         *//*
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CoordinateDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CoordinateDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CoordinateDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CoordinateDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }*/
        //</editor-fold>

        /* Create and display the dialog *//*
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                CoordinateDialog dialog = new CoordinateDialog(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }*/

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CancelButton;
    private javax.swing.JLabel DescriptionLabel;
    private javax.swing.JTextField DescriptionTextField;
    private javax.swing.JLabel EastingLabel;
    private javax.swing.JTextField EastingTextField;
    private javax.swing.JLabel ElevationLabel;
    private javax.swing.JTextField ElevationTextField;
    private javax.swing.JTextField LabelTextField;
    private javax.swing.JLabel NorthingLabel;
    private javax.swing.JTextField NorthingTextField;
    private javax.swing.JButton OKButton;
    private javax.swing.JLabel PointLabel;
    // End of variables declaration//GEN-END:variables
    
    public class EditPointAction extends AbstractAction {
        RawDataType ty = RawDataType.Coordinate;
        
        String menuItemString;
        
        public EditPointAction(String thisMenuItemString){
            super(thisMenuItemString);
            this.menuItemString = thisMenuItemString;
        }
        
        public void actionPerformed(ActionEvent e){
            RawDataType d = RawDataType.Coordinate;
            int thisPointNumber = Integer.parseInt(menuItemString);
            int p = 0;
            Point thisPoint = null;
            while(thisPoint == null && p < points.size()){
                if(points.get(p).getLabel() == thisPointNumber)thisPoint = points.get(p);
                p++;
            }
            if(thisPoint != null){
                if(thisPoint.getRawData().getRawDataType() == RawDataType.Coordinate){
                    PointByCoordinateDialog dialog = new PointByCoordinateDialog(mainFrame, points, thisPoint, false);
                } 
            }
        }
    }
    public class OkButtonListener implements ActionListener { 
//Register an instance of the event handler class as a listener on one or more components. For example:
//someComponent.addActionListener(instanceOfMyClass);
//Include code that implements the methods in listener interface. For example:
        public void actionPerformed(ActionEvent e) { 
            Coordinate coordinate = new Coordinate(
            Double.parseDouble(NorthingTextField.getText()),
                    Double.parseDouble(EastingTextField.getText()),
                    Double.parseDouble(ElevationTextField.getText()));
            RawDataCoordinate rawData = new RawDataCoordinate(coordinate);
            point.setLabel(Integer.parseInt(LabelTextField.getText()));
            point.setRawData(rawData);
            point.setDescription(DescriptionTextField.getText());  
            dispose();
        }
    }
}
