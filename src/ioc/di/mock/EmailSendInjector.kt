package ioc.di.mock

class EmailSendInjector : SendServiceInjector {
    override fun getConsumer() = Application(EmailSendService())
}