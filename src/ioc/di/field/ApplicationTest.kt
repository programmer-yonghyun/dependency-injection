package ioc.di.field

fun main(args: Array<String>) {
    val emailSendService = EmailSendService()
    val application = Application()

    val emailSendServiceField = application.javaClass.getDeclaredField("emailSendService")
    emailSendServiceField.isAccessible = true
    emailSendServiceField.set(application, emailSendService)

    application.process("test@gmail.com", "Hello!!!")
}