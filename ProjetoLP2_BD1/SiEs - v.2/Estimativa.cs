using System;
using System.Collections;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
//

namespace SiEs___v._2
{
    public partial class Estimativa : Form
    {
        int codAtividade = 0;
        int codMaterial = 0;
        int codOrcamento = 0;
        int codProfissao = 0;
        //pode ser cod profissional ou cod Pessoa
        int CodPessoa = 0;
        static public int CodPessoaPesquisada = 0;

        ArrayList ListaItens = new ArrayList();
        //ArrayList ListaAtividades = new ArrayList();
        List<int> ListaAtividades = new List<int>();
        
        
        static public string NomeCliente;
        public Estimativa()
        {
            InitializeComponent();
        }
        public Estimativa(int CodPessoa, int codProfissao)
        {
            InitializeComponent();
            this.CodPessoa = CodPessoa;
            this.codProfissao = codProfissao;
        }


        private void Estimativa_Load(object sender, EventArgs e)
        {
            Dados ObjDados = new Dados();
            Dados.Pessoa ObjPessoa = ObjDados.ConsultaPessoaCodPess(CodPessoa);
            txProfissional.Text = ObjPessoa.CodPessoa.ToString() + " - " + ObjPessoa.CPF + " - " + ObjPessoa.Nome;
            if (codProfissao == 1)
            {
                label8.Text = "Cliente :";
                label9.Text = "Profissional : ";
            }else if(codProfissao == 2)
            {
                label8.Text = "Profissional : ";
                label9.Text = "Cliente :";
            }
            else
            {
                label8.Text = null;
                label9.Text = null;
                btnGerarOrc.Visible = false;
                txProfissional.Visible = false;
                txCliente.Visible = false;
                btnAtualizarCli.Visible = false;
                btnPesquisarCli.Visible = false;
            }
            txCliente.Enabled = false;
            txProfissional.Enabled = false;
            btnIncluirItem.Enabled = false;
            btnGerarOrc.Enabled = false;
            btnNovo.Enabled = false;
        }

