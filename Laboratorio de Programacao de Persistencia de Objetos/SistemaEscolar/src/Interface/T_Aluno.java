/**
 * @author Laura
 */

package Interface;

import dao.AlunoDao;
import dominio.Aluno;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class T_Aluno extends javax.swing.JDialog {
    Aluno aluno;
    AlunoDao dao = new AlunoDao();

    /**
     * Creates new form Aluno
     */
    public T_Aluno(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
         this.setLocationRelativeTo(null);
        initComponents();
        txtMatricula.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblmatricula = new javax.swing.JLabel();
        txtMatricula = new javax.swing.JTextField();
        lblnome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        lblemail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        lbltelefone = new javax.swing.JLabel();
        lblcelular = new javax.swing.JLabel();
        lblobs = new javax.swing.JLabel();
        txtobs = new javax.swing.JScrollPane();
        txtObs = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        btnovo = new javax.swing.JButton();
        btsalvar = new javax.swing.JButton();
        btexcluir = new javax.swing.JButton();
        btalterar = new javax.swing.JButton();
        btsair = new javax.swing.JButton();
        txtTelefone = new javax.swing.JTextField();
        txtCelular = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Tela Aluno");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        lblmatricula.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblmatricula.setText("Matricula");

        txtMatricula.setEditable(false);
        txtMatricula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMatriculaActionPerformed(evt);
            }
        });

        lblnome.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblnome.setText("Nome");

        lblemail.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblemail.setText("Email");

        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });

        lbltelefone.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbltelefone.setText("Telefone");

        lblcelular.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblcelular.setText("Celular");

        lblobs.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblobs.setText("OBS");

        txtObs.setColumns(20);
        txtObs.setRows(5);
        txtobs.setViewportView(txtObs);

        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Matricula", "Nome", "Email", "Telefone", "Celular", "OBS"
            }
        ));
        tabela.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabela);
        if (tabela.getColumnModel().getColumnCount() > 0) {
            tabela.getColumnModel().getColumn(3).setResizable(false);
            tabela.getColumnModel().getColumn(4).setResizable(false);
        }

        btnovo.setText("Novo");
        btnovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnovoActionPerformed(evt);
            }
        });

        btsalvar.setText("Salvar");
        btsalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btsalvarActionPerformed(evt);
            }
        });

        btexcluir.setText("Excluir");
        btexcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btexcluirActionPerformed(evt);
            }
        });

        btalterar.setText("Alterar");
        btalterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btalterarActionPerformed(evt);
            }
        });

        btsair.setText("Sair");
        btsair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btsairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblnome)
                    .addComponent(lblmatricula)
                    .addComponent(lblemail)
                    .addComponent(lbltelefone)
                    .addComponent(lblobs))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(btnovo)
                        .addGap(18, 18, 18)
                        .addComponent(btsalvar)
                        .addGap(18, 18, 18)
                        .addComponent(btexcluir)
                        .addGap(29, 29, 29)
                        .addComponent(btalterar)
                        .addGap(18, 18, 18)
                        .addComponent(btsair))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 443, Short.MAX_VALUE)
                        .addComponent(txtMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtNome)
                        .addComponent(txtEmail)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(lblcelular)
                            .addGap(26, 26, 26)
                            .addComponent(txtCelular))
                        .addComponent(txtobs)))
                .addContainerGap(81, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblmatricula)
                    .addComponent(txtMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblnome)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblemail)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbltelefone)
                    .addComponent(lblcelular)
                    .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblobs)
                    .addComponent(txtobs, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnovo)
                    .addComponent(btsalvar)
                    .addComponent(btexcluir)
                    .addComponent(btalterar)
                    .addComponent(btsair))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnovoActionPerformed
       txtNome.setText(" ");
       txtEmail.setText(" ");
       txtTelefone.setText(" ");
       txtCelular.setText(" ");
       txtObs.setText(" ");
       txtNome.requestFocus();
                
    }//GEN-LAST:event_btnovoActionPerformed

    private void btsalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btsalvarActionPerformed
        try{   

         aluno = new Aluno();
         aluno.setNome(txtNome.getText());
         aluno.setEmail(txtEmail.getText());
         aluno.setTelefone(txtTelefone.getText());
         aluno.setCelular(txtCelular.getText());
         aluno.setObs(txtObs.getText());
         dao = new AlunoDao();
         dao.cadastrarAluno(aluno);


          JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso!");
                
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar o Aluno!");
               System.err.println(e);
        }
        
        
    }//GEN-LAST:event_btsalvarActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
      Listar();
    }//GEN-LAST:event_formWindowActivated

    private void tabelaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaMouseClicked
        txtMatricula.setText(tabela.getValueAt(tabela.getSelectedRow(), 0).toString());
        txtNome.setText(tabela.getValueAt(tabela.getSelectedRow(), 1).toString());    
        txtEmail.setText(tabela.getValueAt(tabela.getSelectedRow(), 2).toString());    
        txtTelefone.setText(tabela.getValueAt(tabela.getSelectedRow(), 3).toString());  
        txtCelular.setText(tabela.getValueAt(tabela.getSelectedRow(), 4).toString());
        txtObs.setText(tabela.getValueAt(tabela.getSelectedRow(), 5).toString());
    }//GEN-LAST:event_tabelaMouseClicked

    private void btexcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btexcluirActionPerformed
        try {
            Aluno alu = new Aluno();
            alu.setId(Integer.parseInt(txtMatricula.getText()));
            AlunoDao dao = new AlunoDao();
            dao.excluirAluno(alu);
            JOptionPane.showMessageDialog(null, "Aluno Excluido com Sucesso!");
        }catch(Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao excluir aluno");
        }
    }//GEN-LAST:event_btexcluirActionPerformed

    private void btalterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btalterarActionPerformed
        try {
            Aluno obj = new Aluno();
            obj.setId(Integer.parseInt(txtMatricula.getText()));
            obj.setNome(txtNome.getText());
            obj.setEmail(txtEmail.getText());
            obj.setTelefone(txtTelefone.getText());
            obj.setCelular(txtCelular.getText());
            obj.setObs(txtObs.getText());
            
            dao = new AlunoDao();
            dao.alterarAluno(obj);
            
            JOptionPane.showMessageDialog(null, "Aluno Atualizado com Sucesso!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar aluno!");
        }
    }//GEN-LAST:event_btalterarActionPerformed

    private void btsairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btsairActionPerformed
        int status = JOptionPane.showConfirmDialog(null, 
        "Deseja mesmo sair da aplicação?", "Fechar", JOptionPane.YES_NO_OPTION);
        if(status==JOptionPane.YES_OPTION)
            dispose();
    }//GEN-LAST:event_btsairActionPerformed

    private void txtMatriculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMatriculaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMatriculaActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

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
            java.util.logging.Logger.getLogger(T_Aluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(T_Aluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(T_Aluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(T_Aluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                T_Aluno dialog = new T_Aluno(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btalterar;
    private javax.swing.JButton btexcluir;
    private javax.swing.JButton btnovo;
    private javax.swing.JButton btsair;
    private javax.swing.JButton btsalvar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblcelular;
    private javax.swing.JLabel lblemail;
    private javax.swing.JLabel lblmatricula;
    private javax.swing.JLabel lblnome;
    private javax.swing.JLabel lblobs;
    private javax.swing.JLabel lbltelefone;
    private javax.swing.JTable tabela;
    private javax.swing.JTextField txtCelular;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtMatricula;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextArea txtObs;
    private javax.swing.JTextField txtTelefone;
    private javax.swing.JScrollPane txtobs;
    // End of variables declaration//GEN-END:variables

public void Listar(){
    try {
        dao=new AlunoDao();
        List<Aluno> listarAlunos=dao.listarAlunos();
        DefaultTableModel modelo=(DefaultTableModel)tabela.getModel();
        modelo.setNumRows(0);
        for (Aluno la : listarAlunos) {
            modelo.addRow(new Object[]{
            la.getId(),
            la.getNome(),
            la.getEmail(),
            la.getTelefone(),
            la.getCelular(),
            la.getObs(),   
        });
        }
    } catch (Exception e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(null, "Erro ao Listar os Alunos");
    }
    
    
}

}
