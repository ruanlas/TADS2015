function escolhaGenero() {
	seletor = document.getElementById("genero").value;
	barraProgresso = document.getElementById("porcentagemEstatistica");
	if (seletor == "sertanejo") {
		barraProgresso.style.width = "58%";
		barraProgresso.innerHTML = "58%";
	}
	if (seletor == "mpb") {
		barraProgresso.style.width = "47%";
		barraProgresso.innerHTML = "47%";
	}
	if (seletor == "samba") {
		barraProgresso.style.width = "44%";
		barraProgresso.innerHTML = "44%";
	}
	if (seletor == "forro") {
		barraProgresso.style.width = "31%";
		barraProgresso.innerHTML = "31%";
	}
	if (seletor == "rock") {
		barraProgresso.style.width = "31%";
		barraProgresso.innerHTML = "31%";
	}
	if (seletor == "eletronica") {
		barraProgresso.style.width = "29%";
		barraProgresso.innerHTML = "29%";
	}
}