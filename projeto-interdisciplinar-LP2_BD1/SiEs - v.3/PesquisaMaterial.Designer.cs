namespace SiEs___v._2
{
    partial class PesquisaMaterial
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
            this.dgwListMater = new System.Windows.Forms.DataGridView();
            this.btnConsulCat = new System.Windows.Forms.Button();
            this.btnSair = new System.Windows.Forms.Button();
            ((System.ComponentModel.ISupportInitialize)(this.dgwListMater)).BeginInit();
            this.SuspendLayout();
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Font = new System.Drawing.Font("Microsoft Sans Serif", 14F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label1.Location = new System.Drawing.Point(215, 35);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(189, 24);
            this.label1.TabIndex = 1;
            this.label1.Text = "Consulta de Materiais";
            // 
            // dgwListMater
            // 
            this.dgwListMater.ColumnHeadersHeightSizeMode = System.Windows.Forms.DataGridViewColumnHeadersHeightSizeMode.AutoSize;
            this.dgwListMater.Location = new System.Drawing.Point(37, 93);
            this.dgwListMater.Name = "dgwListMater";
            this.dgwListMater.Size = new System.Drawing.Size(605, 407);
            this.dgwListMater.TabIndex = 2;
            // 
            // btnConsulCat
            // 
            this.btnConsulCat.Font = new System.Drawing.Font("Microsoft Sans Serif", 10F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btnConsulCat.Location = new System.Drawing.Point(469, 506);
            this.btnConsulCat.Name = "btnConsulCat";
            this.btnConsulCat.Size = new System.Drawing.Size(173, 50);
            this.btnConsulCat.TabIndex = 3;
            this.btnConsulCat.Text = "Consulta por Categoria";
            this.btnConsulCat.UseVisualStyleBackColor = true;
            this.btnConsulCat.Click += new System.EventHandler(this.btnConsulCat_Click);
            // 
            // btnSair
            // 
            this.btnSair.Font = new System.Drawing.Font("Microsoft Sans Serif", 10F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btnSair.Location = new System.Drawing.Point(290, 506);
            this.btnSair.Name = "btnSair";
            this.btnSair.Size = new System.Drawing.Size(173, 50);
            this.btnSair.TabIndex = 7;
            this.btnSair.Text = "Sair";
            this.btnSair.UseVisualStyleBackColor = true;
            this.btnSair.Click += new System.EventHandler(this.btnSair_Click);
            // 
            // PesquisaMaterial
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(678, 578);
            this.Controls.Add(this.btnSair);
            this.Controls.Add(this.btnConsulCat);
            this.Controls.Add(this.dgwListMater);
            this.Controls.Add(this.label1);
            this.FormBorderStyle = System.Windows.Forms.FormBorderStyle.FixedSingle;
            this.Name = "PesquisaMaterial";
            this.StartPosition = System.Windows.Forms.FormStartPosition.CenterScreen;
            this.Text = "Consulta de Materiais";
            this.Load += new System.EventHandler(this.PesquisaMaterial_Load);
            ((System.ComponentModel.ISupportInitialize)(this.dgwListMater)).EndInit();
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.DataGridView dgwListMater;
        private System.Windows.Forms.Button btnConsulCat;
        private System.Windows.Forms.Button btnSair;
    }
}