        int controladorBotao = 0;
        bool ControleListaAtividade_Piso = true;
        bool ControleListaAtividade_Pintura = true;
        bool ControleListaAtividade_Repintura = true;
        bool ControleListaAtividade_ColocarGramado = true;
        private void btnLevantarMateriais_Click(object sender, EventArgs e)
        {
            if (string.IsNullOrEmpty(txAreaAtividade.Text))
            {
                MessageBox.Show("Insira a área para efetuar o cálculo");
            }
            else
            {
                Dados ObjDados = new Dados();
                //Piso->Cod 3
                if ((cmbxAtividade.SelectedIndex + 1) == 1)
                {
                    controladorBotao = controladorBotao + 1;
                    if (controladorBotao == 1)
                    {
                        if (ControleListaAtividade_Piso)
                        {
                            //inserir cod Atividade
                            codAtividade = 3;
                            ListaAtividades.Add(codAtividade);
                            lstAtividades.Items.Add("Colocar Piso");
                            ControleListaAtividade_Piso = false;

                        }

                        cmbxAtividade.Enabled = false;
                        btnLevantarMateriais.Enabled = false;
                        btnIncluirItem.Enabled = true;

                        lstMateriais.Items.Clear();
                        MessageBox.Show("Escolha um piso");//CodCat = 1

                        foreach (var materiais in ObjDados.ConsultaMateriaisCat(1))
                        {
                            ListViewItem ObjListView = new ListViewItem();
                            ObjListView.Text = materiais.CodMaterial.ToString();
                            ObjListView.SubItems.Add(materiais.NomeMaterial);
                            lstMateriais.Items.Add(ObjListView);
                        }
                    }
                    else if (controladorBotao == 2)
                    {
                        cmbxAtividade.Enabled = false;
                        btnLevantarMateriais.Enabled = false;
                        btnIncluirItem.Enabled = true;

                        lstMateriais.Items.Clear();
                        MessageBox.Show("Escolha um rejunte");//CodCat = 3

                        foreach (var materiais in ObjDados.ConsultaMateriaisCat(3))
                        {
                            ListViewItem ObjListView = new ListViewItem();
                            ObjListView.Text = materiais.CodMaterial.ToString();
                            ObjListView.SubItems.Add(materiais.NomeMaterial);
                            lstMateriais.Items.Add(ObjListView);
                        }
                    }
                    else if (controladorBotao == 3)
                    {
                        cmbxAtividade.Enabled = false;
                        btnLevantarMateriais.Enabled = false;
                        btnIncluirItem.Enabled = true;

                        lstMateriais.Items.Clear();
                        MessageBox.Show("Escolha uma argamassa");//CodCat = 2

                        foreach (var materiais in ObjDados.ConsultaMateriaisCat(2))
                        {
                            ListViewItem ObjListView = new ListViewItem();
                            ObjListView.Text = materiais.CodMaterial.ToString();
                            ObjListView.SubItems.Add(materiais.NomeMaterial);
                            lstMateriais.Items.Add(ObjListView);
                        }
                    }
                    else
                    {
                        controladorBotao = 0;
                        cmbxAtividade.Enabled = true;
                        btnLevantarMateriais.Enabled = true;
                        MessageBox.Show("Selecione outra atividade ou a mesma");
                    }

                }//Pintura -> Cod1
                else if ((cmbxAtividade.SelectedIndex + 1) == 2)
                {
                    controladorBotao = controladorBotao + 1;
                    if (controladorBotao == 1)
                    {
                        if (ControleListaAtividade_Pintura)
                        {
                            //inserir cod Atividade
                            codAtividade = 1;
                            ListaAtividades.Add(codAtividade);
                            lstAtividades.Items.Add("Pintura");
                            ControleListaAtividade_Pintura = false;
                        }

                        cmbxAtividade.Enabled = false;
                        btnLevantarMateriais.Enabled = false;
                        btnIncluirItem.Enabled = true;

                        lstMateriais.Items.Clear();
                        MessageBox.Show("Escolha uma Tinta");//CodCat = 4

                        foreach (var materiais in ObjDados.ConsultaMateriaisCat(4))
                        {
                            ListViewItem ObjListView = new ListViewItem();
                            ObjListView.Text = materiais.CodMaterial.ToString();
                            ObjListView.SubItems.Add(materiais.NomeMaterial);
                            lstMateriais.Items.Add(ObjListView);
                        }
                    }
                    else if (controladorBotao == 2)
                    {
                        cmbxAtividade.Enabled = false;
                        btnLevantarMateriais.Enabled = false;
                        btnIncluirItem.Enabled = true;

                        lstMateriais.Items.Clear();
                        MessageBox.Show("Escolha um Selador");//CodCat = 6

                        foreach (var materiais in ObjDados.ConsultaMateriaisCat(6))
                        {
                            ListViewItem ObjListView = new ListViewItem();
                            ObjListView.Text = materiais.CodMaterial.ToString();
                            ObjListView.SubItems.Add(materiais.NomeMaterial);
                            lstMateriais.Items.Add(ObjListView);
                        }
                    }
                    else if (controladorBotao == 3)
                    {
                        cmbxAtividade.Enabled = false;
                        btnLevantarMateriais.Enabled = false;
                        btnIncluirItem.Enabled = true;

                        lstMateriais.Items.Clear();
                        MessageBox.Show("Escolha uma Massa Corrida");//CodCat = 5

                        foreach (var materiais in ObjDados.ConsultaMateriaisCat(5))
                        {
                            ListViewItem ObjListView = new ListViewItem();
                            ObjListView.Text = materiais.CodMaterial.ToString();
                            ObjListView.SubItems.Add(materiais.NomeMaterial);
                            lstMateriais.Items.Add(ObjListView);
                        }
                    }
                    else if (controladorBotao == 4)
                    {
                        cmbxAtividade.Enabled = false;
                        btnLevantarMateriais.Enabled = false;
                        btnIncluirItem.Enabled = true;

                        lstMateriais.Items.Clear();
                        MessageBox.Show("Escolha um Corante");//CodCat = 7

                        foreach (var materiais in ObjDados.ConsultaMateriaisCat(7))
                        {
                            ListViewItem ObjListView = new ListViewItem();
                            ObjListView.Text = materiais.CodMaterial.ToString();
                            ObjListView.SubItems.Add(materiais.NomeMaterial);
                            lstMateriais.Items.Add(ObjListView);
                        }
                    }
                    else
                    {
                        controladorBotao = 0;
                        cmbxAtividade.Enabled = true;
                        btnLevantarMateriais.Enabled = true;
                        MessageBox.Show("Selecione outra atividade ou a mesma");
                    }
                }//Repintura -> Cod 2
                else if ((cmbxAtividade.SelectedIndex + 1) == 3)
                {
                    controladorBotao = controladorBotao + 1;
                    if (controladorBotao == 1)
                    {
                        if (ControleListaAtividade_Repintura)
                        {
                            //inserir cod Atividade
                            codAtividade = 2;
                            ListaAtividades.Add(codAtividade);
                            lstAtividades.Items.Add("Repintura");
                            ControleListaAtividade_Repintura = false;
                        }

                        cmbxAtividade.Enabled = false;
                        btnLevantarMateriais.Enabled = false;
                        btnIncluirItem.Enabled = true;

                        lstMateriais.Items.Clear();
                        MessageBox.Show("Escolha uma Tinta");//CodCat = 4

                        foreach (var materiais in ObjDados.ConsultaMateriaisCat(4))
                        {
                            ListViewItem ObjListView = new ListViewItem();
                            ObjListView.Text = materiais.CodMaterial.ToString();
                            ObjListView.SubItems.Add(materiais.NomeMaterial);
                            lstMateriais.Items.Add(ObjListView);
                        }
                    }
                    else if (controladorBotao == 2)
                    {
                        cmbxAtividade.Enabled = false;
                        btnLevantarMateriais.Enabled = false;
                        btnIncluirItem.Enabled = true;

                        lstMateriais.Items.Clear();
                        MessageBox.Show("Escolha uma Fundo Preparador");//CodCat = 8

                        foreach (var materiais in ObjDados.ConsultaMateriaisCat(8))
                        {
                            ListViewItem ObjListView = new ListViewItem();
                            ObjListView.Text = materiais.CodMaterial.ToString();
                            ObjListView.SubItems.Add(materiais.NomeMaterial);
                            lstMateriais.Items.Add(ObjListView);
                        }
                    }
                    else if (controladorBotao == 3)
                    {
                        cmbxAtividade.Enabled = false;
                        btnLevantarMateriais.Enabled = false;
                        btnIncluirItem.Enabled = true;

                        lstMateriais.Items.Clear();
                        MessageBox.Show("Escolha um Corante");//CodCat = 7

                        foreach (var materiais in ObjDados.ConsultaMateriaisCat(7))
                        {
                            ListViewItem ObjListView = new ListViewItem();
                            ObjListView.Text = materiais.CodMaterial.ToString();
                            ObjListView.SubItems.Add(materiais.NomeMaterial);
                            lstMateriais.Items.Add(ObjListView);
                        }
                    }
                    else
                    {
                        controladorBotao = 0;
                        cmbxAtividade.Enabled = true;
                        btnLevantarMateriais.Enabled = true;
                        MessageBox.Show("Selecione outra atividade ou a mesma");
                    }
                }//Colocar Gramado -> Cod 4
                else if ((cmbxAtividade.SelectedIndex + 1) == 4)
                {
                    ///////
                    controladorBotao = controladorBotao + 1;
                    if (controladorBotao == 1)
                    {
                        if (ControleListaAtividade_Piso)
                        {
                            //inserir cod Atividade
                            codAtividade = 4;
                            ListaAtividades.Add(codAtividade);
                            lstAtividades.Items.Add("Colocar Gramado");
                            ControleListaAtividade_ColocarGramado = false;

                        }

                        cmbxAtividade.Enabled = false;
                        btnLevantarMateriais.Enabled = false;
                        btnIncluirItem.Enabled = true;

                        lstMateriais.Items.Clear();
                        MessageBox.Show("Escolha um Gramado");//CodCat = 9

                        foreach (var materiais in ObjDados.ConsultaMateriaisCat(9))
                        {
                            ListViewItem ObjListView = new ListViewItem();
                            ObjListView.Text = materiais.CodMaterial.ToString();
                            ObjListView.SubItems.Add(materiais.NomeMaterial);
                            lstMateriais.Items.Add(ObjListView);
                        }
                    }
                    else
                    {
                        controladorBotao = 0;
                        cmbxAtividade.Enabled = true;
                        btnLevantarMateriais.Enabled = true;
                        MessageBox.Show("Selecione outra atividade ou a mesma");
                    }
                }
            }
        }

