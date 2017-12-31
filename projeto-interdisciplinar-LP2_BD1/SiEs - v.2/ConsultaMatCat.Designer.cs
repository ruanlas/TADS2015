namespace SiEs___v._2
{
    partial class ConsultaMatCat
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
            this.cboxCatMat = new System.Windows.Forms.ComboBox();
            this.label1 = new System.Windows.Forms.Label();
            this.lstVMateriais = new System.Windows.Forms.ListView();
            this.CodMaterial = ((System.Windows.Forms.ColumnHeader)(new System.Windows.Forms.ColumnHeader()));
            this.NomeMaterial = ((System.Windows.Forms.ColumnHeader)(new System.Windows.Forms.ColumnHeader()));
            this.Rendimento = ((System.Windows.Forms.ColumnHeader)(new System.Windows.Forms.ColumnHeader()));
            this.UnidadeRendimento = ((System.Windows.Forms.ColumnHeader)(new System.Windows.Forms.ColumnHeader()));
            this.Obs = ((System.Windows.Forms.ColumnHeader)(new System.Windows.Forms.ColumnHeader()));
            this.ConteudoEmbalagem = ((System.Windows.Forms.ColumnHeader)(new System.Windows.Forms.ColumnHeader()));
            this.UnidadeConteudo = ((System.Windows.Forms.ColumnHeader)(new System.Windows.Forms.ColumnHeader()));
            this.SuspendLayout();
            // 
            // cboxCatMat
            // 
            this.cboxCatMat.FormattingEnabled = true;
            this.cboxCatMat.Location = new System.Drawing.Point(136, 119);
            this.cboxCatMat.Name = "cboxCatMat";
            this.cboxCatMat.Size = new System.Drawing.Size(296, 21);
            this.cboxCatMat.TabIndex = 0;
            this.cboxCatMat.Text = "Selecione a categoria do material";
            this.cboxCatMat.SelectedIndexChanged += new System.EventHandler(this.cboxCatMat_SelectedIndexChanged);
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Font = new System.Drawing.Font("Microsoft Sans Serif", 14F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label1.Location = new System.Drawing.Point(116, 42);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(307, 24);
            this.label1.TabIndex = 2;
            this.label1.Text = "Consulta de Materiais por Categoria";
            // 
            // lstVMateriais
            // 
            this.lstVMateriais.Columns.AddRange(new System.Windows.Forms.ColumnHeader[] {
            this.CodMaterial,
            this.NomeMaterial,
            this.Rendimento,
            this.UnidadeRendimento,
            this.ConteudoEmbalagem,
            this.UnidadeConteudo,
            this.Obs});
            this.lstVMateriais.Location = new System.Drawing.Point(38, 161);
            this.lstVMateriais.Name = "lstVMateriais";
            this.lstVMateriais.Size = new System.Drawing.Size(938, 350);
            this.lstVMateriais.TabIndex = 3;
            this.lstVMateriais.UseCompatibleStateImageBehavior = false;
            this.lstVMateriais.View = System.Windows.Forms.View.Details;
            // 
            // CodMaterial
            // 
            this.CodMaterial.Text = "Cod";
            this.CodMaterial.Width = 34;
            // 
            // NomeMaterial
            // 
            this.NomeMaterial.Text = "Nome do Material";
            this.NomeMaterial.Width = 220;
            // 
            // Rendimento
            // 
            this.Rendimento.Text = "Rendimento";
            this.Rendimento.Width = 88;
            // 
            // UnidadeRendimento
            // 
            this.UnidadeRendimento.Text = "Und. Rendimento";
            this.UnidadeRendimento.Width = 101;
            // 
            // Obs
            // 
            this.Obs.Text = "Observações";
            this.Obs.Width = 205;
            // 
            // ConteudoEmbalagem
            // 
            this.ConteudoEmbalagem.Text = "Conteudo Emb.";
            this.ConteudoEmbalagem.Width = 94;
            // 
            // UnidadeConteudo
            // 
            this.UnidadeConteudo.Text = "Un. Cont. Embalagem";
            this.UnidadeConteudo.Width = 102;
            // 
            // ConsultaMatCat
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(1020, 580);
            this.Controls.Add(this.lstVMateriais);
            this.Controls.Add(this.label1);
            this.Controls.Add(this.cboxCatMat);
            this.Name = "ConsultaMatCat";
            this.Text = "ConsultaMatCat";
            this.Load += new System.EventHandler(this.ConsultaMatCat_Load);
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.ComboBox cboxCatMat;
        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.ListView lstVMateriais;
        private System.Windows.Forms.ColumnHeader CodMaterial;
        private System.Windows.Forms.ColumnHeader NomeMaterial;
        private System.Windows.Forms.ColumnHeader Rendimento;
        private System.Windows.Forms.ColumnHeader UnidadeRendimento;
        private System.Windows.Forms.ColumnHeader Obs;
        private System.Windows.Forms.ColumnHeader ConteudoEmbalagem;
        private System.Windows.Forms.ColumnHeader UnidadeConteudo;
    }
}