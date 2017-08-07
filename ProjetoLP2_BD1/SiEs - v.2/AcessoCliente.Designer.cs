namespace SiEs___v._2
{
    partial class AcessoCliente
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
            this.btnAlterarCadastro = new System.Windows.Forms.Button();
            this.btnPesquisarProfis = new System.Windows.Forms.Button();
            this.btnPesquisarMater = new System.Windows.Forms.Button();
            this.btnEstimativa = new System.Windows.Forms.Button();
            this.btnPesquisarOrcam = new System.Windows.Forms.Button();
            this.btnCadastrarProfis = new System.Windows.Forms.Button();
            this.SuspendLayout();
            // 
            // btnAlterarCadastro
            // 
            this.btnAlterarCadastro.Location = new System.Drawing.Point(26, 28);
            this.btnAlterarCadastro.Name = "btnAlterarCadastro";
            this.btnAlterarCadastro.Size = new System.Drawing.Size(130, 27);
            this.btnAlterarCadastro.TabIndex = 0;
            this.btnAlterarCadastro.Text = "Alterar Cadastro";
            this.btnAlterarCadastro.UseVisualStyleBackColor = true;
            this.btnAlterarCadastro.Click += new System.EventHandler(this.btnAlterarCadastro_Click);
            // 
            // btnPesquisarProfis
            // 
            this.btnPesquisarProfis.Location = new System.Drawing.Point(26, 71);
            this.btnPesquisarProfis.Name = "btnPesquisarProfis";
            this.btnPesquisarProfis.Size = new System.Drawing.Size(130, 27);
            this.btnPesquisarProfis.TabIndex = 1;
            this.btnPesquisarProfis.Text = "Pesquisar Profissionais";
            this.btnPesquisarProfis.UseVisualStyleBackColor = true;
            this.btnPesquisarProfis.Click += new System.EventHandler(this.btnPesquisarProfis_Click);
            // 
            // btnPesquisarMater
            // 
            this.btnPesquisarMater.Location = new System.Drawing.Point(26, 157);
            this.btnPesquisarMater.Name = "btnPesquisarMater";
            this.btnPesquisarMater.Size = new System.Drawing.Size(130, 27);
            this.btnPesquisarMater.TabIndex = 2;
            this.btnPesquisarMater.Text = "Pesquisar Materiais";
            this.btnPesquisarMater.UseVisualStyleBackColor = true;
            this.btnPesquisarMater.Click += new System.EventHandler(this.btnPesquisarMater_Click);
            // 
            // btnEstimativa
            // 
            this.btnEstimativa.Location = new System.Drawing.Point(26, 205);
            this.btnEstimativa.Name = "btnEstimativa";
            this.btnEstimativa.Size = new System.Drawing.Size(130, 27);
            this.btnEstimativa.TabIndex = 3;
            this.btnEstimativa.Text = "Realizar Estimativas";
            this.btnEstimativa.UseVisualStyleBackColor = true;
            this.btnEstimativa.Click += new System.EventHandler(this.btnEstimativa_Click);
            // 
            // btnPesquisarOrcam
            // 
            this.btnPesquisarOrcam.Location = new System.Drawing.Point(26, 251);
            this.btnPesquisarOrcam.Name = "btnPesquisarOrcam";
            this.btnPesquisarOrcam.Size = new System.Drawing.Size(130, 27);
            this.btnPesquisarOrcam.TabIndex = 4;
            this.btnPesquisarOrcam.Text = "Pesquisar Orçamentos";
            this.btnPesquisarOrcam.UseVisualStyleBackColor = true;
            this.btnPesquisarOrcam.Click += new System.EventHandler(this.btnPesquisarOrcam_Click);
            // 
            // btnCadastrarProfis
            // 
            this.btnCadastrarProfis.Location = new System.Drawing.Point(26, 115);
            this.btnCadastrarProfis.Name = "btnCadastrarProfis";
            this.btnCadastrarProfis.Size = new System.Drawing.Size(130, 27);
            this.btnCadastrarProfis.TabIndex = 5;
            this.btnCadastrarProfis.Text = "Cadastrar Profissionais";
            this.btnCadastrarProfis.UseVisualStyleBackColor = true;
            this.btnCadastrarProfis.Click += new System.EventHandler(this.btnCadastrarProfis_Click);
            // 
            // AcessoCliente
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(693, 477);
            this.Controls.Add(this.btnCadastrarProfis);
            this.Controls.Add(this.btnPesquisarOrcam);
            this.Controls.Add(this.btnEstimativa);
            this.Controls.Add(this.btnPesquisarMater);
            this.Controls.Add(this.btnPesquisarProfis);
            this.Controls.Add(this.btnAlterarCadastro);
            this.Name = "AcessoCliente";
            this.Text = "AcessoCliente";
            this.Load += new System.EventHandler(this.AcessoCliente_Load);
            this.ResumeLayout(false);

        }

        #endregion

        private System.Windows.Forms.Button btnAlterarCadastro;
        private System.Windows.Forms.Button btnPesquisarProfis;
        private System.Windows.Forms.Button btnPesquisarMater;
        private System.Windows.Forms.Button btnEstimativa;
        private System.Windows.Forms.Button btnPesquisarOrcam;
        private System.Windows.Forms.Button btnCadastrarProfis;
    }
}