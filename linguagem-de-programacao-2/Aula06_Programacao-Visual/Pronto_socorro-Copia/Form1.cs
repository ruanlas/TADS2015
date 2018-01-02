using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using System.Collections;

namespace Pronto_socorro
{
    public partial class Form1 : Form
    {
        class Cliente
        {
            string nome;
            string endereco;
            string cidade;
            string estado;
            string cep;
            char sexo;
            int diaNascimento;
            int mesNascimento;
            int anoNascimento;

            char convenio;
            string tipo_convenio;
            char medicamento;
            string tipo_medicamento;
            char alergico_medicamento;
            string nome_medicamento_alergico;
            char hipertenso;
            char cardiaco;
            char vacinas;
            string tipo_vacinas;
            string tipo_sanguineo;
            char saram_rubeo_menin;
            string nome_saram_rubeo_menin;
            char exercicios;
            char alcool;
            public char Convenio
            {
                get
                {
                    return convenio;
                }
                set
                {
                    convenio = value;
                }
            }
            public string Tipo_convenio
            {
                get
                {
                    return tipo_convenio;
                }
                set
                {
                    tipo_convenio = value;
                }
            }
            public char Medicamento
            {
                get
                {
                    return medicamento;
                }
                set
                {
                    medicamento = value;
                }
            }
            public string Tipo_medicamento
            {
                get
                {
                    return tipo_medicamento;
                }
                set
                {
                    tipo_medicamento = value;
                }
            }
            public char Alergico_medicamento
            {
                get
                {
                    return alergico_medicamento;
                }
                set
                {
                    alergico_medicamento = value;
                }
            }
            public string Nome_medicamento_alergico
            {
                get
                {
                    return nome_medicamento_alergico;
                }
                set
                {
                    nome_medicamento_alergico = value;
                }
            }
            public char Hipertenso
            {
                get
                {
                    return hipertenso;
                }
                set
                {
                    hipertenso = value;
                }
            }
            public char Cardiaco
            {
                get
                {
                    return cardiaco;
                }
                set
                {
                    cardiaco = value;
                }
            }
            public char Vacinas
            {
                get
                {
                    return vacinas;
                }
                set
                {
                    vacinas = value;
                }
            }
            public string Tipo_vacinas
            {
                get
                {
                    return tipo_vacinas;
                }
                set
                {
                    tipo_vacinas = value;
                }
            }
            public string Tipo_sanguineo
            {
                get
                {
                    return tipo_sanguineo;
                }
                set
                {
                    tipo_sanguineo = value;
                }
            }
            public char Saram_rubeo_menin
            {
                get
                {
                    return saram_rubeo_menin;
                }
                set
                {
                    saram_rubeo_menin = value;
                }
            }
            public string Nome_saram_rubeo_menin
            {
                get
                {
                    return nome_saram_rubeo_menin;
                }
                set
                {
                    nome_saram_rubeo_menin = value;
                }
            }
            public char Exercicios
            {
                get
                {
                    return exercicios;
                }
                set
                {
                    exercicios = value;
                }
            }
            public char Alcool
            {
                get
                {
                    return alcool;
                }
                set
                {
                    alcool = value;
                }
            }

            public string Nome
            {
                get
                {
                    return nome;
                }
                set
                {
                    nome = value;
                }
            }
            public string Endereco
            {
                get
                {
                    return endereco;
                }
                set
                {
                    endereco = value;
                }
            }
            public string Cidade
            {
                get
                {
                    return cidade;
                }
                set
                {
                    cidade = value;
                }
            }
            public string Estado
            {
                get
                {
                    return estado;
                }
                set
                {
                    estado = value;
                }
            }
            public string CEP
            {
                get
                {
                    return cep;
                }
                set
                {
                    cep = value;
                }
            }
            public char Sexo
            {
                get
                {
                    return sexo;
                }
                set
                {
                    sexo = value;
                }
            }
            public int DiaNascimento
            {
                get
                {
                    return diaNascimento;
                }
                set
                {
                    diaNascimento = value;
                }
            }
            public int MesNascimento
            {
                get
                {
                    return mesNascimento;
                }
                set
                {
                    mesNascimento = value;
                }
            }
            public int AnoNascimento
            {
                get
                {
                    return anoNascimento;
                }
                set
                {
                    anoNascimento = value;
                }
            }

        }
        //declaração de uma lista
        ArrayList paciente = new ArrayList();
        //declaração do objeto Temp e instancialização
        Cliente Temp = new Cliente();
        string pesquisaNome;
        
