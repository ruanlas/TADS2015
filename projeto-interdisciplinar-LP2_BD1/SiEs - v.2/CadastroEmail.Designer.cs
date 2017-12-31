namespace SiEs___v._2
{
    partial class CadastroEmail
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
            this.txEmail = new System.Windows.Forms.TextBox();
            this.lstEmail = new System.Windows.Forms.ListView();
            this.btnAddEmail = new System.Windows.Forms.Button();
            this.btnExcluir = new System.Windows.Forms.Button();
            this.columnHeader1 = ((System.Windows.Forms.ColumnHeader)(new System.Windows.Forms.ColumnHeader()));
            this.columnHeader4 = ((System.Windows.Forms.ColumnHeader)(new System.Windows.Forms.ColumnHeader()));
            this.SuspendLayout();
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Location = new System.Drawing.Point(69, 64);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(35, 13);
            this.label1.TabIndex = 0;
            this.label1.Text = "Email:";
            // 
            // txEmail
            // 
            this.txEmail.Location = new System.Drawing.Point(110, 61);
            this.txEmail.Name = "txEmail";
            this.txEmail.Size = new System.Drawing.Size(249, 20);
            this.txEmail.TabIndex = 1;
            // 
            // lstEmail
            // 
            this.lstEmail.Columns.AddRange(new System.Windows.Forms.ColumnHeader[] {
            this.columnHeader1,
            this.columnHeader4});
            this.lstEmail.FullRowSelect = true;
            this.lstEmail.Location = new System.Drawing.Point(46, 109);
            this.lstEmail.MultiSelect = false;
            this.lstEmail.Name = "lstEmail";
            this.lstEmail.Size = new System.Drawing.Size(376, 201);
            this.lstEmail.TabIndex = 2;
            this.lstEmail.UseCompatibleStateImageBehavior = false;
            this.lstEmail.View = System.Windows.Forms.View.Details;
            // 
            // btnAddEmail
            // 
            this.btnAddEmail.Location = new System.Drawing.Point(385, 58);
            this.btnAddEmail.Name = "btnAddEmail";
            this.btnAddEmail.Size = new System.Drawing.Size(75, 23);
            this.btnAddEmail.TabIndex = 3;
            this.btnAddEmail.Text = "Add Email";
            this.btnAddEmail.UseVisualStyleBackColor = true;
            this.btnAddEmail.Click += new System.EventHandler(this.btnAddEmail_Click);
            // 
            // btnExcluir
            // 
            this.btnExcluir.Location = new System.Drawing.Point(46, 351);
            this.btnExcluir.Name = "btnExcluir";
            this.btnExcluir.Size = new System.Drawing.Size(75, 23);
            this.btnExcluir.TabIndex = 4;
            this.btnExcluir.Text = "Excluir";
            this.btnExcluir.UseVisualStyleBackColor = true;
            this.btnExcluir.Click += new System.EventHandler(this.btnExcluir_Click);
            // 
            // columnHeader1
            // 
            this.columnHeader1.Text = "";
            this.columnHeader1.Width = 0;
            // 
            // columnHeader4
            // 
            this.columnHeader4.Text = "Email";
            this.columnHeader4.Width = 370;
            // 
            // CadastroEmail
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(512, 431);
            this.Controls.Add(this.btnExcluir);
            this.Controls.Add(this.btnAddEmail);
            this.Controls.Add(this.lstEmail);
            this.Controls.Add(this.txEmail);
            this.Controls.Add(this.label1);
            this.Name = "CadastroEmail";
            this.Text = "CadastroEmail";
            this.Load += new System.EventHandler(this.CadastroEmail_Load);
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.TextBox txEmail;
        private System.Windows.Forms.ListView lstEmail;
        private System.Windows.Forms.Button btnAddEmail;
        private System.Windows.Forms.Button btnExcluir;
        private System.Windows.Forms.ColumnHeader columnHeader1;
        private System.Windows.Forms.ColumnHeader columnHeader4;
    }
}