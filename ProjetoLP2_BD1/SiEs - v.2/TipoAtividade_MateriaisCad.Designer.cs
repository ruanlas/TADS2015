namespace SiEs___v._2
{
    partial class TipoAtividade_MateriaisCad
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
            this.lstMateriais = new System.Windows.Forms.ListView();
            this.CodMaterial = ((System.Windows.Forms.ColumnHeader)(new System.Windows.Forms.ColumnHeader()));
            this.Material = ((System.Windows.Forms.ColumnHeader)(new System.Windows.Forms.ColumnHeader()));
            this.lstAtividade = new System.Windows.Forms.ListView();
            this.Cod = ((System.Windows.Forms.ColumnHeader)(new System.Windows.Forms.ColumnHeader()));
            this.Atividade = ((System.Windows.Forms.ColumnHeader)(new System.Windows.Forms.ColumnHeader()));
            this.btnGravar = new System.Windows.Forms.Button();
            this.label1 = new System.Windows.Forms.Label();
            this.label2 = new System.Windows.Forms.Label();
            this.SuspendLayout();
            // 
            // lstMateriais
            // 
            this.lstMateriais.Columns.AddRange(new System.Windows.Forms.ColumnHeader[] {
            this.CodMaterial,
            this.Material});
            this.lstMateriais.FullRowSelect = true;
            this.lstMateriais.GridLines = true;
            this.lstMateriais.Location = new System.Drawing.Point(42, 68);
            this.lstMateriais.MultiSelect = false;
            this.lstMateriais.Name = "lstMateriais";
            this.lstMateriais.Size = new System.Drawing.Size(369, 308);
            this.lstMateriais.TabIndex = 0;
            this.lstMateriais.UseCompatibleStateImageBehavior = false;
            this.lstMateriais.View = System.Windows.Forms.View.Details;
            this.lstMateriais.SelectedIndexChanged += new System.EventHandler(this.lstMateriais_SelectedIndexChanged);
            // 
            // CodMaterial
            // 
            this.CodMaterial.Text = "Cod";
            this.CodMaterial.Width = 36;
            // 
            // Material
            // 
            this.Material.Text = "Material";
            this.Material.Width = 327;
            // 
            // lstAtividade
            // 
            this.lstAtividade.Columns.AddRange(new System.Windows.Forms.ColumnHeader[] {
            this.Cod,
            this.Atividade});
            this.lstAtividade.FullRowSelect = true;
            this.lstAtividade.GridLines = true;
            this.lstAtividade.Location = new System.Drawing.Point(524, 68);
            this.lstAtividade.MultiSelect = false;
            this.lstAtividade.Name = "lstAtividade";
            this.lstAtividade.Size = new System.Drawing.Size(191, 198);
            this.lstAtividade.TabIndex = 1;
            this.lstAtividade.UseCompatibleStateImageBehavior = false;
            this.lstAtividade.View = System.Windows.Forms.View.Details;
            this.lstAtividade.SelectedIndexChanged += new System.EventHandler(this.lstAtividade_SelectedIndexChanged);
            // 
            // Cod
            // 
            this.Cod.Text = "Cod";
            this.Cod.Width = 46;
            // 
            // Atividade
            // 
            this.Atividade.Text = "Atividade";
            this.Atividade.Width = 137;
            // 
            // btnGravar
            // 
            this.btnGravar.Location = new System.Drawing.Point(524, 353);
            this.btnGravar.Name = "btnGravar";
            this.btnGravar.Size = new System.Drawing.Size(75, 23);
            this.btnGravar.TabIndex = 2;
            this.btnGravar.Text = "Gravar";
            this.btnGravar.UseVisualStyleBackColor = true;
            this.btnGravar.Click += new System.EventHandler(this.btnGravar_Click);
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Location = new System.Drawing.Point(85, 379);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(95, 13);
            this.label1.TabIndex = 3;
            this.label1.Text = "Item Selecionado: ";
            // 
            // label2
            // 
            this.label2.AutoSize = true;
            this.label2.Location = new System.Drawing.Point(544, 269);
            this.label2.Name = "label2";
            this.label2.Size = new System.Drawing.Size(95, 13);
            this.label2.TabIndex = 4;
            this.label2.Text = "Item Selecionado: ";
            // 
            // TipoAtividade_MateriaisCad
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(774, 503);
            this.Controls.Add(this.label2);
            this.Controls.Add(this.label1);
            this.Controls.Add(this.btnGravar);
            this.Controls.Add(this.lstAtividade);
            this.Controls.Add(this.lstMateriais);
            this.Name = "TipoAtividade_MateriaisCad";
            this.Text = "TipoAtividade_MateriaisCad";
            this.Load += new System.EventHandler(this.TipoAtividade_MateriaisCad_Load);
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.ListView lstMateriais;
        private System.Windows.Forms.ListView lstAtividade;
        private System.Windows.Forms.Button btnGravar;
        private System.Windows.Forms.ColumnHeader CodMaterial;
        private System.Windows.Forms.ColumnHeader Material;
        private System.Windows.Forms.ColumnHeader Cod;
        private System.Windows.Forms.ColumnHeader Atividade;
        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.Label label2;
    }
}