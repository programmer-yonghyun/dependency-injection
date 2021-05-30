package ioc.di.mock

fun main(args: Array<String>) {
    val application = EmailSendInjector().getConsumer()
    application.process("test@gmail.com", "Hello!!!")
}