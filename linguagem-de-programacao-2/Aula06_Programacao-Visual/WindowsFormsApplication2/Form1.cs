using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace WindowsFormsApplication2
{
    public partial class Form1 : Form
    {
        int i = 0;
        public Form1()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            
            i = i + 1;
            label1.ForeColor = Color.Blue;
            label1.Text = i.ToString();
        }

        private void button2_Click(object sender, EventArgs e)
        {
            i = i - 1;
            label1.ForeColor = Color.Red;
            label1.Text = i.ToString();
        }

        private void Form1_Load(object sender, EventArgs e)
        {

        }
    }
}
