namespace SiEs___v._2
{
    partial class PesqPessoa
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
            this.lstPessoa = new System.Windows.Forms.ListView();
            this.cod = ((System.Windows.Forms.ColumnHeader)(new System.Windows.Forms.ColumnHeader()));
            this.nome = ((System.Windows.Forms.ColumnHeader)(new System.Windows.Forms.ColumnHeader()));
            this.rg = ((System.Windows.Forms.ColumnHeader)(new System.Windows.Forms.ColumnHeader()));
            this.cpf = ((System.Windows.Forms.ColumnHeader)(new System.Windows.Forms.ColumnHeader()));
            this.endereco = ((System.Windows.Forms.ColumnHeader)(new System.Windows.Forms.ColumnHeader()));
            this.btnMaisInf = new System.Windows.Forms.Button();
            this.SuspendLayout();
            // 
            // lstPessoa
            // 
            this.lstPessoa.Columns.AddRange(new System.Windows.Forms.ColumnHeader[] {
            this.cod,
            this.nome,
            this.rg,
            this.cpf,
            this.endereco});
            this.lstPessoa.FullRowSelect = true;
            this.lstPessoa.GridLines = true;
            this.lstPessoa.Location = new System.Drawing.Point(31, 49);
            this.lstPessoa.MultiSelect = false;
            this.lstPessoa.Name = "lstPessoa";
            this.lstPessoa.Size = new System.Drawing.Size(990, 511);
            this.lstPessoa.TabIndex = 0;
            this.lstPessoa.UseCompatibleStateImageBehavior = false;
            this.lstPessoa.View = System.Windows.Forms.View.Details;
            this.lstPessoa.SelectedIndexChanged += new System.EventHandler(this.lstPessoa_SelectedIndexChanged);
            // 
            // cod
            // 
            this.cod.Text = "Cod";
            this.cod.Width = 31;
            // 
            // nome
            // 
            this.nome.Text = "Nome";
            this.nome.Width = 233;
            // 
            // rg
            // 
            this.rg.Text = "RG";
            this.rg.Width = 119;
            // 
            // cpf
            // 
            this.cpf.Text = "CPF";
            this.cpf.Width = 128;
            // 
            // endereco
            // 
            this.endereco.Text = "Endereço";
            this.endereco.Width = 471;
            // 
            // btnMaisInf
            // 
            this.btnMaisInf.Location = new System.Drawing.Point(712, 582);
            this.btnMaisInf.Name = "btnMaisInf";
            this.btnMaisInf.Size = new System.Drawing.Size(156, 47);
            this.btnMaisInf.TabIndex = 1;
            this.btnMaisInf.Text = "Mais Informações";
            this.btnMaisInf.UseVisualStyleBackColor = true;
            this.btnMaisInf.Click += new System.EventHandler(this.btnMaisInf_Click);
            // 
            // PesqPessoa
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(1067, 641);
            this.Controls.Add(this.btnMaisInf);
            this.Controls.Add(this.lstPessoa);
            this.Name = "PesqPessoa";
            this.Text = "PesqPessoa";
            this.Load += new System.EventHandler(this.PesqPessoa_Load);
            this.ResumeLayout(false);

        }

        #endregion

        private System.Windows.Forms.ListView lstPessoa;
        private System.Windows.Forms.ColumnHeader cod;
        private System.Windows.Forms.ColumnHeader nome;
        private System.Windows.Forms.ColumnHeader rg;
        private System.Windows.Forms.ColumnHeader cpf;
        private System.Windows.Forms.ColumnHeader endereco;
        private System.Windows.Forms.Button btnMaisInf;
    }
}