﻿namespace SiEs___v._2
{
    partial class ConfirmarCadastro
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
            this.button1 = new System.Windows.Forms.Button();
            this.lstPessoa = new System.Windows.Forms.ListView();
            this.label1 = new System.Windows.Forms.Label();
            this.cod_ = ((System.Windows.Forms.ColumnHeader)(new System.Windows.Forms.ColumnHeader()));
            this.nome_ = ((System.Windows.Forms.ColumnHeader)(new System.Windows.Forms.ColumnHeader()));
            this.Cpf_ = ((System.Windows.Forms.ColumnHeader)(new System.Windows.Forms.ColumnHeader()));
            this.label2 = new System.Windows.Forms.Label();
            this.txCPF = new System.Windows.Forms.TextBox();
            this.btnPesquisar = new System.Windows.Forms.Button();
            this.SuspendLayout();
            // 
            // button1
            // 
            this.button1.Location = new System.Drawing.Point(213, 287);
            this.button1.Name = "button1";
            this.button1.Size = new System.Drawing.Size(156, 48);
            this.button1.TabIndex = 1;
            this.button1.Text = "Gravar Relação";
            this.button1.UseVisualStyleBackColor = true;
            this.button1.Click += new System.EventHandler(this.button1_Click);
            // 
            // lstPessoa
            // 
            this.lstPessoa.Columns.AddRange(new System.Windows.Forms.ColumnHeader[] {
            this.cod_,
            this.nome_,
            this.Cpf_});
            this.lstPessoa.FullRowSelect = true;
            this.lstPessoa.GridLines = true;
            this.lstPessoa.Location = new System.Drawing.Point(34, 164);
            this.lstPessoa.MultiSelect = false;
            this.lstPessoa.Name = "lstPessoa";
            this.lstPessoa.Size = new System.Drawing.Size(541, 51);
            this.lstPessoa.TabIndex = 2;
            this.lstPessoa.UseCompatibleStateImageBehavior = false;
            this.lstPessoa.View = System.Windows.Forms.View.Details;
            this.lstPessoa.SelectedIndexChanged += new System.EventHandler(this.lstPessoa_SelectedIndexChanged);
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Location = new System.Drawing.Point(94, 139);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(113, 13);
            this.label1.TabIndex = 3;
            this.label1.Text = "Confirme seu Cadastro";
            // 
            // cod_
            // 
            this.cod_.Text = "Cod";
            this.cod_.Width = 35;
            // 
            // nome_
            // 
            this.nome_.Text = "Nome";
            this.nome_.Width = 310;
            // 
            // Cpf_
            // 
            this.Cpf_.Text = "CPF";
            this.Cpf_.Width = 188;
            // 
            // label2
            // 
            this.label2.AutoSize = true;
            this.label2.Location = new System.Drawing.Point(41, 74);
            this.label2.Name = "label2";
            this.label2.Size = new System.Drawing.Size(83, 13);
            this.label2.TabIndex = 4;
            this.label2.Text = "Digite seu CPF: ";
            // 
            // txCPF
            // 
            this.txCPF.Location = new System.Drawing.Point(130, 71);
            this.txCPF.Name = "txCPF";
            this.txCPF.Size = new System.Drawing.Size(224, 20);
            this.txCPF.TabIndex = 5;
            // 
            // btnPesquisar
            // 
            this.btnPesquisar.Location = new System.Drawing.Point(380, 69);
            this.btnPesquisar.Name = "btnPesquisar";
            this.btnPesquisar.Size = new System.Drawing.Size(75, 23);
            this.btnPesquisar.TabIndex = 6;
            this.btnPesquisar.Text = "Pesquisar";
            this.btnPesquisar.UseVisualStyleBackColor = true;
            this.btnPesquisar.Click += new System.EventHandler(this.btnPesquisar_Click);
            // 
            // ConfirmarCadastro
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(641, 466);
            this.Controls.Add(this.btnPesquisar);
            this.Controls.Add(this.txCPF);
            this.Controls.Add(this.label2);
            this.Controls.Add(this.label1);
            this.Controls.Add(this.lstPessoa);
            this.Controls.Add(this.button1);
            this.Name = "ConfirmarCadastro";
            this.Text = "ConfirmarCadastro";
            this.Load += new System.EventHandler(this.ConfirmarCadastro_Load);
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion
        private System.Windows.Forms.Button button1;
        private System.Windows.Forms.ListView lstPessoa;
        private System.Windows.Forms.ColumnHeader cod_;
        private System.Windows.Forms.ColumnHeader nome_;
        private System.Windows.Forms.ColumnHeader Cpf_;
        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.Label label2;
        private System.Windows.Forms.TextBox txCPF;
        private System.Windows.Forms.Button btnPesquisar;
    }
}