        private void btnPesquisarCli_Click(object sender, EventArgs e)
        {
            /////alterar a variável de inicialização do construtor
            if (codProfissao == 2)
            {
                PesqClien PC = new PesqClien(1);
                PC.ShowDialog();
            }else if (codProfissao == 1)
            {
                PesqClien PC = new PesqClien(2);
                PC.ShowDialog();
            }

            //MessageBox.Show(codProfissao.ToString());
        }
        int item = 0;
        private void btnIncluirItem_Click(object sender, EventArgs e)
        {
            Dados ObjDados = new Dados();
            int codMat = 0;

            if (string.IsNullOrEmpty(txPrecoUnitario.Text))
            {
                MessageBox.Show("Insira o preço unitário");
            }
            else
            {
                
                if (lstMateriais.SelectedItems.Count > 0)
                {
                    item = item + 1;
                    btnLevantarMateriais.Enabled = true;
                    btnIncluirItem.Enabled = false;

                    Dados.Materiais MaterialTemp = new Dados.Materiais();
                       
                    codMat = int.Parse(lstMateriais.SelectedItems[0].Text);
                    MaterialTemp = ObjDados.ConsultaMateriaisCodMat(codMat);
                    ListViewItem ObjListViewItem = new ListViewItem();

                    Itens_orcamento ObItens = new Itens_orcamento();
                    
                    ObItens.Item = item;
                    ObItens.CodMaterial = MaterialTemp.CodMaterial;
                    ObItens.nomematerial = MaterialTemp.NomeMaterial;
                    ObItens.Quantidade = RegrasNegocio.QuantidadeBrutaTotalMaterial(double.Parse(txAreaAtividade.Text),MaterialTemp.Rendimento);
                    ObItens.UnidadeMedida = MaterialTemp.UnidadeDeRendimento;
                    ObItens.NumeroUnidades = RegrasNegocio.QuantidadeEmbalagensMaterial(MaterialTemp.ConteudoEmbalagem, ObItens.Quantidade);
                    ObItens.UnidadeAgrupamento = MaterialTemp.UnidadeDoConteudo_Cx;
                    ObItens.ValorUnitario = double.Parse(txPrecoUnitario.Text);
                    ObItens.valortotal = RegrasNegocio.PrecoTotalPorItem(double.Parse(txPrecoUnitario.Text), ObItens.NumeroUnidades);

                    ObjListViewItem.Text = ObItens.CodMaterial.ToString();
                    ObjListViewItem.SubItems.Add(ObItens.Item.ToString());
                    ObjListViewItem.SubItems.Add(ObItens.nomematerial);
                    ObjListViewItem.SubItems.Add(ObItens.Quantidade.ToString());
                    ObjListViewItem.SubItems.Add(ObItens.UnidadeMedida);
                    ObjListViewItem.SubItems.Add(ObItens.NumeroUnidades.ToString());
                    ObjListViewItem.SubItems.Add(ObItens.UnidadeAgrupamento);
                    ObjListViewItem.SubItems.Add(ObItens.ValorUnitario.ToString("R$ 0.00"));
                    ObjListViewItem.SubItems.Add(ObItens.valortotal.ToString("R$ 0.00"));

                    ListaItens.Add(ObItens);
                    lstItens.Items.Add(ObjListViewItem);
                }
                else
                {
                    MessageBox.Show("Selecione um item da lista");
                }
            }
        }

