package crud

import com.sun.org.apache.bcel.internal.generic.GETFIELD

class UrlMappings {

    static mappings = {
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }

        "/"(view:"/crud")
//        "/"(controller: "test"){
//            action=[GET: "crud"]
//        }
        "500"(view:'/error')
        "404"(view:'/notFound')

        "/pedir"(controller: "test"){
            action = [POST : "CrearUsu"];
        }

        "/borrar"(controller: "test"){
            action=[POST:"BorrarUsu"];
        }

        "/user"(controller: "tusuario"){
            action=[GET:"create"]
        }

        "/lista"(controller: "test"){
            action = [POST:"BuscarAll"]
        }
    }
}
