/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package View;

import DataBase.AdminDirectory;
import DataBase.DoctorDirectory;
import DataBase.HospitalDirectory;
import DataBase.LoginDirectory;
import DataBase.PatientDirectory;
import java.awt.BorderLayout;
import java.util.HashMap;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


/**
 *
 * @author Zaniar
 */
public class login extends javax.swing.JPanel {

    /**
     * Creates new form login
     */
    LoginDirectory loginDirectory;
    AdminDirectory admindirectory;
    PatientDirectory patientdirectory;
    DoctorDirectory doctordirectory;
    HospitalDirectory hospitaldirectory;
    
    public login(AdminDirectory Ausers,DoctorDirectory Dusers,PatientDirectory Pusers,HospitalDirectory hospitaldirectory) {
        initComponents();
        this.admindirectory = Ausers;
        this.patientdirectory = Pusers;
        this.doctordirectory = Dusers;
        this.hospitaldirectory = hospitaldirectory;
        this.loginDirectory = renewlogin();
    }
    
    
    
    public LoginDirectory renewlogin(){
        LoginDirectory obj = new LoginDirectory(admindirectory,doctordirectory,patientdirectory);
        return obj;
    
    };

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        userText = new javax.swing.JTextField();
        passText = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Login = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        userText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userTextActionPerformed(evt);
            }
        });

        jLabel1.setText("Username : ");

        jLabel2.setText("Passsword :");

        Login.setText("Login");
        Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Hospital Login System");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(254, 254, 254)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(passText, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(userText, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(Login, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(370, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(passText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addComponent(Login, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(202, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void userTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userTextActionPerformed

    private void LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginActionPerformed
        // TODO add your handling code here:
        String user = userText.getText();
        String pass = passText.getText();
        boolean login = false;
        String role = null;

        HashMap<String, List<String>> users;
        users = loginDirectory.getUserPass();
        boolean contains = users.containsKey(user);

        if(!contains){JOptionPane.showMessageDialog(this, "Wrong Username");}else{
            List<String> valueList = users.get(user);
            role = valueList.get(1);
            String aPass = valueList.get(0);

            if(pass.equals(aPass)){
                login = true;} else {JOptionPane.showMessageDialog(this, "Wrong Password");}
        }

        if (login){
            JFrame frame = new JFrame();
            frame.setSize(900, 700);
            frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            switch(role){
                case"Admin":  
                   AView newaView =  new AView(user,hospitaldirectory,admindirectory,doctordirectory,patientdirectory,loginDirectory);
                   frame.add(newaView);
                   frame.setVisible(true);
                case"Patient":
                    PatientView newpView = new PatientView(user,hospitaldirectory,doctordirectory,patientdirectory);
                    frame.add(newpView);
                    frame.setVisible(true);
                case"Doctor":
                    DoctorView newdView = new DoctorView(user,patientdirectory);
                    frame.add(newdView);
                    frame.setVisible(true);
                default:
                JOptionPane.showMessageDialog(this, "Role NOT defined. Please contact your admin");
            }
        }
    }//GEN-LAST:event_LoginActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Login;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField passText;
    private javax.swing.JTextField userText;
    // End of variables declaration//GEN-END:variables
}
