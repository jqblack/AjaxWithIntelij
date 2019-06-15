package crud

import grails.converters.JSON

class TestController {

    def index() { }

    TestService testService

    def getHiWord(){
        render "hola mdf";
    }

    def CrearUsu(){

       String email =  params.email.toString() ;
        String pass = params.password.toString();
       String usu =  params.usuario.toString();
        render(testService.crearUsu(email,pass,usu) as String)
    }

    def BorrarUsu(){

        String email =  params.email.toString() ;
        String pass = params.password.toString();
        String usu =  params.usuario.toString();
        render(testService.BorrarUsu(email,pass,usu) as String)
    }
}
