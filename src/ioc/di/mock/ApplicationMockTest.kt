package ioc.di.mock


class MyDIApplicationJUnitTest {
    private var injector: SendServiceInjector? = null

    fun setUp() {
        injector = object : SendServiceInjector {
            override fun getConsumer() =
                Application(object : SendService {
                    override fun validate(receiver: String) = true
                    override fun send(receiver: String, message: String) = println("Mock Service implementation")
                })
        }
    }

    fun test() {
        val consumer = injector!!.getConsumer()
        consumer.process("test@gmail.com", "Hello!!!")
    }

    fun cleanUp() {
        injector = null
    }
}