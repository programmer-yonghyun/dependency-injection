package ioc.di.constructor

fun main(args: Array<String>) {
    val emailSendService = EmailSendService()
    val application = Application(emailSendService)
    application.process("test@gmail.com", "Hello!!!")
}