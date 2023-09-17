/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

/**
 *
 * @author guill
 */
public class LoginPage extends javax.swing.JFrame {
    
    private String login = "admin";
    private String password = "admin";

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public LoginPage() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel = new javax.swing.JPanel();
        LabelSenha = new javax.swing.JLabel();
        LabelUsuario = new javax.swing.JLabel();
        TextFieldUsuario = new javax.swing.JTextField();
        PasswordField = new javax.swing.JPasswordField();
        LabelLogin = new javax.swing.JLabel();
        ButtonLogin = new javax.swing.JButton();
        ButtonLimpar = new javax.swing.JButton();
        ButtonSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Panel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        LabelSenha.setText("Senha");

        LabelUsuario.setText("Usuario");

        LabelLogin.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        LabelLogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelLogin.setText("Login");

        ButtonLogin.setText("Login");
        ButtonLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonLoginActionPerformed(evt);
            }
        });

        ButtonLimpar.setText("Limpar");
        ButtonLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonLimparActionPerformed(evt);
            }
        });

        ButtonSair.setText("Sair");
        ButtonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelLayout = new javax.swing.GroupLayout(Panel);
        Panel.setLayout(PanelLayout);
        PanelLayout.setHorizontalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLayout.createSequentialGroup()
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(LabelLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(PanelLayout.createSequentialGroup()
                                .addComponent(ButtonLimpar)
                                .addGap(18, 18, 18)
                                .addComponent(ButtonLogin))
                            .addGroup(PanelLayout.createSequentialGroup()
                                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(LabelUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(LabelSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(TextFieldUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                                    .addComponent(PasswordField)))))
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(ButtonSair)))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        PanelLayout.setVerticalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LabelLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextFieldUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LabelSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButtonLimpar)
                    .addComponent(ButtonLogin))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addComponent(ButtonSair))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonSairActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_ButtonSairActionPerformed

    private void ButtonLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonLoginActionPerformed
        // TODO add your handling code here:

        String userID = TextFieldUsuario.getText();
        String password = String.valueOf(PasswordField.getPassword());
        
        if (userID.equals("admin") && password.equals("admin")) {
            InterfaceComanda IC = new InterfaceComanda();
            IC.setVisible(true);
            this.setVisible(false);
        }
        
    }//GEN-LAST:event_ButtonLoginActionPerformed

    private void ButtonLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonLimparActionPerformed
        // TODO add your handling code here:
        
        TextFieldUsuario.setText(" ");
        PasswordField.setText("");
    }//GEN-LAST:event_ButtonLimparActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonLimpar;
    private javax.swing.JButton ButtonLogin;
    private javax.swing.JButton ButtonSair;
    private javax.swing.JLabel LabelLogin;
    private javax.swing.JLabel LabelSenha;
    private javax.swing.JLabel LabelUsuario;
    private javax.swing.JPanel Panel;
    private javax.swing.JPasswordField PasswordField;
    private javax.swing.JTextField TextFieldUsuario;
    // End of variables declaration//GEN-END:variables
}
