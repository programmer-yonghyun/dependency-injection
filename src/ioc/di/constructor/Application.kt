package ioc.di.constructor

class Application(
    private val emailSendService: EmailSendService
) {

    fun process(receiver: String, message: String) {
        // process logic
        emailSendService.sendEmail(receiver, message)
    }

}