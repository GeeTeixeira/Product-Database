
import java.io.Serializable;
import java.text.DecimalFormat;
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
public class editarItem extends javax.swing.JFrame implements Serializable {
    public static boolean change = false;
    //BooleanChangeTest boolListener = new BooleanChangeTest();
    /**
     * Creates new form editarItem
     */
    public editarItem() {
        initComponents();
        idRemessaTextField.setText(String.valueOf(main.remVal));
        nameTextField.setText(main.productToEdit.nome);
        descTextField.setText(main.productToEdit.desc);
        qntSpinner.setValue(main.productToEdit.quantidade);
        sizeComboBox.setSelectedItem(main.productToEdit.tamanho);
        sexoComboBox.setSelectedItem(main.productToEdit.sexo);
        storeComboBox.setSelectedItem(main.productToEdit.loja);
        departmentComboBox.setSelectedItem(main.productToEdit.dept);
        valorFormattedTextField.setText(String.valueOf(main.productToEdit.valor.valor_item));
        vendaFormattedTextField.setText(String.valueOf(main.productToEdit.valor.valor_final));

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cancelarButton = new javax.swing.JButton();
        salvarRemessaButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        idRemessaTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        nameTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        descTextField = new javax.swing.JTextField();
        sizeComboBox = new javax.swing.JComboBox<>();
        sexoComboBox = new javax.swing.JComboBox<>();
        storeComboBox = new javax.swing.JComboBox<>();
        departmentComboBox = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        deleteProdButton = new javax.swing.JButton();
        errorTextField = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        qntSpinner = new javax.swing.JSpinner();
        valorFormattedTextField = new javax.swing.JTextField();
        vendaFormattedTextField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Editar Produto");

        cancelarButton.setText("Cancelar");
        cancelarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarButtonActionPerformed(evt);
            }
        });

        salvarRemessaButton.setText("Salvar Produto");
        salvarRemessaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvarRemessaButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("Pacote");

        idRemessaTextField.setEditable(false);
        idRemessaTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idRemessaTextFieldActionPerformed(evt);
            }
        });

        jLabel3.setText("Nome");

        jLabel4.setText("Descrição");

        jLabel5.setText("Departamento");

        jLabel6.setText("Gênero");

        jLabel7.setText("Loja");

        jLabel8.setText("Tamanho");

        sizeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "N/A", "RN", "3M", "6M", "9M", "12M", "18M", "24M", "2T", "3T", "4T", "5T", "10T", "11T", "12T", "13T", "14T" }));

        sexoComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Neutro", "Masculino", "Feminino" }));

        storeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Amazon", "Avent", "Carter's", "CVS", "Disney", "Fisher Price", "Graco", "Kipling", "NUK", "Pampers", "Oshkosh", "Skip Hop", "Walgreens", "Walmart", "Target", "Outros" }));

        departmentComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Acessesórios", "Alimentação", "Brinquedos", "Eletrônicos", "Farmacia", "Higiene", "Mochilas", "Passeio", "Roupas", "Segurança" }));

        jLabel9.setText("Valor Pago");

        deleteProdButton.setText("Deletar Produto");
        deleteProdButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteProdButtonActionPerformed(evt);
            }
        });

        jLabel11.setText("Valor de Venda");

        jLabel12.setText("Quantidade");

        qntSpinner.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        valorFormattedTextField.setText("0");

        vendaFormattedTextField.setText("0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6)
                            .addComponent(jLabel8)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel11)
                            .addComponent(jLabel9))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(sexoComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(sizeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(68, 68, 68)
                                    .addComponent(jLabel12)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(qntSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(storeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(departmentComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(descTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 440, Short.MAX_VALUE)
                                .addComponent(nameTextField))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(vendaFormattedTextField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
                                .addComponent(valorFormattedTextField, javax.swing.GroupLayout.Alignment.LEADING)))
                        .addContainerGap(124, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(idRemessaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(errorTextField)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(deleteProdButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(salvarRemessaButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cancelarButton)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(idRemessaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(descTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sizeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel12)
                    .addComponent(qntSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sexoComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(storeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(departmentComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(valorFormattedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(vendaFormattedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelarButton)
                    .addComponent(salvarRemessaButton)
                    .addComponent(deleteProdButton))
                .addGap(5, 5, 5)
                .addComponent(errorTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancelarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarButtonActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_cancelarButtonActionPerformed

    private void clearAllFields(){
        nameTextField.setText("");
        descTextField.setText("");
        departmentComboBox.setSelectedIndex(0);
        storeComboBox.setSelectedIndex(0);
        sexoComboBox.setSelectedIndex(0);
        sizeComboBox.setSelectedIndex(0);
        vendaFormattedTextField.setText("0.00");
        valorFormattedTextField.setText("0.00");
        qntSpinner.setValue(0);
    }
    private void deleteProdButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteProdButtonActionPerformed
       
        final JOptionPane optionPane = new JOptionPane(
        "Tem certeza que deseja deletar este produto?\n"
        + "Esta ação não pode ser desfeita.\n",
        JOptionPane.QUESTION_MESSAGE,
        JOptionPane.YES_NO_OPTION);
        optionPane.setVisible(true);
        
        Object[] options = {"Deletar Produto",
                    "Cancelar"};
        int n = JOptionPane.showOptionDialog(optionPane,
            "Tem certeza que deseja deletar este produto?\n"
        + "Esta ação não pode ser desfeita.\n",
            "Confirmação...",
            JOptionPane.YES_NO_OPTION,
            JOptionPane.QUESTION_MESSAGE,
            null,
            options,
            options[1]);
        if(n == 0){
            Estoque.allProdArray.remove(main.toDeleteIndex);
            this.dispose();
        }
    }//GEN-LAST:event_deleteProdButtonActionPerformed

    private void idRemessaTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idRemessaTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idRemessaTextFieldActionPerformed

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
    private void salvarRemessaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarRemessaButtonActionPerformed
        // TODO add your handling code here:
        try{
        String val = valorFormattedTextField.getText();
        String val2 = vendaFormattedTextField.getText();
        val = filterVal(val);
        val2 = filterVal(val2);
        main.productToEdit.nome = nameTextField.getText();
        main.productToEdit.desc = descTextField.getText();
        main.productToEdit.quantidade = (int) qntSpinner.getValue();
        main.productToEdit.tamanho = String.valueOf(sizeComboBox.getSelectedItem());
        main.productToEdit.sexo = String.valueOf(sexoComboBox.getSelectedItem());
        main.productToEdit.loja = String.valueOf(storeComboBox.getSelectedItem());
        main.productToEdit.dept = String.valueOf(departmentComboBox.getSelectedItem());
        main.productToEdit.valor.valor_item = Float.parseFloat(val);
        main.productToEdit.valor.valor_final = Float.parseFloat(val2);
               
        main.resultadoTable.clearSelection();
        float temp = 0.0f;
        for(produtos.produto p:Estoque.allProdArray){
            temp += (p.quantidade*p.valor.valor_final);
        }
        
        DecimalFormat df = new DecimalFormat("0.##"); 
        Estoque.allFinances.get(Estoque.allFinances.size()-1).valorProdutos = temp;
        this.dispose();
        }catch(Exception e){
            errorTextField.setText(String.valueOf(e));
        }
    }//GEN-LAST:event_salvarRemessaButtonActionPerformed

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
            java.util.logging.Logger.getLogger(remessa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(remessa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(remessa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(remessa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new remessa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelarButton;
    private javax.swing.JButton deleteProdButton;
    private javax.swing.JComboBox<String> departmentComboBox;
    private javax.swing.JTextField descTextField;
    private javax.swing.JTextField errorTextField;
    public static javax.swing.JTextField idRemessaTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JSpinner qntSpinner;
    private javax.swing.JButton salvarRemessaButton;
    private javax.swing.JComboBox<String> sexoComboBox;
    private javax.swing.JComboBox<String> sizeComboBox;
    private javax.swing.JComboBox<String> storeComboBox;
    private javax.swing.JTextField valorFormattedTextField;
    private javax.swing.JTextField vendaFormattedTextField;
    // End of variables declaration//GEN-END:variables
}