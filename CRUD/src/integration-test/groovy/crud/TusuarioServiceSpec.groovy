package crud

import grails.testing.mixin.integration.Integration
import grails.gorm.transactions.Rollback
import spock.lang.Specification
import org.hibernate.SessionFactory

@Integration
@Rollback
class TusuarioServiceSpec extends Specification {

    TusuarioService tusuarioService
    SessionFactory sessionFactory

    private Long setupData() {
        // TODO: Populate valid domain instances and return a valid ID
        //new Tusuario(...).save(flush: true, failOnError: true)
        //new Tusuario(...).save(flush: true, failOnError: true)
        //Tusuario tusuario = new Tusuario(...).save(flush: true, failOnError: true)
        //new Tusuario(...).save(flush: true, failOnError: true)
        //new Tusuario(...).save(flush: true, failOnError: true)
        assert false, "TODO: Provide a setupData() implementation for this generated test suite"
        //tusuario.id
    }

    void "test get"() {
        setupData()

        expect:
        tusuarioService.get(1) != null
    }

    void "test list"() {
        setupData()

        when:
        List<Tusuario> tusuarioList = tusuarioService.list(max: 2, offset: 2)

        then:
        tusuarioList.size() == 2
        assert false, "TODO: Verify the correct instances are returned"
    }

    void "test count"() {
        setupData()

        expect:
        tusuarioService.count() == 5
    }

    void "test delete"() {
        Long tusuarioId = setupData()

        expect:
        tusuarioService.count() == 5

        when:
        tusuarioService.delete(tusuarioId)
        sessionFactory.currentSession.flush()

        then:
        tusuarioService.count() == 4
    }

    void "test save"() {
        when:
        assert false, "TODO: Provide a valid instance to save"
        Tusuario tusuario = new Tusuario()
        tusuarioService.save(tusuario)

        then:
        tusuario.id != null
    }
}
