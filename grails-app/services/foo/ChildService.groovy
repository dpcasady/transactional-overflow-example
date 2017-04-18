package foo

import grails.transaction.Transactional

class ChildService extends ParentService {

    @Transactional
    void doSomething(String arg) {
        super.doSomething(arg)
    }

}