/*
 * Menu.java
 *
 * Created on 12 de Novembro de 2012, 09:53
 */
package br.com.siscom.view;

import br.com.siscom.view.MovimentoVenda;
import br.com.siscom.view.compras.CotacaoVenda;

/**
 *
 * @author  Kaio
 */
public class Menu extends javax.swing.JFrame {

    /** Creates new form Menu */
    public Menu() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jToolBar1 = new javax.swing.JToolBar();
        mnuSuperior = new javax.swing.JMenuBar();
        mnuCadastro = new javax.swing.JMenu();
        jMnuClientes = new javax.swing.JMenuItem();
        jMnuFornecedores = new javax.swing.JMenuItem();
        jMnuContaBancaria = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JSeparator();
        jMnuUnidades = new javax.swing.JMenuItem();
        jMnuProdutos = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JSeparator();
        jMnuDepartamento = new javax.swing.JMenuItem();
        jMnuFuncionario = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JSeparator();
        jMnuCartoes = new javax.swing.JMenuItem();
        jMnuPlanoContas = new javax.swing.JMenuItem();
        jMnuTipoPagRecebimento = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JSeparator();
        jMnuSair = new javax.swing.JMenuItem();
        mnuMovimento = new javax.swing.JMenu();
        jMnuContasPagar = new javax.swing.JMenuItem();
        jMnuContasReceber = new javax.swing.JMenuItem();
        jMnuVendas = new javax.swing.JMenuItem();
        MnuControleEstoque = new javax.swing.JMenu();
        jMnuEntradaNF = new javax.swing.JMenuItem();
        jMnuAtualizacaoPrecos = new javax.swing.JMenuItem();
        MnuCompras = new javax.swing.JMenu();
        jMnuRequisicao = new javax.swing.JMenuItem();
        jMnuCotacao = new javax.swing.JMenuItem();
        jMnuConfirmaCotacao = new javax.swing.JMenuItem();
        jMnuPedido = new javax.swing.JMenuItem();
        MnuTesourariaBanco = new javax.swing.JMenu();
        jMnuEmissaoCheques = new javax.swing.JMenuItem();
        jMnuConciliacaoCheques = new javax.swing.JMenuItem();
        jMnuMovimentoBanco = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        mnuUtilitarios = new javax.swing.JMenu();
        jMnuCalculadora = new javax.swing.JMenuItem();
        jMnuCalendario = new javax.swing.JMenuItem();
        jSeparator5 = new javax.swing.JSeparator();
        MnuSistemaSeguranca = new javax.swing.JMenu();
        jMnuTrocaSenha = new javax.swing.JMenuItem();
        jMnuDefinirAcesso = new javax.swing.JMenuItem();
        mnuAjuda = new javax.swing.JMenu();
        jMnuSobre = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema Comercial");
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(102, 204, 255));

        jToolBar1.setBackground(new java.awt.Color(102, 204, 255));
        jToolBar1.setRollover(true);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(530, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 630, 90);

        mnuCadastro.setText("Cadastro");

        jMnuClientes.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        jMnuClientes.setMnemonic('C');
        jMnuClientes.setText("Clientes");
        jMnuClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMnuClientesActionPerformed(evt);
            }
        });
        mnuCadastro.add(jMnuClientes);

        jMnuFornecedores.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.CTRL_MASK));
        jMnuFornecedores.setMnemonic('F');
        jMnuFornecedores.setText("Fornecedores");
        jMnuFornecedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMnuFornecedoresActionPerformed(evt);
            }
        });
        mnuCadastro.add(jMnuFornecedores);

        jMnuContaBancaria.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.CTRL_MASK));
        jMnuContaBancaria.setMnemonic('B');
        jMnuContaBancaria.setText("Conta Bancária");
        jMnuContaBancaria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMnuContaBancariaActionPerformed(evt);
            }
        });
        mnuCadastro.add(jMnuContaBancaria);
        mnuCadastro.add(jSeparator1);

        jMnuUnidades.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.CTRL_MASK));
        jMnuUnidades.setMnemonic('U');
        jMnuUnidades.setText("Unidades");
        jMnuUnidades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMnuUnidadesActionPerformed(evt);
            }
        });
        mnuCadastro.add(jMnuUnidades);

        jMnuProdutos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        jMnuProdutos.setMnemonic('P');
        jMnuProdutos.setText("Produtos");
        jMnuProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMnuProdutosActionPerformed(evt);
            }
        });
        mnuCadastro.add(jMnuProdutos);
        mnuCadastro.add(jSeparator2);

        jMnuDepartamento.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_MASK));
        jMnuDepartamento.setMnemonic('D');
        jMnuDepartamento.setText("Departamento");
        mnuCadastro.add(jMnuDepartamento);

        jMnuFuncionario.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        jMnuFuncionario.setMnemonic('n');
        jMnuFuncionario.setText("Funcionário");
        jMnuFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMnuFuncionarioActionPerformed(evt);
            }
        });
        mnuCadastro.add(jMnuFuncionario);
        mnuCadastro.add(jSeparator3);

        jMnuCartoes.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_MASK));
        jMnuCartoes.setMnemonic('r');
        jMnuCartoes.setText("Cartões");
        jMnuCartoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMnuCartoesActionPerformed(evt);
            }
        });
        mnuCadastro.add(jMnuCartoes);

        jMnuPlanoContas.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_MASK));
        jMnuPlanoContas.setMnemonic('l');
        jMnuPlanoContas.setText("Plano de contas");
        jMnuPlanoContas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMnuPlanoContasActionPerformed(evt);
            }
        });
        mnuCadastro.add(jMnuPlanoContas);

        jMnuTipoPagRecebimento.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.CTRL_MASK));
        jMnuTipoPagRecebimento.setMnemonic('t');
        jMnuTipoPagRecebimento.setText("Tipo de pagamento/recebimento");
        jMnuTipoPagRecebimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMnuTipoPagRecebimentoActionPerformed(evt);
            }
        });
        mnuCadastro.add(jMnuTipoPagRecebimento);
        mnuCadastro.add(jSeparator4);

        jMnuSair.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        jMnuSair.setMnemonic('s');
        jMnuSair.setText("Sair");
        mnuCadastro.add(jMnuSair);

        mnuSuperior.add(mnuCadastro);

        mnuMovimento.setText("Movimento");

        jMnuContasPagar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        jMnuContasPagar.setMnemonic('a');
        jMnuContasPagar.setText("Contas a pagar");
        mnuMovimento.add(jMnuContasPagar);

        jMnuContasReceber.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_MASK));
        jMnuContasReceber.setText("Contas a receber");
        mnuMovimento.add(jMnuContasReceber);

        jMnuVendas.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_MASK));
        jMnuVendas.setText("Vendas");
        jMnuVendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMnuVendasActionPerformed(evt);
            }
        });
        mnuMovimento.add(jMnuVendas);

        MnuControleEstoque.setText("Controle de estoque");

        jMnuEntradaNF.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_J, java.awt.event.InputEvent.CTRL_MASK));
        jMnuEntradaNF.setText("Entrada de NF");
        MnuControleEstoque.add(jMnuEntradaNF);

        jMnuAtualizacaoPrecos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        jMnuAtualizacaoPrecos.setMnemonic('o');
        jMnuAtualizacaoPrecos.setText("Atualização de preços");
        MnuControleEstoque.add(jMnuAtualizacaoPrecos);

        mnuMovimento.add(MnuControleEstoque);

        MnuCompras.setText("Compras");

        jMnuRequisicao.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.CTRL_MASK));
        jMnuRequisicao.setMnemonic('i');
        jMnuRequisicao.setText("Requisição");
        MnuCompras.add(jMnuRequisicao);

        jMnuCotacao.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.CTRL_MASK));
        jMnuCotacao.setText("Cotação");
        jMnuCotacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMnuCotacaoActionPerformed(evt);
            }
        });
        MnuCompras.add(jMnuCotacao);

        jMnuConfirmaCotacao.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Y, java.awt.event.InputEvent.CTRL_MASK));
        jMnuConfirmaCotacao.setText("Confirma cotação");
        MnuCompras.add(jMnuConfirmaCotacao);

        jMnuPedido.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        jMnuPedido.setMnemonic('e');
        jMnuPedido.setText("Pedido");
        MnuCompras.add(jMnuPedido);

        mnuMovimento.add(MnuCompras);

        MnuTesourariaBanco.setText("Tesouraria e banco");

        jMnuEmissaoCheques.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_W, java.awt.event.InputEvent.CTRL_MASK));
        jMnuEmissaoCheques.setText("Emissão de cheques");
        MnuTesourariaBanco.add(jMnuEmissaoCheques);

        jMnuConciliacaoCheques.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.CTRL_MASK));
        jMnuConciliacaoCheques.setText("Conciliação de cheques");
        MnuTesourariaBanco.add(jMnuConciliacaoCheques);

        jMnuMovimentoBanco.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.CTRL_MASK));
        jMnuMovimentoBanco.setMnemonic('v');
        jMnuMovimentoBanco.setText("Movimento de banco");
        MnuTesourariaBanco.add(jMnuMovimentoBanco);

        mnuMovimento.add(MnuTesourariaBanco);

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_5, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setText("Cadastro de orçamento");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        mnuMovimento.add(jMenuItem1);

        mnuSuperior.add(mnuMovimento);

        mnuUtilitarios.setText("Utilitários");

        jMnuCalculadora.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        jMnuCalculadora.setText("Calculadora");
        mnuUtilitarios.add(jMnuCalculadora);

        jMnuCalendario.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F2, 0));
        jMnuCalendario.setText("Calendário");
        mnuUtilitarios.add(jMnuCalendario);
        mnuUtilitarios.add(jSeparator5);

        MnuSistemaSeguranca.setText("Sistema de segurança");

        jMnuTrocaSenha.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F10, 0));
        jMnuTrocaSenha.setText("trocar senha corrente");
        MnuSistemaSeguranca.add(jMnuTrocaSenha);

        jMnuDefinirAcesso.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F12, 0));
        jMnuDefinirAcesso.setText("Definir nivel de acesso");
        MnuSistemaSeguranca.add(jMnuDefinirAcesso);

        mnuUtilitarios.add(MnuSistemaSeguranca);

        mnuSuperior.add(mnuUtilitarios);

        mnuAjuda.setText("Ajuda");

        jMnuSobre.setText("Sobre o sistema");
        mnuAjuda.add(jMnuSobre);

        mnuSuperior.add(mnuAjuda);

        setJMenuBar(mnuSuperior);

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-640)/2, (screenSize.height-457)/2, 640, 457);
    }// </editor-fold>//GEN-END:initComponents
    private void jMnuContaBancariaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMnuContaBancariaActionPerformed
        String[] args = new String[1];
        args[0] = "Cadastro das constas bancárias";

        BancoView.main(args);
        
        
    }//GEN-LAST:event_jMnuContaBancariaActionPerformed

    private void jMnuCartoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMnuCartoesActionPerformed

        String[] args = new String[1];
        args[0] = "Relação dos cartões cadastrados";

        CartaoView.main(args);
        
    }//GEN-LAST:event_jMnuCartoesActionPerformed

    private void jMnuTipoPagRecebimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMnuTipoPagRecebimentoActionPerformed

        String[] args = new String[1];
        args[0] = "Relação dos tipos de pagamento/recebimento";

        TipoPgtoView.main(args);
        
    }//GEN-LAST:event_jMnuTipoPagRecebimentoActionPerformed

    private void jMnuClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMnuClientesActionPerformed

        String[] args = new String[1];
        args[0] = "Cadastro de cliente";

        ClienteView.main(args);
        
    }//GEN-LAST:event_jMnuClientesActionPerformed

    private void jMnuFornecedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMnuFornecedoresActionPerformed

        String[] args = new String[1];
        args[0] = "Cadastro de fornecedores";

        FornecedorView.main(args);
        
    }//GEN-LAST:event_jMnuFornecedoresActionPerformed

    private void jMnuUnidadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMnuUnidadesActionPerformed

        String[] args = new String[1];
        args[0] = "Cadastro de unidades";

        UnidadeView.main(args);
        
    }//GEN-LAST:event_jMnuUnidadesActionPerformed

    private void jMnuProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMnuProdutosActionPerformed

        String[] args = new String[1];
        args[0] = "Cadastro de produtos";

        ProdutoView.main(args);
        
    }//GEN-LAST:event_jMnuProdutosActionPerformed

    private void jMnuPlanoContasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMnuPlanoContasActionPerformed

        String[] args = new String[1];
        args[0] = "Cadastro de produtos";

        PlanoContaView.main(args);
        
    }//GEN-LAST:event_jMnuPlanoContasActionPerformed

    private void jMnuFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMnuFuncionarioActionPerformed

        String[] args = new String[1];
        args[0] = "Cadastro de produtos";

        FuncionarioView.main(args);
        
        
    }//GEN-LAST:event_jMnuFuncionarioActionPerformed

    private void jMnuVendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMnuVendasActionPerformed

        String[] args = new String[1];
        args[0] = "Cadastro de produtos";

        MovimentoVenda.main(args);
        
    }//GEN-LAST:event_jMnuVendasActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
       
        String[] args = new String[1];
        args[0] = "Cadastro de produtos";

        MovimentoOrcamentoVenda.main(args);
        
        
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMnuCotacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMnuCotacaoActionPerformed
       
        String[] args = new String[1];
        args[0] = "Cadastro de produtos";

        CotacaoVenda.main(args);
               
    }//GEN-LAST:event_jMnuCotacaoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Menu().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu MnuCompras;
    private javax.swing.JMenu MnuControleEstoque;
    private javax.swing.JMenu MnuSistemaSeguranca;
    private javax.swing.JMenu MnuTesourariaBanco;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMnuAtualizacaoPrecos;
    private javax.swing.JMenuItem jMnuCalculadora;
    private javax.swing.JMenuItem jMnuCalendario;
    private javax.swing.JMenuItem jMnuCartoes;
    private javax.swing.JMenuItem jMnuClientes;
    private javax.swing.JMenuItem jMnuConciliacaoCheques;
    private javax.swing.JMenuItem jMnuConfirmaCotacao;
    private javax.swing.JMenuItem jMnuContaBancaria;
    private javax.swing.JMenuItem jMnuContasPagar;
    private javax.swing.JMenuItem jMnuContasReceber;
    private javax.swing.JMenuItem jMnuCotacao;
    private javax.swing.JMenuItem jMnuDefinirAcesso;
    private javax.swing.JMenuItem jMnuDepartamento;
    private javax.swing.JMenuItem jMnuEmissaoCheques;
    private javax.swing.JMenuItem jMnuEntradaNF;
    private javax.swing.JMenuItem jMnuFornecedores;
    private javax.swing.JMenuItem jMnuFuncionario;
    private javax.swing.JMenuItem jMnuMovimentoBanco;
    private javax.swing.JMenuItem jMnuPedido;
    private javax.swing.JMenuItem jMnuPlanoContas;
    private javax.swing.JMenuItem jMnuProdutos;
    private javax.swing.JMenuItem jMnuRequisicao;
    private javax.swing.JMenuItem jMnuSair;
    private javax.swing.JMenuItem jMnuSobre;
    private javax.swing.JMenuItem jMnuTipoPagRecebimento;
    private javax.swing.JMenuItem jMnuTrocaSenha;
    private javax.swing.JMenuItem jMnuUnidades;
    private javax.swing.JMenuItem jMnuVendas;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JMenu mnuAjuda;
    private javax.swing.JMenu mnuCadastro;
    private javax.swing.JMenu mnuMovimento;
    private javax.swing.JMenuBar mnuSuperior;
    private javax.swing.JMenu mnuUtilitarios;
    // End of variables declaration//GEN-END:variables
}
