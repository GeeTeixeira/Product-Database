
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
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
public class finalizarCompra extends javax.swing.JFrame {
    public static produtos.produto prod;
    public static int row;
    boolean metodo = false;
    public static float dinheiro;
    public static float card;
    DecimalFormat df = new DecimalFormat("#.##");
    finances f = new finances();
    DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
    Date d = new Date();
    float taxa = 12.0f;
    
    /**
     * Creates new form finalizarCompra
     */
    public void init2(){
        dateTextField.setText(String.valueOf(dateFormat.format(d)));
        Object [][] temp = new Object[realizarVenda.compra.size()][9];
            finalPurchaseTable.setModel(new javax.swing.table.DefaultTableModel(
            temp,
            new String [] {
                "Pct#", "Nome", "Descrição", "Tamanho", "Valor", "Qntd", "Gênero", "Departamento", "Loja"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        finalPurchaseTable.setToolTipText("Pacote, Nome, Descrição, Tamanho, Valor, Quantidade, Gênero, Departamento, Loja");
        finalPurchaseTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(finalPurchaseTable);
        if (finalPurchaseTable.getColumnModel().getColumnCount() > 0) {
            finalPurchaseTable.getColumnModel().getColumn(0).setPreferredWidth(35);
            finalPurchaseTable.getColumnModel().getColumn(0).setMaxWidth(35);
            finalPurchaseTable.getColumnModel().getColumn(3).setPreferredWidth(45);
            finalPurchaseTable.getColumnModel().getColumn(3).setMaxWidth(45);
            finalPurchaseTable.getColumnModel().getColumn(4).setPreferredWidth(75);
            finalPurchaseTable.getColumnModel().getColumn(4).setMaxWidth(95);
            finalPurchaseTable.getColumnModel().getColumn(5).setPreferredWidth(45);
            finalPurchaseTable.getColumnModel().getColumn(5).setMaxWidth(45);
            finalPurchaseTable.getColumnModel().getColumn(6).setPreferredWidth(50);
            finalPurchaseTable.getColumnModel().getColumn(6).setMaxWidth(50);
            finalPurchaseTable.getColumnModel().getColumn(7).setPreferredWidth(70);
            finalPurchaseTable.getColumnModel().getColumn(7).setMaxWidth(70);
            finalPurchaseTable.getColumnModel().getColumn(8).setPreferredWidth(60);
            finalPurchaseTable.getColumnModel().getColumn(8).setMaxWidth(60);
        }
        for(int row = 0, col = 1;row<realizarVenda.compra.size();row++){
            finalPurchaseTable.setValueAt(realizarVenda.compra.get(row).remessa, row, 0);
            finalPurchaseTable.setValueAt(realizarVenda.compra.get(row).nome, row, col);
            finalPurchaseTable.setValueAt(realizarVenda.compra.get(row).desc, row, col+1);
            finalPurchaseTable.setValueAt(realizarVenda.compra.get(row).tamanho, row, col+2);
            finalPurchaseTable.setValueAt(realizarVenda.compra.get(row).valor.valor_final, row, col+ 3);
            finalPurchaseTable.setValueAt(realizarVenda.compra.get(row).quantidade, row, col+4);
            finalPurchaseTable.setValueAt(realizarVenda.compra.get(row).sexo, row, col+5);
            finalPurchaseTable.setValueAt(realizarVenda.compra.get(row).dept, row, col+6);
            finalPurchaseTable.setValueAt(realizarVenda.compra.get(row).loja, row, col+7);
        }
        percentLabel.setText(String.valueOf(taxa)+"%");
    }
    public void clearTable(){
        for(int row = 0;row<finalPurchaseTable.getRowCount();row++){
            finalPurchaseTable.setValueAt("", row, 0);
            finalPurchaseTable.setValueAt("", row, 1);
            finalPurchaseTable.setValueAt("", row, 2);
            finalPurchaseTable.setValueAt("", row, 3);
            finalPurchaseTable.setValueAt("", row, 4);
            finalPurchaseTable.setValueAt("", row, 5);
            finalPurchaseTable.setValueAt("", row, 6);
            finalPurchaseTable.setValueAt("", row, 7);
            finalPurchaseTable.setValueAt("", row, 8);
        }
    }
    public finalizarCompra() {
        initComponents();
        init2();
        finances.compra newCompra = f.new compra();
        for(produtos.produto p:realizarVenda.compra){
            newCompra.valorTotal+=(p.quantidade*p.valor.valor_final);
        }
        dinheiro = newCompra.valorTotal;
        card = (float) (newCompra.valorTotal+(newCompra.valorTotal*0.12));
        compraFinalFormattedTextField.setText(String.valueOf(df.format(newCompra.valorTotal)));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        compraDinheiroRadioButton = new javax.swing.JRadioButton();
        compraCardRadioButton = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        clientNomeTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        finalPurchaseTable = new javax.swing.JTable();
        editButton = new javax.swing.JButton();
        removeProdButton = new javax.swing.JButton();
        cancelarButton = new javax.swing.JButton();
        finalizarButton = new javax.swing.JButton();
        valorInfoButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        dateTextField = new javax.swing.JTextField();
        compraFinalFormattedTextField = new javax.swing.JTextField();
        errorTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        percentLabel = new javax.swing.JLabel();
        changePercentButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Carrinho");

        jLabel1.setText("Metodo de Pagamento");

        compraDinheiroRadioButton.setSelected(true);
        compraDinheiroRadioButton.setText("Dinheiro");
        compraDinheiroRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                compraDinheiroRadioButtonActionPerformed(evt);
            }
        });

        compraCardRadioButton.setText("Cartão");
        compraCardRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                compraCardRadioButtonActionPerformed(evt);
            }
        });

        jLabel2.setText("Nome do(a) Cliente");

        jLabel3.setText("Valor Total da Compra");

        finalPurchaseTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7", "Title 8", "Title 9"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(finalPurchaseTable);

        editButton.setText("Editar Produto");
        editButton.setToolTipText("Clique neste botão para alterar valor do produto ou quantidade.");
        editButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editButtonActionPerformed(evt);
            }
        });

        removeProdButton.setText("Remover Produto");
        removeProdButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeProdButtonActionPerformed(evt);
            }
        });

        cancelarButton.setText("Cancelar");
        cancelarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarButtonActionPerformed(evt);
            }
        });

        finalizarButton.setText("Finalizar Venda");
        finalizarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finalizarButtonActionPerformed(evt);
            }
        });

        valorInfoButton.setText("<html><center>Informação de<br />Preços</center></html>");
        valorInfoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valorInfoButtonActionPerformed(evt);
            }
        });

        jLabel4.setText("Data");

        errorTextField.setEditable(false);

        jLabel5.setText("Taxa Atual do Cartão:");

        percentLabel.setText(" ");

        changePercentButton.setText("Alterar Taxa de Cartão");
        changePercentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changePercentButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 746, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(compraFinalFormattedTextField))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel4))
                                    .addGap(32, 32, 32)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(clientNomeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(dateTextField)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(finalizarButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(removeProdButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(editButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(valorInfoButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cancelarButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(changePercentButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(32, 32, 32)
                        .addComponent(compraDinheiroRadioButton)
                        .addGap(29, 29, 29)
                        .addComponent(compraCardRadioButton)
                        .addGap(87, 87, 87)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(percentLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(errorTextField)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(compraDinheiroRadioButton)
                    .addComponent(compraCardRadioButton)
                    .addComponent(jLabel5)
                    .addComponent(percentLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(clientNomeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(dateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(compraFinalFormattedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(valorInfoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(changePercentButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(editButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(removeProdButton, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(finalizarButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cancelarButton))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(errorTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void editButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButtonActionPerformed
        // TODO add your handling code here:
        try{
        row = finalPurchaseTable.getSelectedRow();
        prod = realizarVenda.compra.get(finalPurchaseTable.getSelectedRow());
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new alterarProdVendaIndividual().setVisible(true);
            }
        });
        }catch(Exception e){
            errorTextField.setText(String.valueOf(e));
        }
    }//GEN-LAST:event_editButtonActionPerformed

    private void removeProdButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeProdButtonActionPerformed
        // TODO add your handling code here:
        row = finalPurchaseTable.getSelectedRow();
        realizarVenda.compra.remove(row);
        clearTable();
        init2();
        float totalValor = 0.0f;
        for(produtos.produto p : realizarVenda.compra){
            totalValor+=(p.quantidade*p.valor.valor_final);
        }
        dinheiro = totalValor;
        card = totalValor*((taxa+100)/100);
        if(compraDinheiroRadioButton.isSelected()){
            finalizarCompra.compraFinalFormattedTextField.setText(String.valueOf(df.format(dinheiro)));
        }
        else{
            finalizarCompra.compraFinalFormattedTextField.setText(String.valueOf(df.format(card)));
        }
        errorTextField.setText(String.valueOf(realizarVenda.compra.size()));
    }//GEN-LAST:event_removeProdButtonActionPerformed

    private void cancelarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarButtonActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_cancelarButtonActionPerformed

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
    private void finalizarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finalizarButtonActionPerformed
        // TODO add your handling code here:
        try{
            String val = compraFinalFormattedTextField.getText();
            val = filterVal(val);
            String nome = clientNomeTextField.getText();
            String date = dateTextField.getText();
            float total = Float.parseFloat(val);
            finances.compra currCompra = f.new compra(nome,total,metodo,date);
            currCompra.prod.addAll(realizarVenda.compra);
            Estoque.allFinances.get(Estoque.allFinances.size()-1).vendas.add(currCompra);
            Estoque.allFinances.get(Estoque.allFinances.size()-1).valorBruto += currCompra.valorTotal;
            for(produtos.produto p: currCompra.prod){
                for(produtos.produto p2:Estoque.allProdArray){
                    if(p.nome.equals(p2.nome)){
                        p2.quantidade -= p.quantidade;
                    }
                }
            }
            realizarVenda.compra.clear();
            float temp = 0.0f;
            for(produtos.produto p:Estoque.allProdArray){
                temp += (p.quantidade*p.valor.valor_final);
            }
            Estoque.allFinances.get(Estoque.allFinances.size()-1).valorProdutos = temp;
            this.dispose();
        }catch(Exception e){
            errorTextField.setText(String.valueOf(e));
        }
    }//GEN-LAST:event_finalizarButtonActionPerformed

    private void compraDinheiroRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_compraDinheiroRadioButtonActionPerformed
        // TODO add your handling code here:
        if(compraCardRadioButton.isSelected()){
            compraCardRadioButton.setSelected(false);
        }
        compraDinheiroRadioButton.setSelected(true);
        
        metodo = false;
        compraFinalFormattedTextField.setText(String.valueOf(df.format(dinheiro)));
    }//GEN-LAST:event_compraDinheiroRadioButtonActionPerformed
    
    private void compraCardRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_compraCardRadioButtonActionPerformed
        // TODO add your handling code here:
        
        if(compraDinheiroRadioButton.isSelected()){
            compraDinheiroRadioButton.setSelected(false);
        }
        compraCardRadioButton.setSelected(true);
        
        metodo = true;
        compraFinalFormattedTextField.setText(String.valueOf(df.format(card)));
    }//GEN-LAST:event_compraCardRadioButtonActionPerformed

    private void valorInfoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valorInfoButtonActionPerformed
        // TODO add your handling code here:
        produtos.produto productToEdit = null;
        String prodName = String.valueOf(finalPurchaseTable.getValueAt(finalPurchaseTable.getSelectedRow(),1));
        for(produtos.produto p: realizarVenda.compra){
            if(prodName.equals(p.nome)){
                productToEdit = p;
                break;
            }
        }
        String nome = productToEdit.nome;
        float item = productToEdit.valor.valor_item; // em dolares mostrar valor_item
        float valFinal = productToEdit.valor.valor_final; // em dolares mostrar valor_item
        float lucro = productToEdit.valor.lucro; //mostrar os 80% de lucro
        float imposto = productToEdit.valor.imposto; // valor pago de imposto
        float transporte = productToEdit.valor.transporte; // valor pago em transporte
        float valReal = productToEdit.valor.valor_item_real; // valor final
        float valCard = (float)(valFinal+valFinal*0.12);
        
       
        final JOptionPane optionPane = new JOptionPane(
        "Valor pago em dolar: $"+df.format(item)
        + "\nValor pago em transporte: R$"+df.format(transporte)
        + "\nValor pago em imposto: R$"+df.format(imposto)
        + "\nCusto 0: R$"+df.format(lucro)
        + "\nValor final do produto: R$"+df.format(valFinal),
        JOptionPane.QUESTION_MESSAGE,
        JOptionPane.YES_NO_OPTION);
        optionPane.setVisible(true);
        
        Object[] options = {"Fechar"};
        int n = JOptionPane.showOptionDialog(optionPane,
            "Valor pago em dolar: $"+df.format(item)
        + "\nValor pago em real: R$"+df.format(valReal)
        + "\nValor pago em transporte: R$"+df.format(transporte)
        + "\nValor pago em imposto: R$"+df.format(imposto)
        + "\nCusto 0: R$"+df.format(lucro)
        + "\nValor final do produto em dinheiro: R$"+df.format(valFinal)
        +"\nValor final do produto no cartão (+12%): R$"+df.format(valCard),
            "Valores: " +nome,
            JOptionPane.YES_NO_OPTION,
            JOptionPane.QUESTION_MESSAGE,
            null,
            options,
            options[0]);
    }//GEN-LAST:event_valorInfoButtonActionPerformed

    private void changePercentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changePercentButtonActionPerformed
        // TODO add your handling code here:
        final JOptionPane optionPane = new JOptionPane();
        
        Object[] options = {"Fechar","Confirmar"};
        String s = (String)JOptionPane.showInputDialog(
                    optionPane,
                    "Taxa Atual do Cartão: "+taxa+"%.\n"
                    +"Entre nova porcentagem: ",
                    "Alterar Taxa do Cartão",
                    JOptionPane.PLAIN_MESSAGE,
                    null,
                    null,
                    null);
        if(s != null){
            s = filterVal(s);
            taxa = Float.parseFloat(s);
            percentLabel.setText(String.valueOf(taxa)+"%");
            card = dinheiro*((taxa+100)/100);
        }
        if(compraCardRadioButton.isSelected()){
            compraFinalFormattedTextField.setText(String.valueOf(df.format(card)));
        }
    }//GEN-LAST:event_changePercentButtonActionPerformed

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
            java.util.logging.Logger.getLogger(finalizarCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(finalizarCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(finalizarCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(finalizarCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new finalizarCompra().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton cancelarButton;
    private javax.swing.JButton changePercentButton;
    private javax.swing.JTextField clientNomeTextField;
    public static javax.swing.JRadioButton compraCardRadioButton;
    public static javax.swing.JRadioButton compraDinheiroRadioButton;
    public static javax.swing.JTextField compraFinalFormattedTextField;
    private javax.swing.JTextField dateTextField;
    private javax.swing.JButton editButton;
    private javax.swing.JTextField errorTextField;
    public static javax.swing.JTable finalPurchaseTable;
    private javax.swing.JButton finalizarButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel percentLabel;
    private javax.swing.JButton removeProdButton;
    private javax.swing.JButton valorInfoButton;
    // End of variables declaration//GEN-END:variables
}
