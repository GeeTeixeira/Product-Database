
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
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
public class mesesPassados extends javax.swing.JFrame {
    DecimalFormat df = new DecimalFormat("0.##"); 
    DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
    Date d = new Date();
    /**
     * Creates new form mesesPassados
     */
    public mesesPassados() {
        initComponents();
        ArrayList<finances.atual> displayCustos = Estoque.allFinances;
        Object [][] temp = new Object[displayCustos.size()][4];
        mesesTable.setModel(new javax.swing.table.DefaultTableModel(
            temp,
            new String [] {
                "Datas", "Total de Vendas", "Pro-Labore", "Total de Despesas"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        
        for(int row = 0;row<displayCustos.size();row++){
            mesesTable.setValueAt(displayCustos.get(row).start+" - "+displayCustos.get(row).end, row, 0);
            mesesTable.setValueAt(displayCustos.get(row).valorBruto, row, 1);
            mesesTable.setValueAt(displayCustos.get(row).prolabore, row, 2);
            mesesTable.setValueAt(displayCustos.get(row).valorCustos, row, 3);
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

        jLayeredPane1 = new javax.swing.JLayeredPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        mesesTable = new javax.swing.JTable();
        exportarButton = new javax.swing.JButton();
        detalhesButton = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        errorTextField = new javax.swing.JTextField();
        mesSepcificoButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Finanças de Meses Passados");

        jLayeredPane1.setBorder(javax.swing.BorderFactory.createTitledBorder("Meses Passados"));

        mesesTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Datas", "Total de Vendas", "Pro-Labore", "Despesas"
            }
        ));
        jScrollPane1.setViewportView(mesesTable);

        jLayeredPane1.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        exportarButton.setText("<html><center>Exportar<br />Planilha</center></html>");
        exportarButton.setMaximumSize(new java.awt.Dimension(100, 45));
        exportarButton.setMinimumSize(new java.awt.Dimension(100, 45));
        exportarButton.setPreferredSize(new java.awt.Dimension(100, 45));
        exportarButton.setSize(new java.awt.Dimension(100, 45));
        exportarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exportarButtonActionPerformed(evt);
            }
        });

        detalhesButton.setText("<html><center>Abrir Detalhes<br />Deste Mês</center></html>");
        detalhesButton.setMaximumSize(new java.awt.Dimension(100, 45));
        detalhesButton.setMinimumSize(new java.awt.Dimension(100, 45));
        detalhesButton.setPreferredSize(new java.awt.Dimension(100, 45));
        detalhesButton.setSize(new java.awt.Dimension(100, 45));

        jButton3.setText("Fechar Janela");
        jButton3.setMaximumSize(new java.awt.Dimension(130, 45));
        jButton3.setMinimumSize(new java.awt.Dimension(130, 45));
        jButton3.setPreferredSize(new java.awt.Dimension(130, 45));
        jButton3.setSize(new java.awt.Dimension(130, 45));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        errorTextField.setEditable(false);
        errorTextField.setToolTipText("");

        mesSepcificoButton.setText("<html><center>Exportar Mês<br />Específico </center></html>");
        mesSepcificoButton.setMaximumSize(new java.awt.Dimension(130, 45));
        mesSepcificoButton.setMinimumSize(new java.awt.Dimension(130, 45));
        mesSepcificoButton.setPreferredSize(new java.awt.Dimension(130, 45));
        mesSepcificoButton.setSize(new java.awt.Dimension(130, 45));
        mesSepcificoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mesSepcificoButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLayeredPane1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(detalhesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(exportarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mesSepcificoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(errorTextField))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mesSepcificoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(exportarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(detalhesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(errorTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void exportarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exportarButtonActionPerformed
        // TODO add your handling code here:
        String[] headerGeral = {"Mês","Pró-labore","Total de Vendas", "Total de Despesas"};
        try{
            System.setProperty("file.encoding","UTF-8");
            BufferedWriter csvWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("Planilha de Finanças Mensais.csv", true), StandardCharsets.UTF_8));
            for(String s: headerGeral){
                csvWriter.append(s);
                csvWriter.append(",");
            }
            csvWriter.append("\n");
            for(finances.atual fA: Estoque.allFinances){
                csvWriter.append(fA.start+" - "+fA.end);
                csvWriter.append(",");
                csvWriter.append("R$ "+String.valueOf(fA.prolabore));
                csvWriter.append(",");
                csvWriter.append("R$ "+String.valueOf(fA.valorProdutos));
                csvWriter.append(",");
                csvWriter.append("R$ "+String.valueOf(fA.valorCustos));
                csvWriter.append("\n");
            }
            csvWriter.close();
        }
        catch(Exception e){
            errorTextField.setText(String.valueOf(e));
        }
    }//GEN-LAST:event_exportarButtonActionPerformed

    private void exportingCSV(finances.atual temp){
        String date = temp.start;
        float pro = temp.prolabore;
        float vendas = temp.valorBruto;
        float gastos = temp.valorCustos;
        String[] headerGeral = {"Mês","Pró-labore","Total de Vendas", "Total de Despesas"};
        String[] headerVendas = {"Cliente","Data","Valor"};
        String[] headerVendasDetails = {"Cliente","Produto", "Descrição", "Gênero", "Valor", "Quantidade"};
        String[] headerDespesas = {"Data","Despesa", "Valor"};
        String startDate, endDate;
        startDate = date.replace("/", "-");
        endDate = temp.end.replace("/", "-");
        date = startDate+" - "+endDate;
        String name = "Mês "+startDate+" - "+endDate+".csv";
        try{
            System.setProperty("file.encoding","UTF-8");
            BufferedWriter csvWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(name, true), StandardCharsets.UTF_8));
            //FileWriter csvWriter = new FileWriter("Informação Financeira deste Mês.csv");
            
            csvWriter.append("Informação Geral do Mês:");
            csvWriter.append("\n");
            csvWriter.append("\n");
            for(String s: headerGeral){
                csvWriter.append(s);
                csvWriter.append(",");
            }
            csvWriter.append("\n");
            csvWriter.append(date);
            csvWriter.append(",");
            csvWriter.append(String.valueOf(pro));
            csvWriter.append(",");
            csvWriter.append(String.valueOf(vendas));
            csvWriter.append(",");
            csvWriter.append(String.valueOf(gastos));
            
            csvWriter.append("\n");
            csvWriter.append("\n");
            csvWriter.append("Informação de Geral de Vendas");
            csvWriter.append("\n");
            csvWriter.append("\n");
            ArrayList<finances.compra> tempVendas = temp.vendas;
            
            for(String s: headerVendas){
                csvWriter.append(s);
                csvWriter.append(",");
            }
            csvWriter.append("\n");
            for(finances.compra c:tempVendas){
                csvWriter.append(c.nomeClient);
                csvWriter.append(",");
                csvWriter.append(c.data);
                csvWriter.append(",");
                csvWriter.append(String.valueOf(c.valorTotal));
                csvWriter.append("\n");
            }
            csvWriter.append("\n");
            csvWriter.append("\n");
            csvWriter.append("Detalhes de Vendas");
            csvWriter.append("\n");
            csvWriter.append("\n");
            
            //{"Cliente","Produto", "Descrição", "Gênero", "Valor", "Quantidade"};
            for(String s: headerVendasDetails){
                csvWriter.append(s);
                csvWriter.append(",");
            }
            csvWriter.append("\n");
            for(finances.compra c:tempVendas){
                for(produtos.produto p:c.prod){
                    csvWriter.append(c.nomeClient);
                    csvWriter.append(",");
                    csvWriter.append(p.nome);
                    csvWriter.append(",");
                    csvWriter.append(p.desc);
                    csvWriter.append(",");
                    csvWriter.append(p.sexo);
                    csvWriter.append(",");
                    csvWriter.append(String.valueOf(p.valor.valor_final));
                    csvWriter.append(",");
                    csvWriter.append(String.valueOf(p.quantidade));
                    csvWriter.append("\n");
                }
            }
            
            csvWriter.append("\n");
            csvWriter.append("\n");
            csvWriter.append("Detalhes de Despesas");
            //{"Data","Despesa", "Valor"};
            csvWriter.append("\n");
            csvWriter.append("\n");
            for(String s: headerDespesas){
                csvWriter.append(s);
                csvWriter.append(",");
            }
            csvWriter.append("\n");
            for(finances.custoItems cI:temp.custos){
                csvWriter.append(cI.data);
                csvWriter.append(",");
                csvWriter.append(cI.nome);
                csvWriter.append(",");
                csvWriter.append(String.valueOf(cI.valor));
                csvWriter.append("\n");
            }
            csvWriter.close();
            
        }catch(Exception e){
            errorTextField.setText(String.valueOf(e));
        }
    }
    private void mesSepcificoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mesSepcificoButtonActionPerformed
        // TODO add your handling code here:
        Object[] possibilities = new Object[Estoque.allFinances.size()];
        int i = 0;
        for(finances.atual fA : Estoque.allFinances){
            possibilities[i] = fA.start+" - "+fA.end;
            i++;
        }
        JOptionPane frame = new JOptionPane();
        String s = (String)JOptionPane.showInputDialog(
                    frame,
                    "Selecione o mês desejado:\n",
                    "Exportar Planilha do Seguinte Mês",
                    JOptionPane.PLAIN_MESSAGE,
                    null,
                    possibilities,
                    "ham");
        try{
        String s2 = s.substring(0,10);
        finances.atual temp = null;
        for(finances.atual fA:Estoque.allFinances){
            if(fA.start.equals(s2)){
                temp = fA;
                break;
            }
        }
        exportingCSV(temp);
        }catch(Exception e){
            errorTextField.setText("Favor selecionar mês para exportar.");
        }
    }//GEN-LAST:event_mesSepcificoButtonActionPerformed

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
            java.util.logging.Logger.getLogger(mesesPassados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mesesPassados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mesesPassados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mesesPassados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mesesPassados().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton detalhesButton;
    private javax.swing.JTextField errorTextField;
    private javax.swing.JButton exportarButton;
    private javax.swing.JButton jButton3;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton mesSepcificoButton;
    private javax.swing.JTable mesesTable;
    // End of variables declaration//GEN-END:variables
}