        private void btnAtualizarCli_Click(object sender, EventArgs e)
        {
            Dados ObjDados = new Dados();
            Dados.Pessoa ObjPessoa = ObjDados.ConsultaPessoaCodPess(CodPessoaPesquisada);
            txCliente.Text = ObjPessoa.CodPessoa.ToString() + " - " + ObjPessoa.CPF + " - " + ObjPessoa.Nome;
            
            //Buscar cliente no banco e colocar no devido campo
        }
        Orcamento ObjOrcamento = new Orcamento();
        private void btnConcluirEstima_Click(object sender, EventArgs e)
        {
            try
            {
                //////
                if (!string.IsNullOrEmpty(txMaoObra.Text))
                {
                    txValorTotal.Text = RegrasNegocio.PrecoTotalOrcamento2(ListaItens, double.Parse(txMaoObra.Text)).ToString("R$ 0.00");
                    //ObjOrcamento
                    if (codProfissao == 1)
                    {
                        ObjOrcamento.CodCliente = CodPessoaPesquisada;
                        ObjOrcamento.CodProfissional = CodPessoa;
                    }else if(codOrcamento == 2)
                    {
                        ObjOrcamento.CodCliente = CodPessoa;
                        ObjOrcamento.CodProfissional = CodPessoaPesquisada;
                    }
                    
                    ObjOrcamento.DataEmissão = dtEmissao.Value;
                    ObjOrcamento.Validade = dtValidade.Value;
                    ObjOrcamento.Observacoes = txObs.Text;
                    ObjOrcamento.MaoDeObra = double.Parse(txMaoObra.Text);
                    ObjOrcamento.ValorTotal = RegrasNegocio.PrecoTotalOrcamento2(ListaItens, double.Parse(txMaoObra.Text));

                    btnGerarOrc.Enabled = true;
                    btnAtualizarCli.Enabled = false;
                    btnPesquisarCli.Enabled = false;
                    btnIncluirItem.Enabled = false;
                    btnLevantarMateriais.Enabled = false;
                    btnNovo.Enabled = true;


                }
                else
                {
                    MessageBox.Show("Digite o valor da mão de obra");
                }
            }
            catch (Exception Exc)
            {

                MessageBox.Show("Erro: "+Exc.Message);
            }

        }

