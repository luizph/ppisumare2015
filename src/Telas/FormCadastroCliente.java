
package Telas;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLDataException;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import utilitarios.Conexao;
import utilitarios.ValidarCpf;

public class FormCadastroCliente extends javax.swing.JFrame {
    Connection con  = Conexao.abrirConexao();

   
    public FormCadastroCliente() {
        initComponents();
        btneditar.setEnabled(false);
        btnexcluir.setEnabled(false);
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        textcpf = new javax.swing.JTextField();
        textemail = new javax.swing.JTextField();
        texttelefone = new javax.swing.JTextField();
        btnlimpar = new javax.swing.JButton();
        btncadastrar = new javax.swing.JButton();
        textnome = new javax.swing.JTextField();
        btnselecionar = new javax.swing.JButton();
        id = new javax.swing.JLabel();
        btnexcluir = new javax.swing.JButton();
        btneditar = new javax.swing.JButton();
        btnsair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Cadastro de Cliente");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Cadastrar novo cliente"));

        jLabel2.setText("Nome:");

        jLabel3.setText("CPF:");

        jLabel4.setText("Email:");

        jLabel5.setText("Telefone:");

        textcpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textcpfActionPerformed(evt);
            }
        });

        textemail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textemailActionPerformed(evt);
            }
        });

        btnlimpar.setText("Limpar");
        btnlimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlimparActionPerformed(evt);
            }
        });

        btncadastrar.setText("Cadastrar");
        btncadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncadastrarActionPerformed(evt);
            }
        });

        textnome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textnomeActionPerformed(evt);
            }
        });

        btnselecionar.setText("Selecionar");
        btnselecionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnselecionarActionPerformed(evt);
            }
        });

        id.setText("COD:");

        btnexcluir.setText("Excluir");
        btnexcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnexcluirActionPerformed(evt);
            }
        });

        btneditar.setText("Editar");
        btneditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneditarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 15, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnselecionar)
                            .addComponent(btncadastrar))
                        .addGap(66, 66, 66)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btneditar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                                .addComponent(btnexcluir))
                            .addComponent(btnlimpar))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textcpf, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textnome, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textemail, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(texttelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(id)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(id)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(textnome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(textcpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(textemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(texttelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btncadastrar)
                    .addComponent(btnlimpar))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnselecionar)
                    .addComponent(btnexcluir)
                    .addComponent(btneditar)))
        );

        btnsair.setText("SAIR");
        btnsair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnsair, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(145, 145, 145))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnsair)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textemailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textemailActionPerformed
       
    }//GEN-LAST:event_textemailActionPerformed

    private void btnsairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsairActionPerformed
    System.exit(0);  
    }//GEN-LAST:event_btnsairActionPerformed

    private void btnlimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlimparActionPerformed
id.setText("");
textnome.setText("");
textcpf.setText("");
textemail.setText("");
texttelefone.setText("");    
    }//GEN-LAST:event_btnlimparActionPerformed

    private void btncadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncadastrarActionPerformed
    
        
        String nome= textnome.getText();
        String cpf = textcpf.getText();
        String email = textemail.getText();
        String telefone = texttelefone.getText();
        ValidarCpf validadorcpf=new ValidarCpf();
        boolean cpfvalido = validadorcpf.validarCpf(cpf);
        if(cpfvalido){ 
        String sql = "INSERT INTO cliente(nome, cpf,email,telefone) VALUES (?,?,?,?)";
         try {
                        PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1,nome);
            ps.setString(2,cpf);
            ps.setString(3,email);
            ps.setString(4,telefone);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null,"Cliete cadastrado com sucesso!","Cadastro",
                    JOptionPane.INFORMATION_MESSAGE);
            textnome.setText("");
            textcpf.setText("");
            textemail.setText("");
            texttelefone.setText("");
           
        }        catch(SQLException e){
        JOptionPane.showConfirmDialog(null,"Erro" + e.getMessage(),"Erro", JOptionPane.ERROR_MESSAGE);
        }
        } else JOptionPane.showMessageDialog(null,"CPF Invalido"); 
    }//GEN-LAST:event_btncadastrarActionPerformed

    private void textcpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textcpfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textcpfActionPerformed

    private void textnomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textnomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textnomeActionPerformed

    private void btnselecionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnselecionarActionPerformed
   int  cod =Integer.parseInt(JOptionPane.showInputDialog
        (null,"Digite um codigo", "Consulta",JOptionPane.QUESTION_MESSAGE));
