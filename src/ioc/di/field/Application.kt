package ioc.di.field

class Application {

    private lateinit var emailSendService: EmailSendService

    fun process(receiver: String, message: String) {
        // process logic
        emailSendService.sendEmail(receiver, message)
    }

}