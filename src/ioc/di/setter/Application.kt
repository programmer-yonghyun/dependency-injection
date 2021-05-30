package ioc.di.setter

class Application {

    private lateinit var emailSendService: EmailSendService

    fun setEmailService(emailSendService: EmailSendService) {
        this.emailSendService = this.emailSendService
    }

    fun process(receiver: String, message: String) {
        // process logic
        emailSendService.sendEmail(receiver, message)
    }

}