package ioc.di.strategy

fun main(args: Array<String>) {
    val strategy = EmailSendService()
    val application = Application(strategy)
    application.process("test@gmail.com", "Hello!!!")
}