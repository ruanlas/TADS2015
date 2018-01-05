#include <stdio.h>
#include <stdlib.h>


typedef struct {
    int num
    }TItem;

typedef struct elemento{
	TItem item;
	struct elemento *pProx;
}TElemento;

typedef struct {
    TElemento *pPrimeiro, *pUltimo;
    }TLista;


TLista lista; //nesta versão, a variavel "lista" é criada de forma estática (sem ponteiros).

/* Funções */

//Faz os campos da variavel 'lista' apontar para Null. **Nesta versão, caso a lista exista, sera zerada sem fazer Free, o que nao é aconselhavel

void FazListaVazia(){

lista.pPrimeiro=NULL; //nesta versão, não está sendo utilizado cabeçalho.
lista.pUltimo=NULL;
};

int ListaEhVazia(){
return (lista.pPrimeiro==NULL);
};

// Insere numero no início da lista

int InsereInicioLista(int numero) {
	TElemento *novo;
	int retorno = 1;
	novo = (TElemento*) malloc(sizeof(TElemento));
	if (novo == NULL) { /* Verifica se a memória foi alocada */
		retorno = -1;
	} else {
		novo->item.num = numero;
		novo->pProx = lista.pPrimeiro;
		lista.pPrimeiro = novo;
		if (lista.pUltimo==NULL)
            lista.pUltimo=lista.pPrimeiro;
	}
	return retorno;
}


/*
 * Remove o número do início da lista
 * retorna 1 se a remoção ocorrer sem problemas, -1 caso contrário
 */
int RetiraInicioLista() {
	struct TElemento *velho;
	int retorno = 1;
	velho = lista.pPrimeiro;
	if (velho == NULL) {
		retorno = -1;
	} else {
		lista.pPrimeiro = lista.pPrimeiro->pProx;
		free(velho);
		if (lista.pPrimeiro==NULL){
            lista.pUltimo=NULL;
		}
	}
	return retorno;
}


/*
 * Busca numero na lista
 * retorna 1 se ele estiver na lista, -1 caso contrário.
 */
int buscaNumero(int numero) {
	TElemento * atual;
	int retorno = -1;
	atual = lista.pPrimeiro;
	while (atual != NULL) {
		if (atual->item.num == numero) {
			retorno = 1;
			break;
		}
		atual = atual->pProx;
	}
	return retorno;
}


/*
 * Mostra todos os números da lista, um por linha
 */

void ImprimeLista() {
	struct elemento * atual;
	atual = lista.pPrimeiro;
	printf("Lista de todos os numeros cadastrados:  \n\n");
	while (atual != NULL) {

		printf("   %d\n", atual->item.num);
		atual = atual->pProx;
	}
}

void printMenu() {
	printf("\n");
	printf("   Manipulacao de lista ligada de inteiros \n\n");
	printf("    1 - Inserir um numero no inicio da lista\n");
	printf("    2 - Inserir um numero do final da lista    **a ser programado**\n");
	printf("    3 - Remover um numero no inicio da lista\n");
	printf("    4 - Remover um numero do final da lista    **a ser programado**\n");
	printf("    5 - Buscar um numero na lista\n");
	printf("    6 - Mostrar a quantidade de elementos da lista **a ser programado**\n");
	printf("    7 - Iniciar a lista\n");
	printf("    8 - Consulta se a lista esta vazia\n");
	printf("    9 - Lista todos os numeros\n");
	printf("\n\n");
	printf(">>> Digite uma opcao, ou 0 (zero) para sair do menu: ");

}

int main(int argc, char **argv) {
	int fim, opcao, numero;
	fim = 0;
	while (!fim) {
		printMenu();
		scanf("%d", &opcao);
		switch (opcao) {
		case 0:
			fim = 1;
			break;


		case 1:
			printf("\n Digite o numero inteiro para ser inserido: ");
			scanf("%d", &numero);
			if (InsereInicioLista(numero) == 1) {
				printf("\n Numero %d inserido no inicio da lista\n", numero);
			} else {
				printf("\n Erro ao inserir no inicio da lista\n");
			}
			break;


		case 2:
			//printf("\n Digite o numero a ser inserido: ");
			//scanf("%d", &numero);
			//if (InsereFinalLista(numero) == 1) {
			//	printf("Numero %d inserido no final da lista\n", numero);
			//} else {
			//	printf("Erro ao inserir no final da lista\n");
			//}
			printf("\n ** Opcao ainda nao disponivel **\n\n");
			break;


		case 3:
			if (RetiraInicioLista() == 1) {
				printf("Numero removido do inicio da lista\n");
			} else {
				printf("Erro ao remover do inicio da lista\n");
			}
			break;


		case 4:
            //if (RetiraFinalLista() == 1) {
			//	printf("Numero removido no final da lista\n");
			//} else {
			//	printf("Erro ao remover ao final da lista\n");
			//}
			printf("\n ** Opcao ainda nao disponivel **\n\n");
			break;


		case 5:
			printf("Digite o numero a ser buscado na lista: ");
			scanf("%d", &numero);
			if (buscaNumero(numero) == 1) {
				printf("Numero %d esta presente na lista\n", numero);
			} else {
				printf("A lista nao contem o numero %d\n", numero);
			}
			break;


		case 6:
			printf("\n ** Opcao ainda nao disponivel **\n\n");
			break;


		case 7:
			FazListaVazia();
			printf("Lista criada \n\n");
			break;


		case 8:
		    if (ListaEhVazia())
                printf("A lista esta vazia \n\n");
            else
			printf("A lista contem elementos \n\n");
			break;


		case 9:
			ImprimeLista();
			break;

		default:
			printf("\n Favor digitar uma opcao valida, de 0 a 9, obrigado. \n");
			break;
		}

	}
    return 0;
}
