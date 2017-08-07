namespace SiEs___v._2
{
    partial class CadastroTelefone
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
            this.txTelefone = new System.Windows.Forms.TextBox();
            this.btnAddTelef = new System.Windows.Forms.Button();
            this.lstTelef = new System.Windows.Forms.ListView();
            this.columnHeader1 = ((System.Windows.Forms.ColumnHeader)(new System.Windows.Forms.ColumnHeader()));
            this.columnHeader2 = ((System.Windows.Forms.ColumnHeader)(new System.Windows.Forms.ColumnHeader()));
            this.btnExcluir = new System.Windows.Forms.Button();
            this.txTipoTelef = new System.Windows.Forms.TextBox();
            this.label2 = new System.Windows.Forms.Label();
            this.SuspendLayout();
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Location = new System.Drawing.Point(49, 47);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(55, 13);
            this.label1.TabIndex = 0;
            this.label1.Text = "Telefone: ";
            // 
            // txTelefone
            // 
            this.txTelefone.Location = new System.Drawing.Point(110, 44);
            this.txTelefone.Name = "txTelefone";
            this.txTelefone.Size = new System.Drawing.Size(139, 20);
            this.txTelefone.TabIndex = 1;
            // 
            // btnAddTelef
            // 
            this.btnAddTelef.Location = new System.Drawing.Point(289, 33);
            this.btnAddTelef.Name = "btnAddTelef";
            this.btnAddTelef.Size = new System.Drawing.Size(75, 40);
            this.btnAddTelef.TabIndex = 2;
            this.btnAddTelef.Text = "Add Telefone";
            this.btnAddTelef.UseVisualStyleBackColor = true;
            this.btnAddTelef.Click += new System.EventHandler(this.btnAddTelef_Click);
            // 
            // lstTelef
            // 
            this.lstTelef.Columns.AddRange(new System.Windows.Forms.ColumnHeader[] {
            this.columnHeader1,
            this.columnHeader2});
            this.lstTelef.FullRowSelect = true;
            this.lstTelef.Location = new System.Drawing.Point(36, 142);
            this.lstTelef.MultiSelect = false;
            this.lstTelef.Name = "lstTelef";
            this.lstTelef.Size = new System.Drawing.Size(383, 182);
            this.lstTelef.TabIndex = 3;
            this.lstTelef.UseCompatibleStateImageBehavior = false;
            this.lstTelef.View = System.Windows.Forms.View.Details;
            // 
            // columnHeader1
            // 
            this.columnHeader1.Text = "";
            this.columnHeader1.Width = 0;
            // 
            // columnHeader2
            // 
            this.columnHeader2.Text = "Telefone  ---  Tipo de Telefone";
            this.columnHeader2.Width = 378;
            // 
            // btnExcluir
            // 
            this.btnExcluir.Location = new System.Drawing.Point(36, 341);
            this.btnExcluir.Name = "btnExcluir";
            this.btnExcluir.Size = new System.Drawing.Size(75, 40);
            this.btnExcluir.TabIndex = 4;
            this.btnExcluir.Text = "Excluir";
            this.btnExcluir.UseVisualStyleBackColor = true;
            this.btnExcluir.Click += new System.EventHandler(this.btnExcluir_Click);
            // 
            // txTipoTelef
            // 
            this.txTipoTelef.Location = new System.Drawing.Point(110, 70);
            this.txTipoTelef.Name = "txTipoTelef";
            this.txTipoTelef.Size = new System.Drawing.Size(139, 20);
            this.txTipoTelef.TabIndex = 5;
            // 
            // label2
            // 
            this.label2.AutoSize = true;
            this.label2.Location = new System.Drawing.Point(25, 73);
            this.label2.Name = "label2";
            this.label2.Size = new System.Drawing.Size(79, 13);
            this.label2.TabIndex = 6;
            this.label2.Text = "Tipo Telefone: ";
            // 
            // CadastroTelefone
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(452, 404);
            this.Controls.Add(this.label2);
            this.Controls.Add(this.txTipoTelef);
            this.Controls.Add(this.btnExcluir);
            this.Controls.Add(this.lstTelef);
            this.Controls.Add(this.btnAddTelef);
            this.Controls.Add(this.txTelefone);
            this.Controls.Add(this.label1);
            this.Name = "CadastroTelefone";
            this.Text = "CadastroTelefone";
            this.Load += new System.EventHandler(this.CadastroTelefone_Load);
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.TextBox txTelefone;
        private System.Windows.Forms.Button btnAddTelef;
        private System.Windows.Forms.ListView lstTelef;
        private System.Windows.Forms.Button btnExcluir;
        private System.Windows.Forms.TextBox txTipoTelef;
        private System.Windows.Forms.Label label2;
        private System.Windows.Forms.ColumnHeader columnHeader1;
        private System.Windows.Forms.ColumnHeader columnHeader2;
    }
}