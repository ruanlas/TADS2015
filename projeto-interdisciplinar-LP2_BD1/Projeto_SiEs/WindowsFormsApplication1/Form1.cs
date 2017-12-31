using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace WindowsFormsApplication1
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void button2_Click(object sender, EventArgs e)
        {
            //Close();
            //Form3 f3 = new Form3();
            //f3.ShowDialog();
            //this.Close();
            Form3 F3 = new Form3();
            this.Hide();
            F3.Show();
            
        }

        private void linkLabel1_LinkClicked(object sender, LinkLabelLinkClickedEventArgs e)
        {
            //Form4 f4 = new Form4();
            //f4.ShowDialog();
            Form4 Form4 = new Form4();
            Form4.MdiParent = this;
            Form4.Show();
        }
    }
}
