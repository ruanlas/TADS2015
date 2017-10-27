
$(function(){
    var tbody = $('#corpo-monitoramento');
    $('#btn-monitorar').click(function(event){
        event.preventDefault();
        
        //$('#corpo-monitoramento').children().remove();
        $('#corpo-monitoramento tr').remove();
        $.get('http://localhost:5000/collection',function(dataReceived){
            
            $(dataReceived).each(function(){
                tbody.append(criaTr(this.rpm, this.tipo_combustivel, this.pressao_motor));
    
            });
        });


    });
});

function criaTr(rpm, fuel_type, pressure_engine) {
    var tr = $('<tr>');
    tr.append($('<td>').text(rpm));
    tr.append($('<td>').text(fuel_type));
    tr.append($('<td>').text(pressure_engine));
    return tr;
}

