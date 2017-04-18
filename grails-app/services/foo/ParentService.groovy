package foo

import grails.transaction.Transactional

abstract class ParentService {

    @Transactional
    void doSomething(String arg) {
        println "parent"
    }

}