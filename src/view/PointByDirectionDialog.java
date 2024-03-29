/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package view;

import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JComboBox;
import points.DirectionType;
import points.Point;

/**
 *
 * @author John
 */
public class PointByDirectionDialog extends javax.swing.JDialog {

    MainFrame mainFrame;
    ArrayList<Point> points;
    Vector originPoints = new Vector();
    Vector directionTypes = new Vector();
    Point origin;
    Point newPoint;
    /**
     * Creates new form PointByDirectionDialog
     */
    //public PointByDirectionDialog(java.awt.Frame parent, boolean modal) {
        //super(parent, modal);
    public PointByDirectionDialog(MainFrame thisMainFrame, ArrayList<Point> thesePoints, Point thisOrigin, Point thisPoint, DirectionType directionType) {
        
        originPoints.addAll(points);
        directionTypes.add(DirectionType.Azimuth.toString());
        directionTypes.add(DirectionType.Bearing.toString());
        directionTypes.add(DirectionType.toPoint.toString());
        
        initComponents();
        
        this.mainFrame = thisMainFrame;
        this.points = thesePoints;
        this.origin = thisOrigin;
        this.newPoint = thisPoint;
        
        if(origin != null) {
            this.originPointComboBox.setSelectedItem(origin);
        }else{
            if(newPoint != null)this.originPointComboBox.setSelectedItem(newPoint.getRawData().getOrigin());
        }
        this.DirectionTypeComboBox.setSelectedItem(directionType.toString());
        if(newPoint != null){
            this.DirectionTextField.setText(newPoint.getRawData().getAzimuth());
            this.DistanceTextField.setText(Double.toString(newPoint.getRawData().getHorizontalDistance()));
        }
        
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

        OriginPointLabel = new javax.swing.JLabel();
        originPointComboBox = new javax.swing.JComboBox();
        DirectionTypeLabel = new javax.swing.JLabel();
        DirectionTypeComboBox = new javax.swing.JComboBox();
        DirectionLabel = new javax.swing.JLabel();
        DirectionTextField = new javax.swing.JTextField();
        DistanceLabel = new javax.swing.JLabel();
        DistanceTextField = new javax.swing.JTextField();
        OKButton = new javax.swing.JButton();
        CancelButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        OriginPointLabel.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        OriginPointLabel.setText("Origin Point");

        originPointComboBox.setModel(new javax.swing.DefaultComboBoxModel(originPoints));

        DirectionTypeLabel.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        DirectionTypeLabel.setText("Direction Type");

        DirectionTypeComboBox.setModel(new javax.swing.DefaultComboBoxModel(directionTypes));

        DirectionLabel.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        DirectionLabel.setText("Direction");

        DirectionTextField.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        DirectionTextField.setToolTipText("");

        DistanceLabel.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        DistanceLabel.setText("Distance");

        DistanceTextField.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        DistanceTextField.setToolTipText("");

        OKButton.setText("OK");

        CancelButton.setText("Cancel");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(CancelButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(OKButton))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(OriginPointLabel)
                            .addGap(26, 26, 26)
                            .addComponent(originPointComboBox, 0, 162, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(DirectionTypeLabel)
                                .addComponent(DirectionLabel)
                                .addComponent(DistanceLabel))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(DirectionTypeComboBox, 0, 163, Short.MAX_VALUE)
                                .addComponent(DirectionTextField)
                                .addComponent(DistanceTextField)))))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(OriginPointLabel)
                    .addComponent(originPointComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DirectionTypeLabel)
                    .addComponent(DirectionTypeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DirectionLabel)
                    .addComponent(DirectionTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DistanceLabel)
                    .addComponent(DistanceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(OKButton)
                    .addComponent(CancelButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    //public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(PointByDirectionDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PointByDirectionDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PointByDirectionDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PointByDirectionDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }*/
        //</editor-fold>

        /* Create and display the dialog *//*
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                PointByDirectionDialog dialog = new PointByDirectionDialog(new javax.swing.JFrame(), true);
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
    private javax.swing.JLabel DirectionLabel;
    private javax.swing.JTextField DirectionTextField;
    private javax.swing.JComboBox DirectionTypeComboBox;
    private javax.swing.JLabel DirectionTypeLabel;
    private javax.swing.JLabel DistanceLabel;
    private javax.swing.JTextField DistanceTextField;
    private javax.swing.JButton OKButton;
    private javax.swing.JLabel OriginPointLabel;
    private javax.swing.JComboBox originPointComboBox;
    // End of variables declaration//GEN-END:variables
    
    private void updateDialog(){
        
    }

}
