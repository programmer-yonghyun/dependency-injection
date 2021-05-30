package ioc.legacy

class Application {

    private val emailService = EmailService()

    fun process(receiver: String, message: String) {
        // process logic
        emailService.sendEmail(receiver, message)
    }

}