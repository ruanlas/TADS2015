#include<stdio.h>
#include<stdlib.h>
#include<conio.h>
#include<string.h>
#include<math.h>
//valores para 1 m² de piso
#define argamassa 7
#define rejunte 0.45
#define p50x50 4 //4 pissos
#define p40x40 7 //7 pisos
#define p45x45 5 //5 pisos

    struct colocar_piso{ // dados totais dos materiais utilizados (unitátio)
        float area_superficie;
        float total_piso;
        float total_argamassa;
        float total_rejunte;
    }piso;
    struct medida_piso{ // dados caso o usuário prefira digitar as medidas do piso
        float comprimento;
        float altura;
        float area;
        int qtd_piso;
    }piso_dimensao;
    struct preco { // preço dos materiais unitário (por pacote)
        float saco_argamassa;
        float saco_rejunte;
        float caixa_piso;
    }valor;
    struct pacote{ //conteudo dos pacotes, quantidade de materiais que vem dentro dos pacotes
        int pcte_argamassa;
        int pcte_rejunte;
        int pcte_piso;
    }conteudo;
    struct materiais_usados { // quantidade de materiais usados (pacote)
        int qtd_pacote_argamassa;
        int qtd_pacote_rejunte;
        int qtd_caixa_piso;
    }qtd_pacote;
    struct preco_total{ // preço total dos materiais usados
        float mao_obra;
        float saco_argamassa;
        float saco_rejunte;
        float pcte_piso;
    }valor_total;
