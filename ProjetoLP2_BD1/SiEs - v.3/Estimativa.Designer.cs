namespace SiEs___v._2
{
    partial class Estimativa
    {
        /// <summary>
        /// Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        /// Required method for Designer support - do not modify
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            this.label1 = new System.Windows.Forms.Label();
            this.cmbxAtividade = new System.Windows.Forms.ComboBox();
            this.lstMateriais = new System.Windows.Forms.ListView();
            this.CodMat = ((System.Windows.Forms.ColumnHeader)(new System.Windows.Forms.ColumnHeader()));
            this.Material = ((System.Windows.Forms.ColumnHeader)(new System.Windows.Forms.ColumnHeader()));
            this.btnLevantarMateriais = new System.Windows.Forms.Button();
            this.lstItens = new System.Windows.Forms.ListView();
            this.columnHeader1 = ((System.Windows.Forms.ColumnHeader)(new System.Windows.Forms.ColumnHeader()));
            this.columnHeader2 = ((System.Windows.Forms.ColumnHeader)(new System.Windows.Forms.ColumnHeader()));
            this.columnHeader3 = ((System.Windows.Forms.ColumnHeader)(new System.Windows.Forms.ColumnHeader()));
            this.columnHeader4 = ((System.Windows.Forms.ColumnHeader)(new System.Windows.Forms.ColumnHeader()));
            this.columnHeader5 = ((System.Windows.Forms.ColumnHeader)(new System.Windows.Forms.ColumnHeader()));
            this.columnHeader6 = ((System.Windows.Forms.ColumnHeader)(new System.Windows.Forms.ColumnHeader()));
            this.columnHeader7 = ((System.Windows.Forms.ColumnHeader)(new System.Windows.Forms.ColumnHeader()));
            this.columnHeader8 = ((System.Windows.Forms.ColumnHeader)(new System.Windows.Forms.ColumnHeader()));
            this.columnHeader9 = ((System.Windows.Forms.ColumnHeader)(new System.Windows.Forms.ColumnHeader()));
            this.label2 = new System.Windows.Forms.Label();
            this.txPrecoUnitario = new System.Windows.Forms.TextBox();
            this.btnIncluirItem = new System.Windows.Forms.Button();
            this.label3 = new System.Windows.Forms.Label();
            this.txMaoObra = new System.Windows.Forms.TextBox();
            this.txValorTotal = new System.Windows.Forms.TextBox();
            this.label4 = new System.Windows.Forms.Label();
            this.txObs = new System.Windows.Forms.TextBox();
            this.label5 = new System.Windows.Forms.Label();
            this.dtEmissao = new System.Windows.Forms.DateTimePicker();
            this.label6 = new System.Windows.Forms.Label();
            this.label7 = new System.Windows.Forms.Label();
            this.dtValidade = new System.Windows.Forms.DateTimePicker();
            this.txCliente = new System.Windows.Forms.TextBox();
            this.label9 = new System.Windows.Forms.Label();
            this.txProfissional = new System.Windows.Forms.TextBox();
            this.btnPesquisarCli = new System.Windows.Forms.Button();
            this.btnAtualizarCli = new System.Windows.Forms.Button();
            this.txAreaAtividade = new System.Windows.Forms.TextBox();
            this.label10 = new System.Windows.Forms.Label();
            this.btnGerarOrc = new System.Windows.Forms.Button();
            this.btnConcluirEstima = new System.Windows.Forms.Button();
            this.lstAtividades = new System.Windows.Forms.ListView();
            this.label8 = new System.Windows.Forms.Label();
            this.label11 = new System.Windows.Forms.Label();
            this.btnNovo = new System.Windows.Forms.Button();
            this.label12 = new System.Windows.Forms.Label();
            this.btnSair = new System.Windows.Forms.Button();
            this.groupBox1 = new System.Windows.Forms.GroupBox();
            this.groupBox1.SuspendLayout();
            this.SuspendLayout();
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Font = new System.Drawing.Font("Microsoft Sans Serif", 14F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label1.Location = new System.Drawing.Point(334, 22);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(93, 24);
            this.label1.TabIndex = 0;
            this.label1.Text = "Estimativa";
            // 
            // cmbxAtividade
            // 
            this.cmbxAtividade.FormattingEnabled = true;
            this.cmbxAtividade.Items.AddRange(new object[] {
            "Piso",
            "Pintura",
            "Repintura",
            "Gramado"});
            this.cmbxAtividade.Location = new System.Drawing.Point(62, 90);
            this.cmbxAtividade.Name = "cmbxAtividade";
            this.cmbxAtividade.Size = new System.Drawing.Size(230, 24);
            this.cmbxAtividade.TabIndex = 1;
            this.cmbxAtividade.Text = "Atividade";
            // 
            // lstMateriais
            // 
            this.lstMateriais.Columns.AddRange(new System.Windows.Forms.ColumnHeader[] {
            this.CodMat,
            this.Material});
            this.lstMateriais.FullRowSelect = true;
            this.lstMateriais.GridLines = true;
            this.lstMateriais.Location = new System.Drawing.Point(372, 30);
            this.lstMateriais.MultiSelect = false;
            this.lstMateriais.Name = "lstMateriais";
            this.lstMateriais.Size = new System.Drawing.Size(359, 103);
            this.lstMateriais.TabIndex = 3;
            this.lstMateriais.UseCompatibleStateImageBehavior = false;
            this.lstMateriais.View = System.Windows.Forms.View.Details;
            // 
            // CodMat
            // 
            this.CodMat.Text = "Cod";
            this.CodMat.Width = 38;
            // 
            // Material
            // 
            this.Material.Text = "Material";
            this.Material.Width = 321;
            // 
            // btnLevantarMateriais
            // 
            this.btnLevantarMateriais.Font = new System.Drawing.Font("Microsoft Sans Serif", 10F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btnLevantarMateriais.Location = new System.Drawing.Point(62, 117);
            this.btnLevantarMateriais.Name = "btnLevantarMateriais";
            this.btnLevantarMateriais.Size = new System.Drawing.Size(230, 33);
            this.btnLevantarMateriais.TabIndex = 4;
            this.btnLevantarMateriais.Text = "Levantar Materiais";
            this.btnLevantarMateriais.UseVisualStyleBackColor = true;
            this.btnLevantarMateriais.Click += new System.EventHandler(this.btnLevantarMateriais_Click);
            // 
            // lstItens
            // 
            this.lstItens.Columns.AddRange(new System.Windows.Forms.ColumnHeader[] {
            this.columnHeader1,
            this.columnHeader2,
            this.columnHeader3,
            this.columnHeader4,
            this.columnHeader5,
            this.columnHeader6,
            this.columnHeader7,
            this.columnHeader8,
            this.columnHeader9});
            this.lstItens.Location = new System.Drawing.Point(56, 426);
            this.lstItens.Name = "lstItens";
            this.lstItens.Size = new System.Drawing.Size(831, 132);
            this.lstItens.TabIndex = 5;
            this.lstItens.UseCompatibleStateImageBehavior = false;
            this.lstItens.View = System.Windows.Forms.View.Details;
            // 
            // columnHeader1
            // 
            this.columnHeader1.Text = "Cod";
            this.columnHeader1.Width = 34;
            // 
            // columnHeader2
            // 
            this.columnHeader2.Text = "Item";
            this.columnHeader2.Width = 33;
            // 
            // columnHeader3
            // 
            this.columnHeader3.Text = "Nome do Material";
            this.columnHeader3.Width = 263;
            // 
            // columnHeader4
            // 
            this.columnHeader4.Text = "Qtd. Total";
            this.columnHeader4.Width = 61;
            // 
            // columnHeader5
            // 
            this.columnHeader5.Text = "Un. Medida";
            this.columnHeader5.Width = 73;
            // 
            // columnHeader6
            // 
            this.columnHeader6.Text = "Qtd. Pacotes/Cx";
            this.columnHeader6.Width = 92;
            // 
            // columnHeader7
            // 
            this.columnHeader7.Text = "Un. Agrupamento";
            this.columnHeader7.Width = 102;
            // 
            // columnHeader8
            // 
            this.columnHeader8.Text = "Valor Unitário";
            this.columnHeader8.Width = 84;
            // 
            // columnHeader9
            // 
            this.columnHeader9.Text = "Valor Total";
            this.columnHeader9.Width = 79;
            // 
            // label2
            // 
            this.label2.AutoSize = true;
            this.label2.Location = new System.Drawing.Point(369, 142);
            this.label2.Name = "label2";
            this.label2.Size = new System.Drawing.Size(93, 17);
            this.label2.TabIndex = 6;
            this.label2.Text = "Preço Unitáio";
            // 
            // txPrecoUnitario
            // 
            this.txPrecoUnitario.Location = new System.Drawing.Point(468, 139);
            this.txPrecoUnitario.Name = "txPrecoUnitario";
            this.txPrecoUnitario.Size = new System.Drawing.Size(88, 23);
            this.txPrecoUnitario.TabIndex = 7;
            // 
            // btnIncluirItem
            // 
            this.btnIncluirItem.Font = new System.Drawing.Font("Microsoft Sans Serif", 10F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btnIncluirItem.Location = new System.Drawing.Point(564, 137);
            this.btnIncluirItem.Name = "btnIncluirItem";
            this.btnIncluirItem.Size = new System.Drawing.Size(167, 34);
            this.btnIncluirItem.TabIndex = 8;
            this.btnIncluirItem.Text = "Incluir Item";
            this.btnIncluirItem.UseVisualStyleBackColor = true;
            this.btnIncluirItem.Click += new System.EventHandler(this.btnIncluirItem_Click);
            // 
            // label3
            // 
            this.label3.AutoSize = true;
            this.label3.Font = new System.Drawing.Font("Microsoft Sans Serif", 10F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label3.Location = new System.Drawing.Point(53, 564);
            this.label3.Name = "label3";
            this.label3.Size = new System.Drawing.Size(91, 17);
            this.label3.TabIndex = 9;
            this.label3.Text = "Mão de Obra";
            // 
            // txMaoObra
            // 
            this.txMaoObra.Font = new System.Drawing.Font("Microsoft Sans Serif", 10F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.txMaoObra.Location = new System.Drawing.Point(150, 561);
            this.txMaoObra.Name = "txMaoObra";
            this.txMaoObra.Size = new System.Drawing.Size(115, 23);
            this.txMaoObra.TabIndex = 10;
            // 
            // txValorTotal
            // 
            this.txValorTotal.Font = new System.Drawing.Font("Microsoft Sans Serif", 14F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.txValorTotal.Location = new System.Drawing.Point(787, 587);
            this.txValorTotal.Name = "txValorTotal";
            this.txValorTotal.Size = new System.Drawing.Size(100, 29);
            this.txValorTotal.TabIndex = 11;
            // 
            // label4
            // 
            this.label4.AutoSize = true;
            this.label4.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label4.Location = new System.Drawing.Point(792, 564);
            this.label4.Name = "label4";
            this.label4.Size = new System.Drawing.Size(85, 20);
            this.label4.TabIndex = 12;
            this.label4.Text = "Valor Total";
            // 
            // txObs
            // 
            this.txObs.Font = new System.Drawing.Font("Microsoft Sans Serif", 10F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.txObs.Location = new System.Drawing.Point(93, 590);
            this.txObs.Multiline = true;
            this.txObs.Name = "txObs";
            this.txObs.Size = new System.Drawing.Size(666, 39);
            this.txObs.TabIndex = 13;
            // 
            // label5
            // 
            this.label5.AutoSize = true;
            this.label5.Font = new System.Drawing.Font("Microsoft Sans Serif", 10F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label5.Location = new System.Drawing.Point(53, 593);
            this.label5.Name = "label5";
            this.label5.Size = new System.Drawing.Size(38, 17);
            this.label5.TabIndex = 14;
            this.label5.Text = "Obs:";
            // 
            // dtEmissao
            // 
            this.dtEmissao.Location = new System.Drawing.Point(147, 278);
            this.dtEmissao.Name = "dtEmissao";
            this.dtEmissao.Size = new System.Drawing.Size(209, 20);
            this.dtEmissao.TabIndex = 15;
            // 
            // label6
            // 
            this.label6.AutoSize = true;
            this.label6.Font = new System.Drawing.Font("Microsoft Sans Serif", 10F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label6.Location = new System.Drawing.Point(84, 278);
            this.label6.Name = "label6";
            this.label6.Size = new System.Drawing.Size(61, 17);
            this.label6.TabIndex = 16;
            this.label6.Text = "Emissão";
            // 
            // label7
            // 
            this.label7.AutoSize = true;
            this.label7.Font = new System.Drawing.Font("Microsoft Sans Serif", 10F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label7.Location = new System.Drawing.Point(364, 278);
            this.label7.Name = "label7";
            this.label7.Size = new System.Drawing.Size(63, 17);
            this.label7.TabIndex = 17;
            this.label7.Text = "Validade";
            // 
            // dtValidade
            // 
            this.dtValidade.Location = new System.Drawing.Point(433, 278);
            this.dtValidade.Name = "dtValidade";
            this.dtValidade.Size = new System.Drawing.Size(224, 20);
            this.dtValidade.TabIndex = 18;
            // 
            // txCliente
            // 
            this.txCliente.Font = new System.Drawing.Font("Microsoft Sans Serif", 10F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.txCliente.Location = new System.Drawing.Point(170, 339);
            this.txCliente.Name = "txCliente";
            this.txCliente.Size = new System.Drawing.Size(487, 23);
            this.txCliente.TabIndex = 20;
            // 
            // label9
            // 
            this.label9.AutoSize = true;
            this.label9.Font = new System.Drawing.Font("Microsoft Sans Serif", 10F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label9.Location = new System.Drawing.Point(83, 316);
            this.label9.Name = "label9";
            this.label9.Size = new System.Drawing.Size(81, 17);
            this.label9.TabIndex = 21;
            this.label9.Text = "Profissional";
            // 
            // txProfissional
            // 
            this.txProfissional.Font = new System.Drawing.Font("Microsoft Sans Serif", 10F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.txProfissional.Location = new System.Drawing.Point(170, 313);
            this.txProfissional.Name = "txProfissional";
            this.txProfissional.Size = new System.Drawing.Size(487, 23);
            this.txProfissional.TabIndex = 22;
            // 
            // btnPesquisarCli
            // 
            this.btnPesquisarCli.Font = new System.Drawing.Font("Microsoft Sans Serif", 10F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btnPesquisarCli.Location = new System.Drawing.Point(365, 365);
            this.btnPesquisarCli.Name = "btnPesquisarCli";
            this.btnPesquisarCli.Size = new System.Drawing.Size(143, 36);
            this.btnPesquisarCli.TabIndex = 23;
            this.btnPesquisarCli.Text = "Pesquisar";
            this.btnPesquisarCli.UseVisualStyleBackColor = true;
            this.btnPesquisarCli.Click += new System.EventHandler(this.btnPesquisarCli_Click);
            // 
            // btnAtualizarCli
            // 
            this.btnAtualizarCli.Font = new System.Drawing.Font("Microsoft Sans Serif", 10F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btnAtualizarCli.Location = new System.Drawing.Point(514, 365);
            this.btnAtualizarCli.Name = "btnAtualizarCli";
            this.btnAtualizarCli.Size = new System.Drawing.Size(143, 36);
            this.btnAtualizarCli.TabIndex = 24;
            this.btnAtualizarCli.Text = "Atualizar Campo";
            this.btnAtualizarCli.UseVisualStyleBackColor = true;
            this.btnAtualizarCli.Click += new System.EventHandler(this.btnAtualizarCli_Click);
            // 
            // txAreaAtividade
            // 
            this.txAreaAtividade.Location = new System.Drawing.Point(208, 30);
            this.txAreaAtividade.Name = "txAreaAtividade";
            this.txAreaAtividade.Size = new System.Drawing.Size(100, 23);
            this.txAreaAtividade.TabIndex = 25;
            // 
            // label10
            // 
            this.label10.AutoSize = true;
            this.label10.Location = new System.Drawing.Point(19, 33);
            this.label10.Name = "label10";
            this.label10.Size = new System.Drawing.Size(183, 17);
            this.label10.TabIndex = 26;
            this.label10.Text = "Área a ser Calculada em M²";
            // 
            // btnGerarOrc
            // 
            this.btnGerarOrc.Font = new System.Drawing.Font("Microsoft Sans Serif", 10F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btnGerarOrc.Location = new System.Drawing.Point(479, 645);
            this.btnGerarOrc.Name = "btnGerarOrc";
            this.btnGerarOrc.Size = new System.Drawing.Size(132, 62);
            this.btnGerarOrc.TabIndex = 27;
            this.btnGerarOrc.Text = "Gerar Orçamento";
            this.btnGerarOrc.UseVisualStyleBackColor = true;
            this.btnGerarOrc.Click += new System.EventHandler(this.btnGerarOrc_Click);
            // 
            // btnConcluirEstima
            // 
            this.btnConcluirEstima.Font = new System.Drawing.Font("Microsoft Sans Serif", 10F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btnConcluirEstima.Location = new System.Drawing.Point(341, 645);
            this.btnConcluirEstima.Name = "btnConcluirEstima";
            this.btnConcluirEstima.Size = new System.Drawing.Size(132, 62);
            this.btnConcluirEstima.TabIndex = 29;
            this.btnConcluirEstima.Text = "Concluir Estimativa";
            this.btnConcluirEstima.UseVisualStyleBackColor = true;
            this.btnConcluirEstima.Click += new System.EventHandler(this.btnConcluirEstima_Click);
            // 
            // lstAtividades
            // 
            this.lstAtividades.Font = new System.Drawing.Font("Microsoft Sans Serif", 10F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lstAtividades.Location = new System.Drawing.Point(686, 298);
            this.lstAtividades.Name = "lstAtividades";
            this.lstAtividades.Size = new System.Drawing.Size(201, 106);
            this.lstAtividades.TabIndex = 30;
            this.lstAtividades.UseCompatibleStateImageBehavior = false;
            this.lstAtividades.View = System.Windows.Forms.View.List;
            // 
            // label8
            // 
            this.label8.AutoSize = true;
            this.label8.Font = new System.Drawing.Font("Microsoft Sans Serif", 10F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label8.Location = new System.Drawing.Point(84, 342);
            this.label8.Name = "label8";
            this.label8.Size = new System.Drawing.Size(51, 17);
            this.label8.TabIndex = 19;
            this.label8.Text = "Cliente";
            // 
            // label11
            // 
            this.label11.AutoSize = true;
            this.label11.Font = new System.Drawing.Font("Microsoft Sans Serif", 10F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label11.Location = new System.Drawing.Point(745, 278);
            this.label11.Name = "label11";
            this.label11.Size = new System.Drawing.Size(73, 17);
            this.label11.TabIndex = 31;
            this.label11.Text = "Atividades";
            // 
            // btnNovo
            // 
            this.btnNovo.Font = new System.Drawing.Font("Microsoft Sans Serif", 10F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btnNovo.Location = new System.Drawing.Point(617, 645);
            this.btnNovo.Name = "btnNovo";
            this.btnNovo.Size = new System.Drawing.Size(132, 62);
            this.btnNovo.TabIndex = 46;
            this.btnNovo.Text = "Novo";
            this.btnNovo.UseVisualStyleBackColor = true;
            this.btnNovo.Click += new System.EventHandler(this.btnNovo_Click);
            // 
            // label12
            // 
            this.label12.AutoSize = true;
            this.label12.Location = new System.Drawing.Point(59, 71);
            this.label12.Name = "label12";
            this.label12.Size = new System.Drawing.Size(135, 17);
            this.label12.TabIndex = 47;
            this.label12.Text = "Escolha a atividade:";
            // 
            // btnSair
            // 
            this.btnSair.Font = new System.Drawing.Font("Microsoft Sans Serif", 10F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btnSair.Location = new System.Drawing.Point(755, 645);
            this.btnSair.Name = "btnSair";
            this.btnSair.Size = new System.Drawing.Size(132, 62);
            this.btnSair.TabIndex = 48;
            this.btnSair.Text = "Sair";
            this.btnSair.UseVisualStyleBackColor = true;
            this.btnSair.Click += new System.EventHandler(this.btnSair_Click);
            // 
            // groupBox1
            // 
            this.groupBox1.Controls.Add(this.lstMateriais);
            this.groupBox1.Controls.Add(this.label12);
            this.groupBox1.Controls.Add(this.label2);
            this.groupBox1.Controls.Add(this.txPrecoUnitario);
            this.groupBox1.Controls.Add(this.btnIncluirItem);
            this.groupBox1.Controls.Add(this.cmbxAtividade);
            this.groupBox1.Controls.Add(this.label10);
            this.groupBox1.Controls.Add(this.txAreaAtividade);
            this.groupBox1.Controls.Add(this.btnLevantarMateriais);
            this.groupBox1.Font = new System.Drawing.Font("Microsoft Sans Serif", 10F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.groupBox1.Location = new System.Drawing.Point(87, 60);
            this.groupBox1.Name = "groupBox1";
            this.groupBox1.Size = new System.Drawing.Size(757, 200);
            this.groupBox1.TabIndex = 49;
            this.groupBox1.TabStop = false;
            this.groupBox1.Text = "Preencha estas areas de acordo com as informações";
            // 
            // Estimativa
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(946, 719);
            this.Controls.Add(this.btnSair);
            this.Controls.Add(this.btnNovo);
            this.Controls.Add(this.label11);
            this.Controls.Add(this.lstAtividades);
            this.Controls.Add(this.btnConcluirEstima);
            this.Controls.Add(this.btnGerarOrc);
            this.Controls.Add(this.btnAtualizarCli);
            this.Controls.Add(this.btnPesquisarCli);
            this.Controls.Add(this.txProfissional);
            this.Controls.Add(this.label9);
            this.Controls.Add(this.txCliente);
            this.Controls.Add(this.label8);
            this.Controls.Add(this.dtValidade);
            this.Controls.Add(this.label7);
            this.Controls.Add(this.label6);
            this.Controls.Add(this.dtEmissao);
            this.Controls.Add(this.label5);
            this.Controls.Add(this.txObs);
            this.Controls.Add(this.label4);
            this.Controls.Add(this.txValorTotal);
            this.Controls.Add(this.txMaoObra);
            this.Controls.Add(this.label3);
            this.Controls.Add(this.lstItens);
            this.Controls.Add(this.label1);
            this.Controls.Add(this.groupBox1);
            this.FormBorderStyle = System.Windows.Forms.FormBorderStyle.FixedSingle;
            this.Name = "Estimativa";
            this.StartPosition = System.Windows.Forms.FormStartPosition.CenterScreen;
            this.Text = "Estimativa";
            this.Load += new System.EventHandler(this.Estimativa_Load);
            this.groupBox1.ResumeLayout(false);
            this.groupBox1.PerformLayout();
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.ComboBox cmbxAtividade;
        private System.Windows.Forms.ListView lstMateriais;
        private System.Windows.Forms.Button btnLevantarMateriais;
        private System.Windows.Forms.ColumnHeader CodMat;
        private System.Windows.Forms.ColumnHeader Material;
        private System.Windows.Forms.ListView lstItens;
        private System.Windows.Forms.Label label2;
        private System.Windows.Forms.TextBox txPrecoUnitario;
        private System.Windows.Forms.Button btnIncluirItem;
        private System.Windows.Forms.Label label3;
        private System.Windows.Forms.TextBox txMaoObra;
        private System.Windows.Forms.TextBox txValorTotal;
        private System.Windows.Forms.Label label4;
        private System.Windows.Forms.TextBox txObs;
        private System.Windows.Forms.Label label5;
        private System.Windows.Forms.DateTimePicker dtEmissao;
        private System.Windows.Forms.Label label6;
        private System.Windows.Forms.Label label7;
        private System.Windows.Forms.DateTimePicker dtValidade;
        private System.Windows.Forms.TextBox txCliente;
        private System.Windows.Forms.Label label9;
        private System.Windows.Forms.TextBox txProfissional;
        private System.Windows.Forms.Button btnPesquisarCli;
        private System.Windows.Forms.Button btnAtualizarCli;
        private System.Windows.Forms.TextBox txAreaAtividade;
        private System.Windows.Forms.Label label10;
        private System.Windows.Forms.Button btnGerarOrc;
        private System.Windows.Forms.Button btnConcluirEstima;
        private System.Windows.Forms.ListView lstAtividades;
        private System.Windows.Forms.Label label8;
        private System.Windows.Forms.Label label11;
        private System.Windows.Forms.ColumnHeader columnHeader1;
        private System.Windows.Forms.ColumnHeader columnHeader2;
        private System.Windows.Forms.ColumnHeader columnHeader3;
        private System.Windows.Forms.ColumnHeader columnHeader4;
        private System.Windows.Forms.ColumnHeader columnHeader5;
        private System.Windows.Forms.ColumnHeader columnHeader6;
        private System.Windows.Forms.ColumnHeader columnHeader7;
        private System.Windows.Forms.ColumnHeader columnHeader8;
        private System.Windows.Forms.ColumnHeader columnHeader9;
        private System.Windows.Forms.Button btnNovo;
        private System.Windows.Forms.Label label12;
        private System.Windows.Forms.Button btnSair;
        private System.Windows.Forms.GroupBox groupBox1;
    }
}