        private void button2_Click(object sender, EventArgs e) //Botão Novo Cadastro
        {
            //inserir novo cadastro
            textBox1.Enabled = true;
            textBox2.Enabled = true;
            textBox3.Enabled = true;
            textBox4.Enabled = true;
            textBox5.Enabled = true;
            textBox6.Enabled = true;
            textBox7.Enabled = true;
            textBox8.Enabled = true;
            textBox9.Enabled = true;
            textBox14.Enabled = true;
            checkBox1.Enabled = true;
            checkBox2.Enabled = true;
            checkBox3.Enabled = true;
            checkBox4.Enabled = true;
            checkBox5.Enabled = true;
            checkBox6.Enabled = true;
            checkBox7.Enabled = true;
            checkBox8.Enabled = true;
            checkBox9.Enabled = true;
            checkBox10.Enabled = true;
            checkBox11.Enabled = true;
            checkBox12.Enabled = true;
            checkBox13.Enabled = true;
            checkBox14.Enabled = true;
            checkBox15.Enabled = true;
            checkBox16.Enabled = true;
            checkBox17.Enabled = true;
            checkBox18.Enabled = true;
            button1.Enabled = true;
            button2.Enabled = false;
            //instancialização do objeto Temp da Classe Cliente
            //Temp = new Cliente();
            //Adição de um elemento da lista de Objetos do tipo Cliente
            paciente.Add(new Cliente());

            

        }
        public Form1()
        {
            InitializeComponent();
        }

        private void Form1_Load(object sender, EventArgs e)//Objeto Form1 " Pronto Socorro Campinas" - Área de trabalho
        {
            textBox1.Enabled = false;
            textBox2.Enabled = false;
            textBox3.Enabled = false;
            textBox4.Enabled = false;
            textBox5.Enabled = false;
            textBox6.Enabled = false;
            textBox7.Enabled = false;
            textBox8.Enabled = false;
            textBox9.Enabled = false;
            textBox14.Enabled = false;
            button1.Enabled = false;
            checkBox1.Enabled = false;
            checkBox2.Enabled = false;
            checkBox3.Enabled = false;
            checkBox4.Enabled = false;
            checkBox5.Enabled = false;
            checkBox6.Enabled = false;
            checkBox7.Enabled = false;
            checkBox8.Enabled = false;
            checkBox9.Enabled = false;
            checkBox10.Enabled = false;
            checkBox11.Enabled = false;
            checkBox12.Enabled = false;
            checkBox13.Enabled = false;
            checkBox14.Enabled = false;
            checkBox15.Enabled = false;
            checkBox16.Enabled = false;
            checkBox17.Enabled = false;
            checkBox18.Enabled = false;
            
        }
        
        private void textBox1_TextChanged(object sender, EventArgs e)//Caixa de texto Nome
        {
            //nome
            Temp.Nome = textBox1.Text;

        }

        private void textBox2_TextChanged(object sender, EventArgs e)//Caixa de texto Endereço
        {
            //endereço
            Temp.Endereco = textBox2.Text;
        }

        private void textBox3_TextChanged(object sender, EventArgs e)//Caixa de texto Cidade
        {
            //cidade
            Temp.Cidade = textBox3.Text;
        }

        private void textBox6_TextChanged(object sender, EventArgs e)//Caixa de texto Estado
        {
            //estado
            Temp.Estado = textBox6.Text;
        }

        private void textBox5_TextChanged(object sender, EventArgs e)//Caixa de texto CEP
        {
            //cep
            Temp.CEP = textBox5.Text;
        }

        private void textBox4_TextChanged(object sender, EventArgs e)//Caixa de texto Sexo
        {
            //sexo
            Temp.Sexo = char.Parse(textBox4.Text);
        }

