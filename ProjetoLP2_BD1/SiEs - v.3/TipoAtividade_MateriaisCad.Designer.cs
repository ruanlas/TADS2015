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
            this.btnSair = new System.Windows.Forms.Button();
            this.label3 = new System.Windows.Forms.Label();
            this.label4 = new System.Windows.Forms.Label();
            this.SuspendLayout();
            // 
            // lstMateriais
            // 
            this.lstMateriais.Columns.AddRange(new System.Windows.Forms.ColumnHeader[] {
            this.CodMaterial,
            this.Material});
            this.lstMateriais.Font = new System.Drawing.Font("Microsoft Sans Serif", 10F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
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
            this.lstAtividade.Font = new System.Drawing.Font("Microsoft Sans Serif", 10F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lstAtividade.FullRowSelect = true;
            this.lstAtividade.GridLines = true;
            this.lstAtividade.Location = new System.Drawing.Point(439, 68);
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
            this.btnGravar.Font = new System.Drawing.Font("Microsoft Sans Serif", 10F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btnGravar.Location = new System.Drawing.Point(439, 299);
            this.btnGravar.Name = "btnGravar";
            this.btnGravar.Size = new System.Drawing.Size(87, 77);
            this.btnGravar.TabIndex = 2;
            this.btnGravar.Text = "Gravar";
            this.btnGravar.UseVisualStyleBackColor = true;
            this.btnGravar.Click += new System.EventHandler(this.btnGravar_Click);
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Font = new System.Drawing.Font("Microsoft Sans Serif", 10F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label1.Location = new System.Drawing.Point(39, 379);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(124, 17);
            this.label1.TabIndex = 3;
            this.label1.Text = "Item Selecionado: ";
            // 
            // label2
            // 
            this.label2.AutoSize = true;
            this.label2.Font = new System.Drawing.Font("Microsoft Sans Serif", 10F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label2.Location = new System.Drawing.Point(436, 269);
            this.label2.Name = "label2";
            this.label2.Size = new System.Drawing.Size(124, 17);
            this.label2.TabIndex = 4;
            this.label2.Text = "Item Selecionado: ";
            // 
            // btnSair
            // 
            this.btnSair.Font = new System.Drawing.Font("Microsoft Sans Serif", 10F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btnSair.Location = new System.Drawing.Point(543, 299);
            this.btnSair.Name = "btnSair";
            this.btnSair.Size = new System.Drawing.Size(87, 77);
            this.btnSair.TabIndex = 7;
            this.btnSair.Text = "Sair";
            this.btnSair.UseVisualStyleBackColor = true;
            this.btnSair.Click += new System.EventHandler(this.btnSair_Click);
            // 
            // label3
            // 
            this.label3.AutoSize = true;
            this.label3.Font = new System.Drawing.Font("Microsoft Sans Serif", 10F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label3.Location = new System.Drawing.Point(39, 48);
            this.label3.Name = "label3";
            this.label3.Size = new System.Drawing.Size(136, 17);
            this.label3.TabIndex = 8;
            this.label3.Text = "Selecione o Material";
            // 
            // label4
            // 
            this.label4.AutoSize = true;
            this.label4.Font = new System.Drawing.Font("Microsoft Sans Serif", 10F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label4.Location = new System.Drawing.Point(436, 48);
            this.label4.Name = "label4";
            this.label4.Size = new System.Drawing.Size(144, 17);
            this.label4.TabIndex = 9;
            this.label4.Text = "Selecione a Atividade";
            // 
            // TipoAtividade_MateriaisCad
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(667, 425);
            this.Controls.Add(this.label4);
            this.Controls.Add(this.label3);
            this.Controls.Add(this.btnSair);
            this.Controls.Add(this.label2);
            this.Controls.Add(this.label1);
            this.Controls.Add(this.btnGravar);
            this.Controls.Add(this.lstAtividade);
            this.Controls.Add(this.lstMateriais);
            this.FormBorderStyle = System.Windows.Forms.FormBorderStyle.FixedSingle;
            this.Name = "TipoAtividade_MateriaisCad";
            this.StartPosition = System.Windows.Forms.FormStartPosition.CenterScreen;
            this.Text = "Relacionamento Atividade/ Material";
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
        private System.Windows.Forms.Button btnSair;
        private System.Windows.Forms.Label label3;
        private System.Windows.Forms.Label label4;
    }
}