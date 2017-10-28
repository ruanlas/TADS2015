
$(function(){
    var tbody = $('#corpo-monitoramento');

    var opcao_filtro;
    $('#rb-chassi').click(function() {
        opcao_filtro = 'chassi';
    });
    $('#rb-modelo').click(function() {
        opcao_filtro = 'modelo';
    });

    $('#btn-monitorar').click(function(event){
        event.preventDefault();
        
        var chassi = $('#chassi').val();
 
        //alert(chassi.val());
        //alert(opcao_filtro);
        //$('#corpo-monitoramento').children().remove();
        $('#corpo-monitoramento tr').remove();
        $.get('http://18.231.62.135:5000/collection',function(dataReceived){
            
            $(dataReceived).each(function(){

                //if(opcao_filtro == 'chassi' && chassi == this.chassi){
                    tbody.append(criaTr(this.rpm, this.velocidade, this.tipo_combustivel, this.pressao_motor, this.modelo));
                //}
                //if(opcao_filtro == 'modelo' && modelo == this.modelo){
                    tbody.append(criaTr(this.rpm, this.velocidade, this.tipo_combustivel, this.pressao_motor, this.chassi));
                //}
                //if(opcao_filtro == null){
                //    alert("Selecione um filtro de resultados");
                //}
                
            });
        });


    });
});

function criaTr(rpm, velocidade, fuel_type, pressure_engine) {
    var tr = $('<tr>');
    tr.append($('<td>').text(rpm));
    tr.append($('<td>').text(velocidade));
    tr.append($('<td>').text(fuel_type));
    tr.append($('<td>').text(pressure_engine));
    return tr;
}

