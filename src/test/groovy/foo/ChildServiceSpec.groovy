package foo

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.services.ServiceUnitTestMixin} for usage instructions
 */
@TestFor(ChildService)
class ChildServiceSpec extends Specification {

    void "test something"() {
        expect:
            service.doSomething("") // throws StackOverflowError
    }
}
