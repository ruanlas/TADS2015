function calculoquiz(){
		quest1 = questionario.quest1.value;
		quest2 = questionario.quest2.value;
		quest3 = questionario.quest3.value;
		quest4 = questionario.quest4.value;
		quest5 = questionario.quest5.value;
		quest6 = questionario.quest6.value;
		quest7 = questionario.quest7.value;
		quest8 = questionario.quest8.value;
		quest9 = questionario.quest9.value;
		quest10 = questionario.quest10.value;
		nomeparticipante = questionario.nomeparticipante.value;
		
		if(quest1==''){
			alert("Você precisa responder a questão 1!");
			return false;
		}
		if(quest2==''){
			alert("Você precisa responder a questão 2!");
			return false;
		}
		if(quest3==''){
			alert("Você precisa responder a questão 3!");
			return false;
		}
		if(quest4==''){
			alert("Você precisa responder a questão 4!");
			return false;
		}
		if(quest5==''){
			alert("Você precisa responder a questão 5!");
			return false;
		}
		if(quest6==''){
			alert("Você precisa responder a questão 6!");
			return false;
		}
		if(quest7==''){
			alert("Você precisa responder a questão 7!");
			return false;
		}
		if(quest8==''){
			alert("Você precisa responder a questão 8!");
			return false;
		}
		if(quest9==''){
			alert("Você precisa responder a questão 9!");
			return false;
		}
		if(quest10==''){
			alert("Você precisa responder a questão 10!");
			return false;
		}
		if(nomeparticipante==''){
			alert("Você precisa colocar seu nome!");
			return false;
		}
		nota = 0;
		if(quest1=='a'){
			nota = nota + 1;
		}
		if(quest2=='b'){
			nota = nota + 1;
		}
		if(quest3=='false'){
			nota = nota + 1;
		}
		if(quest4=='true'){
			nota = nota + 1;
		}
		if(quest5=='true'){
			nota = nota + 1;
		}
		if(quest6=='c'){
			nota = nota + 1;
		}
		if(quest7=='c'){
			nota = nota + 1;
		}
		if(quest8=='a'){
			nota = nota + 1;
		}
		if(quest9=='c'){
			nota = nota + 1;
		}
		if(quest10=='b'){
			nota = nota + 1;
		}
		if(nota > 6 ){
			alert("Parabéns "+ nomeparticipante +", você tirou " + Math.round(nota) + " pontos e foi aprovado!!");
			return true;
		}else{
			alert("Atenção "+ nomeparticipante +", você tirou " + Math.round(nota) + " pontos e foi reprovado!!");
			return true;
		}
}