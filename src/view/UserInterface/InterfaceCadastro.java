
package view.UserInterface;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import model.Pessoa;

public class InterfaceCadastro extends javax.swing.JFrame {
    
    private String nomeCadastro;
    private String senhaCadastro;
    private Pessoa pessoa = new Pessoa();
    
    public InterfaceCadastro() {
        
        initComponents();
        
         addPlaceHolderStyle(TextFCadastroNome);
        addPlaceHolderStyle(TextFCadastroCPF);
        addPlaceHolderStyle(TextFCadastroCPF);
        addPlaceHolderStyle(TextFCadastroTelefone);
        addPlaceHolderStyle(TextPCadastroSenha);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel = new javax.swing.JPanel();
        LabelLogin = new javax.swing.JLabel();
        ButtonCadastrarCadastro = new javax.swing.JButton();
        TextFCadastroNome = new javax.swing.JTextField();
        TextFCadastroTelefone = new javax.swing.JTextField();
        TextFCadastroEmail = new javax.swing.JTextField();
        TextFCadastroCPF = new javax.swing.JTextField();
        TextPCadastroSenha = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        LabelLogin.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        LabelLogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelLogin.setText("Cadastro");

        ButtonCadastrarCadastro.setText("Cadastrar");
        ButtonCadastrarCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonCadastrarCadastroActionPerformed(evt);
            }
        });

        TextFCadastroNome.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TextFCadastroNomeFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                TextFCadastroNomeFocusLost(evt);
            }
        });

        TextFCadastroTelefone.setText("Telefone");
        TextFCadastroTelefone.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TextFCadastroTelefoneFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                TextFCadastroTelefoneFocusLost(evt);
            }
        });

        TextFCadastroEmail.setText("Email");
        TextFCadastroEmail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TextFCadastroEmailFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                TextFCadastroEmailFocusLost(evt);
            }
        });

        TextFCadastroCPF.setText("CPF");
        TextFCadastroCPF.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TextFCadastroCPFFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                TextFCadastroCPFFocusLost(evt);
            }
        });

        TextPCadastroSenha.setText("Senha");
        TextPCadastroSenha.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TextPCadastroSenhaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                TextPCadastroSenhaFocusLost(evt);
            }
        });

        javax.swing.GroupLayout PanelLayout = new javax.swing.GroupLayout(Panel);
        Panel.setLayout(PanelLayout);
        PanelLayout.setHorizontalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLayout.createSequentialGroup()
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ButtonCadastrarCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(LabelLogin, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                            .addComponent(TextFCadastroNome, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TextFCadastroTelefone, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TextFCadastroEmail)
                            .addComponent(TextFCadastroCPF)
                            .addComponent(TextPCadastroSenha))
                        .addGap(0, 57, Short.MAX_VALUE)))
                .addContainerGap())
        );
        PanelLayout.setVerticalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LabelLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(TextFCadastroNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TextFCadastroTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TextFCadastroEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TextFCadastroCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TextPCadastroSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(ButtonCadastrarCadastro)
                .addContainerGap())
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
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonCadastrarCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonCadastrarCadastroActionPerformed
        
        pessoa.setNome(TextFCadastroNome.getText());
        
        LoginPage loginPage = new LoginPage();
        loginPage.setVisible(true);
        this.setVisible(false);

        
    }//GEN-LAST:event_ButtonCadastrarCadastroActionPerformed

    private void TextFCadastroNomeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TextFCadastroNomeFocusGained
        // TODO add your handling code here:
        if(TextFCadastroNome.getText().equals("Nome")) {
            TextFCadastroNome.setText("");
            TextFCadastroNome.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_TextFCadastroNomeFocusGained

    private void TextFCadastroNomeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TextFCadastroNomeFocusLost
        // TODO add your handling code here:
        
         if (TextFCadastroNome.getText().equals("")) {
            TextFCadastroNome.setText("Nome");
            TextFCadastroNome.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_TextFCadastroNomeFocusLost

    private void TextFCadastroCPFFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TextFCadastroCPFFocusGained
        // TODO add your handling code here:
        
        if (TextFCadastroCPF.getText().equals("CPF")) {
            TextFCadastroCPF.setText("");
            TextFCadastroCPF.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_TextFCadastroCPFFocusGained

    private void TextFCadastroCPFFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TextFCadastroCPFFocusLost
        // TODO add your handling code here:
        if (TextFCadastroCPF.getText().equals("")) {
            TextFCadastroCPF.setText("CPF");
            TextFCadastroCPF.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_TextFCadastroCPFFocusLost

    private void TextFCadastroEmailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TextFCadastroEmailFocusGained
        // TODO add your handling code here:
        if (TextFCadastroEmail.getText().equals("Email")) {
            TextFCadastroEmail.setText("");
            TextFCadastroEmail.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_TextFCadastroEmailFocusGained

    private void TextFCadastroEmailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TextFCadastroEmailFocusLost
        // TODO add your handling code here:
        if (TextFCadastroEmail.getText().equals("")) {
            TextFCadastroEmail.setText("Email");
            TextFCadastroEmail.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_TextFCadastroEmailFocusLost

    private void TextFCadastroTelefoneFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TextFCadastroTelefoneFocusGained
        // TODO add your handling code here:
         if (TextFCadastroTelefone.getText().equals("Telefone")) {
            TextFCadastroTelefone.setText("");
            TextFCadastroTelefone.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_TextFCadastroTelefoneFocusGained

    private void TextFCadastroTelefoneFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TextFCadastroTelefoneFocusLost
        // TODO add your handling code here:
        if (TextFCadastroTelefone.getText().equals("")) {
            TextFCadastroTelefone.setText("Telefone");
            TextFCadastroTelefone.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_TextFCadastroTelefoneFocusLost

    private void TextPCadastroSenhaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TextPCadastroSenhaFocusGained
        // TODO add your handling code here:
        
        if (TextPCadastroSenha.getText().equals("Senha")) {
            TextPCadastroSenha.setText("");
            TextFCadastroTelefone.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_TextPCadastroSenhaFocusGained

    private void TextPCadastroSenhaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TextPCadastroSenhaFocusLost
        // TODO add your handling code here:
         if (TextPCadastroSenha.getText().equals("")) {
            TextPCadastroSenha.setText("Senha");
            TextPCadastroSenha.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_TextPCadastroSenhaFocusLost
  
    
    public void addPlaceHolderStyle(JTextField textField) {
        Font font = textField.getFont();
        font = font.deriveFont(Font.ITALIC);
        textField.setFont(font);
        textField.setForeground(Color.GRAY);
    }
    
    public void  removePlaceHolderStyle(JTextField textField) {
        Font font = textField.getFont();
        font = font.deriveFont(Font.PLAIN, Font.BOLD);
        textField.setFont(font);
        textField.setForeground(Color.BLACK);
    }

    public String getNomeCadastro() {
        return nomeCadastro;
    }

    public void setNomeCadastro(String nomeCadastro) {
        this.nomeCadastro = nomeCadastro;
    }

    public String getSenhaCadastro() {
        return senhaCadastro;
    }

    public void setSenhaCadastro(String senhaCadastro) {
        this.senhaCadastro = senhaCadastro;
    }

  
    
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfaceCadastro() .setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonCadastrarCadastro;
    private javax.swing.JLabel LabelLogin;
    private javax.swing.JPanel Panel;
    private javax.swing.JTextField TextFCadastroCPF;
    private javax.swing.JTextField TextFCadastroEmail;
    public javax.swing.JTextField TextFCadastroNome;
    private javax.swing.JTextField TextFCadastroTelefone;
    public javax.swing.JPasswordField TextPCadastroSenha;
    // End of variables declaration//GEN-END:variables

    public Pessoa getPessoa() {
        return pessoa;
    }


}
