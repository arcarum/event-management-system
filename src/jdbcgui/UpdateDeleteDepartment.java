package jdbcgui;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class UpdateDeleteDepartment extends javax.swing.JFrame {

    myDBCon dbCon;
    ResultSet rs;
    LoginUser luser;

    /**
     * Creates new form UpdateDeleteDepartment
     */
    public UpdateDeleteDepartment(LoginUser user) {
        initComponents();
        this.setLocationRelativeTo(null); // center
        luser = user;

        // set all error labels to invisible
        lblDeptnoError.setVisible(false);
        lblNameError.setVisible(false);
        lblLocError.setVisible(false);
        dbCon = new myDBCon();
        getNewData();
    }

    private void getNewData() {

        try {

            rs = dbCon.executeStatement("SELECT * FROM department ORDER BY deptid ASC ");

            rs.beforeFirst();
            rs.first();
            populateFields();
        } catch (SQLException e) {
            javax.swing.JLabel label = new javax.swing.JLabel("SQL Error - Display selected departments.");
            label.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 18));
            JOptionPane.showMessageDialog(null, label, "ERROR", JOptionPane.ERROR_MESSAGE);
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

        jLabel1 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        lblDeptnoError = new javax.swing.JLabel();
        txtLoc = new javax.swing.JTextField();
        lblNameError = new javax.swing.JLabel();
        lblLocError = new javax.swing.JLabel();
        btnNext = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnPrevious = new javax.swing.JButton();
        txtDeptid = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("Update/Delete Department");

        txtName.setBackground(new java.awt.Color(242, 242, 242));
        txtName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtName.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Department Name"));

        lblDeptnoError.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        lblDeptnoError.setForeground(new java.awt.Color(255, 0, 0));
        lblDeptnoError.setText("error label");

        txtLoc.setBackground(new java.awt.Color(242, 242, 242));
        txtLoc.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtLoc.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Department Location"));

        lblNameError.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        lblNameError.setForeground(new java.awt.Color(255, 0, 0));
        lblNameError.setText("error label");

        lblLocError.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        lblLocError.setForeground(new java.awt.Color(255, 0, 0));
        lblLocError.setText("error label");

        btnNext.setFont(new java.awt.Font("Forte", 0, 24)); // NOI18N
        btnNext.setText("Next >>");
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

        btnDelete.setFont(new java.awt.Font("Forte", 0, 24)); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnUpdate.setFont(new java.awt.Font("Forte", 0, 24)); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnPrevious.setFont(new java.awt.Font("Forte", 0, 24)); // NOI18N
        btnPrevious.setText("<< Previous");
        btnPrevious.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPreviousActionPerformed(evt);
            }
        });

        txtDeptid.setEditable(false);
        txtDeptid.setBackground(new java.awt.Color(230, 230, 230));
        txtDeptid.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtDeptid.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Department ID"));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 54, Short.MAX_VALUE)
                        .addComponent(btnPrevious)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnDelete)
                        .addGap(12, 12, 12)
                        .addComponent(btnUpdate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnNext)
                        .addGap(6, 6, 6))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(142, 142, 142)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtLoc, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblLocError, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtName, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                    .addComponent(txtDeptid))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblDeptnoError, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
                                    .addComponent(lblNameError, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addGap(50, 50, 50))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 542, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtDeptid)
                    .addComponent(lblDeptnoError, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblNameError, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtLoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblLocError, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPrevious)
                    .addComponent(btnDelete)
                    .addComponent(btnUpdate)
                    .addComponent(btnNext))
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void populateFields() {
        try {
            txtName.setText(rs.getString("name"));
            txtLoc.setText(rs.getString("loc"));
            txtDeptid.setText(rs.getString("deptid"));

            EnableDisableButtons();
        } catch (SQLException ex) {
            Logger.getLogger(UpdateDeleteDepartment.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void MoveNext() {
        try {

            if (!rs.isLast()) {
                rs.next();
                populateFields();
            }
        } catch (SQLException ex) {
            Logger.getLogger(UpdateDeleteDepartment.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void MovePrevious() {
        try {
            if (!rs.isFirst()) {
                rs.previous();
                populateFields();
            }
        } catch (SQLException ex) {
            Logger.getLogger(UpdateDeleteDepartment.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void EnableDisableButtons() {
        try {
            if (rs.isFirst()) {
                btnPrevious.setEnabled(false);
            } else {
                btnPrevious.setEnabled(true);
            }
            if (rs.isLast()) {
                btnNext.setEnabled(false);
            } else {
                btnNext.setEnabled(true);
            }
        } catch (SQLException ex) {
            Logger.getLogger(UpdateDeleteDepartment.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void updateLogs(String action) {
        try {
            String prepSQL = "INSERT INTO log VALUES (?,?,?,SYSTIMESTAMP)";
            PreparedStatement preparedStatement = dbCon.prepareStatement(prepSQL);
            preparedStatement.setInt(1, luser.userid);
            preparedStatement.setString(2, luser.username);
            preparedStatement.setString(3, action);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error inserting the logs.");
        }
    }

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        MoveNext();
    }//GEN-LAST:event_btnNextActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        try {

            String prepSQL = "DELETE from department WHERE deptid = " + rs.getString("deptid");

            if (JOptionPane.showConfirmDialog(null, "Are you sure you want to delete?", "CONFIRM",
                    JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
                String prepSQL2 = "SELECT * from professor WHERE deptid = " + rs.getString("deptid");

                String action = "Deleted: Department table at deptID " + rs.getString("deptID");

                int result = dbCon.executePrepared(prepSQL2);

                if (result > 0) {

                    updateLogs(action);

                    javax.swing.JLabel label = new javax.swing.JLabel("Unable to delete department with professors in it.");
                    label.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 18));
                    JOptionPane.showMessageDialog(null, label, "ERROR", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                result = dbCon.executePrepared(prepSQL);
                if (result > 0) {
                    javax.swing.JLabel label = new javax.swing.JLabel("Dept Name " + txtName.getText().trim() + " deleted successfully.");
                    label.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 18));
                    JOptionPane.showMessageDialog(null, label, "SUCCESS", JOptionPane.INFORMATION_MESSAGE);
                    getNewData();
                }
            }
            return;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error removing department.");
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void clearErrorLabels() {
        lblDeptnoError.setText("");
        lblDeptnoError.setVisible(false);

        lblNameError.setText("");
        lblNameError.setVisible(false);

        lblLocError.setText("");
        lblLocError.setVisible(false);
    }

    private boolean isInteger(String s) {
        try {
            Integer.valueOf(s);
            return true;
        } catch (NumberFormatException ex) {
            return false;
        }
    }

    
    private boolean isValidData() {
        clearErrorLabels();
        boolean result = true;

        String deptId = txtDeptid.getText().trim();
        String location = txtLoc.getText().trim();
        String name = txtName.getText().trim();
    
        if (deptId.isEmpty() || !isInteger(deptId)) {
            lblDeptnoError.setText(deptId.isEmpty() ? "Invalid. Cannot be empty." : "Invalid. Must be an integer.");
            lblDeptnoError.setVisible(true);
            result = false;
        }

        if (location.isEmpty() || location.length() > 30) {
            lblLocError.setText(location.isEmpty() ? "Invalid. Cannot be empty." : "Invalid. Must be < 30 chars.");
            lblLocError.setVisible(true);
            result = false;
        }

        if (name.isEmpty() || name.length() > 30) {
            lblNameError.setText(name.isEmpty() ? "Invalid. Cannot be empty." : "Invalid. Must be < 30 chars.");
            lblNameError.setVisible(true);
            result = false;
        }

        return result;
    }

    private boolean isDuplicateDeptID(String deptid) throws SQLException {
        String stmtSQL = "SELECT * FROM department WHERE deptid = " + deptid;
        ResultSet rs2 = dbCon.executeStatement(stmtSQL);
        return rs2.isBeforeFirst();
    }

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed

        try {

            if (isValidData()) {
                if (JOptionPane.showConfirmDialog(null, "Are you sure you want to update?", "CONFIRM",
                        JOptionPane.YES_NO_OPTION) != JOptionPane.YES_NO_OPTION) {
                    return;
                }

                String prepSQL = "UPDATE department SET name = '"
                        + txtName.getText().trim() + "', loc = '"
                        + txtLoc.getText().trim() + "' WHERE deptid = "
                        + rs.getString("deptid");

                String oldName = rs.getString("name");
                String oldLoc = rs.getString("loc");

                String action = "Updated: Department table at deptid " + rs.getString("deptid");
                if (!oldName.equals(txtName.getText().trim())) {
                    action += " eventID(" + oldName + "->" + txtName.getText().trim() + ")";
                }
                if (!oldLoc.equals(txtLoc.getText().trim())) {
                    action += " profID(" + oldLoc + "->" + txtLoc.getText().trim() + ") ";
                }

                int result = dbCon.executePrepared(prepSQL);

                if (result > 0) {
                    
                    updateLogs(action);
                    
                    javax.swing.JLabel label = new javax.swing.JLabel("Department updated successfully.");
                    label.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 18));
                    JOptionPane.showMessageDialog(null, label, "SUCCESS", JOptionPane.INFORMATION_MESSAGE);

                    //updateLogs(action);
                    getNewData();
                }

            } else {
                javax.swing.JLabel label = new javax.swing.JLabel("Please fix validation errors...");
                label.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 18));
                JOptionPane.showMessageDialog(null, label, "ERROR", JOptionPane.ERROR_MESSAGE);
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error updating professor." + e.getMessage());
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnPreviousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPreviousActionPerformed
        MovePrevious();
    }//GEN-LAST:event_btnPreviousActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnPrevious;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblDeptnoError;
    private javax.swing.JLabel lblLocError;
    private javax.swing.JLabel lblNameError;
    private javax.swing.JTextField txtDeptid;
    private javax.swing.JTextField txtLoc;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables
}