String sql = "SELECT * FROM cliente WHERE id = ?";
try{
PreparedStatement ps= con.prepareStatement(sql);
ps.setInt(1,cod);
ResultSet rs= ps.executeQuery();
rs.next();
id.setText(String.valueOf(rs.getInt ("id")));
textnome.setText(rs.getString("nome"));
textcpf.setText(rs.getString("cpf"));
textemail.setText(rs.getString("email"));
texttelefone.setText(rs.getString("telefone"));
btneditar.setEnabled(true);
btnexcluir.setEnabled(true);
btncadastrar.setEnabled(false);
//final 3º folha
    
}catch (SQLException e){
   JOptionPane.showConfirmDialog(null,"Erro" + e.getMessage(),"Erro", JOptionPane.ERROR_MESSAGE);  
}
  
    


    }//GEN-LAST:event_btnselecionarActionPerformed

    private void btneditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneditarActionPerformed
      int cod = Integer.parseInt(id.getText());
        
        String nome= textnome.getText();
        String cpf = textcpf.getText();
        String email = textemail.getText();
        String telefone = texttelefone.getText();
        
        String sql = "UPDATE  cliente SET nome = ?, cpf = ?,email = ?, telefone = ? WHERE id = ?";
        //final 4º folha
        try {
           
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1,nome);
            ps.setString(2,cpf);
            ps.setString(3,email);
            ps.setString(4,telefone);
            ps.setInt(5,cod);
            ps.executeUpdate();
            
            JOptionPane.showMessageDialog(null,"Cliente alterado com sucesso!","Alteração",JOptionPane.INFORMATION_MESSAGE);
            btncadastrar.setEnabled(true);
            btnexcluir.setEnabled(false);
            btneditar.setEnabled(true);
            
            id.setText("");
            textnome.setText("");
            textcpf.setText("");
            textemail.setText("");
            texttelefone.setText("");
            //final 5º folha 
        }        catch(SQLException e){
        JOptionPane.showConfirmDialog(null,"Erro" + e.getMessage(),"Erro", JOptionPane.ERROR_MESSAGE);
        }
        
        
        
    }//GEN-LAST:event_btneditarActionPerformed

    private void btnexcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnexcluirActionPerformed
     int cod =Integer.parseInt(JOptionPane.showInputDialog
        (null,"Digite um codigo", "Exclusão",JOptionPane.QUESTION_MESSAGE));
         String sql = "DELETE FROM cliente WHERE id = ?";
        
        try{
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1,cod);
            ps.executeUpdate();
        
     JOptionPane.showMessageDialog
             (null,"Cliente excluido com sucesso!","Exclusão",JOptionPane.INFORMATION_MESSAGE);
            btncadastrar.setEnabled(true);
            btnexcluir.setEnabled(false);
            btneditar.setEnabled(true);
            
            id.setText("");
            textnome.setText("");
            textcpf.setText("");
            textemail.setText("");
            texttelefone.setText("");
            
        }        catch(SQLException e){
        JOptionPane.showConfirmDialog(null,"Erro" + e.getMessage(),"Erro", JOptionPane.ERROR_MESSAGE);
        }   // TODO add your handling code here:
    }//GEN-LAST:event_btnexcluirActionPerformed

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
            java.util.logging.Logger.getLogger(FormCadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormCadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormCadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormCadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormCadastroCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncadastrar;
    private javax.swing.JButton btneditar;
    private javax.swing.JButton btnexcluir;
    private javax.swing.JButton btnlimpar;
    private javax.swing.JButton btnsair;
    private javax.swing.JButton btnselecionar;
    private javax.swing.JLabel id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField textcpf;
    private javax.swing.JTextField textemail;
    private javax.swing.JTextField textnome;
    private javax.swing.JTextField texttelefone;
    // End of variables declaration//GEN-END:variables
}
