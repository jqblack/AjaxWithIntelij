
function getMapa() {
    var emailTexto = document.getElementById("email").value;
    var passTexto = document.getElementById("password").value;
    var usuario = document.getElementById("user").value;
    var isactivo = document.getElementById("micheck").checked;
    var fecha = $("#fecha").val();

    alert(fecha);

    if(emailTexto != "" && passTexto != "" && usuario != ""){

        var map = new Object();
        map["email"] = emailTexto;
        map["password"] = passTexto;
        map["usuario"] = usuario;

        $.ajax({
            data:map,
            url: window.location + '/pedir',
            type: 'POST',
            success: function (response) {
                alert(response);
                document.getElementById("email").value = "";
                document.getElementById("password").value = "";
                document.getElementById("user").value = "";
            }
        });
    }
    else{
        alert("Llene todos los campos");
    }
}

function DeleteUser() {

    var emailTexto = document.getElementById("email").value;
    var passTexto = document.getElementById("password").value;
    var usuario = document.getElementById("user").value;

    if(emailTexto != "" && passTexto != "" && usuario != ""){

        var map = new Object();
        map["email"] = emailTexto;
        map["password"] = passTexto;
        map["usuario"] = usuario;

        $.ajax({
            data:map,
            url: window.location + '/borrar',
            type: 'POST',
            success: function (response) {
                alert(response);
            }
        });
    }
    else{
        alert("Llene todos los campos");
    }
}

function GenerarLista() {
    
    $.ajax({
        url: window.location +"/lista",
        type: 'POST',
        success: function (response) {
          var html = "";
          var htmlTable =""
          var json = eval(response)
            for (var i = 0; i < json.length  ; i++) {
                html=  html + "<li>"+json[i].fUsuario+"</li>";
            }

            $("#lista").html("");
            $("#lista").html(html);

            for (var i = 0; i < json.length; i++) {
                htmlTable = htmlTable +"<tr>\n" +
                    "                        <td scope=\"col\">"+json[i].id+"</td>\n" +
                    "                        <td scope=\"col\">"+json[i].fUsuario+"</td></td>\n" +
                    "                        <td scope=\"col\">"+json[i].fEmail+"</td>\n" +
                    "                        <td scope=\"col\"><button id='"+json[i].id+"' onclick='PonerDatosUp("+json[i].id+")' class='btn btn-success'>Seleccionar</button></td>\n"+
                    "                    </tr>"
            }

            $("#contenido").html("");
            $("#contenido").html(htmlTable);
        }
    });

}

function PonerDatosUp(id) {
    var dato = id;

    var mapa = new Object();
    mapa["id"] = dato;

    $.ajax({
        data:mapa,
        url: window.location+'/byid',
        type:'POST',
        success: function (response) {
            var res =  JSON.parse(response);
            document.getElementById("user").value = res.fUsuario;
            document.getElementById("email").value = res.fEmail;
            document.getElementById("password").value = res.fPass;
        }
    })
}
 var opcion = -1;
function getTipoUsu () {

    opcion = document.getElementById("opciones").value;
}
