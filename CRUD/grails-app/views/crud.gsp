<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>CRUD</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    <asset:javascript src="app.js"></asset:javascript>
    <script
            src="https://code.jquery.com/jquery-3.4.1.js"
            integrity="sha256-WpOohJOqMqqyKL9FccASB9O0KwACQJpFTUBLTYOVvVU="
            crossorigin="anonymous">
</script>
</head>

<div class="container m-5">

    <form>

        <div class="form-group">
            <label for="exampleInputPassword1">User</label>
            <input type="text" class="form-control" id="user" placeholder="User">
        </div>

        <div class="form-group">
            <label for="exampleInputEmail1">Email address</label>
            <input type="email" class="form-control" id="email" aria-describedby="emailHelp" placeholder="Enter email">
            <small id="emailHelp" class="form-text text-muted">We'll never share your email with anyone else.</small>
        </div>
        <div class="form-group">
            <label for="exampleInputPassword1">Password</label>
            <input type="password" class="form-control" id="password" placeholder="Password">
        </div>
    </form>

    <div class="row container mt-2">

        <div class="col">
            <select id="opciones" onchange="getTipoUsu()" class="form-control selected">
                <option value="-1">Opciones de Usuarios</option>
                <option value="0">Administrador</option>
                <option value="1">Cliente</option>
            </select>
        </div>

        <div class="col">

            <h1>Show a date control:</h1>

            <form>
                Birthday: <input id="fecha" type="date" name="bday">
            </form>

        </div>

        <div class="col">

            <input type="checkbox" id="micheck" value="activo">Esta activo ?<br>

        </div>

    </div>
    <div>
        <button onclick="getMapa()" id="btn_guardar" type="button" class="btn btn-primary">Aceptar</button>
        <button onclick="DeleteUser()" id="btnBorrar" type="button" class="btn btn-primary">Delete</button>
    </div>

    <div class="container">
        <p class="m-3">Lista de Usuarios</p>
        <button onclick="GenerarLista()" class="btn btn-success">Generar Lista</button>
    </div>

    <div class="row">
        <div class="col">
            <ul id="lista" class="list-group">

            </ul>
        </div>
            <div class="col">
                <table id="tabla" class="table table-dark">
                    <thead>
                    <tr>
                        <th scope="col">ID</th>
                        <th scope="col">Nombre</th>
                        <th scope="col">Email</th>
                        <th scope="col">Opciones</th>
                    </tr>
                    </thead>
                    <tbody id= "contenido">
                    <tr>
                        <th scope="row"></th>

                    </tr>
                    </tbody>
                </table>
            </div>
    </div>

</div>
<body>

</body>
</html>