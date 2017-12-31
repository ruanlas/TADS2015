var valorTotal = 0;
var item = 00;

function addAlinhamento(){
	item++;
	servico = tabelaServicos.children[1].children[1].children[0].children[1].textContent; //Campo Serviço
	descricao = tabelaServicos.children[1].children[1].children[0].children[2].textContent; //Campo Descrição
	quantidade = 01;
	precoUnitario = tabelaServicos.children[1].children[1].children[0].children[3].textContent; //Campo Preço
	precoUnitario = moneyToNumber(precoUnitario);
	precoTotal = precoUnitario * quantidade;
	valorTotal = valorTotal + precoTotal;
	inserirTabela(item, servico, descricao, quantidade, precoUnitario, precoTotal);
	descricaoOrcamento.valorTotal.value = numberToMoney(valorTotal);
}

function addBalanceamento(){
	item++;
	servico = tabelaServicos.children[1].children[1].children[1].children[1].textContent; //Campo Serviço
	descricao = tabelaServicos.children[1].children[1].children[1].children[2].children[0].value; //Campo Descrição
	quantidade = 0;
	do{ //faz a validação de caractere
		quantidade = prompt("Insira a quantidade de rodas para balancear");
		if(quantidade==''){
			quantidade = 0;
		}
		quantidade = parseInt(quantidade);
		if(isNaN(quantidade)){
			alert("O caractere digitado não é um número");
		}
	}while(isNaN(quantidade));
	precoUnitario = tabelaServicos.children[1].children[1].children[1].children[3].textContent; //Campo Preço
	precoUnitario = moneyToNumber(precoUnitario);
	precoTotal = precoUnitario * quantidade;
	valorTotal = valorTotal + precoTotal;
	inserirTabela(item, servico, descricao, quantidade, precoUnitario, precoTotal);
	descricaoOrcamento.valorTotal.value = numberToMoney(valorTotal);
}

function addTrocaOleo(){
	item++;
	servico = tabelaServicos.children[1].children[1].children[2].children[1].textContent; //Campo Serviço
	descricao = tabelaServicos.children[1].children[1].children[2].children[2].children[0].value; //Campo Descrição
	quantidade = 0;
	do{ //faz a validação de caractere
		quantidade = prompt("Insira quantos litros de óleo irão no motor");
		if(isNaN(quantidade)){
			alert("O caractere digitado não é um número");
		}
	}while(isNaN(quantidade));
	precoUnitario = tabelaServicos.children[1].children[1].children[2].children[3].textContent; //Campo Preço
	precoUnitario = moneyToNumber(precoUnitario);
	precoTotal = precoUnitario * quantidade;
	valorTotal = valorTotal + precoTotal;
	inserirTabela(item, servico, descricao, quantidade, precoUnitario, precoTotal);
	descricaoOrcamento.valorTotal.value = numberToMoney(valorTotal);
}

function addRodizioPneus(){
	item++;
	servico = tabelaServicos.children[1].children[1].children[3].children[1].textContent; //Campo Serviço
	descricao = tabelaServicos.children[1].children[1].children[3].children[2].textContent; //Campo Descrição
	quantidade = 1;
	precoUnitario = tabelaServicos.children[1].children[1].children[3].children[3].textContent; //Campo Preço
	precoUnitario = moneyToNumber(precoUnitario);
	precoTotal = precoUnitario * quantidade;
	valorTotal = valorTotal + precoTotal;
	inserirTabela(item, servico, descricao, quantidade, precoUnitario, precoTotal);
	descricaoOrcamento.valorTotal.value = numberToMoney(valorTotal);
}

function inserirDadosVeiculo(){
	modeloVeiculo = tabelaServicos.anoModelo.value;
	placaVeiculo = tabelaServicos.placaVeiculo.value;
	nomeVeiculo = tabelaServicos.nomeVeiculo.value;
	
	if(tabelaServicos.anoModelo.value  == '' || tabelaServicos.placaVeiculo.value == '' || tabelaServicos.nomeVeiculo.value == ''){
		alert("preencha todos os dados do veículo");
	}else{
		descricaoOrcamento.anoModelo.value = modeloVeiculo;
		descricaoOrcamento.nomeVeiculo.value = nomeVeiculo;
		descricaoOrcamento.placa.value = placaVeiculo;	
	}
}

function inserirTabela(item, servico, descricao, quantidade, precoUnitario, precoTotal){
	var tabela = document.getElementById("descricao");
	var row = tabela.insertRow(this.left); //insere no final da linha da tabela
	row.insertCell(0).textContent = item;
	row.insertCell(1).textContent = servico;
	row.insertCell(2).textContent = descricao;
	row.insertCell(3).textContent = quantidade;
	row.insertCell(4).textContent = numberToMoney(precoUnitario);
	row.insertCell(5).textContent = numberToMoney(precoTotal);
}

function selecaoTipoAro(){
	if(tabelaServicos.tipoRoda.value == "Aro 13"){
		//'tabelaServicos' é o nome do primeiro form
		//O filho da 'tabelaServicos' de índice 1 (children[1]) se refere à tabela.
		//O neto da 'tabelaServicos' de índice 1 (children[1].children[1]) se refere ao corpo da tabela (tbody)
		//O bisneto da 'tabelaServicos' de índice 1 (children[1].children[1].children[1]) se refere à segunda linha do corpo da tabela
		//O tataraneto da 'tabelaServicos' de índice 3 (children[1].children[1].children[1].children[3]) se refere à celula pertencente à quarta coluna
		//A representação fica:
		//tabelaServicos.'tabela'.'corpoTabela'.'segundaLinhaCorpo'.'celulaQuartaColuna'
		tabelaServicos.children[1].children[1].children[1].children[3].textContent = "R$ 15,00";
		//alert("Aro 13");
		
	}
	if(tabelaServicos.tipoRoda.value == "Aro 14"){
		tabelaServicos.children[1].children[1].children[1].children[3].textContent = "R$ 20,00";
		//alert("Aro 14");
	}
	if(tabelaServicos.tipoRoda.value == "Aro 15"){
		tabelaServicos.children[1].children[1].children[1].children[3].textContent = "R$ 25,00";
		//alert("Aro 15");
	}
	if(tabelaServicos.tipoRoda.value == "Aro 16"){
		tabelaServicos.children[1].children[1].children[1].children[3].textContent = "R$ 30,00";
		//alert("Aro 16");
	}
	if(tabelaServicos.tipoRoda.value == "Aro 17"){
		tabelaServicos.children[1].children[1].children[1].children[3].textContent = "R$ 35,00";
		//alert("Aro 17");
	}
}
function selecaoTipoOleo(){
	if(tabelaServicos.tipoOleo.value == "15W40"){
		tabelaServicos.children[1].children[1].children[2].children[3].textContent = "R$ 17,00";
	}
	if(tabelaServicos.tipoOleo.value == "20W50"){
		tabelaServicos.children[1].children[1].children[2].children[3].textContent = "R$ 23,00";
	}
}

function moneyToNumber(str){ //Converte a moeda Real para numero decimal
	str = str.replace("R$ ", "");
	str = str.replace(",", ".");
    return parseFloat(str);
}
function numberToMoney(valor){ //Converte um numero para a moeda Real
	valor = valor.toFixed(2)
	valor = "R$ " + valor;
	valor = valor.replace(".", ",");
    return valor;
}
