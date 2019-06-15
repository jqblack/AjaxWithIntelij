/**
 * The Tcrud entity.
 *
 * @author    
 *
 *
 */
package crud

class Tcrud {
    static mapping = {
         table 't_crud'
         // version is set to false, because this isn't available by default for legacy databases
         version false
         // In case a sequence is needed, changed the identity generator for the following code:
//       id generator:'sequence', column:'f_idrecord', params:[sequence:'t_crud_sequence']
         id generator:'identity', column:'f_idrecord'
    }
    String fUsuario
    String fEmail
    String fPass

    static constraints = {
        fUsuario(size: 0..20)
        fEmail(size: 0..40)
        fPass(size: 0..20)
    }
    String toString() {
    }
}
