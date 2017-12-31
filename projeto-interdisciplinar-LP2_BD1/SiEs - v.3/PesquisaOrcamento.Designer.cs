namespace SiEs___v._2
{
    partial class PesquisaOrcamento
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
            this.lstOrcamento = new System.Windows.Forms.ListView();
            this.columnHeader1 = ((System.Windows.Forms.ColumnHeader)(new System.Windows.Forms.ColumnHeader()));
            this.columnHeader2 = ((System.Windows.Forms.ColumnHeader)(new System.Windows.Forms.ColumnHeader()));
            this.columnHeader3 = ((System.Windows.Forms.ColumnHeader)(new System.Windows.Forms.ColumnHeader()));
            this.columnHeader4 = ((System.Windows.Forms.ColumnHeader)(new System.Windows.Forms.ColumnHeader()));
            this.columnHeader5 = ((System.Windows.Forms.ColumnHeader)(new System.Windows.Forms.ColumnHeader()));
            this.columnHeader6 = ((System.Windows.Forms.ColumnHeader)(new System.Windows.Forms.ColumnHeader()));
            this.columnHeader7 = ((System.Windows.Forms.ColumnHeader)(new System.Windows.Forms.ColumnHeader()));
            this.columnHeader8 = ((System.Windows.Forms.ColumnHeader)(new System.Windows.Forms.ColumnHeader()));
            this.label1 = new System.Windows.Forms.Label();
            this.btnDetalhe = new System.Windows.Forms.Button();
            this.btnOrdenarMaisCaro = new System.Windows.Forms.Button();
            this.btnOrdenarPeloMaisBarato = new System.Windows.Forms.Button();
            this.btnSair = new System.Windows.Forms.Button();
            this.SuspendLayout();
            // 
            // lstOrcamento
            // 
            this.lstOrcamento.Columns.AddRange(new System.Windows.Forms.ColumnHeader[] {
            this.columnHeader1,
            this.columnHeader2,
            this.columnHeader3,
            this.columnHeader4,
            this.columnHeader5,
            this.columnHeader6,
            this.columnHeader7,
            this.columnHeader8});
            this.lstOrcamento.Font = new System.Drawing.Font("Microsoft Sans Serif", 10F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lstOrcamento.FullRowSelect = true;
            this.lstOrcamento.GridLines = true;
            this.lstOrcamento.Location = new System.Drawing.Point(39, 74);
            this.lstOrcamento.MultiSelect = false;
            this.lstOrcamento.Name = "lstOrcamento";
            this.lstOrcamento.Size = new System.Drawing.Size(975, 507);
            this.lstOrcamento.TabIndex = 0;
            this.lstOrcamento.UseCompatibleStateImageBehavior = false;
            this.lstOrcamento.View = System.Windows.Forms.View.Details;
            this.lstOrcamento.SelectedIndexChanged += new System.EventHandler(this.lstOrcamento_SelectedIndexChanged);
            // 
            // columnHeader1
            // 
            this.columnHeader1.Text = "Cod";
            this.columnHeader1.Width = 40;
            // 
            // columnHeader2
            // 
            this.columnHeader2.Text = "Observações";
            this.columnHeader2.Width = 341;
            // 
            // columnHeader3
            // 
            this.columnHeader3.Text = "Data de Emissão";
            this.columnHeader3.Width = 96;
            // 
            // columnHeader4
            // 
            this.columnHeader4.Text = "Validade";
            this.columnHeader4.Width = 79;
            // 
            // columnHeader5
            // 
            this.columnHeader5.Text = "Cliente";
            this.columnHeader5.Width = 153;
            // 
            // columnHeader6
            // 
            this.columnHeader6.Text = "Profissional";
            this.columnHeader6.Width = 158;
            // 
            // columnHeader7
            // 
            this.columnHeader7.Text = "Mão de Obra";
            this.columnHeader7.Width = 88;
            // 
            // columnHeader8
            // 
            this.columnHeader8.Text = "Valor Total";
            this.columnHeader8.Width = 74;
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Font = new System.Drawing.Font("Microsoft Sans Serif", 16F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label1.Location = new System.Drawing.Point(359, 28);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(257, 26);
            this.label1.TabIndex = 1;
            this.label1.Text = "Pesquisa de Orçamentos";
            // 
            // btnDetalhe
            // 
            this.btnDetalhe.Font = new System.Drawing.Font("Microsoft Sans Serif", 10F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btnDetalhe.Location = new System.Drawing.Point(684, 587);
            this.btnDetalhe.Name = "btnDetalhe";
            this.btnDetalhe.Size = new System.Drawing.Size(162, 47);
            this.btnDetalhe.TabIndex = 2;
            this.btnDetalhe.Text = "Ver Detalhe";
            this.btnDetalhe.UseVisualStyleBackColor = true;
            this.btnDetalhe.Click += new System.EventHandler(this.btnDetalhe_Click);
            // 
            // btnOrdenarMaisCaro
            // 
            this.btnOrdenarMaisCaro.Font = new System.Drawing.Font("Microsoft Sans Serif", 10F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btnOrdenarMaisCaro.Location = new System.Drawing.Point(516, 587);
            this.btnOrdenarMaisCaro.Name = "btnOrdenarMaisCaro";
            this.btnOrdenarMaisCaro.Size = new System.Drawing.Size(162, 47);
            this.btnOrdenarMaisCaro.TabIndex = 3;
            this.btnOrdenarMaisCaro.Text = "Preço Decrescente";
            this.btnOrdenarMaisCaro.UseVisualStyleBackColor = true;
            this.btnOrdenarMaisCaro.Click += new System.EventHandler(this.btnOrdenarMaisCaro_Click);
            // 
            // btnOrdenarPeloMaisBarato
            // 
            this.btnOrdenarPeloMaisBarato.Font = new System.Drawing.Font("Microsoft Sans Serif", 10F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btnOrdenarPeloMaisBarato.Location = new System.Drawing.Point(348, 587);
            this.btnOrdenarPeloMaisBarato.Name = "btnOrdenarPeloMaisBarato";
            this.btnOrdenarPeloMaisBarato.Size = new System.Drawing.Size(162, 47);
            this.btnOrdenarPeloMaisBarato.TabIndex = 4;
            this.btnOrdenarPeloMaisBarato.Text = "Preço Crescente";
            this.btnOrdenarPeloMaisBarato.UseVisualStyleBackColor = true;
            this.btnOrdenarPeloMaisBarato.Click += new System.EventHandler(this.btnOrdenarPeloMaisBarato_Click);
            // 
            // btnSair
            // 
            this.btnSair.Font = new System.Drawing.Font("Microsoft Sans Serif", 10F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btnSair.Location = new System.Drawing.Point(852, 587);
            this.btnSair.Name = "btnSair";
            this.btnSair.Size = new System.Drawing.Size(162, 47);
            this.btnSair.TabIndex = 7;
            this.btnSair.Text = "Sair";
            this.btnSair.UseVisualStyleBackColor = true;
            this.btnSair.Click += new System.EventHandler(this.btnSair_Click);
            // 
            // PesquisaOrcamento
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(1052, 657);
            this.Controls.Add(this.btnSair);
            this.Controls.Add(this.btnOrdenarPeloMaisBarato);
            this.Controls.Add(this.btnOrdenarMaisCaro);
            this.Controls.Add(this.btnDetalhe);
            this.Controls.Add(this.label1);
            this.Controls.Add(this.lstOrcamento);
            this.FormBorderStyle = System.Windows.Forms.FormBorderStyle.FixedSingle;
            this.Name = "PesquisaOrcamento";
            this.StartPosition = System.Windows.Forms.FormStartPosition.CenterScreen;
            this.Text = "Pesquisa de Orcamentos";
            this.Load += new System.EventHandler(this.PesquisaOrcamento_Load);
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.ListView lstOrcamento;
        private System.Windows.Forms.ColumnHeader columnHeader1;
        private System.Windows.Forms.ColumnHeader columnHeader2;
        private System.Windows.Forms.ColumnHeader columnHeader3;
        private System.Windows.Forms.ColumnHeader columnHeader4;
        private System.Windows.Forms.ColumnHeader columnHeader5;
        private System.Windows.Forms.ColumnHeader columnHeader6;
        private System.Windows.Forms.ColumnHeader columnHeader7;
        private System.Windows.Forms.ColumnHeader columnHeader8;
        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.Button btnDetalhe;
        private System.Windows.Forms.Button btnOrdenarMaisCaro;
        private System.Windows.Forms.Button btnOrdenarPeloMaisBarato;
        private System.Windows.Forms.Button btnSair;
    }
}