        private void btnGerarOrc_Click(object sender, EventArgs e)
        {
            Dados ObjDados = new Dados();
            try
            {
                ObjDados.InserirOrcamento(ObjOrcamento.Observacoes, ObjOrcamento.MaoDeObra, ObjOrcamento.ValorTotal, ObjOrcamento.DataEmissão, ObjOrcamento.Validade, ObjOrcamento.CodCliente, ObjOrcamento.CodProfissional);
                codOrcamento = ObjDados.Consulta_UltimoOrcamentoCadastrado();
                foreach (Itens_orcamento item in ListaItens)
                {
                    ObjDados.InserirDescricao_Orcamento(codOrcamento, item.CodMaterial, item.Item, item.Quantidade, item.UnidadeMedida, item.NumeroUnidades, item.UnidadeAgrupamento, item.ValorUnitario);
                }
                foreach (int CodAtivi in ListaAtividades)
                {
                    ObjDados.InserirOrcamento_TipoAtividade(codOrcamento, CodAtivi);
                }
                btnNovo.Enabled = true;
                MessageBox.Show("Orçamento gerado com sucesso!");
            }
            catch (Exception Exc)
            {
                MessageBox.Show("Erro: " + Exc.Message);
            }
            
        }

        private void btnNovo_Click(object sender, EventArgs e)
        {
            txCliente.Enabled = false;
            txProfissional.Enabled = false;
            btnIncluirItem.Enabled = false;
            btnGerarOrc.Enabled = false;
            btnNovo.Enabled = false;
            btnPesquisarCli.Enabled = true;
            btnAtualizarCli.Enabled = true;
            btnLevantarMateriais.Enabled = true;
            cmbxAtividade.Enabled = true;
            cmbxAtividade.SelectedIndex = -1;
            controladorBotao = 0;
            lstMateriais.Items.Clear();
            lstAtividades.Clear();
            lstItens.Items.Clear();

            ControleListaAtividade_Piso = true;
            ControleListaAtividade_Pintura = true;
            ControleListaAtividade_Repintura = true;
            ControleListaAtividade_ColocarGramado = true;

            txMaoObra.Text = null;
            txValorTotal.Text = null;
            txAreaAtividade.Text = null;
            txPrecoUnitario.Text = null;
        }

