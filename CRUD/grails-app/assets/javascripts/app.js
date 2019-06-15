
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

