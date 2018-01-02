using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;

using System.Data.SqlClient;

using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace ADO_BD
{
    
    public partial class Form1 : Form
    {
        SqlDataReader leitor = null;
        SqlConnection conex = null;
        SqlCommand comando = null;
        public Form1()
        {
            InitializeComponent();
        }
    }
}
