
package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import static java.lang.Integer.parseInt;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Interface extends javax.swing.JFrame {

    public Interface() {
        initComponents();
        
        addPlaceHolderStyle(TextFieldNome);
        addPlaceHolderStyle(TextFieldCPF);
        addPlaceHolderStyle(TextFieldEmail);
        addPlaceHolderStyle(TextFieldTelefone);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ButtonGroupBordaSimNao = new javax.swing.ButtonGroup();
        ButtonGroupTamanho = new javax.swing.ButtonGroup();
        jProgressBar1 = new javax.swing.JProgressBar();
        PanelPessoa = new javax.swing.JPanel();
        TextFieldNome = new javax.swing.JTextField();
        TextFieldCPF = new javax.swing.JTextField();
        TextFieldEmail = new javax.swing.JTextField();
        TextFieldTelefone = new javax.swing.JTextField();
        PanelStatusPizza = new javax.swing.JPanel();
        LabelBorda = new javax.swing.JLabel();
        RadioBtnSim = new javax.swing.JRadioButton();
        RadioBtnNao = new javax.swing.JRadioButton();
        LabelSabores = new javax.swing.JLabel();
        RadioBtnBroto = new javax.swing.JRadioButton();
        RadioBtnPequena = new javax.swing.JRadioButton();
        RadioBtnMedio = new javax.swing.JRadioButton();
        RadioBtnGrande = new javax.swing.JRadioButton();
        LabelTamanho = new javax.swing.JLabel();
        ComboBoxSabores = new javax.swing.JComboBox<>();
        ButtonGerarComanda = new javax.swing.JButton();
        PanelComanda = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TextFieldComanda = new javax.swing.JTextPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PanelPessoa.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        TextFieldNome.setForeground(new java.awt.Color(153, 153, 153));
        TextFieldNome.setText("Nome"); // NOI18N
        TextFieldNome.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        TextFieldNome.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        TextFieldNome.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TextFieldNomeFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                TextFieldNomeFocusLost(evt);
            }
        });

        TextFieldCPF.setForeground(new java.awt.Color(153, 153, 153));
        TextFieldCPF.setText("CPF");
        TextFieldCPF.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        TextFieldCPF.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TextFieldCPFFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                TextFieldCPFFocusLost(evt);
            }
        });

        TextFieldEmail.setForeground(new java.awt.Color(153, 153, 153));
        TextFieldEmail.setText("Email");
        TextFieldEmail.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        TextFieldEmail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TextFieldEmailFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                TextFieldEmailFocusLost(evt);
            }
        });

        TextFieldTelefone.setForeground(new java.awt.Color(153, 153, 153));
        TextFieldTelefone.setText("Telefone");
        TextFieldTelefone.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        TextFieldTelefone.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        TextFieldTelefone.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TextFieldTelefoneFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                TextFieldTelefoneFocusLost(evt);
            }
        });

        javax.swing.GroupLayout PanelPessoaLayout = new javax.swing.GroupLayout(PanelPessoa);
        PanelPessoa.setLayout(PanelPessoaLayout);
        PanelPessoaLayout.setHorizontalGroup(
            PanelPessoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelPessoaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelPessoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TextFieldNome)
                    .addComponent(TextFieldCPF)
                    .addComponent(TextFieldEmail)
                    .addComponent(TextFieldTelefone))
                .addContainerGap())
        );
        PanelPessoaLayout.setVerticalGroup(
            PanelPessoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelPessoaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TextFieldCPF)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TextFieldEmail)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TextFieldTelefone)
                .addContainerGap())
        );

        PanelStatusPizza.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        LabelBorda.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        LabelBorda.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelBorda.setText("Bordas");
        LabelBorda.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        ButtonGroupBordaSimNao.add(RadioBtnSim);
        RadioBtnSim.setText("Sim");

        ButtonGroupBordaSimNao.add(RadioBtnNao);
        RadioBtnNao.setText("Não");

        LabelSabores.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        LabelSabores.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelSabores.setText("Sabores");
        LabelSabores.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        ButtonGroupTamanho.add(RadioBtnBroto);
        RadioBtnBroto.setText("Broto");

        ButtonGroupTamanho.add(RadioBtnPequena);
        RadioBtnPequena.setText("Pequena");

        ButtonGroupTamanho.add(RadioBtnMedio);
        RadioBtnMedio.setText("Media");

        ButtonGroupTamanho.add(RadioBtnGrande);
        RadioBtnGrande.setText("Grande");

        LabelTamanho.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        LabelTamanho.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelTamanho.setText("Tamanho");
        LabelTamanho.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        ComboBoxSabores.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nenhum", "Calabresa", "Frango", "Milho", "Bacon", "Portuguesa", "Marguerita" }));

        javax.swing.GroupLayout PanelStatusPizzaLayout = new javax.swing.GroupLayout(PanelStatusPizza);
        PanelStatusPizza.setLayout(PanelStatusPizzaLayout);
        PanelStatusPizzaLayout.setHorizontalGroup(
            PanelStatusPizzaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelStatusPizzaLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(PanelStatusPizzaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelStatusPizzaLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(PanelStatusPizzaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LabelBorda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(PanelStatusPizzaLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(RadioBtnSim, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(RadioBtnNao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(11, 11, 11))
                            .addComponent(LabelTamanho, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(64, 64, 64))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelStatusPizzaLayout.createSequentialGroup()
                        .addGroup(PanelStatusPizzaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(LabelSabores, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PanelStatusPizzaLayout.createSequentialGroup()
                                .addComponent(RadioBtnMedio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(RadioBtnGrande, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PanelStatusPizzaLayout.createSequentialGroup()
                                .addComponent(RadioBtnBroto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(RadioBtnPequena, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(ComboBoxSabores, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(34, 34, 34))))
        );
        PanelStatusPizzaLayout.setVerticalGroup(
            PanelStatusPizzaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelStatusPizzaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LabelBorda, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelStatusPizzaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RadioBtnSim, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(RadioBtnNao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(LabelTamanho, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelStatusPizzaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RadioBtnBroto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(RadioBtnPequena, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelStatusPizzaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RadioBtnMedio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(RadioBtnGrande, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LabelSabores, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ComboBoxSabores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(191, 191, 191))
        );

        ButtonGerarComanda.setText("Gerar Comanda");
        ButtonGerarComanda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonGerarComandaActionPerformed(evt);
            }
        });

        PanelComanda.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jScrollPane1.setViewportView(TextFieldComanda);

        javax.swing.GroupLayout PanelComandaLayout = new javax.swing.GroupLayout(PanelComanda);
        PanelComanda.setLayout(PanelComandaLayout);
        PanelComandaLayout.setHorizontalGroup(
            PanelComandaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelComandaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                .addContainerGap())
        );
        PanelComandaLayout.setVerticalGroup(
            PanelComandaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelComandaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PanelPessoa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(ButtonGerarComanda))
                    .addComponent(PanelComanda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PanelStatusPizza, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(12, 12, 12))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PanelStatusPizza, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(PanelPessoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(PanelComanda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ButtonGerarComanda)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonGerarComandaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonGerarComandaActionPerformed
        // TODO add your handling code here:
        
        String nome = TextFieldNome.getText(); 
        String telefone = TextFieldTelefone.getText();
        String email = TextFieldEmail.getText();
        String CPF = TextFieldCPF.getText();
        
        if (telefone.matches("^[0-9]*$") && telefone.length() == 11) {
            
        } else {
            JOptionPane.showMessageDialog(null, "Telefone Incorreto");
        }
        
        
        
        
        // Tentar colocar mudança de tela, dados do usuario e depois mostrar a pizza
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        TextFieldComanda.setText
                (
                        "Nome: " + nome +
                        "\nTelefone: " + telefone +
                        "\nBorda:" + returnBorda() +
                        "\nTamanho: " + returnTamanho() +
                        "\nSaborr: " + ComboBoxSabores.getSelectedItem()
                        
                );
    }//GEN-LAST:event_ButtonGerarComandaActionPerformed

    public void actionPerformed(ActionEvent e) {
        JComboBox cb = (JComboBox)e.getSource();;
        String sabores = (String)cb.getSelectedItem();
        
        
    }
    
    private void TextFieldNomeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TextFieldNomeFocusGained
        // TODO add your handling code here:
        
        if(TextFieldNome.getText().equals("Nome")) {
            TextFieldNome.setText("");
            TextFieldNome.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_TextFieldNomeFocusGained

    private void TextFieldNomeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TextFieldNomeFocusLost
        // TODO add your handling code here:
        
        if (TextFieldNome.getText().equals("")) {
            TextFieldNome.setText("Nome");
            TextFieldNome.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_TextFieldNomeFocusLost

    private void TextFieldCPFFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TextFieldCPFFocusGained
        // TODO add your handling code here:
        
        if (TextFieldCPF.getText().equals("CPF")) {
            TextFieldCPF.setText("");
            TextFieldCPF.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_TextFieldCPFFocusGained

    private void TextFieldCPFFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TextFieldCPFFocusLost
        // TODO add your handling code here:
        
        if (TextFieldCPF.getText().equals("")) {
            TextFieldCPF.setText("CPF");
            TextFieldCPF.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_TextFieldCPFFocusLost

    private void TextFieldEmailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TextFieldEmailFocusGained
        // TODO add your handling code here:
        
        if (TextFieldEmail.getText().equals("Email")) {
            TextFieldEmail.setText("");
            TextFieldEmail.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_TextFieldEmailFocusGained

    private void TextFieldEmailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TextFieldEmailFocusLost
        // TODO add your handling code here:
        
        if (TextFieldEmail.getText().equals("")) {
            TextFieldEmail.setText("Email");
            TextFieldEmail.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_TextFieldEmailFocusLost

    private void TextFieldTelefoneFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TextFieldTelefoneFocusGained
        // TODO add your handling code here:
        
        if (TextFieldTelefone.getText().equals("Telefone")) {
            TextFieldTelefone.setText("");
            TextFieldTelefone.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_TextFieldTelefoneFocusGained

    private void TextFieldTelefoneFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TextFieldTelefoneFocusLost
        // TODO add your handling code here:
        
        if (TextFieldTelefone.getText().equals("")) {
            TextFieldTelefone.setText("Telefone");
            TextFieldTelefone.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_TextFieldTelefoneFocusLost

    
    public String returnBorda() {
        if(RadioBtnSim.isSelected() == true){
            return "Sim";
        }
        return "Não";
    }
    
    public String returnTamanho() {
        if(RadioBtnBroto.isSelected() == true) {
            return "Broto";
        }
        else if (RadioBtnPequena.isSelected() == true) {
            return "Pequena";
        }
        else if (RadioBtnMedio.isSelected() == true) {
            return "Media";
        }
        else {
            return "Grande";
        }
    }
    
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
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonGerarComanda;
    private javax.swing.ButtonGroup ButtonGroupBordaSimNao;
    private javax.swing.ButtonGroup ButtonGroupTamanho;
    private javax.swing.JComboBox<String> ComboBoxSabores;
    private javax.swing.JLabel LabelBorda;
    private javax.swing.JLabel LabelSabores;
    private javax.swing.JLabel LabelTamanho;
    private javax.swing.JPanel PanelComanda;
    private javax.swing.JPanel PanelPessoa;
    private javax.swing.JPanel PanelStatusPizza;
    private javax.swing.JRadioButton RadioBtnBroto;
    private javax.swing.JRadioButton RadioBtnGrande;
    private javax.swing.JRadioButton RadioBtnMedio;
    private javax.swing.JRadioButton RadioBtnNao;
    private javax.swing.JRadioButton RadioBtnPequena;
    private javax.swing.JRadioButton RadioBtnSim;
    private javax.swing.JTextField TextFieldCPF;
    private javax.swing.JTextPane TextFieldComanda;
    private javax.swing.JTextField TextFieldEmail;
    private javax.swing.JTextField TextFieldNome;
    private javax.swing.JTextField TextFieldTelefone;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
