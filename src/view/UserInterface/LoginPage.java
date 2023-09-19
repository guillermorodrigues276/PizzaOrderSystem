
package view.UserInterface;
import java.awt.Color;
import model.Pessoa;
import view.InterfaceBorda;
import view.UserInterface.InterfaceCadastro;

public class LoginPage extends javax.swing.JFrame {
    
    private Pessoa pessoaAtual = new Pessoa();
    
    public LoginPage() {
        initComponents();
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel = new javax.swing.JPanel();
        TextFieldUsuario = new javax.swing.JTextField();
        PasswordField = new javax.swing.JPasswordField();
        LabelLogin = new javax.swing.JLabel();
        javax.swing.JButton ButtonLogin = new javax.swing.JButton();
        ButtonSair = new javax.swing.JButton();
        ButtonCadastrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Panel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        TextFieldUsuario.setText("Usuario");
        TextFieldUsuario.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TextFieldUsuarioFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                TextFieldUsuarioFocusLost(evt);
            }
        });

        PasswordField.setText("Senha");
        PasswordField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                PasswordFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                PasswordFieldFocusLost(evt);
            }
        });

        LabelLogin.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        LabelLogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelLogin.setText("Login");

        ButtonLogin.setText("Login");
        ButtonLogin.setBorderPainted(false);
        ButtonLogin.setContentAreaFilled(false);
        ButtonLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonLoginActionPerformed(evt);
            }
        });

        ButtonSair.setText("Sair");
        ButtonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonSairActionPerformed(evt);
            }
        });

        ButtonCadastrar.setText("Cadastrar");
        ButtonCadastrar.setBorderPainted(false);
        ButtonCadastrar.setContentAreaFilled(false);
        ButtonCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonCadastrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelLayout = new javax.swing.GroupLayout(Panel);
        Panel.setLayout(PanelLayout);
        PanelLayout.setHorizontalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLayout.createSequentialGroup()
                .addComponent(ButtonSair)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(PanelLayout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(LabelLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelLayout.createSequentialGroup()
                .addContainerGap(64, Short.MAX_VALUE)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelLayout.createSequentialGroup()
                        .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(PasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TextFieldUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(50, 50, 50))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelLayout.createSequentialGroup()
                        .addComponent(ButtonCadastrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ButtonLogin)
                        .addGap(72, 72, 72))))
        );
        PanelLayout.setVerticalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(LabelLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TextFieldUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(PasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButtonLogin)
                    .addComponent(ButtonCadastrar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
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
        System.exit(0);
    }//GEN-LAST:event_ButtonSairActionPerformed

    private void ButtonLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonLoginActionPerformed
        
        
        String password = String.valueOf(PasswordField.getPassword());
        String userID = TextFieldUsuario.getText();
        
        if (userID.equals(pessoaAtual.getNome())) {
            System.out.println("xxx" + getPessoaAtual());
             InterfaceBorda interfaceBorda = new InterfaceBorda();
            interfaceBorda.setVisible(true);
            this.setVisible(false);
        }
        
//        if (userID.equals(a) && password.equals("a")) {
//            InterfaceBorda interfaceBorda = new InterfaceBorda();
//            interfaceBorda.setVisible(true);
//            this.setVisible(false);
//        }
        
        System.out.println("");
        System.out.println("Dados do LoginPage passado no TextField");
       System.out.println("UserID " + userID + " " + "\nSenha " + password);
       
//       System.out.println("getNomeCadastro no LoginPage: " + getNomeCadastro());
    }//GEN-LAST:event_ButtonLoginActionPerformed

 

    private void ButtonCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonCadastrarActionPerformed
        InterfaceCadastro interfaceCadastro = new InterfaceCadastro();
        interfaceCadastro.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_ButtonCadastrarActionPerformed

    private void TextFieldUsuarioFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TextFieldUsuarioFocusGained
        if(TextFieldUsuario.getText().equals("Usuario")) {
            TextFieldUsuario.setText("");
            TextFieldUsuario.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_TextFieldUsuarioFocusGained

    private void TextFieldUsuarioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TextFieldUsuarioFocusLost
        if(TextFieldUsuario.getText().equals("")) {
            TextFieldUsuario.setText("Usuario");
            TextFieldUsuario.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_TextFieldUsuarioFocusLost

    private void PasswordFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_PasswordFieldFocusGained
         if (PasswordField.getText().equals("Senha")) {
            PasswordField.setText("");
            PasswordField.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_PasswordFieldFocusGained

    private void PasswordFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_PasswordFieldFocusLost
        if (PasswordField.getText().equals("")) {
            PasswordField.setText("Senha");
            PasswordField.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_PasswordFieldFocusLost

    public Pessoa getPessoaAtual() {
        return pessoaAtual;
    }

    public void setPessoaAtual(Pessoa pessoaAtual) {
        this.pessoaAtual = pessoaAtual;
    }
    
    

    
    
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonCadastrar;
    private javax.swing.JButton ButtonSair;
    private javax.swing.JLabel LabelLogin;
    private javax.swing.JPanel Panel;
    private javax.swing.JPasswordField PasswordField;
    private javax.swing.JTextField TextFieldUsuario;
    // End of variables declaration//GEN-END:variables
}
