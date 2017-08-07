namespace SiEs___v._2
{
    partial class AcessoLimitado
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
            this.btnEstimat = new System.Windows.Forms.Button();
            this.btnPesqMater = new System.Windows.Forms.Button();
            this.label1 = new System.Windows.Forms.Label();
            this.SuspendLayout();
            // 
            // btnEstimat
            // 
            this.btnEstimat.Location = new System.Drawing.Point(158, 241);
            this.btnEstimat.Name = "btnEstimat";
            this.btnEstimat.Size = new System.Drawing.Size(294, 70);
            this.btnEstimat.TabIndex = 5;
            this.btnEstimat.Text = "Realizar estimativas";
            this.btnEstimat.UseVisualStyleBackColor = true;
            this.btnEstimat.Click += new System.EventHandler(this.btnEstimat_Click);
            // 
            // btnPesqMater
            // 
            this.btnPesqMater.Location = new System.Drawing.Point(158, 152);
            this.btnPesqMater.Name = "btnPesqMater";
            this.btnPesqMater.Size = new System.Drawing.Size(294, 66);
            this.btnPesqMater.TabIndex = 4;
            this.btnPesqMater.Text = "Pesquisar por materiais";
            this.btnPesqMater.UseVisualStyleBackColor = true;
            this.btnPesqMater.Click += new System.EventHandler(this.btnPesqMater_Click);
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Font = new System.Drawing.Font("Microsoft Sans Serif", 16F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label1.Location = new System.Drawing.Point(153, 81);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(314, 26);
            this.label1.TabIndex = 3;
            this.label1.Text = "Ambiente de Trabalho Limitado";
            // 
            // AcessoLimitado
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(614, 407);
            this.Controls.Add(this.btnEstimat);
            this.Controls.Add(this.btnPesqMater);
            this.Controls.Add(this.label1);
            this.Name = "AcessoLimitado";
            this.Text = "Acesso Limitado";
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Button btnEstimat;
        private System.Windows.Forms.Button btnPesqMater;
        private System.Windows.Forms.Label label1;
    }
}