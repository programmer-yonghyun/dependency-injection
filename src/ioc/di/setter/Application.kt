package ioc.di.setter

class Application {

    private lateinit var emailSendService: EmailSendService

    fun setEmailSendService(emailSendService: EmailSendService) {
        this.emailSendService = emailSendService
    }

    fun process(receiver: String, message: String) {
        // process logic
        emailSendService.sendEmail(receiver, message)
    }

}