        /// <summary>
        /// ///////////////////////////
        /// </summary>
        /*
        int controladorBotao = 0;
        private void button1_Click(object sender, EventArgs e)
        {
            
            if ((cmbxAtividade.SelectedIndex + 1) == 1)
            {
                    controladorBotao = controladorBotao + 1;
                if(controladorBotao == 1)
                {
                    MessageBox.Show("Escolha um piso");
                }else if (controladorBotao == 2)
                {
                    MessageBox.Show("Escolha um rejunte");
                }else if (controladorBotao == 3)
                {
                    MessageBox.Show("Escolha uma argamassa");
                }
                else
                {
                    controladorBotao = 0;
                }
                
            }else if ((cmbxAtividade.SelectedIndex + 1) == 2)
            {
                controladorBotao = controladorBotao + 1;
                if (controladorBotao == 1)
                {
                    MessageBox.Show("Escolha uma Tinta");
                }
                else if (controladorBotao == 2)
                {
                    MessageBox.Show("Escolha um Selador");
                }
                else if (controladorBotao == 3)
                {
                    MessageBox.Show("Escolha um Corante");
                }
                else if(controladorBotao==4)
                {
                    MessageBox.Show("Escolha um Fundo preparador");
                }
                else
                {
                    controladorBotao = 0;
                }
            }
            else if ((cmbxAtividade.SelectedIndex + 1) == 3)
            {
                controladorBotao = controladorBotao + 1;
                if (controladorBotao == 1)
                {
                    MessageBox.Show("Escolha um Gramado");
                }
                else if (controladorBotao == 2)
                {
                    MessageBox.Show("Escolha uma areia");
                }
                else
                {
                    controladorBotao = 0; ;
                }
            }
        }   */
    }
    public class Orcamento
    {
        public int CodCliente { get; set; }
        public int CodProfissional { get; set; }
        public DateTime DataEmissão { get; set; }
        public DateTime Validade { get; set; }
        public string Observacoes { get; set; }
        public double MaoDeObra { get; set; }
        public double ValorTotal { get; set; }

    }
    public class Itens_orcamento
    {
        public int CodOrcamento { get; set; }
        public int CodMaterial { get; set; }
        public string nomematerial { get; set; }
        public int Item { get; set; }
        public double Quantidade { get; set; }
        public string UnidadeMedida { get; set; }
        public int NumeroUnidades { get; set; }
        public string UnidadeAgrupamento { get; set; }
        public double ValorUnitario { get; set; }
        public double valortotal { get; set; }
    }
    public class Orcamento_TipoAtividade
    {
        public int CodTipo { get; set; }
    }
}
