package ioc.di.setter

fun main(args: Array<String>) {
    val application = Application()
    val emailSendService = EmailSendService()
    application.setEmailSendService(emailSendService)
    application.process("test@gmail.com", "Hello!!!")
}