package ioc.legacy

class EmailService {

    fun sendEmail(message: String, receiver: String) = println("Email: $receiver to $message")

}