        private void textBox7_TextChanged(object sender, EventArgs e)//Caixa de texto Dia Nascimento
        {
            //dia Nascimento
            Temp.DiaNascimento = int.Parse(textBox7.Text);
        }

        private void textBox8_TextChanged(object sender, EventArgs e)//Caixa de texto Mes Nascimento
        {
            //mes Nascimento
            Temp.MesNascimento = int.Parse(textBox8.Text);
        }

        private void textBox9_TextChanged(object sender, EventArgs e)//Caixa de texto Ano Nascimento
        {
            //ano Nascimento
            Temp.AnoNascimento = int.Parse(textBox9.Text);
        }

        private void checkBox1_CheckedChanged(object sender, EventArgs e)//Caixa de Seleção (Tem convênio? "SIM")
        {
            //tem convênio? (caixa seleção "sim")
            if (checkBox1.Checked)
            {
                checkBox2.Checked = false;
                textBox10.Enabled = true;
                Temp.Convenio = 'S';
            }
            else
            {
                checkBox1.Checked = false;
                checkBox2.Checked = true;
            }
        }
       
        private void checkBox2_CheckedChanged(object sender, EventArgs e)//Caixa de Seleção (Tem convênio? "NÃO")
        {
            //tem convênio? (caixa de seleção "nao")
            if (checkBox2.Checked)
            {
                checkBox1.Checked = false;
                textBox10.Enabled = false;
                Temp.Convenio = 'N';

            }
            else
            {
                checkBox2.Checked = false;
                checkBox1.Checked = true;
            }
        }

        private void textBox10_TextChanged(object sender, EventArgs e)//Caixa de Texto Tipo de Convênio
        {
            //tipo de convênio
            Temp.Tipo_convenio = textBox10.Text;
        }

        private void checkBox3_CheckedChanged(object sender, EventArgs e)//Caixa de Seleção (Toma algum tipo de medicamento? "SIM")
        {
            //toma algum tipo de medicamento? (caixa de seleção "sim")
            if (checkBox3.Checked)
            {
                checkBox4.Checked = false;
                textBox11.Enabled = true;
                Temp.Medicamento = 'S';
            }
            else
            {
                checkBox3.Checked = false;
                checkBox4.Checked = true;
            }
        }

        private void checkBox4_CheckedChanged(object sender, EventArgs e)//Caixa de Seleção (Toma algum tipo de medicamento? "NÃO")
        {
            //toma algum tipo de medicamento? (caixa de seleção "nao")
            if (checkBox4.Checked)
            {
                checkBox3.Checked = false;
                textBox11.Enabled = false;
                Temp.Medicamento = 'N';
            }
            else
            {
                checkBox4.Checked = false;
                checkBox3.Checked = true;
            }
        }
        private void textBox11_TextChanged(object sender, EventArgs e)//Caixa de Texto do Nome do medicamento que toma
        {
            //nome do remedio que toma
            Temp.Tipo_medicamento = textBox11.Text;
        }

        private void checkBox5_CheckedChanged(object sender, EventArgs e)//Caixa de Seleção (É alérgico a algum tipo de medicamento? "SIM")
        {
            //é alergico a algum tipo de medicamento? (caixa de seleção "sim")
            if (checkBox5.Checked)
            {
                checkBox6.Checked = false;
                textBox12.Enabled = true;
                Temp.Alergico_medicamento = 'S';
            }
            else
            {
                checkBox5.Checked = false;
                checkBox6.Checked = true;
            }
        }

        private void checkBox6_CheckedChanged(object sender, EventArgs e)//Caixa de Seleção (É alérgico a algum tipo de medicamento? "SIM")
        {
            //é alergico a algum tipo de medicamento? (caixa de seleção "nao")
            if (checkBox6.Checked)
            {
                checkBox5.Checked = false;
                textBox12.Enabled = false;
                Temp.Alergico_medicamento = 'N';
            }
            else
            {
                checkBox6.Checked = false;
                checkBox5.Checked = true;
            }
        }

        private void textBox12_TextChanged(object sender, EventArgs e)//Caixa de Texto Nome do medicamento que tem alergia
        {
            //qual medicamento tem alergia
            Temp.Nome_medicamento_alergico = textBox12.Text;
        }

