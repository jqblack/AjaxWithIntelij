
function getMapa() {
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
            url: window.location + '/pedir',
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
            alert(response);
          var html = "";
          var htmlTable =""
          var json = eval(response)
            for (var i = 0; i < json.length  ; i++) {
                html=  html + "<li>"+json[i].fUsuario+"</li>";
            }

            $("#lista").html("");
            $("#lista").html(html);

            for (var i = 0; i < json.length; i++) {
                htmlTable = htmlTable + "<th scope=\"row\">"+json.length[i].id+"</th>\n" +
                    "                        <td>"+json.length[i].fUsuario+"</td>\n" +
                    "                        <td>"+json.length[i].fEmail+"</td>";
            }

            $("#tabla").html("");
            $("#tabla").html(htmlTable);
        }
    })
}

