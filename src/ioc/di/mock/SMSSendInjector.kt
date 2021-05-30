package ioc.di.mock

class SMSSendInjector : SendServiceInjector {
    override fun getConsumer() = Application(SMSSendService())
}