        private void checkBox7_CheckedChanged(object sender, EventArgs e)//Caixa de Seleção (É hipertenso? "SIM")
        {
            //é hipertenso? (caixa de seleção "sim")
            if (checkBox7.Checked)
            {
                checkBox8.Checked = false;
                Temp.Hipertenso = 'S';
            }
            else
            {
                checkBox7.Checked = false;
                checkBox8.Checked = true;
            }
        }

        private void checkBox8_CheckedChanged(object sender, EventArgs e)//Caixa de Seleção (É hipertenso? "NÃO")
        {
            //é hipertenso? (caixa de seleção "nao")
            if (checkBox8.Checked)
            {
                checkBox7.Checked = false;
                Temp.Hipertenso = 'N';
            }
            else
            {
                checkBox8.Checked = false;
                checkBox7.Checked = true;
            }
        }

        private void checkBox9_CheckedChanged(object sender, EventArgs e)//Caixa de Seleção (É cardíaco? "SIM")
        {
            //é cardíaco? (caixa de seleção "sim")
            if (checkBox9.Checked)
            {
                checkBox10.Checked = false;
                Temp.Cardiaco = 'S';
            }
            else
            {
                checkBox9.Checked = false;
                checkBox10.Checked = true;
            }
        }

        private void checkBox10_CheckedChanged(object sender, EventArgs e)//Caixa de Seleção (É cardíaco? "NÃO")
        {
            //é cardíaco? (caixa de seleção "nao")
            if (checkBox10.Checked)
            {
                checkBox9.Checked = false;
                Temp.Cardiaco = 'N';
            }
            else
            {
                checkBox10.Checked = false;
                checkBox9.Checked = true;
            }
        }

        private void checkBox11_CheckedChanged(object sender, EventArgs e)//Caixa de Seleção (Tomou Vacinas? "SIM")
        {
            //tomou vacinas? (caixa de seleção "sim")
            if (checkBox11.Checked)
            {
                checkBox12.Checked = false;
                textBox13.Enabled = true;
                Temp.Vacinas = 'S';
            }
            else
            {
                checkBox11.Checked = false;
                checkBox12.Checked = true;
            }
        }

        private void checkBox12_CheckedChanged(object sender, EventArgs e)//Caixa de Seleção (Tomou Vacinas? "NÃO")
        {
            //tomou vacinas? (caixa de seleção "nao")
            if (checkBox12.Checked)
            {
                checkBox11.Checked = false;
                textBox13.Enabled = false;
                Temp.Vacinas = 'N';
            }
            else
            {
                checkBox12.Checked = false;
                checkBox11.Checked = true;
            }
        }

        private void textBox13_TextChanged(object sender, EventArgs e)//Caixa de Texto Nome das Vacinas tomadas
        {
            //nome das vacinas tomadas
            Temp.Tipo_vacinas = textBox13.Text;
        }

        private void textBox14_TextChanged(object sender, EventArgs e)//Caixa de Texto Tipo Sanguíneo
        {
            //Tipo sanguíneo
            Temp.Tipo_sanguineo = textBox14.Text;
        }

        private void checkBox13_CheckedChanged(object sender, EventArgs e)//Caixa de Seleção (Teve Sarampo, Caxumba, Rubéola e Meningite? "SIM")
        {
            //teve sarampo, caxumba, rubeola, meningite? (caixa de seleção "sim")
            if (checkBox13.Checked)
            {
                checkBox14.Checked = false;
                textBox15.Enabled = true;
                Temp.Saram_rubeo_menin = 'S';
            }
            else
            {
                checkBox13.Checked = false;
                checkBox14.Checked = true;
            }
        }

        private void checkBox14_CheckedChanged(object sender, EventArgs e)//Caixa de Seleção (Teve Sarampo, Caxumba, Rubéola e Meningite? "NÃO")
        {
            //teve sarampo, caxumba, rubeola, meningite? (caixa de seleção "nao")
            if (checkBox14.Checked)
            {
                checkBox13.Checked = false;
                textBox15.Enabled = false;
                Temp.Saram_rubeo_menin = 'N';
            }
            else
            {
                checkBox14.Checked = false;
                checkBox13.Checked = true;
            }
        }