void Piso_50x50()
{
    struct colocar_piso;
    void conteudo_preco_materiais();
    system("cls");
    printf("Informe a area da superficie\n");
    scanf("%f",&piso.area_superficie);
    piso.total_piso = piso.area_superficie * p50x50;
    piso.total_argamassa = piso.area_superficie * argamassa;
    piso.total_rejunte = piso.area_superficie * rejunte;
    printf("Voce ira precisar dos seguintes materiais\n");
    printf("%.0f Pisos\n", piso.total_piso);
    printf("%.3f Kg de Argamassa\n", piso.total_argamassa);
    printf("%.3f Kg de Rejunte\n", piso.total_rejunte);
    conteudo_preco_materiais();
    system("PAUSE");
}
void Piso_45x45()
{
    struct colocar_piso;
    void conteudo_preco_materiais();
    system("cls");
    printf("Informe a area da superficie\n");
    scanf("%f",&piso.area_superficie);
    piso.total_piso = piso.area_superficie * p45x45;
    piso.total_argamassa = piso.area_superficie * argamassa;
    piso.total_rejunte = piso.area_superficie * rejunte;
    printf("Voce ira precisar dos seguintes materiais\n");
    printf("%.0f Pisos\n", piso.total_piso);
    printf("%.3f Kg de Argamassa\n", piso.total_argamassa);
    printf("%.3f Kg de Rejunte\n", piso.total_rejunte);
    conteudo_preco_materiais();
    system("PAUSE");
}
void Piso_40x40()
{
    struct colocar_piso;
    void conteudo_preco_materiais();
    system("cls");
    printf("Informe a area da superficie\n");
    scanf("%f",&piso.area_superficie);
    piso.total_piso = piso.area_superficie * p40x40;
    piso.total_argamassa = piso.area_superficie * argamassa;
    piso.total_rejunte = piso.area_superficie * rejunte;
    printf("Voce ira precisar dos seguintes materiais\n");
    printf("%.0f Pisos\n", piso.total_piso);
    printf("%.3f Kg de Argamassa\n", piso.total_argamassa);
    printf("%.3f Kg de Rejunte\n", piso.total_rejunte);
    conteudo_preco_materiais();
    system("PAUSE");
}
void Piso_por_metro_quadrado() // Calcula quantos pisos irá em 1m² a partir de um valor inserido pelo usuário
{
    struct medida_piso;
    float variavel;
    piso_dimensao.area = piso_dimensao.altura * piso_dimensao.comprimento;
    variavel = 1/piso_dimensao.area;
    if (variavel==trunc(variavel)){
        piso_dimensao.qtd_piso=variavel;
    }else{
        piso_dimensao.qtd_piso=trunc(variavel)+1;
    }
}
void Piso_EscolhaMedida() // irá calcular quantos pisos irá na superfície a partir de uma dimensão de piso informada pelo usuário
{
    struct colocar_piso;
    void conteudo_preco_materiais();
    system("cls");
    printf("Informe a area da superficie\n");
    scanf("%f",&piso.area_superficie);
    printf("Informe a dimensao do piso em metros\n(Exemplo: 30 cm = 0.3 m):\n");
    scanf("%f %f", &piso_dimensao.altura, &piso_dimensao.comprimento);
    Piso_por_metro_quadrado(); // chamada da subrotina para calcular quantos pisos irá em 1m²
    piso.total_piso = piso.area_superficie * piso_dimensao.qtd_piso;
    piso.total_argamassa = piso.area_superficie * argamassa;
    piso.total_rejunte = piso.area_superficie * rejunte;
    printf("Voce ira precisar dos seguintes materiais\n");
    printf("%.0f Pisos\n", piso.total_piso);
    printf("%.3f Kg de Argamassa\n", piso.total_argamassa);
    printf("%.3f Kg de Rejunte\n", piso.total_rejunte);
    conteudo_preco_materiais();
    system("PAUSE");
}
void SubMenu_Piso()
{
    system("cls");
    printf("Digite as opcoes desejadas\n");
    printf("1 - Piso 50x50\n");
    printf("2 - Piso 45x45\n");
    printf("3 - Piso 40x40\n");
    printf("4 - Informar a dimensao do piso\n");

    printf("0 - Sair\n");
}
void Menu_Principal()
{
    system("cls");
    printf("Selecione as opcoes\n");
    printf("1 - Piso\n");
    printf("2 - Pintura\n");
    printf("0 - Sair\n");
}
void SubMenu_Piso_Escolha()
{
    int op=9;
                    while (op!=0){
                    SubMenu_Piso();
                    scanf("%d", &op);
                    switch (op){
                        case 1:
                            Piso_50x50(); break;
                        case 2:
                            Piso_45x45(); break;
                        case 3:
                            Piso_40x40(); break;
                        case 4:
                            Piso_EscolhaMedida(); break;
                        case 0:
                            break;
                        default:
                            printf ("Opcao invalida\nPressione qualquer tecla e digite novamente sua opcao\n");
                            system("PAUSE>>NULL");
                            break;
                    }
                }
}
void conteudo_preco_materiais()
{
    struct preco;
    struct pacote;
    struct colocar_piso;
    struct preco_total;
    float pct_piso, pct_argamassa, pct_rejunte, valorTotalGeral;
    printf("Digite quantos Pisos vem em uma caixa e o preco da caixa\n");
    scanf("%d %f", &conteudo.pcte_piso, &valor.caixa_piso);
    printf("Digite quantos Kg de Argamassa vem em um pacote e o preco do pacote\n");
    scanf("%d %f", &conteudo.pcte_argamassa, &valor.saco_argamassa);
    printf("Digite quantos Kg de Rejunte vem em um pacote e o preco do pacote\n");
    scanf("%d %f", &conteudo.pcte_rejunte, &valor.saco_rejunte);
    printf("Digite o preco da mao de obra\n");
    scanf("%f", &valor_total.mao_obra);
    pct_piso = piso.total_piso/conteudo.pcte_piso;
    if (pct_piso==trunc(pct_piso)){
        qtd_pacote.qtd_caixa_piso=pct_piso;
    }else{
        qtd_pacote.qtd_caixa_piso=trunc(pct_piso)+1;
    }
    pct_rejunte=piso.total_rejunte/conteudo.pcte_rejunte;
    if (pct_rejunte==trunc(pct_rejunte)){
        qtd_pacote.qtd_pacote_rejunte=pct_rejunte;
    }else{
        qtd_pacote.qtd_pacote_rejunte=trunc(pct_rejunte)+1;
    }
    pct_argamassa=piso.total_argamassa/conteudo.pcte_argamassa;
    if (pct_argamassa==trunc(pct_argamassa)){
        qtd_pacote.qtd_pacote_argamassa=pct_argamassa;
    }else{
        qtd_pacote.qtd_pacote_argamassa=trunc(pct_argamassa)+1;
    }
    valor_total.pcte_piso=qtd_pacote.qtd_caixa_piso*valor.caixa_piso;
    valor_total.saco_argamassa=qtd_pacote.qtd_pacote_argamassa*valor.saco_argamassa;
    valor_total.saco_rejunte=qtd_pacote.qtd_pacote_rejunte*valor.saco_rejunte;
    valorTotalGeral=valor_total.mao_obra+valor_total.pcte_piso+valor_total.saco_argamassa+valor_total.saco_rejunte;
    printf("Voce ira gastar:\n");
    printf("%d Caixas de Pisos com %d Pisos cada = R$ %.2f\n", qtd_pacote.qtd_caixa_piso, conteudo.pcte_piso,valor_total.pcte_piso);
    printf("%d Pacotes de Argamassa com %d Kg cada = R$ %.2f\n", qtd_pacote.qtd_pacote_argamassa, conteudo.pcte_argamassa, valor_total.saco_argamassa);
    printf("%d Pacotes de Rejunte com %d Kg cada = R$ %.2f\n", qtd_pacote.qtd_pacote_rejunte, conteudo.pcte_rejunte, valor_total.saco_rejunte);
    printf("Gasto com mao de obra: R$ %.2f\n", valor_total.mao_obra);
    printf("Seu gasto total sera de R$ %.2f\n", valorTotalGeral);
    system("PAUSE>>NULL");
}
int main()
{
    int menu=9;

    while (menu!=0){
        Menu_Principal();
        scanf("%d", &menu);
        switch (menu){
            case 1:
                SubMenu_Piso_Escolha();
                break;
            case 2:
                printf("Aqui sera o programa referente a pintura\n");
                system("PAUSE>>NULL"); break;
            case 0:
                break;
            default:
                printf ("Opcao invalida\nPressione qualquer tecla e digite novamente sua opcao\n");
                system("PAUSE>>NULL");
                break;
        }
    }
    return 0;
}
