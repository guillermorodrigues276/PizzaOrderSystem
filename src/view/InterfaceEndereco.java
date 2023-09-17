
package view;

public class InterfaceEndereco extends javax.swing.JFrame {

    public InterfaceEndereco() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        LabelTamanho = new javax.swing.JLabel();
        TextFRua = new javax.swing.JTextField();
        TextFNumero = new javax.swing.JTextField();
        TextFBairro = new javax.swing.JTextField();
        TextFCEP = new javax.swing.JTextField();
        ButtonEnderecoFinalizar = new javax.swing.JButton();
        ButtonEnderecoVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        LabelTamanho.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        LabelTamanho.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelTamanho.setText("Endereço");
        LabelTamanho.setBorder(new javax.swing.border.MatteBorder(null));

        TextFRua.setText("Rua");

        TextFNumero.setText("Numero");

        TextFBairro.setText("Bairro");

        TextFCEP.setText("CEP");

        ButtonEnderecoFinalizar.setText("Proximo");
        ButtonEnderecoFinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonEnderecoFinalizarActionPerformed(evt);
            }
        });

        ButtonEnderecoVoltar.setText("Voltar");
        ButtonEnderecoVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonEnderecoVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(LabelTamanho, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(87, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(TextFRua)
                    .addComponent(TextFNumero, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
                    .addComponent(TextFBairro)
                    .addComponent(TextFCEP))
                .addGap(48, 48, 48))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(ButtonEnderecoVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ButtonEnderecoFinalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LabelTamanho, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(TextFRua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TextFNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TextFBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TextFCEP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButtonEnderecoFinalizar)
                    .addComponent(ButtonEnderecoVoltar))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonEnderecoVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonEnderecoVoltarActionPerformed
        
        InterfaceSabor interfaceSabor = new InterfaceSabor();
        interfaceSabor.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_ButtonEnderecoVoltarActionPerformed

    private void ButtonEnderecoFinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonEnderecoFinalizarActionPerformed
        // TODO add your handling code here:
        
        InterfaceComanda interfaceComanda = new InterfaceComanda();
        interfaceComanda.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_ButtonEnderecoFinalizarActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfaceEndereco().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonEnderecoFinalizar;
    private javax.swing.JButton ButtonEnderecoVoltar;
    private javax.swing.JLabel LabelTamanho;
    private javax.swing.JTextField TextFBairro;
    private javax.swing.JTextField TextFCEP;
    private javax.swing.JTextField TextFNumero;
    private javax.swing.JTextField TextFRua;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
