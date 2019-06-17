package crud

import com.fasterxml.jackson.core.JsonGenerator
import com.google.gson.Gson
import com.google.gson.JsonArray
import grails.converters.JSON
import groovy.json.JsonSlurper

class TestController {

    def index() { }

    TestService testService

    def getHiWord(){
        render "hola mdf";
    }

    def crud(){
        List lista = testService.GetList();
        render view: "/crud",model: [lista:lista]
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
    def BuscarAll(){
        Gson gson = new Gson();
        List lista = testService.GetList();


        render(gson.toJson(lista))
    }

    def GetById(){
        int dato = Integer.parseInt(params.id);
        render(testService.GetById(dato) as String);
    }
}