        private void textBox15_TextChanged(object sender, EventArgs e)//Caixa de Texto Qual(ais) da(s) Doença(s) entre Sarampo, Caxumba, Rubéola e Meningite a pessoa teve?
        {
            //teve sarampo, caxumba, rubeola meningite (texto quais)?
            Temp.Nome_saram_rubeo_menin = textBox15.Text;
        }

        private void checkBox15_CheckedChanged(object sender, EventArgs e)//Caixa de Seleção (Faz exercícios regularmente? "SIM")
        {
            //faz exercícios regularmente? (caixa de seleção "sim")
            if (checkBox15.Checked)
            {
                checkBox16.Checked = false;
                Temp.Exercicios = 'S';
            }
            else
            {
                checkBox15.Checked = false;
                checkBox16.Checked = true;
            }
        }

        private void checkBox16_CheckedChanged(object sender, EventArgs e)//Caixa de Seleção (Faz exercícios regularmente? "NÃO")
        {
            //faz exercícios regularmente? (caixa de seleção "nao")
            if (checkBox16.Checked)
            {
                checkBox15.Checked = false;
                Temp.Exercicios = 'N';
            }
            else
            {
                checkBox16.Checked = false;
                checkBox15.Checked = true;
            }
        }

        private void checkBox17_CheckedChanged(object sender, EventArgs e)//Caixa de Seleção (Bebe alcool regularmente? "SIM")
        {
            //bebe alcool regularmente? (caixa de seleção "sim")
            if (checkBox17.Checked)
            {
                checkBox18.Checked = false;
                Temp.Alcool = 'S';
            }
            else
            {
                checkBox17.Checked = false;
                checkBox18.Checked = true;
            }
        }

        private void checkBox18_CheckedChanged(object sender, EventArgs e)//Caixa de Seleção (Bebe alcool regularmente? "NÃO")
        {
            //bebe alcool regularmente? (caixa de seleção "nao")
            if (checkBox18.Checked)
            {
                checkBox17.Checked = false;
                Temp.Alcool = 'N';

            }
            else
            {
                checkBox18.Checked = false;
                checkBox17.Checked = true;
                
            }
        }

