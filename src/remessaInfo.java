
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author guilhermeteixeira
 */
public class remessaInfo extends javax.swing.JFrame {
    public static String date, transp;
    public static float cotDolar, imposto, frete;
    /**
     * Creates new form remessaInfo
     */
    public remessaInfo() {
        initComponents();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyy");
	LocalDateTime now = LocalDateTime.now();
	dateFormattedTextField.setText(String.valueOf(dtf.format(now)));
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
        jLabel2 = new javax.swing.JLabel();
        dateFormattedTextField = new javax.swing.JFormattedTextField();
        jLabel3 = new javax.swing.JLabel();
        transporteComboBox = new javax.swing.JComboBox<>();
        pctNovoButton = new javax.swing.JButton();
        cancelarButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        erroMSGTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        dolarTextField = new javax.swing.JTextField();
        freteTextField = new javax.swing.JTextField();
        impostoTextField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Informação do Pacote");

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel1.setText("Entre Informação Deste Pacote:");

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel2.setText("Data");

        dateFormattedTextField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("d/M/yy"))));
        dateFormattedTextField.setToolTipText("DD/MM/AA");

        jLabel3.setText("Metodo de transporte");

        transporteComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Navio", "Avião", "Correio" }));

        pctNovoButton.setText("Criar Novo Pacote");
        pctNovoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pctNovoButtonActionPerformed(evt);
            }
        });

        cancelarButton.setText("Cancelar");
        cancelarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarButtonActionPerformed(evt);
            }
        });

        jLabel4.setText("Cotação do Dolar");

        erroMSGTextField.setEditable(false);

        jLabel5.setText("Frete");

        jLabel6.setText("Imposto");

        dolarTextField.setText("0");

        freteTextField.setText("0");

        impostoTextField.setText("0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(erroMSGTextField))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(dateFormattedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(transporteComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(dolarTextField)
                                    .addComponent(freteTextField)
                                    .addComponent(impostoTextField))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(pctNovoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cancelarButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(dateFormattedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(transporteComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(dolarTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(freteTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(impostoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelarButton)
                    .addComponent(pctNovoButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(erroMSGTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private String filterVal(String val){
        if(val.indexOf(",") != -1 && val.indexOf(".") != -1){
            val = val.substring(0,val.indexOf('.'))+val.substring(val.indexOf('.')+1);
            val = val.replace(',', '.');
        }
        else if(val.indexOf(",") != -1){
            val = val.replace(',', '.');
        }
        return val;
    }
    private void pctNovoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pctNovoButtonActionPerformed
        // TODO add your handling code here:
        String dolar = dolarTextField.getText();
        dolar = filterVal(dolar);
        String freteStr = freteTextField.getText();
        freteStr = filterVal(freteStr);
        String impostoStr = impostoTextField.getText();
        impostoStr = filterVal(impostoStr);
        //impostoTextField
        try{
            date = String.valueOf(dateFormattedTextField.getText());
            cotDolar = Float.parseFloat(dolar);
            transp = transporteComboBox.getItemAt(transporteComboBox.getSelectedIndex());
            imposto = Float.parseFloat(impostoStr);
            frete = Float.parseFloat(freteStr);
            if(!date.equals("") && cotDolar != 0 && imposto != 0 && frete != 0){
                java.awt.EventQueue.invokeLater(new Runnable() {
                    public void run() {
                        new remessa().setVisible(true);
                    }
                });
                this.dispose();
            }
            else{
                if(date.equals("") && cotDolar == 0){
                    erroMSGTextField.setText("Favor preencher data e cotação do dolar.");
                }
                else if(date.equals("")){
                    erroMSGTextField.setText("Favor preencher data.");
                }
                else if(cotDolar == 0){
                    erroMSGTextField.setText("Favor preencher cotação do dolar.");
                }
                else if(imposto == 0 || frete == 0){
                    final JOptionPane optionPane = new JOptionPane(
                        "Tem certeza que deseja prosseguir sem preencher a informação de imposto e/ou frete? \n"
                        + "Esta ação não pode ser desfeita.\n",
                        JOptionPane.QUESTION_MESSAGE,
                        JOptionPane.YES_NO_OPTION);
                        optionPane.setVisible(true);
                    Object[] options = {"Prosseguir sem preencher",
                        "Cancelar"};
                    int n = JOptionPane.showOptionDialog(optionPane,
                        "Tem certeza que deseja prosseguir sem preencher a informação de imposto e/ou frete? \n"
                        + "Esta ação não pode ser desfeita.\n",
                        "Confirmação...",
                        JOptionPane.YES_NO_OPTION,
                        JOptionPane.QUESTION_MESSAGE,
                        null,
                        options,
                        options[1]);
                    if(n == 0){
                        java.awt.EventQueue.invokeLater(new Runnable() {
                            public void run() {
                                new remessa().setVisible(true);
                               }
                        });
                        this.dispose();
                    }
                    else{
                        erroMSGTextField.setText("Favor preencher a informação de imposto e/ou frete.");
                    }
                }
            }
        }catch(Exception e){
            erroMSGTextField.setText(String.valueOf(e));
                
        }
    }//GEN-LAST:event_pctNovoButtonActionPerformed

    private void cancelarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarButtonActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_cancelarButtonActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(remessaInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(remessaInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(remessaInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(remessaInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new remessaInfo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelarButton;
    private javax.swing.JFormattedTextField dateFormattedTextField;
    private javax.swing.JTextField dolarTextField;
    private javax.swing.JTextField erroMSGTextField;
    private javax.swing.JTextField freteTextField;
    private javax.swing.JTextField impostoTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JButton pctNovoButton;
    private javax.swing.JComboBox<String> transporteComboBox;
    // End of variables declaration//GEN-END:variables
}
