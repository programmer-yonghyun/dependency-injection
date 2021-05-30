package ioc.di.mock

interface SendServiceInjector {
    fun getConsumer() = Application(SMSSendService())
}