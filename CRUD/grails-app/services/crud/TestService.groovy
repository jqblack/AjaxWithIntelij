package crud

import grails.gorm.transactions.Transactional
import org.apache.commons.lang.ObjectUtils
import org.springframework.jdbc.core.JdbcTemplate

@Transactional
class TestService {

    static transactional = true;

    def crearUsu(String email,String pass, String usu) {

        Tcrud tcrud = new Tcrud(
                fUsuario: usu,
                fPass: pass,
                fEmail: email
        )
        Tcrud tupla;
       tupla =  Tcrud.findByFEmail(email);

        if (tupla == null){
            tcrud.save(failOnError: true);
            return "Realizado";
        }
        else{
            tupla.setfPass(pass);
            tupla.setfUsuario(usu);
            tupla.save(failOnError: true);

            return "USUARIO ACTUALIZADO";
        }
    }

    def BorrarUsu(String email,String pass, String usu){

        Tcrud tcrud = new Tcrud(
                fUsuario: usu,
                fPass: pass,
                fEmail: email
        )
        Tcrud tupla;
        tupla =  Tcrud.findByFEmail(email);

        if (tupla == null){
            return "El Usuario "+usu+" Con el correo"+email+"no existe";
        }
        else{
            tupla.delete();
            return "SE HA ELIMINADO CORRECTAMENTE";
        }
    }

    def GetList(){
        return Tcrud.findAll();
    }

}
