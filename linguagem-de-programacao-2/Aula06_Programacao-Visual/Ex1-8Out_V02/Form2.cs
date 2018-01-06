﻿using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using System.Collections;

namespace testeEx1_8Out
{
    public partial class Form2 : Form
    {
        Aluno Cad_alunos = new Aluno();
        public Form2()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            Cad_alunos.addAlunos();
            foreach (Aluno item in Cad_alunos.ListaAlunos())
            {
                if (item.Nome == null)
                {
                    item.Nome = textBox1.Text;
                    item.Matricula = textBox2.Text;
                    item.Serie = int.Parse(textBox3.Text);
                    //item.MediaFinal();
                }
            }
            MessageBox.Show("Cadastro realizado com sucesso");
            textBox1.Text = null;
            textBox2.Text = null;
            textBox3.Text = null;
        }

        private void button2_Click(object sender, EventArgs e)
        {
            Form4 F4 = new Form4();
            F4.Show();
        }
    }
}