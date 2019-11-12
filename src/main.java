
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.ArrayList;
import javafx.scene.control.ComboBox;
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
public class main extends javax.swing.JFrame implements Serializable{
    public static ArrayList<produtos.produto> display;
    public static produtos.produto productToEdit;
    public static int remVal;
    public static int totalPacotes = 0;
    public static boolean zeroQ = true; //true para mostrar e false para ocultar
    /**
     * Creates new form main
     */
   

    //listaEstoque = new JTable(header, header);
    public main() {
        initComponents();
        
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
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        dptComboBox = new javax.swing.JComboBox<>();
        closeButton = new javax.swing.JButton();
        pesquisaBtn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        tamanhoComboBox = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        descTextField = new javax.swing.JTextField();
        nomeTextField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        sexoComboBox = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        pacoteSpinner = new javax.swing.JSpinner();
        ocultarRadioButton = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        resultadoTable = new javax.swing.JTable();
        accessItemButton = new javax.swing.JButton();
        ErrorMessageTextField = new javax.swing.JTextField();
        venderButton = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Estoque");

        jLabel1.setText("Nome do Produto");

        jLabel2.setText("Departamento");

        jLabel3.setText("Gênero");

        dptComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos", "Acessesórios", "Alimentação", "Brinquedos", "Eletrônicos", "Farmacia", "Higiene", "Mochilas", "Passeio", "Roupas", "Segurança", " " }));
        dptComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dptComboBoxActionPerformed(evt);
            }
        });

        closeButton.setText("Fechar");
        closeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeButtonActionPerformed(evt);
            }
        });

        pesquisaBtn.setText("Procurar");
        pesquisaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesquisaBtnActionPerformed(evt);
            }
        });

        jLabel4.setText("Tamanho");

        tamanhoComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos", "RN", "3M", "6M", "9M", "12M", "18M", "24M", "2T", "3T", "4T", "5T", "10T", "11T", "12T", "13T", "14T" }));
        tamanhoComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tamanhoComboBoxActionPerformed(evt);
            }
        });

        jLabel5.setText("Descrição");

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel6.setText("Estoque");

        jButton2.setText("Calculadora");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        sexoComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos", "Neutro", "Menino", "Menina" }));

        jLabel7.setText("Selecionar Pacote");

        pacoteSpinner.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        pacoteSpinner.setToolTipText("Deixe numero zero para procurar todos os pacotes");

        ocultarRadioButton.setText("Ocultar Produtos Fora de Estoque");
        ocultarRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ocultarRadioButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(38, 38, 38)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(sexoComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(dptComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 634, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(tamanhoComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(pesquisaBtn)
                                .addGap(5, 5, 5)
                                .addComponent(closeButton))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel5))
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(descTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                            .addComponent(nomeTextField))
                        .addGap(94, 94, 94)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(pacoteSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(ocultarRadioButton))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(8, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(nomeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(pacoteSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(descTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ocultarRadioButton))
                                .addGap(10, 10, 10))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(15, 15, 15)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(sexoComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(dptComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(tamanhoComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(closeButton)
                        .addComponent(pesquisaBtn))))
        );

        resultadoTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
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
        resultadoTable.setToolTipText("Pacote, Nome, Descrição, Tamanho, Valor, Quantidade, Gênero, Departamento, Loja");
        resultadoTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(resultadoTable);
        if (resultadoTable.getColumnModel().getColumnCount() > 0) {
            resultadoTable.getColumnModel().getColumn(0).setPreferredWidth(35);
            resultadoTable.getColumnModel().getColumn(0).setMaxWidth(35);
            resultadoTable.getColumnModel().getColumn(3).setPreferredWidth(45);
            resultadoTable.getColumnModel().getColumn(3).setMaxWidth(45);
            resultadoTable.getColumnModel().getColumn(4).setPreferredWidth(75);
            resultadoTable.getColumnModel().getColumn(4).setMaxWidth(95);
            resultadoTable.getColumnModel().getColumn(5).setPreferredWidth(45);
            resultadoTable.getColumnModel().getColumn(5).setMaxWidth(45);
            resultadoTable.getColumnModel().getColumn(6).setPreferredWidth(50);
            resultadoTable.getColumnModel().getColumn(6).setMaxWidth(50);
            resultadoTable.getColumnModel().getColumn(7).setPreferredWidth(70);
            resultadoTable.getColumnModel().getColumn(7).setMaxWidth(70);
            resultadoTable.getColumnModel().getColumn(8).setPreferredWidth(60);
            resultadoTable.getColumnModel().getColumn(8).setMaxWidth(60);
        }

        accessItemButton.setText("Accessar Item");
        accessItemButton.setToolTipText("Editar produto selecionado");
        accessItemButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accessItemButtonActionPerformed(evt);
            }
        });

        ErrorMessageTextField.setEditable(false);
        ErrorMessageTextField.setSize(new java.awt.Dimension(800, 25));

        venderButton.setText("Realizar Venda");
        venderButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                venderButtonActionPerformed(evt);
            }
        });

        jButton3.setText("<html><center>Informação de<br />Preços</center></html>");
        jButton3.setToolTipText("Informação do valor total do produto.");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(ErrorMessageTextField))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(venderButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(accessItemButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addGap(10, 10, 10))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(accessItemButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(venderButton))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addComponent(ErrorMessageTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void clearTable(){
        for(int row = 0;row<resultadoTable.getRowCount();row++){
            resultadoTable.setValueAt("", row, 0);
            resultadoTable.setValueAt("", row, 1);
            resultadoTable.setValueAt("", row, 2);
            resultadoTable.setValueAt("", row, 3);
            resultadoTable.setValueAt("", row, 4);
            resultadoTable.setValueAt("", row, 5);
            resultadoTable.setValueAt("", row, 6);
            resultadoTable.setValueAt("", row, 7);
            resultadoTable.setValueAt("", row, 8);
        }
    }
    private void pesquisaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesquisaBtnActionPerformed
        // TODO add your handling code here:
        try{
        clearTable();
        ErrorMessageTextField.setText("");
        display = new ArrayList<>();
        String gender =  sexoComboBox.getItemAt(sexoComboBox.getSelectedIndex());
        String nome = String.valueOf(nomeTextField.getText());
        String desc = String.valueOf(descTextField.getText());
        String dpt = dptComboBox.getItemAt(dptComboBox.getSelectedIndex());
        String size = tamanhoComboBox.getItemAt(tamanhoComboBox.getSelectedIndex());
        int pck = (int) pacoteSpinner.getValue();
        
        for(produtos.produto temp:Estoque.allProdArray){
            if(temp.nome.toLowerCase().contains(nome.toLowerCase()) || nome.length() == 0){
                if(temp.desc.toLowerCase().contains(desc.toLowerCase()) || desc.length() == 0){
                    if(temp.dept.equals(dpt) || dpt.equals("Todos")){
                        if(temp.sexo.toLowerCase().equals(gender.toLowerCase()) || gender.equals("Todos")){
                            if(size.equals("Todos") || size.equals(temp.tamanho)){
                                if(pck == 0 || temp.remessa == pck){
                                    if(zeroQ || (!zeroQ && temp.quantidade > 0)){
                                        display.add(temp);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if(display.size() == 0){
            ErrorMessageTextField.setText("Nenhum produto foi encontrado nesta pesquisa.");
        }
        else{
            Object [][] temp = new Object[display.size()][9];
            resultadoTable.setModel(new javax.swing.table.DefaultTableModel(
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
        resultadoTable.setToolTipText("Pacote, Nome, Descrição, Tamanho, Valor, Quantidade, Gênero, Departamento, Loja");
        resultadoTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(resultadoTable);
        if (resultadoTable.getColumnModel().getColumnCount() > 0) {
            resultadoTable.getColumnModel().getColumn(0).setPreferredWidth(35);
            resultadoTable.getColumnModel().getColumn(0).setMaxWidth(35);
            resultadoTable.getColumnModel().getColumn(3).setPreferredWidth(45);
            resultadoTable.getColumnModel().getColumn(3).setMaxWidth(45);
            resultadoTable.getColumnModel().getColumn(4).setPreferredWidth(75);
            resultadoTable.getColumnModel().getColumn(4).setMaxWidth(95);
            resultadoTable.getColumnModel().getColumn(5).setPreferredWidth(45);
            resultadoTable.getColumnModel().getColumn(5).setMaxWidth(45);
            resultadoTable.getColumnModel().getColumn(6).setPreferredWidth(50);
            resultadoTable.getColumnModel().getColumn(6).setMaxWidth(50);
            resultadoTable.getColumnModel().getColumn(7).setPreferredWidth(70);
            resultadoTable.getColumnModel().getColumn(7).setMaxWidth(70);
            resultadoTable.getColumnModel().getColumn(8).setPreferredWidth(60);
            resultadoTable.getColumnModel().getColumn(8).setMaxWidth(60);
        }
            for(int row = 0, col = 1;row<display.size();row++){
                resultadoTable.setValueAt(display.get(row).remessa, row, 0);
                resultadoTable.setValueAt(display.get(row).nome, row, col);
                resultadoTable.setValueAt(display.get(row).desc, row, col+1);
                resultadoTable.setValueAt(display.get(row).tamanho, row, col+2);
                resultadoTable.setValueAt(display.get(row).valor.valor_final, row, col+ 3);
                resultadoTable.setValueAt(display.get(row).quantidade, row, col+4);
                resultadoTable.setValueAt(display.get(row).sexo, row, col+5);
                resultadoTable.setValueAt(display.get(row).dept, row, col+6);
                resultadoTable.setValueAt(display.get(row).loja, row, col+7);
            }
        }
        }catch(Exception e){
            
            ErrorMessageTextField.setText(String.valueOf(String.valueOf(e)));
        }
        
    }//GEN-LAST:event_pesquisaBtnActionPerformed

    private void closeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeButtonActionPerformed
        // TODO add your handling code here:

        this.dispose();
    }//GEN-LAST:event_closeButtonActionPerformed

    private void dptComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dptComboBoxActionPerformed
        // TODO add your handling code here:
        //jComboBox1.getSelectedItem();
    }//GEN-LAST:event_dptComboBoxActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String[] temp = {"a","b"};
        calculator.main(temp);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void tamanhoComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tamanhoComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tamanhoComboBoxActionPerformed
    public static int toDeleteIndex;
    private void accessItemButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accessItemButtonActionPerformed
        // GET selected item in table
        try{
        String prodName = String.valueOf(resultadoTable.getValueAt(resultadoTable.getSelectedRow(),1));
        remVal = (int)resultadoTable.getValueAt(resultadoTable.getSelectedRow(),0);
        
        for(toDeleteIndex = 0;toDeleteIndex<Estoque.allProdArray.size();toDeleteIndex++){
            if(Estoque.allProdArray.get(toDeleteIndex).remessa == remVal && Estoque.allProdArray.get(toDeleteIndex).nome.equals(prodName)){
                productToEdit = Estoque.allProdArray.get(toDeleteIndex);
                break;
            }
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new editarItem().setVisible(true);
            }
        });
        }catch(Exception e){
            
            ErrorMessageTextField.setText(String.valueOf(String.valueOf(e)));
        }
    }//GEN-LAST:event_accessItemButtonActionPerformed

    private void venderButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_venderButtonActionPerformed
        // TODO add your handling code here:
        try{
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new realizarVenda().setVisible(true);
            }
        });
        }catch(Exception e){
            
            ErrorMessageTextField.setText(String.valueOf(String.valueOf(e)));
        }
    }//GEN-LAST:event_venderButtonActionPerformed

   
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        DecimalFormat df = new DecimalFormat("#.##");
        String prodName = String.valueOf(resultadoTable.getValueAt(resultadoTable.getSelectedRow(),1));
        remVal = (int)resultadoTable.getValueAt(resultadoTable.getSelectedRow(),0);
        
        for(toDeleteIndex = 0;toDeleteIndex<Estoque.allProdArray.size();toDeleteIndex++){
            if(Estoque.allProdArray.get(toDeleteIndex).remessa == remVal && Estoque.allProdArray.get(toDeleteIndex).nome.equals(prodName)){
                productToEdit = Estoque.allProdArray.get(toDeleteIndex);
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
    }//GEN-LAST:event_jButton3ActionPerformed

    private void ocultarRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ocultarRadioButtonActionPerformed
        // TODO add your handling code here:
        if(ocultarRadioButton.isSelected()){
            //ocultarRadioButton.setSelected(true);
            zeroQ = false;
        }
        else{
            //ocultarRadioButton.setSelected(true);
            zeroQ = true;
        }
    }//GEN-LAST:event_ocultarRadioButtonActionPerformed

    
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
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ErrorMessageTextField;
    public static javax.swing.JButton accessItemButton;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton closeButton;
    private javax.swing.JTextField descTextField;
    private javax.swing.JComboBox<String> dptComboBox;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nomeTextField;
    private javax.swing.JRadioButton ocultarRadioButton;
    private javax.swing.JSpinner pacoteSpinner;
    private javax.swing.JButton pesquisaBtn;
    public static javax.swing.JTable resultadoTable;
    private javax.swing.JComboBox<String> sexoComboBox;
    private javax.swing.JComboBox<String> tamanhoComboBox;
    private javax.swing.JButton venderButton;
    // End of variables declaration//GEN-END:variables
}