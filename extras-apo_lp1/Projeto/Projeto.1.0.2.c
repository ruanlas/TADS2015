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
#define AbrNomePro "______________________________________________________ S.L.M.A.R. ________"

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
//Parte do Piso
void Piso_50x50()
{
    struct colocar_piso;
    char selecao='9';
    void conteudo_preco_materiais();
    system("cls");
    printf("--------------------------------------------------------------------------\n");
    printf("---------------------------------------------- TITULO DO PROGRAMA --------\n");
    printf("\t\t\t PISO 50x50 \n\t\t\t------------\n\n");
    printf("\n--------------------------------------------------------------------------\n");
    printf("Informe a area da superficie em metros quadrados: ");
    scanf("%f",&piso.area_superficie);
    piso.total_piso = piso.area_superficie * p50x50;
    piso.total_argamassa = piso.area_superficie * argamassa;
    piso.total_rejunte = piso.area_superficie * rejunte;
    system("cls");
    printf("--------------------------------------------------------------------------\n");
    printf("---------------------------------------------- TITULO DO PROGRAMA --------\n");
    printf("\t\t\t PISO 50x50 \n\t\t\t------------\n\n");
    printf("\t\tRELATORIO DE MATERIAIS\n");
    printf("\n--------------------------------------------------------------------------\n");
    printf("Voce ira precisar dos seguintes materiais\n\n");
    printf("\t%.0f Pisos\n", piso.total_piso);
    printf("\t%.3f Kg de Argamassa\n", piso.total_argamassa);
    printf("\t%.3f Kg de Rejunte\n\n", piso.total_rejunte);
    printf("\n**OBS: Os valores informados trata-se apenas de uma estimativa de materiais\n\n");
    printf("                                  Precione qualquer tecla para continuar....\n");
    printf("                                                               0 - Voltar   \n");
    printf("\n--------------------------------------------------------------------------\n");
    fflush(stdin);
    scanf("%c", &selecao);
    if (selecao!='0'){
        conteudo_preco_materiais(1);
    }

}
void Piso_45x45()
{
    struct colocar_piso;
    char selecao='9';
    void conteudo_preco_materiais();
    system("cls");
    printf("--------------------------------------------------------------------------\n");
    printf("---------------------------------------------- TITULO DO PROGRAMA --------\n");
    printf("\t\t\t PISO 45x45 \n\t\t\t------------\n\n");
    printf("\n--------------------------------------------------------------------------\n");
    printf("Informe a area da superficie em metros quadrados: ");
    scanf("%f",&piso.area_superficie);
    piso.total_piso = piso.area_superficie * p45x45;
    piso.total_argamassa = piso.area_superficie * argamassa;
    piso.total_rejunte = piso.area_superficie * rejunte;
    system("cls");
    printf("--------------------------------------------------------------------------\n");
    printf("---------------------------------------------- TITULO DO PROGRAMA --------\n");
    printf("\t\t\t PISO 45x45 \n\t\t\t------------\n\n");
    printf("\t\tRELATORIO DE MATERIAIS\n");
    printf("\n--------------------------------------------------------------------------\n");
    printf("Voce ira precisar dos seguintes materiais\n\n");
    printf("\t%.0f Pisos\n", piso.total_piso);
    printf("\t%.3f Kg de Argamassa\n", piso.total_argamassa);
    printf("\t%.3f Kg de Rejunte\n\n", piso.total_rejunte);
    printf("\n**OBS: Os valores informados trata-se apenas de uma estimativa de materiais\n\n");
    printf("                                  Precione qualquer tecla para continuar....\n");
    printf("                                                               0 - Voltar   \n");
    printf("\n--------------------------------------------------------------------------\n");
    fflush(stdin);
    scanf("%c", &selecao);
    if (selecao!='0'){
        conteudo_preco_materiais(2);
    }
}
void Piso_40x40()
{
    struct colocar_piso;
    char selecao='9';
    void conteudo_preco_materiais();
    system("cls");
    printf("--------------------------------------------------------------------------\n");
    printf("---------------------------------------------- TITULO DO PROGRAMA --------\n");
    printf("\t\t\t PISO 40x40 \n\t\t\t------------\n\n");
    printf("\n--------------------------------------------------------------------------\n");
    printf("Informe a area da superficie em metros quadrados: ");
    scanf("%f",&piso.area_superficie);
    piso.total_piso = piso.area_superficie * p40x40;
    piso.total_argamassa = piso.area_superficie * argamassa;
    piso.total_rejunte = piso.area_superficie * rejunte;
    system("cls");
    printf("--------------------------------------------------------------------------\n");
    printf("---------------------------------------------- TITULO DO PROGRAMA --------\n");
    printf("\t\t\t PISO 40x40 \n\t\t\t------------\n\n");
    printf("\t\tRELATORIO DE MATERIAIS\n");
    printf("\n--------------------------------------------------------------------------\n");
    printf("Voce ira precisar dos seguintes materiais\n\n");
    printf("\t%.0f Pisos\n", piso.total_piso);
    printf("\t%.3f Kg de Argamassa\n", piso.total_argamassa);
    printf("\t%.3f Kg de Rejunte\n\n", piso.total_rejunte);
    printf("\n**OBS: Os valores informados trata-se apenas de uma estimativa de materiais\n\n");
    printf("                                  Precione qualquer tecla para continuar....\n");
    printf("                                                               0 - Voltar   \n");
    printf("\n--------------------------------------------------------------------------\n");
    fflush(stdin);
    scanf("%c", &selecao);
    if (selecao!='0'){
        conteudo_preco_materiais(3);
    }
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
    char selecao='9';
    void conteudo_preco_materiais();
    system("cls");
    printf("--------------------------------------------------------------------------\n");
    printf("---------------------------------------------- TITULO DO PROGRAMA --------\n");
    printf("\t\t\t PISO - MEDIDA ALTERNATIVA \n\t\t\t----------------------------\n\n");
    printf("\n--------------------------------------------------------------------------\n");
    printf("Informe a area da superficie em metros quadrados: ");
    scanf("%f",&piso.area_superficie);
    printf("Informe a dimensao do piso em metros\n(Exemplo: 30 cm = 0.3 m):\n");
    scanf("%f %f", &piso_dimensao.altura, &piso_dimensao.comprimento);
    Piso_por_metro_quadrado(); // chamada da subrotina para calcular quantos pisos irá em 1m²
    piso.total_piso = piso.area_superficie * piso_dimensao.qtd_piso;
    piso.total_argamassa = piso.area_superficie * argamassa;
    piso.total_rejunte = piso.area_superficie * rejunte;
    system("cls");
    printf("--------------------------------------------------------------------------\n");
    printf("---------------------------------------------- TITULO DO PROGRAMA --------\n");
    printf("\t\t\t PISO %.0fx%.0f \n\t\t\t------------\n\n", piso_dimensao.altura*100, piso_dimensao.comprimento*100);
    printf("\t\tRELATORIO DE MATERIAIS\n");
    printf("\n--------------------------------------------------------------------------\n");
    printf("Voce ira precisar dos seguintes materiais\n\n");
    printf("\t%.0f Pisos\n", piso.total_piso);
    printf("\t%.3f Kg de Argamassa\n", piso.total_argamassa);
    printf("\t%.3f Kg de Rejunte\n\n", piso.total_rejunte);
    printf("\n**OBS: Os valores informados trata-se apenas de uma estimativa de materiais\n\n");
    printf("                                  Precione qualquer tecla para continuar....\n");
    printf("                                                               0 - Voltar   \n");
    printf("\n--------------------------------------------------------------------------\n");
    fflush(stdin);
    scanf("%c", &selecao);
    if (selecao!='0'){
        conteudo_preco_materiais(4);
    }
}
void SubMenu_Piso()
{
    system("cls");
    printf("--------------------------------------------------------------------------\n");
    printf("---------------------------------------------- TITULO DO PROGRAMA --------\n");
    printf("\t\t\t\t PISO \n\t\t\t\t------\n");
    printf("\n\t\t\tSELECIONE AS OPCOES DESEJADAS\n\n--------------------------------------------------------------------------\n\n");
    printf(" 1 - PISO 50x50\n");
    printf(" 2 - PISO 45x45\n");
    printf(" 3 - PISO 40x40\n");
    printf(" 4 - INSERIR AS DIMENSOES DO PISO\n");
    printf(" 0 - VOLTAR AO MENU PRINCIPAL\n\n");
    printf("----------------------------------------------------- Selecione sua opcao ");
}
void Menu_Principal()
{
    system("cls");
    printf("--------------------------------------------------------------------------\n");
    printf("%s\n", AbrNomePro);
    printf("_______ SISTEMA DE LEVANTAMENTO DE MATERIAIS DE ACABAMENTO RESIDENCIAL ___\n");
    printf("--------------------------------------------------------------------------\n");
    printf("\t\t\t\t MENU PRINCIPAL\n\t\t\t\t----------------\n");
    printf("\n\t\t\tSELECIONE AS OPCOES\n\n--------------------------------------------------------------------------\n\n");
    printf("\t1 - PISO\n");
    printf("\t2 - PINTURA\n");
    printf("\t3 - SOBRE O PROGRAMA\n");
    printf("\t0 - SAIR\n\n");
    printf("----------------------------------------------------- Selecione sua opcao ");
}
void SubMenu_Piso_Escolha()
{
    int op=9;
                    while (op!=0){
                    SubMenu_Piso();
                    fflush(stdin);
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
void conteudo_preco_materiais(int x)
{
    struct preco;
    struct pacote;
    struct colocar_piso;
    struct preco_total;
    float pct_piso, pct_argamassa, pct_rejunte, valorTotalGeral;
    system("cls");
    switch(x){
        case 1:
            printf("--------------------------------------------------------------------------\n");
            printf("---------------------------------------------- TITULO DO PROGRAMA --------\n");
            printf("\t\t\t PISO 50x50 \n\t\t\t------------\n\n");
            printf("\n--------------------------------------------------------------------------\n");
            break;
        case 2:
            printf("--------------------------------------------------------------------------\n");
            printf("---------------------------------------------- TITULO DO PROGRAMA --------\n");
            printf("\t\t\t PISO 45x45 \n\t\t\t------------\n\n");
            printf("\n--------------------------------------------------------------------------\n");
            break;
        case 3:
            printf("--------------------------------------------------------------------------\n");
            printf("---------------------------------------------- TITULO DO PROGRAMA --------\n");
            printf("\t\t\t PISO 40x40 \n\t\t\t------------\n\n");
            printf("\n--------------------------------------------------------------------------\n");
            break;
        case 4:
            printf("--------------------------------------------------------------------------\n");
            printf("---------------------------------------------- TITULO DO PROGRAMA --------\n");
            printf("\t\t\t PISO %.0fx%.0f \n\t\t\t------------\n\n", piso_dimensao.altura*100, piso_dimensao.comprimento*100);
            printf("\n--------------------------------------------------------------------------\n");
            break;
    }
    printf("Digite quantos Pisos vem em uma caixa e o preco da caixa: ");
    scanf("%d %f", &conteudo.pcte_piso, &valor.caixa_piso);
    printf("Digite quantos Kg de Argamassa vem em um pacote e o preco do pacote: ");
    scanf("%d %f", &conteudo.pcte_argamassa, &valor.saco_argamassa);
    printf("Digite quantos Kg de Rejunte vem em um pacote e o preco do pacote: ");
    scanf("%d %f", &conteudo.pcte_rejunte, &valor.saco_rejunte);
    printf("Digite o preco da mao de obra: ");
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
    system("cls");
    switch(x){
        case 1:
            printf("--------------------------------------------------------------------------\n");
            printf("---------------------------------------------- TITULO DO PROGRAMA --------\n");
            printf("\t\t\t PISO 50x50 \n\t\t\t------------\n\n");
            printf("\t\tRELATORIO COMPLETO DE MATERIAIS E CUSTO\n");
            printf("\n--------------------------------------------------------------------------\n");
            break;
        case 2:
            printf("--------------------------------------------------------------------------\n");
            printf("---------------------------------------------- TITULO DO PROGRAMA --------\n");
            printf("\t\t\t PISO 45x45 \n\t\t\t------------\n\n");
            printf("\t\tRELATORIO COMPLETO DE MATERIAIS E CUSTO\n");
            printf("\n--------------------------------------------------------------------------\n");
            break;
        case 3:
            printf("--------------------------------------------------------------------------\n");
            printf("---------------------------------------------- TITULO DO PROGRAMA --------\n");
            printf("\t\t\t PISO 40x40 \n\t\t\t------------\n\n");
            printf("\t\tRELATORIO COMPLETO DE MATERIAIS E CUSTO\n");
            printf("\n--------------------------------------------------------------------------\n");
            break;
        case 4:
            printf("--------------------------------------------------------------------------\n");
            printf("---------------------------------------------- TITULO DO PROGRAMA --------\n");
            printf("\t\t\t PISO %.0fx%.0f \n\t\t\t------------\n\n", piso_dimensao.altura*100, piso_dimensao.comprimento*100);
            printf("\t\tRELATORIO COMPLETO DE MATERIAIS E CUSTO\n");
            printf("\n--------------------------------------------------------------------------\n");
            break;
    }
    printf("Voce ira gastar:\n");
    printf("\t%d Caixas de Pisos com %d Pisos cada = R$ %.2f\n", qtd_pacote.qtd_caixa_piso, conteudo.pcte_piso,valor_total.pcte_piso);
    printf("\t%d Pacotes de Argamassa com %d Kg cada = R$ %.2f\n", qtd_pacote.qtd_pacote_argamassa, conteudo.pcte_argamassa, valor_total.saco_argamassa);
    printf("\t%d Pacotes de Rejunte com %d Kg cada = R$ %.2f\n", qtd_pacote.qtd_pacote_rejunte, conteudo.pcte_rejunte, valor_total.saco_rejunte);
    printf("\tGasto com mao de obra: R$ %.2f\n", valor_total.mao_obra);
    printf("\nSeu gasto total sera de R$ %.2f\n\n", valorTotalGeral);
    printf("\n--------------------------------------------------------------------------\n");
    system("PAUSE>>NULL");
}
// Parte da pintura
#define MassaCorrida 0.3 //definido em KG
#define Selador 0.072 //Definido em litros
#define Tinta 0.072 //definido em litros
#define Corante 0.00103 //definido em litros
#define FundoPreparador 0.085 //definido em litros
//valores por M²
struct Materiais_Pintura{ //estrutura para armazenar a quantidade total de materiais utilizados
    float area_pintada;
    float massa_corrida;
    float selador;
    float tinta;
    float corante;
    float fundo_preparador;
    int demao;
}total_materiais_pintura;
struct Quantidade_Lata{
    float massa_corrida;
    float selador;
    float tinta;
    float corante;
    float fundo_preparador;
}conteudo_por_lata;
struct Total_de_Latas{
    int massa_corrida;
    int selador;
    int tinta;
    int corante;
    int fundo_preparador;
}total_de_latas;
struct Preco_Unitario_Lata{
    float massa_corrida;
    float selador;
    float tinta;
    float corante;
    float fundo_preparador;
}preco_por_lata;
struct Preco_Total_Pintura{
    float mao_de_obra;
    float massa_corrida;
    float selador;
    float tinta;
    float corante;
    float fundo_preparador;
}preco_total_pintura;
void SubMenu_Pintura()
{
    system("cls");
    printf("--------------------------------------------------------------------------\n");
    printf("---------------------------------------------- TITULO DO PROGRAMA --------\n");
    printf("\t\t\t\t PINTURA \n\t\t\t\t---------\n");
    printf("\n\t\t\tSELECIONE AS OPCOES DESEJADAS\n\n--------------------------------------------------------------------------\n\n");
    printf(" 1 - PINTURA DE PAREDE/TETO REBOCADA(O)\n");
    printf(" 2 - REPINTURA DE PAREDE/TETO\n");
    printf(" 0 - VOLTAR AO MENU PRINCIPAL\n\n");
    printf("----------------------------------------------------- Selecione sua opcao ");
}
void Conteudo_Lata_Preco(int x)
{
    struct Quantidade_Lata;
    struct Preco_Unitario_Lata;
    struct Total_de_Latas;
    struct Preco_Total_Pintura;
    struct Materiais_Pintura;
    float qtd_lata_massaCorrida, qtd_lata_selador, qtd_lata_tinta, qtd_lata_fundoPreparador, qtd_bisnaga_corante;
    float Preco_Total_Geral;
    switch (x){
        case 1:
            system("cls");
            printf("--------------------------------------------------------------------------\n");
            printf("---------------------------------------------- TITULO DO PROGRAMA --------\n");
            printf("\t\t\t PINTURA PAREDE/TETO REBOCADA \n\t\t\t------------------------------\n");
            printf("\n--------------------------------------------------------------------------\n");
            printf("Digite quantos Kg de Massa Corrida contem na lata e o preco:\n");
            scanf ("%f %f", &conteudo_por_lata.massa_corrida, &preco_por_lata.massa_corrida);
            printf("Digite quantos Litros de Selador contem na lata e o preco:\n");
            scanf("%f %f", &conteudo_por_lata.selador, &preco_por_lata.selador);
            printf("Digite quantos Litros de Tinta contem na lata e o preco:\n");
            scanf("%f %f", &conteudo_por_lata.tinta, &preco_por_lata.tinta);
            printf("*OPCIONAL*\nDigite quantos Ml de Corante contem na bisnaga e o preco:\n");
            scanf("%f %f", &conteudo_por_lata.corante, &preco_por_lata.corante);
            printf("Digite o preco da mao de obra:\n");
            scanf("%f", &preco_total_pintura.mao_de_obra);
            qtd_lata_massaCorrida=total_materiais_pintura.massa_corrida/conteudo_por_lata.massa_corrida;
            if (qtd_lata_massaCorrida==trunc(qtd_lata_massaCorrida)){
                total_de_latas.massa_corrida=qtd_lata_massaCorrida;
            }else{
                total_de_latas.massa_corrida=trunc(qtd_lata_massaCorrida)+1;
            }
            qtd_lata_selador=total_materiais_pintura.selador/conteudo_por_lata.selador;
            if (qtd_lata_selador==trunc(qtd_lata_selador)){
                total_de_latas.selador=qtd_lata_selador;
            }else{
                total_de_latas.selador=trunc(qtd_lata_selador)+1;
            }
            qtd_lata_tinta=total_materiais_pintura.tinta/conteudo_por_lata.tinta;
            if (qtd_lata_tinta==trunc(qtd_lata_tinta)){
                total_de_latas.tinta=qtd_lata_tinta;
            }else{
                total_de_latas.tinta=trunc(qtd_lata_tinta)+1;
            }
            qtd_bisnaga_corante=total_materiais_pintura.corante/(conteudo_por_lata.corante/1000);
            if (qtd_bisnaga_corante==trunc(qtd_bisnaga_corante)){
                total_de_latas.corante=qtd_bisnaga_corante;
            }else{
                total_de_latas.corante=trunc(qtd_bisnaga_corante)+1;
            }
            preco_total_pintura.massa_corrida=total_de_latas.massa_corrida*preco_por_lata.massa_corrida;
            preco_total_pintura.selador=total_de_latas.selador*preco_por_lata.selador;
            preco_total_pintura.tinta=total_de_latas.tinta*preco_por_lata.tinta;
            preco_total_pintura.corante=total_de_latas.corante*preco_por_lata.corante;
            Preco_Total_Geral=preco_total_pintura.massa_corrida+preco_total_pintura.selador+preco_total_pintura.tinta+preco_total_pintura.corante+preco_total_pintura.mao_de_obra;
            system("cls");
            printf("--------------------------------------------------------------------------\n");
            printf("---------------------------------------------- TITULO DO PROGRAMA --------\n");
            printf("\t\t\t PINTURA PAREDE/TETO REBOCADA \n\t\t\t------------------------------\n\n");
            printf("\t\tRELATORIO COMPLETO DE MATERIAIS E CUSTO\n");
            printf("\n--------------------------------------------------------------------------\n");
            printf("Voce ira gastar:\n");
            printf("\t%d Latas de Massa Corrida com %.3f Kg cada = RS%.2f \n", total_de_latas.massa_corrida, conteudo_por_lata.massa_corrida, preco_total_pintura.massa_corrida);
            printf("\t%d Latas de Selador com %.3f Litros cada = RS%.2f \n", total_de_latas.selador, conteudo_por_lata.selador, preco_total_pintura.selador);
            printf("\t%d Latas de Tinta com %.3f Litros cada = RS%.2f \n", total_de_latas.tinta, conteudo_por_lata.tinta, preco_total_pintura.tinta);
            if (conteudo_por_lata.corante>0){
                printf("\t%d Bisnaga de Corante com %.2f Ml cada = RS%.2f \n", total_de_latas.corante, conteudo_por_lata.corante, preco_total_pintura.corante);
            }
            printf("\tGasto com mao de obra: R$ %.2f\n", preco_total_pintura.mao_de_obra);
            printf("\t\nSeu gasto total sera de R$%.2f \n\n", Preco_Total_Geral);
            printf("\n--------------------------------------------------------------------------\n");
            break;
        case 2:
            system("cls");
            printf("--------------------------------------------------------------------------\n");
            printf("---------------------------------------------- TITULO DO PROGRAMA --------\n");
            printf("\t\t\t REPINTURA PAREDE/TETO \n\t\t\t----------------------\n\n");
            printf("\n--------------------------------------------------------------------------\n");
            printf("Digite quantos Litros de Fundo Preparador contem na lata e o preco:\n");
            scanf("%f %f", &conteudo_por_lata.fundo_preparador, &preco_por_lata.fundo_preparador);
            printf("Digite quantos Litros de Tinta contem na lata e o preco:\n");
            scanf("%f %f", &conteudo_por_lata.tinta, &preco_por_lata.tinta);
            printf("*OPCIONAL*\nDigite quantos Ml de Corante contem na bisnaga e o preco:\n");
            scanf("%f %f", &conteudo_por_lata.corante, &preco_por_lata.corante);
            printf("Digite o preco da mao de obra:\n");
            scanf("%f", &preco_total_pintura.mao_de_obra);
            qtd_lata_fundoPreparador=total_materiais_pintura.fundo_preparador/conteudo_por_lata.fundo_preparador;
            if (qtd_lata_fundoPreparador==trunc(qtd_lata_fundoPreparador)){
                total_de_latas.fundo_preparador=qtd_lata_fundoPreparador;
            }else{
                total_de_latas.fundo_preparador=trunc(qtd_lata_fundoPreparador)+1;
            }
            qtd_lata_tinta=total_materiais_pintura.tinta/conteudo_por_lata.tinta;
            if (qtd_lata_tinta==trunc(qtd_lata_tinta)){
                total_de_latas.tinta=qtd_lata_tinta;
            }else{
                total_de_latas.tinta=trunc(qtd_lata_tinta)+1;
            }
            qtd_bisnaga_corante=total_materiais_pintura.corante/(conteudo_por_lata.corante/1000);
            if (qtd_bisnaga_corante==trunc(qtd_bisnaga_corante)){
                total_de_latas.corante=qtd_bisnaga_corante;
            }else{
                total_de_latas.corante=trunc(qtd_bisnaga_corante)+1;
            }
            preco_total_pintura.fundo_preparador=total_de_latas.fundo_preparador*preco_por_lata.fundo_preparador;
            preco_total_pintura.tinta=total_de_latas.tinta*preco_por_lata.tinta;
            preco_total_pintura.corante=total_de_latas.corante*preco_por_lata.corante;
            Preco_Total_Geral=preco_total_pintura.fundo_preparador+preco_total_pintura.tinta+preco_total_pintura.corante+preco_total_pintura.mao_de_obra;
            system("cls");
            printf("--------------------------------------------------------------------------\n");
            printf("---------------------------------------------- TITULO DO PROGRAMA --------\n");
            printf("\t\t\t REPINTURA PAREDE/TETO \n\t\t\t----------------------\n\n");
            printf("\t\tRELATORIO COMPLETO DE MATERIAIS E CUSTO\n");
            printf("\n--------------------------------------------------------------------------\n");
            printf("Voce ira gastar:\n");
            printf("\t%d Latas de Fundo Preparador com %.3f Litros cada = RS%.2f \n", total_de_latas.fundo_preparador, conteudo_por_lata.fundo_preparador, preco_total_pintura.fundo_preparador);
            printf("\t%d Latas de Tinta com %.3f Litros cada = RS%.2f \n", total_de_latas.tinta, conteudo_por_lata.tinta, preco_total_pintura.tinta);
            if (conteudo_por_lata.corante>0){
                printf("\t%d Bisnaga de Corante com %.2f Ml cada = RS%.2f \n", total_de_latas.corante, conteudo_por_lata.corante, preco_total_pintura.corante);
            }
            printf("\tGasto com mao de obra: R$ %.2f\n", preco_total_pintura.mao_de_obra);
            printf("\t\nSeu gasto total sera de R$%.2f \n\n", Preco_Total_Geral);
            printf("\n--------------------------------------------------------------------------\n");
            break;
    }
    system("PAUSE>>NULL");
}
void Pintura_Parede_Rebocada()
{
    char selecao='9';
    system("cls");
    struct Materiais_Pintura;
    printf("--------------------------------------------------------------------------\n");
    printf("---------------------------------------------- TITULO DO PROGRAMA --------\n");
    printf("\t\t\t PINTURA PAREDE/TETO REBOCADA \n\t\t\t------------------------------\n\n");
    printf("\n--------------------------------------------------------------------------\n");
    printf("Informe a area a ser pintada em metros quadrados: ");
    scanf("%f", &total_materiais_pintura.area_pintada);
    printf("Informe a quantidade de demaos: ");
    scanf("%d", &total_materiais_pintura.demao);
    total_materiais_pintura.massa_corrida=total_materiais_pintura.area_pintada*MassaCorrida*total_materiais_pintura.demao;
    total_materiais_pintura.selador=total_materiais_pintura.area_pintada*Selador*total_materiais_pintura.demao;
    total_materiais_pintura.tinta=total_materiais_pintura.area_pintada*Tinta*total_materiais_pintura.demao;
    total_materiais_pintura.corante=total_materiais_pintura.area_pintada*Corante*total_materiais_pintura.demao;
    system("cls");
    printf("--------------------------------------------------------------------------\n");
    printf("---------------------------------------------- TITULO DO PROGRAMA --------\n");
    printf("\t\t\t PINTURA PAREDE/TETO REBOCADA \n\t\t\t------------------------------\n\n");
    printf("\t\tRELATORIO DE MATERIAIS\n");
    printf("\n--------------------------------------------------------------------------\n");
    printf("Voce ira precisar de:\n\n");
    printf("\t%.3f Kg de Massa Corrida\n", total_materiais_pintura.massa_corrida);
    printf("\t%.3f Litros de Selador\n", total_materiais_pintura.selador);
    printf("\t%.3f Litros de Tinta\n", total_materiais_pintura.tinta);
    printf("\t%.2f Ml de Corante (opicional)*\n\n", total_materiais_pintura.corante*1000);
    printf("*O Corante somente sera necessario caso escolha uma cor indisponivel na loja\n\n");
    printf("**OBS: Os valores informados trata-se apenas de uma estimativa de materiais\n\n");
    printf("\n                                  Precione qualquer tecla para continuar....\n");
    printf("                                                               0 - Voltar   \n");
    printf("\n--------------------------------------------------------------------------\n");
    fflush(stdin);
    scanf("%c", &selecao);
    if (selecao!='0'){
        Conteudo_Lata_Preco(1);
    }
}
void Repintura_Parede()
{
    char selecao='9';
    system("cls");
    struct Materiais_Pintura;
    printf("--------------------------------------------------------------------------\n");
    printf("---------------------------------------------- TITULO DO PROGRAMA --------\n");
    printf("\t\t\t REPINTURA PAREDE/TETO \n\t\t\t----------------------\n\n");
    printf("\n--------------------------------------------------------------------------\n");
    printf("Informe a area a ser repintada em metros quadrados: ");
    scanf("%f", &total_materiais_pintura.area_pintada);
    printf("Informe a quantidade de demaos: ");
    scanf("%d", &total_materiais_pintura.demao);
    total_materiais_pintura.fundo_preparador=total_materiais_pintura.area_pintada*FundoPreparador*total_materiais_pintura.demao;
    total_materiais_pintura.tinta=total_materiais_pintura.area_pintada*Tinta*total_materiais_pintura.demao;
    total_materiais_pintura.corante=total_materiais_pintura.area_pintada*Corante*total_materiais_pintura.demao;
    system("cls");
    printf("--------------------------------------------------------------------------\n");
    printf("---------------------------------------------- TITULO DO PROGRAMA --------\n");
    printf("\t\t\t REPINTURA PAREDE/TETO \n\t\t\t----------------------\n\n");
    printf("\t\tRELATORIO DE MATERIAIS\n");
    printf("\n--------------------------------------------------------------------------\n");
    printf("Voce ira precisar de:\n\n");
    printf("\t%.3f Litros de Fundo Preparador\n", total_materiais_pintura.fundo_preparador);
    printf("\t%.3f Litros de Tinta\n", total_materiais_pintura.tinta);
    printf("\t%.2f Ml de Corante (opicional)*\n\n", total_materiais_pintura.corante*1000);
    printf("*O Corante somente sera necessario caso escolha uma cor indisponivel na loja\n\n");
    printf("**OBS: Os valores informados trata-se apenas de uma estimativa de materiais\n\n");
    printf("\n                                  Precione qualquer tecla para continuar....\n");
    printf("                                                               0 - Voltar   \n");
    printf("\n--------------------------------------------------------------------------\n");
    fflush(stdin);
    scanf("%c", &selecao);
    if (selecao!='0'){
        Conteudo_Lata_Preco(2);
    }
}
void Sobre_Programa()
{
    system("cls");
    printf("--------------------------------------------------------------------------\n");
    printf("---------------------------------------------- TITULO DO PROGRAMA --------\n");
    printf("\t\t\t SOBRE O PROGRAMA \n\t\t\t------------------\n");
    printf("\n--------------------------------------------------------------------------\n\n");
    printf("\tNOME\t\t\t\tMATRICULA\n\t----\t\t\t\t---------\n");
    printf("\tANDRE JONAS DA SILVA\t\t1500000-1\n");
    printf("\tGABRIEL DA GAMA FIEL\t\t150000-1\n");
    //printf("\tGEAN\t1500000\n");
    printf("\tRUAN LUIZ ALVES DA SILVA\t150051-1\n");
    printf("\n--------------------------------------------------------------------------\n");
    system("PAUSE>>NULL");
}
void SubMenu_Pintura_Escolha()
{
    int op=9;
    while (op != 0){
        SubMenu_Pintura();
        fflush(stdin);
        scanf("%d", &op);
        switch (op){
            case 1:
                Pintura_Parede_Rebocada();
            break;
            case 2:
                Repintura_Parede();
            break;
            case 0:
            break;
            default:
                printf ("Opcao invalida\nPressione qualquer tecla e digite novamente sua opcao\n");
                system("PAUSE>>NULL");
        }
    }
}
int main()
{
    int menu=9;

    while (menu!=0){
        Menu_Principal();
        fflush(stdin);
        scanf("%d", &menu);
        switch (menu){
            case 1:
                SubMenu_Piso_Escolha();
                break;
            case 2:
                SubMenu_Pintura_Escolha();
                break;
            case 3:
                Sobre_Programa();
                break;
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