        private void button1_Click(object sender, EventArgs e)//Botão de Gravar Cadastro
        {
            //Gravar dados
            //desabilitando caixas
            button2.Enabled = true;
            textBox1.Enabled = false;
            textBox2.Enabled = false;
            textBox3.Enabled = false;
            textBox4.Enabled = false;
            textBox5.Enabled = false;
            textBox6.Enabled = false;
            textBox7.Enabled = false;
            textBox8.Enabled = false;
            textBox9.Enabled = false;
            textBox14.Enabled = false;
            button1.Enabled = false;
            checkBox1.Enabled = false;
            checkBox2.Enabled = false;
            checkBox3.Enabled = false;
            checkBox4.Enabled = false;
            checkBox5.Enabled = false;
            checkBox6.Enabled = false;
            checkBox7.Enabled = false;
            checkBox8.Enabled = false;
            checkBox9.Enabled = false;
            checkBox10.Enabled = false;
            checkBox11.Enabled = false;
            checkBox12.Enabled = false;
            checkBox13.Enabled = false;
            checkBox14.Enabled = false;
            checkBox15.Enabled = false;
            checkBox16.Enabled = false;
            checkBox17.Enabled = false;
            checkBox18.Enabled = false;
            foreach ( Cliente pac in paciente)
            {
                if (pac.Nome == null)
                {
                    //Salvamento no Arraylist
                    pac.Alcool = Temp.Alcool;
                    pac.Alergico_medicamento = Temp.Alergico_medicamento;
                    pac.AnoNascimento = Temp.AnoNascimento;
                    pac.Cardiaco = Temp.Cardiaco;
                    pac.CEP = Temp.CEP;
                    pac.Cidade = Temp.Cidade;
                    pac.Convenio = Temp.Convenio;
                    pac.DiaNascimento = Temp.DiaNascimento;
                    pac.Endereco = Temp.Endereco;
                    pac.Estado = Temp.Estado;
                    pac.Exercicios = Temp.Exercicios;
                    pac.Hipertenso = Temp.Hipertenso;
                    pac.Medicamento = Temp.Medicamento;
                    pac.MesNascimento = Temp.MesNascimento;
                    pac.Nome = Temp.Nome;
                    pac.Nome_medicamento_alergico = Temp.Nome_medicamento_alergico;
                    pac.Nome_saram_rubeo_menin = Temp.Nome_saram_rubeo_menin;
                    pac.Saram_rubeo_menin = Temp.Saram_rubeo_menin;
                    pac.Sexo = Temp.Sexo;
                    pac.Tipo_convenio = Temp.Tipo_convenio;
                    pac.Tipo_medicamento = Temp.Tipo_medicamento;
                    pac.Tipo_sanguineo = Temp.Tipo_sanguineo;
                    pac.Tipo_vacinas = Temp.Tipo_vacinas;
                    pac.Vacinas = Temp.Vacinas;
                }
            }
            //zerando os campos
            Temp.Alcool = ' ';
            Temp.Alergico_medicamento = ' ';
            Temp.AnoNascimento = ' ';
            Temp.Cardiaco = ' ';
            Temp.CEP = null;
            Temp.Cidade = null;
            Temp.Convenio = ' ';
            Temp.DiaNascimento = ' ';
            Temp.Endereco = null;
            Temp.Estado = null;
            Temp.Exercicios = ' ';
            Temp.Hipertenso = ' ';
            Temp.Medicamento = ' ';
            Temp.MesNascimento = ' ';
            Temp.Nome = null;
            Temp.Nome_medicamento_alergico = null;
            Temp.Nome_saram_rubeo_menin = null;
            Temp.Saram_rubeo_menin = ' ';
            Temp.Sexo = ' ';
            Temp.Tipo_convenio = null;
            Temp.Tipo_medicamento = null;
            Temp.Tipo_sanguineo = null;
            Temp.Tipo_vacinas = null;
            Temp.Vacinas = ' ';
            //aparece uma mensagem na tela
            MessageBox.Show("Cadastro gravado com sucesso!!!");
            
        }

        private void textBox16_TextChanged(object sender, EventArgs e)//Campo de pesquisa pelo nome do paciente
        {
            //Campo
            pesquisaNome = textBox16.Text; 
        }
        private void button3_Click(object sender, EventArgs e)//Botão Pesquisar
        {
            //variável para controlar o foreach
            int controleFluxo = 0;
            //OBS: Falta terminar
            foreach (Cliente pac in paciente)
            {
                if (pac.Nome == pesquisaNome)
                {
                    label16.Text = pac.Nome;
                    //listView1.Items.Add();
                    
                    ListViewItem item1 = new ListViewItem("Nome do Paciente: "+pac.Nome);
                    ListViewItem item2 = new ListViewItem("Endereço " +pac.Endereco);
                    ListViewItem item3 = new ListViewItem("Sexo "+pac.Sexo.ToString());
                    ListViewItem item4 = new ListViewItem("Data Nascimento: "+pac.DiaNascimento.ToString("00")+"/"+pac.MesNascimento.ToString("00")+"/"+pac.AnoNascimento);
                    ListViewItem item5 = new ListViewItem("Cidade: " + pac.Cidade);
                    
                    listView1.Items.AddRange(new ListViewItem[] { item1, item2, item3, item4, item5 });
                    
                    controleFluxo = 1;
                    break;
                }
            }
            //se o controleFluxo obtiver o valor 0, isso implica que ele não encontrou nenhum nome acima,
            //logo ele irá executar o foreach abaixo, caso ele tenha valor 1, significa que ele encontrou
            //um nome correspondente acima, e logo ele não executa este foreach abaixo
            if (controleFluxo == 0)
            {
                foreach (Cliente pac in paciente)
                {
                    if (pac.Nome != pesquisaNome)
                    {
                        ListViewItem item1 = new ListViewItem("Nome não encontrado");
                        listView1.Items.AddRange(new ListViewItem[] { item1 });
                        break;
                    }
                }
            }
            
        }

        private void listView1_SelectedIndexChanged(object sender, EventArgs e)
        {
            
        }


    }
}
