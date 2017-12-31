function validacaomesmamoeda(){
	if(conversor.outputselect.value == conversor.inputselect.value){
		alert("Não há o que converter quando as moedas são iguais. Por favor, selecione outra moeda de saída"+
		" ou mude a moeda de entrada.");
		return false;
	}
}
function validacaocamponulo(){
	if(conversor.inputselect.value==""){
		alert("Selecione uma moeda de entrada");
		return false;
	}
	if(conversor.outputselect.value==""){
		alert("Selecione uma moeda de saída");
		return false;
	}
	if(conversor.valueinput.value==""){
		alert("Insira um valor de moeda para conversão");
		return false;
	}
}
function realparadolar(valor){
	valorconvertido = valor / 3.14;
	return valorconvertido;
}
function dolarparareal(valor){
	valorconvertido = valor * 3.14;
	return valorconvertido;
}
function realparaeuro(valor){
	valorconvertido = valor / 3.32;
	return valorconvertido;
}
function europarareal(valor){
	valorconvertido = valor * 3.32;
	return valorconvertido;
}
function europaradolar(valor){
	/* Sabemos que: 1 Dolar = R$ 3,14
					1 Euro = R$ 3,32
		Logo, se 1US$ = R$ 3,14
				 ?US$ = R$ 3,32 (valor Euro em R$)
		Então, realiza-se a regra de 3, que fica:
					3,32 = ?US$ x 3,14
		portanto: 	?US$ = 3,32/3,14
		então:		?US$ = 1,057324840764331
		Logo, conclui-se que: 1 Euro = US$ 1,057324840764331
	*/
	valorconvertido = valor * 1.057324840764331;
	return valorconvertido;
}
function dolarparaeuro(valor){
	valorconvertido = valor / 1.057324840764331;
	return valorconvertido;
}
function converter(){
	if(validacaomesmamoeda()==false || validacaocamponulo()==false){
		return false;
	}else{
		tipoentrada = conversor.inputselect.value;
		tiposaida = conversor.outputselect.value;
		valorentrada = conversor.valueinput.value;
		valorsaida = 0;
		msg = "Valor de saída: ";
		
		if(tipoentrada=="real" && tiposaida=="dolar"){
			valorsaida = realparadolar(valorentrada);
			msg = msg + " US$ ";
		}
		if(tipoentrada=="dolar" && tiposaida=="real"){
			valorsaida = dolarparareal(valorentrada);
			msg = msg + " R$ ";
		}
		if(tipoentrada=="real" && tiposaida=="euro"){
			valorsaida = realparaeuro(valorentrada);
			msg = msg + " EUR€ ";
		}
		if(tipoentrada=="euro" && tiposaida=="real"){
			valorsaida = europarareal(valorentrada);
			msg = msg + " R$ ";
		}
		if(tipoentrada=="euro" && tiposaida=="dolar"){
			valorsaida = europaradolar(valorentrada);
			msg = msg + " US$ ";
		}
		if(tipoentrada=="dolar" && tiposaida=="euro"){
			valorsaida = dolarparaeuro(valorentrada);
			msg = msg + " EUR€ ";
		}
		document.getElementById("mensagem").innerHTML=msg;
		conversor.valueoutput.value = valorsaida;
		return true;
	}
}
