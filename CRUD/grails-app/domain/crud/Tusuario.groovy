/**
 * The Tusuario entity.
 *
 * @author    
 *
 *
 */
package crud
class Tusuario {
    static mapping = {
         table 't_usuario'
         // version is set to false, because this isn't available by default for legacy databases
         version false
         id generator:'identity', column:'f_idrecord'
    }
    String fNombre
    String fApellido
    Long fEdad

    static constraints = {
        fNombre(size: 0..20)
        fApellido(size: 0..20)
        fEdad(nullable: true, max: 9999999999L)
    }
    String toString() {
    }
}
