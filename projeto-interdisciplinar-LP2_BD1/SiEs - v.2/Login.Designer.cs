namespace SiEs___v._2
{
    partial class Login
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
            this.label2 = new System.Windows.Forms.Label();
            this.label1 = new System.Windows.Forms.Label();
            this.linkCadastro = new System.Windows.Forms.LinkLabel();
            this.btnSistLim = new System.Windows.Forms.Button();
            this.btnEntrar = new System.Windows.Forms.Button();
            this.txPassword = new System.Windows.Forms.TextBox();
            this.txLogin = new System.Windows.Forms.TextBox();
            this.label4 = new System.Windows.Forms.Label();
            this.label3 = new System.Windows.Forms.Label();
            this.SuspendLayout();
            // 
            // label2
            // 
            this.label2.AutoSize = true;
            this.label2.Font = new System.Drawing.Font("Microsoft Sans Serif", 15F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label2.Location = new System.Drawing.Point(85, 34);
            this.label2.Name = "label2";
            this.label2.Size = new System.Drawing.Size(362, 25);
            this.label2.TabIndex = 3;
            this.label2.Text = "para acabamento residencial e alvenaria";
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Font = new System.Drawing.Font("Microsoft Sans Serif", 15F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label1.Location = new System.Drawing.Point(85, 9);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(356, 25);
            this.label1.TabIndex = 2;
            this.label1.Text = "SiEs - Sistema de Estimativa de Custos";
            // 
            // linkCadastro
            // 
            this.linkCadastro.AutoSize = true;
            this.linkCadastro.Location = new System.Drawing.Point(149, 230);
            this.linkCadastro.Name = "linkCadastro";
            this.linkCadastro.Size = new System.Drawing.Size(228, 13);
            this.linkCadastro.TabIndex = 15;
            this.linkCadastro.TabStop = true;
            this.linkCadastro.Text = "É novo no sistema? Cadastre-se clicando aqui.";
            this.linkCadastro.LinkClicked += new System.Windows.Forms.LinkLabelLinkClickedEventHandler(this.linkCadastro_LinkClicked);
            // 
            // btnSistLim
            // 
            this.btnSistLim.Location = new System.Drawing.Point(220, 176);
            this.btnSistLim.Name = "btnSistLim";
            this.btnSistLim.Size = new System.Drawing.Size(95, 41);
            this.btnSistLim.TabIndex = 14;
            this.btnSistLim.Text = "Utilizar a versão de teste";
            this.btnSistLim.UseVisualStyleBackColor = true;
            this.btnSistLim.Click += new System.EventHandler(this.btnSistLim_Click);
            // 
            // btnEntrar
            // 
            this.btnEntrar.Location = new System.Drawing.Point(363, 130);
            this.btnEntrar.Name = "btnEntrar";
            this.btnEntrar.Size = new System.Drawing.Size(75, 38);
            this.btnEntrar.TabIndex = 13;
            this.btnEntrar.Text = "Entrar";
            this.btnEntrar.UseVisualStyleBackColor = true;
            this.btnEntrar.Click += new System.EventHandler(this.btnEntrar_Click);
            // 
            // txPassword
            // 
            this.txPassword.Location = new System.Drawing.Point(185, 150);
            this.txPassword.Name = "txPassword";
            this.txPassword.PasswordChar = '*';
            this.txPassword.Size = new System.Drawing.Size(162, 20);
            this.txPassword.TabIndex = 12;
            // 
            // txLogin
            // 
            this.txLogin.Location = new System.Drawing.Point(185, 130);
            this.txLogin.Name = "txLogin";
            this.txLogin.Size = new System.Drawing.Size(162, 20);
            this.txLogin.TabIndex = 11;
            // 
            // label4
            // 
            this.label4.AutoSize = true;
            this.label4.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label4.Location = new System.Drawing.Point(97, 148);
            this.label4.Name = "label4";
            this.label4.Size = new System.Drawing.Size(82, 20);
            this.label4.TabIndex = 10;
            this.label4.Text = "Password:";
            // 
            // label3
            // 
            this.label3.AutoSize = true;
            this.label3.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label3.Location = new System.Drawing.Point(127, 128);
            this.label3.Name = "label3";
            this.label3.Size = new System.Drawing.Size(52, 20);
            this.label3.TabIndex = 9;
            this.label3.Text = "Login:";
            // 
            // Login
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(564, 353);
            this.Controls.Add(this.linkCadastro);
            this.Controls.Add(this.btnSistLim);
            this.Controls.Add(this.btnEntrar);
            this.Controls.Add(this.txPassword);
            this.Controls.Add(this.txLogin);
            this.Controls.Add(this.label4);
            this.Controls.Add(this.label3);
            this.Controls.Add(this.label2);
            this.Controls.Add(this.label1);
            this.Name = "Login";
            this.Text = "Login";
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Label label2;
        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.LinkLabel linkCadastro;
        private System.Windows.Forms.Button btnSistLim;
        private System.Windows.Forms.Button btnEntrar;
        private System.Windows.Forms.TextBox txPassword;
        private System.Windows.Forms.TextBox txLogin;
        private System.Windows.Forms.Label label4;
        private System.Windows.Forms.Label label3;
    }
}